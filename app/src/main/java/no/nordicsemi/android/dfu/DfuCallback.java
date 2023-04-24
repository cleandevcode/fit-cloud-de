package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGattCallback;

/* loaded from: classes2.dex */
public interface DfuCallback extends DfuController {

    /* loaded from: classes2.dex */
    public static class DfuGattCallback extends BluetoothGattCallback {
        public void onDisconnected() {
        }
    }

    DfuGattCallback getGattCallback();

    void onBondStateChanged(int i10);
}
