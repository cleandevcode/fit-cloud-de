package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentSportTrackBinding implements a {
    public final ImageView imgShowDistance;
    public final ImageView imgShowMap;
    public final LinearLayout layoutBottom;
    public final FrameLayout layoutMapContainer;
    private final RelativeLayout rootView;
    public final TextView tvCalories;
    public final TextView tvDistance;
    public final TextView tvDistanceUnit;
    public final TextView tvDuration;
    public final TextView tvPace;

    private FragmentSportTrackBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = relativeLayout;
        this.imgShowDistance = imageView;
        this.imgShowMap = imageView2;
        this.layoutBottom = linearLayout;
        this.layoutMapContainer = frameLayout;
        this.tvCalories = textView;
        this.tvDistance = textView2;
        this.tvDistanceUnit = textView3;
        this.tvDuration = textView4;
        this.tvPace = textView5;
    }

    public static FragmentSportTrackBinding bind(View view) {
        int i10 = R.id.img_show_distance;
        ImageView imageView = (ImageView) c.m(view, R.id.img_show_distance);
        if (imageView != null) {
            i10 = R.id.img_show_map;
            ImageView imageView2 = (ImageView) c.m(view, R.id.img_show_map);
            if (imageView2 != null) {
                i10 = R.id.layout_bottom;
                LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_bottom);
                if (linearLayout != null) {
                    i10 = R.id.layout_map_container;
                    FrameLayout frameLayout = (FrameLayout) c.m(view, R.id.layout_map_container);
                    if (frameLayout != null) {
                        i10 = R.id.tv_calories;
                        TextView textView = (TextView) c.m(view, R.id.tv_calories);
                        if (textView != null) {
                            i10 = R.id.tv_distance;
                            TextView textView2 = (TextView) c.m(view, R.id.tv_distance);
                            if (textView2 != null) {
                                i10 = R.id.tv_distance_unit;
                                TextView textView3 = (TextView) c.m(view, R.id.tv_distance_unit);
                                if (textView3 != null) {
                                    i10 = R.id.tv_duration;
                                    TextView textView4 = (TextView) c.m(view, R.id.tv_duration);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_pace;
                                        TextView textView5 = (TextView) c.m(view, R.id.tv_pace);
                                        if (textView5 != null) {
                                            return new FragmentSportTrackBinding((RelativeLayout) view, imageView, imageView2, linearLayout, frameLayout, textView, textView2, textView3, textView4, textView5);
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

    public static FragmentSportTrackBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSportTrackBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sport_track, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
