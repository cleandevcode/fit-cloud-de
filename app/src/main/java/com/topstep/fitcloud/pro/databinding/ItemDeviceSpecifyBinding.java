package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemDeviceSpecifyBinding implements a {
    public final ImageView imgDevice;
    private final LinearLayout rootView;
    public final TextView tvName;

    private ItemDeviceSpecifyBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.imgDevice = imageView;
        this.tvName = textView;
    }

    public static ItemDeviceSpecifyBinding bind(View view) {
        int i10 = R.id.img_device;
        ImageView imageView = (ImageView) c.m(view, R.id.img_device);
        if (imageView != null) {
            i10 = R.id.tv_name;
            TextView textView = (TextView) c.m(view, R.id.tv_name);
            if (textView != null) {
                return new ItemDeviceSpecifyBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemDeviceSpecifyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDeviceSpecifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_device_specify, viewGroup, false);
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
