package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class z7 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21783a;

    /* renamed from: b */
    public final /* synthetic */ s8 f21784b;

    public z7(s8 s8Var, long j10) {
        this.f21784b = s8Var;
        this.f21783a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21784b.f21422e.a();
        a10.H(1, this.f21783a);
        this.f21784b.f21418a.c();
        try {
            a10.r();
            this.f21784b.f21418a.p();
            return tl.l.f28297a;
        } finally {
            this.f21784b.f21418a.l();
            this.f21784b.f21422e.c(a10);
        }
    }
}
