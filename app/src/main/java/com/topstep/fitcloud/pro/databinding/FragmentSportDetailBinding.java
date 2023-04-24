package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentSportDetailBinding implements a {
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final TextView tvMainAttr;
    public final TextView tvMainAttrUnit;
    public final TextView tvTime;

    private FragmentSportDetailBinding(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.recyclerView = recyclerView;
        this.tvMainAttr = textView;
        this.tvMainAttrUnit = textView2;
        this.tvTime = textView3;
    }

    public static FragmentSportDetailBinding bind(View view) {
        int i10 = R.id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
        if (recyclerView != null) {
            i10 = R.id.tv_main_attr;
            TextView textView = (TextView) c.m(view, R.id.tv_main_attr);
            if (textView != null) {
                i10 = R.id.tv_main_attr_unit;
                TextView textView2 = (TextView) c.m(view, R.id.tv_main_attr_unit);
                if (textView2 != null) {
                    i10 = R.id.tv_time;
                    TextView textView3 = (TextView) c.m(view, R.id.tv_time);
                    if (textView3 != null) {
                        return new FragmentSportDetailBinding((LinearLayout) view, recyclerView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSportDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSportDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sport_detail, viewGroup, false);
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
