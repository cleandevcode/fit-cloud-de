package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class LayoutSportingMapContainerBinding implements a {
    public final ImageView imgChangeModeToNormal;
    public final ImageView imgMapProgress;
    public final LinearLayout layoutMapData;
    public final ConstraintLayout layoutMapMode;
    private final FrameLayout rootView;
    public final TextView tvMapCalorie;
    public final TextView tvMapDistance;
    public final TextView tvMapDistanceUnit;
    public final TextView tvMapDuration;
    public final TextView tvMapPace;
    public final TextView tvMapPaceUnit;

    private LayoutSportingMapContainerBinding(FrameLayout frameLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = frameLayout;
        this.imgChangeModeToNormal = imageView;
        this.imgMapProgress = imageView2;
        this.layoutMapData = linearLayout;
        this.layoutMapMode = constraintLayout;
        this.tvMapCalorie = textView;
        this.tvMapDistance = textView2;
        this.tvMapDistanceUnit = textView3;
        this.tvMapDuration = textView4;
        this.tvMapPace = textView5;
        this.tvMapPaceUnit = textView6;
    }

    public static LayoutSportingMapContainerBinding bind(View view) {
        int i10 = R.id.img_change_mode_to_normal;
        ImageView imageView = (ImageView) c.m(view, R.id.img_change_mode_to_normal);
        if (imageView != null) {
            i10 = R.id.img_map_progress;
            ImageView imageView2 = (ImageView) c.m(view, R.id.img_map_progress);
            if (imageView2 != null) {
                i10 = R.id.layout_map_data;
                LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_map_data);
                if (linearLayout != null) {
                    i10 = R.id.layout_map_mode;
                    ConstraintLayout constraintLayout = (ConstraintLayout) c.m(view, R.id.layout_map_mode);
                    if (constraintLayout != null) {
                        i10 = R.id.tv_map_calorie;
                        TextView textView = (TextView) c.m(view, R.id.tv_map_calorie);
                        if (textView != null) {
                            i10 = R.id.tv_map_distance;
                            TextView textView2 = (TextView) c.m(view, R.id.tv_map_distance);
                            if (textView2 != null) {
                                i10 = R.id.tv_map_distance_unit;
                                TextView textView3 = (TextView) c.m(view, R.id.tv_map_distance_unit);
                                if (textView3 != null) {
                                    i10 = R.id.tv_map_duration;
                                    TextView textView4 = (TextView) c.m(view, R.id.tv_map_duration);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_map_pace;
                                        TextView textView5 = (TextView) c.m(view, R.id.tv_map_pace);
                                        if (textView5 != null) {
                                            i10 = R.id.tv_map_pace_unit;
                                            TextView textView6 = (TextView) c.m(view, R.id.tv_map_pace_unit);
                                            if (textView6 != null) {
                                                return new LayoutSportingMapContainerBinding((FrameLayout) view, imageView, imageView2, linearLayout, constraintLayout, textView, textView2, textView3, textView4, textView5, textView6);
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

    public static LayoutSportingMapContainerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutSportingMapContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.layout_sporting_map_container, viewGroup, false);
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
