package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import b0.c;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloud.sdk.v2.utils.dial.DialView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentDialCustomBinding implements a {
    public final Button btnCreateDial;
    public final Button btnEnableLocationService;
    public final DialView dialView;
    public final PreferenceRelativeLayout layoutLocationService;
    public final LoadingView loadingView;
    private final LinearLayout rootView;
    public final TabLayout tabLayout;
    public final MaterialToolbar toolbar;
    public final ViewPager2 viewPager;

    private FragmentDialCustomBinding(LinearLayout linearLayout, Button button, Button button2, DialView dialView, PreferenceRelativeLayout preferenceRelativeLayout, LoadingView loadingView, TabLayout tabLayout, MaterialToolbar materialToolbar, ViewPager2 viewPager2) {
        this.rootView = linearLayout;
        this.btnCreateDial = button;
        this.btnEnableLocationService = button2;
        this.dialView = dialView;
        this.layoutLocationService = preferenceRelativeLayout;
        this.loadingView = loadingView;
        this.tabLayout = tabLayout;
        this.toolbar = materialToolbar;
        this.viewPager = viewPager2;
    }

    public static FragmentDialCustomBinding bind(View view) {
        int i10 = R.id.btn_create_dial;
        Button button = (Button) c.m(view, R.id.btn_create_dial);
        if (button != null) {
            i10 = R.id.btn_enable_location_service;
            Button button2 = (Button) c.m(view, R.id.btn_enable_location_service);
            if (button2 != null) {
                i10 = R.id.dial_view;
                DialView dialView = (DialView) c.m(view, R.id.dial_view);
                if (dialView != null) {
                    i10 = R.id.layout_location_service;
                    PreferenceRelativeLayout preferenceRelativeLayout = (PreferenceRelativeLayout) c.m(view, R.id.layout_location_service);
                    if (preferenceRelativeLayout != null) {
                        i10 = R.id.loading_view;
                        LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
                        if (loadingView != null) {
                            i10 = R.id.tab_layout;
                            TabLayout tabLayout = (TabLayout) c.m(view, R.id.tab_layout);
                            if (tabLayout != null) {
                                i10 = R.id.toolbar;
                                MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                if (materialToolbar != null) {
                                    i10 = R.id.view_pager;
                                    ViewPager2 viewPager2 = (ViewPager2) c.m(view, R.id.view_pager);
                                    if (viewPager2 != null) {
                                        return new FragmentDialCustomBinding((LinearLayout) view, button, button2, dialView, preferenceRelativeLayout, loadingView, tabLayout, materialToolbar, viewPager2);
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

    public static FragmentDialCustomBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDialCustomBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dial_custom, viewGroup, false);
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
