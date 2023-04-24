package kc;

import com.polidea.rxandroidble3.internal.RxBleLog;
import java.util.HashMap;
import java.util.Objects;
import kc.m0;
import yk.a;

/* loaded from: classes.dex */
public final class t0 extends o0 {

    /* renamed from: a */
    public final sc.a f18380a;

    /* renamed from: b */
    public final mc.n f18381b;

    /* renamed from: c */
    public final rc.d0 f18382c;

    /* renamed from: d */
    public final rc.s f18383d;

    /* renamed from: e */
    public final wk.e<rc.q, uc.e> f18384e;

    /* renamed from: f */
    public final a f18385f;

    /* renamed from: g */
    public final tk.o f18386g;

    /* renamed from: h */
    public final tc.l0 f18387h;

    /* renamed from: i */
    public final tk.i<m0.b> f18388i;

    /* renamed from: j */
    public final tc.d0 f18389j;

    /* renamed from: k */
    public final u3.a<tc.u> f18390k;

    /* renamed from: l */
    public final uc.a f18391l;

    /* renamed from: m */
    public final tc.l f18392m;

    public t0(tc.l0 l0Var, sc.a aVar, tk.i iVar, tc.d0 d0Var, u3.a aVar2, mc.n nVar, rc.d0 d0Var2, rc.s sVar, wk.e eVar, tk.o oVar, a aVar3, uc.a aVar4, tc.l lVar) {
        new HashMap();
        this.f18380a = aVar;
        this.f18387h = l0Var;
        this.f18388i = iVar;
        this.f18389j = d0Var;
        this.f18390k = aVar2;
        this.f18381b = nVar;
        this.f18382c = d0Var2;
        this.f18383d = sVar;
        this.f18384e = eVar;
        this.f18386g = oVar;
        this.f18385f = aVar3;
        this.f18391l = aVar4;
        this.f18392m = lVar;
    }

    @Override // kc.o0
    public final w0 a(String str) {
        boolean z10;
        if (this.f18387h.f28001a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return this.f18381b.a(str);
        }
        throw new UnsupportedOperationException("RxAndroidBle library needs a BluetoothAdapter to be available in the system to work. If this is a test on an emulator then you can use 'https://github.com/Polidea/RxAndroidBle/tree/master/mockrxandroidble'");
    }

    @Override // kc.o0
    public final boolean b() {
        tc.l lVar = this.f18392m;
        boolean z10 = true;
        for (String[] strArr : lVar.f27999b) {
            z10 &= lVar.f27998a.a(strArr);
        }
        return z10;
    }

    @Override // kc.o0
    public final tk.i<uc.e> c(final uc.f fVar, final uc.c... cVarArr) {
        return new bl.k(1, new wk.g() { // from class: kc.p0
            /* JADX WARN: Type inference failed for: r2v8, types: [kc.s0] */
            @Override // wk.g
            public final Object get() {
                tk.i jVar;
                t0 t0Var = t0.this;
                uc.f fVar2 = fVar;
                uc.c[] cVarArr2 = cVarArr;
                t0Var.f18383d.a(fVar2.f28680g);
                d6.b0 a10 = t0Var.f18382c.a(fVar2, cVarArr2);
                tk.i u10 = t0Var.f18380a.a((qc.y) a10.f12641a).F(t0Var.f18386g).c((tk.m) a10.f12642b).u(t0Var.f18384e);
                wk.d dVar = new wk.d() { // from class: kc.q0
                    @Override // wk.d
                    public final void accept(Object obj) {
                        uc.e eVar = (uc.e) obj;
                        if (RxBleLog.getShouldLogScannedPeripherals()) {
                            RxBleLog.i("%s", eVar);
                        }
                    }
                };
                a.d dVar2 = yk.a.f31789d;
                a.c cVar = yk.a.f31788c;
                fl.m k10 = u10.k(dVar, dVar2, cVar, cVar);
                tk.i<m0.b> iVar = t0Var.f18388i;
                wk.f fVar3 = new wk.f() { // from class: kc.r0
                    @Override // wk.f
                    public final boolean test(Object obj) {
                        return ((m0.b) obj) != m0.b.f18353c;
                    }
                };
                iVar.getClass();
                dl.d dVar3 = new dl.d(new fl.p(new fl.t(iVar, fVar3)), new wk.e() { // from class: kc.s0
                    @Override // wk.e
                    public final Object apply(Object obj) {
                        m0.b bVar = (m0.b) obj;
                        return new dl.b(new lc.n(1));
                    }
                });
                if (dVar3 instanceof zk.a) {
                    jVar = ((zk.a) dVar3).b();
                } else {
                    jVar = new dl.j(dVar3);
                }
                Objects.requireNonNull(jVar, "other is null");
                return tk.i.v(k10, jVar);
            }
        });
    }

    public final void finalize() {
        this.f18385f.a();
        super.finalize();
    }
}
