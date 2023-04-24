package z7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/* loaded from: classes.dex */
public abstract class d extends u4.c {

    /* renamed from: b */
    public p7.a f32029b;

    /* renamed from: c */
    public Paint f32030c;

    /* renamed from: d */
    public Paint f32031d;

    /* renamed from: e */
    public Paint f32032e;

    public d(p7.a aVar, a8.g gVar) {
        super(gVar);
        this.f32029b = aVar;
        Paint paint = new Paint(1);
        this.f32030c = paint;
        paint.setStyle(Paint.Style.FILL);
        new Paint(4);
        Paint paint2 = new Paint(1);
        this.f32032e = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        this.f32032e.setTextAlign(Paint.Align.CENTER);
        this.f32032e.setTextSize(a8.f.c(9.0f));
        Paint paint3 = new Paint(1);
        this.f32031d = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f32031d.setStrokeWidth(2.0f);
        this.f32031d.setColor(Color.rgb(255, 187, 115));
    }

    public final void d(x7.b bVar) {
        Paint paint = this.f32032e;
        bVar.D();
        paint.setTypeface(null);
        this.f32032e.setTextSize(bVar.t());
    }

    public abstract void e(Canvas canvas);

    public abstract void f(Canvas canvas);

    public abstract void g(Canvas canvas, v7.c[] cVarArr);

    public abstract void h(Canvas canvas);

    public abstract void i();

    public boolean j(w7.c cVar) {
        return ((float) cVar.getData().e()) < ((float) cVar.getMaxVisibleCount()) * ((a8.g) this.f28477a).f404i;
    }
}
