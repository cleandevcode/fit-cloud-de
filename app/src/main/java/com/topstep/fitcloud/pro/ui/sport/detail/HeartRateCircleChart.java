package com.topstep.fitcloud.pro.ui.sport.detail;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public class HeartRateCircleChart extends View {

    /* renamed from: a */
    public Paint f12196a;

    /* renamed from: b */
    public int[] f12197b;

    /* renamed from: c */
    public int[] f12198c;

    /* renamed from: d */
    public RectF f12199d;

    public HeartRateCircleChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(5);
        this.f12196a = paint;
        paint.setStrokeWidth(g7.a.a(getContext(), 12.0f));
        this.f12196a.setStyle(Paint.Style.STROKE);
        this.f12198c = new int[]{getContext().getResources().getColor(R.color.sport_heart_rate_maximal), getContext().getResources().getColor(R.color.sport_heart_rate_anaerobic), getContext().getResources().getColor(R.color.sport_heart_rate_aerobic), getContext().getResources().getColor(R.color.sport_heart_rate_hiit), getContext().getResources().getColor(R.color.sport_heart_rate_warm_up)};
        this.f12199d = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int[] iArr;
        super.onDraw(canvas);
        int[] iArr2 = this.f12197b;
        if (iArr2 == null || iArr2.length != 5) {
            return;
        }
        float strokeWidth = this.f12196a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f12199d;
        rectF.left = strokeWidth;
        rectF.top = strokeWidth;
        rectF.right = getWidth() - strokeWidth;
        this.f12199d.bottom = getHeight() - strokeWidth;
        int i10 = 0;
        for (int i11 : this.f12197b) {
            i10 += i11;
        }
        if (i10 <= 0) {
            this.f12196a.setColor(this.f12198c[iArr.length - 1]);
            canvas.drawArc(this.f12199d, 0.0f, 360.0f, false, this.f12196a);
            return;
        }
        float f10 = 0.0f;
        for (int length = this.f12197b.length - 1; length >= 0; length--) {
            this.f12196a.setColor(this.f12198c[length]);
            float f11 = (this.f12197b[length] * 360.0f) / i10;
            canvas.drawArc(this.f12199d, f10, f11, false, this.f12196a);
            f10 += f11;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(min, min);
    }

    public void setValues(int[] iArr) {
        this.f12197b = iArr;
        invalidate();
    }
}
