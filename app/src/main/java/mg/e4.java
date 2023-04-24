package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class e4 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f20960a;

    /* renamed from: b */
    public final /* synthetic */ x4 f20961b;

    public e4(x4 x4Var, long j10) {
        this.f20961b = x4Var;
        this.f20960a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f20961b.f21668g.a();
        a10.H(1, this.f20960a);
        this.f20961b.f21662a.c();
        try {
            a10.r();
            this.f20961b.f21662a.p();
            return tl.l.f28297a;
        } finally {
            this.f20961b.f21662a.l();
            this.f20961b.f21668g.c(a10);
        }
    }
}
