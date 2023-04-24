package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class LayoutExericseCardBinding implements a {
    public final ImageView imgIcon;
    private final View rootView;
    public final TextView tvDes;
    public final TextView tvUnit;
    public final TextView tvValue;

    private LayoutExericseCardBinding(View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = view;
        this.imgIcon = imageView;
        this.tvDes = textView;
        this.tvUnit = textView2;
        this.tvValue = textView3;
    }

    public static LayoutExericseCardBinding bind(View view) {
        int i10 = R.id.img_icon;
        ImageView imageView = (ImageView) c.m(view, R.id.img_icon);
        if (imageView != null) {
            i10 = R.id.tv_des;
            TextView textView = (TextView) c.m(view, R.id.tv_des);
            if (textView != null) {
                i10 = R.id.tv_unit;
                TextView textView2 = (TextView) c.m(view, R.id.tv_unit);
                if (textView2 != null) {
                    i10 = R.id.tv_value;
                    TextView textView3 = (TextView) c.m(view, R.id.tv_value);
                    if (textView3 != null) {
                        return new LayoutExericseCardBinding(view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutExericseCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.layout_exericse_card, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // a3.a
    public View getRoot() {
        return this.rootView;
    }
}
