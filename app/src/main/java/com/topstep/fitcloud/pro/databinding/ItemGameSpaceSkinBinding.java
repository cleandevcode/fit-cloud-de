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
public final class ItemGameSpaceSkinBinding implements a {
    public final ImageView img;
    private final LinearLayout rootView;
    public final TextView tvSpaceSize;
    public final View viewSelect;

    private ItemGameSpaceSkinBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, View view) {
        this.rootView = linearLayout;
        this.img = imageView;
        this.tvSpaceSize = textView;
        this.viewSelect = view;
    }

    public static ItemGameSpaceSkinBinding bind(View view) {
        int i10 = R.id.img;
        ImageView imageView = (ImageView) c.m(view, R.id.img);
        if (imageView != null) {
            i10 = R.id.tv_space_size;
            TextView textView = (TextView) c.m(view, R.id.tv_space_size);
            if (textView != null) {
                i10 = R.id.view_select;
                View m10 = c.m(view, R.id.view_select);
                if (m10 != null) {
                    return new ItemGameSpaceSkinBinding((LinearLayout) view, imageView, textView, m10);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemGameSpaceSkinBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemGameSpaceSkinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_game_space_skin, viewGroup, false);
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
