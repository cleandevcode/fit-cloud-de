package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class za implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21794a;

    /* renamed from: b */
    public final /* synthetic */ wa f21795b;

    public za(wa waVar, long j10) {
        this.f21795b = waVar;
        this.f21794a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21795b.f21633i.a();
        a10.H(1, this.f21794a);
        this.f21795b.f21625a.c();
        try {
            a10.r();
            this.f21795b.f21625a.p();
            return tl.l.f28297a;
        } finally {
            this.f21795b.f21625a.l();
            this.f21795b.f21633i.c(a10);
        }
    }
}
