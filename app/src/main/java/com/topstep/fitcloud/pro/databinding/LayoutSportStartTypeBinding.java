package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class LayoutSportStartTypeBinding implements a {
    private final ConstraintLayout rootView;
    public final TextView tvSportTypeClimb;
    public final TextView tvSportTypeOd;
    public final TextView tvSportTypeWalk;

    private LayoutSportStartTypeBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.tvSportTypeClimb = textView;
        this.tvSportTypeOd = textView2;
        this.tvSportTypeWalk = textView3;
    }

    public static LayoutSportStartTypeBinding bind(View view) {
        int i10 = R.id.tv_sport_type_climb;
        TextView textView = (TextView) c.m(view, R.id.tv_sport_type_climb);
        if (textView != null) {
            i10 = R.id.tv_sport_type_od;
            TextView textView2 = (TextView) c.m(view, R.id.tv_sport_type_od);
            if (textView2 != null) {
                i10 = R.id.tv_sport_type_walk;
                TextView textView3 = (TextView) c.m(view, R.id.tv_sport_type_walk);
                if (textView3 != null) {
                    return new LayoutSportStartTypeBinding((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutSportStartTypeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutSportStartTypeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.layout_sport_start_type, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
