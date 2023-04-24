package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class m implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ rg.c f21272a;

    /* renamed from: b */
    public final /* synthetic */ i0 f21273b;

    public m(i0 i0Var, rg.c cVar) {
        this.f21273b = i0Var;
        this.f21272a = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21273b.f21100a.c();
        try {
            this.f21273b.f21103d.e(this.f21272a);
            this.f21273b.f21100a.p();
            return tl.l.f28297a;
        } finally {
            this.f21273b.f21100a.l();
        }
    }
}
