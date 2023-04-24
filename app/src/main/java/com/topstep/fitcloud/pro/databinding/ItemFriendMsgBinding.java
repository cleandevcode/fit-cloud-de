package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemFriendMsgBinding implements a {
    public final Button btnAccept;
    public final Button btnReject;
    public final ImageView imgAvatar;
    public final LinearLayout layoutAction;
    private final RelativeLayout rootView;
    public final TextView tvMessage;
    public final TextView tvNickName;
    public final TextView tvTime;

    private ItemFriendMsgBinding(RelativeLayout relativeLayout, Button button, Button button2, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = relativeLayout;
        this.btnAccept = button;
        this.btnReject = button2;
        this.imgAvatar = imageView;
        this.layoutAction = linearLayout;
        this.tvMessage = textView;
        this.tvNickName = textView2;
        this.tvTime = textView3;
    }

    public static ItemFriendMsgBinding bind(View view) {
        int i10 = R.id.btn_accept;
        Button button = (Button) c.m(view, R.id.btn_accept);
        if (button != null) {
            i10 = R.id.btn_reject;
            Button button2 = (Button) c.m(view, R.id.btn_reject);
            if (button2 != null) {
                i10 = R.id.img_avatar;
                ImageView imageView = (ImageView) c.m(view, R.id.img_avatar);
                if (imageView != null) {
                    i10 = R.id.layout_action;
                    LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_action);
                    if (linearLayout != null) {
                        i10 = R.id.tv_message;
                        TextView textView = (TextView) c.m(view, R.id.tv_message);
                        if (textView != null) {
                            i10 = R.id.tv_nick_name;
                            TextView textView2 = (TextView) c.m(view, R.id.tv_nick_name);
                            if (textView2 != null) {
                                i10 = R.id.tv_time;
                                TextView textView3 = (TextView) c.m(view, R.id.tv_time);
                                if (textView3 != null) {
                                    return new ItemFriendMsgBinding((RelativeLayout) view, button, button2, imageView, linearLayout, textView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemFriendMsgBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemFriendMsgBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_friend_msg, viewGroup, false);
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
