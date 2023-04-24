package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class z0 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ String f21738a;

    /* renamed from: b */
    public final /* synthetic */ a1 f21739b;

    public z0(a1 a1Var, String str) {
        this.f21739b = a1Var;
        this.f21738a = str;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21739b.f20640e.a();
        String str = this.f21738a;
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        this.f21739b.f20636a.c();
        try {
            a10.r();
            this.f21739b.f20636a.p();
            return tl.l.f28297a;
        } finally {
            this.f21739b.f20636a.l();
            this.f21739b.f20640e.c(a10);
        }
    }
}
