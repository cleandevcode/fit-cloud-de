package pm;

import pm.g1;

/* loaded from: classes2.dex */
public abstract class a<T> extends l1 implements xl.d<T>, e0 {

    /* renamed from: b */
    public final xl.f f24320b;

    public a(xl.f fVar, boolean z10) {
        super(z10);
        j0((g1) fVar.b(g1.b.f24341a));
        this.f24320b = fVar.s(this);
    }

    public final void A0(int i10, a aVar, fm.p pVar) {
        Object f10;
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            try {
                                xl.f fVar = this.f24320b;
                                Object c10 = um.z.c(fVar, null);
                                gm.e0.c(2, pVar);
                                f10 = pVar.A(aVar, this);
                                um.z.a(fVar, c10);
                                if (f10 == yl.a.COROUTINE_SUSPENDED) {
                                    return;
                                }
                            } catch (Throwable th2) {
                                f10 = mf.a0.f(th2);
                            }
                            l(f10);
                            return;
                        }
                        throw new qa.p();
                    }
                    mf.a0.i(mf.a0.e(aVar, this, pVar)).l(tl.l.f28297a);
                    return;
                }
                return;
            }
            try {
                um.h.a(mf.a0.i(mf.a0.e(aVar, this, pVar)), tl.l.f28297a, null);
                return;
            } catch (Throwable th3) {
                l(mf.a0.f(th3));
                throw th3;
            }
        }
        throw null;
    }

    @Override // pm.e0
    public final xl.f E() {
        return this.f24320b;
    }

    @Override // pm.l1
    public final String N() {
        return getClass().getSimpleName() + " was cancelled";
    }

    @Override // pm.l1, pm.g1
    public boolean a() {
        return super.a();
    }

    @Override // xl.d
    public final xl.f e() {
        return this.f24320b;
    }

    @Override // pm.l1
    public final void g0(x xVar) {
        ih.v.g(this.f24320b, xVar);
    }

    @Override // xl.d
    public final void l(Object obj) {
        Throwable a10 = tl.g.a(obj);
        if (a10 != null) {
            obj = new u(a10, false);
        }
        Object m02 = m0(obj);
        if (m02 == n1.f24374b) {
            return;
        }
        x0(m02);
    }

    @Override // pm.l1
    public String n0() {
        return super.n0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm.l1
    public final void q0(Object obj) {
        if (!(obj instanceof u)) {
            z0(obj);
            return;
        }
        u uVar = (u) obj;
        y0(uVar.f24396a, uVar.a());
    }

    public void x0(Object obj) {
        A(obj);
    }

    public void y0(Throwable th2, boolean z10) {
    }

    public void z0(T t10) {
    }
}
