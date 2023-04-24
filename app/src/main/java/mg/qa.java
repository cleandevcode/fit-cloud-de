package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class qa implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ String f21387a;

    /* renamed from: b */
    public final /* synthetic */ int f21388b;

    /* renamed from: c */
    public final /* synthetic */ pa f21389c;

    public qa(pa paVar, String str, int i10) {
        this.f21389c = paVar;
        this.f21387a = str;
        this.f21388b = i10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21389c.f21364c.a();
        String str = this.f21387a;
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        a10.H(2, this.f21388b);
        this.f21389c.f21362a.c();
        try {
            a10.r();
            this.f21389c.f21362a.p();
            return tl.l.f28297a;
        } finally {
            this.f21389c.f21362a.l();
            this.f21389c.f21364c.c(a10);
        }
    }
}
