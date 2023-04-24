package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloud.pro.ui.sport.detail.HeartRateCircleChart;
import com.topstep.fitcloud.pro.ui.sport.detail.HeartRateLineChart;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentSportChartBinding implements a {
    public final HeartRateCircleChart circleChart;
    public final View heartRateView1;
    public final View heartRateView2;
    public final View heartRateView3;
    public final View heartRateView4;
    public final View heartRateView5;
    public final HeartRateLineChart lineChart;
    private final LinearLayout rootView;
    public final TextView tvAvgHeartRate;
    public final TextView tvHeartRateText1;
    public final TextView tvHeartRateText2;
    public final TextView tvHeartRateText3;
    public final TextView tvHeartRateText4;
    public final TextView tvHeartRateText5;
    public final TextView tvHeartRateValue1;
    public final TextView tvHeartRateValue2;
    public final TextView tvHeartRateValue3;
    public final TextView tvHeartRateValue4;
    public final TextView tvHeartRateValue5;
    public final TextView tvMaxHeartRate;

    private FragmentSportChartBinding(LinearLayout linearLayout, HeartRateCircleChart heartRateCircleChart, View view, View view2, View view3, View view4, View view5, HeartRateLineChart heartRateLineChart, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        this.rootView = linearLayout;
        this.circleChart = heartRateCircleChart;
        this.heartRateView1 = view;
        this.heartRateView2 = view2;
        this.heartRateView3 = view3;
        this.heartRateView4 = view4;
        this.heartRateView5 = view5;
        this.lineChart = heartRateLineChart;
        this.tvAvgHeartRate = textView;
        this.tvHeartRateText1 = textView2;
        this.tvHeartRateText2 = textView3;
        this.tvHeartRateText3 = textView4;
        this.tvHeartRateText4 = textView5;
        this.tvHeartRateText5 = textView6;
        this.tvHeartRateValue1 = textView7;
        this.tvHeartRateValue2 = textView8;
        this.tvHeartRateValue3 = textView9;
        this.tvHeartRateValue4 = textView10;
        this.tvHeartRateValue5 = textView11;
        this.tvMaxHeartRate = textView12;
    }

    public static FragmentSportChartBinding bind(View view) {
        int i10 = R.id.circle_chart;
        HeartRateCircleChart heartRateCircleChart = (HeartRateCircleChart) c.m(view, R.id.circle_chart);
        if (heartRateCircleChart != null) {
            i10 = R.id.heart_rate_view1;
            View m10 = c.m(view, R.id.heart_rate_view1);
            if (m10 != null) {
                i10 = R.id.heart_rate_view2;
                View m11 = c.m(view, R.id.heart_rate_view2);
                if (m11 != null) {
                    i10 = R.id.heart_rate_view3;
                    View m12 = c.m(view, R.id.heart_rate_view3);
                    if (m12 != null) {
                        i10 = R.id.heart_rate_view4;
                        View m13 = c.m(view, R.id.heart_rate_view4);
                        if (m13 != null) {
                            i10 = R.id.heart_rate_view5;
                            View m14 = c.m(view, R.id.heart_rate_view5);
                            if (m14 != null) {
                                i10 = R.id.line_chart;
                                HeartRateLineChart heartRateLineChart = (HeartRateLineChart) c.m(view, R.id.line_chart);
                                if (heartRateLineChart != null) {
                                    i10 = R.id.tv_avg_heart_rate;
                                    TextView textView = (TextView) c.m(view, R.id.tv_avg_heart_rate);
                                    if (textView != null) {
                                        i10 = R.id.tv_heart_rate_text1;
                                        TextView textView2 = (TextView) c.m(view, R.id.tv_heart_rate_text1);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_heart_rate_text2;
                                            TextView textView3 = (TextView) c.m(view, R.id.tv_heart_rate_text2);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_heart_rate_text3;
                                                TextView textView4 = (TextView) c.m(view, R.id.tv_heart_rate_text3);
                                                if (textView4 != null) {
                                                    i10 = R.id.tv_heart_rate_text4;
                                                    TextView textView5 = (TextView) c.m(view, R.id.tv_heart_rate_text4);
                                                    if (textView5 != null) {
                                                        i10 = R.id.tv_heart_rate_text5;
                                                        TextView textView6 = (TextView) c.m(view, R.id.tv_heart_rate_text5);
                                                        if (textView6 != null) {
                                                            i10 = R.id.tv_heart_rate_value1;
                                                            TextView textView7 = (TextView) c.m(view, R.id.tv_heart_rate_value1);
                                                            if (textView7 != null) {
                                                                i10 = R.id.tv_heart_rate_value2;
                                                                TextView textView8 = (TextView) c.m(view, R.id.tv_heart_rate_value2);
                                                                if (textView8 != null) {
                                                                    i10 = R.id.tv_heart_rate_value3;
                                                                    TextView textView9 = (TextView) c.m(view, R.id.tv_heart_rate_value3);
                                                                    if (textView9 != null) {
                                                                        i10 = R.id.tv_heart_rate_value4;
                                                                        TextView textView10 = (TextView) c.m(view, R.id.tv_heart_rate_value4);
                                                                        if (textView10 != null) {
                                                                            i10 = R.id.tv_heart_rate_value5;
                                                                            TextView textView11 = (TextView) c.m(view, R.id.tv_heart_rate_value5);
                                                                            if (textView11 != null) {
                                                                                i10 = R.id.tv_max_heart_rate;
                                                                                TextView textView12 = (TextView) c.m(view, R.id.tv_max_heart_rate);
                                                                                if (textView12 != null) {
                                                                                    return new FragmentSportChartBinding((LinearLayout) view, heartRateCircleChart, m10, m11, m12, m13, m14, heartRateLineChart, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSportChartBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSportChartBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sport_chart, viewGroup, false);
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
