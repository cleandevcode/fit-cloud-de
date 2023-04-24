package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class f5 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ int f20993a;

    /* renamed from: b */
    public final /* synthetic */ long f20994b;

    /* renamed from: c */
    public final /* synthetic */ Date f20995c;

    /* renamed from: d */
    public final /* synthetic */ a6 f20996d;

    public f5(int i10, long j10, a6 a6Var, Date date) {
        this.f20996d = a6Var;
        this.f20993a = i10;
        this.f20994b = j10;
        this.f20995c = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f20996d.f20669e.a();
        a10.H(1, this.f20993a);
        a10.H(2, this.f20994b);
        Date date = this.f20995c;
        k.f.b(date, "date", date, a10, 3);
        this.f20996d.f20665a.c();
        try {
            a10.r();
            this.f20996d.f20665a.p();
            return tl.l.f28297a;
        } finally {
            this.f20996d.f20665a.l();
            this.f20996d.f20669e.c(a10);
        }
    }
}
