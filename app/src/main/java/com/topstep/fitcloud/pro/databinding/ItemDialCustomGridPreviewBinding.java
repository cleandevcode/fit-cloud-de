package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b0.c;
import com.topstep.fitcloud.sdk.v2.utils.dial.DialView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemDialCustomGridPreviewBinding implements a {
    public final DialView dialView;
    public final ImageView imgDelete;
    private final FrameLayout rootView;

    private ItemDialCustomGridPreviewBinding(FrameLayout frameLayout, DialView dialView, ImageView imageView) {
        this.rootView = frameLayout;
        this.dialView = dialView;
        this.imgDelete = imageView;
    }

    public static ItemDialCustomGridPreviewBinding bind(View view) {
        int i10 = R.id.dial_view;
        DialView dialView = (DialView) c.m(view, R.id.dial_view);
        if (dialView != null) {
            i10 = R.id.img_delete;
            ImageView imageView = (ImageView) c.m(view, R.id.img_delete);
            if (imageView != null) {
                return new ItemDialCustomGridPreviewBinding((FrameLayout) view, dialView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemDialCustomGridPreviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDialCustomGridPreviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_dial_custom_grid_preview, viewGroup, false);
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
