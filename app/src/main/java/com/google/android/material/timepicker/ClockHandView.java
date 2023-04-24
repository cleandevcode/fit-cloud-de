package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: a */
    public final ArrayList f6896a;

    /* renamed from: b */
    public final int f6897b;

    /* renamed from: c */
    public final float f6898c;

    /* renamed from: d */
    public final Paint f6899d;

    /* renamed from: e */
    public final RectF f6900e;

    /* renamed from: f */
    public final int f6901f;

    /* renamed from: g */
    public float f6902g;

    /* renamed from: h */
    public boolean f6903h;

    /* renamed from: i */
    public double f6904i;

    /* renamed from: j */
    public int f6905j;

    /* loaded from: classes.dex */
    public interface a {
        void a(float f10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ClockHandView(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            int r0 = com.google.android.material.R.attr.materialClockStyle
            r4.<init>(r5, r6, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.f6896a = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r4.f6899d = r1
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r4.f6900e = r2
            int[] r2 = com.google.android.material.R.styleable.ClockHandView
            int r3 = com.google.android.material.R.style.Widget_MaterialComponents_TimePicker_Clock
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r2, r0, r3)
            int r0 = com.google.android.material.R.styleable.ClockHandView_materialCircleRadius
            r2 = 0
            int r0 = r6.getDimensionPixelSize(r0, r2)
            r4.f6905j = r0
            int r0 = com.google.android.material.R.styleable.ClockHandView_selectorSize
            int r0 = r6.getDimensionPixelSize(r0, r2)
            r4.f6897b = r0
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.google.android.material.R.dimen.material_clock_hand_stroke_width
            int r3 = r0.getDimensionPixelSize(r3)
            r4.f6901f = r3
            int r3 = com.google.android.material.R.dimen.material_clock_hand_center_dot_radius
            int r0 = r0.getDimensionPixelSize(r3)
            float r0 = (float) r0
            r4.f6898c = r0
            int r0 = com.google.android.material.R.styleable.ClockHandView_clockHandColor
            int r0 = r6.getColor(r0, r2)
            r2 = 1
            r1.setAntiAlias(r2)
            r1.setColor(r0)
            r0 = 0
            r4.a(r0)
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            r5.getScaledTouchSlop()
            java.util.WeakHashMap<android.view.View, k1.i2> r5 = k1.o0.f18161a
            r5 = 2
            k1.o0.d.s(r4, r5)
            r6.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void a(float f10) {
        b(f10, false);
    }

    public final void b(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f6902g = f11;
        this.f6904i = Math.toRadians(f11 - 90.0f);
        float cos = (this.f6905j * ((float) Math.cos(this.f6904i))) + (getWidth() / 2);
        float sin = (this.f6905j * ((float) Math.sin(this.f6904i))) + (getHeight() / 2);
        RectF rectF = this.f6900e;
        float f12 = this.f6897b;
        rectF.set(cos - f12, sin - f12, cos + f12, sin + f12);
        Iterator it = this.f6896a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f11);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f10 = height;
        this.f6899d.setStrokeWidth(0.0f);
        canvas.drawCircle((this.f6905j * ((float) Math.cos(this.f6904i))) + width2, (this.f6905j * ((float) Math.sin(this.f6904i))) + f10, this.f6897b, this.f6899d);
        double sin = Math.sin(this.f6904i);
        double cos = Math.cos(this.f6904i);
        this.f6899d.setStrokeWidth(this.f6901f);
        canvas.drawLine(width2, f10, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.f6899d);
        canvas.drawCircle(width2, f10, this.f6898c, this.f6899d);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a(this.f6902g);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z13 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z10 = false;
            } else {
                z10 = this.f6903h;
            }
            z11 = false;
        } else {
            this.f6903h = false;
            z10 = false;
            z11 = true;
        }
        boolean z14 = this.f6903h;
        int degrees = ((int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x10 - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f10 = degrees;
        if (this.f6902g != f10) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11 || !z12) {
            if (z12 || z10) {
                a(f10);
            }
            this.f6903h = z14 | z13;
            return true;
        }
        z13 = true;
        this.f6903h = z14 | z13;
        return true;
    }
}
