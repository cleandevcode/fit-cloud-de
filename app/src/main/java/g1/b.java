package g1;

import a1.g;
import z0.f;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ bk.m f14804a;

    /* renamed from: b */
    public final /* synthetic */ int f14805b;

    public b(bk.m mVar, int i10) {
        this.f14804a = mVar;
        this.f14805b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bk.m mVar = this.f14804a;
        int i10 = this.f14805b;
        f.e eVar = ((g.a) mVar).f223c;
        if (eVar != null) {
            eVar.c(i10);
        }
    }
}
