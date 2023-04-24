package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentSportPushBinding implements a {
    public final Button btnEnableLocationService;
    public final PreferenceRelativeLayout layoutLocationService;
    public final LoadingView loadingView;
    public final RecyclerView recyclerViewCategory;
    public final RecyclerView recyclerViewItem;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentSportPushBinding(LinearLayout linearLayout, Button button, PreferenceRelativeLayout preferenceRelativeLayout, LoadingView loadingView, RecyclerView recyclerView, RecyclerView recyclerView2, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.btnEnableLocationService = button;
        this.layoutLocationService = preferenceRelativeLayout;
        this.loadingView = loadingView;
        this.recyclerViewCategory = recyclerView;
        this.recyclerViewItem = recyclerView2;
        this.toolbar = materialToolbar;
    }

    public static FragmentSportPushBinding bind(View view) {
        int i10 = R.id.btn_enable_location_service;
        Button button = (Button) c.m(view, R.id.btn_enable_location_service);
        if (button != null) {
            i10 = R.id.layout_location_service;
            PreferenceRelativeLayout preferenceRelativeLayout = (PreferenceRelativeLayout) c.m(view, R.id.layout_location_service);
            if (preferenceRelativeLayout != null) {
                i10 = R.id.loading_view;
                LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
                if (loadingView != null) {
                    i10 = R.id.recycler_view_category;
                    RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view_category);
                    if (recyclerView != null) {
                        i10 = R.id.recycler_view_item;
                        RecyclerView recyclerView2 = (RecyclerView) c.m(view, R.id.recycler_view_item);
                        if (recyclerView2 != null) {
                            i10 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                            if (materialToolbar != null) {
                                return new FragmentSportPushBinding((LinearLayout) view, button, preferenceRelativeLayout, loadingView, recyclerView, recyclerView2, materialToolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSportPushBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSportPushBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sport_push, viewGroup, false);
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
