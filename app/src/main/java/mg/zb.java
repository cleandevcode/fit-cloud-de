package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zb implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ pg.m[] f21796a;

    /* renamed from: b */
    public final /* synthetic */ sb f21797b;

    public zb(sb sbVar, pg.m[] mVarArr) {
        this.f21797b = sbVar;
        this.f21796a = mVarArr;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21797b.f21452a.c();
        try {
            this.f21797b.f21453b.g(this.f21796a);
            this.f21797b.f21452a.p();
            return tl.l.f28297a;
        } finally {
            this.f21797b.f21452a.l();
        }
    }
}
