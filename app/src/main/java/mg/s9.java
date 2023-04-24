package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class s9 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21427a;

    /* renamed from: b */
    public final /* synthetic */ la f21428b;

    public s9(la laVar, long j10) {
        this.f21428b = laVar;
        this.f21427a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21428b.f21266g.a();
        a10.H(1, this.f21427a);
        this.f21428b.f21260a.c();
        try {
            a10.r();
            this.f21428b.f21260a.p();
            return tl.l.f28297a;
        } finally {
            this.f21428b.f21260a.l();
            this.f21428b.f21266g.c(a10);
        }
    }
}
