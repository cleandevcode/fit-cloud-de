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
public final class DialogEcgHealthReportBinding implements a {
    public final ProgressBar progressBar;
    private final LinearLayout rootView;
    public final TextView tvPercentage;
    public final TextView tvState;

    private DialogEcgHealthReportBinding(LinearLayout linearLayout, ProgressBar progressBar, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.progressBar = progressBar;
        this.tvPercentage = textView;
        this.tvState = textView2;
    }

    public static DialogEcgHealthReportBinding bind(View view) {
        int i10 = R.id.progress_bar;
        ProgressBar progressBar = (ProgressBar) c.m(view, R.id.progress_bar);
        if (progressBar != null) {
            i10 = R.id.tv_percentage;
            TextView textView = (TextView) c.m(view, R.id.tv_percentage);
            if (textView != null) {
                i10 = R.id.tv_state;
                TextView textView2 = (TextView) c.m(view, R.id.tv_state);
                if (textView2 != null) {
                    return new DialogEcgHealthReportBinding((LinearLayout) view, progressBar, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogEcgHealthReportBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogEcgHealthReportBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_ecg_health_report, viewGroup, false);
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
