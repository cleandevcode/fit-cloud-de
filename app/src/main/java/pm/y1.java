package pm;

/* loaded from: classes2.dex */
public final class y1<T, R> extends k1 {

    /* renamed from: e */
    public final xm.c<R> f24415e;

    /* renamed from: f */
    public final fm.p<T, xl.d<? super R>, Object> f24416f;

    /* JADX WARN: Multi-variable type inference failed */
    public y1(xm.c<? super R> cVar, fm.p<? super T, ? super xl.d<? super R>, ? extends Object> pVar) {
        this.f24415e = cVar;
        this.f24416f = pVar;
    }

    @Override // pm.w
    public final void R(Throwable th2) {
        if (this.f24415e.p()) {
            l1 S = S();
            xm.c<R> cVar = this.f24415e;
            fm.p<T, xl.d<? super R>, Object> pVar = this.f24416f;
            Object d02 = S.d0();
            if (d02 instanceof u) {
                cVar.B(((u) d02).f24396a);
                return;
            }
            Object a10 = n1.a(d02);
            xm.a x10 = cVar.x();
            try {
                um.h.a(mf.a0.i(mf.a0.e(a10, x10, pVar)), tl.l.f28297a, null);
            } catch (Throwable th3) {
                x10.l(mf.a0.f(th3));
                throw th3;
            }
        }
    }

    @Override // fm.l
    public final /* bridge */ /* synthetic */ tl.l k(Throwable th2) {
        R(th2);
        return tl.l.f28297a;
    }
}
