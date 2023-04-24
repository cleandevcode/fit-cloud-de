package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b0.c;
import com.github.kilnn.tool.widget.FitPaddingMaterialToolbar;
import com.github.kilnn.tool.widget.bottomsheet.RatioBottomSheetLayout;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentDeviceBindBinding implements a {
    public final RatioBottomSheetLayout bottomSheetLayout;
    public final MaterialToolbar bottomToolbar;
    public final Button btnEnableLocationService;
    public final FloatingActionButton fabScan;
    public final PreferenceRelativeLayout layoutLocationService;
    public final RelativeLayout layoutTips;
    public final LinearLayout layoutTipsContent;
    public final RecyclerView otherDevicesRecyclerView;
    public final SwipeRefreshLayout refreshLayout;
    private final LinearLayout rootView;
    public final RecyclerView scanDevicesRecyclerView;
    public final FitPaddingMaterialToolbar toolbar;

    private FragmentDeviceBindBinding(LinearLayout linearLayout, RatioBottomSheetLayout ratioBottomSheetLayout, MaterialToolbar materialToolbar, Button button, FloatingActionButton floatingActionButton, PreferenceRelativeLayout preferenceRelativeLayout, RelativeLayout relativeLayout, LinearLayout linearLayout2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView2, FitPaddingMaterialToolbar fitPaddingMaterialToolbar) {
        this.rootView = linearLayout;
        this.bottomSheetLayout = ratioBottomSheetLayout;
        this.bottomToolbar = materialToolbar;
        this.btnEnableLocationService = button;
        this.fabScan = floatingActionButton;
        this.layoutLocationService = preferenceRelativeLayout;
        this.layoutTips = relativeLayout;
        this.layoutTipsContent = linearLayout2;
        this.otherDevicesRecyclerView = recyclerView;
        this.refreshLayout = swipeRefreshLayout;
        this.scanDevicesRecyclerView = recyclerView2;
        this.toolbar = fitPaddingMaterialToolbar;
    }

    public static FragmentDeviceBindBinding bind(View view) {
        int i10 = R.id.bottom_sheet_layout;
        RatioBottomSheetLayout ratioBottomSheetLayout = (RatioBottomSheetLayout) c.m(view, R.id.bottom_sheet_layout);
        if (ratioBottomSheetLayout != null) {
            i10 = R.id.bottom_toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.bottom_toolbar);
            if (materialToolbar != null) {
                i10 = R.id.btn_enable_location_service;
                Button button = (Button) c.m(view, R.id.btn_enable_location_service);
                if (button != null) {
                    i10 = R.id.fab_scan;
                    FloatingActionButton floatingActionButton = (FloatingActionButton) c.m(view, R.id.fab_scan);
                    if (floatingActionButton != null) {
                        i10 = R.id.layout_location_service;
                        PreferenceRelativeLayout preferenceRelativeLayout = (PreferenceRelativeLayout) c.m(view, R.id.layout_location_service);
                        if (preferenceRelativeLayout != null) {
                            i10 = R.id.layout_tips;
                            RelativeLayout relativeLayout = (RelativeLayout) c.m(view, R.id.layout_tips);
                            if (relativeLayout != null) {
                                i10 = R.id.layout_tips_content;
                                LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_tips_content);
                                if (linearLayout != null) {
                                    i10 = R.id.other_devices_recycler_view;
                                    RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.other_devices_recycler_view);
                                    if (recyclerView != null) {
                                        i10 = R.id.refresh_layout;
                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) c.m(view, R.id.refresh_layout);
                                        if (swipeRefreshLayout != null) {
                                            i10 = R.id.scan_devices_recycler_view;
                                            RecyclerView recyclerView2 = (RecyclerView) c.m(view, R.id.scan_devices_recycler_view);
                                            if (recyclerView2 != null) {
                                                i10 = R.id.toolbar;
                                                FitPaddingMaterialToolbar fitPaddingMaterialToolbar = (FitPaddingMaterialToolbar) c.m(view, R.id.toolbar);
                                                if (fitPaddingMaterialToolbar != null) {
                                                    return new FragmentDeviceBindBinding((LinearLayout) view, ratioBottomSheetLayout, materialToolbar, button, floatingActionButton, preferenceRelativeLayout, relativeLayout, linearLayout, recyclerView, swipeRefreshLayout, recyclerView2, fitPaddingMaterialToolbar);
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

    public static FragmentDeviceBindBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDeviceBindBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_bind, viewGroup, false);
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
