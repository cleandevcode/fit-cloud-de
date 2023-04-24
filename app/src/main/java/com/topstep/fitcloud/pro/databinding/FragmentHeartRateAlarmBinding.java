package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b0.c;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentHeartRateAlarmBinding implements a {
    public final PreferenceItem itemDynamicSwitch;
    public final PreferenceItem itemDynamicValue;
    public final PreferenceItem itemStaticSwitch;
    public final PreferenceItem itemStaticValue;
    public final LinearLayout layoutContent;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentHeartRateAlarmBinding(LinearLayout linearLayout, PreferenceItem preferenceItem, PreferenceItem preferenceItem2, PreferenceItem preferenceItem3, PreferenceItem preferenceItem4, LinearLayout linearLayout2, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.itemDynamicSwitch = preferenceItem;
        this.itemDynamicValue = preferenceItem2;
        this.itemStaticSwitch = preferenceItem3;
        this.itemStaticValue = preferenceItem4;
        this.layoutContent = linearLayout2;
        this.toolbar = materialToolbar;
    }

    public static FragmentHeartRateAlarmBinding bind(View view) {
        int i10 = R.id.item_dynamic_switch;
        PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_dynamic_switch);
        if (preferenceItem != null) {
            i10 = R.id.item_dynamic_value;
            PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_dynamic_value);
            if (preferenceItem2 != null) {
                i10 = R.id.item_static_switch;
                PreferenceItem preferenceItem3 = (PreferenceItem) c.m(view, R.id.item_static_switch);
                if (preferenceItem3 != null) {
                    i10 = R.id.item_static_value;
                    PreferenceItem preferenceItem4 = (PreferenceItem) c.m(view, R.id.item_static_value);
                    if (preferenceItem4 != null) {
                        i10 = R.id.layout_content;
                        LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_content);
                        if (linearLayout != null) {
                            i10 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                            if (materialToolbar != null) {
                                return new FragmentHeartRateAlarmBinding((LinearLayout) view, preferenceItem, preferenceItem2, preferenceItem3, preferenceItem4, linearLayout, materialToolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentHeartRateAlarmBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentHeartRateAlarmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_heart_rate_alarm, viewGroup, false);
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
