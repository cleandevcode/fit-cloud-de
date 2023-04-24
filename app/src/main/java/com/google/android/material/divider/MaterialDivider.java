package com.google.android.material.divider;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.material.R;
import ga.f;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import y0.a;

/* loaded from: classes.dex */
public class MaterialDivider extends View {

    /* renamed from: f */
    public static final int f6534f = R.style.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: a */
    public final f f6535a;

    /* renamed from: b */
    public int f6536b;

    /* renamed from: c */
    public int f6537c;

    /* renamed from: d */
    public int f6538d;

    /* renamed from: e */
    public int f6539e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialDivider(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = com.google.android.material.R.attr.materialDividerStyle
            int r4 = com.google.android.material.divider.MaterialDivider.f6534f
            android.content.Context r8 = la.a.a(r8, r9, r3, r4)
            r7.<init>(r8, r9, r3)
            android.content.Context r8 = r7.getContext()
            ga.f r0 = new ga.f
            r0.<init>()
            r7.f6535a = r0
            int[] r2 = com.google.android.material.R.styleable.MaterialDivider
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = z9.o.d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R.styleable.MaterialDivider_dividerThickness
            android.content.res.Resources r1 = r7.getResources()
            int r2 = com.google.android.material.R.dimen.material_divider_thickness
            int r1 = r1.getDimensionPixelSize(r2)
            int r0 = r9.getDimensionPixelSize(r0, r1)
            r7.f6536b = r0
            int r0 = com.google.android.material.R.styleable.MaterialDivider_dividerInsetStart
            int r0 = r9.getDimensionPixelOffset(r0, r6)
            r7.f6538d = r0
            int r0 = com.google.android.material.R.styleable.MaterialDivider_dividerInsetEnd
            int r0 = r9.getDimensionPixelOffset(r0, r6)
            r7.f6539e = r0
            int r0 = com.google.android.material.R.styleable.MaterialDivider_dividerColor
            android.content.res.ColorStateList r8 = da.d.a(r8, r9, r0)
            int r8 = r8.getDefaultColor()
            r7.setDividerColor(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.divider.MaterialDivider.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public int getDividerColor() {
        return this.f6537c;
    }

    public int getDividerInsetEnd() {
        return this.f6539e;
    }

    public int getDividerInsetStart() {
        return this.f6538d;
    }

    public int getDividerThickness() {
        return this.f6536b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int width;
        int i11;
        super.onDraw(canvas);
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        boolean z10 = true;
        if (o0.e.d(this) != 1) {
            z10 = false;
        }
        if (z10) {
            i10 = this.f6539e;
        } else {
            i10 = this.f6538d;
        }
        if (z10) {
            width = getWidth();
            i11 = this.f6538d;
        } else {
            width = getWidth();
            i11 = this.f6539e;
        }
        this.f6535a.setBounds(i10, 0, width - i11, getBottom() - getTop());
        this.f6535a.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f6536b;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f6537c != i10) {
            this.f6537c = i10;
            this.f6535a.k(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(a.b(getContext(), i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f6539e = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f6538d = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f6536b != i10) {
            this.f6536b = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }
}
