package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class h2 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21052a;

    /* renamed from: b */
    public final /* synthetic */ a3 f21053b;

    public h2(a3 a3Var, long j10) {
        this.f21053b = a3Var;
        this.f21052a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21053b.f20656g.a();
        a10.H(1, this.f21052a);
        this.f21053b.f20650a.c();
        try {
            a10.r();
            this.f21053b.f20650a.p();
            return tl.l.f28297a;
        } finally {
            this.f21053b.f20650a.l();
            this.f21053b.f20656g.c(a10);
        }
    }
}
