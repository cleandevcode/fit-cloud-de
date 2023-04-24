package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.c;
import com.github.kilnn.tool.widget.FitPaddingMaterialToolbar;
import com.github.mikephil.charting.charts.BarChart;
import com.google.android.material.appbar.AppBarLayout;
import com.topstep.fitcloud.pro.ui.widget.ExerciseCardLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentExerciseBinding implements a {
    public final AppBarLayout appbar;
    public final ExerciseCardLayout cardCalorie;
    public final ExerciseCardLayout cardDistance;
    public final ExerciseCardLayout cardGoal;
    public final ExerciseCardLayout cardStep;
    public final BarChart chart;
    public final RadioButton rbDay;
    public final RadioButton rbMonth;
    public final RadioButton rbWeek;
    public final RadioGroup rgData;
    private final CoordinatorLayout rootView;
    public final FitPaddingMaterialToolbar toolbar;

    private FragmentExerciseBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExerciseCardLayout exerciseCardLayout, ExerciseCardLayout exerciseCardLayout2, ExerciseCardLayout exerciseCardLayout3, ExerciseCardLayout exerciseCardLayout4, BarChart barChart, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioGroup radioGroup, FitPaddingMaterialToolbar fitPaddingMaterialToolbar) {
        this.rootView = coordinatorLayout;
        this.appbar = appBarLayout;
        this.cardCalorie = exerciseCardLayout;
        this.cardDistance = exerciseCardLayout2;
        this.cardGoal = exerciseCardLayout3;
        this.cardStep = exerciseCardLayout4;
        this.chart = barChart;
        this.rbDay = radioButton;
        this.rbMonth = radioButton2;
        this.rbWeek = radioButton3;
        this.rgData = radioGroup;
        this.toolbar = fitPaddingMaterialToolbar;
    }

    public static FragmentExerciseBinding bind(View view) {
        int i10 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) c.m(view, R.id.appbar);
        if (appBarLayout != null) {
            i10 = R.id.card_calorie;
            ExerciseCardLayout exerciseCardLayout = (ExerciseCardLayout) c.m(view, R.id.card_calorie);
            if (exerciseCardLayout != null) {
                i10 = R.id.card_distance;
                ExerciseCardLayout exerciseCardLayout2 = (ExerciseCardLayout) c.m(view, R.id.card_distance);
                if (exerciseCardLayout2 != null) {
                    i10 = R.id.card_goal;
                    ExerciseCardLayout exerciseCardLayout3 = (ExerciseCardLayout) c.m(view, R.id.card_goal);
                    if (exerciseCardLayout3 != null) {
                        i10 = R.id.card_step;
                        ExerciseCardLayout exerciseCardLayout4 = (ExerciseCardLayout) c.m(view, R.id.card_step);
                        if (exerciseCardLayout4 != null) {
                            i10 = R.id.chart;
                            BarChart barChart = (BarChart) c.m(view, R.id.chart);
                            if (barChart != null) {
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
                                                i10 = R.id.toolbar;
                                                FitPaddingMaterialToolbar fitPaddingMaterialToolbar = (FitPaddingMaterialToolbar) c.m(view, R.id.toolbar);
                                                if (fitPaddingMaterialToolbar != null) {
                                                    return new FragmentExerciseBinding((CoordinatorLayout) view, appBarLayout, exerciseCardLayout, exerciseCardLayout2, exerciseCardLayout3, exerciseCardLayout4, barChart, radioButton, radioButton2, radioButton3, radioGroup, fitPaddingMaterialToolbar);
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

    public static FragmentExerciseBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentExerciseBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_exercise, viewGroup, false);
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
