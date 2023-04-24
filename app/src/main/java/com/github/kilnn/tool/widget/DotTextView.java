package com.github.kilnn.tool.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import com.github.kilnn.tool.R;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public class DotTextView extends MaterialTextView {
    public DotTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DotTextView, 0, 0);
        int color = obtainStyledAttributes.getColor(R.styleable.DotTextView_dot_color, -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DotTextView_dot_size, 0);
        if (dimensionPixelSize != 0) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(color);
            shapeDrawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            setCompoundDrawablesRelative(shapeDrawable, getCompoundDrawables()[1], getCompoundDrawables()[2], getCompoundDrawables()[3]);
        }
        obtainStyledAttributes.recycle();
    }
}
