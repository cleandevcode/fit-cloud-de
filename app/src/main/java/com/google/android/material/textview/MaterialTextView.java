package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.d1;
import com.google.android.material.R;
import da.b;
import la.a;

/* loaded from: classes.dex */
public class MaterialTextView extends d1 {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        boolean z10;
        Context context2 = getContext();
        TypedValue a10 = b.a(context2, R.attr.textAppearanceLineHeightEnabled);
        if (a10 != null && a10.type == 18 && a10.data == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = R.styleable.MaterialTextView;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int g10 = g(context2, obtainStyledAttributes, R.styleable.MaterialTextView_android_lineHeight, R.styleable.MaterialTextView_lineHeight);
            obtainStyledAttributes.recycle();
            if (!(g10 != -1)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(R.styleable.MaterialTextView_android_textAppearance, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    f(resourceId, theme);
                }
            }
        }
    }

    public static int g(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            int i12 = iArr[i11];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i12, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i10 = dimensionPixelSize;
            } else {
                i10 = typedArray.getDimensionPixelSize(i12, -1);
            }
        }
        return i10;
    }

    public final void f(int i10, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, R.styleable.MaterialTextAppearance);
        int g10 = g(getContext(), obtainStyledAttributes, R.styleable.MaterialTextAppearance_android_lineHeight, R.styleable.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (g10 >= 0) {
            setLineHeight(g10);
        }
    }

    @Override // androidx.appcompat.widget.d1, android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        TypedValue a10 = b.a(context, R.attr.textAppearanceLineHeightEnabled);
        boolean z10 = true;
        if (a10 != null && a10.type == 18 && a10.data == 0) {
            z10 = false;
        }
        if (z10) {
            f(i10, context.getTheme());
        }
    }
}
