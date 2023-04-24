package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import b0.c;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentNotificationBinding implements a {
    public final ImageView imgSmsSettings;
    public final ImageView imgTelephonySettings;
    public final PreferenceItem itemAll;
    public final PreferenceItem itemEmail;
    public final PreferenceItem itemOther;
    public final PreferenceItem itemScreenOff;
    public final LayoutAppNotificationBinding layoutApp;
    public final LinearLayout layoutContent;
    public final LinearLayout layoutSystem;
    private final LinearLayout rootView;
    public final SwitchCompat switchSms;
    public final SwitchCompat switchTelephony;
    public final MaterialToolbar toolbar;

    private FragmentNotificationBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, PreferenceItem preferenceItem, PreferenceItem preferenceItem2, PreferenceItem preferenceItem3, PreferenceItem preferenceItem4, LayoutAppNotificationBinding layoutAppNotificationBinding, LinearLayout linearLayout2, LinearLayout linearLayout3, SwitchCompat switchCompat, SwitchCompat switchCompat2, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.imgSmsSettings = imageView;
        this.imgTelephonySettings = imageView2;
        this.itemAll = preferenceItem;
        this.itemEmail = preferenceItem2;
        this.itemOther = preferenceItem3;
        this.itemScreenOff = preferenceItem4;
        this.layoutApp = layoutAppNotificationBinding;
        this.layoutContent = linearLayout2;
        this.layoutSystem = linearLayout3;
        this.switchSms = switchCompat;
        this.switchTelephony = switchCompat2;
        this.toolbar = materialToolbar;
    }

    public static FragmentNotificationBinding bind(View view) {
        int i10 = R.id.img_sms_settings;
        ImageView imageView = (ImageView) c.m(view, R.id.img_sms_settings);
        if (imageView != null) {
            i10 = R.id.img_telephony_settings;
            ImageView imageView2 = (ImageView) c.m(view, R.id.img_telephony_settings);
            if (imageView2 != null) {
                i10 = R.id.item_all;
                PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_all);
                if (preferenceItem != null) {
                    i10 = R.id.item_email;
                    PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_email);
                    if (preferenceItem2 != null) {
                        i10 = R.id.item_other;
                        PreferenceItem preferenceItem3 = (PreferenceItem) c.m(view, R.id.item_other);
                        if (preferenceItem3 != null) {
                            i10 = R.id.item_screen_off;
                            PreferenceItem preferenceItem4 = (PreferenceItem) c.m(view, R.id.item_screen_off);
                            if (preferenceItem4 != null) {
                                i10 = R.id.layout_app;
                                View m10 = c.m(view, R.id.layout_app);
                                if (m10 != null) {
                                    LayoutAppNotificationBinding bind = LayoutAppNotificationBinding.bind(m10);
                                    i10 = R.id.layout_content;
                                    LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_content);
                                    if (linearLayout != null) {
                                        i10 = R.id.layout_system;
                                        LinearLayout linearLayout2 = (LinearLayout) c.m(view, R.id.layout_system);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.switch_sms;
                                            SwitchCompat switchCompat = (SwitchCompat) c.m(view, R.id.switch_sms);
                                            if (switchCompat != null) {
                                                i10 = R.id.switch_telephony;
                                                SwitchCompat switchCompat2 = (SwitchCompat) c.m(view, R.id.switch_telephony);
                                                if (switchCompat2 != null) {
                                                    i10 = R.id.toolbar;
                                                    MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                                    if (materialToolbar != null) {
                                                        return new FragmentNotificationBinding((LinearLayout) view, imageView, imageView2, preferenceItem, preferenceItem2, preferenceItem3, preferenceItem4, bind, linearLayout, linearLayout2, switchCompat, switchCompat2, materialToolbar);
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

    public static FragmentNotificationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNotificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_notification, viewGroup, false);
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
