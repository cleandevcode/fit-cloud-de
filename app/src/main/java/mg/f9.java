package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class f9 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ pg.i f21005a;

    /* renamed from: b */
    public final /* synthetic */ e9 f21006b;

    public f9(e9 e9Var, pg.i iVar) {
        this.f21006b = e9Var;
        this.f21005a = iVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21006b.f20969b.c();
        try {
            this.f21006b.f20970c.e(this.f21005a);
            this.f21006b.f20969b.p();
            return tl.l.f28297a;
        } finally {
            this.f21006b.f20969b.l();
        }
    }
}
