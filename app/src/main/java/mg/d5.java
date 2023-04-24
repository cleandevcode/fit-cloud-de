package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class d5 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ rg.m f20833a;

    /* renamed from: b */
    public final /* synthetic */ a6 f20834b;

    public d5(a6 a6Var, rg.m mVar) {
        this.f20834b = a6Var;
        this.f20833a = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f20834b.f20665a.c();
        try {
            this.f20834b.f20667c.e(this.f20833a);
            this.f20834b.f20665a.p();
            return tl.l.f28297a;
        } finally {
            this.f20834b.f20665a.l();
        }
    }
}
