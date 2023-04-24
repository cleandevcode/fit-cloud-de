package no.nordicsemi.android.dfu;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Intent;
import android.support.v4.media.d;
import no.nordicsemi.android.dfu.BaseDfuImpl;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"MissingPermission"})
/* loaded from: classes2.dex */
public abstract class BaseButtonlessDfuImpl extends BaseDfuImpl {
    private final ButtonlessBluetoothCallback mBluetoothCallback;

    /* loaded from: classes2.dex */
    public class ButtonlessBluetoothCallback extends BaseDfuImpl.BaseBluetoothGattCallback {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ButtonlessBluetoothCallback() {
            super();
            BaseButtonlessDfuImpl.this = r1;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            DfuBaseService dfuBaseService = BaseButtonlessDfuImpl.this.mService;
            StringBuilder a10 = d.a("Notification received from ");
            a10.append(bluetoothGattCharacteristic.getUuid());
            a10.append(", value (0x): ");
            a10.append(parse(bluetoothGattCharacteristic));
            dfuBaseService.sendLogBroadcast(5, a10.toString());
            BaseButtonlessDfuImpl.this.mReceivedData = bluetoothGattCharacteristic.getValue();
            BaseButtonlessDfuImpl.this.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            BaseButtonlessDfuImpl baseButtonlessDfuImpl = BaseButtonlessDfuImpl.this;
            baseButtonlessDfuImpl.mRequestCompleted = true;
            baseButtonlessDfuImpl.notifyLock();
        }
    }

    public BaseButtonlessDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
        this.mBluetoothCallback = new ButtonlessBluetoothCallback();
    }

    public void finalize(Intent intent, boolean z10, boolean z11) {
        boolean z12 = false;
        this.mService.refreshDeviceCache(this.mGatt, (z10 || !intent.getBooleanExtra(DfuBaseService.EXTRA_KEEP_BOND, false)) ? true : true);
        this.mService.close(this.mGatt);
        logi("Restarting to bootloader mode");
        Intent intent2 = new Intent();
        intent2.fillIn(intent, 24);
        restartService(intent2, z11);
    }

    @Override // no.nordicsemi.android.dfu.DfuCallback
    public BaseDfuImpl.BaseBluetoothGattCallback getGattCallback() {
        return this.mBluetoothCallback;
    }
}
