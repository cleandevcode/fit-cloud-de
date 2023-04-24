package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.github.kilnn.tool.widget.FitPaddingMaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentTemperatureBinding implements a {
    public final TextView emptyView;
    public final LinearLayout layoutContainer;
    public final LayoutTemperatureContentBinding layoutContent;
    public final RecyclerView recyclerView;
    private final FrameLayout rootView;
    public final FitPaddingMaterialToolbar toolbar;

    private FragmentTemperatureBinding(FrameLayout frameLayout, TextView textView, LinearLayout linearLayout, LayoutTemperatureContentBinding layoutTemperatureContentBinding, RecyclerView recyclerView, FitPaddingMaterialToolbar fitPaddingMaterialToolbar) {
        this.rootView = frameLayout;
        this.emptyView = textView;
        this.layoutContainer = linearLayout;
        this.layoutContent = layoutTemperatureContentBinding;
        this.recyclerView = recyclerView;
        this.toolbar = fitPaddingMaterialToolbar;
    }

    public static FragmentTemperatureBinding bind(View view) {
        int i10 = R.id.empty_view;
        TextView textView = (TextView) c.m(view, R.id.empty_view);
        if (textView != null) {
            i10 = R.id.layout_container;
            LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_container);
            if (linearLayout != null) {
                i10 = R.id.layout_content;
                View m10 = c.m(view, R.id.layout_content);
                if (m10 != null) {
                    LayoutTemperatureContentBinding bind = LayoutTemperatureContentBinding.bind(m10);
                    i10 = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
                    if (recyclerView != null) {
                        i10 = R.id.toolbar;
                        FitPaddingMaterialToolbar fitPaddingMaterialToolbar = (FitPaddingMaterialToolbar) c.m(view, R.id.toolbar);
                        if (fitPaddingMaterialToolbar != null) {
                            return new FragmentTemperatureBinding((FrameLayout) view, textView, linearLayout, bind, recyclerView, fitPaddingMaterialToolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentTemperatureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTemperatureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_temperature, viewGroup, false);
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
