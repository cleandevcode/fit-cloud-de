package mc;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import fl.y;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kc.a0;
import kc.d0;
import kc.e0;
import kc.h0;
import kc.v0;
import kc.z0;
import oc.c1;
import qc.m0;
import qc.s;
import tc.l0;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements wk.g {

    /* renamed from: a */
    public final /* synthetic */ int f20431a;

    /* renamed from: b */
    public final /* synthetic */ a0 f20432b;

    /* renamed from: c */
    public final /* synthetic */ Object f20433c;

    public /* synthetic */ j(Object obj, a0 a0Var, int i10) {
        this.f20431a = i10;
        this.f20433c = obj;
        this.f20432b = a0Var;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [oc.o] */
    @Override // wk.g
    public final Object get() {
        Set unmodifiableSet;
        switch (this.f20431a) {
            case 0:
                l lVar = (l) this.f20433c;
                a0 a0Var = this.f20432b;
                if (lVar.f20439d.compareAndSet(false, true)) {
                    tk.i<v0> a10 = lVar.f20437b.a(a0Var);
                    k kVar = new k(0, lVar);
                    a10.getClass();
                    return new fl.l(a10, kVar);
                }
                return tk.i.m(new lc.b(lVar.f20436a.getAddress()));
            default:
                oc.p pVar = (oc.p) this.f20433c;
                a0 a0Var2 = this.f20432b;
                d0 a11 = pVar.f23021b.a(a0Var2.f18260a);
                a11.c(a0Var2.f18261b);
                z0 z0Var = a0Var2.f18262c;
                z0Var.getClass();
                a11.f18299e = z0Var;
                final e0 b10 = a11.b();
                w.e eVar = new w.e();
                eVar.a((oc.l) b10.f18314n.get());
                eVar.a((oc.l) b10.f18317q.get());
                eVar.a(b10.f18307g.get());
                if (((List) eVar.f29490a).isEmpty()) {
                    unmodifiableSet = Collections.emptySet();
                } else if (((List) eVar.f29490a).size() == 1) {
                    unmodifiableSet = Collections.singleton(((List) eVar.f29490a).get(0));
                } else {
                    unmodifiableSet = Collections.unmodifiableSet(new HashSet((List) eVar.f29490a));
                }
                y yVar = new y(new Callable() { // from class: oc.o
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return (kc.v0) ((kc.e0) c.this).f18315o.get();
                    }
                });
                tk.i<Object> iVar = b10.f18306f.get().f22944c.f23049c;
                Objects.requireNonNull(iVar, "other is null");
                tk.i v10 = tk.i.v(yVar, iVar);
                sc.a aVar = pVar.f23020a;
                h0 h0Var = b10.f18303c;
                String str = h0Var.f18324a;
                h0Var.f18325b.getClass();
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter != null) {
                    BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice(str);
                    b0.c.j(remoteDevice);
                    tc.c cVar = new tc.c(b10.f18302b.f18268a);
                    c1 c1Var = b10.f18306f.get();
                    oc.a aVar2 = b10.f18304d.get();
                    b10.f18303c.getClass();
                    il.b bVar = pl.a.f24280b;
                    b0.c.j(bVar);
                    tk.i a12 = aVar.a(new s(remoteDevice, cVar, c1Var, aVar2, new m0(35L, TimeUnit.SECONDS, bVar), b10.f18301a.booleanValue(), b10.f18303c.f18332i.get()));
                    v10.getClass();
                    Objects.requireNonNull(a12, "subscriptionIndicator is null");
                    return new fl.l(new fl.n(new fl.j(v10, a12), new ph.o(10, unmodifiableSet), yk.a.f31788c), new oc.n(0, unmodifiableSet)).A(pVar.f23022c).F(pVar.f23022c);
                }
                throw l0.f28000b;
        }
    }
}
