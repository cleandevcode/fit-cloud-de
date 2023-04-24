package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGatt;
import android.content.Intent;
import java.io.InputStream;

/* loaded from: classes2.dex */
interface DfuService extends DfuCallback {
    boolean initialize(Intent intent, BluetoothGatt bluetoothGatt, int i10, InputStream inputStream, InputStream inputStream2);

    boolean isClientCompatible(Intent intent, BluetoothGatt bluetoothGatt);

    void performDfu(Intent intent);

    void release();
}
