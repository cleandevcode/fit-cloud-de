package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class k3 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ pg.g f21191a;

    /* renamed from: b */
    public final /* synthetic */ j3 f21192b;

    public k3(j3 j3Var, pg.g gVar) {
        this.f21192b = j3Var;
        this.f21191a = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21192b.f21158b.c();
        try {
            this.f21192b.f21159c.e(this.f21191a);
            this.f21192b.f21158b.p();
            return tl.l.f28297a;
        } finally {
            this.f21192b.f21158b.l();
        }
    }
}
