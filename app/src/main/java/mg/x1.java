package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class x1 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ rg.d f21652a;

    /* renamed from: b */
    public final /* synthetic */ w1 f21653b;

    public x1(w1 w1Var, rg.d dVar) {
        this.f21653b = w1Var;
        this.f21652a = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21653b.f21571a.c();
        try {
            this.f21653b.f21573c.e(this.f21652a);
            this.f21653b.f21571a.p();
            return tl.l.f28297a;
        } finally {
            this.f21653b.f21571a.l();
        }
    }
}
