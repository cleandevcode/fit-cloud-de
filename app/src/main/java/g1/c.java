package g1;

import a1.g;
import android.graphics.Typeface;
import android.os.Handler;
import g1.k;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final bk.m f14806a;

    /* renamed from: b */
    public final Handler f14807b;

    public c(g.a aVar, Handler handler) {
        this.f14806a = aVar;
        this.f14807b = handler;
    }

    public final void a(k.a aVar) {
        boolean z10;
        int i10 = aVar.f14829b;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Typeface typeface = aVar.f14828a;
            this.f14807b.post(new a(this.f14806a, typeface));
            return;
        }
        this.f14807b.post(new b(this.f14806a, i10));
    }
}
