package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class o implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21324a;

    /* renamed from: b */
    public final /* synthetic */ int f21325b;

    /* renamed from: c */
    public final /* synthetic */ Date f21326c;

    /* renamed from: d */
    public final /* synthetic */ i0 f21327d;

    public o(int i10, long j10, i0 i0Var, Date date) {
        this.f21327d = i0Var;
        this.f21324a = j10;
        this.f21325b = i10;
        this.f21326c = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21327d.f21105f.a();
        a10.H(1, this.f21324a);
        a10.H(2, this.f21325b);
        Date date = this.f21326c;
        k.f.b(date, "date", date, a10, 3);
        this.f21327d.f21100a.c();
        try {
            a10.r();
            this.f21327d.f21100a.p();
            return tl.l.f28297a;
        } finally {
            this.f21327d.f21100a.l();
            this.f21327d.f21105f.c(a10);
        }
    }
}
