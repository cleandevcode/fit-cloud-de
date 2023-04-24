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
public final class LayoutFriendDataInfoBinding implements a {
    public final ImageView imgAvatar;
    private final LinearLayout rootView;
    public final TextView tvDisplayName;
    public final TextView tvNickName;
    public final TextView tvTime;

    private LayoutFriendDataInfoBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.imgAvatar = imageView;
        this.tvDisplayName = textView;
        this.tvNickName = textView2;
        this.tvTime = textView3;
    }

    public static LayoutFriendDataInfoBinding bind(View view) {
        int i10 = R.id.img_avatar;
        ImageView imageView = (ImageView) c.m(view, R.id.img_avatar);
        if (imageView != null) {
            i10 = R.id.tv_display_name;
            TextView textView = (TextView) c.m(view, R.id.tv_display_name);
            if (textView != null) {
                i10 = R.id.tv_nick_name;
                TextView textView2 = (TextView) c.m(view, R.id.tv_nick_name);
                if (textView2 != null) {
                    i10 = R.id.tv_time;
                    TextView textView3 = (TextView) c.m(view, R.id.tv_time);
                    if (textView3 != null) {
                        return new LayoutFriendDataInfoBinding((LinearLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutFriendDataInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutFriendDataInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.layout_friend_data_info, viewGroup, false);
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
