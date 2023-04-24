package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloud.pro.ui.widget.StepProgressView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class LayoutHomePageStepInfoBinding implements a {
    public final FrameLayout layoutStepCount;
    public final LinearLayout layoutStepCountNumbers;
    public final LinearLayout layoutStepDetail;
    private final View rootView;
    public final StepProgressView stepProgressView;
    public final TextView tvCurrentStepCount;
    public final TextView tvGoalPercent;
    public final TextView tvTodayGoalText;
    public final TextView tvTodayGoalValue;
    public final TextView tvTotalConsumedText;
    public final TextView tvTotalConsumedUnit;
    public final TextView tvTotalConsumedValue;
    public final TextView tvTotalDistanceText;
    public final TextView tvTotalDistanceUnit;
    public final TextView tvTotalDistanceValue;

    private LayoutHomePageStepInfoBinding(View view, FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, StepProgressView stepProgressView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        this.rootView = view;
        this.layoutStepCount = frameLayout;
        this.layoutStepCountNumbers = linearLayout;
        this.layoutStepDetail = linearLayout2;
        this.stepProgressView = stepProgressView;
        this.tvCurrentStepCount = textView;
        this.tvGoalPercent = textView2;
        this.tvTodayGoalText = textView3;
        this.tvTodayGoalValue = textView4;
        this.tvTotalConsumedText = textView5;
        this.tvTotalConsumedUnit = textView6;
        this.tvTotalConsumedValue = textView7;
        this.tvTotalDistanceText = textView8;
        this.tvTotalDistanceUnit = textView9;
        this.tvTotalDistanceValue = textView10;
    }

    public static LayoutHomePageStepInfoBinding bind(View view) {
        int i10 = R.id.layout_step_count;
        FrameLayout frameLayout = (FrameLayout) c.m(view, R.id.layout_step_count);
        if (frameLayout != null) {
            i10 = R.id.layout_step_count_numbers;
            LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_step_count_numbers);
            if (linearLayout != null) {
                i10 = R.id.layout_step_detail;
                LinearLayout linearLayout2 = (LinearLayout) c.m(view, R.id.layout_step_detail);
                if (linearLayout2 != null) {
                    i10 = R.id.step_progress_view;
                    StepProgressView stepProgressView = (StepProgressView) c.m(view, R.id.step_progress_view);
                    if (stepProgressView != null) {
                        i10 = R.id.tv_current_step_count;
                        TextView textView = (TextView) c.m(view, R.id.tv_current_step_count);
                        if (textView != null) {
                            i10 = R.id.tv_goal_percent;
                            TextView textView2 = (TextView) c.m(view, R.id.tv_goal_percent);
                            if (textView2 != null) {
                                i10 = R.id.tv_today_goal_text;
                                TextView textView3 = (TextView) c.m(view, R.id.tv_today_goal_text);
                                if (textView3 != null) {
                                    i10 = R.id.tv_today_goal_value;
                                    TextView textView4 = (TextView) c.m(view, R.id.tv_today_goal_value);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_total_consumed_text;
                                        TextView textView5 = (TextView) c.m(view, R.id.tv_total_consumed_text);
                                        if (textView5 != null) {
                                            i10 = R.id.tv_total_consumed_unit;
                                            TextView textView6 = (TextView) c.m(view, R.id.tv_total_consumed_unit);
                                            if (textView6 != null) {
                                                i10 = R.id.tv_total_consumed_value;
                                                TextView textView7 = (TextView) c.m(view, R.id.tv_total_consumed_value);
                                                if (textView7 != null) {
                                                    i10 = R.id.tv_total_distance_text;
                                                    TextView textView8 = (TextView) c.m(view, R.id.tv_total_distance_text);
                                                    if (textView8 != null) {
                                                        i10 = R.id.tv_total_distance_unit;
                                                        TextView textView9 = (TextView) c.m(view, R.id.tv_total_distance_unit);
                                                        if (textView9 != null) {
                                                            i10 = R.id.tv_total_distance_value;
                                                            TextView textView10 = (TextView) c.m(view, R.id.tv_total_distance_value);
                                                            if (textView10 != null) {
                                                                return new LayoutHomePageStepInfoBinding(view, frameLayout, linearLayout, linearLayout2, stepProgressView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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

    public static LayoutHomePageStepInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.layout_home_page_step_info, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // a3.a
    public View getRoot() {
        return this.rootView;
    }
}
