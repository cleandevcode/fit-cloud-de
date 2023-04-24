package qc;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import java.util.concurrent.TimeUnit;
import oc.c1;
import pc.b;

/* loaded from: classes.dex */
public final class m extends mc.p<byte[]> {

    /* renamed from: e */
    public final BluetoothGattCharacteristic f24744e;

    /* renamed from: f */
    public final byte[] f24745f;

    public m(c1 c1Var, BluetoothGatt bluetoothGatt, m0 m0Var, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        super(bluetoothGatt, c1Var, lc.m.f19429e, m0Var);
        this.f24744e = bluetoothGattCharacteristic;
        this.f24745f = bArr;
    }

    @Override // mc.p
    public final tk.p<byte[]> d(c1 c1Var) {
        return new gl.p(new fl.q(new fl.t(c1Var.b(c1Var.f22949h).h(0L, TimeUnit.SECONDS, c1Var.f22942a), new tc.f(this.f24744e.getUuid()))), new tc.g());
    }

    @Override // mc.p
    public final boolean e(BluetoothGatt bluetoothGatt) {
        this.f24744e.setValue(this.f24745f);
        return bluetoothGatt.writeCharacteristic(this.f24744e);
    }

    @Override // mc.p
    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("CharacteristicWriteOperation{");
        a10.append(super.toString());
        a10.append(", characteristic=");
        a10.append(new b.a(this.f24744e.getUuid(), this.f24745f, true));
        a10.append('}');
        return a10.toString();
    }
}
