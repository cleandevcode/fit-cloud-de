package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class g5 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21024a;

    /* renamed from: b */
    public final /* synthetic */ int f21025b;

    /* renamed from: c */
    public final /* synthetic */ Date f21026c;

    /* renamed from: d */
    public final /* synthetic */ a6 f21027d;

    public g5(int i10, long j10, a6 a6Var, Date date) {
        this.f21027d = a6Var;
        this.f21024a = j10;
        this.f21025b = i10;
        this.f21026c = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21027d.f20670f.a();
        a10.H(1, this.f21024a);
        a10.H(2, this.f21025b);
        Date date = this.f21026c;
        k.f.b(date, "date", date, a10, 3);
        this.f21027d.f20665a.c();
        try {
            a10.r();
            this.f21027d.f20665a.p();
            return tl.l.f28297a;
        } finally {
            this.f21027d.f20665a.l();
            this.f21027d.f20670f.c(a10);
        }
    }
}
