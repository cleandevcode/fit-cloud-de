package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemSportDetailGirdBinding implements a {
    private final LinearLayout rootView;
    public final TextView tvText;
    public final TextView tvValue;

    private ItemSportDetailGirdBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.tvText = textView;
        this.tvValue = textView2;
    }

    public static ItemSportDetailGirdBinding bind(View view) {
        int i10 = R.id.tv_text;
        TextView textView = (TextView) c.m(view, R.id.tv_text);
        if (textView != null) {
            i10 = R.id.tv_value;
            TextView textView2 = (TextView) c.m(view, R.id.tv_value);
            if (textView2 != null) {
                return new ItemSportDetailGirdBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemSportDetailGirdBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSportDetailGirdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_sport_detail_gird, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
