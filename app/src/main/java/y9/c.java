package y9;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.d f31246a;

    public c(com.google.android.material.floatingactionbutton.d dVar) {
        this.f31246a = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        com.google.android.material.floatingactionbutton.d dVar = this.f31246a;
        float rotation = dVar.f6596v.getRotation();
        if (dVar.f6589o != rotation) {
            dVar.f6589o = rotation;
            dVar.p();
            return true;
        }
        return true;
    }
}
