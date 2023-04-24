package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentFriendListBinding implements a {
    public final Button btnAdd;
    public final LinearLayout emptyView;
    public final LoadingView loadingView;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentFriendListBinding(LinearLayout linearLayout, Button button, LinearLayout linearLayout2, LoadingView loadingView, RecyclerView recyclerView, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.btnAdd = button;
        this.emptyView = linearLayout2;
        this.loadingView = loadingView;
        this.recyclerView = recyclerView;
        this.toolbar = materialToolbar;
    }

    public static FragmentFriendListBinding bind(View view) {
        int i10 = R.id.btn_add;
        Button button = (Button) c.m(view, R.id.btn_add);
        if (button != null) {
            i10 = R.id.empty_view;
            LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.empty_view);
            if (linearLayout != null) {
                i10 = R.id.loading_view;
                LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
                if (loadingView != null) {
                    i10 = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
                    if (recyclerView != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                        if (materialToolbar != null) {
                            return new FragmentFriendListBinding((LinearLayout) view, button, linearLayout, loadingView, recyclerView, materialToolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentFriendListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFriendListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_friend_list, viewGroup, false);
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
