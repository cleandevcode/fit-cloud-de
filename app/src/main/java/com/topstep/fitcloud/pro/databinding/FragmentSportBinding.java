package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.c;
import com.github.kilnn.tool.widget.FitPaddingMaterialToolbar;
import com.topstep.fitcloud.pro.ui.widget.GpsSignalView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentSportBinding implements a {
    public final Button btnCumulative;
    public final GpsSignalView gpsSignalView;
    public final LayoutSportStartTypeBinding layoutSportType;
    private final ConstraintLayout rootView;
    public final FitPaddingMaterialToolbar toolbar;
    public final TextView tvTotalDistance;
    public final TextView tvTotalDistanceTitle;
    public final TextView tvTotalDistanceUnit;

    private FragmentSportBinding(ConstraintLayout constraintLayout, Button button, GpsSignalView gpsSignalView, LayoutSportStartTypeBinding layoutSportStartTypeBinding, FitPaddingMaterialToolbar fitPaddingMaterialToolbar, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.btnCumulative = button;
        this.gpsSignalView = gpsSignalView;
        this.layoutSportType = layoutSportStartTypeBinding;
        this.toolbar = fitPaddingMaterialToolbar;
        this.tvTotalDistance = textView;
        this.tvTotalDistanceTitle = textView2;
        this.tvTotalDistanceUnit = textView3;
    }

    public static FragmentSportBinding bind(View view) {
        int i10 = R.id.btn_cumulative;
        Button button = (Button) c.m(view, R.id.btn_cumulative);
        if (button != null) {
            i10 = R.id.gps_signal_view;
            GpsSignalView gpsSignalView = (GpsSignalView) c.m(view, R.id.gps_signal_view);
            if (gpsSignalView != null) {
                i10 = R.id.layout_sport_type;
                View m10 = c.m(view, R.id.layout_sport_type);
                if (m10 != null) {
                    LayoutSportStartTypeBinding bind = LayoutSportStartTypeBinding.bind(m10);
                    i10 = R.id.toolbar;
                    FitPaddingMaterialToolbar fitPaddingMaterialToolbar = (FitPaddingMaterialToolbar) c.m(view, R.id.toolbar);
                    if (fitPaddingMaterialToolbar != null) {
                        i10 = R.id.tv_total_distance;
                        TextView textView = (TextView) c.m(view, R.id.tv_total_distance);
                        if (textView != null) {
                            i10 = R.id.tv_total_distance_title;
                            TextView textView2 = (TextView) c.m(view, R.id.tv_total_distance_title);
                            if (textView2 != null) {
                                i10 = R.id.tv_total_distance_unit;
                                TextView textView3 = (TextView) c.m(view, R.id.tv_total_distance_unit);
                                if (textView3 != null) {
                                    return new FragmentSportBinding((ConstraintLayout) view, button, gpsSignalView, bind, fitPaddingMaterialToolbar, textView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSportBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSportBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sport, viewGroup, false);
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
