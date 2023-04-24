package com.github.kilnn.tool.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.github.kilnn.tool.R;
import gm.l;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public final class ScanCodeLayout extends FrameLayout {

    /* renamed from: a */
    public final int f5916a;

    /* renamed from: b */
    public final int f5917b;

    /* renamed from: c */
    public final int f5918c;

    /* renamed from: d */
    public final float f5919d;

    /* renamed from: e */
    public final Drawable f5920e;

    /* renamed from: f */
    public final RectF f5921f;

    /* renamed from: g */
    public final PorterDuffXfermode f5922g;

    /* renamed from: h */
    public final Paint f5923h;

    /* renamed from: i */
    public boolean f5924i;

    /* renamed from: j */
    public float f5925j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanCodeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.f(context, "context");
        this.f5921f = new RectF();
        this.f5922g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f5923h = new Paint(7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScanCodeLayout, 0, 0);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…eLayout, defStyleAttr, 0)");
        this.f5916a = obtainStyledAttributes.getColor(R.styleable.ScanCodeLayout_maskColor, -1442840576);
        this.f5917b = obtainStyledAttributes.getColor(R.styleable.ScanCodeLayout_rectColor, 0);
        this.f5918c = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ScanCodeLayout_rectSize, 0);
        this.f5919d = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ScanCodeLayout_rectCorners, 0);
        this.f5920e = obtainStyledAttributes.getDrawable(R.styleable.ScanCodeLayout_scan_bar);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        setBackgroundColor(0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.f5923h);
        canvas.drawColor(this.f5916a);
        this.f5923h.setXfermode(this.f5922g);
        this.f5923h.setColor(this.f5917b);
        RectF rectF = this.f5921f;
        float f10 = this.f5919d;
        canvas.drawRoundRect(rectF, f10, f10, this.f5923h);
        this.f5923h.setXfermode(null);
        this.f5923h.setColor(-16777216);
        canvas.restoreToCount(saveLayer);
        if (this.f5920e == null || !this.f5924i) {
            return;
        }
        int saveLayer2 = canvas.saveLayer(this.f5921f, this.f5923h);
        RectF rectF2 = this.f5921f;
        canvas.translate(rectF2.left, (rectF2.top - this.f5920e.getIntrinsicHeight()) + this.f5925j);
        this.f5920e.draw(canvas);
        canvas.restoreToCount(saveLayer2);
        float f11 = this.f5925j + 16;
        this.f5925j = f11;
        if (f11 > this.f5921f.height()) {
            this.f5925j = 0.0f;
        }
        postInvalidateDelayed(40L);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View findViewById = findViewById(R.id.scan_code_layout_top);
        if (findViewById != null) {
            findViewById.layout(0, 0, getWidth(), (int) this.f5921f.top);
        }
        View findViewById2 = findViewById(R.id.scan_code_layout_bottom);
        if (findViewById2 != null) {
            findViewById2.layout(0, (int) this.f5921f.bottom, getWidth(), getHeight());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > measuredHeight) {
            measuredWidth = measuredHeight;
        }
        int i12 = this.f5918c;
        if (i12 <= 0) {
            measuredWidth = (int) ((measuredWidth / 10) * 8);
        } else if (i12 <= measuredWidth) {
            measuredWidth = i12;
        }
        this.f5921f.set((getMeasuredWidth() - measuredWidth) / 2.0f, (getMeasuredHeight() - measuredWidth) / 2.0f, (getMeasuredWidth() + measuredWidth) / 2.0f, (getMeasuredHeight() + measuredWidth) / 2.0f);
        Drawable drawable = this.f5920e;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) this.f5921f.width(), this.f5920e.getIntrinsicHeight());
        }
    }
}
