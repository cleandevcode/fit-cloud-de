package androidx.camera.core;

import a0.c1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageReader;
import android.media.ImageWriter;
import android.os.Build;
import androidx.camera.core.e;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import y.u0;

/* loaded from: classes.dex */
public abstract class f implements c1.a {

    /* renamed from: a */
    public e.a f1631a;

    /* renamed from: b */
    public volatile int f1632b;

    /* renamed from: c */
    public volatile int f1633c;

    /* renamed from: e */
    public volatile boolean f1635e;

    /* renamed from: f */
    public volatile boolean f1636f;

    /* renamed from: g */
    public Executor f1637g;

    /* renamed from: h */
    public o f1638h;

    /* renamed from: i */
    public ImageWriter f1639i;

    /* renamed from: n */
    public ByteBuffer f1644n;

    /* renamed from: o */
    public ByteBuffer f1645o;

    /* renamed from: p */
    public ByteBuffer f1646p;

    /* renamed from: q */
    public ByteBuffer f1647q;

    /* renamed from: d */
    public volatile int f1634d = 1;

    /* renamed from: j */
    public Rect f1640j = new Rect();

    /* renamed from: k */
    public Rect f1641k = new Rect();

    /* renamed from: l */
    public Matrix f1642l = new Matrix();

    /* renamed from: m */
    public Matrix f1643m = new Matrix();

    /* renamed from: r */
    public final Object f1648r = new Object();

    /* renamed from: s */
    public boolean f1649s = true;

    @Override // a0.c1.a
    public final void a(c1 c1Var) {
        try {
            j b10 = b(c1Var);
            if (b10 != null) {
                f(b10);
            }
        } catch (IllegalStateException e10) {
            u0.c("ImageAnalysisAnalyzer", "Failed to acquire image.", e10);
        }
    }

    public abstract j b(c1 c1Var);

    /* JADX WARN: Removed duplicated region for block: B:107:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final na.a<java.lang.Void> c(final androidx.camera.core.j r15) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.f.c(androidx.camera.core.j):na.a");
    }

    public abstract void d();

    public final void e(j jVar) {
        if (this.f1634d != 1) {
            if (this.f1634d == 2 && this.f1644n == null) {
                this.f1644n = ByteBuffer.allocateDirect(jVar.c() * jVar.f() * 4);
                return;
            }
            return;
        }
        if (this.f1645o == null) {
            this.f1645o = ByteBuffer.allocateDirect(jVar.c() * jVar.f());
        }
        this.f1645o.position(0);
        if (this.f1646p == null) {
            this.f1646p = ByteBuffer.allocateDirect((jVar.c() * jVar.f()) / 4);
        }
        this.f1646p.position(0);
        if (this.f1647q == null) {
            this.f1647q = ByteBuffer.allocateDirect((jVar.c() * jVar.f()) / 4);
        }
        this.f1647q.position(0);
    }

    public abstract void f(j jVar);

    public final void g(int i10, int i11, int i12, int i13) {
        int i14 = this.f1632b;
        Matrix matrix = new Matrix();
        if (i14 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i10, i11);
            RectF rectF2 = b0.p.f3976a;
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i14);
            RectF rectF3 = new RectF(0.0f, 0.0f, i12, i13);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f1640j);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f1641k = rect;
        this.f1643m.setConcat(this.f1642l, matrix);
    }

    public final void h(j jVar, int i10) {
        boolean z10;
        int i11;
        o oVar = this.f1638h;
        if (oVar == null) {
            return;
        }
        oVar.a();
        int f10 = jVar.f();
        int c10 = jVar.c();
        int h10 = this.f1638h.h();
        int k10 = this.f1638h.k();
        if (i10 != 90 && i10 != 270) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i11 = c10;
        } else {
            i11 = f10;
        }
        if (!z10) {
            f10 = c10;
        }
        this.f1638h = new o(new y.b(ImageReader.newInstance(i11, f10, h10, k10)));
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23 && this.f1634d == 1) {
            ImageWriter imageWriter = this.f1639i;
            if (imageWriter != null) {
                if (i12 >= 23) {
                    f0.b.a(imageWriter);
                } else {
                    throw new RuntimeException(androidx.activity.i.a("Unable to call close() on API ", i12, ". Version 23 or higher required."));
                }
            }
            this.f1639i = f0.a.a(this.f1638h.k(), this.f1638h.getSurface());
        }
    }
}
