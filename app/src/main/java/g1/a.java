package g1;

import a1.g;
import android.graphics.Typeface;
import z0.f;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ bk.m f14802a;

    /* renamed from: b */
    public final /* synthetic */ Typeface f14803b;

    public a(bk.m mVar, Typeface typeface) {
        this.f14802a = mVar;
        this.f14803b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bk.m mVar = this.f14802a;
        Typeface typeface = this.f14803b;
        f.e eVar = ((g.a) mVar).f223c;
        if (eVar != null) {
            eVar.d(typeface);
        }
    }
}
