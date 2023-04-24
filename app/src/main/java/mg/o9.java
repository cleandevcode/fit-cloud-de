package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class o9 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ rg.t f21342a;

    /* renamed from: b */
    public final /* synthetic */ la f21343b;

    public o9(la laVar, rg.t tVar) {
        this.f21343b = laVar;
        this.f21342a = tVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21343b.f21260a.c();
        try {
            this.f21343b.f21262c.e(this.f21342a);
            this.f21343b.f21260a.p();
            return tl.l.f28297a;
        } finally {
            this.f21343b.f21260a.l();
        }
    }
}
