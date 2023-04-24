package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import b0.c;
import com.github.kilnn.tool.widget.SquareImageView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemGameSkinBinding implements a {
    public final SquareImageView img;
    private final FrameLayout rootView;
    public final TextView tvExist;

    private ItemGameSkinBinding(FrameLayout frameLayout, SquareImageView squareImageView, TextView textView) {
        this.rootView = frameLayout;
        this.img = squareImageView;
        this.tvExist = textView;
    }

    public static ItemGameSkinBinding bind(View view) {
        int i10 = R.id.img;
        SquareImageView squareImageView = (SquareImageView) c.m(view, R.id.img);
        if (squareImageView != null) {
            i10 = R.id.tv_exist;
            TextView textView = (TextView) c.m(view, R.id.tv_exist);
            if (textView != null) {
                return new ItemGameSkinBinding((FrameLayout) view, squareImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemGameSkinBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemGameSkinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_game_skin, viewGroup, false);
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
