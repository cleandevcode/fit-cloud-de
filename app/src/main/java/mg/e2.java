package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class e2 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ rg.h f20954a;

    /* renamed from: b */
    public final /* synthetic */ a3 f20955b;

    public e2(a3 a3Var, rg.h hVar) {
        this.f20955b = a3Var;
        this.f20954a = hVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f20955b.f20650a.c();
        try {
            this.f20955b.f20653d.e(this.f20954a);
            this.f20955b.f20650a.p();
            return tl.l.f28297a;
        } finally {
            this.f20955b.f20650a.l();
        }
    }
}
