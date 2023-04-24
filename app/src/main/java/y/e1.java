package y;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class e1 extends androidx.camera.core.d {

    /* renamed from: d */
    public final Object f30690d;

    /* renamed from: e */
    public final o0 f30691e;

    /* renamed from: f */
    public Rect f30692f;

    /* renamed from: g */
    public final int f30693g;

    /* renamed from: h */
    public final int f30694h;

    public e1(androidx.camera.core.j jVar, Size size, o0 o0Var) {
        super(jVar);
        int height;
        this.f30690d = new Object();
        if (size == null) {
            this.f30693g = super.f();
            height = super.c();
        } else {
            this.f30693g = size.getWidth();
            height = size.getHeight();
        }
        this.f30694h = height;
        this.f30691e = o0Var;
    }

    public final void b(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.f30693g, this.f30694h)) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f30690d) {
            this.f30692f = rect;
        }
    }

    @Override // androidx.camera.core.d, androidx.camera.core.j
    public final int c() {
        return this.f30694h;
    }

    @Override // androidx.camera.core.d, androidx.camera.core.j
    public final o0 d0() {
        return this.f30691e;
    }

    @Override // androidx.camera.core.d, androidx.camera.core.j
    public final int f() {
        return this.f30693g;
    }

    @Override // androidx.camera.core.d, androidx.camera.core.j
    public final Rect z() {
        synchronized (this.f30690d) {
            if (this.f30692f == null) {
                return new Rect(0, 0, this.f30693g, this.f30694h);
            }
            return new Rect(this.f30692f);
        }
    }
}
