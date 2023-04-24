package a8;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public class e {

    /* renamed from: c */
    public g f382c;

    /* renamed from: a */
    public Matrix f380a = new Matrix();

    /* renamed from: b */
    public Matrix f381b = new Matrix();

    /* renamed from: d */
    public float[] f383d = new float[1];

    /* renamed from: e */
    public Matrix f384e = new Matrix();

    /* renamed from: f */
    public float[] f385f = new float[2];

    /* renamed from: g */
    public Matrix f386g = new Matrix();

    public e(g gVar) {
        new Matrix();
        this.f382c = gVar;
    }

    public final b a(float f10, float f11) {
        float[] fArr = this.f385f;
        fArr[0] = f10;
        fArr[1] = f11;
        f(fArr);
        float[] fArr2 = this.f385f;
        return b.b(fArr2[0], fArr2[1]);
    }

    public final b b(float f10, float f11) {
        b b10 = b.b(0.0d, 0.0d);
        c(f10, f11, b10);
        return b10;
    }

    public final void c(float f10, float f11, b bVar) {
        float[] fArr = this.f385f;
        fArr[0] = f10;
        fArr[1] = f11;
        e(fArr);
        float[] fArr2 = this.f385f;
        bVar.f367b = fArr2[0];
        bVar.f368c = fArr2[1];
    }

    public final void d(Path path) {
        path.transform(this.f380a);
        path.transform(this.f382c.f396a);
        path.transform(this.f381b);
    }

    public final void e(float[] fArr) {
        Matrix matrix = this.f384e;
        matrix.reset();
        this.f381b.invert(matrix);
        matrix.mapPoints(fArr);
        this.f382c.f396a.invert(matrix);
        matrix.mapPoints(fArr);
        this.f380a.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public final void f(float[] fArr) {
        this.f380a.mapPoints(fArr);
        this.f382c.f396a.mapPoints(fArr);
        this.f381b.mapPoints(fArr);
    }

    public void g() {
        this.f381b.reset();
        Matrix matrix = this.f381b;
        g gVar = this.f382c;
        matrix.postTranslate(gVar.f397b.left, gVar.f399d - gVar.k());
    }

    public final void h(float f10, float f11, float f12, float f13) {
        float a10 = this.f382c.a() / f11;
        float height = this.f382c.f397b.height() / f12;
        if (Float.isInfinite(a10)) {
            a10 = 0.0f;
        }
        if (Float.isInfinite(height)) {
            height = 0.0f;
        }
        this.f380a.reset();
        this.f380a.postTranslate(-f10, -f13);
        this.f380a.postScale(a10, -height);
    }
}
