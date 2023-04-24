package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentFriendPreSearchBinding implements a {
    public final ImageView imgAvatar;
    public final ImageView imgAvatarArrow;
    public final RelativeLayout rlAvatar;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvAvatarText;
    public final TextView tvSearch;

    private FragmentFriendPreSearchBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, MaterialToolbar materialToolbar, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.imgAvatar = imageView;
        this.imgAvatarArrow = imageView2;
        this.rlAvatar = relativeLayout;
        this.toolbar = materialToolbar;
        this.tvAvatarText = textView;
        this.tvSearch = textView2;
    }

    public static FragmentFriendPreSearchBinding bind(View view) {
        int i10 = R.id.img_avatar;
        ImageView imageView = (ImageView) c.m(view, R.id.img_avatar);
        if (imageView != null) {
            i10 = R.id.img_avatar_arrow;
            ImageView imageView2 = (ImageView) c.m(view, R.id.img_avatar_arrow);
            if (imageView2 != null) {
                i10 = R.id.rl_avatar;
                RelativeLayout relativeLayout = (RelativeLayout) c.m(view, R.id.rl_avatar);
                if (relativeLayout != null) {
                    i10 = R.id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                    if (materialToolbar != null) {
                        i10 = R.id.tv_avatar_text;
                        TextView textView = (TextView) c.m(view, R.id.tv_avatar_text);
                        if (textView != null) {
                            i10 = R.id.tv_search;
                            TextView textView2 = (TextView) c.m(view, R.id.tv_search);
                            if (textView2 != null) {
                                return new FragmentFriendPreSearchBinding((LinearLayout) view, imageView, imageView2, relativeLayout, materialToolbar, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentFriendPreSearchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFriendPreSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_friend_pre_search, viewGroup, false);
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
