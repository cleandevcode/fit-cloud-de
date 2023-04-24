package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class i2 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21113a;

    /* renamed from: b */
    public final /* synthetic */ a3 f21114b;

    public i2(a3 a3Var, long j10) {
        this.f21114b = a3Var;
        this.f21113a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21114b.f20657h.a();
        a10.H(1, this.f21113a);
        this.f21114b.f20650a.c();
        try {
            a10.r();
            this.f21114b.f20650a.p();
            return tl.l.f28297a;
        } finally {
            this.f21114b.f20650a.l();
            this.f21114b.f20657h.c(a10);
        }
    }
}
