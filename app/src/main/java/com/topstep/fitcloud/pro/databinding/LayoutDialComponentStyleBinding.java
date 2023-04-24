package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class LayoutDialComponentStyleBinding implements a {
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final TextView tvTitle;

    private LayoutDialComponentStyleBinding(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        this.rootView = linearLayout;
        this.recyclerView = recyclerView;
        this.tvTitle = textView;
    }

    public static LayoutDialComponentStyleBinding bind(View view) {
        int i10 = R.id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
        if (recyclerView != null) {
            i10 = R.id.tv_title;
            TextView textView = (TextView) c.m(view, R.id.tv_title);
            if (textView != null) {
                return new LayoutDialComponentStyleBinding((LinearLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutDialComponentStyleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutDialComponentStyleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.layout_dial_component_style, viewGroup, false);
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
