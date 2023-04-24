package a0;

import a0.g1;
import ao.h;

/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f53a;

    /* renamed from: b */
    public final /* synthetic */ Object f54b;

    /* renamed from: c */
    public final /* synthetic */ Object f55c;

    /* renamed from: d */
    public final /* synthetic */ Object f56d;

    public /* synthetic */ f1(Object obj, Object obj2, Object obj3, int i10) {
        this.f53a = i10;
        this.f54b = obj;
        this.f55c = obj2;
        this.f56d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53a) {
            case 0:
                g1 g1Var = (g1) this.f54b;
                g1.a aVar = (g1.a) this.f55c;
                g1.a aVar2 = (g1.a) this.f56d;
                if (aVar != null) {
                    g1Var.f71a.i(aVar);
                }
                g1Var.f71a.f(aVar2);
                return;
            case 1:
                m2.q qVar = (m2.q) this.f54b;
                r2.e eVar = (r2.e) this.f55c;
                gm.l.f(qVar, "this$0");
                gm.l.f(eVar, "$query");
                gm.l.f((m2.r) this.f56d, "$queryInterceptorProgram");
                qVar.getClass();
                gm.l.e(eVar.b(), "query.getSql()");
                throw null;
            default:
                ((ao.d) this.f55c).b(h.a.this, (Throwable) this.f56d);
                return;
        }
    }
}
