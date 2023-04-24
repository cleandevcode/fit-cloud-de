package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentAboutBinding implements a {
    private final RelativeLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvPrivacyPolicy;
    public final TextView tvVersion;

    private FragmentAboutBinding(RelativeLayout relativeLayout, MaterialToolbar materialToolbar, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.toolbar = materialToolbar;
        this.tvPrivacyPolicy = textView;
        this.tvVersion = textView2;
    }

    public static FragmentAboutBinding bind(View view) {
        int i10 = R.id.toolbar;
        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
        if (materialToolbar != null) {
            i10 = R.id.tv_privacy_policy;
            TextView textView = (TextView) c.m(view, R.id.tv_privacy_policy);
            if (textView != null) {
                i10 = R.id.tv_version;
                TextView textView2 = (TextView) c.m(view, R.id.tv_version);
                if (textView2 != null) {
                    return new FragmentAboutBinding((RelativeLayout) view, materialToolbar, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentAboutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAboutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_about, viewGroup, false);
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
