package oc;

import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements wk.a {

    /* renamed from: a */
    public final /* synthetic */ int f23014a;

    /* renamed from: b */
    public final /* synthetic */ Object f23015b;

    public /* synthetic */ n(int i10, Object obj) {
        this.f23014a = i10;
        this.f23015b = obj;
    }

    @Override // wk.a
    public final void run() {
        switch (this.f23014a) {
            case 0:
                for (l lVar : (Set) this.f23015b) {
                    lVar.b();
                }
                return;
            case 1:
                rh.c0 c0Var = (rh.c0) this.f23015b;
                gm.l.f(c0Var, "this$0");
                c0Var.b();
                return;
            default:
                cj.a aVar = (cj.a) this.f23015b;
                gm.l.f(aVar, "$fcProtocolQueue");
                ((cj.h) aVar).f4898l = false;
                return;
        }
    }
}
