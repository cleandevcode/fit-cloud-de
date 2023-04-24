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
public final class FragmentBloodPressureAlarmBinding implements a {
    public final PreferenceItem itemDbpLower;
    public final PreferenceItem itemDbpUpper;
    public final PreferenceItem itemDetailEnabled;
    public final PreferenceItem itemSbpLower;
    public final PreferenceItem itemSbpUpper;
    public final LinearLayout layoutContent;
    public final LinearLayout layoutDbp;
    public final LinearLayout layoutSbp;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentBloodPressureAlarmBinding(LinearLayout linearLayout, PreferenceItem preferenceItem, PreferenceItem preferenceItem2, PreferenceItem preferenceItem3, PreferenceItem preferenceItem4, PreferenceItem preferenceItem5, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.itemDbpLower = preferenceItem;
        this.itemDbpUpper = preferenceItem2;
        this.itemDetailEnabled = preferenceItem3;
        this.itemSbpLower = preferenceItem4;
        this.itemSbpUpper = preferenceItem5;
        this.layoutContent = linearLayout2;
        this.layoutDbp = linearLayout3;
        this.layoutSbp = linearLayout4;
        this.toolbar = materialToolbar;
    }

    public static FragmentBloodPressureAlarmBinding bind(View view) {
        int i10 = R.id.item_dbp_lower;
        PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_dbp_lower);
        if (preferenceItem != null) {
            i10 = R.id.item_dbp_upper;
            PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_dbp_upper);
            if (preferenceItem2 != null) {
                i10 = R.id.item_detail_enabled;
                PreferenceItem preferenceItem3 = (PreferenceItem) c.m(view, R.id.item_detail_enabled);
                if (preferenceItem3 != null) {
                    i10 = R.id.item_sbp_lower;
                    PreferenceItem preferenceItem4 = (PreferenceItem) c.m(view, R.id.item_sbp_lower);
                    if (preferenceItem4 != null) {
                        i10 = R.id.item_sbp_upper;
                        PreferenceItem preferenceItem5 = (PreferenceItem) c.m(view, R.id.item_sbp_upper);
                        if (preferenceItem5 != null) {
                            i10 = R.id.layout_content;
                            LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_content);
                            if (linearLayout != null) {
                                i10 = R.id.layout_dbp;
                                LinearLayout linearLayout2 = (LinearLayout) c.m(view, R.id.layout_dbp);
                                if (linearLayout2 != null) {
                                    i10 = R.id.layout_sbp;
                                    LinearLayout linearLayout3 = (LinearLayout) c.m(view, R.id.layout_sbp);
                                    if (linearLayout3 != null) {
                                        i10 = R.id.toolbar;
                                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                        if (materialToolbar != null) {
                                            return new FragmentBloodPressureAlarmBinding((LinearLayout) view, preferenceItem, preferenceItem2, preferenceItem3, preferenceItem4, preferenceItem5, linearLayout, linearLayout2, linearLayout3, materialToolbar);
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

    public static FragmentBloodPressureAlarmBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBloodPressureAlarmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_blood_pressure_alarm, viewGroup, false);
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
