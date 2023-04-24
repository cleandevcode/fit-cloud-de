package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class f2 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ int f20985a;

    /* renamed from: b */
    public final /* synthetic */ long f20986b;

    /* renamed from: c */
    public final /* synthetic */ Date f20987c;

    /* renamed from: d */
    public final /* synthetic */ a3 f20988d;

    public f2(int i10, long j10, a3 a3Var, Date date) {
        this.f20988d = a3Var;
        this.f20985a = i10;
        this.f20986b = j10;
        this.f20987c = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f20988d.f20654e.a();
        a10.H(1, this.f20985a);
        a10.H(2, this.f20986b);
        Date date = this.f20987c;
        k.f.b(date, "date", date, a10, 3);
        this.f20988d.f20650a.c();
        try {
            a10.r();
            this.f20988d.f20650a.p();
            return tl.l.f28297a;
        } finally {
            this.f20988d.f20650a.l();
            this.f20988d.f20654e.c(a10);
        }
    }
}
