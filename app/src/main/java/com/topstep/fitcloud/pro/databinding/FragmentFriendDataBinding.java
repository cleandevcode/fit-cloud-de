package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloud.pro.ui.widget.module.Text1ModuleItemView;
import com.topstep.fitcloud.pro.ui.widget.module.Text2ModuleItemView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentFriendDataBinding implements a {
    public final CardView cardViewTop;
    public final ScrollView contentView;
    public final ImageView imgContentBg;
    public final LayoutFriendDataInfoBinding infoViewBind;
    public final Text1ModuleItemView layoutBloodPressure;
    public final Text1ModuleItemView layoutEcg;
    public final Text1ModuleItemView layoutHeartRate;
    public final Text1ModuleItemView layoutOxygen;
    public final Text1ModuleItemView layoutPressure;
    public final LinearLayout layoutStepDetail;
    public final Text2ModuleItemView layoutTemperature;
    public final LoadingView loadingView;
    private final FrameLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvDistanceUnit;
    public final TextView tvDistanceValue;
    public final TextView tvSleepHourUnit;
    public final TextView tvSleepHourValue;
    public final TextView tvSleepMinuteUnit;
    public final TextView tvSleepMinuteValue;
    public final TextView tvStepUnit;
    public final TextView tvStepValue;

    private FragmentFriendDataBinding(FrameLayout frameLayout, CardView cardView, ScrollView scrollView, ImageView imageView, LayoutFriendDataInfoBinding layoutFriendDataInfoBinding, Text1ModuleItemView text1ModuleItemView, Text1ModuleItemView text1ModuleItemView2, Text1ModuleItemView text1ModuleItemView3, Text1ModuleItemView text1ModuleItemView4, Text1ModuleItemView text1ModuleItemView5, LinearLayout linearLayout, Text2ModuleItemView text2ModuleItemView, LoadingView loadingView, MaterialToolbar materialToolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = frameLayout;
        this.cardViewTop = cardView;
        this.contentView = scrollView;
        this.imgContentBg = imageView;
        this.infoViewBind = layoutFriendDataInfoBinding;
        this.layoutBloodPressure = text1ModuleItemView;
        this.layoutEcg = text1ModuleItemView2;
        this.layoutHeartRate = text1ModuleItemView3;
        this.layoutOxygen = text1ModuleItemView4;
        this.layoutPressure = text1ModuleItemView5;
        this.layoutStepDetail = linearLayout;
        this.layoutTemperature = text2ModuleItemView;
        this.loadingView = loadingView;
        this.toolbar = materialToolbar;
        this.tvDistanceUnit = textView;
        this.tvDistanceValue = textView2;
        this.tvSleepHourUnit = textView3;
        this.tvSleepHourValue = textView4;
        this.tvSleepMinuteUnit = textView5;
        this.tvSleepMinuteValue = textView6;
        this.tvStepUnit = textView7;
        this.tvStepValue = textView8;
    }

    public static FragmentFriendDataBinding bind(View view) {
        int i10 = R.id.card_view_top;
        CardView cardView = (CardView) c.m(view, R.id.card_view_top);
        if (cardView != null) {
            i10 = R.id.content_view;
            ScrollView scrollView = (ScrollView) c.m(view, R.id.content_view);
            if (scrollView != null) {
                i10 = R.id.img_content_bg;
                ImageView imageView = (ImageView) c.m(view, R.id.img_content_bg);
                if (imageView != null) {
                    i10 = R.id.info_view_bind;
                    View m10 = c.m(view, R.id.info_view_bind);
                    if (m10 != null) {
                        LayoutFriendDataInfoBinding bind = LayoutFriendDataInfoBinding.bind(m10);
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
                                            i10 = R.id.layout_step_detail;
                                            LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_step_detail);
                                            if (linearLayout != null) {
                                                i10 = R.id.layout_temperature;
                                                Text2ModuleItemView text2ModuleItemView = (Text2ModuleItemView) c.m(view, R.id.layout_temperature);
                                                if (text2ModuleItemView != null) {
                                                    i10 = R.id.loading_view;
                                                    LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
                                                    if (loadingView != null) {
                                                        i10 = R.id.toolbar;
                                                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                                        if (materialToolbar != null) {
                                                            i10 = R.id.tv_distance_unit;
                                                            TextView textView = (TextView) c.m(view, R.id.tv_distance_unit);
                                                            if (textView != null) {
                                                                i10 = R.id.tv_distance_value;
                                                                TextView textView2 = (TextView) c.m(view, R.id.tv_distance_value);
                                                                if (textView2 != null) {
                                                                    i10 = R.id.tv_sleep_hour_unit;
                                                                    TextView textView3 = (TextView) c.m(view, R.id.tv_sleep_hour_unit);
                                                                    if (textView3 != null) {
                                                                        i10 = R.id.tv_sleep_hour_value;
                                                                        TextView textView4 = (TextView) c.m(view, R.id.tv_sleep_hour_value);
                                                                        if (textView4 != null) {
                                                                            i10 = R.id.tv_sleep_minute_unit;
                                                                            TextView textView5 = (TextView) c.m(view, R.id.tv_sleep_minute_unit);
                                                                            if (textView5 != null) {
                                                                                i10 = R.id.tv_sleep_minute_value;
                                                                                TextView textView6 = (TextView) c.m(view, R.id.tv_sleep_minute_value);
                                                                                if (textView6 != null) {
                                                                                    i10 = R.id.tv_step_unit;
                                                                                    TextView textView7 = (TextView) c.m(view, R.id.tv_step_unit);
                                                                                    if (textView7 != null) {
                                                                                        i10 = R.id.tv_step_value;
                                                                                        TextView textView8 = (TextView) c.m(view, R.id.tv_step_value);
                                                                                        if (textView8 != null) {
                                                                                            return new FragmentFriendDataBinding((FrameLayout) view, cardView, scrollView, imageView, bind, text1ModuleItemView, text1ModuleItemView2, text1ModuleItemView3, text1ModuleItemView4, text1ModuleItemView5, linearLayout, text2ModuleItemView, loadingView, materialToolbar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentFriendDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFriendDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_friend_data, viewGroup, false);
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
