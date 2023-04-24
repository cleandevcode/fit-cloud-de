package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.c;
import com.github.kilnn.tool.widget.DotTextView;
import com.github.kilnn.tool.widget.FitPaddingMaterialToolbar;
import com.github.mikephil.charting.charts.BarChart;
import com.google.android.material.appbar.AppBarLayout;
import com.topstep.fitcloud.pro.ui.widget.SleepDayView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentSleepBinding implements a {
    public final AppBarLayout appbar;
    public final BarChart chart;
    public final DotTextView dotSober;
    public final DotTextView dotViewSleepDeep;
    public final DotTextView dotViewSleepLight;
    public final RadioButton rbDay;
    public final RadioButton rbMonth;
    public final RadioButton rbWeek;
    public final RadioGroup rgData;
    private final CoordinatorLayout rootView;
    public final SleepDayView sleepDayView;
    public final FitPaddingMaterialToolbar toolbar;
    public final TextView tvSleepDeep;
    public final TextView tvSleepLight;
    public final TextView tvSleepSober;
    public final TextView tvSleepTotal;
    public final DotTextView tvSleepTotalDes;
    public final TextView tvTodayDataDes;

    private FragmentSleepBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, BarChart barChart, DotTextView dotTextView, DotTextView dotTextView2, DotTextView dotTextView3, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioGroup radioGroup, SleepDayView sleepDayView, FitPaddingMaterialToolbar fitPaddingMaterialToolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, DotTextView dotTextView4, TextView textView5) {
        this.rootView = coordinatorLayout;
        this.appbar = appBarLayout;
        this.chart = barChart;
        this.dotSober = dotTextView;
        this.dotViewSleepDeep = dotTextView2;
        this.dotViewSleepLight = dotTextView3;
        this.rbDay = radioButton;
        this.rbMonth = radioButton2;
        this.rbWeek = radioButton3;
        this.rgData = radioGroup;
        this.sleepDayView = sleepDayView;
        this.toolbar = fitPaddingMaterialToolbar;
        this.tvSleepDeep = textView;
        this.tvSleepLight = textView2;
        this.tvSleepSober = textView3;
        this.tvSleepTotal = textView4;
        this.tvSleepTotalDes = dotTextView4;
        this.tvTodayDataDes = textView5;
    }

    public static FragmentSleepBinding bind(View view) {
        int i10 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) c.m(view, R.id.appbar);
        if (appBarLayout != null) {
            i10 = R.id.chart;
            BarChart barChart = (BarChart) c.m(view, R.id.chart);
            if (barChart != null) {
                i10 = R.id.dot_sober;
                DotTextView dotTextView = (DotTextView) c.m(view, R.id.dot_sober);
                if (dotTextView != null) {
                    i10 = R.id.dot_view_sleep_deep;
                    DotTextView dotTextView2 = (DotTextView) c.m(view, R.id.dot_view_sleep_deep);
                    if (dotTextView2 != null) {
                        i10 = R.id.dot_view_sleep_light;
                        DotTextView dotTextView3 = (DotTextView) c.m(view, R.id.dot_view_sleep_light);
                        if (dotTextView3 != null) {
                            i10 = R.id.rb_day;
                            RadioButton radioButton = (RadioButton) c.m(view, R.id.rb_day);
                            if (radioButton != null) {
                                i10 = R.id.rb_month;
                                RadioButton radioButton2 = (RadioButton) c.m(view, R.id.rb_month);
                                if (radioButton2 != null) {
                                    i10 = R.id.rb_week;
                                    RadioButton radioButton3 = (RadioButton) c.m(view, R.id.rb_week);
                                    if (radioButton3 != null) {
                                        i10 = R.id.rg_data;
                                        RadioGroup radioGroup = (RadioGroup) c.m(view, R.id.rg_data);
                                        if (radioGroup != null) {
                                            i10 = R.id.sleep_day_view;
                                            SleepDayView sleepDayView = (SleepDayView) c.m(view, R.id.sleep_day_view);
                                            if (sleepDayView != null) {
                                                i10 = R.id.toolbar;
                                                FitPaddingMaterialToolbar fitPaddingMaterialToolbar = (FitPaddingMaterialToolbar) c.m(view, R.id.toolbar);
                                                if (fitPaddingMaterialToolbar != null) {
                                                    i10 = R.id.tv_sleep_deep;
                                                    TextView textView = (TextView) c.m(view, R.id.tv_sleep_deep);
                                                    if (textView != null) {
                                                        i10 = R.id.tv_sleep_light;
                                                        TextView textView2 = (TextView) c.m(view, R.id.tv_sleep_light);
                                                        if (textView2 != null) {
                                                            i10 = R.id.tv_sleep_sober;
                                                            TextView textView3 = (TextView) c.m(view, R.id.tv_sleep_sober);
                                                            if (textView3 != null) {
                                                                i10 = R.id.tv_sleep_total;
                                                                TextView textView4 = (TextView) c.m(view, R.id.tv_sleep_total);
                                                                if (textView4 != null) {
                                                                    i10 = R.id.tv_sleep_total_des;
                                                                    DotTextView dotTextView4 = (DotTextView) c.m(view, R.id.tv_sleep_total_des);
                                                                    if (dotTextView4 != null) {
                                                                        i10 = R.id.tv_today_data_des;
                                                                        TextView textView5 = (TextView) c.m(view, R.id.tv_today_data_des);
                                                                        if (textView5 != null) {
                                                                            return new FragmentSleepBinding((CoordinatorLayout) view, appBarLayout, barChart, dotTextView, dotTextView2, dotTextView3, radioButton, radioButton2, radioButton3, radioGroup, sleepDayView, fitPaddingMaterialToolbar, textView, textView2, textView3, textView4, dotTextView4, textView5);
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

    public static FragmentSleepBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSleepBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sleep, viewGroup, false);
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
