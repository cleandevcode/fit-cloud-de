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
public final class ItemDialPacketBinding implements a {
    public final DialCardView cardView;
    public final ImageView imgDelete;
    public final ImageView imgView;
    private final DialCardView rootView;

    private ItemDialPacketBinding(DialCardView dialCardView, DialCardView dialCardView2, ImageView imageView, ImageView imageView2) {
        this.rootView = dialCardView;
        this.cardView = dialCardView2;
        this.imgDelete = imageView;
        this.imgView = imageView2;
    }

    public static ItemDialPacketBinding bind(View view) {
        DialCardView dialCardView = (DialCardView) view;
        int i10 = R.id.img_delete;
        ImageView imageView = (ImageView) c.m(view, R.id.img_delete);
        if (imageView != null) {
            i10 = R.id.img_view;
            ImageView imageView2 = (ImageView) c.m(view, R.id.img_view);
            if (imageView2 != null) {
                return new ItemDialPacketBinding(dialCardView, dialCardView, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemDialPacketBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDialPacketBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_dial_packet, viewGroup, false);
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
