package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.c;
import com.github.kilnn.tool.widget.FitPaddingMaterialToolbar;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.google.android.material.appbar.AppBarLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentHealthMonitorBinding implements a {
    public final AppBarLayout appbar;
    public final ImageView imgIcon;
    public final PreferenceItem itemBloodPressureAlarm;
    public final PreferenceItem itemDetailEnabled;
    public final PreferenceItem itemEndTime;
    public final PreferenceItem itemHeartRateAlarm;
    public final PreferenceItem itemStartTime;
    public final LinearLayout layoutContent;
    public final LinearLayout layoutDetail;
    private final CoordinatorLayout rootView;
    public final FitPaddingMaterialToolbar toolbar;
    public final TextView tvTips;

    private FragmentHealthMonitorBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ImageView imageView, PreferenceItem preferenceItem, PreferenceItem preferenceItem2, PreferenceItem preferenceItem3, PreferenceItem preferenceItem4, PreferenceItem preferenceItem5, LinearLayout linearLayout, LinearLayout linearLayout2, FitPaddingMaterialToolbar fitPaddingMaterialToolbar, TextView textView) {
        this.rootView = coordinatorLayout;
        this.appbar = appBarLayout;
        this.imgIcon = imageView;
        this.itemBloodPressureAlarm = preferenceItem;
        this.itemDetailEnabled = preferenceItem2;
        this.itemEndTime = preferenceItem3;
        this.itemHeartRateAlarm = preferenceItem4;
        this.itemStartTime = preferenceItem5;
        this.layoutContent = linearLayout;
        this.layoutDetail = linearLayout2;
        this.toolbar = fitPaddingMaterialToolbar;
        this.tvTips = textView;
    }

    public static FragmentHealthMonitorBinding bind(View view) {
        int i10 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) c.m(view, R.id.appbar);
        if (appBarLayout != null) {
            i10 = R.id.img_icon;
            ImageView imageView = (ImageView) c.m(view, R.id.img_icon);
            if (imageView != null) {
                i10 = R.id.item_blood_pressure_alarm;
                PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_blood_pressure_alarm);
                if (preferenceItem != null) {
                    i10 = R.id.item_detail_enabled;
                    PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_detail_enabled);
                    if (preferenceItem2 != null) {
                        i10 = R.id.item_end_time;
                        PreferenceItem preferenceItem3 = (PreferenceItem) c.m(view, R.id.item_end_time);
                        if (preferenceItem3 != null) {
                            i10 = R.id.item_heart_rate_alarm;
                            PreferenceItem preferenceItem4 = (PreferenceItem) c.m(view, R.id.item_heart_rate_alarm);
                            if (preferenceItem4 != null) {
                                i10 = R.id.item_start_time;
                                PreferenceItem preferenceItem5 = (PreferenceItem) c.m(view, R.id.item_start_time);
                                if (preferenceItem5 != null) {
                                    i10 = R.id.layout_content;
                                    LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_content);
                                    if (linearLayout != null) {
                                        i10 = R.id.layout_detail;
                                        LinearLayout linearLayout2 = (LinearLayout) c.m(view, R.id.layout_detail);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.toolbar;
                                            FitPaddingMaterialToolbar fitPaddingMaterialToolbar = (FitPaddingMaterialToolbar) c.m(view, R.id.toolbar);
                                            if (fitPaddingMaterialToolbar != null) {
                                                i10 = R.id.tv_tips;
                                                TextView textView = (TextView) c.m(view, R.id.tv_tips);
                                                if (textView != null) {
                                                    return new FragmentHealthMonitorBinding((CoordinatorLayout) view, appBarLayout, imageView, preferenceItem, preferenceItem2, preferenceItem3, preferenceItem4, preferenceItem5, linearLayout, linearLayout2, fitPaddingMaterialToolbar, textView);
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

    public static FragmentHealthMonitorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentHealthMonitorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_health_monitor, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
