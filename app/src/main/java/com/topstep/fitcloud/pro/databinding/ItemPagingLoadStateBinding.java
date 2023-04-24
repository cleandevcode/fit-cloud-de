package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemPagingLoadStateBinding implements a {
    public final ProgressBar progressBar;
    private final LinearLayout rootView;
    public final TextView tvMsg;

    private ItemPagingLoadStateBinding(LinearLayout linearLayout, ProgressBar progressBar, TextView textView) {
        this.rootView = linearLayout;
        this.progressBar = progressBar;
        this.tvMsg = textView;
    }

    public static ItemPagingLoadStateBinding bind(View view) {
        int i10 = R.id.progress_bar;
        ProgressBar progressBar = (ProgressBar) c.m(view, R.id.progress_bar);
        if (progressBar != null) {
            i10 = R.id.tv_msg;
            TextView textView = (TextView) c.m(view, R.id.tv_msg);
            if (textView != null) {
                return new ItemPagingLoadStateBinding((LinearLayout) view, progressBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemPagingLoadStateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPagingLoadStateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_paging_load_state, viewGroup, false);
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
