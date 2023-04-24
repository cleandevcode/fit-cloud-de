package com.github.kilnn.tool.widget.item;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.github.kilnn.tool.R;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
import gm.l;
import kotlin.Metadata;
import o1.g;
import o1.p;

@Metadata
/* loaded from: classes.dex */
public final class PreferenceItem extends PreferenceRelativeLayout {

    /* renamed from: b */
    public int f5947b;

    /* renamed from: c */
    public boolean f5948c;

    /* renamed from: d */
    public TextView f5949d;

    /* renamed from: e */
    public TextView f5950e;

    /* renamed from: f */
    public AppCompatImageView f5951f;

    /* renamed from: g */
    public SwitchMaterial f5952g;

    /* renamed from: h */
    public TextView f5953h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PreferenceItem, 0, 0);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, defStyleRes)");
        this.f5947b = obtainStyledAttributes.getInt(R.styleable.PreferenceItem_preferenceType, 0);
        boolean z10 = obtainStyledAttributes.getBoolean(R.styleable.PreferenceItem_showPreferenceSummary, false);
        this.f5948c = z10;
        int i10 = this.f5947b;
        (context instanceof Activity ? ((Activity) context).getLayoutInflater() : LayoutInflater.from(context)).inflate(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? 0 : R.layout.layout_preference_item_text_wrap : z10 ? R.layout.layout_preference_item_text_full : R.layout.layout_preference_item_text_simple : z10 ? R.layout.layout_preference_item_switch_full : R.layout.layout_preference_item_switch_simple : z10 ? R.layout.layout_preference_item_image_full : R.layout.layout_preference_item_image_simple : z10 ? R.layout.layout_preference_item_none_full : R.layout.layout_preference_item_none_simple, this);
        View findViewById = findViewById(R.id.preference_item_title);
        l.e(findViewById, "findViewById(R.id.preference_item_title)");
        this.f5949d = (TextView) findViewById;
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.PreferenceItem_preferenceTitleAppearance, -1);
        if (resourceId != -1) {
            TextView textView = this.f5949d;
            if (textView == null) {
                l.l("titleView");
                throw null;
            }
            p.e(textView, resourceId);
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.PreferenceItem_preferenceTitleColor);
        if (colorStateList != null) {
            TextView textView2 = this.f5949d;
            if (textView2 == null) {
                l.l("titleView");
                throw null;
            }
            textView2.setTextColor(colorStateList);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PreferenceItem_preferenceTitleSize, -1);
        if (dimensionPixelSize != -1) {
            TextView textView3 = this.f5949d;
            if (textView3 == null) {
                l.l("titleView");
                throw null;
            }
            textView3.setTextSize(dimensionPixelSize);
        }
        String string = obtainStyledAttributes.getString(R.styleable.PreferenceItem_preferenceTitle);
        TextView textView4 = this.f5949d;
        if (textView4 == null) {
            l.l("titleView");
            throw null;
        }
        textView4.setText(string);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.PreferenceItem_preferenceTitleDrawableStart);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(R.styleable.PreferenceItem_preferenceTitleDrawableEnd);
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        }
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.PreferenceItem_preferenceTitleDrawablePadding, 0);
        TextView textView5 = this.f5949d;
        if (textView5 == null) {
            l.l("titleView");
            throw null;
        }
        textView5.setCompoundDrawablePadding(dimensionPixelOffset);
        TextView textView6 = this.f5949d;
        if (textView6 == null) {
            l.l("titleView");
            throw null;
        }
        textView6.setCompoundDrawables(drawable, null, drawable2, null);
        if (this.f5948c) {
            TextView textView7 = (TextView) findViewById(R.id.preference_item_summary);
            int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.PreferenceItem_preferenceSummaryAppearance, -1);
            if (resourceId2 != -1) {
                p.e(textView7, resourceId2);
            }
            ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(R.styleable.PreferenceItem_preferenceSummaryColor);
            if (colorStateList2 != null) {
                textView7.setTextColor(colorStateList2);
            }
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PreferenceItem_preferenceSummarySize, -1);
            if (dimensionPixelSize2 != -1) {
                textView7.setTextSize(dimensionPixelSize2);
            }
            String string2 = obtainStyledAttributes.getString(R.styleable.PreferenceItem_preferenceSummary);
            if (TextUtils.isEmpty(string2)) {
                textView7.setVisibility(8);
            } else {
                textView7.setVisibility(0);
                textView7.setText(string2);
            }
            this.f5950e = textView7;
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.preference_item_title_layout);
        }
        int i11 = this.f5947b;
        if (i11 == 1) {
            View findViewById2 = findViewById(R.id.preference_item_image);
            l.e(findViewById2, "findViewById(R.id.preference_item_image)");
            AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById2;
            appCompatImageView.setImageDrawable(obtainStyledAttributes.getDrawable(R.styleable.PreferenceItem_preferenceImage));
            ColorStateList colorStateList3 = obtainStyledAttributes.getColorStateList(R.styleable.PreferenceItem_preferenceImageTint);
            if (colorStateList3 != null) {
                g.a(appCompatImageView, colorStateList3);
            }
            this.f5951f = appCompatImageView;
        } else if (i11 == 2) {
            this.f5952g = (SwitchMaterial) findViewById(R.id.preference_item_switch);
        } else if (i11 == 3 || i11 == 4) {
            TextView textView8 = (TextView) findViewById(R.id.preference_item_text);
            int resourceId3 = obtainStyledAttributes.getResourceId(R.styleable.PreferenceItem_preferenceTextAppearance, -1);
            if (resourceId3 != -1) {
                p.e(textView8, resourceId3);
            }
            ColorStateList colorStateList4 = obtainStyledAttributes.getColorStateList(R.styleable.PreferenceItem_preferenceTextColor);
            if (colorStateList4 != null) {
                textView8.setTextColor(colorStateList4);
            }
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PreferenceItem_preferenceTextSize, -1);
            if (dimensionPixelSize3 != -1) {
                textView8.setTextSize(dimensionPixelSize3);
            }
            textView8.setText(obtainStyledAttributes.getString(R.styleable.PreferenceItem_preferenceText));
            if (this.f5947b == 3) {
                int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.PreferenceItem_preferenceTextMinWidth, 0);
                int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.PreferenceItem_preferenceTextMaxWidth, 0);
                if (dimensionPixelOffset2 > 0) {
                    textView8.setMinWidth(dimensionPixelOffset2);
                }
                if (dimensionPixelOffset3 > 0) {
                    textView8.setMaxWidth(dimensionPixelOffset3);
                }
            }
            this.f5953h = textView8;
        }
        obtainStyledAttributes.recycle();
    }

    public final ImageView getImageView() {
        AppCompatImageView appCompatImageView = this.f5951f;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
    }

    public final TextView getSummaryView() {
        TextView textView = this.f5950e;
        if (textView != null) {
            return textView;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public final SwitchMaterial getSwitchView() {
        SwitchMaterial switchMaterial = this.f5952g;
        if (switchMaterial != null) {
            return switchMaterial;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.switchmaterial.SwitchMaterial");
    }

    public final TextView getTextView() {
        TextView textView = this.f5953h;
        if (textView != null) {
            return textView;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public final TextView getTitleView() {
        TextView textView = this.f5949d;
        if (textView != null) {
            return textView;
        }
        l.l("titleView");
        throw null;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        SwitchMaterial switchMaterial = this.f5952g;
        if (switchMaterial == null) {
            return;
        }
        switchMaterial.setEnabled(z10);
    }
}
