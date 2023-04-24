package oc;

import android.bluetooth.BluetoothGattCharacteristic;

/* loaded from: classes.dex */
public final class k1 extends c0 {
    public k1(d0 d0Var) {
        super(d0Var);
    }

    @Override // oc.c0
    public final mc.a a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        String a10 = this.f22941a.a(bluetoothGattCharacteristic, i10);
        bluetoothGattCharacteristic.getUuid();
        bluetoothGattCharacteristic.getProperties();
        return new mc.a(a10);
    }
}
