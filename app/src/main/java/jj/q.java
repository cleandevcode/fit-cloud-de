package jj;

/* loaded from: classes2.dex */
public final class q extends gm.m implements fm.l<pj.a, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ l f17960b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l lVar) {
        super(1);
        this.f17960b = lVar;
    }

    @Override // fm.l
    public final tl.l k(pj.a aVar) {
        uk.c cVar = this.f17960b.f17934h;
        if (cVar != null) {
            cVar.c();
        }
        l lVar = this.f17960b;
        lVar.f17934h = new fl.r0(((wi.k) lVar.f17927a).i(lVar), new fj.d(3000L, new wk.f() { // from class: jj.n
            @Override // wk.f
            public final boolean test(Object obj) {
                return !(((Throwable) obj) instanceof lc.f);
            }
        })).y(new rh.y(4, o.f17950b), new rh.z(4, p.f17957b), yk.a.f31788c);
        return tl.l.f28297a;
    }
}
