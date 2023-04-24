package a0;

import android.util.Size;
import android.view.Surface;

/* loaded from: classes.dex */
public final class d1 extends m0 {

    /* renamed from: m */
    public final Surface f44m;

    public d1(Surface surface) {
        this.f44m = surface;
    }

    public d1(Surface surface, Size size, int i10) {
        super(i10, size);
        this.f44m = surface;
    }

    @Override // a0.m0
    public final na.a<Surface> g() {
        return d0.f.e(this.f44m);
    }
}
