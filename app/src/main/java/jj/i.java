package jj;

import java.util.UUID;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements wk.f {

    /* renamed from: a */
    public final /* synthetic */ int f17904a;

    /* renamed from: b */
    public final /* synthetic */ Object f17905b;

    public /* synthetic */ i(int i10, Object obj) {
        this.f17904a = i10;
        this.f17905b = obj;
    }

    @Override // wk.f
    public final boolean test(Object obj) {
        switch (this.f17904a) {
            case 0:
                fm.l lVar = (fm.l) this.f17905b;
                gm.l.f(lVar, "$tmp0");
                return ((Boolean) lVar.k(obj)).booleanValue();
            case 1:
                fm.l lVar2 = (fm.l) this.f17905b;
                gm.l.f(lVar2, "$tmp0");
                return ((Boolean) lVar2.k(obj)).booleanValue();
            case 2:
                fm.l lVar3 = (fm.l) this.f17905b;
                gm.l.f(lVar3, "$tmp0");
                return ((Boolean) lVar3.k(obj)).booleanValue();
            default:
                tc.i iVar = (tc.i) obj;
                UUID uuid = oc.x0.f23059h;
                return iVar.equals((tc.j) this.f17905b);
        }
    }
}
