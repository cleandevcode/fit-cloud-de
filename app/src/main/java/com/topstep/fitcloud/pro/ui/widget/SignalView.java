package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
public class SignalView extends View {

    /* renamed from: a */
    public int f12393a;

    /* renamed from: b */
    public Paint f12394b;

    /* renamed from: c */
    public int f12395c;

    /* renamed from: d */
    public int f12396d;

    /* renamed from: e */
    public int f12397e;

    /* renamed from: f */
    public int f12398f;

    /* renamed from: g */
    public int f12399g;

    public SignalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12395c = 5;
        this.f12396d = 0;
        this.f12397e = -3355444;
        this.f12398f = -7829368;
        float f10 = getContext().getResources().getDisplayMetrics().density;
        this.f12393a = (int) (18.0f * f10);
        this.f12399g = (int) (f10 * 1.5f);
        this.f12394b = new Paint();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        int height = getHeight() / this.f12395c;
        int width = getWidth();
        int i11 = this.f12399g;
        int i12 = this.f12395c;
        int i13 = (width - ((i12 - 1) * i11)) / i12;
        int i14 = 1;
        while (true) {
            if (i14 > this.f12395c) {
                return;
            }
            int i15 = this.f12396d >= i14 ? this.f12398f : this.f12397e;
            int i16 = i14 - 1;
            int i17 = (this.f12399g * i16) + (i13 * i16);
            int height2 = getHeight();
            this.f12394b.setColor(i15);
            canvas.drawRect(i17, (i10 - i14) * height, i17 + i13, height2, this.f12394b);
            i14++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (getLayoutParams().width == -2 && getLayoutParams().height == -2) {
            int i12 = this.f12393a;
            setMeasuredDimension(i12, i12);
            return;
        }
        if (getLayoutParams().width == -2) {
            size = this.f12393a;
        } else if (getLayoutParams().height != -2) {
            return;
        } else {
            size2 = this.f12393a;
        }
        setMeasuredDimension(size, size2);
    }

    public void setCurrentSignal(int i10) {
        this.f12396d = i10;
    }

    public void setMaxSignal(int i10) {
        this.f12395c = i10;
    }

    public void setSignalColorDisabled(int i10) {
        this.f12397e = i10;
    }

    public void setSignalColorEnabled(int i10) {
        this.f12398f = i10;
    }

    public void setSignalMargin(int i10) {
        this.f12399g = i10;
    }
}
