package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ya implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21734a;

    /* renamed from: b */
    public final /* synthetic */ wa f21735b;

    public ya(wa waVar, long j10) {
        this.f21735b = waVar;
        this.f21734a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21735b.f21632h.a();
        a10.H(1, this.f21734a);
        this.f21735b.f21625a.c();
        try {
            a10.r();
            this.f21735b.f21625a.p();
            return tl.l.f28297a;
        } finally {
            this.f21735b.f21625a.l();
            this.f21735b.f21632h.c(a10);
        }
    }
}
