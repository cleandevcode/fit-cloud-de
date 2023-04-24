package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class b8 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f20712a;

    /* renamed from: b */
    public final /* synthetic */ int f20713b;

    /* renamed from: c */
    public final /* synthetic */ Date f20714c;

    /* renamed from: d */
    public final /* synthetic */ s8 f20715d;

    public b8(int i10, long j10, s8 s8Var, Date date) {
        this.f20715d = s8Var;
        this.f20712a = j10;
        this.f20713b = i10;
        this.f20714c = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f20715d.f21425h.a();
        a10.H(1, this.f20712a);
        a10.H(2, this.f20713b);
        Date date = this.f20714c;
        k.f.b(date, "date", date, a10, 3);
        this.f20715d.f21418a.c();
        try {
            a10.r();
            this.f20715d.f21418a.p();
            return tl.l.f28297a;
        } finally {
            this.f20715d.f21418a.l();
            this.f20715d.f21425h.c(a10);
        }
    }
}
