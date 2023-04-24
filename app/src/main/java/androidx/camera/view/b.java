package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.view.PreviewView;
import b0.p;
import s.h1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public Size f1880a;

    /* renamed from: b */
    public Rect f1881b;

    /* renamed from: c */
    public int f1882c;

    /* renamed from: d */
    public int f1883d;

    /* renamed from: e */
    public boolean f1884e;

    /* renamed from: f */
    public PreviewView.f f1885f = PreviewView.f.FILL_CENTER;

    public final void a(int i10, Size size) {
        if (f()) {
            Matrix matrix = new Matrix();
            c(i10, size).invert(matrix);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(new RectF(0.0f, 0.0f, this.f1880a.getWidth(), this.f1880a.getHeight()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
            matrix.postConcat(matrix2);
        }
    }

    public final Size b() {
        return p.b(this.f1882c) ? new Size(this.f1881b.height(), this.f1881b.width()) : new Size(this.f1881b.width(), this.f1881b.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Matrix c(int r10, android.util.Size r11) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.b.c(int, android.util.Size):android.graphics.Matrix");
    }

    public final Matrix d() {
        h1.k(null, f());
        RectF rectF = new RectF(0.0f, 0.0f, this.f1880a.getWidth(), this.f1880a.getHeight());
        return p.a(-b0.c.u(this.f1883d), rectF, rectF, false);
    }

    public final RectF e(int i10, Size size) {
        h1.k(null, f());
        Matrix c10 = c(i10, size);
        RectF rectF = new RectF(0.0f, 0.0f, this.f1880a.getWidth(), this.f1880a.getHeight());
        c10.mapRect(rectF);
        return rectF;
    }

    public final boolean f() {
        return (this.f1881b == null || this.f1880a == null || this.f1883d == -1) ? false : true;
    }
}
