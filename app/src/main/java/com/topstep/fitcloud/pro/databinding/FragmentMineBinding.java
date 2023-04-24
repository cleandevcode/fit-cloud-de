package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.github.kilnn.tool.widget.FitPaddingMaterialToolbar;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentMineBinding implements a {
    public final Button btnSignIn;
    public final ImageView imgAvatar;
    public final PreferenceItem itemAssist;
    public final PreferenceItem itemExerciseGoal;
    public final PreferenceItem itemFaq;
    public final PreferenceItem itemFeedback;
    public final PreferenceItem itemFriends;
    public final PreferenceItem itemGoogleFit;
    public final PreferenceItem itemSettings;
    public final PreferenceItem itemUnit;
    public final PreferenceRelativeLayout itemUser;
    public final PreferenceItem itemWechat;
    public final PreferenceItem itemWomenHealth;
    public final LinearLayout layoutThird;
    private final LinearLayout rootView;
    public final FitPaddingMaterialToolbar toolbar;
    public final TextView tvId;
    public final TextView tvNickName;

    private FragmentMineBinding(LinearLayout linearLayout, Button button, ImageView imageView, PreferenceItem preferenceItem, PreferenceItem preferenceItem2, PreferenceItem preferenceItem3, PreferenceItem preferenceItem4, PreferenceItem preferenceItem5, PreferenceItem preferenceItem6, PreferenceItem preferenceItem7, PreferenceItem preferenceItem8, PreferenceRelativeLayout preferenceRelativeLayout, PreferenceItem preferenceItem9, PreferenceItem preferenceItem10, LinearLayout linearLayout2, FitPaddingMaterialToolbar fitPaddingMaterialToolbar, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.btnSignIn = button;
        this.imgAvatar = imageView;
        this.itemAssist = preferenceItem;
        this.itemExerciseGoal = preferenceItem2;
        this.itemFaq = preferenceItem3;
        this.itemFeedback = preferenceItem4;
        this.itemFriends = preferenceItem5;
        this.itemGoogleFit = preferenceItem6;
        this.itemSettings = preferenceItem7;
        this.itemUnit = preferenceItem8;
        this.itemUser = preferenceRelativeLayout;
        this.itemWechat = preferenceItem9;
        this.itemWomenHealth = preferenceItem10;
        this.layoutThird = linearLayout2;
        this.toolbar = fitPaddingMaterialToolbar;
        this.tvId = textView;
        this.tvNickName = textView2;
    }

    public static FragmentMineBinding bind(View view) {
        int i10 = R.id.btn_sign_in;
        Button button = (Button) c.m(view, R.id.btn_sign_in);
        if (button != null) {
            i10 = R.id.img_avatar;
            ImageView imageView = (ImageView) c.m(view, R.id.img_avatar);
            if (imageView != null) {
                i10 = R.id.item_assist;
                PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_assist);
                if (preferenceItem != null) {
                    i10 = R.id.item_exercise_goal;
                    PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_exercise_goal);
                    if (preferenceItem2 != null) {
                        i10 = R.id.item_faq;
                        PreferenceItem preferenceItem3 = (PreferenceItem) c.m(view, R.id.item_faq);
                        if (preferenceItem3 != null) {
                            i10 = R.id.item_feedback;
                            PreferenceItem preferenceItem4 = (PreferenceItem) c.m(view, R.id.item_feedback);
                            if (preferenceItem4 != null) {
                                i10 = R.id.item_friends;
                                PreferenceItem preferenceItem5 = (PreferenceItem) c.m(view, R.id.item_friends);
                                if (preferenceItem5 != null) {
                                    i10 = R.id.item_google_fit;
                                    PreferenceItem preferenceItem6 = (PreferenceItem) c.m(view, R.id.item_google_fit);
                                    if (preferenceItem6 != null) {
                                        i10 = R.id.item_settings;
                                        PreferenceItem preferenceItem7 = (PreferenceItem) c.m(view, R.id.item_settings);
                                        if (preferenceItem7 != null) {
                                            i10 = R.id.item_unit;
                                            PreferenceItem preferenceItem8 = (PreferenceItem) c.m(view, R.id.item_unit);
                                            if (preferenceItem8 != null) {
                                                i10 = R.id.item_user;
                                                PreferenceRelativeLayout preferenceRelativeLayout = (PreferenceRelativeLayout) c.m(view, R.id.item_user);
                                                if (preferenceRelativeLayout != null) {
                                                    i10 = R.id.item_wechat;
                                                    PreferenceItem preferenceItem9 = (PreferenceItem) c.m(view, R.id.item_wechat);
                                                    if (preferenceItem9 != null) {
                                                        i10 = R.id.item_women_health;
                                                        PreferenceItem preferenceItem10 = (PreferenceItem) c.m(view, R.id.item_women_health);
                                                        if (preferenceItem10 != null) {
                                                            i10 = R.id.layout_third;
                                                            LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_third);
                                                            if (linearLayout != null) {
                                                                i10 = R.id.toolbar;
                                                                FitPaddingMaterialToolbar fitPaddingMaterialToolbar = (FitPaddingMaterialToolbar) c.m(view, R.id.toolbar);
                                                                if (fitPaddingMaterialToolbar != null) {
                                                                    i10 = R.id.tv_id;
                                                                    TextView textView = (TextView) c.m(view, R.id.tv_id);
                                                                    if (textView != null) {
                                                                        i10 = R.id.tv_nick_name;
                                                                        TextView textView2 = (TextView) c.m(view, R.id.tv_nick_name);
                                                                        if (textView2 != null) {
                                                                            return new FragmentMineBinding((LinearLayout) view, button, imageView, preferenceItem, preferenceItem2, preferenceItem3, preferenceItem4, preferenceItem5, preferenceItem6, preferenceItem7, preferenceItem8, preferenceRelativeLayout, preferenceItem9, preferenceItem10, linearLayout, fitPaddingMaterialToolbar, textView, textView2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentMineBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMineBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mine, viewGroup, false);
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
