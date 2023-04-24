package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class w0 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ pg.b f21569a;

    /* renamed from: b */
    public final /* synthetic */ a1 f21570b;

    public w0(a1 a1Var, pg.b bVar) {
        this.f21570b = a1Var;
        this.f21569a = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21570b.f20636a.c();
        try {
            this.f21570b.f20637b.e(this.f21569a);
            this.f21570b.f20636a.p();
            return tl.l.f28297a;
        } finally {
            this.f21570b.f20636a.l();
        }
    }
}
