package qc;

import a0.a2;
import android.bluetooth.BluetoothGatt;
import java.util.concurrent.TimeUnit;
import oc.c1;

/* loaded from: classes.dex */
public final class c0 extends mc.p<Integer> {
    public c0(c1 c1Var, BluetoothGatt bluetoothGatt, m0 m0Var) {
        super(bluetoothGatt, c1Var, lc.m.f19433i, m0Var);
    }

    @Override // mc.p
    public final tk.p<Integer> d(c1 c1Var) {
        return new fl.q(c1Var.b(c1Var.f22953l).h(0L, TimeUnit.SECONDS, c1Var.f22942a));
    }

    @Override // mc.p
    public final boolean e(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.readRemoteRssi();
    }

    @Override // mc.p
    public final String toString() {
        return a2.a(android.support.v4.media.d.a("ReadRssiOperation{"), super.toString(), '}');
    }
}
