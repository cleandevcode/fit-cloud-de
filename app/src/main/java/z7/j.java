package z7;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import s7.j;

/* loaded from: classes.dex */
public class j extends a {

    /* renamed from: h */
    public s7.j f32060h;

    /* renamed from: i */
    public Paint f32061i;

    /* renamed from: j */
    public Path f32062j;

    /* renamed from: k */
    public RectF f32063k;

    /* renamed from: l */
    public float[] f32064l;

    /* renamed from: m */
    public Path f32065m;

    /* renamed from: n */
    public float[] f32066n;

    /* renamed from: o */
    public RectF f32067o;

    public j(a8.g gVar, s7.j jVar, a8.e eVar) {
        super(gVar, eVar, jVar);
        this.f32062j = new Path();
        this.f32063k = new RectF();
        this.f32064l = new float[2];
        new Path();
        new RectF();
        this.f32065m = new Path();
        this.f32066n = new float[2];
        this.f32067o = new RectF();
        this.f32060h = jVar;
        if (((a8.g) this.f28477a) != null) {
            this.f32015e.setColor(-16777216);
            this.f32015e.setTextSize(a8.f.c(10.0f));
            Paint paint = new Paint(1);
            this.f32061i = paint;
            paint.setColor(-7829368);
            this.f32061i.setStrokeWidth(1.0f);
            this.f32061i.setStyle(Paint.Style.STROKE);
        }
    }

    public void f(Canvas canvas, float f10, float[] fArr, float f11) {
        s7.j jVar = this.f32060h;
        boolean z10 = jVar.C;
        int i10 = jVar.f26641l;
        if (!z10) {
            i10--;
        }
        for (int i11 = !jVar.B ? 1 : 0; i11 < i10; i11++) {
            canvas.drawText(this.f32060h.b(i11), f10, fArr[(i11 * 2) + 1] + f11, this.f32015e);
        }
    }

    public RectF g() {
        this.f32063k.set(((a8.g) this.f28477a).f397b);
        this.f32063k.inset(0.0f, -this.f32012b.f26637h);
        return this.f32063k;
    }

    public float[] h() {
        int length = this.f32064l.length;
        int i10 = this.f32060h.f26641l;
        if (length != i10 * 2) {
            this.f32064l = new float[i10 * 2];
        }
        float[] fArr = this.f32064l;
        for (int i11 = 0; i11 < fArr.length; i11 += 2) {
            fArr[i11 + 1] = this.f32060h.f26640k[i11 / 2];
        }
        this.f32013c.f(fArr);
        return fArr;
    }

    public Path i(Path path, int i10, float[] fArr) {
        int i11 = i10 + 1;
        path.moveTo(((a8.g) this.f28477a).f397b.left, fArr[i11]);
        path.lineTo(((a8.g) this.f28477a).f397b.right, fArr[i11]);
        return path;
    }

    public void j(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        s7.j jVar = this.f32060h;
        if (jVar.f26656a && jVar.f26647r) {
            float[] h10 = h();
            Paint paint = this.f32015e;
            this.f32060h.getClass();
            paint.setTypeface(null);
            this.f32015e.setTextSize(this.f32060h.f26659d);
            this.f32015e.setColor(this.f32060h.f26660e);
            float f13 = this.f32060h.f26657b;
            s7.j jVar2 = this.f32060h;
            float a10 = (a8.f.a(this.f32015e, "A") / 2.5f) + jVar2.f26658c;
            j.a aVar = jVar2.G;
            int i10 = jVar2.F;
            if (aVar == j.a.LEFT) {
                if (i10 == 1) {
                    this.f32015e.setTextAlign(Paint.Align.RIGHT);
                    f10 = ((a8.g) this.f28477a).f397b.left;
                    f12 = f10 - f13;
                } else {
                    this.f32015e.setTextAlign(Paint.Align.LEFT);
                    f11 = ((a8.g) this.f28477a).f397b.left;
                    f12 = f11 + f13;
                }
            } else if (i10 == 1) {
                this.f32015e.setTextAlign(Paint.Align.LEFT);
                f11 = ((a8.g) this.f28477a).f397b.right;
                f12 = f11 + f13;
            } else {
                this.f32015e.setTextAlign(Paint.Align.RIGHT);
                f10 = ((a8.g) this.f28477a).f397b.right;
                f12 = f10 - f13;
            }
            f(canvas, f12, h10, a10);
        }
    }

    public void k(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        a8.g gVar;
        s7.j jVar = this.f32060h;
        if (jVar.f26656a && jVar.f26646q) {
            this.f32016f.setColor(jVar.f26638i);
            this.f32016f.setStrokeWidth(this.f32060h.f26639j);
            if (this.f32060h.G == j.a.LEFT) {
                Object obj = this.f28477a;
                f10 = ((a8.g) obj).f397b.left;
                f11 = ((a8.g) obj).f397b.top;
                f12 = ((a8.g) obj).f397b.left;
                gVar = (a8.g) obj;
            } else {
                Object obj2 = this.f28477a;
                f10 = ((a8.g) obj2).f397b.right;
                f11 = ((a8.g) obj2).f397b.top;
                f12 = ((a8.g) obj2).f397b.right;
                gVar = (a8.g) obj2;
            }
            canvas.drawLine(f10, f11, f12, gVar.f397b.bottom, this.f32016f);
        }
    }

    public final void l(Canvas canvas) {
        s7.j jVar = this.f32060h;
        if (!jVar.f26656a) {
            return;
        }
        if (jVar.f26645p) {
            int save = canvas.save();
            canvas.clipRect(g());
            float[] h10 = h();
            this.f32014d.setColor(this.f32060h.f26636g);
            this.f32014d.setStrokeWidth(this.f32060h.f26637h);
            Paint paint = this.f32014d;
            this.f32060h.getClass();
            paint.setPathEffect(null);
            Path path = this.f32062j;
            path.reset();
            for (int i10 = 0; i10 < h10.length; i10 += 2) {
                canvas.drawPath(i(path, i10, h10), this.f32014d);
                path.reset();
            }
            canvas.restoreToCount(save);
        }
        this.f32060h.getClass();
    }

    public void m(Canvas canvas) {
        ArrayList arrayList = this.f32060h.f26648s;
        if (arrayList != null && arrayList.size() > 0) {
            float[] fArr = this.f32066n;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Path path = this.f32065m;
            path.reset();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((s7.g) arrayList.get(i10)).f26656a) {
                    int save = canvas.save();
                    this.f32067o.set(((a8.g) this.f28477a).f397b);
                    this.f32067o.inset(0.0f, -0.0f);
                    canvas.clipRect(this.f32067o);
                    this.f32017g.setStyle(Paint.Style.STROKE);
                    this.f32017g.setColor(0);
                    this.f32017g.setStrokeWidth(0.0f);
                    this.f32017g.setPathEffect(null);
                    fArr[1] = 0.0f;
                    this.f32013c.f(fArr);
                    path.moveTo(((a8.g) this.f28477a).f397b.left, fArr[1]);
                    path.lineTo(((a8.g) this.f28477a).f397b.right, fArr[1]);
                    canvas.drawPath(path, this.f32017g);
                    path.reset();
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
