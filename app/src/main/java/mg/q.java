package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class q implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21369a;

    /* renamed from: b */
    public final /* synthetic */ i0 f21370b;

    public q(i0 i0Var, long j10) {
        this.f21370b = i0Var;
        this.f21369a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21370b.f21107h.a();
        a10.H(1, this.f21369a);
        this.f21370b.f21100a.c();
        try {
            a10.r();
            this.f21370b.f21100a.p();
            return tl.l.f28297a;
        } finally {
            this.f21370b.f21100a.l();
            this.f21370b.f21107h.c(a10);
        }
    }
}
