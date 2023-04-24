package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b0.c;
import com.github.kilnn.tool.widget.FitPaddingMaterialToolbar;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentDeviceSpecifyBinding implements a {
    public final LoadingView loadingView;
    public final RecyclerView recyclerView;
    public final SwipeRefreshLayout refreshLayout;
    private final LinearLayout rootView;
    public final FitPaddingMaterialToolbar toolbar;

    private FragmentDeviceSpecifyBinding(LinearLayout linearLayout, LoadingView loadingView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, FitPaddingMaterialToolbar fitPaddingMaterialToolbar) {
        this.rootView = linearLayout;
        this.loadingView = loadingView;
        this.recyclerView = recyclerView;
        this.refreshLayout = swipeRefreshLayout;
        this.toolbar = fitPaddingMaterialToolbar;
    }

    public static FragmentDeviceSpecifyBinding bind(View view) {
        int i10 = R.id.loading_view;
        LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
        if (loadingView != null) {
            i10 = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
            if (recyclerView != null) {
                i10 = R.id.refresh_layout;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) c.m(view, R.id.refresh_layout);
                if (swipeRefreshLayout != null) {
                    i10 = R.id.toolbar;
                    FitPaddingMaterialToolbar fitPaddingMaterialToolbar = (FitPaddingMaterialToolbar) c.m(view, R.id.toolbar);
                    if (fitPaddingMaterialToolbar != null) {
                        return new FragmentDeviceSpecifyBinding((LinearLayout) view, loadingView, recyclerView, swipeRefreshLayout, fitPaddingMaterialToolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentDeviceSpecifyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDeviceSpecifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_specify, viewGroup, false);
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
