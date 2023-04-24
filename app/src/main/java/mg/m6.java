package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class m6 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21286a;

    /* renamed from: b */
    public final /* synthetic */ c7 f21287b;

    public m6(c7 c7Var, long j10) {
        this.f21287b = c7Var;
        this.f21286a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21287b.f20806k.a();
        a10.H(1, this.f21286a);
        this.f21287b.f20797b.c();
        try {
            a10.r();
            this.f21287b.f20797b.p();
            return tl.l.f28297a;
        } finally {
            this.f21287b.f20797b.l();
            this.f21287b.f20806k.c(a10);
        }
    }
}
