package com.topstep.fitcloud.pro.ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import g7.a;
import oi.d;

/* loaded from: classes2.dex */
public class LongPressTurnAroundLayout extends FrameLayout {

    /* renamed from: a */
    public int f12370a;

    /* renamed from: b */
    public int f12371b;

    /* renamed from: c */
    public int f12372c;

    /* renamed from: d */
    public int f12373d;

    /* renamed from: e */
    public Paint f12374e;

    /* renamed from: f */
    public RectF f12375f;

    /* renamed from: g */
    public boolean f12376g;

    /* renamed from: h */
    public float f12377h;

    /* renamed from: i */
    public ValueAnimator f12378i;

    public LongPressTurnAroundLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12372c = -1716868438;
        this.f12373d = -1118482;
        this.f12376g = false;
        this.f12377h = 0.0f;
        setWillNotDraw(false);
        this.f12370a = a.a(getContext(), 3.5f);
        this.f12371b = a.a(getContext(), 2.0f);
        Paint paint = new Paint(5);
        this.f12374e = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f12374e.setStyle(Paint.Style.STROKE);
        this.f12374e.setStrokeWidth(this.f12370a);
        RectF rectF = new RectF();
        this.f12375f = rectF;
        float f10 = this.f12370a / 2.0f;
        rectF.left = f10;
        rectF.top = f10;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f12376g) {
            return;
        }
        this.f12374e.setColor(this.f12372c);
        canvas.drawArc(this.f12375f, -90.0f, 360.0f, false, this.f12374e);
        this.f12374e.setColor(this.f12373d);
        canvas.drawArc(this.f12375f, -90.0f, this.f12377h, false, this.f12374e);
        if (this.f12377h >= 360.0f) {
            this.f12376g = false;
            this.f12377h = 0.0f;
            if (this.f12378i.isStarted()) {
                this.f12378i.end();
            }
            invalidate();
            performClick();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i12 = (this.f12370a + this.f12371b) * 2;
        setMeasuredDimension(measuredWidth + i12, measuredHeight + i12);
        this.f12375f.right = getMeasuredWidth() - (this.f12370a / 2.0f);
        this.f12375f.bottom = getMeasuredHeight() - (this.f12370a / 2.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f12376g = false;
                this.f12377h = 0.0f;
                if (this.f12378i.isStarted()) {
                    this.f12378i.end();
                }
                invalidate();
            }
        } else {
            this.f12376g = true;
            this.f12377h = 0.0f;
            if (this.f12378i == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
                this.f12378i = ofFloat;
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                this.f12378i.setDuration(800L);
                this.f12378i.addUpdateListener(new d(this));
            }
            if (this.f12378i.isStarted()) {
                this.f12378i.end();
            }
            this.f12378i.start();
        }
        return true;
    }

    public void setArcBgColor(int i10) {
        this.f12372c = i10;
        invalidate();
    }

    public void setArcColor(int i10) {
        this.f12373d = i10;
        invalidate();
    }

    public void setArcMargin(int i10) {
        this.f12371b = i10;
        invalidate();
    }

    public void setArcWidth(int i10) {
        this.f12370a = i10;
        this.f12374e.setStrokeWidth(i10);
        RectF rectF = this.f12375f;
        int i11 = this.f12370a;
        rectF.left = i11 / 2.0f;
        rectF.top = i11 / 2.0f;
        invalidate();
    }
}
