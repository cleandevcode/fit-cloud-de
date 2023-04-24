package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class m1 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21278a;

    /* renamed from: b */
    public final /* synthetic */ w1 f21279b;

    public m1(w1 w1Var, long j10) {
        this.f21279b = w1Var;
        this.f21278a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21279b.f21576f.a();
        a10.H(1, this.f21278a);
        this.f21279b.f21571a.c();
        try {
            a10.r();
            this.f21279b.f21571a.p();
            return tl.l.f28297a;
        } finally {
            this.f21279b.f21571a.l();
            this.f21279b.f21576f.c(a10);
        }
    }
}
