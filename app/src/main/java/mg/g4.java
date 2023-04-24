package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class g4 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21022a;

    /* renamed from: b */
    public final /* synthetic */ x4 f21023b;

    public g4(x4 x4Var, long j10) {
        this.f21023b = x4Var;
        this.f21022a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21023b.f21670i.a();
        a10.H(1, this.f21022a);
        this.f21023b.f21662a.c();
        try {
            a10.r();
            this.f21023b.f21662a.p();
            return tl.l.f28297a;
        } finally {
            this.f21023b.f21662a.l();
            this.f21023b.f21670i.c(a10);
        }
    }
}
