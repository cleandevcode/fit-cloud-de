package ga;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {
    @Deprecated

    /* renamed from: a */
    public float f15156a;
    @Deprecated

    /* renamed from: b */
    public float f15157b;
    @Deprecated

    /* renamed from: c */
    public float f15158c;
    @Deprecated

    /* renamed from: d */
    public float f15159d;
    @Deprecated

    /* renamed from: e */
    public float f15160e;
    @Deprecated

    /* renamed from: f */
    public float f15161f;

    /* renamed from: g */
    public final ArrayList f15162g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f15163h = new ArrayList();

    /* loaded from: classes.dex */
    public static class a extends f {

        /* renamed from: b */
        public final c f15164b;

        public a(c cVar) {
            this.f15164b = cVar;
        }

        @Override // ga.l.f
        public final void a(Matrix matrix, fa.a aVar, int i10, Canvas canvas) {
            boolean z10;
            c cVar = this.f15164b;
            float f10 = cVar.f15173f;
            float f11 = cVar.f15174g;
            c cVar2 = this.f15164b;
            RectF rectF = new RectF(cVar2.f15169b, cVar2.f15170c, cVar2.f15171d, cVar2.f15172e);
            if (f11 < 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Path path = aVar.f14217g;
            if (z10) {
                int[] iArr = fa.a.f14209k;
                iArr[0] = 0;
                iArr[1] = aVar.f14216f;
                iArr[2] = aVar.f14215e;
                iArr[3] = aVar.f14214d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f10, f11);
                path.close();
                float f12 = -i10;
                rectF.inset(f12, f12);
                int[] iArr2 = fa.a.f14209k;
                iArr2[0] = 0;
                iArr2[1] = aVar.f14214d;
                iArr2[2] = aVar.f14215e;
                iArr2[3] = aVar.f14216f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f13 = 1.0f - (i10 / width);
                float[] fArr = fa.a.f14210l;
                fArr[1] = f13;
                fArr[2] = ((1.0f - f13) / 2.0f) + f13;
                aVar.f14212b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, fa.a.f14209k, fArr, Shader.TileMode.CLAMP));
                canvas.save();
                canvas.concat(matrix);
                canvas.scale(1.0f, rectF.height() / rectF.width());
                if (!z10) {
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                    canvas.drawPath(path, aVar.f14218h);
                }
                canvas.drawArc(rectF, f10, f11, true, aVar.f14212b);
                canvas.restore();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends f {

        /* renamed from: b */
        public final d f15165b;

        /* renamed from: c */
        public final float f15166c;

        /* renamed from: d */
        public final float f15167d;

        public b(d dVar, float f10, float f11) {
            this.f15165b = dVar;
            this.f15166c = f10;
            this.f15167d = f11;
        }

        @Override // ga.l.f
        public final void a(Matrix matrix, fa.a aVar, int i10, Canvas canvas) {
            d dVar = this.f15165b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(dVar.f15176c - this.f15167d, dVar.f15175b - this.f15166c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f15166c, this.f15167d);
            matrix2.preRotate(b());
            aVar.getClass();
            rectF.bottom += i10;
            rectF.offset(0.0f, -i10);
            int[] iArr = fa.a.f14207i;
            iArr[0] = aVar.f14216f;
            iArr[1] = aVar.f14215e;
            iArr[2] = aVar.f14214d;
            Paint paint = aVar.f14213c;
            float f10 = rectF.left;
            paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, fa.a.f14208j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.f14213c);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.f15165b;
            return (float) Math.toDegrees(Math.atan((dVar.f15176c - this.f15167d) / (dVar.f15175b - this.f15166c)));
        }
    }

    /* loaded from: classes.dex */
    public static class c extends e {

        /* renamed from: h */
        public static final RectF f15168h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f15169b;
        @Deprecated

        /* renamed from: c */
        public float f15170c;
        @Deprecated

        /* renamed from: d */
        public float f15171d;
        @Deprecated

        /* renamed from: e */
        public float f15172e;
        @Deprecated

        /* renamed from: f */
        public float f15173f;
        @Deprecated

        /* renamed from: g */
        public float f15174g;

        public c(float f10, float f11, float f12, float f13) {
            this.f15169b = f10;
            this.f15170c = f11;
            this.f15171d = f12;
            this.f15172e = f13;
        }

        @Override // ga.l.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f15177a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f15168h;
            rectF.set(this.f15169b, this.f15170c, this.f15171d, this.f15172e);
            path.arcTo(rectF, this.f15173f, this.f15174g, false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: b */
        public float f15175b;

        /* renamed from: c */
        public float f15176c;

        @Override // ga.l.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f15177a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f15175b, this.f15176c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a */
        public final Matrix f15177a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a */
        public static final Matrix f15178a = new Matrix();

        public abstract void a(Matrix matrix, fa.a aVar, int i10, Canvas canvas);
    }

    public l() {
        e(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z10;
        float f16;
        c cVar = new c(f10, f11, f12, f13);
        cVar.f15173f = f14;
        cVar.f15174g = f15;
        this.f15162g.add(cVar);
        a aVar = new a(cVar);
        float f17 = f14 + f15;
        if (f15 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        if (z10) {
            f16 = (180.0f + f17) % 360.0f;
        } else {
            f16 = f17;
        }
        b(f14);
        this.f15163h.add(aVar);
        this.f15160e = f16;
        double d10 = f17;
        this.f15158c = (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((f10 + f12) * 0.5f);
        this.f15159d = (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((f11 + f13) * 0.5f);
    }

    public final void b(float f10) {
        float f11 = this.f15160e;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f15158c;
        float f14 = this.f15159d;
        c cVar = new c(f13, f14, f13, f14);
        cVar.f15173f = this.f15160e;
        cVar.f15174g = f12;
        this.f15163h.add(new a(cVar));
        this.f15160e = f10;
    }

    public final void c(Matrix matrix, Path path) {
        int size = this.f15162g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f15162g.get(i10)).a(matrix, path);
        }
    }

    public final void d(float f10, float f11) {
        d dVar = new d();
        dVar.f15175b = f10;
        dVar.f15176c = f11;
        this.f15162g.add(dVar);
        b bVar = new b(dVar, this.f15158c, this.f15159d);
        b(bVar.b() + 270.0f);
        this.f15163h.add(bVar);
        this.f15160e = bVar.b() + 270.0f;
        this.f15158c = f10;
        this.f15159d = f11;
    }

    public final void e(float f10, float f11, float f12) {
        this.f15156a = 0.0f;
        this.f15157b = f10;
        this.f15158c = 0.0f;
        this.f15159d = f10;
        this.f15160e = f11;
        this.f15161f = (f11 + f12) % 360.0f;
        this.f15162g.clear();
        this.f15163h.clear();
    }
}
