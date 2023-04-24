package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class m7 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21288a;

    /* renamed from: b */
    public final /* synthetic */ h7 f21289b;

    public m7(h7 h7Var, long j10) {
        this.f21289b = h7Var;
        this.f21288a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21289b.f21071i.a();
        a10.H(1, this.f21288a);
        this.f21289b.f21063a.c();
        try {
            a10.r();
            this.f21289b.f21063a.p();
            return tl.l.f28297a;
        } finally {
            this.f21289b.f21063a.l();
            this.f21289b.f21071i.c(a10);
        }
    }
}
