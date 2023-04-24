package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class e5 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ rg.n f20962a;

    /* renamed from: b */
    public final /* synthetic */ a6 f20963b;

    public e5(a6 a6Var, rg.n nVar) {
        this.f20963b = a6Var;
        this.f20962a = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f20963b.f20665a.c();
        try {
            this.f20963b.f20668d.e(this.f20962a);
            this.f20963b.f20665a.p();
            return tl.l.f28297a;
        } finally {
            this.f20963b.f20665a.l();
        }
    }
}
