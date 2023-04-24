package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class g7 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ rg.q f21030a;

    /* renamed from: b */
    public final /* synthetic */ h7 f21031b;

    public g7(h7 h7Var, rg.q qVar) {
        this.f21031b = h7Var;
        this.f21030a = qVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21031b.f21063a.c();
        try {
            this.f21031b.f21065c.e(this.f21030a);
            this.f21031b.f21063a.p();
            return tl.l.f28297a;
        } finally {
            this.f21031b.f21063a.l();
        }
    }
}
