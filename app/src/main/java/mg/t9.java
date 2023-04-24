package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class t9 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21485a;

    /* renamed from: b */
    public final /* synthetic */ la f21486b;

    public t9(la laVar, long j10) {
        this.f21486b = laVar;
        this.f21485a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21486b.f21267h.a();
        a10.H(1, this.f21485a);
        this.f21486b.f21260a.c();
        try {
            a10.r();
            this.f21486b.f21260a.p();
            return tl.l.f28297a;
        } finally {
            this.f21486b.f21260a.l();
            this.f21486b.f21267h.c(a10);
        }
    }
}
