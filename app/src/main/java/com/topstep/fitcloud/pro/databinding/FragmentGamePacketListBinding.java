package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentGamePacketListBinding implements a {
    public final LoadingView loadingView;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final TextView tvTips;

    private FragmentGamePacketListBinding(LinearLayout linearLayout, LoadingView loadingView, RecyclerView recyclerView, TextView textView) {
        this.rootView = linearLayout;
        this.loadingView = loadingView;
        this.recyclerView = recyclerView;
        this.tvTips = textView;
    }

    public static FragmentGamePacketListBinding bind(View view) {
        int i10 = R.id.loading_view;
        LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
        if (loadingView != null) {
            i10 = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
            if (recyclerView != null) {
                i10 = R.id.tv_tips;
                TextView textView = (TextView) c.m(view, R.id.tv_tips);
                if (textView != null) {
                    return new FragmentGamePacketListBinding((LinearLayout) view, loadingView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentGamePacketListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentGamePacketListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_game_packet_list, viewGroup, false);
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
