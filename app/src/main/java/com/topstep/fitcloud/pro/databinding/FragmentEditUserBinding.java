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
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentEditUserBinding implements a {
    public final ImageView imgAvatar;
    public final PreferenceRelativeLayout itemAvatar;
    public final PreferenceItem itemBirthday;
    public final PreferenceItem itemBpPrivate;
    public final PreferenceItem itemDbp;
    public final PreferenceItem itemHeight;
    public final PreferenceItem itemIdentityId;
    public final PreferenceItem itemNickname;
    public final PreferenceItem itemSbp;
    public final PreferenceItem itemSex;
    public final PreferenceItem itemWeight;
    public final LinearLayout layoutBp;
    private final RelativeLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvBpDes;

    private FragmentEditUserBinding(RelativeLayout relativeLayout, ImageView imageView, PreferenceRelativeLayout preferenceRelativeLayout, PreferenceItem preferenceItem, PreferenceItem preferenceItem2, PreferenceItem preferenceItem3, PreferenceItem preferenceItem4, PreferenceItem preferenceItem5, PreferenceItem preferenceItem6, PreferenceItem preferenceItem7, PreferenceItem preferenceItem8, PreferenceItem preferenceItem9, LinearLayout linearLayout, MaterialToolbar materialToolbar, TextView textView) {
        this.rootView = relativeLayout;
        this.imgAvatar = imageView;
        this.itemAvatar = preferenceRelativeLayout;
        this.itemBirthday = preferenceItem;
        this.itemBpPrivate = preferenceItem2;
        this.itemDbp = preferenceItem3;
        this.itemHeight = preferenceItem4;
        this.itemIdentityId = preferenceItem5;
        this.itemNickname = preferenceItem6;
        this.itemSbp = preferenceItem7;
        this.itemSex = preferenceItem8;
        this.itemWeight = preferenceItem9;
        this.layoutBp = linearLayout;
        this.toolbar = materialToolbar;
        this.tvBpDes = textView;
    }

    public static FragmentEditUserBinding bind(View view) {
        int i10 = R.id.img_avatar;
        ImageView imageView = (ImageView) c.m(view, R.id.img_avatar);
        if (imageView != null) {
            i10 = R.id.item_avatar;
            PreferenceRelativeLayout preferenceRelativeLayout = (PreferenceRelativeLayout) c.m(view, R.id.item_avatar);
            if (preferenceRelativeLayout != null) {
                i10 = R.id.item_birthday;
                PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_birthday);
                if (preferenceItem != null) {
                    i10 = R.id.item_bp_private;
                    PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_bp_private);
                    if (preferenceItem2 != null) {
                        i10 = R.id.item_dbp;
                        PreferenceItem preferenceItem3 = (PreferenceItem) c.m(view, R.id.item_dbp);
                        if (preferenceItem3 != null) {
                            i10 = R.id.item_height;
                            PreferenceItem preferenceItem4 = (PreferenceItem) c.m(view, R.id.item_height);
                            if (preferenceItem4 != null) {
                                i10 = R.id.item_identity_id;
                                PreferenceItem preferenceItem5 = (PreferenceItem) c.m(view, R.id.item_identity_id);
                                if (preferenceItem5 != null) {
                                    i10 = R.id.item_nickname;
                                    PreferenceItem preferenceItem6 = (PreferenceItem) c.m(view, R.id.item_nickname);
                                    if (preferenceItem6 != null) {
                                        i10 = R.id.item_sbp;
                                        PreferenceItem preferenceItem7 = (PreferenceItem) c.m(view, R.id.item_sbp);
                                        if (preferenceItem7 != null) {
                                            i10 = R.id.item_sex;
                                            PreferenceItem preferenceItem8 = (PreferenceItem) c.m(view, R.id.item_sex);
                                            if (preferenceItem8 != null) {
                                                i10 = R.id.item_weight;
                                                PreferenceItem preferenceItem9 = (PreferenceItem) c.m(view, R.id.item_weight);
                                                if (preferenceItem9 != null) {
                                                    i10 = R.id.layout_bp;
                                                    LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_bp);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.toolbar;
                                                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                                        if (materialToolbar != null) {
                                                            i10 = R.id.tv_bp_des;
                                                            TextView textView = (TextView) c.m(view, R.id.tv_bp_des);
                                                            if (textView != null) {
                                                                return new FragmentEditUserBinding((RelativeLayout) view, imageView, preferenceRelativeLayout, preferenceItem, preferenceItem2, preferenceItem3, preferenceItem4, preferenceItem5, preferenceItem6, preferenceItem7, preferenceItem8, preferenceItem9, linearLayout, materialToolbar, textView);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    public static FragmentEditUserBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEditUserBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_user, viewGroup, false);
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
