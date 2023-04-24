package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class u3 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21490a;

    /* renamed from: b */
    public final /* synthetic */ t3 f21491b;

    public u3(t3 t3Var, long j10) {
        this.f21491b = t3Var;
        this.f21490a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21491b.f21466d.a();
        a10.H(1, this.f21490a);
        this.f21491b.f21463a.c();
        try {
            a10.r();
            this.f21491b.f21463a.p();
            return tl.l.f28297a;
        } finally {
            this.f21491b.f21463a.l();
            this.f21491b.f21466d.c(a10);
        }
    }
}
