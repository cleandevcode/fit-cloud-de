package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import b0.c;
import com.github.kilnn.tool.widget.WebViewWrapper;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentPrivacyPolicyBinding implements a {
    public final Button btnCancel;
    public final FrameLayout layoutBottom;
    private final RelativeLayout rootView;
    public final MaterialToolbar toolbar;
    public final WebViewWrapper webViewWrapper;

    private FragmentPrivacyPolicyBinding(RelativeLayout relativeLayout, Button button, FrameLayout frameLayout, MaterialToolbar materialToolbar, WebViewWrapper webViewWrapper) {
        this.rootView = relativeLayout;
        this.btnCancel = button;
        this.layoutBottom = frameLayout;
        this.toolbar = materialToolbar;
        this.webViewWrapper = webViewWrapper;
    }

    public static FragmentPrivacyPolicyBinding bind(View view) {
        int i10 = R.id.btn_cancel;
        Button button = (Button) c.m(view, R.id.btn_cancel);
        if (button != null) {
            i10 = R.id.layout_bottom;
            FrameLayout frameLayout = (FrameLayout) c.m(view, R.id.layout_bottom);
            if (frameLayout != null) {
                i10 = R.id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                if (materialToolbar != null) {
                    i10 = R.id.web_view_wrapper;
                    WebViewWrapper webViewWrapper = (WebViewWrapper) c.m(view, R.id.web_view_wrapper);
                    if (webViewWrapper != null) {
                        return new FragmentPrivacyPolicyBinding((RelativeLayout) view, button, frameLayout, materialToolbar, webViewWrapper);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentPrivacyPolicyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPrivacyPolicyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_privacy_policy, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
