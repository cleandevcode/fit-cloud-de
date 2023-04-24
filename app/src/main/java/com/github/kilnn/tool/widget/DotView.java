package com.github.kilnn.tool.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.github.kilnn.tool.R;
import gm.l;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public final class DotView extends View {

    /* renamed from: a */
    public final Paint f5913a;

    /* renamed from: b */
    public final int f5914b;

    /* renamed from: c */
    public final RectF f5915c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.f(context, "context");
        Paint paint = new Paint(5);
        this.f5913a = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DotTextView, 0, 0);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…extView, defStyleAttr, 0)");
        int color = obtainStyledAttributes.getColor(R.styleable.DotTextView_dot_color, -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DotTextView_dot_size, 0);
        this.f5914b = dimensionPixelSize;
        obtainStyledAttributes.recycle();
        paint.setColor(color);
        float f10 = dimensionPixelSize;
        this.f5915c = new RectF(0.0f, 0.0f, f10, f10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawOval(this.f5915c, this.f5913a);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f5914b;
        setMeasuredDimension(i12, i12);
    }
}
