package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import b0.c;
import com.github.kilnn.tool.widget.WebViewWrapper;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentEcgDetailReportBinding implements a {
    public final FrameLayout layoutWebView;
    public final LoadingView loadingView;
    public final ProgressBar progressBar;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final WebViewWrapper webViewWrapper;

    private FragmentEcgDetailReportBinding(LinearLayout linearLayout, FrameLayout frameLayout, LoadingView loadingView, ProgressBar progressBar, MaterialToolbar materialToolbar, WebViewWrapper webViewWrapper) {
        this.rootView = linearLayout;
        this.layoutWebView = frameLayout;
        this.loadingView = loadingView;
        this.progressBar = progressBar;
        this.toolbar = materialToolbar;
        this.webViewWrapper = webViewWrapper;
    }

    public static FragmentEcgDetailReportBinding bind(View view) {
        int i10 = R.id.layout_web_view;
        FrameLayout frameLayout = (FrameLayout) c.m(view, R.id.layout_web_view);
        if (frameLayout != null) {
            i10 = R.id.loading_view;
            LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
            if (loadingView != null) {
                i10 = R.id.progress_bar;
                ProgressBar progressBar = (ProgressBar) c.m(view, R.id.progress_bar);
                if (progressBar != null) {
                    i10 = R.id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                    if (materialToolbar != null) {
                        i10 = R.id.web_view_wrapper;
                        WebViewWrapper webViewWrapper = (WebViewWrapper) c.m(view, R.id.web_view_wrapper);
                        if (webViewWrapper != null) {
                            return new FragmentEcgDetailReportBinding((LinearLayout) view, frameLayout, loadingView, progressBar, materialToolbar, webViewWrapper);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentEcgDetailReportBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEcgDetailReportBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_ecg_detail_report, viewGroup, false);
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
