package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.ui.widget.EcgReportHeaderView;
import com.topstep.fitcloud.pro.ui.widget.EcgReportView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ActivityEcgHealthReportBinding implements a {
    public final Button btnShare;
    public final EcgReportHeaderView ecgReportHeaderView;
    public final EcgReportView ecgReportView;
    public final LinearLayout layoutContent;
    private final FrameLayout rootView;
    public final ScrollView scrollView;
    public final MaterialToolbar toolbarNavigation;
    public final MaterialToolbar toolbarTitle;

    private ActivityEcgHealthReportBinding(FrameLayout frameLayout, Button button, EcgReportHeaderView ecgReportHeaderView, EcgReportView ecgReportView, LinearLayout linearLayout, ScrollView scrollView, MaterialToolbar materialToolbar, MaterialToolbar materialToolbar2) {
        this.rootView = frameLayout;
        this.btnShare = button;
        this.ecgReportHeaderView = ecgReportHeaderView;
        this.ecgReportView = ecgReportView;
        this.layoutContent = linearLayout;
        this.scrollView = scrollView;
        this.toolbarNavigation = materialToolbar;
        this.toolbarTitle = materialToolbar2;
    }

    public static ActivityEcgHealthReportBinding bind(View view) {
        int i10 = R.id.btn_share;
        Button button = (Button) c.m(view, R.id.btn_share);
        if (button != null) {
            i10 = R.id.ecg_report_header_view;
            EcgReportHeaderView ecgReportHeaderView = (EcgReportHeaderView) c.m(view, R.id.ecg_report_header_view);
            if (ecgReportHeaderView != null) {
                i10 = R.id.ecg_report_view;
                EcgReportView ecgReportView = (EcgReportView) c.m(view, R.id.ecg_report_view);
                if (ecgReportView != null) {
                    i10 = R.id.layout_content;
                    LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_content);
                    if (linearLayout != null) {
                        i10 = R.id.scroll_view;
                        ScrollView scrollView = (ScrollView) c.m(view, R.id.scroll_view);
                        if (scrollView != null) {
                            i10 = R.id.toolbar_navigation;
                            MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar_navigation);
                            if (materialToolbar != null) {
                                i10 = R.id.toolbar_title;
                                MaterialToolbar materialToolbar2 = (MaterialToolbar) c.m(view, R.id.toolbar_title);
                                if (materialToolbar2 != null) {
                                    return new ActivityEcgHealthReportBinding((FrameLayout) view, button, ecgReportHeaderView, ecgReportView, linearLayout, scrollView, materialToolbar, materialToolbar2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityEcgHealthReportBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityEcgHealthReportBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_ecg_health_report, viewGroup, false);
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
