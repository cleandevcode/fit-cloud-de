package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class l implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ rg.b f21209a;

    /* renamed from: b */
    public final /* synthetic */ i0 f21210b;

    public l(i0 i0Var, rg.b bVar) {
        this.f21210b = i0Var;
        this.f21209a = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21210b.f21100a.c();
        try {
            this.f21210b.f21102c.e(this.f21209a);
            this.f21210b.f21100a.p();
            return tl.l.f28297a;
        } finally {
            this.f21210b.f21100a.l();
        }
    }
}
