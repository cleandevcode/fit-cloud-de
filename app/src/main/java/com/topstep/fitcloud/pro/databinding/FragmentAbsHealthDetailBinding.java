package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentAbsHealthDetailBinding implements a {
    public final FrameLayout chartContainer;
    public final LoadingView detailLoadingView;
    public final ImageView imgArrowLeft;
    public final ImageView imgArrowRight;
    public final LinearLayout infoContainer;
    public final LoadingView listLoadingView;
    private final FrameLayout rootView;
    public final CardView tipsContainer;
    public final MaterialToolbar toolbar;
    public final TextView tvDate;

    private FragmentAbsHealthDetailBinding(FrameLayout frameLayout, FrameLayout frameLayout2, LoadingView loadingView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LoadingView loadingView2, CardView cardView, MaterialToolbar materialToolbar, TextView textView) {
        this.rootView = frameLayout;
        this.chartContainer = frameLayout2;
        this.detailLoadingView = loadingView;
        this.imgArrowLeft = imageView;
        this.imgArrowRight = imageView2;
        this.infoContainer = linearLayout;
        this.listLoadingView = loadingView2;
        this.tipsContainer = cardView;
        this.toolbar = materialToolbar;
        this.tvDate = textView;
    }

    public static FragmentAbsHealthDetailBinding bind(View view) {
        int i10 = R.id.chart_container;
        FrameLayout frameLayout = (FrameLayout) c.m(view, R.id.chart_container);
        if (frameLayout != null) {
            i10 = R.id.detail_loading_view;
            LoadingView loadingView = (LoadingView) c.m(view, R.id.detail_loading_view);
            if (loadingView != null) {
                i10 = R.id.img_arrow_left;
                ImageView imageView = (ImageView) c.m(view, R.id.img_arrow_left);
                if (imageView != null) {
                    i10 = R.id.img_arrow_right;
                    ImageView imageView2 = (ImageView) c.m(view, R.id.img_arrow_right);
                    if (imageView2 != null) {
                        i10 = R.id.info_container;
                        LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.info_container);
                        if (linearLayout != null) {
                            i10 = R.id.list_loading_view;
                            LoadingView loadingView2 = (LoadingView) c.m(view, R.id.list_loading_view);
                            if (loadingView2 != null) {
                                i10 = R.id.tips_container;
                                CardView cardView = (CardView) c.m(view, R.id.tips_container);
                                if (cardView != null) {
                                    i10 = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                    if (materialToolbar != null) {
                                        i10 = R.id.tv_date;
                                        TextView textView = (TextView) c.m(view, R.id.tv_date);
                                        if (textView != null) {
                                            return new FragmentAbsHealthDetailBinding((FrameLayout) view, frameLayout, loadingView, imageView, imageView2, linearLayout, loadingView2, cardView, materialToolbar, textView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentAbsHealthDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAbsHealthDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_abs_health_detail, viewGroup, false);
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
