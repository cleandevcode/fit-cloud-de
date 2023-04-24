package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class LayoutHomePageRefreshViewBinding implements a {
    public final ImageView imgState;
    private final LinearLayout rootView;
    public final TextView tvStatus;

    private LayoutHomePageRefreshViewBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.imgState = imageView;
        this.tvStatus = textView;
    }

    public static LayoutHomePageRefreshViewBinding bind(View view) {
        int i10 = R.id.img_state;
        ImageView imageView = (ImageView) c.m(view, R.id.img_state);
        if (imageView != null) {
            i10 = R.id.tv_status;
            TextView textView = (TextView) c.m(view, R.id.tv_status);
            if (textView != null) {
                return new LayoutHomePageRefreshViewBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutHomePageRefreshViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutHomePageRefreshViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.layout_home_page_refresh_view, viewGroup, false);
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
