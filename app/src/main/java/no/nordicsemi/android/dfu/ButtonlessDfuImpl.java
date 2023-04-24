package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Intent;
import hb.d;
import java.util.Locale;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.RemoteDfuException;
import no.nordicsemi.android.dfu.internal.exception.UnknownResponseException;

/* loaded from: classes2.dex */
abstract class ButtonlessDfuImpl extends BaseButtonlessDfuImpl {
    private static final int DFU_STATUS_SUCCESS = 1;
    private static final byte[] OP_CODE_ENTER_BOOTLOADER = {1};
    private static final int OP_CODE_ENTER_BOOTLOADER_KEY = 1;
    private static final int OP_CODE_RESPONSE_CODE_KEY = 32;

    public ButtonlessDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    private int getStatusCode(byte[] bArr, int i10) {
        byte b10;
        if (bArr != null && bArr.length >= 3 && bArr[0] == 32 && bArr[1] == i10 && ((b10 = bArr[2]) == 1 || b10 == 2 || b10 == 4)) {
            return b10;
        }
        throw new UnknownResponseException("Invalid response received", bArr, 32, i10);
    }

    public abstract BluetoothGattCharacteristic getButtonlessDfuCharacteristic();

    public abstract int getResponseType();

    @Override // no.nordicsemi.android.dfu.DfuService
    public void performDfu(Intent intent) {
        DfuBaseService dfuBaseService;
        int i10;
        byte[] bArr;
        String str;
        this.mProgressInfo.setProgress(-2);
        BluetoothGatt bluetoothGatt = this.mGatt;
        this.mService.sendLogBroadcast(15, "Application with buttonless update found");
        this.mService.sendLogBroadcast(1, "Jumping to the DFU Bootloader...");
        BluetoothGattCharacteristic buttonlessDfuCharacteristic = getButtonlessDfuCharacteristic();
        int responseType = getResponseType();
        enableCCCD(buttonlessDfuCharacteristic, getResponseType());
        DfuBaseService dfuBaseService2 = this.mService;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(responseType == 2 ? "Indications" : "Notifications");
        sb2.append(" enabled");
        dfuBaseService2.sendLogBroadcast(10, sb2.toString());
        try {
            this.mProgressInfo.setProgress(-3);
            logi("Sending Enter Bootloader (Op Code = 1)");
            writeOpCode(buttonlessDfuCharacteristic, OP_CODE_ENTER_BOOTLOADER, true);
            this.mService.sendLogBroadcast(10, "Enter bootloader sent (Op Code = 1)");
            try {
                bArr = readNotificationResponse();
            } catch (DeviceDisconnectedException unused) {
                bArr = this.mReceivedData;
            }
            if (bArr != null) {
                int statusCode = getStatusCode(bArr, 1);
                logi("Response received (Op Code = " + ((int) bArr[1]) + ", Status = " + statusCode + ")");
                DfuBaseService dfuBaseService3 = this.mService;
                dfuBaseService3.sendLogBroadcast(10, "Response received (Op Code = " + ((int) bArr[1]) + ", Status = " + statusCode + ")");
                if (statusCode != 1) {
                    throw new RemoteDfuException("Device returned error after sending Enter Bootloader", statusCode);
                }
                if (shouldScanForBootloader()) {
                    this.mService.disconnect(bluetoothGatt);
                } else {
                    this.mService.waitUntilDisconnected();
                    this.mService.sendLogBroadcast(5, "Disconnected by the remote device");
                }
                str = "Device disconnected";
            } else {
                str = "Device disconnected before receiving notification";
            }
            logi(str);
            finalize(intent, false, shouldScanForBootloader());
        } catch (RemoteDfuException e10) {
            int errorNumber = e10.getErrorNumber() | 2048;
            loge(e10.getMessage());
            this.mService.sendLogBroadcast(20, String.format(Locale.US, "Remote DFU error: %s", d.h(errorNumber)));
            dfuBaseService = this.mService;
            i10 = errorNumber | DfuBaseService.ERROR_REMOTE_MASK;
            dfuBaseService.terminateConnection(bluetoothGatt, i10);
        } catch (UnknownResponseException e11) {
            loge(e11.getMessage());
            this.mService.sendLogBroadcast(20, e11.getMessage());
            dfuBaseService = this.mService;
            i10 = DfuBaseService.ERROR_INVALID_RESPONSE;
            dfuBaseService.terminateConnection(bluetoothGatt, i10);
        }
    }

    public abstract boolean shouldScanForBootloader();
}
