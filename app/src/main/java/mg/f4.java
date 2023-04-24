package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class f4 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f20991a;

    /* renamed from: b */
    public final /* synthetic */ x4 f20992b;

    public f4(x4 x4Var, long j10) {
        this.f20992b = x4Var;
        this.f20991a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f20992b.f21669h.a();
        a10.H(1, this.f20991a);
        this.f20992b.f21662a.c();
        try {
            a10.r();
            this.f20992b.f21662a.p();
            return tl.l.f28297a;
        } finally {
            this.f20992b.f21662a.l();
            this.f20992b.f21669h.c(a10);
        }
    }
}
