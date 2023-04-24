package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class u9 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21501a;

    /* renamed from: b */
    public final /* synthetic */ la f21502b;

    public u9(la laVar, long j10) {
        this.f21502b = laVar;
        this.f21501a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21502b.f21268i.a();
        a10.H(1, this.f21501a);
        this.f21502b.f21260a.c();
        try {
            a10.r();
            this.f21502b.f21260a.p();
            return tl.l.f28297a;
        } finally {
            this.f21502b.f21260a.l();
            this.f21502b.f21268i.c(a10);
        }
    }
}
