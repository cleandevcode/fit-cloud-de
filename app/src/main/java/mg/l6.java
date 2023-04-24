package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class l6 implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ long f21225a;

    /* renamed from: b */
    public final /* synthetic */ c7 f21226b;

    public l6(c7 c7Var, long j10) {
        this.f21226b = c7Var;
        this.f21225a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        r2.f a10 = this.f21226b.f20805j.a();
        a10.H(1, this.f21225a);
        this.f21226b.f20797b.c();
        try {
            Integer valueOf = Integer.valueOf(a10.r());
            this.f21226b.f20797b.p();
            return valueOf;
        } finally {
            this.f21226b.f20797b.l();
            this.f21226b.f20805j.c(a10);
        }
    }
}
