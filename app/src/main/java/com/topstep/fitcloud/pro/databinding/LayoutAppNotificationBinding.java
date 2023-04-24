package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b0.c;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class LayoutAppNotificationBinding implements a {
    public final PreferenceItem itemFacebook;
    public final PreferenceItem itemInstagram;
    public final PreferenceItem itemQq;
    public final PreferenceItem itemSkype;
    public final PreferenceItem itemTwitter;
    public final PreferenceItem itemWechat;
    public final PreferenceItem itemWhatsapp;
    private final LinearLayout rootView;

    private LayoutAppNotificationBinding(LinearLayout linearLayout, PreferenceItem preferenceItem, PreferenceItem preferenceItem2, PreferenceItem preferenceItem3, PreferenceItem preferenceItem4, PreferenceItem preferenceItem5, PreferenceItem preferenceItem6, PreferenceItem preferenceItem7) {
        this.rootView = linearLayout;
        this.itemFacebook = preferenceItem;
        this.itemInstagram = preferenceItem2;
        this.itemQq = preferenceItem3;
        this.itemSkype = preferenceItem4;
        this.itemTwitter = preferenceItem5;
        this.itemWechat = preferenceItem6;
        this.itemWhatsapp = preferenceItem7;
    }

    public static LayoutAppNotificationBinding bind(View view) {
        int i10 = R.id.item_facebook;
        PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_facebook);
        if (preferenceItem != null) {
            i10 = R.id.item_instagram;
            PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_instagram);
            if (preferenceItem2 != null) {
                i10 = R.id.item_qq;
                PreferenceItem preferenceItem3 = (PreferenceItem) c.m(view, R.id.item_qq);
                if (preferenceItem3 != null) {
                    i10 = R.id.item_skype;
                    PreferenceItem preferenceItem4 = (PreferenceItem) c.m(view, R.id.item_skype);
                    if (preferenceItem4 != null) {
                        i10 = R.id.item_twitter;
                        PreferenceItem preferenceItem5 = (PreferenceItem) c.m(view, R.id.item_twitter);
                        if (preferenceItem5 != null) {
                            i10 = R.id.item_wechat;
                            PreferenceItem preferenceItem6 = (PreferenceItem) c.m(view, R.id.item_wechat);
                            if (preferenceItem6 != null) {
                                i10 = R.id.item_whatsapp;
                                PreferenceItem preferenceItem7 = (PreferenceItem) c.m(view, R.id.item_whatsapp);
                                if (preferenceItem7 != null) {
                                    return new LayoutAppNotificationBinding((LinearLayout) view, preferenceItem, preferenceItem2, preferenceItem3, preferenceItem4, preferenceItem5, preferenceItem6, preferenceItem7);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutAppNotificationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutAppNotificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.layout_app_notification, viewGroup, false);
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
