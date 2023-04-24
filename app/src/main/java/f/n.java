package f;

import android.view.View;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public final class n extends com.bumptech.glide.manager.g {

    /* renamed from: a */
    public final /* synthetic */ j f13958a;

    public n(j jVar) {
        this.f13958a = jVar;
    }

    @Override // com.bumptech.glide.manager.g, k1.j2
    public final void c() {
        this.f13958a.f13909p.setVisibility(0);
        if (this.f13958a.f13909p.getParent() instanceof View) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.h.c((View) this.f13958a.f13909p.getParent());
        }
    }

    @Override // k1.j2
    public final void e() {
        this.f13958a.f13909p.setAlpha(1.0f);
        this.f13958a.f13912s.d(null);
        this.f13958a.f13912s = null;
    }
}
