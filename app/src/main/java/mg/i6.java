package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class i6 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21121a;

    /* renamed from: b */
    public final /* synthetic */ Date f21122b;

    /* renamed from: c */
    public final /* synthetic */ c7 f21123c;

    public i6(c7 c7Var, long j10, Date date) {
        this.f21123c = c7Var;
        this.f21121a = j10;
        this.f21122b = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21123c.f20802g.a();
        a10.H(1, this.f21121a);
        Date date = this.f21122b;
        k.f.b(date, "date", date, a10, 2);
        this.f21123c.f20797b.c();
        try {
            a10.r();
            this.f21123c.f20797b.p();
            return tl.l.f28297a;
        } finally {
            this.f21123c.f20797b.l();
            this.f21123c.f20802g.c(a10);
        }
    }
}
