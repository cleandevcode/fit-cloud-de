package z7;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import s.c0;

/* loaded from: classes.dex */
public final class e extends u4.c {

    /* renamed from: b */
    public Paint f32033b;

    /* renamed from: c */
    public Paint f32034c;

    /* renamed from: d */
    public s7.e f32035d;

    /* renamed from: e */
    public ArrayList f32036e;

    /* renamed from: f */
    public Paint.FontMetrics f32037f;

    /* renamed from: g */
    public Path f32038g;

    public e(a8.g gVar, s7.e eVar) {
        super(gVar);
        this.f32036e = new ArrayList(16);
        this.f32037f = new Paint.FontMetrics();
        this.f32038g = new Path();
        this.f32035d = eVar;
        Paint paint = new Paint(1);
        this.f32033b = paint;
        paint.setTextSize(a8.f.c(9.0f));
        this.f32033b.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.f32034c = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    public final void d(Canvas canvas, float f10, float f11, s7.f fVar, s7.e eVar) {
        float f12;
        float f13;
        int i10 = fVar.f26686f;
        if (i10 != 1122868 && i10 != 1122867 && i10 != 0) {
            int save = canvas.save();
            int i11 = fVar.f26682b;
            if (i11 == 3) {
                i11 = eVar.f26669l;
            }
            this.f32034c.setColor(fVar.f26686f);
            if (Float.isNaN(fVar.f26683c)) {
                f12 = eVar.f26670m;
            } else {
                f12 = fVar.f26683c;
            }
            float c10 = a8.f.c(f12);
            float f14 = c10 / 2.0f;
            int b10 = c0.b(i11);
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 != 4) {
                        if (b10 == 5) {
                            if (Float.isNaN(fVar.f26684d)) {
                                f13 = eVar.f26671n;
                            } else {
                                f13 = fVar.f26684d;
                            }
                            float c11 = a8.f.c(f13);
                            DashPathEffect dashPathEffect = fVar.f26685e;
                            if (dashPathEffect == null) {
                                eVar.getClass();
                                dashPathEffect = null;
                            }
                            this.f32034c.setStyle(Paint.Style.STROKE);
                            this.f32034c.setStrokeWidth(c11);
                            this.f32034c.setPathEffect(dashPathEffect);
                            this.f32038g.reset();
                            this.f32038g.moveTo(f10, f11);
                            this.f32038g.lineTo(f10 + c10, f11);
                            canvas.drawPath(this.f32038g, this.f32034c);
                        }
                    }
                } else {
                    this.f32034c.setStyle(Paint.Style.FILL);
                    canvas.drawRect(f10, f11 - f14, f10 + c10, f11 + f14, this.f32034c);
                }
                canvas.restoreToCount(save);
            }
            this.f32034c.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f10 + f14, f11, f14, this.f32034c);
            canvas.restoreToCount(save);
        }
    }
}
