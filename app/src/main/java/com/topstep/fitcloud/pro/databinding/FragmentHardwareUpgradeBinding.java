package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.ui.widget.UpgradeProgressLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentHardwareUpgradeBinding implements a {
    public final Button btnEnableLocationService;
    public final Button btnUpgrade;
    public final PreferenceRelativeLayout layoutLocationService;
    public final UpgradeProgressLayout layoutUpgradeProgress;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvContent;
    public final TextView tvVersion;

    private FragmentHardwareUpgradeBinding(LinearLayout linearLayout, Button button, Button button2, PreferenceRelativeLayout preferenceRelativeLayout, UpgradeProgressLayout upgradeProgressLayout, MaterialToolbar materialToolbar, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.btnEnableLocationService = button;
        this.btnUpgrade = button2;
        this.layoutLocationService = preferenceRelativeLayout;
        this.layoutUpgradeProgress = upgradeProgressLayout;
        this.toolbar = materialToolbar;
        this.tvContent = textView;
        this.tvVersion = textView2;
    }

    public static FragmentHardwareUpgradeBinding bind(View view) {
        int i10 = R.id.btn_enable_location_service;
        Button button = (Button) c.m(view, R.id.btn_enable_location_service);
        if (button != null) {
            i10 = R.id.btn_upgrade;
            Button button2 = (Button) c.m(view, R.id.btn_upgrade);
            if (button2 != null) {
                i10 = R.id.layout_location_service;
                PreferenceRelativeLayout preferenceRelativeLayout = (PreferenceRelativeLayout) c.m(view, R.id.layout_location_service);
                if (preferenceRelativeLayout != null) {
                    i10 = R.id.layout_upgrade_progress;
                    UpgradeProgressLayout upgradeProgressLayout = (UpgradeProgressLayout) c.m(view, R.id.layout_upgrade_progress);
                    if (upgradeProgressLayout != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                        if (materialToolbar != null) {
                            i10 = R.id.tv_content;
                            TextView textView = (TextView) c.m(view, R.id.tv_content);
                            if (textView != null) {
                                i10 = R.id.tv_version;
                                TextView textView2 = (TextView) c.m(view, R.id.tv_version);
                                if (textView2 != null) {
                                    return new FragmentHardwareUpgradeBinding((LinearLayout) view, button, button2, preferenceRelativeLayout, upgradeProgressLayout, materialToolbar, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentHardwareUpgradeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentHardwareUpgradeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_hardware_upgrade, viewGroup, false);
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
