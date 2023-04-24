package no.nordicsemi.android.dfu;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v4.media.d;
import androidx.appcompat.widget.u0;
import java.util.UUID;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;
import s.p1;
import w1.h;

@SuppressLint({"MissingPermission"})
/* loaded from: classes2.dex */
public class LegacyButtonlessDfuImpl extends BaseButtonlessDfuImpl {
    private BluetoothGattCharacteristic mControlPointCharacteristic;
    private int mVersion;
    public static UUID DFU_SERVICE_UUID = LegacyDfuImpl.DEFAULT_DFU_SERVICE_UUID;
    public static UUID DFU_CONTROL_POINT_UUID = LegacyDfuImpl.DEFAULT_DFU_CONTROL_POINT_UUID;
    public static UUID DFU_VERSION_UUID = LegacyDfuImpl.DEFAULT_DFU_VERSION_UUID;
    private static final byte[] OP_CODE_ENTER_BOOTLOADER = {1, 4};

    public LegacyButtonlessDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    private String getVersionFeatures(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 5 ? i10 != 6 ? i10 != 7 ? i10 != 8 ? "Unknown version" : "Bootloader from SDK 9.0 or newer. Signature supported" : "Bootloader from SDK 8.0 or newer. SHA-256 used instead of CRC-16 in the Init Packet" : "Bootloader from SDK 8.0 or newer. Bond sharing supported" : "Bootloader from SDK 7.0 or newer. No bond sharing" : "Application with Legacy buttonless update from SDK 7.0 or newer" : "Bootloader from SDK 6.1 or older";
    }

    private int readVersion(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.mConnected) {
            if (!this.mAborted) {
                if (bluetoothGattCharacteristic == null) {
                    return 0;
                }
                this.mReceivedData = null;
                this.mError = 0;
                logi("Reading DFU version number...");
                this.mService.sendLogBroadcast(1, "Reading DFU version number...");
                bluetoothGattCharacteristic.setValue((byte[]) null);
                DfuBaseService dfuBaseService = this.mService;
                StringBuilder a10 = d.a("gatt.readCharacteristic(");
                a10.append(bluetoothGattCharacteristic.getUuid());
                a10.append(")");
                dfuBaseService.sendLogBroadcast(0, a10.toString());
                bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
                try {
                    synchronized (this.mLock) {
                        while (true) {
                            if (((this.mRequestCompleted && bluetoothGattCharacteristic.getValue() != null) || !this.mConnected || this.mError != 0 || this.mAborted) && !this.mPaused) {
                                break;
                            }
                            this.mRequestCompleted = false;
                            this.mLock.wait();
                        }
                    }
                } catch (InterruptedException e10) {
                    loge("Sleeping interrupted", e10);
                }
                if (this.mConnected) {
                    if (this.mError == 0) {
                        if (bluetoothGattCharacteristic.getValue() == null || bluetoothGattCharacteristic.getValue().length < 2) {
                            return 0;
                        }
                        return bluetoothGattCharacteristic.getIntValue(18, 0).intValue();
                    }
                    throw new DfuException("Unable to read version number", this.mError);
                }
                throw new DeviceDisconnectedException("Unable to read version number: device disconnected");
            }
            throw new UploadAbortedException();
        }
        throw new DeviceDisconnectedException("Unable to read version number: device disconnected");
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public boolean isClientCompatible(Intent intent, BluetoothGatt bluetoothGatt) {
        BluetoothGattCharacteristic characteristic;
        int i10;
        boolean z10;
        BluetoothGattService service = bluetoothGatt.getService(DFU_SERVICE_UUID);
        if (service == null || (characteristic = service.getCharacteristic(DFU_CONTROL_POINT_UUID)) == null || characteristic.getDescriptor(BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG) == null) {
            return false;
        }
        this.mControlPointCharacteristic = characteristic;
        this.mProgressInfo.setProgress(-2);
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(DFU_VERSION_UUID);
        if (characteristic2 != null) {
            i10 = readVersion(bluetoothGatt, characteristic2);
            this.mVersion = i10;
            int i11 = i10 & 15;
            int i12 = i10 >> 8;
            StringBuilder a10 = h.a("Version number read: ", i12, ".", i11, " -> ");
            a10.append(getVersionFeatures(i10));
            logi(a10.toString());
            this.mService.sendLogBroadcast(10, p1.a("Version number read: ", i12, ".", i11));
        } else {
            StringBuilder a11 = d.a("No DFU Version characteristic found -> ");
            a11.append(getVersionFeatures(0));
            logi(a11.toString());
            this.mService.sendLogBroadcast(10, "DFU Version characteristic not found");
            i10 = 0;
        }
        boolean z11 = PreferenceManager.getDefaultSharedPreferences(this.mService).getBoolean(DfuSettingsConstants.SETTINGS_ASSUME_DFU_NODE, false);
        if (intent.hasExtra(DfuBaseService.EXTRA_FORCE_DFU)) {
            z11 = intent.getBooleanExtra(DfuBaseService.EXTRA_FORCE_DFU, false);
        }
        if (bluetoothGatt.getServices().size() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 0 && z10) {
            logi("Additional services found -> Bootloader from SDK 6.1. Updating SD and BL supported, extended init packet not supported");
        }
        if (i10 != 1 && (z11 || i10 != 0 || !z10)) {
            return false;
        }
        return true;
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public void performDfu(Intent intent) {
        logw("Application with legacy buttonless update found");
        this.mService.sendLogBroadcast(15, "Application with buttonless update found");
        boolean z10 = true;
        this.mService.sendLogBroadcast(1, "Jumping to the DFU Bootloader...");
        if (intent.hasExtra(DfuBaseService.EXTRA_MTU)) {
            int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_MTU, 517);
            logi(u0.a("Requesting MTU = ", intExtra));
            requestMtu(intExtra);
        }
        enableCCCD(this.mControlPointCharacteristic, 1);
        this.mService.sendLogBroadcast(10, "Notifications enabled");
        this.mProgressInfo.setProgress(-3);
        logi("Sending Start DFU command (Op Code = 1, Upload Mode = 4)");
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_ENTER_BOOTLOADER, true);
        this.mService.sendLogBroadcast(10, "Jump to bootloader sent (Op Code = 1, Upload Mode = 4)");
        BluetoothGatt bluetoothGatt = this.mGatt;
        boolean booleanExtra = intent.getBooleanExtra(DfuBaseService.EXTRA_FORCE_SCANNING_FOR_BOOTLOADER_IN_LEGACY_DFU, false);
        if (!booleanExtra && this.mVersion != 0) {
            this.mService.waitUntilDisconnected();
            this.mService.sendLogBroadcast(5, "Disconnected by the remote device");
        } else {
            this.mService.disconnect(bluetoothGatt);
        }
        logi("Device disconnected");
        if (!booleanExtra && this.mVersion != 0) {
            z10 = false;
        }
        finalize(intent, false, z10);
    }
}
