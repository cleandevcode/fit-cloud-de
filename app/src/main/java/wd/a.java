package wd;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Build;
import ge.b;

/* loaded from: classes.dex */
public final class a {
    public static boolean a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        if (bluetoothGatt == null) {
            b.p("gatt cannot be null.");
            return false;
        } else if (Build.VERSION.SDK_INT >= 33) {
            return bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr, bluetoothGattCharacteristic.getWriteType()) == 0;
        } else {
            bluetoothGattCharacteristic.setValue(bArr);
            return bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
        }
    }
}
