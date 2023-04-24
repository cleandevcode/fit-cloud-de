package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b0.c;
import com.github.kilnn.tool.widget.preference.PreferenceTextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentAssistBinding implements a {
    public final PreferenceTextView itemAssistInfo;
    public final PreferenceTextView itemDeviceInfo;
    public final PreferenceTextView itemLocalDfu;
    public final PreferenceTextView itemLog;
    public final PreferenceTextView itemSleepRaw;
    public final PreferenceTextView itemUiInfo;
    public final PreferenceTextView itemWeather;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentAssistBinding(LinearLayout linearLayout, PreferenceTextView preferenceTextView, PreferenceTextView preferenceTextView2, PreferenceTextView preferenceTextView3, PreferenceTextView preferenceTextView4, PreferenceTextView preferenceTextView5, PreferenceTextView preferenceTextView6, PreferenceTextView preferenceTextView7, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.itemAssistInfo = preferenceTextView;
        this.itemDeviceInfo = preferenceTextView2;
        this.itemLocalDfu = preferenceTextView3;
        this.itemLog = preferenceTextView4;
        this.itemSleepRaw = preferenceTextView5;
        this.itemUiInfo = preferenceTextView6;
        this.itemWeather = preferenceTextView7;
        this.toolbar = materialToolbar;
    }

    public static FragmentAssistBinding bind(View view) {
        int i10 = R.id.item_assist_info;
        PreferenceTextView preferenceTextView = (PreferenceTextView) c.m(view, R.id.item_assist_info);
        if (preferenceTextView != null) {
            i10 = R.id.item_device_info;
            PreferenceTextView preferenceTextView2 = (PreferenceTextView) c.m(view, R.id.item_device_info);
            if (preferenceTextView2 != null) {
                i10 = R.id.item_local_dfu;
                PreferenceTextView preferenceTextView3 = (PreferenceTextView) c.m(view, R.id.item_local_dfu);
                if (preferenceTextView3 != null) {
                    i10 = R.id.item_log;
                    PreferenceTextView preferenceTextView4 = (PreferenceTextView) c.m(view, R.id.item_log);
                    if (preferenceTextView4 != null) {
                        i10 = R.id.item_sleep_raw;
                        PreferenceTextView preferenceTextView5 = (PreferenceTextView) c.m(view, R.id.item_sleep_raw);
                        if (preferenceTextView5 != null) {
                            i10 = R.id.item_ui_info;
                            PreferenceTextView preferenceTextView6 = (PreferenceTextView) c.m(view, R.id.item_ui_info);
                            if (preferenceTextView6 != null) {
                                i10 = R.id.item_weather;
                                PreferenceTextView preferenceTextView7 = (PreferenceTextView) c.m(view, R.id.item_weather);
                                if (preferenceTextView7 != null) {
                                    i10 = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                    if (materialToolbar != null) {
                                        return new FragmentAssistBinding((LinearLayout) view, preferenceTextView, preferenceTextView2, preferenceTextView3, preferenceTextView4, preferenceTextView5, preferenceTextView6, preferenceTextView7, materialToolbar);
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

    public static FragmentAssistBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAssistBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_assist, viewGroup, false);
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
