package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class f1 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ String f20982a;

    /* renamed from: b */
    public final /* synthetic */ long f20983b;

    /* renamed from: c */
    public final /* synthetic */ e1 f20984c;

    public f1(e1 e1Var, String str, long j10) {
        this.f20984c = e1Var;
        this.f20982a = str;
        this.f20983b = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f20984c.f20951c.a();
        String str = this.f20982a;
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        a10.H(2, this.f20983b);
        this.f20984c.f20949a.c();
        try {
            a10.r();
            this.f20984c.f20949a.p();
            return tl.l.f28297a;
        } finally {
            this.f20984c.f20949a.l();
            this.f20984c.f20951c.c(a10);
        }
    }
}
