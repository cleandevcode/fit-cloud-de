package z7;

import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: classes.dex */
public abstract class a extends u4.c {

    /* renamed from: b */
    public s7.a f32012b;

    /* renamed from: c */
    public a8.e f32013c;

    /* renamed from: d */
    public Paint f32014d;

    /* renamed from: e */
    public Paint f32015e;

    /* renamed from: f */
    public Paint f32016f;

    /* renamed from: g */
    public Paint f32017g;

    public a(a8.g gVar, a8.e eVar, s7.a aVar) {
        super(gVar);
        this.f32013c = eVar;
        this.f32012b = aVar;
        if (gVar != null) {
            this.f32015e = new Paint(1);
            Paint paint = new Paint();
            this.f32014d = paint;
            paint.setColor(-7829368);
            this.f32014d.setStrokeWidth(1.0f);
            this.f32014d.setStyle(Paint.Style.STROKE);
            this.f32014d.setAlpha(90);
            Paint paint2 = new Paint();
            this.f32016f = paint2;
            paint2.setColor(-16777216);
            this.f32016f.setStrokeWidth(1.0f);
            this.f32016f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint(1);
            this.f32017g = paint3;
            paint3.setStyle(Paint.Style.STROKE);
        }
    }

    public void d(float f10, float f11) {
        a8.g gVar = (a8.g) this.f28477a;
        if (gVar != null && gVar.a() > 10.0f && !((a8.g) this.f28477a).c()) {
            a8.e eVar = this.f32013c;
            RectF rectF = ((a8.g) this.f28477a).f397b;
            a8.b b10 = eVar.b(rectF.left, rectF.top);
            a8.e eVar2 = this.f32013c;
            RectF rectF2 = ((a8.g) this.f28477a).f397b;
            a8.b b11 = eVar2.b(rectF2.left, rectF2.bottom);
            a8.b.c(b10);
            a8.b.c(b11);
            f10 = (float) b11.f368c;
            f11 = (float) b10.f368c;
        }
        e(f10, f11);
    }

    public void e(float f10, float f11) {
        double ceil;
        double floor;
        long j10;
        int i10;
        int i11;
        float f12 = f10;
        int i12 = this.f32012b.f26643n;
        double abs = Math.abs(f11 - f12);
        if (i12 != 0 && abs > 0.0d && !Double.isInfinite(abs)) {
            double e10 = a8.f.e(abs / i12);
            this.f32012b.getClass();
            double e11 = a8.f.e(Math.pow(10.0d, (int) Math.log10(e10)));
            if (((int) (e10 / e11)) > 5) {
                e10 = Math.floor(e11 * 10.0d);
            }
            this.f32012b.getClass();
            s7.a aVar = this.f32012b;
            if (aVar.f26644o) {
                e10 = ((float) abs) / (i12 - 1);
                aVar.f26641l = i12;
                if (aVar.f26640k.length < i12) {
                    aVar.f26640k = new float[i12];
                }
                for (int i13 = 0; i13 < i12; i13++) {
                    this.f32012b.f26640k[i13] = f12;
                    f12 = (float) (f12 + e10);
                }
            } else {
                int i14 = (e10 > 0.0d ? 1 : (e10 == 0.0d ? 0 : -1));
                if (i14 == 0) {
                    ceil = 0.0d;
                } else {
                    ceil = Math.ceil(f12 / e10) * e10;
                }
                this.f32012b.getClass();
                if (i14 == 0) {
                    floor = 0.0d;
                } else {
                    floor = Math.floor(f11 / e10) * e10;
                    if (floor != Double.POSITIVE_INFINITY) {
                        double d10 = floor + 0.0d;
                        long doubleToRawLongBits = Double.doubleToRawLongBits(d10);
                        if (d10 >= 0.0d) {
                            j10 = 1;
                        } else {
                            j10 = -1;
                        }
                        floor = Double.longBitsToDouble(doubleToRawLongBits + j10);
                    }
                }
                if (i14 != 0) {
                    i10 = 0;
                    for (double d11 = ceil; d11 <= floor; d11 += e10) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                s7.a aVar2 = this.f32012b;
                aVar2.f26641l = i10;
                if (aVar2.f26640k.length < i10) {
                    aVar2.f26640k = new float[i10];
                }
                for (int i15 = 0; i15 < i10; i15++) {
                    if (ceil == 0.0d) {
                        ceil = 0.0d;
                    }
                    this.f32012b.f26640k[i15] = (float) ceil;
                    ceil += e10;
                }
            }
            int i16 = (e10 > 1.0d ? 1 : (e10 == 1.0d ? 0 : -1));
            s7.a aVar3 = this.f32012b;
            if (i16 < 0) {
                i11 = (int) Math.ceil(-Math.log10(e10));
            } else {
                i11 = 0;
            }
            aVar3.f26642m = i11;
            this.f32012b.getClass();
            return;
        }
        s7.a aVar4 = this.f32012b;
        aVar4.f26640k = new float[0];
        aVar4.f26641l = 0;
    }
}
