package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class DialogVersionUpdateBinding implements a {
    private final LinearLayout rootView;
    public final TextView tvContent;
    public final TextView tvVersion;

    private DialogVersionUpdateBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.tvContent = textView;
        this.tvVersion = textView2;
    }

    public static DialogVersionUpdateBinding bind(View view) {
        int i10 = R.id.tv_content;
        TextView textView = (TextView) c.m(view, R.id.tv_content);
        if (textView != null) {
            i10 = R.id.tv_version;
            TextView textView2 = (TextView) c.m(view, R.id.tv_version);
            if (textView2 != null) {
                return new DialogVersionUpdateBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogVersionUpdateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogVersionUpdateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_version_update, viewGroup, false);
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
