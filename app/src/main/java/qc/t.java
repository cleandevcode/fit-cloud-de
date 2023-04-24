package qc;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.concurrent.TimeUnit;
import oc.c1;
import pc.b;

/* loaded from: classes.dex */
public final class t extends mc.p<byte[]> {

    /* renamed from: e */
    public final BluetoothGattDescriptor f24760e;

    /* renamed from: f */
    public final byte[] f24761f;

    public t(c1 c1Var, BluetoothGatt bluetoothGatt, m0 m0Var, BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        super(bluetoothGatt, c1Var, lc.m.f19432h, m0Var);
        this.f24760e = bluetoothGattDescriptor;
        this.f24761f = bArr;
    }

    @Override // mc.p
    public final tk.p<byte[]> d(c1 c1Var) {
        return new gl.p(new fl.q(new fl.t(c1Var.b(c1Var.f22952k).h(0L, TimeUnit.SECONDS, c1Var.f22942a), new tc.h(this.f24760e))), new tc.g());
    }

    @Override // mc.p
    public final boolean e(BluetoothGatt bluetoothGatt) {
        this.f24760e.setValue(this.f24761f);
        BluetoothGattCharacteristic characteristic = this.f24760e.getCharacteristic();
        int writeType = characteristic.getWriteType();
        characteristic.setWriteType(2);
        boolean writeDescriptor = bluetoothGatt.writeDescriptor(this.f24760e);
        characteristic.setWriteType(writeType);
        return writeDescriptor;
    }

    @Override // mc.p
    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("DescriptorWriteOperation{");
        a10.append(super.toString());
        a10.append(", descriptor=");
        a10.append(new b.a(this.f24760e.getUuid(), this.f24761f, true));
        a10.append('}');
        return a10.toString();
    }
}
