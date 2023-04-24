package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class h5 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21058a;

    /* renamed from: b */
    public final /* synthetic */ a6 f21059b;

    public h5(a6 a6Var, long j10) {
        this.f21059b = a6Var;
        this.f21058a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21059b.f20671g.a();
        a10.H(1, this.f21058a);
        this.f21059b.f20665a.c();
        try {
            a10.r();
            this.f21059b.f20665a.p();
            return tl.l.f28297a;
        } finally {
            this.f21059b.f20665a.l();
            this.f21059b.f20671g.c(a10);
        }
    }
}
