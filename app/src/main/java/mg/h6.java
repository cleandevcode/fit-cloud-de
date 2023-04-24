package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class h6 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21060a;

    /* renamed from: b */
    public final /* synthetic */ Date f21061b;

    /* renamed from: c */
    public final /* synthetic */ c7 f21062c;

    public h6(c7 c7Var, long j10, Date date) {
        this.f21062c = c7Var;
        this.f21060a = j10;
        this.f21061b = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21062c.f20801f.a();
        a10.H(1, this.f21060a);
        Date date = this.f21061b;
        k.f.b(date, "date", date, a10, 2);
        this.f21062c.f20797b.c();
        try {
            a10.r();
            this.f21062c.f20797b.p();
            return tl.l.f28297a;
        } finally {
            this.f21062c.f20797b.l();
            this.f21062c.f20801f.c(a10);
        }
    }
}
