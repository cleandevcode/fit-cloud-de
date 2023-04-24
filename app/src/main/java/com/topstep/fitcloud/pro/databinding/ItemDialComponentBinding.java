package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import b0.c;
import com.topstep.fitcloud.pro.ui.device.dial.DialCardView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemDialComponentBinding implements a {
    public final DialCardView cardView;
    public final ImageView imgEdit;
    public final ImageView imgSelect;
    public final ImageView imgView;
    private final DialCardView rootView;

    private ItemDialComponentBinding(DialCardView dialCardView, DialCardView dialCardView2, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        this.rootView = dialCardView;
        this.cardView = dialCardView2;
        this.imgEdit = imageView;
        this.imgSelect = imageView2;
        this.imgView = imageView3;
    }

    public static ItemDialComponentBinding bind(View view) {
        DialCardView dialCardView = (DialCardView) view;
        int i10 = R.id.img_edit;
        ImageView imageView = (ImageView) c.m(view, R.id.img_edit);
        if (imageView != null) {
            i10 = R.id.img_select;
            ImageView imageView2 = (ImageView) c.m(view, R.id.img_select);
            if (imageView2 != null) {
                i10 = R.id.img_view;
                ImageView imageView3 = (ImageView) c.m(view, R.id.img_view);
                if (imageView3 != null) {
                    return new ItemDialComponentBinding(dialCardView, dialCardView, imageView, imageView2, imageView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemDialComponentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDialComponentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_dial_component, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public DialCardView getRoot() {
        return this.rootView;
    }
}
