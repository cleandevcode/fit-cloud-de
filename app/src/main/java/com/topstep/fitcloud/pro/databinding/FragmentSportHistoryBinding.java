package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentSportHistoryBinding implements a {
    public final RecyclerView recyclerView;
    public final SwipeRefreshLayout refreshLayout;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentSportHistoryBinding(LinearLayout linearLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.recyclerView = recyclerView;
        this.refreshLayout = swipeRefreshLayout;
        this.toolbar = materialToolbar;
    }

    public static FragmentSportHistoryBinding bind(View view) {
        int i10 = R.id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
        if (recyclerView != null) {
            i10 = R.id.refresh_layout;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) c.m(view, R.id.refresh_layout);
            if (swipeRefreshLayout != null) {
                i10 = R.id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                if (materialToolbar != null) {
                    return new FragmentSportHistoryBinding((LinearLayout) view, recyclerView, swipeRefreshLayout, materialToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSportHistoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSportHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sport_history, viewGroup, false);
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
