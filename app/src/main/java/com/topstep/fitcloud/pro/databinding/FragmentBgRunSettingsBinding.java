package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentBgRunSettingsBinding implements a {
    public final Button btnAutostartPermission;
    public final Button btnBatteryOptimization;
    public final Button btnMiuiCustom;
    public final Button btnPowerSave;
    public final Button btnVivoCustom;
    public final HorizontalScrollView layoutAutostartPermissionScroll;
    public final LinearLayout layoutAutostartPermissionSteps;
    public final LinearLayout layoutBatteryOptimization;
    public final LinearLayout layoutMiuiCustom;
    public final LinearLayout layoutPowerSave;
    public final LinearLayout layoutVivoCustom;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvAutostartPermissionTips;

    private FragmentBgRunSettingsBinding(LinearLayout linearLayout, Button button, Button button2, Button button3, Button button4, Button button5, HorizontalScrollView horizontalScrollView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, MaterialToolbar materialToolbar, TextView textView) {
        this.rootView = linearLayout;
        this.btnAutostartPermission = button;
        this.btnBatteryOptimization = button2;
        this.btnMiuiCustom = button3;
        this.btnPowerSave = button4;
        this.btnVivoCustom = button5;
        this.layoutAutostartPermissionScroll = horizontalScrollView;
        this.layoutAutostartPermissionSteps = linearLayout2;
        this.layoutBatteryOptimization = linearLayout3;
        this.layoutMiuiCustom = linearLayout4;
        this.layoutPowerSave = linearLayout5;
        this.layoutVivoCustom = linearLayout6;
        this.toolbar = materialToolbar;
        this.tvAutostartPermissionTips = textView;
    }

    public static FragmentBgRunSettingsBinding bind(View view) {
        int i10 = R.id.btn_autostart_permission;
        Button button = (Button) c.m(view, R.id.btn_autostart_permission);
        if (button != null) {
            i10 = R.id.btn_battery_optimization;
            Button button2 = (Button) c.m(view, R.id.btn_battery_optimization);
            if (button2 != null) {
                i10 = R.id.btn_miui_custom;
                Button button3 = (Button) c.m(view, R.id.btn_miui_custom);
                if (button3 != null) {
                    i10 = R.id.btn_power_save;
                    Button button4 = (Button) c.m(view, R.id.btn_power_save);
                    if (button4 != null) {
                        i10 = R.id.btn_vivo_custom;
                        Button button5 = (Button) c.m(view, R.id.btn_vivo_custom);
                        if (button5 != null) {
                            i10 = R.id.layout_autostart_permission_scroll;
                            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) c.m(view, R.id.layout_autostart_permission_scroll);
                            if (horizontalScrollView != null) {
                                i10 = R.id.layout_autostart_permission_steps;
                                LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_autostart_permission_steps);
                                if (linearLayout != null) {
                                    i10 = R.id.layout_battery_optimization;
                                    LinearLayout linearLayout2 = (LinearLayout) c.m(view, R.id.layout_battery_optimization);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.layout_miui_custom;
                                        LinearLayout linearLayout3 = (LinearLayout) c.m(view, R.id.layout_miui_custom);
                                        if (linearLayout3 != null) {
                                            i10 = R.id.layout_power_save;
                                            LinearLayout linearLayout4 = (LinearLayout) c.m(view, R.id.layout_power_save);
                                            if (linearLayout4 != null) {
                                                i10 = R.id.layout_vivo_custom;
                                                LinearLayout linearLayout5 = (LinearLayout) c.m(view, R.id.layout_vivo_custom);
                                                if (linearLayout5 != null) {
                                                    i10 = R.id.toolbar;
                                                    MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                                    if (materialToolbar != null) {
                                                        i10 = R.id.tv_autostart_permission_tips;
                                                        TextView textView = (TextView) c.m(view, R.id.tv_autostart_permission_tips);
                                                        if (textView != null) {
                                                            return new FragmentBgRunSettingsBinding((LinearLayout) view, button, button2, button3, button4, button5, horizontalScrollView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, materialToolbar, textView);
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

    public static FragmentBgRunSettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBgRunSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_bg_run_settings, viewGroup, false);
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
