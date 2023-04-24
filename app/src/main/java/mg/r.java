package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class r implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21392a;

    /* renamed from: b */
    public final /* synthetic */ i0 f21393b;

    public r(i0 i0Var, long j10) {
        this.f21393b = i0Var;
        this.f21392a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21393b.f21108i.a();
        a10.H(1, this.f21392a);
        this.f21393b.f21100a.c();
        try {
            a10.r();
            this.f21393b.f21100a.p();
            return tl.l.f28297a;
        } finally {
            this.f21393b.f21100a.l();
            this.f21393b.f21108i.c(a10);
        }
    }
}
