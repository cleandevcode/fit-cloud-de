package qc;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.concurrent.TimeUnit;
import oc.q0;
import oc.z0;

/* loaded from: classes.dex */
public interface z {
    x a(int i10);

    t b(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr);

    l c(BluetoothGattCharacteristic bluetoothGattCharacteristic, oc.f0 f0Var, q0 q0Var, z0 z0Var, byte[] bArr);

    l0 d(long j10, TimeUnit timeUnit);

    m e(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr);
}
