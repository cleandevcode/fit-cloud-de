package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class a4 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ rg.j f20659a;

    /* renamed from: b */
    public final /* synthetic */ x4 f20660b;

    public a4(x4 x4Var, rg.j jVar) {
        this.f20660b = x4Var;
        this.f20659a = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f20660b.f21662a.c();
        try {
            this.f20660b.f21664c.e(this.f20659a);
            this.f20660b.f21662a.p();
            return tl.l.f28297a;
        } finally {
            this.f20660b.f21662a.l();
        }
    }
}
