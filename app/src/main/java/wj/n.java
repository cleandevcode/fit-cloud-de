package wj;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements wk.f {

    /* renamed from: a */
    public final /* synthetic */ int f29994a;

    /* renamed from: b */
    public final /* synthetic */ fm.l f29995b;

    public /* synthetic */ n(int i10, fm.l lVar) {
        this.f29994a = i10;
        this.f29995b = lVar;
    }

    @Override // wk.f
    public final boolean test(Object obj) {
        switch (this.f29994a) {
            case 0:
                fm.l lVar = this.f29995b;
                gm.l.f(lVar, "$tmp0");
                return ((Boolean) lVar.k(obj)).booleanValue();
            default:
                fm.l lVar2 = this.f29995b;
                gm.l.f(lVar2, "$tmp0");
                return ((Boolean) lVar2.k(obj)).booleanValue();
        }
    }
}
