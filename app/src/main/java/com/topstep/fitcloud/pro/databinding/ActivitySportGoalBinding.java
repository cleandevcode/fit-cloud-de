package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ActivitySportGoalBinding implements a {
    public final ImageView imgDistanceSelect;
    public final ImageView imgNoneSelect;
    public final ImageView imgTimeSelect;
    public final RelativeLayout layoutDistance;
    public final RelativeLayout layoutDistanceDetail;
    public final RelativeLayout layoutNone;
    public final RelativeLayout layoutTime;
    public final RelativeLayout layoutTimeDetail;
    private final LinearLayout rootView;
    public final MaterialToolbar toolBar;
    public final TextView tvDistanceDetail;
    public final TextView tvTimeDetail;

    private ActivitySportGoalBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, MaterialToolbar materialToolbar, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.imgDistanceSelect = imageView;
        this.imgNoneSelect = imageView2;
        this.imgTimeSelect = imageView3;
        this.layoutDistance = relativeLayout;
        this.layoutDistanceDetail = relativeLayout2;
        this.layoutNone = relativeLayout3;
        this.layoutTime = relativeLayout4;
        this.layoutTimeDetail = relativeLayout5;
        this.toolBar = materialToolbar;
        this.tvDistanceDetail = textView;
        this.tvTimeDetail = textView2;
    }

    public static ActivitySportGoalBinding bind(View view) {
        int i10 = R.id.img_distance_select;
        ImageView imageView = (ImageView) c.m(view, R.id.img_distance_select);
        if (imageView != null) {
            i10 = R.id.img_none_select;
            ImageView imageView2 = (ImageView) c.m(view, R.id.img_none_select);
            if (imageView2 != null) {
                i10 = R.id.img_time_select;
                ImageView imageView3 = (ImageView) c.m(view, R.id.img_time_select);
                if (imageView3 != null) {
                    i10 = R.id.layout_distance;
                    RelativeLayout relativeLayout = (RelativeLayout) c.m(view, R.id.layout_distance);
                    if (relativeLayout != null) {
                        i10 = R.id.layout_distance_detail;
                        RelativeLayout relativeLayout2 = (RelativeLayout) c.m(view, R.id.layout_distance_detail);
                        if (relativeLayout2 != null) {
                            i10 = R.id.layout_none;
                            RelativeLayout relativeLayout3 = (RelativeLayout) c.m(view, R.id.layout_none);
                            if (relativeLayout3 != null) {
                                i10 = R.id.layout_time;
                                RelativeLayout relativeLayout4 = (RelativeLayout) c.m(view, R.id.layout_time);
                                if (relativeLayout4 != null) {
                                    i10 = R.id.layout_time_detail;
                                    RelativeLayout relativeLayout5 = (RelativeLayout) c.m(view, R.id.layout_time_detail);
                                    if (relativeLayout5 != null) {
                                        i10 = R.id.tool_bar;
                                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.tool_bar);
                                        if (materialToolbar != null) {
                                            i10 = R.id.tv_distance_detail;
                                            TextView textView = (TextView) c.m(view, R.id.tv_distance_detail);
                                            if (textView != null) {
                                                i10 = R.id.tv_time_detail;
                                                TextView textView2 = (TextView) c.m(view, R.id.tv_time_detail);
                                                if (textView2 != null) {
                                                    return new ActivitySportGoalBinding((LinearLayout) view, imageView, imageView2, imageView3, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, materialToolbar, textView, textView2);
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

    public static ActivitySportGoalBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySportGoalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_sport_goal, viewGroup, false);
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
