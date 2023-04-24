package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import java.util.UUID;

/* loaded from: classes2.dex */
public class ButtonlessDfuWithBondSharingImpl extends ButtonlessDfuImpl {
    public static UUID BUTTONLESS_DFU_SERVICE_UUID;
    public static UUID BUTTONLESS_DFU_UUID;
    public static final UUID DEFAULT_BUTTONLESS_DFU_SERVICE_UUID;
    public static final UUID DEFAULT_BUTTONLESS_DFU_UUID;
    private BluetoothGattCharacteristic mButtonlessDfuCharacteristic;

    static {
        UUID uuid = SecureDfuImpl.DEFAULT_DFU_SERVICE_UUID;
        DEFAULT_BUTTONLESS_DFU_SERVICE_UUID = uuid;
        UUID uuid2 = new UUID(-8157989228746813600L, -6937650605005804976L);
        DEFAULT_BUTTONLESS_DFU_UUID = uuid2;
        BUTTONLESS_DFU_SERVICE_UUID = uuid;
        BUTTONLESS_DFU_UUID = uuid2;
    }

    public ButtonlessDfuWithBondSharingImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    @Override // no.nordicsemi.android.dfu.ButtonlessDfuImpl
    public BluetoothGattCharacteristic getButtonlessDfuCharacteristic() {
        return this.mButtonlessDfuCharacteristic;
    }

    @Override // no.nordicsemi.android.dfu.ButtonlessDfuImpl
    public int getResponseType() {
        return 2;
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public boolean isClientCompatible(Intent intent, BluetoothGatt bluetoothGatt) {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattService service = bluetoothGatt.getService(BUTTONLESS_DFU_SERVICE_UUID);
        if (service == null || (characteristic = service.getCharacteristic(BUTTONLESS_DFU_UUID)) == null || characteristic.getDescriptor(BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG) == null) {
            return false;
        }
        this.mButtonlessDfuCharacteristic = characteristic;
        return true;
    }

    @Override // no.nordicsemi.android.dfu.ButtonlessDfuImpl, no.nordicsemi.android.dfu.DfuService
    public void performDfu(Intent intent) {
        logi("Buttonless service with bond sharing found -> SDK 14 or newer");
        if (isBonded()) {
            intent.putExtra(DfuBaseService.EXTRA_KEEP_BOND, true);
            intent.putExtra(DfuBaseService.EXTRA_RESTORE_BOND, false);
            super.performDfu(intent);
            return;
        }
        logw("Device is not paired, cancelling DFU");
        this.mService.sendLogBroadcast(15, "Device is not bonded");
        this.mService.terminateConnection(this.mGatt, DfuBaseService.ERROR_DEVICE_NOT_BONDED);
    }

    @Override // no.nordicsemi.android.dfu.ButtonlessDfuImpl
    public boolean shouldScanForBootloader() {
        return false;
    }
}
