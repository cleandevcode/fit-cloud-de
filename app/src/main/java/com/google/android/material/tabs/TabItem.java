package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R;

/* loaded from: classes.dex */
public class TabItem extends View {

    /* renamed from: a */
    public final CharSequence f6688a;

    /* renamed from: b */
    public final Drawable f6689b;

    /* renamed from: c */
    public final int f6690c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TabItem);
        this.f6688a = obtainStyledAttributes.getText(R.styleable.TabItem_android_text);
        int i10 = R.styleable.TabItem_android_icon;
        if (obtainStyledAttributes.hasValue(i10) && (resourceId = obtainStyledAttributes.getResourceId(i10, 0)) != 0) {
            drawable = g.a.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(i10);
        }
        this.f6689b = drawable;
        this.f6690c = obtainStyledAttributes.getResourceId(R.styleable.TabItem_android_layout, 0);
        obtainStyledAttributes.recycle();
    }
}
