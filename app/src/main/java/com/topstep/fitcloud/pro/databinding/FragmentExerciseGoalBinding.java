package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.c;
import com.github.kilnn.tool.widget.FitPaddingMaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentExerciseGoalBinding implements a {
    public final Button btnCommit;
    public final ConstraintLayout layoutCalorie;
    public final ConstraintLayout layoutDistance;
    public final ConstraintLayout layoutStep;
    private final LinearLayout rootView;
    public final FitPaddingMaterialToolbar toolbar;
    public final TextView tvCalorieUnit;
    public final TextView tvCalorieValue;
    public final TextView tvDistanceUnit;
    public final TextView tvDistanceValue;
    public final TextView tvStepUnit;
    public final TextView tvStepValue;

    private FragmentExerciseGoalBinding(LinearLayout linearLayout, Button button, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, FitPaddingMaterialToolbar fitPaddingMaterialToolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = linearLayout;
        this.btnCommit = button;
        this.layoutCalorie = constraintLayout;
        this.layoutDistance = constraintLayout2;
        this.layoutStep = constraintLayout3;
        this.toolbar = fitPaddingMaterialToolbar;
        this.tvCalorieUnit = textView;
        this.tvCalorieValue = textView2;
        this.tvDistanceUnit = textView3;
        this.tvDistanceValue = textView4;
        this.tvStepUnit = textView5;
        this.tvStepValue = textView6;
    }

    public static FragmentExerciseGoalBinding bind(View view) {
        int i10 = R.id.btn_commit;
        Button button = (Button) c.m(view, R.id.btn_commit);
        if (button != null) {
            i10 = R.id.layout_calorie;
            ConstraintLayout constraintLayout = (ConstraintLayout) c.m(view, R.id.layout_calorie);
            if (constraintLayout != null) {
                i10 = R.id.layout_distance;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) c.m(view, R.id.layout_distance);
                if (constraintLayout2 != null) {
                    i10 = R.id.layout_step;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) c.m(view, R.id.layout_step);
                    if (constraintLayout3 != null) {
                        i10 = R.id.toolbar;
                        FitPaddingMaterialToolbar fitPaddingMaterialToolbar = (FitPaddingMaterialToolbar) c.m(view, R.id.toolbar);
                        if (fitPaddingMaterialToolbar != null) {
                            i10 = R.id.tv_calorie_unit;
                            TextView textView = (TextView) c.m(view, R.id.tv_calorie_unit);
                            if (textView != null) {
                                i10 = R.id.tv_calorie_value;
                                TextView textView2 = (TextView) c.m(view, R.id.tv_calorie_value);
                                if (textView2 != null) {
                                    i10 = R.id.tv_distance_unit;
                                    TextView textView3 = (TextView) c.m(view, R.id.tv_distance_unit);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_distance_value;
                                        TextView textView4 = (TextView) c.m(view, R.id.tv_distance_value);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_step_unit;
                                            TextView textView5 = (TextView) c.m(view, R.id.tv_step_unit);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_step_value;
                                                TextView textView6 = (TextView) c.m(view, R.id.tv_step_value);
                                                if (textView6 != null) {
                                                    return new FragmentExerciseGoalBinding((LinearLayout) view, button, constraintLayout, constraintLayout2, constraintLayout3, fitPaddingMaterialToolbar, textView, textView2, textView3, textView4, textView5, textView6);
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

    public static FragmentExerciseGoalBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentExerciseGoalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_exercise_goal, viewGroup, false);
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
