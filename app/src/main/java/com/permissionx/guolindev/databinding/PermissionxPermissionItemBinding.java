package com.permissionx.guolindev.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.permissionx.guolindev.R;

/* loaded from: classes.dex */
public final class PermissionxPermissionItemBinding implements a {
    public final ImageView permissionIcon;
    public final TextView permissionText;
    private final LinearLayout rootView;

    private PermissionxPermissionItemBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.permissionIcon = imageView;
        this.permissionText = textView;
    }

    public static PermissionxPermissionItemBinding bind(View view) {
        int i10 = R.id.permissionIcon;
        ImageView imageView = (ImageView) c.m(view, i10);
        if (imageView != null) {
            i10 = R.id.permissionText;
            TextView textView = (TextView) c.m(view, i10);
            if (textView != null) {
                return new PermissionxPermissionItemBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static PermissionxPermissionItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PermissionxPermissionItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.permissionx_permission_item, viewGroup, false);
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
