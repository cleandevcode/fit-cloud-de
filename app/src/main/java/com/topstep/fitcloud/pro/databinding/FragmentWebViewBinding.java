package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b0.c;
import com.github.kilnn.tool.widget.WebViewWrapper;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentWebViewBinding implements a {
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final WebViewWrapper webViewWrapper;

    private FragmentWebViewBinding(LinearLayout linearLayout, MaterialToolbar materialToolbar, WebViewWrapper webViewWrapper) {
        this.rootView = linearLayout;
        this.toolbar = materialToolbar;
        this.webViewWrapper = webViewWrapper;
    }

    public static FragmentWebViewBinding bind(View view) {
        int i10 = R.id.toolbar;
        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
        if (materialToolbar != null) {
            i10 = R.id.web_view_wrapper;
            WebViewWrapper webViewWrapper = (WebViewWrapper) c.m(view, R.id.web_view_wrapper);
            if (webViewWrapper != null) {
                return new FragmentWebViewBinding((LinearLayout) view, materialToolbar, webViewWrapper);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentWebViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWebViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_web_view, viewGroup, false);
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
