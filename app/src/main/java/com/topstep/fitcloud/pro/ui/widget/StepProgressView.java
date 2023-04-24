package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.topstep.fitcloudpro.R;
import g7.a;

/* loaded from: classes2.dex */
public class StepProgressView extends View {

    /* renamed from: a */
    public float f12434a;

    /* renamed from: b */
    public Paint f12435b;

    /* renamed from: c */
    public int f12436c;

    /* renamed from: d */
    public int f12437d;

    /* renamed from: e */
    public int f12438e;

    /* renamed from: f */
    public int f12439f;

    /* renamed from: g */
    public RectF f12440g;

    /* renamed from: h */
    public RectF f12441h;

    /* renamed from: i */
    public DashPathEffect f12442i;

    /* renamed from: j */
    public Path f12443j;

    /* renamed from: k */
    public Bitmap f12444k;

    /* renamed from: l */
    public float f12445l;

    public StepProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12445l = 0.0f;
        this.f12436c = a.a(getContext(), 8.0f);
        this.f12437d = a.a(getContext(), 1.0f);
        this.f12438e = a.a(getContext(), 10.0f);
        this.f12439f = a.a(getContext(), 6.0f);
        Paint paint = new Paint(5);
        this.f12435b = paint;
        paint.setColor(-1996488705);
        this.f12435b.setStyle(Paint.Style.STROKE);
        this.f12440g = new RectF();
        this.f12441h = new RectF();
        this.f12442i = new DashPathEffect(new float[]{a.a(getContext(), 1.0f), a.a(getContext(), 8.0f)}, 0.0f);
        this.f12443j = new Path();
        this.f12444k = BitmapFactory.decodeResource(getResources(), R.drawable.ic_step_progress_completed);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        float f10;
        float f11;
        boolean z10;
        Paint paint;
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.f12434a >= 1.0f) {
            canvas.save();
            canvas.rotate(this.f12445l, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.drawBitmap(this.f12444k, (getWidth() - this.f12444k.getWidth()) / 2.0f, (getHeight() - this.f12444k.getHeight()) / 2.0f, this.f12435b);
            canvas.restore();
            this.f12445l += 1.0f;
            postInvalidateDelayed(30L);
        }
        this.f12435b.setStrokeCap(Paint.Cap.BUTT);
        this.f12435b.setStrokeWidth(this.f12436c);
        this.f12435b.setPathEffect(this.f12442i);
        this.f12443j.reset();
        this.f12443j.addOval(this.f12440g, Path.Direction.CW);
        canvas.drawPath(this.f12443j, this.f12435b);
        this.f12435b.setStrokeCap(Paint.Cap.ROUND);
        this.f12435b.setStrokeWidth(this.f12438e);
        this.f12435b.setPathEffect(null);
        float min = Math.min(this.f12434a * 360.0f, 360.0f);
        if (min >= 360.0f) {
            rectF = this.f12441h;
            f10 = -90.0f;
            z10 = false;
            paint = this.f12435b;
            canvas2 = canvas;
            f11 = min;
        } else {
            float width = (float) ((this.f12438e / ((this.f12441h.width() * 6.283185307179586d) / 2.0d)) * 360.0d);
            if (min <= width) {
                min = 0.0f;
                this.f12435b.setStrokeCap(Paint.Cap.SQUARE);
                this.f12435b.setStrokeWidth(this.f12437d);
                canvas.drawArc(this.f12441h, min - 90.0f, 360.0f - min, false, this.f12435b);
            }
            rectF = this.f12441h;
            f10 = (width / 2.0f) - 90.0f;
            f11 = min - width;
            z10 = false;
            paint = this.f12435b;
            canvas2 = canvas;
        }
        canvas2.drawArc(rectF, f10, f11, z10, paint);
        this.f12435b.setStrokeCap(Paint.Cap.SQUARE);
        this.f12435b.setStrokeWidth(this.f12437d);
        canvas.drawArc(this.f12441h, min - 90.0f, 360.0f - min, false, this.f12435b);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(min, min);
        float f10 = this.f12436c / 2.0f;
        float f11 = min;
        float f12 = f11 - f10;
        this.f12440g.set(f10, f10, f12, f12);
        float f13 = this.f12436c + this.f12439f + (this.f12438e / 2.0f);
        float f14 = f11 - f13;
        this.f12441h.set(f13, f13, f14, f14);
    }

    public void setProgress(float f10) {
        this.f12434a = f10;
        invalidate();
    }
}
