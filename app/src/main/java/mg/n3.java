package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class n3 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21310a;

    /* renamed from: b */
    public final /* synthetic */ j3 f21311b;

    public n3(j3 j3Var, long j10) {
        this.f21311b = j3Var;
        this.f21310a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21311b.f21162f.a();
        a10.H(1, this.f21310a);
        this.f21311b.f21158b.c();
        try {
            a10.r();
            this.f21311b.f21158b.p();
            return tl.l.f28297a;
        } finally {
            this.f21311b.f21158b.l();
            this.f21311b.f21162f.c(a10);
        }
    }
}
