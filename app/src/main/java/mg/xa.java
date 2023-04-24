package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class xa implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ pg.d[] f21680a;

    /* renamed from: b */
    public final /* synthetic */ wa f21681b;

    public xa(wa waVar, pg.d[] dVarArr) {
        this.f21681b = waVar;
        this.f21680a = dVarArr;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21681b.f21625a.c();
        try {
            this.f21681b.f21627c.g(this.f21680a);
            this.f21681b.f21625a.p();
            return tl.l.f28297a;
        } finally {
            this.f21681b.f21625a.l();
        }
    }
}
