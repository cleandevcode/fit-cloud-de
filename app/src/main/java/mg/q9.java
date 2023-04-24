package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class q9 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ int f21383a;

    /* renamed from: b */
    public final /* synthetic */ long f21384b;

    /* renamed from: c */
    public final /* synthetic */ Date f21385c;

    /* renamed from: d */
    public final /* synthetic */ la f21386d;

    public q9(int i10, long j10, la laVar, Date date) {
        this.f21386d = laVar;
        this.f21383a = i10;
        this.f21384b = j10;
        this.f21385c = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21386d.f21264e.a();
        a10.H(1, this.f21383a);
        a10.H(2, this.f21384b);
        Date date = this.f21385c;
        k.f.b(date, "date", date, a10, 3);
        this.f21386d.f21260a.c();
        try {
            a10.r();
            this.f21386d.f21260a.p();
            return tl.l.f28297a;
        } finally {
            this.f21386d.f21260a.l();
            this.f21386d.f21264e.c(a10);
        }
    }
}
