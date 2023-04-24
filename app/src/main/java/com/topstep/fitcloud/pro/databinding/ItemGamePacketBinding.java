package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.github.kilnn.tool.widget.SquareImageView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemGamePacketBinding implements a {
    public final SquareImageView img;
    private final LinearLayout rootView;
    public final TextView tvName;

    private ItemGamePacketBinding(LinearLayout linearLayout, SquareImageView squareImageView, TextView textView) {
        this.rootView = linearLayout;
        this.img = squareImageView;
        this.tvName = textView;
    }

    public static ItemGamePacketBinding bind(View view) {
        int i10 = R.id.img;
        SquareImageView squareImageView = (SquareImageView) c.m(view, R.id.img);
        if (squareImageView != null) {
            i10 = R.id.tv_name;
            TextView textView = (TextView) c.m(view, R.id.tv_name);
            if (textView != null) {
                return new ItemGamePacketBinding((LinearLayout) view, squareImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemGamePacketBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemGamePacketBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_game_packet, viewGroup, false);
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
