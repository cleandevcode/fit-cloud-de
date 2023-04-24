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
public final class FragmentSportPaceBinding implements a {
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final TextView tvAvgPace;
    public final TextView tvMaxPace;
    public final TextView tvMinPace;

    private FragmentSportPaceBinding(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.recyclerView = recyclerView;
        this.tvAvgPace = textView;
        this.tvMaxPace = textView2;
        this.tvMinPace = textView3;
    }

    public static FragmentSportPaceBinding bind(View view) {
        int i10 = R.id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
        if (recyclerView != null) {
            i10 = R.id.tv_avg_pace;
            TextView textView = (TextView) c.m(view, R.id.tv_avg_pace);
            if (textView != null) {
                i10 = R.id.tv_max_pace;
                TextView textView2 = (TextView) c.m(view, R.id.tv_max_pace);
                if (textView2 != null) {
                    i10 = R.id.tv_min_pace;
                    TextView textView3 = (TextView) c.m(view, R.id.tv_min_pace);
                    if (textView3 != null) {
                        return new FragmentSportPaceBinding((LinearLayout) view, recyclerView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSportPaceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSportPaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sport_pace, viewGroup, false);
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
