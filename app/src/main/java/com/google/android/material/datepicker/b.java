package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.R;
import ga.f;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import s.h1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final Rect f6448a;

    /* renamed from: b */
    public final ColorStateList f6449b;

    /* renamed from: c */
    public final ColorStateList f6450c;

    /* renamed from: d */
    public final ColorStateList f6451d;

    /* renamed from: e */
    public final int f6452e;

    /* renamed from: f */
    public final ga.i f6453f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, ga.i iVar, Rect rect) {
        h1.h(rect.left);
        h1.h(rect.top);
        h1.h(rect.right);
        h1.h(rect.bottom);
        this.f6448a = rect;
        this.f6449b = colorStateList2;
        this.f6450c = colorStateList;
        this.f6451d = colorStateList3;
        this.f6452e = i10;
        this.f6453f = iVar;
    }

    public static b a(Context context, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h1.e("Cannot create a CalendarItemStyle with a styleResId of 0", z10);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, R.styleable.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a10 = da.d.a(context, obtainStyledAttributes, R.styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList a11 = da.d.a(context, obtainStyledAttributes, R.styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList a12 = da.d.a(context, obtainStyledAttributes, R.styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        ga.i iVar = new ga.i(ga.i.a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), new ga.a(0)));
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, iVar, rect);
    }

    public final void b(TextView textView) {
        ga.f fVar = new ga.f();
        ga.f fVar2 = new ga.f();
        fVar.setShapeAppearanceModel(this.f6453f);
        fVar2.setShapeAppearanceModel(this.f6453f);
        fVar.k(this.f6450c);
        ColorStateList colorStateList = this.f6451d;
        fVar.f15069a.f15103k = this.f6452e;
        fVar.invalidateSelf();
        f.b bVar = fVar.f15069a;
        if (bVar.f15096d != colorStateList) {
            bVar.f15096d = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
        textView.setTextColor(this.f6449b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f6449b.withAlpha(30), fVar, fVar2);
        Rect rect = this.f6448a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        o0.d.q(textView, insetDrawable);
    }
}
