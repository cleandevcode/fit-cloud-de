package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class a8 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ int f20674a;

    /* renamed from: b */
    public final /* synthetic */ long f20675b;

    /* renamed from: c */
    public final /* synthetic */ Date f20676c;

    /* renamed from: d */
    public final /* synthetic */ s8 f20677d;

    public a8(int i10, long j10, s8 s8Var, Date date) {
        this.f20677d = s8Var;
        this.f20674a = i10;
        this.f20675b = j10;
        this.f20676c = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f20677d.f21424g.a();
        a10.H(1, this.f20674a);
        a10.H(2, this.f20675b);
        Date date = this.f20676c;
        gm.l.f(date, "date");
        a10.p(3, dg.a.a(date));
        this.f20677d.f21418a.c();
        try {
            a10.r();
            this.f20677d.f21418a.p();
            return tl.l.f28297a;
        } finally {
            this.f20677d.f21418a.l();
            this.f20677d.f21424g.c(a10);
        }
    }
}
