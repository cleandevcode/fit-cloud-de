package um;

/* loaded from: classes2.dex */
public class v<T> extends pm.a<T> implements zl.d {

    /* renamed from: c */
    public final xl.d<T> f28940c;

    public v(xl.d dVar, xl.f fVar) {
        super(fVar, true);
        this.f28940c = dVar;
    }

    @Override // pm.l1
    public void A(Object obj) {
        h.a(mf.a0.i(this.f28940c), jh.v.e(obj), null);
    }

    @Override // zl.d
    public final zl.d g() {
        xl.d<T> dVar = this.f28940c;
        if (dVar instanceof zl.d) {
            return (zl.d) dVar;
        }
        return null;
    }

    @Override // pm.l1
    public final boolean k0() {
        return true;
    }

    @Override // pm.a
    public void x0(Object obj) {
        this.f28940c.l(jh.v.e(obj));
    }
}
