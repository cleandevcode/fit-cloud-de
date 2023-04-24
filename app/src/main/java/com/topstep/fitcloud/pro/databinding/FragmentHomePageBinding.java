package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import b0.c;
import com.github.kilnn.refreshloadlayout.RefreshLoadLayout;
import com.github.kilnn.tool.widget.FitPaddingMaterialToolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.topstep.fitcloud.pro.ui.widget.HomePageStepInfoLayout;
import com.topstep.fitcloud.pro.ui.widget.module.Text1ModuleItemView;
import com.topstep.fitcloud.pro.ui.widget.module.Text2ModuleItemView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentHomePageBinding implements a {
    public final AppBarLayout appBarLayout;
    public final Button btnHealthTest;
    public final Text1ModuleItemView layoutBloodPressure;
    public final Text1ModuleItemView layoutEcg;
    public final Text1ModuleItemView layoutHeartRate;
    public final Text1ModuleItemView layoutOxygen;
    public final Text1ModuleItemView layoutPressure;
    public final RefreshLoadLayout layoutRefreshLoad;
    public final Text1ModuleItemView layoutSleep;
    public final HomePageStepInfoLayout layoutStepInfo;
    public final Text2ModuleItemView layoutTemperature;
    public final Text2ModuleItemView layoutWh;
    private final FrameLayout rootView;
    public final NestedScrollView scrollView;
    public final FitPaddingMaterialToolbar toolbar;

    private FragmentHomePageBinding(FrameLayout frameLayout, AppBarLayout appBarLayout, Button button, Text1ModuleItemView text1ModuleItemView, Text1ModuleItemView text1ModuleItemView2, Text1ModuleItemView text1ModuleItemView3, Text1ModuleItemView text1ModuleItemView4, Text1ModuleItemView text1ModuleItemView5, RefreshLoadLayout refreshLoadLayout, Text1ModuleItemView text1ModuleItemView6, HomePageStepInfoLayout homePageStepInfoLayout, Text2ModuleItemView text2ModuleItemView, Text2ModuleItemView text2ModuleItemView2, NestedScrollView nestedScrollView, FitPaddingMaterialToolbar fitPaddingMaterialToolbar) {
        this.rootView = frameLayout;
        this.appBarLayout = appBarLayout;
        this.btnHealthTest = button;
        this.layoutBloodPressure = text1ModuleItemView;
        this.layoutEcg = text1ModuleItemView2;
        this.layoutHeartRate = text1ModuleItemView3;
        this.layoutOxygen = text1ModuleItemView4;
        this.layoutPressure = text1ModuleItemView5;
        this.layoutRefreshLoad = refreshLoadLayout;
        this.layoutSleep = text1ModuleItemView6;
        this.layoutStepInfo = homePageStepInfoLayout;
        this.layoutTemperature = text2ModuleItemView;
        this.layoutWh = text2ModuleItemView2;
        this.scrollView = nestedScrollView;
        this.toolbar = fitPaddingMaterialToolbar;
    }

    public static FragmentHomePageBinding bind(View view) {
        int i10 = R.id.app_bar_layout;
        AppBarLayout appBarLayout = (AppBarLayout) c.m(view, R.id.app_bar_layout);
        if (appBarLayout != null) {
            i10 = R.id.btn_health_test;
            Button button = (Button) c.m(view, R.id.btn_health_test);
            if (button != null) {
                i10 = R.id.layout_blood_pressure;
                Text1ModuleItemView text1ModuleItemView = (Text1ModuleItemView) c.m(view, R.id.layout_blood_pressure);
                if (text1ModuleItemView != null) {
                    i10 = R.id.layout_ecg;
                    Text1ModuleItemView text1ModuleItemView2 = (Text1ModuleItemView) c.m(view, R.id.layout_ecg);
                    if (text1ModuleItemView2 != null) {
                        i10 = R.id.layout_heart_rate;
                        Text1ModuleItemView text1ModuleItemView3 = (Text1ModuleItemView) c.m(view, R.id.layout_heart_rate);
                        if (text1ModuleItemView3 != null) {
                            i10 = R.id.layout_oxygen;
                            Text1ModuleItemView text1ModuleItemView4 = (Text1ModuleItemView) c.m(view, R.id.layout_oxygen);
                            if (text1ModuleItemView4 != null) {
                                i10 = R.id.layout_pressure;
                                Text1ModuleItemView text1ModuleItemView5 = (Text1ModuleItemView) c.m(view, R.id.layout_pressure);
                                if (text1ModuleItemView5 != null) {
                                    i10 = R.id.layout_refresh_load;
                                    RefreshLoadLayout refreshLoadLayout = (RefreshLoadLayout) c.m(view, R.id.layout_refresh_load);
                                    if (refreshLoadLayout != null) {
                                        i10 = R.id.layout_sleep;
                                        Text1ModuleItemView text1ModuleItemView6 = (Text1ModuleItemView) c.m(view, R.id.layout_sleep);
                                        if (text1ModuleItemView6 != null) {
                                            i10 = R.id.layout_step_info;
                                            HomePageStepInfoLayout homePageStepInfoLayout = (HomePageStepInfoLayout) c.m(view, R.id.layout_step_info);
                                            if (homePageStepInfoLayout != null) {
                                                i10 = R.id.layout_temperature;
                                                Text2ModuleItemView text2ModuleItemView = (Text2ModuleItemView) c.m(view, R.id.layout_temperature);
                                                if (text2ModuleItemView != null) {
                                                    i10 = R.id.layout_wh;
                                                    Text2ModuleItemView text2ModuleItemView2 = (Text2ModuleItemView) c.m(view, R.id.layout_wh);
                                                    if (text2ModuleItemView2 != null) {
                                                        i10 = R.id.scroll_view;
                                                        NestedScrollView nestedScrollView = (NestedScrollView) c.m(view, R.id.scroll_view);
                                                        if (nestedScrollView != null) {
                                                            i10 = R.id.toolbar;
                                                            FitPaddingMaterialToolbar fitPaddingMaterialToolbar = (FitPaddingMaterialToolbar) c.m(view, R.id.toolbar);
                                                            if (fitPaddingMaterialToolbar != null) {
                                                                return new FragmentHomePageBinding((FrameLayout) view, appBarLayout, button, text1ModuleItemView, text1ModuleItemView2, text1ModuleItemView3, text1ModuleItemView4, text1ModuleItemView5, refreshLoadLayout, text1ModuleItemView6, homePageStepInfoLayout, text2ModuleItemView, text2ModuleItemView2, nestedScrollView, fitPaddingMaterialToolbar);
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

    public static FragmentHomePageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentHomePageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_home_page, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
