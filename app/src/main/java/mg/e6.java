package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class e6 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ rg.o f20964a;

    /* renamed from: b */
    public final /* synthetic */ c7 f20965b;

    public e6(c7 c7Var, rg.o oVar) {
        this.f20965b = c7Var;
        this.f20964a = oVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f20965b.f20797b.c();
        try {
            this.f20965b.f20798c.e(this.f20964a);
            this.f20965b.f20797b.p();
            return tl.l.f28297a;
        } finally {
            this.f20965b.f20797b.l();
        }
    }
}
