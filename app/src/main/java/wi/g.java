package wi;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements wk.e {

    /* renamed from: a */
    public final /* synthetic */ int f29885a;

    /* renamed from: b */
    public final /* synthetic */ fm.l f29886b;

    public /* synthetic */ g(int i10, fm.l lVar) {
        this.f29885a = i10;
        this.f29886b = lVar;
    }

    @Override // wk.e
    public final Object apply(Object obj) {
        switch (this.f29885a) {
            case 0:
                fm.l lVar = this.f29886b;
                gm.l.f(lVar, "$tmp0");
                return (tk.l) lVar.k(obj);
            case 1:
                fm.l lVar2 = this.f29886b;
                gm.l.f(lVar2, "$tmp0");
                return (tk.l) lVar2.k(obj);
            default:
                fm.l lVar3 = this.f29886b;
                gm.l.f(lVar3, "$tmp0");
                return (Integer) lVar3.k(obj);
        }
    }
}
