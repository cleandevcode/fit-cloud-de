package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class i7 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ Date f21124a;

    /* renamed from: b */
    public final /* synthetic */ h7 f21125b;

    public i7(h7 h7Var, Date date) {
        this.f21125b = h7Var;
        this.f21124a = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21125b.f21067e.a();
        Date date = this.f21124a;
        k.f.b(date, "date", date, a10, 1);
        this.f21125b.f21063a.c();
        try {
            a10.r();
            this.f21125b.f21063a.p();
            return tl.l.f28297a;
        } finally {
            this.f21125b.f21063a.l();
            this.f21125b.f21067e.c(a10);
        }
    }
}
