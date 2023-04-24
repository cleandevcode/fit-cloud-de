package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class bc implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ String f20727a;

    /* renamed from: b */
    public final /* synthetic */ long f20728b;

    /* renamed from: c */
    public final /* synthetic */ sb f20729c;

    public bc(sb sbVar, String str, long j10) {
        this.f20729c = sbVar;
        this.f20727a = str;
        this.f20728b = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f20729c.f21455d.a();
        String str = this.f20727a;
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        a10.H(2, this.f20728b);
        this.f20729c.f21452a.c();
        try {
            a10.r();
            this.f20729c.f21452a.p();
            return tl.l.f28297a;
        } finally {
            this.f20729c.f21452a.l();
            this.f20729c.f21455d.c(a10);
        }
    }
}
