package pm;

/* loaded from: classes2.dex */
public final class m extends i1 {

    /* renamed from: e */
    public final j<?> f24368e;

    public m(j<?> jVar) {
        this.f24368e = jVar;
    }

    @Override // pm.w
    public final void R(Throwable th2) {
        boolean o10;
        j<?> jVar = this.f24368e;
        Throwable s10 = jVar.s(S());
        if (!jVar.x()) {
            o10 = false;
        } else {
            o10 = ((um.g) jVar.f24352d).o(s10);
        }
        if (!o10) {
            jVar.G(s10);
            if (!jVar.x()) {
                jVar.p();
            }
        }
    }

    @Override // fm.l
    public final /* bridge */ /* synthetic */ tl.l k(Throwable th2) {
        R(th2);
        return tl.l.f28297a;
    }
}
