package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentFriendInfoBinding implements a {
    public final ImageView imgAvatar;
    public final PreferenceItem itemBirthday;
    public final PreferenceItem itemHeight;
    public final PreferenceItem itemSex;
    public final PreferenceItem itemWeight;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvId;
    public final TextView tvNickName;

    private FragmentFriendInfoBinding(LinearLayout linearLayout, ImageView imageView, PreferenceItem preferenceItem, PreferenceItem preferenceItem2, PreferenceItem preferenceItem3, PreferenceItem preferenceItem4, MaterialToolbar materialToolbar, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.imgAvatar = imageView;
        this.itemBirthday = preferenceItem;
        this.itemHeight = preferenceItem2;
        this.itemSex = preferenceItem3;
        this.itemWeight = preferenceItem4;
        this.toolbar = materialToolbar;
        this.tvId = textView;
        this.tvNickName = textView2;
    }

    public static FragmentFriendInfoBinding bind(View view) {
        int i10 = R.id.img_avatar;
        ImageView imageView = (ImageView) c.m(view, R.id.img_avatar);
        if (imageView != null) {
            i10 = R.id.item_birthday;
            PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_birthday);
            if (preferenceItem != null) {
                i10 = R.id.item_height;
                PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_height);
                if (preferenceItem2 != null) {
                    i10 = R.id.item_sex;
                    PreferenceItem preferenceItem3 = (PreferenceItem) c.m(view, R.id.item_sex);
                    if (preferenceItem3 != null) {
                        i10 = R.id.item_weight;
                        PreferenceItem preferenceItem4 = (PreferenceItem) c.m(view, R.id.item_weight);
                        if (preferenceItem4 != null) {
                            i10 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                            if (materialToolbar != null) {
                                i10 = R.id.tv_id;
                                TextView textView = (TextView) c.m(view, R.id.tv_id);
                                if (textView != null) {
                                    i10 = R.id.tv_nick_name;
                                    TextView textView2 = (TextView) c.m(view, R.id.tv_nick_name);
                                    if (textView2 != null) {
                                        return new FragmentFriendInfoBinding((LinearLayout) view, imageView, preferenceItem, preferenceItem2, preferenceItem3, preferenceItem4, materialToolbar, textView, textView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentFriendInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFriendInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_friend_info, viewGroup, false);
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
