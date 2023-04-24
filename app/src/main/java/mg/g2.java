package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class g2 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21016a;

    /* renamed from: b */
    public final /* synthetic */ int f21017b;

    /* renamed from: c */
    public final /* synthetic */ Date f21018c;

    /* renamed from: d */
    public final /* synthetic */ a3 f21019d;

    public g2(int i10, long j10, a3 a3Var, Date date) {
        this.f21019d = a3Var;
        this.f21016a = j10;
        this.f21017b = i10;
        this.f21018c = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21019d.f20655f.a();
        a10.H(1, this.f21016a);
        a10.H(2, this.f21017b);
        Date date = this.f21018c;
        k.f.b(date, "date", date, a10, 3);
        this.f21019d.f20650a.c();
        try {
            a10.r();
            this.f21019d.f20650a.p();
            return tl.l.f28297a;
        } finally {
            this.f21019d.f20650a.l();
            this.f21019d.f20655f.c(a10);
        }
    }
}
