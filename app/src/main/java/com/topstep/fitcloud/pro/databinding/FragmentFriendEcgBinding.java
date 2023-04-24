package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentFriendEcgBinding implements a {
    public final ImageView imgContentBg;
    public final LayoutEcgDetailBinding layoutDetail;
    public final LoadingView loadingView;
    public final RecyclerView recyclerView;
    private final FrameLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentFriendEcgBinding(FrameLayout frameLayout, ImageView imageView, LayoutEcgDetailBinding layoutEcgDetailBinding, LoadingView loadingView, RecyclerView recyclerView, MaterialToolbar materialToolbar) {
        this.rootView = frameLayout;
        this.imgContentBg = imageView;
        this.layoutDetail = layoutEcgDetailBinding;
        this.loadingView = loadingView;
        this.recyclerView = recyclerView;
        this.toolbar = materialToolbar;
    }

    public static FragmentFriendEcgBinding bind(View view) {
        int i10 = R.id.img_content_bg;
        ImageView imageView = (ImageView) c.m(view, R.id.img_content_bg);
        if (imageView != null) {
            i10 = R.id.layout_detail;
            View m10 = c.m(view, R.id.layout_detail);
            if (m10 != null) {
                LayoutEcgDetailBinding bind = LayoutEcgDetailBinding.bind(m10);
                i10 = R.id.loading_view;
                LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
                if (loadingView != null) {
                    i10 = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
                    if (recyclerView != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                        if (materialToolbar != null) {
                            return new FragmentFriendEcgBinding((FrameLayout) view, imageView, bind, loadingView, recyclerView, materialToolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentFriendEcgBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFriendEcgBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_friend_ecg, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
