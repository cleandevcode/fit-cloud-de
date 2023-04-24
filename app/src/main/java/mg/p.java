package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class p implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21346a;

    /* renamed from: b */
    public final /* synthetic */ i0 f21347b;

    public p(i0 i0Var, long j10) {
        this.f21347b = i0Var;
        this.f21346a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21347b.f21106g.a();
        a10.H(1, this.f21346a);
        this.f21347b.f21100a.c();
        try {
            a10.r();
            this.f21347b.f21100a.p();
            return tl.l.f28297a;
        } finally {
            this.f21347b.f21100a.l();
            this.f21347b.f21106g.c(a10);
        }
    }
}
