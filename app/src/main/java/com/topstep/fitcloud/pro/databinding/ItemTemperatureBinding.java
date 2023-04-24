package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.c;
import com.github.kilnn.tool.widget.DotTextView;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemTemperatureBinding implements a {
    public final ConstraintLayout layoutValue;
    private final PreferenceRelativeLayout rootView;
    public final TextView tvBodyUnit;
    public final TextView tvBodyValue;
    public final DotTextView tvTime;
    public final TextView tvWristUnit;
    public final TextView tvWristValue;

    private ItemTemperatureBinding(PreferenceRelativeLayout preferenceRelativeLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, DotTextView dotTextView, TextView textView3, TextView textView4) {
        this.rootView = preferenceRelativeLayout;
        this.layoutValue = constraintLayout;
        this.tvBodyUnit = textView;
        this.tvBodyValue = textView2;
        this.tvTime = dotTextView;
        this.tvWristUnit = textView3;
        this.tvWristValue = textView4;
    }

    public static ItemTemperatureBinding bind(View view) {
        int i10 = R.id.layout_value;
        ConstraintLayout constraintLayout = (ConstraintLayout) c.m(view, R.id.layout_value);
        if (constraintLayout != null) {
            i10 = R.id.tv_body_unit;
            TextView textView = (TextView) c.m(view, R.id.tv_body_unit);
            if (textView != null) {
                i10 = R.id.tv_body_value;
                TextView textView2 = (TextView) c.m(view, R.id.tv_body_value);
                if (textView2 != null) {
                    i10 = R.id.tv_time;
                    DotTextView dotTextView = (DotTextView) c.m(view, R.id.tv_time);
                    if (dotTextView != null) {
                        i10 = R.id.tv_wrist_unit;
                        TextView textView3 = (TextView) c.m(view, R.id.tv_wrist_unit);
                        if (textView3 != null) {
                            i10 = R.id.tv_wrist_value;
                            TextView textView4 = (TextView) c.m(view, R.id.tv_wrist_value);
                            if (textView4 != null) {
                                return new ItemTemperatureBinding((PreferenceRelativeLayout) view, constraintLayout, textView, textView2, dotTextView, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemTemperatureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemTemperatureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_temperature, viewGroup, false);
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
