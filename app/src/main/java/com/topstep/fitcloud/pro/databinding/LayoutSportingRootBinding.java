package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.c;
import com.github.kilnn.tool.widget.FitPaddingMaterialToolbar;
import com.google.android.material.circularreveal.CircularRevealFrameLayout;
import com.topstep.fitcloud.pro.ui.widget.GpsSignalView;
import com.topstep.fitcloud.pro.ui.widget.LongPressTurnAroundLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class LayoutSportingRootBinding implements a {
    public final GpsSignalView gpsSignalView;
    public final ImageView imgChangeModeToMap;
    public final ImageView imgNormalLeftIcon;
    public final LinearLayout layoutNormalData;
    public final ConstraintLayout layoutNormalMode;
    public final FrameLayout layoutSportAction;
    public final LongPressTurnAroundLayout pauseView;
    public final TextView resumeView;
    private final CircularRevealFrameLayout rootView;
    public final TextView stopView;
    public final FitPaddingMaterialToolbar toolBar;
    public final TextView tvNormalCalorieValue;
    public final TextView tvNormalDuration;
    public final TextView tvNormalLeftValue;
    public final TextView tvNormalMainValue;
    public final TextView tvNormalMainValueUnit;
    public final TextView tvSportGoal;
    public final ViewStub viewStubMapContainer;

    private LayoutSportingRootBinding(CircularRevealFrameLayout circularRevealFrameLayout, GpsSignalView gpsSignalView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, ConstraintLayout constraintLayout, FrameLayout frameLayout, LongPressTurnAroundLayout longPressTurnAroundLayout, TextView textView, TextView textView2, FitPaddingMaterialToolbar fitPaddingMaterialToolbar, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, ViewStub viewStub) {
        this.rootView = circularRevealFrameLayout;
        this.gpsSignalView = gpsSignalView;
        this.imgChangeModeToMap = imageView;
        this.imgNormalLeftIcon = imageView2;
        this.layoutNormalData = linearLayout;
        this.layoutNormalMode = constraintLayout;
        this.layoutSportAction = frameLayout;
        this.pauseView = longPressTurnAroundLayout;
        this.resumeView = textView;
        this.stopView = textView2;
        this.toolBar = fitPaddingMaterialToolbar;
        this.tvNormalCalorieValue = textView3;
        this.tvNormalDuration = textView4;
        this.tvNormalLeftValue = textView5;
        this.tvNormalMainValue = textView6;
        this.tvNormalMainValueUnit = textView7;
        this.tvSportGoal = textView8;
        this.viewStubMapContainer = viewStub;
    }

    public static LayoutSportingRootBinding bind(View view) {
        int i10 = R.id.gps_signal_view;
        GpsSignalView gpsSignalView = (GpsSignalView) c.m(view, R.id.gps_signal_view);
        if (gpsSignalView != null) {
            i10 = R.id.img_change_mode_to_map;
            ImageView imageView = (ImageView) c.m(view, R.id.img_change_mode_to_map);
            if (imageView != null) {
                i10 = R.id.img_normal_left_icon;
                ImageView imageView2 = (ImageView) c.m(view, R.id.img_normal_left_icon);
                if (imageView2 != null) {
                    i10 = R.id.layout_normal_data;
                    LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_normal_data);
                    if (linearLayout != null) {
                        i10 = R.id.layout_normal_mode;
                        ConstraintLayout constraintLayout = (ConstraintLayout) c.m(view, R.id.layout_normal_mode);
                        if (constraintLayout != null) {
                            i10 = R.id.layout_sport_action;
                            FrameLayout frameLayout = (FrameLayout) c.m(view, R.id.layout_sport_action);
                            if (frameLayout != null) {
                                i10 = R.id.pause_view;
                                LongPressTurnAroundLayout longPressTurnAroundLayout = (LongPressTurnAroundLayout) c.m(view, R.id.pause_view);
                                if (longPressTurnAroundLayout != null) {
                                    i10 = R.id.resume_view;
                                    TextView textView = (TextView) c.m(view, R.id.resume_view);
                                    if (textView != null) {
                                        i10 = R.id.stop_view;
                                        TextView textView2 = (TextView) c.m(view, R.id.stop_view);
                                        if (textView2 != null) {
                                            i10 = R.id.tool_bar;
                                            FitPaddingMaterialToolbar fitPaddingMaterialToolbar = (FitPaddingMaterialToolbar) c.m(view, R.id.tool_bar);
                                            if (fitPaddingMaterialToolbar != null) {
                                                i10 = R.id.tv_normal_calorie_value;
                                                TextView textView3 = (TextView) c.m(view, R.id.tv_normal_calorie_value);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_normal_duration;
                                                    TextView textView4 = (TextView) c.m(view, R.id.tv_normal_duration);
                                                    if (textView4 != null) {
                                                        i10 = R.id.tv_normal_left_value;
                                                        TextView textView5 = (TextView) c.m(view, R.id.tv_normal_left_value);
                                                        if (textView5 != null) {
                                                            i10 = R.id.tv_normal_main_value;
                                                            TextView textView6 = (TextView) c.m(view, R.id.tv_normal_main_value);
                                                            if (textView6 != null) {
                                                                i10 = R.id.tv_normal_main_value_unit;
                                                                TextView textView7 = (TextView) c.m(view, R.id.tv_normal_main_value_unit);
                                                                if (textView7 != null) {
                                                                    i10 = R.id.tv_sport_goal;
                                                                    TextView textView8 = (TextView) c.m(view, R.id.tv_sport_goal);
                                                                    if (textView8 != null) {
                                                                        i10 = R.id.view_stub_map_container;
                                                                        ViewStub viewStub = (ViewStub) c.m(view, R.id.view_stub_map_container);
                                                                        if (viewStub != null) {
                                                                            return new LayoutSportingRootBinding((CircularRevealFrameLayout) view, gpsSignalView, imageView, imageView2, linearLayout, constraintLayout, frameLayout, longPressTurnAroundLayout, textView, textView2, fitPaddingMaterialToolbar, textView3, textView4, textView5, textView6, textView7, textView8, viewStub);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutSportingRootBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutSportingRootBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.layout_sporting_root, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public CircularRevealFrameLayout getRoot() {
        return this.rootView;
    }
}
