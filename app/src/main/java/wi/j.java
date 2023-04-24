package wi;

import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements wk.e {

    /* renamed from: a */
    public final /* synthetic */ int f29891a;

    /* renamed from: b */
    public final /* synthetic */ fm.l f29892b;

    public /* synthetic */ j(int i10, fm.l lVar) {
        this.f29891a = i10;
        this.f29892b = lVar;
    }

    @Override // wk.e
    public final Object apply(Object obj) {
        switch (this.f29891a) {
            case 0:
                fm.l lVar = this.f29892b;
                gm.l.f(lVar, "$tmp0");
                return (tk.l) lVar.k(obj);
            case 1:
                fm.l lVar2 = this.f29892b;
                gm.l.f(lVar2, "$tmp0");
                return (tk.t) lVar2.k(obj);
            case 2:
                fm.l lVar3 = this.f29892b;
                Map<Byte, Integer> map = jj.l.f17926j;
                gm.l.f(lVar3, "$tmp0");
                return (tl.l) lVar3.k(obj);
            case 3:
                fm.l lVar4 = this.f29892b;
                gm.l.f(lVar4, "$tmp0");
                return (rj.e) lVar4.k(obj);
            case 4:
                fm.l lVar5 = this.f29892b;
                gm.l.f(lVar5, "$tmp0");
                return (Boolean) lVar5.k(obj);
            default:
                fm.l lVar6 = this.f29892b;
                gm.l.f(lVar6, "$tmp0");
                return (tl.l) lVar6.k(obj);
        }
    }
}
