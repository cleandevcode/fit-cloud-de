package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class kb implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21207a;

    /* renamed from: b */
    public final /* synthetic */ sb f21208b;

    public kb(sb sbVar, long j10) {
        this.f21208b = sbVar;
        this.f21207a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21208b.f21457f.a();
        a10.H(1, this.f21207a);
        this.f21208b.f21452a.c();
        try {
            a10.r();
            this.f21208b.f21452a.p();
            return tl.l.f28297a;
        } finally {
            this.f21208b.f21452a.l();
            this.f21208b.f21457f.c(a10);
        }
    }
}
