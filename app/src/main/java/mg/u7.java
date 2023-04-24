package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class u7 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ rg.r f21492a;

    /* renamed from: b */
    public final /* synthetic */ h7 f21493b;

    public u7(h7 h7Var, rg.r rVar) {
        this.f21493b = h7Var;
        this.f21492a = rVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21493b.f21063a.c();
        try {
            this.f21493b.f21064b.e(this.f21492a);
            this.f21493b.f21063a.p();
            return tl.l.f28297a;
        } finally {
            this.f21493b.f21063a.l();
        }
    }
}
