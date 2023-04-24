package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class k6 implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ long f21197a;

    /* renamed from: b */
    public final /* synthetic */ int f21198b;

    /* renamed from: c */
    public final /* synthetic */ Date f21199c;

    /* renamed from: d */
    public final /* synthetic */ c7 f21200d;

    public k6(int i10, long j10, c7 c7Var, Date date) {
        this.f21200d = c7Var;
        this.f21197a = j10;
        this.f21198b = i10;
        this.f21199c = date;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        r2.f a10 = this.f21200d.f20804i.a();
        a10.H(1, this.f21197a);
        a10.H(2, this.f21198b);
        Date date = this.f21199c;
        k.f.b(date, "date", date, a10, 3);
        this.f21200d.f20797b.c();
        try {
            Integer valueOf = Integer.valueOf(a10.r());
            this.f21200d.f20797b.p();
            return valueOf;
        } finally {
            this.f21200d.f20797b.l();
            this.f21200d.f20804i.c(a10);
        }
    }
}
