package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class lb implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ String f21269a;

    /* renamed from: b */
    public final /* synthetic */ long f21270b;

    /* renamed from: c */
    public final /* synthetic */ sb f21271c;

    public lb(sb sbVar, String str, long j10) {
        this.f21271c = sbVar;
        this.f21269a = str;
        this.f21270b = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21271c.f21458g.a();
        String str = this.f21269a;
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        a10.H(2, this.f21270b);
        this.f21271c.f21452a.c();
        try {
            a10.r();
            this.f21271c.f21452a.p();
            return tl.l.f28297a;
        } finally {
            this.f21271c.f21452a.l();
            this.f21271c.f21458g.c(a10);
        }
    }
}
