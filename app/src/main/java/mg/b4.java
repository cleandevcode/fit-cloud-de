package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class b4 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ rg.k f20704a;

    /* renamed from: b */
    public final /* synthetic */ x4 f20705b;

    public b4(x4 x4Var, rg.k kVar) {
        this.f20705b = x4Var;
        this.f20704a = kVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f20705b.f21662a.c();
        try {
            this.f20705b.f21665d.e(this.f20704a);
            this.f20705b.f21662a.p();
            return tl.l.f28297a;
        } finally {
            this.f20705b.f21662a.l();
        }
    }
}
