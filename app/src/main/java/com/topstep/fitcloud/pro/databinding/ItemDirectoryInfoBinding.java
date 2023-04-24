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
public final class ItemDirectoryInfoBinding implements a {
    private final LinearLayout rootView;
    public final TextView tvName;

    private ItemDirectoryInfoBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.tvName = textView;
    }

    public static ItemDirectoryInfoBinding bind(View view) {
        TextView textView = (TextView) c.m(view, R.id.tv_name);
        if (textView != null) {
            return new ItemDirectoryInfoBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tv_name)));
    }

    public static ItemDirectoryInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDirectoryInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_directory_info, viewGroup, false);
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
