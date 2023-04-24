package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemAudioInfoBinding implements a {
    public final ImageView imgIcon;
    public final ImageView imgSelect;
    private final RelativeLayout rootView;
    public final TextView tvName;
    public final TextView tvSize;

    private ItemAudioInfoBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.imgIcon = imageView;
        this.imgSelect = imageView2;
        this.tvName = textView;
        this.tvSize = textView2;
    }

    public static ItemAudioInfoBinding bind(View view) {
        int i10 = R.id.img_icon;
        ImageView imageView = (ImageView) c.m(view, R.id.img_icon);
        if (imageView != null) {
            i10 = R.id.img_select;
            ImageView imageView2 = (ImageView) c.m(view, R.id.img_select);
            if (imageView2 != null) {
                i10 = R.id.tv_name;
                TextView textView = (TextView) c.m(view, R.id.tv_name);
                if (textView != null) {
                    i10 = R.id.tv_size;
                    TextView textView2 = (TextView) c.m(view, R.id.tv_size);
                    if (textView2 != null) {
                        return new ItemAudioInfoBinding((RelativeLayout) view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemAudioInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemAudioInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_audio_info, viewGroup, false);
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
