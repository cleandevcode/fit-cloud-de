package mg;

import java.util.Date;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class d4 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f20829a;

    /* renamed from: b */
    public final /* synthetic */ int f20830b;

    /* renamed from: c */
    public final /* synthetic */ Date f20831c;

    /* renamed from: d */
    public final /* synthetic */ x4 f20832d;

    public d4(int i10, long j10, x4 x4Var, Date date) {
        this.f20832d = x4Var;
        this.f20829a = j10;
        this.f20830b = i10;
        this.f20831c = date;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f20832d.f21667f.a();
        a10.H(1, this.f20829a);
        a10.H(2, this.f20830b);
        Date date = this.f20831c;
        k.f.b(date, "date", date, a10, 3);
        this.f20832d.f21662a.c();
        try {
            a10.r();
            this.f20832d.f21662a.p();
            return tl.l.f28297a;
        } finally {
            this.f20832d.f21662a.l();
            this.f20832d.f21667f.c(a10);
        }
    }
}
