package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class jb implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ String f21175a;

    /* renamed from: b */
    public final /* synthetic */ long f21176b;

    /* renamed from: c */
    public final /* synthetic */ sb f21177c;

    public jb(sb sbVar, String str, long j10) {
        this.f21177c = sbVar;
        this.f21175a = str;
        this.f21176b = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21177c.f21456e.a();
        String str = this.f21175a;
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        a10.H(2, this.f21176b);
        this.f21177c.f21452a.c();
        try {
            a10.r();
            this.f21177c.f21452a.p();
            return tl.l.f28297a;
        } finally {
            this.f21177c.f21452a.l();
            this.f21177c.f21456e.c(a10);
        }
    }
}
