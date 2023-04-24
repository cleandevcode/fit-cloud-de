package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b0.c;
import com.github.kilnn.tool.widget.DotTextView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemDialComponentStyleBinding implements a {
    public final DotTextView dotView;
    public final ImageView imgView;
    private final LinearLayout rootView;

    private ItemDialComponentStyleBinding(LinearLayout linearLayout, DotTextView dotTextView, ImageView imageView) {
        this.rootView = linearLayout;
        this.dotView = dotTextView;
        this.imgView = imageView;
    }

    public static ItemDialComponentStyleBinding bind(View view) {
        int i10 = R.id.dot_view;
        DotTextView dotTextView = (DotTextView) c.m(view, R.id.dot_view);
        if (dotTextView != null) {
            i10 = R.id.img_view;
            ImageView imageView = (ImageView) c.m(view, R.id.img_view);
            if (imageView != null) {
                return new ItemDialComponentStyleBinding((LinearLayout) view, dotTextView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemDialComponentStyleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDialComponentStyleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_dial_component_style, viewGroup, false);
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
