package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class p9 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ rg.u f21360a;

    /* renamed from: b */
    public final /* synthetic */ la f21361b;

    public p9(la laVar, rg.u uVar) {
        this.f21361b = laVar;
        this.f21360a = uVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21361b.f21260a.c();
        try {
            this.f21361b.f21263d.e(this.f21360a);
            this.f21361b.f21260a.p();
            return tl.l.f28297a;
        } finally {
            this.f21361b.f21260a.l();
        }
    }
}
