package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class r9 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21404a;

    /* renamed from: b */
    public final /* synthetic */ int f21405b;

    /* renamed from: c */
    public final /* synthetic */ Date f21406c;

    /* renamed from: d */
    public final /* synthetic */ la f21407d;

    public r9(int i10, long j10, la laVar, Date date) {
        this.f21407d = laVar;
        this.f21404a = j10;
        this.f21405b = i10;
        this.f21406c = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21407d.f21265f.a();
        a10.H(1, this.f21404a);
        a10.H(2, this.f21405b);
        Date date = this.f21406c;
        k.f.b(date, "date", date, a10, 3);
        this.f21407d.f21260a.c();
        try {
            a10.r();
            this.f21407d.f21260a.p();
            return tl.l.f28297a;
        } finally {
            this.f21407d.f21260a.l();
            this.f21407d.f21265f.c(a10);
        }
    }
}
