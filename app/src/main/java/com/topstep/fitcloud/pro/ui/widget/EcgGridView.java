package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.topstep.fitcloud.pro.R;
import g7.a;

/* loaded from: classes2.dex */
public class EcgGridView extends View {

    /* renamed from: a */
    public int f12274a;

    /* renamed from: b */
    public float f12275b;

    /* renamed from: c */
    public boolean f12276c;

    /* renamed from: d */
    public int f12277d;

    /* renamed from: e */
    public float f12278e;

    /* renamed from: f */
    public int f12279f;

    /* renamed from: g */
    public int f12280g;

    /* renamed from: h */
    public float f12281h;

    /* renamed from: i */
    public float f12282i;

    /* renamed from: j */
    public Paint f12283j;

    public EcgGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12280g = 40;
        this.f12274a = -3355444;
        float f10 = getResources().getDisplayMetrics().density * 1.0f;
        this.f12275b = f10;
        this.f12276c = true;
        this.f12277d = this.f12274a;
        this.f12278e = f10 * 1.5f;
        this.f12279f = 5;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.EcgGridView, 0, 0);
            this.f12274a = obtainStyledAttributes.getColor(4, this.f12274a);
            this.f12275b = obtainStyledAttributes.getDimension(5, this.f12275b);
            this.f12276c = obtainStyledAttributes.getBoolean(1, this.f12276c);
            this.f12277d = obtainStyledAttributes.getColor(0, this.f12274a);
            this.f12278e = obtainStyledAttributes.getDimension(3, this.f12275b * 1.5f);
            this.f12279f = obtainStyledAttributes.getInt(2, this.f12279f);
            this.f12280g = obtainStyledAttributes.getInt(6, this.f12280g);
            obtainStyledAttributes.recycle();
        }
        this.f12281h = a.b(getContext());
        this.f12282i = a.c(getContext());
        this.f12283j = new Paint(5);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float f10;
        Paint paint2;
        float f11;
        super.onDraw(canvas);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int i10 = paddingLeft + width;
        int i11 = paddingTop + height;
        float f12 = height;
        int ceil = ((int) Math.ceil(f12 / this.f12282i)) + 1;
        for (int i12 = 0; i12 < ceil; i12++) {
            if (this.f12276c && i12 % this.f12279f == 0) {
                this.f12283j.setColor(this.f12277d);
                paint2 = this.f12283j;
                f11 = this.f12278e;
            } else {
                this.f12283j.setColor(this.f12274a);
                paint2 = this.f12283j;
                f11 = this.f12275b;
            }
            paint2.setStrokeWidth(f11);
            float f13 = f12 - ((i12 * this.f12282i) + 0.0f);
            canvas.drawLine(paddingLeft, f13, i10, f13, this.f12283j);
        }
        int ceil2 = ((int) Math.ceil(width / this.f12281h)) + 1;
        for (int i13 = 0; i13 < ceil2; i13++) {
            if (this.f12276c && i13 % this.f12279f == 0) {
                this.f12283j.setColor(this.f12277d);
                paint = this.f12283j;
                f10 = this.f12278e;
            } else {
                this.f12283j.setColor(this.f12274a);
                paint = this.f12283j;
                f10 = this.f12275b;
            }
            paint.setStrokeWidth(f10);
            float f14 = (i13 * this.f12281h) + 0.0f;
            canvas.drawLine(f14, paddingTop, f14, i11, this.f12283j);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), (int) (this.f12280g * this.f12282i));
        }
    }

    public void setBoldLineColor(int i10) {
        this.f12277d = i10;
    }

    public void setBoldLineEnabled(boolean z10) {
        this.f12276c = z10;
    }

    public void setBoldLineGap(int i10) {
        this.f12279f = i10;
    }

    public void setBoldLineWidth(float f10) {
        this.f12278e = f10;
    }

    public void setLineColor(int i10) {
        this.f12274a = i10;
    }

    public void setLineWidth(float f10) {
        this.f12275b = f10;
    }
}
