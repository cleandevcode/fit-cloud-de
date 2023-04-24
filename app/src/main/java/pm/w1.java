package pm;

import pm.l1;

/* loaded from: classes2.dex */
public final class w1<T> extends k1 {

    /* renamed from: e */
    public final j<T> f24412e;

    public w1(l1.a aVar) {
        this.f24412e = aVar;
    }

    @Override // pm.w
    public final void R(Throwable th2) {
        j<T> jVar;
        Object a10;
        Object d02 = S().d0();
        if (d02 instanceof u) {
            jVar = this.f24412e;
            a10 = mf.a0.f(((u) d02).f24396a);
        } else {
            jVar = this.f24412e;
            a10 = n1.a(d02);
        }
        jVar.l(a10);
    }

    @Override // fm.l
    public final /* bridge */ /* synthetic */ tl.l k(Throwable th2) {
        R(th2);
        return tl.l.f28297a;
    }
}
