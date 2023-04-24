package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class n implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ int f21300a;

    /* renamed from: b */
    public final /* synthetic */ long f21301b;

    /* renamed from: c */
    public final /* synthetic */ Date f21302c;

    /* renamed from: d */
    public final /* synthetic */ i0 f21303d;

    public n(int i10, long j10, i0 i0Var, Date date) {
        this.f21303d = i0Var;
        this.f21300a = i10;
        this.f21301b = j10;
        this.f21302c = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21303d.f21104e.a();
        a10.H(1, this.f21300a);
        a10.H(2, this.f21301b);
        Date date = this.f21302c;
        k.f.b(date, "date", date, a10, 3);
        this.f21303d.f21100a.c();
        try {
            a10.r();
            this.f21303d.f21100a.p();
            return tl.l.f28297a;
        } finally {
            this.f21303d.f21100a.l();
            this.f21303d.f21104e.c(a10);
        }
    }
}
