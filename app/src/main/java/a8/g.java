package a8;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a */
    public final Matrix f396a = new Matrix();

    /* renamed from: b */
    public RectF f397b = new RectF();

    /* renamed from: c */
    public float f398c = 0.0f;

    /* renamed from: d */
    public float f399d = 0.0f;

    /* renamed from: e */
    public float f400e = 1.0f;

    /* renamed from: f */
    public float f401f = Float.MAX_VALUE;

    /* renamed from: g */
    public float f402g = 1.0f;

    /* renamed from: h */
    public float f403h = Float.MAX_VALUE;

    /* renamed from: i */
    public float f404i = 1.0f;

    /* renamed from: j */
    public float f405j = 1.0f;

    /* renamed from: k */
    public float f406k = 0.0f;

    /* renamed from: l */
    public float f407l = 0.0f;

    /* renamed from: m */
    public float f408m = 0.0f;

    /* renamed from: n */
    public Matrix f409n = new Matrix();

    /* renamed from: o */
    public final float[] f410o = new float[9];

    public final float a() {
        return this.f397b.width();
    }

    public final boolean b() {
        float f10 = this.f404i;
        float f11 = this.f402g;
        return f10 <= f11 && f11 <= 1.0f;
    }

    public final boolean c() {
        float f10 = this.f405j;
        float f11 = this.f400e;
        return f10 <= f11 && f11 <= 1.0f;
    }

    public final boolean d(float f10) {
        return this.f397b.bottom >= ((float) ((int) (f10 * 100.0f))) / 100.0f;
    }

    public final boolean e(float f10) {
        return this.f397b.left <= f10 + 1.0f;
    }

    public final boolean f(float f10) {
        return this.f397b.right >= (((float) ((int) (f10 * 100.0f))) / 100.0f) - 1.0f;
    }

    public final boolean g(float f10) {
        return this.f397b.top <= f10;
    }

    public final boolean h(float f10) {
        return e(f10) && f(f10);
    }

    public final boolean i(float f10) {
        return g(f10) && d(f10);
    }

    public final void j(Matrix matrix, RectF rectF) {
        float f10;
        matrix.getValues(this.f410o);
        float[] fArr = this.f410o;
        float f11 = fArr[2];
        float f12 = fArr[0];
        float f13 = fArr[5];
        float f14 = fArr[4];
        this.f404i = Math.min(Math.max(this.f402g, f12), this.f403h);
        this.f405j = Math.min(Math.max(this.f400e, f14), this.f401f);
        float f15 = 0.0f;
        if (rectF != null) {
            f15 = rectF.width();
            f10 = rectF.height();
        } else {
            f10 = 0.0f;
        }
        this.f406k = Math.min(Math.max(f11, ((this.f404i - 1.0f) * (-f15)) - this.f407l), this.f407l);
        float max = Math.max(Math.min(f13, ((this.f405j - 1.0f) * f10) + this.f408m), -this.f408m);
        float[] fArr2 = this.f410o;
        fArr2[2] = this.f406k;
        fArr2[0] = this.f404i;
        fArr2[5] = max;
        fArr2[4] = this.f405j;
        matrix.setValues(fArr2);
    }

    public final float k() {
        return this.f399d - this.f397b.bottom;
    }

    public final void l(Matrix matrix, View view, boolean z10) {
        this.f396a.set(matrix);
        j(this.f396a, this.f397b);
        if (z10) {
            view.invalidate();
        }
        matrix.set(this.f396a);
    }
}
