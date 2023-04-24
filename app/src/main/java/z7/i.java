package z7;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i extends a {

    /* renamed from: h */
    public s7.i f32052h;

    /* renamed from: i */
    public Path f32053i;

    /* renamed from: j */
    public float[] f32054j;

    /* renamed from: k */
    public RectF f32055k;

    /* renamed from: l */
    public float[] f32056l;

    /* renamed from: m */
    public RectF f32057m;

    /* renamed from: n */
    public float[] f32058n;

    /* renamed from: o */
    public Path f32059o;

    public i(a8.g gVar, s7.i iVar, a8.e eVar) {
        super(gVar, eVar, iVar);
        this.f32053i = new Path();
        this.f32054j = new float[2];
        this.f32055k = new RectF();
        this.f32056l = new float[2];
        this.f32057m = new RectF();
        this.f32058n = new float[4];
        this.f32059o = new Path();
        this.f32052h = iVar;
        this.f32015e.setColor(-16777216);
        this.f32015e.setTextAlign(Paint.Align.CENTER);
        this.f32015e.setTextSize(a8.f.c(10.0f));
    }

    @Override // z7.a
    public void d(float f10, float f11) {
        if (((a8.g) this.f28477a).a() > 10.0f && !((a8.g) this.f28477a).b()) {
            a8.e eVar = this.f32013c;
            RectF rectF = ((a8.g) this.f28477a).f397b;
            a8.b b10 = eVar.b(rectF.left, rectF.top);
            a8.e eVar2 = this.f32013c;
            RectF rectF2 = ((a8.g) this.f28477a).f397b;
            a8.b b11 = eVar2.b(rectF2.right, rectF2.top);
            a8.b.c(b10);
            a8.b.c(b11);
            f10 = (float) b10.f367b;
            f11 = (float) b11.f367b;
        }
        e(f10, f11);
    }

    @Override // z7.a
    public void e(float f10, float f11) {
        super.e(f10, f11);
        f();
    }

    public void f() {
        String c10 = this.f32052h.c();
        Paint paint = this.f32015e;
        this.f32052h.getClass();
        paint.setTypeface(null);
        this.f32015e.setTextSize(this.f32052h.f26659d);
        a8.a b10 = a8.f.b(this.f32015e, c10);
        float f10 = b10.f364b;
        float a10 = a8.f.a(this.f32015e, "Q");
        this.f32052h.getClass();
        a8.a d10 = a8.f.d(f10, a10);
        s7.i iVar = this.f32052h;
        Math.round(f10);
        iVar.getClass();
        s7.i iVar2 = this.f32052h;
        Math.round(a10);
        iVar2.getClass();
        s7.i iVar3 = this.f32052h;
        Math.round(d10.f364b);
        iVar3.getClass();
        this.f32052h.B = Math.round(d10.f365c);
        a8.a.f363d.c(d10);
        a8.a.f363d.c(b10);
    }

    public void g(Canvas canvas, float f10, float f11, Path path) {
        path.moveTo(f10, ((a8.g) this.f28477a).f397b.bottom);
        path.lineTo(f10, ((a8.g) this.f28477a).f397b.top);
        canvas.drawPath(path, this.f32014d);
        path.reset();
    }

    public final void h(Canvas canvas, String str, float f10, float f11, a8.c cVar) {
        Paint paint = this.f32015e;
        float fontMetrics = paint.getFontMetrics(a8.f.f395i);
        paint.getTextBounds(str, 0, str.length(), a8.f.f394h);
        float f12 = 0.0f - a8.f.f394h.left;
        float f13 = (-a8.f.f395i.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (cVar.f370b != 0.0f || cVar.f371c != 0.0f) {
            f12 -= a8.f.f394h.width() * cVar.f370b;
            f13 -= fontMetrics * cVar.f371c;
        }
        canvas.drawText(str, f12 + f10, f13 + f11, paint);
        paint.setTextAlign(textAlign);
    }

    public void i(Canvas canvas, float f10, a8.c cVar) {
        this.f32052h.getClass();
        this.f32052h.getClass();
        int i10 = this.f32052h.f26641l * 2;
        float[] fArr = new float[i10];
        for (int i11 = 0; i11 < i10; i11 += 2) {
            fArr[i11] = this.f32052h.f26640k[i11 / 2];
        }
        this.f32013c.f(fArr);
        for (int i12 = 0; i12 < i10; i12 += 2) {
            float f11 = fArr[i12];
            if (((a8.g) this.f28477a).h(f11)) {
                String a10 = this.f32052h.d().a(this.f32052h.f26640k[i12 / 2]);
                this.f32052h.getClass();
                h(canvas, a10, f11, f10, cVar);
            }
        }
    }

    public RectF j() {
        this.f32055k.set(((a8.g) this.f28477a).f397b);
        this.f32055k.inset(-this.f32012b.f26637h, 0.0f);
        return this.f32055k;
    }

    public void k(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        s7.i iVar = this.f32052h;
        if (iVar.f26656a && iVar.f26647r) {
            float f13 = iVar.f26658c;
            this.f32015e.setTypeface(null);
            this.f32015e.setTextSize(this.f32052h.f26659d);
            this.f32015e.setColor(this.f32052h.f26660e);
            a8.c b10 = a8.c.b(0.0f, 0.0f);
            s7.i iVar2 = this.f32052h;
            int i10 = iVar2.C;
            if (i10 == 1) {
                b10.f370b = 0.5f;
                b10.f371c = 1.0f;
                f10 = ((a8.g) this.f28477a).f397b.top;
            } else {
                if (i10 == 4) {
                    b10.f370b = 0.5f;
                    b10.f371c = 1.0f;
                    f11 = ((a8.g) this.f28477a).f397b.top + f13;
                    f13 = iVar2.B;
                } else {
                    if (i10 != 2) {
                        b10.f370b = 0.5f;
                        if (i10 == 5) {
                            b10.f371c = 0.0f;
                            f10 = ((a8.g) this.f28477a).f397b.bottom - f13;
                            f13 = iVar2.B;
                        } else {
                            b10.f371c = 1.0f;
                            i(canvas, ((a8.g) this.f28477a).f397b.top - f13, b10);
                        }
                    }
                    b10.f370b = 0.5f;
                    b10.f371c = 0.0f;
                    f11 = ((a8.g) this.f28477a).f397b.bottom;
                }
                f12 = f11 + f13;
                i(canvas, f12, b10);
                a8.c.d(b10);
            }
            f12 = f10 - f13;
            i(canvas, f12, b10);
            a8.c.d(b10);
        }
    }

    public void l(Canvas canvas) {
        s7.i iVar = this.f32052h;
        if (iVar.f26646q && iVar.f26656a) {
            this.f32016f.setColor(iVar.f26638i);
            this.f32016f.setStrokeWidth(this.f32052h.f26639j);
            Paint paint = this.f32016f;
            this.f32052h.getClass();
            paint.setPathEffect(null);
            int i10 = this.f32052h.C;
            if (i10 == 1 || i10 == 4 || i10 == 3) {
                RectF rectF = ((a8.g) this.f28477a).f397b;
                float f10 = rectF.left;
                float f11 = rectF.top;
                canvas.drawLine(f10, f11, rectF.right, f11, this.f32016f);
            }
            int i11 = this.f32052h.C;
            if (i11 == 2 || i11 == 5 || i11 == 3) {
                RectF rectF2 = ((a8.g) this.f28477a).f397b;
                float f12 = rectF2.left;
                float f13 = rectF2.bottom;
                canvas.drawLine(f12, f13, rectF2.right, f13, this.f32016f);
            }
        }
    }

    public final void m(Canvas canvas) {
        s7.i iVar = this.f32052h;
        if (iVar.f26645p && iVar.f26656a) {
            int save = canvas.save();
            canvas.clipRect(j());
            if (this.f32054j.length != this.f32012b.f26641l * 2) {
                this.f32054j = new float[this.f32052h.f26641l * 2];
            }
            float[] fArr = this.f32054j;
            for (int i10 = 0; i10 < fArr.length; i10 += 2) {
                float[] fArr2 = this.f32052h.f26640k;
                int i11 = i10 / 2;
                fArr[i10] = fArr2[i11];
                fArr[i10 + 1] = fArr2[i11];
            }
            this.f32013c.f(fArr);
            this.f32014d.setColor(this.f32052h.f26636g);
            this.f32014d.setStrokeWidth(this.f32052h.f26637h);
            Paint paint = this.f32014d;
            this.f32052h.getClass();
            paint.setPathEffect(null);
            Path path = this.f32053i;
            path.reset();
            for (int i12 = 0; i12 < fArr.length; i12 += 2) {
                g(canvas, fArr[i12], fArr[i12 + 1], path);
            }
            canvas.restoreToCount(save);
        }
    }

    public void n(Canvas canvas) {
        ArrayList arrayList = this.f32052h.f26648s;
        if (arrayList != null && arrayList.size() > 0) {
            float[] fArr = this.f32056l;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((s7.g) arrayList.get(i10)).f26656a) {
                    int save = canvas.save();
                    this.f32057m.set(((a8.g) this.f28477a).f397b);
                    this.f32057m.inset(-0.0f, 0.0f);
                    canvas.clipRect(this.f32057m);
                    fArr[0] = 0.0f;
                    fArr[1] = 0.0f;
                    this.f32013c.f(fArr);
                    float[] fArr2 = this.f32058n;
                    fArr2[0] = fArr[0];
                    RectF rectF = ((a8.g) this.f28477a).f397b;
                    fArr2[1] = rectF.top;
                    fArr2[2] = fArr[0];
                    fArr2[3] = rectF.bottom;
                    this.f32059o.reset();
                    Path path = this.f32059o;
                    float[] fArr3 = this.f32058n;
                    path.moveTo(fArr3[0], fArr3[1]);
                    Path path2 = this.f32059o;
                    float[] fArr4 = this.f32058n;
                    path2.lineTo(fArr4[2], fArr4[3]);
                    this.f32017g.setStyle(Paint.Style.STROKE);
                    this.f32017g.setColor(0);
                    this.f32017g.setStrokeWidth(0.0f);
                    this.f32017g.setPathEffect(null);
                    canvas.drawPath(this.f32059o, this.f32017g);
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
