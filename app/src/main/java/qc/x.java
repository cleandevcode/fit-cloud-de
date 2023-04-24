package qc;

import android.bluetooth.BluetoothGatt;
import java.util.concurrent.TimeUnit;
import oc.c1;

/* loaded from: classes.dex */
public final class x extends mc.p<Integer> {

    /* renamed from: e */
    public final int f24784e;

    public x(c1 c1Var, BluetoothGatt bluetoothGatt, m0 m0Var, int i10) {
        super(bluetoothGatt, c1Var, lc.m.f19434j, m0Var);
        this.f24784e = i10;
    }

    @Override // mc.p
    public final tk.p<Integer> d(c1 c1Var) {
        return new fl.q(c1Var.b(c1Var.f22954m).h(0L, TimeUnit.SECONDS, c1Var.f22942a));
    }

    @Override // mc.p
    public final boolean e(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.requestMtu(this.f24784e);
    }

    @Override // mc.p
    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("MtuRequestOperation{");
        a10.append(super.toString());
        a10.append(", mtu=");
        return a1.b.a(a10, this.f24784e, '}');
    }
}
