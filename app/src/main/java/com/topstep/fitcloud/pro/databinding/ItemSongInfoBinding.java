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
public final class ItemSongInfoBinding implements a {
    public final ImageView imgDelete;
    public final ImageView imgIcon;
    private final RelativeLayout rootView;
    public final TextView tvName;

    private ItemSongInfoBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.rootView = relativeLayout;
        this.imgDelete = imageView;
        this.imgIcon = imageView2;
        this.tvName = textView;
    }

    public static ItemSongInfoBinding bind(View view) {
        int i10 = R.id.img_delete;
        ImageView imageView = (ImageView) c.m(view, R.id.img_delete);
        if (imageView != null) {
            i10 = R.id.img_icon;
            ImageView imageView2 = (ImageView) c.m(view, R.id.img_icon);
            if (imageView2 != null) {
                i10 = R.id.tv_name;
                TextView textView = (TextView) c.m(view, R.id.tv_name);
                if (textView != null) {
                    return new ItemSongInfoBinding((RelativeLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemSongInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSongInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_song_info, viewGroup, false);
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
