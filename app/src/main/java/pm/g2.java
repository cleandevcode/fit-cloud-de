package pm;

/* loaded from: classes2.dex */
public final class g2<T> extends um.v<T> {

    /* renamed from: d */
    public ThreadLocal<tl.f<xl.f, Object>> f24342d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g2(xl.d r3, xl.f r4) {
        /*
            r2 = this;
            pm.h2 r0 = pm.h2.f24346a
            xl.f$b r1 = r4.b(r0)
            if (r1 != 0) goto Ld
            xl.f r0 = r4.s(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f24342d = r0
            xl.f r3 = r3.e()
            xl.e$a r0 = xl.e.a.f30630a
            xl.f$b r3 = r3.b(r0)
            boolean r3 = r3 instanceof pm.b0
            if (r3 != 0) goto L38
            r3 = 0
            java.lang.Object r3 = um.z.c(r4, r3)
            um.z.a(r4, r3)
            java.lang.ThreadLocal<tl.f<xl.f, java.lang.Object>> r0 = r2.f24342d
            tl.f r1 = new tl.f
            r1.<init>(r4, r3)
            r0.set(r1)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.g2.<init>(xl.d, xl.f):void");
    }

    public final boolean B0() {
        if (this.f24342d.get() == null) {
            return false;
        }
        this.f24342d.set(null);
        return true;
    }

    @Override // um.v, pm.a
    public final void x0(Object obj) {
        tl.f<xl.f, Object> fVar = this.f24342d.get();
        g2<?> g2Var = null;
        if (fVar != null) {
            um.z.a(fVar.f28286a, fVar.f28287b);
            this.f24342d.set(null);
        }
        Object e10 = jh.v.e(obj);
        xl.d<T> dVar = this.f28940c;
        xl.f e11 = dVar.e();
        Object c10 = um.z.c(e11, null);
        if (c10 != um.z.f28944a) {
            g2Var = z.b(dVar, e11, c10);
        }
        try {
            this.f28940c.l(e10);
            tl.l lVar = tl.l.f28297a;
        } finally {
            if (g2Var == null || g2Var.B0()) {
                um.z.a(e11, c10);
            }
        }
    }
}
