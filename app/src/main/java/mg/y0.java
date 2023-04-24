package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class y0 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ int f21684a;

    /* renamed from: b */
    public final /* synthetic */ String f21685b;

    /* renamed from: c */
    public final /* synthetic */ a1 f21686c;

    public y0(a1 a1Var, int i10, String str) {
        this.f21686c = a1Var;
        this.f21684a = i10;
        this.f21685b = str;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21686c.f20639d.a();
        a10.H(1, this.f21684a);
        String str = this.f21685b;
        if (str == null) {
            a10.m0(2);
        } else {
            a10.p(2, str);
        }
        this.f21686c.f20636a.c();
        try {
            a10.r();
            this.f21686c.f20636a.p();
            return tl.l.f28297a;
        } finally {
            this.f21686c.f20636a.l();
            this.f21686c.f20639d.c(a10);
        }
    }
}
