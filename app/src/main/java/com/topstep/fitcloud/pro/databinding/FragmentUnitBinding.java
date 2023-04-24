package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import b0.c;
import com.github.kilnn.tool.widget.preference.PreferenceTextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentUnitBinding implements a {
    public final PreferenceTextView itemLengthImperial;
    public final PreferenceTextView itemLengthMetric;
    public final PreferenceTextView itemTemperatureCentigrade;
    public final PreferenceTextView itemTemperatureFahrenheit;
    public final PreferenceTextView itemWeightImperial;
    public final PreferenceTextView itemWeightMetric;
    public final LinearLayout layoutTemperature;
    private final RelativeLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentUnitBinding(RelativeLayout relativeLayout, PreferenceTextView preferenceTextView, PreferenceTextView preferenceTextView2, PreferenceTextView preferenceTextView3, PreferenceTextView preferenceTextView4, PreferenceTextView preferenceTextView5, PreferenceTextView preferenceTextView6, LinearLayout linearLayout, MaterialToolbar materialToolbar) {
        this.rootView = relativeLayout;
        this.itemLengthImperial = preferenceTextView;
        this.itemLengthMetric = preferenceTextView2;
        this.itemTemperatureCentigrade = preferenceTextView3;
        this.itemTemperatureFahrenheit = preferenceTextView4;
        this.itemWeightImperial = preferenceTextView5;
        this.itemWeightMetric = preferenceTextView6;
        this.layoutTemperature = linearLayout;
        this.toolbar = materialToolbar;
    }

    public static FragmentUnitBinding bind(View view) {
        int i10 = R.id.item_length_imperial;
        PreferenceTextView preferenceTextView = (PreferenceTextView) c.m(view, R.id.item_length_imperial);
        if (preferenceTextView != null) {
            i10 = R.id.item_length_metric;
            PreferenceTextView preferenceTextView2 = (PreferenceTextView) c.m(view, R.id.item_length_metric);
            if (preferenceTextView2 != null) {
                i10 = R.id.item_temperature_centigrade;
                PreferenceTextView preferenceTextView3 = (PreferenceTextView) c.m(view, R.id.item_temperature_centigrade);
                if (preferenceTextView3 != null) {
                    i10 = R.id.item_temperature_fahrenheit;
                    PreferenceTextView preferenceTextView4 = (PreferenceTextView) c.m(view, R.id.item_temperature_fahrenheit);
                    if (preferenceTextView4 != null) {
                        i10 = R.id.item_weight_imperial;
                        PreferenceTextView preferenceTextView5 = (PreferenceTextView) c.m(view, R.id.item_weight_imperial);
                        if (preferenceTextView5 != null) {
                            i10 = R.id.item_weight_metric;
                            PreferenceTextView preferenceTextView6 = (PreferenceTextView) c.m(view, R.id.item_weight_metric);
                            if (preferenceTextView6 != null) {
                                i10 = R.id.layout_temperature;
                                LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_temperature);
                                if (linearLayout != null) {
                                    i10 = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                    if (materialToolbar != null) {
                                        return new FragmentUnitBinding((RelativeLayout) view, preferenceTextView, preferenceTextView2, preferenceTextView3, preferenceTextView4, preferenceTextView5, preferenceTextView6, linearLayout, materialToolbar);
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

    public static FragmentUnitBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentUnitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_unit, viewGroup, false);
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
