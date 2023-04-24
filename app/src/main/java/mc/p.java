package mc;

import android.bluetooth.BluetoothGatt;
import android.os.DeadObjectException;
import fl.g;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import oc.c1;
import qc.m0;
import tc.k0;

/* loaded from: classes.dex */
public abstract class p<T> extends i<T> {

    /* renamed from: a */
    public final BluetoothGatt f20448a;

    /* renamed from: b */
    public final c1 f20449b;

    /* renamed from: c */
    public final lc.m f20450c;

    /* renamed from: d */
    public final m0 f20451d;

    public p(BluetoothGatt bluetoothGatt, c1 c1Var, lc.m mVar, m0 m0Var) {
        this.f20448a = bluetoothGatt;
        this.f20449b = c1Var;
        this.f20450c = mVar;
        this.f20451d = m0Var;
    }

    @Override // mc.i
    public final void a(g.a aVar, w.d dVar) {
        k0 k0Var = new k0(aVar, dVar);
        tk.p<T> d10 = d(this.f20449b);
        m0 m0Var = this.f20451d;
        long j10 = m0Var.f24746a;
        TimeUnit timeUnit = m0Var.f24747b;
        tk.o oVar = m0Var.f24748c;
        tk.p f10 = f(this.f20448a, oVar);
        d10.getClass();
        Objects.requireNonNull(f10, "fallback is null");
        d10.g(j10, timeUnit, oVar, f10).h().d(k0Var);
        if (!e(this.f20448a)) {
            k0Var.cancel();
            k0Var.onError(new lc.i(this.f20448a, this.f20450c));
        }
    }

    @Override // mc.i
    public final lc.g c(DeadObjectException deadObjectException) {
        return new lc.f(this.f20448a.getDevice().getAddress(), deadObjectException);
    }

    public abstract tk.p<T> d(c1 c1Var);

    public abstract boolean e(BluetoothGatt bluetoothGatt);

    public tk.p f(BluetoothGatt bluetoothGatt, tk.o oVar) {
        return tk.p.d(new lc.h(this.f20448a, this.f20450c));
    }

    public String toString() {
        return pc.b.b(this.f20448a);
    }
}
