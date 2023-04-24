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
public final class ItemFriendListBinding implements a {
    public final ImageView imgAvatar;
    public final ImageView imgAvatarArrow;
    private final RelativeLayout rootView;
    public final TextView tvNickName;
    public final TextView tvTime;

    private ItemFriendListBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.imgAvatar = imageView;
        this.imgAvatarArrow = imageView2;
        this.tvNickName = textView;
        this.tvTime = textView2;
    }

    public static ItemFriendListBinding bind(View view) {
        int i10 = R.id.img_avatar;
        ImageView imageView = (ImageView) c.m(view, R.id.img_avatar);
        if (imageView != null) {
            i10 = R.id.img_avatar_arrow;
            ImageView imageView2 = (ImageView) c.m(view, R.id.img_avatar_arrow);
            if (imageView2 != null) {
                i10 = R.id.tv_nick_name;
                TextView textView = (TextView) c.m(view, R.id.tv_nick_name);
                if (textView != null) {
                    i10 = R.id.tv_time;
                    TextView textView2 = (TextView) c.m(view, R.id.tv_time);
                    if (textView2 != null) {
                        return new ItemFriendListBinding((RelativeLayout) view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemFriendListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemFriendListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_friend_list, viewGroup, false);
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
