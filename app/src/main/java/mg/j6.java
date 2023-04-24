package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class j6 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ int f21165a;

    /* renamed from: b */
    public final /* synthetic */ long f21166b;

    /* renamed from: c */
    public final /* synthetic */ Date f21167c;

    /* renamed from: d */
    public final /* synthetic */ c7 f21168d;

    public j6(int i10, long j10, c7 c7Var, Date date) {
        this.f21168d = c7Var;
        this.f21165a = i10;
        this.f21166b = j10;
        this.f21167c = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21168d.f20803h.a();
        a10.H(1, this.f21165a);
        a10.H(2, this.f21166b);
        Date date = this.f21167c;
        k.f.b(date, "date", date, a10, 3);
        this.f21168d.f20797b.c();
        try {
            a10.r();
            this.f21168d.f20797b.p();
            return tl.l.f28297a;
        } finally {
            this.f21168d.f20797b.l();
            this.f21168d.f20803h.c(a10);
        }
    }
}
