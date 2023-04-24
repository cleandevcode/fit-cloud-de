package qc;

import a0.a2;
import android.bluetooth.BluetoothGatt;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kc.y0;
import oc.c1;
import oc.s0;

/* loaded from: classes.dex */
public final class l0 extends mc.p<y0> {

    /* renamed from: e */
    public final BluetoothGatt f24742e;

    /* renamed from: f */
    public final pc.c f24743f;

    public l0(c1 c1Var, BluetoothGatt bluetoothGatt, pc.c cVar, m0 m0Var) {
        super(bluetoothGatt, c1Var, lc.m.f19427c, m0Var);
        this.f24742e = bluetoothGatt;
        this.f24743f = cVar;
    }

    @Override // mc.p
    public final tk.p<y0> d(c1 c1Var) {
        return new gl.j(new fl.q(c1Var.b(c1Var.f22947f).h(0L, TimeUnit.SECONDS, c1Var.f22942a)), new ph.q(7, this));
    }

    @Override // mc.p
    public final boolean e(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.discoverServices();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [qc.k0] */
    @Override // mc.p
    public final tk.p f(final BluetoothGatt bluetoothGatt, final tk.o oVar) {
        return new gl.c(new wk.g() { // from class: qc.k0
            @Override // wk.g
            public final Object get() {
                BluetoothGatt bluetoothGatt2 = bluetoothGatt;
                tk.o oVar2 = oVar;
                if (bluetoothGatt2.getServices().size() == 0) {
                    return tk.p.d(new lc.h(bluetoothGatt2, lc.m.f19427c));
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Objects.requireNonNull(timeUnit, "unit is null");
                Objects.requireNonNull(oVar2, "scheduler is null");
                return new gl.l(new gl.u(timeUnit, oVar2), new s0(1, bluetoothGatt2));
            }
        });
    }

    @Override // mc.p
    public final String toString() {
        return a2.a(android.support.v4.media.d.a("ServiceDiscoveryOperation{"), super.toString(), '}');
    }
}
