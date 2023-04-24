package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class c4 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ int f20754a;

    /* renamed from: b */
    public final /* synthetic */ long f20755b;

    /* renamed from: c */
    public final /* synthetic */ Date f20756c;

    /* renamed from: d */
    public final /* synthetic */ x4 f20757d;

    public c4(int i10, long j10, x4 x4Var, Date date) {
        this.f20757d = x4Var;
        this.f20754a = i10;
        this.f20755b = j10;
        this.f20756c = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f20757d.f21666e.a();
        a10.H(1, this.f20754a);
        a10.H(2, this.f20755b);
        Date date = this.f20756c;
        k.f.b(date, "date", date, a10, 3);
        this.f20757d.f21662a.c();
        try {
            a10.r();
            this.f20757d.f21662a.p();
            return tl.l.f28297a;
        } finally {
            this.f20757d.f21662a.l();
            this.f20757d.f21666e.c(a10);
        }
    }
}
