package pm;

import xl.e;
import xl.f;

/* loaded from: classes2.dex */
public abstract class b0 extends xl.a implements xl.e {

    /* renamed from: b */
    public static final a f24324b = new a();

    /* loaded from: classes2.dex */
    public static final class a extends xl.b<xl.e, b0> {

        /* renamed from: pm.b0$a$a */
        /* loaded from: classes2.dex */
        public static final class C0440a extends gm.m implements fm.l<f.b, b0> {

            /* renamed from: b */
            public static final C0440a f24325b = new C0440a();

            public C0440a() {
                super(1);
            }

            @Override // fm.l
            public final b0 k(f.b bVar) {
                f.b bVar2 = bVar;
                if (bVar2 instanceof b0) {
                    return (b0) bVar2;
                }
                return null;
            }
        }

        public a() {
            super(e.a.f30630a, C0440a.f24325b);
        }
    }

    public b0() {
        super(e.a.f30630a);
    }

    @Override // xl.e
    public final void L(xl.d<?> dVar) {
        ((um.g) dVar).p();
    }

    @Override // xl.a, xl.f.b, xl.f
    public final <E extends f.b> E b(f.c<E> cVar) {
        boolean z10;
        gm.l.f(cVar, "key");
        if (cVar instanceof xl.b) {
            xl.b bVar = (xl.b) cVar;
            f.c<?> cVar2 = this.f30620a;
            gm.l.f(cVar2, "key");
            if (cVar2 != bVar && bVar.f30622b != cVar2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                E e10 = (E) bVar.f30621a.k(this);
                if (e10 instanceof f.b) {
                    return e10;
                }
            }
        } else if (e.a.f30630a == cVar) {
            return this;
        }
        return null;
    }

    @Override // xl.e
    public final um.g h0(zl.c cVar) {
        return new um.g(this, cVar);
    }

    public abstract void l0(xl.f fVar, Runnable runnable);

    public void n0(xl.f fVar, Runnable runnable) {
        l0(fVar, runnable);
    }

    public boolean p0(xl.f fVar) {
        return !(this instanceof f2);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + g0.j(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0024, code lost:
        if (((xl.f.b) r3.f30621a.k(r2)) != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0029, code lost:
        if (xl.e.a.f30630a == r3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
        return xl.g.f30632a;
     */
    @Override // xl.a, xl.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final xl.f y(xl.f.c<?> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            gm.l.f(r3, r0)
            boolean r1 = r3 instanceof xl.b
            if (r1 == 0) goto L27
            xl.b r3 = (xl.b) r3
            xl.f$c<?> r1 = r2.f30620a
            gm.l.f(r1, r0)
            if (r1 == r3) goto L19
            xl.f$c<?> r0 = r3.f30622b
            if (r0 != r1) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 == 0) goto L2e
            fm.l<xl.f$b, E extends B> r3 = r3.f30621a
            java.lang.Object r3 = r3.k(r2)
            xl.f$b r3 = (xl.f.b) r3
            if (r3 == 0) goto L2e
            goto L2b
        L27:
            xl.e$a r0 = xl.e.a.f30630a
            if (r0 != r3) goto L2e
        L2b:
            xl.g r3 = xl.g.f30632a
            goto L2f
        L2e:
            r3 = r2
        L2f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.b0.y(xl.f$c):xl.f");
    }
}
