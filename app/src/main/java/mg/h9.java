package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class h9 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f21078a;

    /* renamed from: b */
    public final /* synthetic */ e9 f21079b;

    public h9(e9 e9Var, long j10) {
        this.f21079b = e9Var;
        this.f21078a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21079b.f20971d.a();
        a10.H(1, this.f21078a);
        this.f21079b.f20969b.c();
        try {
            a10.r();
            this.f21079b.f20969b.p();
            return tl.l.f28297a;
        } finally {
            this.f21079b.f20969b.l();
            this.f21079b.f20971d.c(a10);
        }
    }
}
