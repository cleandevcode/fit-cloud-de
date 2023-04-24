package dj;

import fm.l;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements wk.f {

    /* renamed from: a */
    public final /* synthetic */ int f13100a;

    /* renamed from: b */
    public final /* synthetic */ l f13101b;

    public /* synthetic */ c(int i10, l lVar) {
        this.f13100a = i10;
        this.f13101b = lVar;
    }

    @Override // wk.f
    public final boolean test(Object obj) {
        switch (this.f13100a) {
            case 0:
                l lVar = this.f13101b;
                gm.l.f(lVar, "$tmp0");
                return ((Boolean) lVar.k(obj)).booleanValue();
            case 1:
                l lVar2 = this.f13101b;
                gm.l.f(lVar2, "$tmp0");
                return ((Boolean) lVar2.k(obj)).booleanValue();
            default:
                l lVar3 = this.f13101b;
                gm.l.f(lVar3, "$tmp0");
                return ((Boolean) lVar3.k(obj)).booleanValue();
        }
    }
}
