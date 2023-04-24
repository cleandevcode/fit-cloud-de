package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class l3 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21218a;

    /* renamed from: b */
    public final /* synthetic */ Date f21219b;

    /* renamed from: c */
    public final /* synthetic */ j3 f21220c;

    public l3(j3 j3Var, long j10, Date date) {
        this.f21220c = j3Var;
        this.f21218a = j10;
        this.f21219b = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21220c.f21160d.a();
        a10.H(1, this.f21218a);
        Date date = this.f21219b;
        gm.l.f(date, "date");
        a10.p(2, dg.a.a(date));
        this.f21220c.f21158b.c();
        try {
            a10.r();
            this.f21220c.f21158b.p();
            return tl.l.f28297a;
        } finally {
            this.f21220c.f21158b.l();
            this.f21220c.f21160d.c(a10);
        }
    }
}
