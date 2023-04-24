package j0;

import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import b0.p;
import p0.c;
import s.n2;
import y.h1;

/* loaded from: classes.dex */
public final class f implements h1 {

    /* renamed from: a */
    public final Object f17244a = new Object();

    /* renamed from: b */
    public final int f17245b;

    /* renamed from: c */
    public final c.d f17246c;

    /* renamed from: d */
    public c.a<Void> f17247d;

    public f(int i10, Size size, Rect rect, int i11, boolean z10) {
        boolean z11;
        Size size2;
        float[] fArr = new float[16];
        Rect rect2 = new Rect(rect);
        if (i10 == 2) {
            this.f17245b = i11;
            Matrix.setIdentityM(fArr, 0);
            Matrix.translateM(fArr, 0, 0.0f, 1.0f, 0.0f);
            Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
            Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
            Matrix.rotateM(fArr, 0, i11, 0.0f, 0.0f, 1.0f);
            Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
            if (z10) {
                Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
            RectF rectF = p.f3976a;
            if (i11 % 90 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            s.h1.e("Invalid rotation degrees: " + i11, z11);
            if (p.b(((i11 % 360) + 360) % 360)) {
                size2 = new Size(size.getHeight(), size.getWidth());
            } else {
                size2 = size;
            }
            float f10 = 0;
            android.graphics.Matrix a10 = p.a(i11, new RectF(f10, f10, size.getWidth() + 0, size.getHeight() + 0), new RectF(f10, f10, size2.getWidth() + 0, size2.getHeight() + 0), z10);
            RectF rectF2 = new RectF(rect2);
            a10.mapRect(rectF2);
            Matrix.translateM(fArr, 0, rectF2.left / size2.getWidth(), ((size2.getHeight() - rectF2.height()) - rectF2.top) / size2.getHeight(), 0.0f);
            Matrix.scaleM(fArr, 0, rectF2.width() / size2.getWidth(), rectF2.height() / size2.getHeight(), 1.0f);
        } else {
            this.f17245b = 0;
        }
        this.f17246c = p0.c.a(new n2(1, this));
    }

    @Override // y.h1
    public final int c() {
        return this.f17245b;
    }
}
