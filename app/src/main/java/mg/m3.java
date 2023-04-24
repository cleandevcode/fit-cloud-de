package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class m3 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21280a;

    /* renamed from: b */
    public final /* synthetic */ Date f21281b;

    /* renamed from: c */
    public final /* synthetic */ Date f21282c;

    /* renamed from: d */
    public final /* synthetic */ j3 f21283d;

    public m3(j3 j3Var, long j10, Date date, Date date2) {
        this.f21283d = j3Var;
        this.f21280a = j10;
        this.f21281b = date;
        this.f21282c = date2;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21283d.f21161e.a();
        a10.H(1, this.f21280a);
        Date date = this.f21281b;
        gm.l.f(date, "date");
        a10.p(2, dg.a.a(date));
        Date date2 = this.f21282c;
        gm.l.f(date2, "date");
        a10.p(3, dg.a.a(date2));
        this.f21283d.f21158b.c();
        try {
            a10.r();
            this.f21283d.f21158b.p();
            return tl.l.f28297a;
        } finally {
            this.f21283d.f21158b.l();
            this.f21283d.f21161e.c(a10);
        }
    }
}
