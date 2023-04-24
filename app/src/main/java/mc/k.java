package mc;

import ij.c;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements wk.a {

    /* renamed from: a */
    public final /* synthetic */ int f20434a;

    /* renamed from: b */
    public final /* synthetic */ Object f20435b;

    public /* synthetic */ k(int i10, Object obj) {
        this.f20434a = i10;
        this.f20435b = obj;
    }

    @Override // wk.a
    public final void run() {
        switch (this.f20434a) {
            case 0:
                ((l) this.f20435b).f20439d.set(false);
                return;
            default:
                ij.c cVar = (ij.c) this.f20435b;
                gm.l.f(cVar, "this$0");
                cVar.f17042i.b(new c.a(6, -1));
                return;
        }
    }
}
