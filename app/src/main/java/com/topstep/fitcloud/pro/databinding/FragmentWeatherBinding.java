package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentWeatherBinding implements a {
    public final Button btnRefresh;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvCityMsg;
    public final TextView tvLocationMsg;
    public final TextView tvLocationTime;
    public final TextView tvWeatherMsg;
    public final TextView tvWeatherTime;

    private FragmentWeatherBinding(LinearLayout linearLayout, Button button, MaterialToolbar materialToolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.btnRefresh = button;
        this.toolbar = materialToolbar;
        this.tvCityMsg = textView;
        this.tvLocationMsg = textView2;
        this.tvLocationTime = textView3;
        this.tvWeatherMsg = textView4;
        this.tvWeatherTime = textView5;
    }

    public static FragmentWeatherBinding bind(View view) {
        int i10 = R.id.btn_refresh;
        Button button = (Button) c.m(view, R.id.btn_refresh);
        if (button != null) {
            i10 = R.id.toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
            if (materialToolbar != null) {
                i10 = R.id.tv_city_msg;
                TextView textView = (TextView) c.m(view, R.id.tv_city_msg);
                if (textView != null) {
                    i10 = R.id.tv_location_msg;
                    TextView textView2 = (TextView) c.m(view, R.id.tv_location_msg);
                    if (textView2 != null) {
                        i10 = R.id.tv_location_time;
                        TextView textView3 = (TextView) c.m(view, R.id.tv_location_time);
                        if (textView3 != null) {
                            i10 = R.id.tv_weather_msg;
                            TextView textView4 = (TextView) c.m(view, R.id.tv_weather_msg);
                            if (textView4 != null) {
                                i10 = R.id.tv_weather_time;
                                TextView textView5 = (TextView) c.m(view, R.id.tv_weather_time);
                                if (textView5 != null) {
                                    return new FragmentWeatherBinding((LinearLayout) view, button, materialToolbar, textView, textView2, textView3, textView4, textView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentWeatherBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWeatherBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_weather, viewGroup, false);
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
