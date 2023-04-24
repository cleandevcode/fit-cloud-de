package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemDeviceFeatureItemBinding implements a {
    private final RelativeLayout rootView;
    public final TextView tvDes;
    public final TextView tvName;

    private ItemDeviceFeatureItemBinding(RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.tvDes = textView;
        this.tvName = textView2;
    }

    public static ItemDeviceFeatureItemBinding bind(View view) {
        int i10 = R.id.tv_des;
        TextView textView = (TextView) c.m(view, R.id.tv_des);
        if (textView != null) {
            i10 = R.id.tv_name;
            TextView textView2 = (TextView) c.m(view, R.id.tv_name);
            if (textView2 != null) {
                return new ItemDeviceFeatureItemBinding((RelativeLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemDeviceFeatureItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDeviceFeatureItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_device_feature_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
