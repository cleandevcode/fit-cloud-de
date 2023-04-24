package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class n0 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ String f21304a;

    /* renamed from: b */
    public final /* synthetic */ a1 f21305b;

    public n0(a1 a1Var, String str) {
        this.f21305b = a1Var;
        this.f21304a = str;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21305b.f20641f.a();
        String str = this.f21304a;
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        this.f21305b.f20636a.c();
        try {
            a10.r();
            this.f21305b.f20636a.p();
            return tl.l.f28297a;
        } finally {
            this.f21305b.f20636a.l();
            this.f21305b.f20641f.c(a10);
        }
    }
}
