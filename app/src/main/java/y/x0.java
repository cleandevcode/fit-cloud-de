package y;

import a0.d2;
import android.media.ImageReader;

/* loaded from: classes.dex */
public final class x0 extends b {

    /* renamed from: d */
    public volatile d2 f30790d;

    public x0(ImageReader imageReader) {
        super(imageReader);
        this.f30790d = null;
    }

    public final e1 a(androidx.camera.core.a aVar) {
        d2 d2Var;
        f fVar = aVar.f1614c;
        if (this.f30790d != null) {
            d2Var = this.f30790d;
        } else {
            d2Var = fVar.f30695a;
        }
        return new e1(aVar, null, s0.e(d2Var, fVar.f30696b, fVar.f30697c, fVar.f30698d));
    }

    @Override // y.b, a0.c1
    public final androidx.camera.core.j g() {
        return a((androidx.camera.core.a) super.l());
    }

    @Override // y.b, a0.c1
    public final androidx.camera.core.j l() {
        return a((androidx.camera.core.a) super.l());
    }
}
