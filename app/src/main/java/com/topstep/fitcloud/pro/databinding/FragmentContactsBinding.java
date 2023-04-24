package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentContactsBinding implements a {
    public final AppBarLayout appbar;
    public final FloatingActionButton fabAdd;
    public final LoadingView loadingView;
    public final RecyclerView recyclerView;
    private final CoordinatorLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentContactsBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton, LoadingView loadingView, RecyclerView recyclerView, MaterialToolbar materialToolbar) {
        this.rootView = coordinatorLayout;
        this.appbar = appBarLayout;
        this.fabAdd = floatingActionButton;
        this.loadingView = loadingView;
        this.recyclerView = recyclerView;
        this.toolbar = materialToolbar;
    }

    public static FragmentContactsBinding bind(View view) {
        int i10 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) c.m(view, R.id.appbar);
        if (appBarLayout != null) {
            i10 = R.id.fab_add;
            FloatingActionButton floatingActionButton = (FloatingActionButton) c.m(view, R.id.fab_add);
            if (floatingActionButton != null) {
                i10 = R.id.loading_view;
                LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
                if (loadingView != null) {
                    i10 = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
                    if (recyclerView != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                        if (materialToolbar != null) {
                            return new FragmentContactsBinding((CoordinatorLayout) view, appBarLayout, floatingActionButton, loadingView, recyclerView, materialToolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentContactsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentContactsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_contacts, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
