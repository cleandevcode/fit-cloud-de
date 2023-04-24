package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b0.c;
import com.github.kilnn.tool.widget.DotTextView;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemBaseHealthBinding implements a {
    private final PreferenceRelativeLayout rootView;
    public final DotTextView tvTime;
    public final TextView tvUnit;
    public final TextView tvValue;

    private ItemBaseHealthBinding(PreferenceRelativeLayout preferenceRelativeLayout, DotTextView dotTextView, TextView textView, TextView textView2) {
        this.rootView = preferenceRelativeLayout;
        this.tvTime = dotTextView;
        this.tvUnit = textView;
        this.tvValue = textView2;
    }

    public static ItemBaseHealthBinding bind(View view) {
        int i10 = R.id.tv_time;
        DotTextView dotTextView = (DotTextView) c.m(view, R.id.tv_time);
        if (dotTextView != null) {
            i10 = R.id.tv_unit;
            TextView textView = (TextView) c.m(view, R.id.tv_unit);
            if (textView != null) {
                i10 = R.id.tv_value;
                TextView textView2 = (TextView) c.m(view, R.id.tv_value);
                if (textView2 != null) {
                    return new ItemBaseHealthBinding((PreferenceRelativeLayout) view, dotTextView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemBaseHealthBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBaseHealthBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_base_health, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public PreferenceRelativeLayout getRoot() {
        return this.rootView;
    }
}
