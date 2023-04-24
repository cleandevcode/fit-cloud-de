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
public final class ItemSportHistorySeparatorBinding implements a {
    private final LinearLayout rootView;
    public final TextView tvCount;
    public final TextView tvDate;
    public final TextView tvDistance;
    public final TextView tvDistanceUnit;
    public final View viewGap;

    private ItemSportHistorySeparatorBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view) {
        this.rootView = linearLayout;
        this.tvCount = textView;
        this.tvDate = textView2;
        this.tvDistance = textView3;
        this.tvDistanceUnit = textView4;
        this.viewGap = view;
    }

    public static ItemSportHistorySeparatorBinding bind(View view) {
        int i10 = R.id.tv_count;
        TextView textView = (TextView) c.m(view, R.id.tv_count);
        if (textView != null) {
            i10 = R.id.tv_date;
            TextView textView2 = (TextView) c.m(view, R.id.tv_date);
            if (textView2 != null) {
                i10 = R.id.tv_distance;
                TextView textView3 = (TextView) c.m(view, R.id.tv_distance);
                if (textView3 != null) {
                    i10 = R.id.tv_distance_unit;
                    TextView textView4 = (TextView) c.m(view, R.id.tv_distance_unit);
                    if (textView4 != null) {
                        i10 = R.id.view_gap;
                        View m10 = c.m(view, R.id.view_gap);
                        if (m10 != null) {
                            return new ItemSportHistorySeparatorBinding((LinearLayout) view, textView, textView2, textView3, textView4, m10);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemSportHistorySeparatorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSportHistorySeparatorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_sport_history_separator, viewGroup, false);
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
