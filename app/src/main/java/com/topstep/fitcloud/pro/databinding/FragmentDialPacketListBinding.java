package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentDialPacketListBinding implements a {
    public final LoadingView loadingView;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;

    private FragmentDialPacketListBinding(LinearLayout linearLayout, LoadingView loadingView, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.loadingView = loadingView;
        this.recyclerView = recyclerView;
    }

    public static FragmentDialPacketListBinding bind(View view) {
        int i10 = R.id.loading_view;
        LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
        if (loadingView != null) {
            i10 = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
            if (recyclerView != null) {
                return new FragmentDialPacketListBinding((LinearLayout) view, loadingView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentDialPacketListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDialPacketListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dial_packet_list, viewGroup, false);
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
