package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class c8 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f20807a;

    /* renamed from: b */
    public final /* synthetic */ s8 f20808b;

    public c8(s8 s8Var, long j10) {
        this.f20808b = s8Var;
        this.f20807a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f20808b.f21426i.a();
        a10.H(1, this.f20807a);
        this.f20808b.f21418a.c();
        try {
            a10.r();
            this.f20808b.f21418a.p();
            return tl.l.f28297a;
        } finally {
            this.f20808b.f21418a.l();
            this.f20808b.f21426i.c(a10);
        }
    }
}
