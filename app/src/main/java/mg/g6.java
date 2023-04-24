package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class g6 implements Callable<Long> {

    /* renamed from: a */
    public final /* synthetic */ rg.o f21028a;

    /* renamed from: b */
    public final /* synthetic */ c7 f21029b;

    public g6(c7 c7Var, rg.o oVar) {
        this.f21029b = c7Var;
        this.f21028a = oVar;
    }

    @Override // java.util.concurrent.Callable
    public final Long call() {
        this.f21029b.f20797b.c();
        try {
            v6 v6Var = this.f21029b.f20800e;
            rg.o oVar = this.f21028a;
            r2.f a10 = v6Var.a();
            v6Var.d(a10, oVar);
            long F0 = a10.F0();
            v6Var.c(a10);
            this.f21029b.f20797b.p();
            return Long.valueOf(F0);
        } finally {
            this.f21029b.f20797b.l();
        }
    }
}
