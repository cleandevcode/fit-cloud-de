package qc;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.os.DeadObjectException;
import fl.g;
import l2.o0;
import oc.c1;

/* loaded from: classes.dex */
public final class s extends mc.i<BluetoothGatt> {

    /* renamed from: a */
    public final BluetoothDevice f24753a;

    /* renamed from: b */
    public final tc.c f24754b;

    /* renamed from: c */
    public final c1 f24755c;

    /* renamed from: d */
    public final oc.a f24756d;

    /* renamed from: e */
    public final m0 f24757e;

    /* renamed from: f */
    public final boolean f24758f;

    /* renamed from: g */
    public final oc.k f24759g;

    public s(BluetoothDevice bluetoothDevice, tc.c cVar, c1 c1Var, oc.a aVar, m0 m0Var, boolean z10, oc.k kVar) {
        this.f24753a = bluetoothDevice;
        this.f24754b = cVar;
        this.f24755c = c1Var;
        this.f24756d = aVar;
        this.f24757e = m0Var;
        this.f24758f = z10;
        this.f24759g = kVar;
    }

    @Override // mc.i
    public final void a(g.a aVar, w.d dVar) {
        n nVar = new n(dVar);
        tk.p bVar = new gl.b(new q(this));
        if (!this.f24758f) {
            m0 m0Var = this.f24757e;
            bVar = bVar.g(m0Var.f24746a, m0Var.f24747b, m0Var.f24748c, new gl.n(new o(this)));
        }
        gl.g gVar = new gl.g(bVar, nVar);
        tc.y yVar = new tc.y(aVar);
        gVar.c(yVar);
        xk.b.g(aVar, yVar);
        if (this.f24758f) {
            dVar.e();
        }
    }

    @Override // mc.i
    public final lc.g c(DeadObjectException deadObjectException) {
        return new lc.f(this.f24753a.getAddress(), deadObjectException);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ConnectOperation{");
        a10.append(pc.b.c(this.f24753a.getAddress()));
        a10.append(", autoConnect=");
        return o0.a(a10, this.f24758f, '}');
    }
}
