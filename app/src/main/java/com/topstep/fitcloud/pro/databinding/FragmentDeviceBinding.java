package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import b0.c;
import com.github.kilnn.tool.widget.FitPaddingMaterialToolbar;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.github.kilnn.tool.widget.preference.PreferenceTextView;
import com.topstep.fitcloud.pro.ui.widget.BatteryImageView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentDeviceBinding implements a {
    public final BatteryImageView batteryView;
    public final ImageView imgDevice;
    public final PreferenceItem itemAlarm;
    public final PreferenceTextView itemBusinessCard;
    public final PreferenceTextView itemCollectionCode;
    public final PreferenceTextView itemContacts;
    public final LayoutDeviceBindBinding itemDeviceBind;
    public final PreferenceRelativeLayout itemDeviceInfo;
    public final PreferenceTextView itemDialComponent;
    public final PreferenceTextView itemDialPush;
    public final PreferenceItem itemDrinkWater;
    public final PreferenceItem itemFindDevice;
    public final PreferenceTextView itemGamePush;
    public final PreferenceItem itemHealthMonitor;
    public final PreferenceItem itemHourStyle;
    public final PreferenceTextView itemNotification;
    public final PreferenceTextView itemNucleicAcidCode;
    public final PreferenceTextView itemPageConfig;
    public final PreferenceItem itemProtectionReminder;
    public final PreferenceTextView itemReset;
    public final PreferenceTextView itemScreen;
    public final PreferenceItem itemSedentary;
    public final PreferenceTextView itemShakeTakePhotos;
    public final PreferenceTextView itemSongPush;
    public final PreferenceTextView itemSportPush;
    public final PreferenceItem itemStrengthenTest;
    public final PreferenceItem itemTurnWristLighting;
    public final PreferenceItem itemVersion;
    public final PreferenceItem itemVibrate;
    public final PreferenceItem itemWearWay;
    public final PreferenceItem itemWeather;
    public final LinearLayout layoutContent;
    private final LinearLayout rootView;
    public final ScrollView scrollView;
    public final FitPaddingMaterialToolbar toolbar;
    public final TextView tvDeviceName;
    public final TextView tvDeviceState;

    private FragmentDeviceBinding(LinearLayout linearLayout, BatteryImageView batteryImageView, ImageView imageView, PreferenceItem preferenceItem, PreferenceTextView preferenceTextView, PreferenceTextView preferenceTextView2, PreferenceTextView preferenceTextView3, LayoutDeviceBindBinding layoutDeviceBindBinding, PreferenceRelativeLayout preferenceRelativeLayout, PreferenceTextView preferenceTextView4, PreferenceTextView preferenceTextView5, PreferenceItem preferenceItem2, PreferenceItem preferenceItem3, PreferenceTextView preferenceTextView6, PreferenceItem preferenceItem4, PreferenceItem preferenceItem5, PreferenceTextView preferenceTextView7, PreferenceTextView preferenceTextView8, PreferenceTextView preferenceTextView9, PreferenceItem preferenceItem6, PreferenceTextView preferenceTextView10, PreferenceTextView preferenceTextView11, PreferenceItem preferenceItem7, PreferenceTextView preferenceTextView12, PreferenceTextView preferenceTextView13, PreferenceTextView preferenceTextView14, PreferenceItem preferenceItem8, PreferenceItem preferenceItem9, PreferenceItem preferenceItem10, PreferenceItem preferenceItem11, PreferenceItem preferenceItem12, PreferenceItem preferenceItem13, LinearLayout linearLayout2, ScrollView scrollView, FitPaddingMaterialToolbar fitPaddingMaterialToolbar, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.batteryView = batteryImageView;
        this.imgDevice = imageView;
        this.itemAlarm = preferenceItem;
        this.itemBusinessCard = preferenceTextView;
        this.itemCollectionCode = preferenceTextView2;
        this.itemContacts = preferenceTextView3;
        this.itemDeviceBind = layoutDeviceBindBinding;
        this.itemDeviceInfo = preferenceRelativeLayout;
        this.itemDialComponent = preferenceTextView4;
        this.itemDialPush = preferenceTextView5;
        this.itemDrinkWater = preferenceItem2;
        this.itemFindDevice = preferenceItem3;
        this.itemGamePush = preferenceTextView6;
        this.itemHealthMonitor = preferenceItem4;
        this.itemHourStyle = preferenceItem5;
        this.itemNotification = preferenceTextView7;
        this.itemNucleicAcidCode = preferenceTextView8;
        this.itemPageConfig = preferenceTextView9;
        this.itemProtectionReminder = preferenceItem6;
        this.itemReset = preferenceTextView10;
        this.itemScreen = preferenceTextView11;
        this.itemSedentary = preferenceItem7;
        this.itemShakeTakePhotos = preferenceTextView12;
        this.itemSongPush = preferenceTextView13;
        this.itemSportPush = preferenceTextView14;
        this.itemStrengthenTest = preferenceItem8;
        this.itemTurnWristLighting = preferenceItem9;
        this.itemVersion = preferenceItem10;
        this.itemVibrate = preferenceItem11;
        this.itemWearWay = preferenceItem12;
        this.itemWeather = preferenceItem13;
        this.layoutContent = linearLayout2;
        this.scrollView = scrollView;
        this.toolbar = fitPaddingMaterialToolbar;
        this.tvDeviceName = textView;
        this.tvDeviceState = textView2;
    }

    public static FragmentDeviceBinding bind(View view) {
        int i10 = R.id.battery_view;
        BatteryImageView batteryImageView = (BatteryImageView) c.m(view, R.id.battery_view);
        if (batteryImageView != null) {
            i10 = R.id.img_device;
            ImageView imageView = (ImageView) c.m(view, R.id.img_device);
            if (imageView != null) {
                i10 = R.id.item_alarm;
                PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_alarm);
                if (preferenceItem != null) {
                    i10 = R.id.item_business_card;
                    PreferenceTextView preferenceTextView = (PreferenceTextView) c.m(view, R.id.item_business_card);
                    if (preferenceTextView != null) {
                        i10 = R.id.item_collection_code;
                        PreferenceTextView preferenceTextView2 = (PreferenceTextView) c.m(view, R.id.item_collection_code);
                        if (preferenceTextView2 != null) {
                            i10 = R.id.item_contacts;
                            PreferenceTextView preferenceTextView3 = (PreferenceTextView) c.m(view, R.id.item_contacts);
                            if (preferenceTextView3 != null) {
                                i10 = R.id.item_device_bind;
                                View m10 = c.m(view, R.id.item_device_bind);
                                if (m10 != null) {
                                    LayoutDeviceBindBinding bind = LayoutDeviceBindBinding.bind(m10);
                                    i10 = R.id.item_device_info;
                                    PreferenceRelativeLayout preferenceRelativeLayout = (PreferenceRelativeLayout) c.m(view, R.id.item_device_info);
                                    if (preferenceRelativeLayout != null) {
                                        i10 = R.id.item_dial_component;
                                        PreferenceTextView preferenceTextView4 = (PreferenceTextView) c.m(view, R.id.item_dial_component);
                                        if (preferenceTextView4 != null) {
                                            i10 = R.id.item_dial_push;
                                            PreferenceTextView preferenceTextView5 = (PreferenceTextView) c.m(view, R.id.item_dial_push);
                                            if (preferenceTextView5 != null) {
                                                i10 = R.id.item_drink_water;
                                                PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_drink_water);
                                                if (preferenceItem2 != null) {
                                                    i10 = R.id.item_find_device;
                                                    PreferenceItem preferenceItem3 = (PreferenceItem) c.m(view, R.id.item_find_device);
                                                    if (preferenceItem3 != null) {
                                                        i10 = R.id.item_game_push;
                                                        PreferenceTextView preferenceTextView6 = (PreferenceTextView) c.m(view, R.id.item_game_push);
                                                        if (preferenceTextView6 != null) {
                                                            i10 = R.id.item_health_monitor;
                                                            PreferenceItem preferenceItem4 = (PreferenceItem) c.m(view, R.id.item_health_monitor);
                                                            if (preferenceItem4 != null) {
                                                                i10 = R.id.item_hour_style;
                                                                PreferenceItem preferenceItem5 = (PreferenceItem) c.m(view, R.id.item_hour_style);
                                                                if (preferenceItem5 != null) {
                                                                    i10 = R.id.item_notification;
                                                                    PreferenceTextView preferenceTextView7 = (PreferenceTextView) c.m(view, R.id.item_notification);
                                                                    if (preferenceTextView7 != null) {
                                                                        i10 = R.id.item_nucleic_acid_code;
                                                                        PreferenceTextView preferenceTextView8 = (PreferenceTextView) c.m(view, R.id.item_nucleic_acid_code);
                                                                        if (preferenceTextView8 != null) {
                                                                            i10 = R.id.item_page_config;
                                                                            PreferenceTextView preferenceTextView9 = (PreferenceTextView) c.m(view, R.id.item_page_config);
                                                                            if (preferenceTextView9 != null) {
                                                                                i10 = R.id.item_protection_reminder;
                                                                                PreferenceItem preferenceItem6 = (PreferenceItem) c.m(view, R.id.item_protection_reminder);
                                                                                if (preferenceItem6 != null) {
                                                                                    i10 = R.id.item_reset;
                                                                                    PreferenceTextView preferenceTextView10 = (PreferenceTextView) c.m(view, R.id.item_reset);
                                                                                    if (preferenceTextView10 != null) {
                                                                                        i10 = R.id.item_screen;
                                                                                        PreferenceTextView preferenceTextView11 = (PreferenceTextView) c.m(view, R.id.item_screen);
                                                                                        if (preferenceTextView11 != null) {
                                                                                            i10 = R.id.item_sedentary;
                                                                                            PreferenceItem preferenceItem7 = (PreferenceItem) c.m(view, R.id.item_sedentary);
                                                                                            if (preferenceItem7 != null) {
                                                                                                i10 = R.id.item_shake_take_photos;
                                                                                                PreferenceTextView preferenceTextView12 = (PreferenceTextView) c.m(view, R.id.item_shake_take_photos);
                                                                                                if (preferenceTextView12 != null) {
                                                                                                    i10 = R.id.item_song_push;
                                                                                                    PreferenceTextView preferenceTextView13 = (PreferenceTextView) c.m(view, R.id.item_song_push);
                                                                                                    if (preferenceTextView13 != null) {
                                                                                                        i10 = R.id.item_sport_push;
                                                                                                        PreferenceTextView preferenceTextView14 = (PreferenceTextView) c.m(view, R.id.item_sport_push);
                                                                                                        if (preferenceTextView14 != null) {
                                                                                                            i10 = R.id.item_strengthen_test;
                                                                                                            PreferenceItem preferenceItem8 = (PreferenceItem) c.m(view, R.id.item_strengthen_test);
                                                                                                            if (preferenceItem8 != null) {
                                                                                                                i10 = R.id.item_turn_wrist_lighting;
                                                                                                                PreferenceItem preferenceItem9 = (PreferenceItem) c.m(view, R.id.item_turn_wrist_lighting);
                                                                                                                if (preferenceItem9 != null) {
                                                                                                                    i10 = R.id.item_version;
                                                                                                                    PreferenceItem preferenceItem10 = (PreferenceItem) c.m(view, R.id.item_version);
                                                                                                                    if (preferenceItem10 != null) {
                                                                                                                        i10 = R.id.item_vibrate;
                                                                                                                        PreferenceItem preferenceItem11 = (PreferenceItem) c.m(view, R.id.item_vibrate);
                                                                                                                        if (preferenceItem11 != null) {
                                                                                                                            i10 = R.id.item_wear_way;
                                                                                                                            PreferenceItem preferenceItem12 = (PreferenceItem) c.m(view, R.id.item_wear_way);
                                                                                                                            if (preferenceItem12 != null) {
                                                                                                                                i10 = R.id.item_weather;
                                                                                                                                PreferenceItem preferenceItem13 = (PreferenceItem) c.m(view, R.id.item_weather);
                                                                                                                                if (preferenceItem13 != null) {
                                                                                                                                    i10 = R.id.layout_content;
                                                                                                                                    LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_content);
                                                                                                                                    if (linearLayout != null) {
                                                                                                                                        i10 = R.id.scroll_view;
                                                                                                                                        ScrollView scrollView = (ScrollView) c.m(view, R.id.scroll_view);
                                                                                                                                        if (scrollView != null) {
                                                                                                                                            i10 = R.id.toolbar;
                                                                                                                                            FitPaddingMaterialToolbar fitPaddingMaterialToolbar = (FitPaddingMaterialToolbar) c.m(view, R.id.toolbar);
                                                                                                                                            if (fitPaddingMaterialToolbar != null) {
                                                                                                                                                i10 = R.id.tv_device_name;
                                                                                                                                                TextView textView = (TextView) c.m(view, R.id.tv_device_name);
                                                                                                                                                if (textView != null) {
                                                                                                                                                    i10 = R.id.tv_device_state;
                                                                                                                                                    TextView textView2 = (TextView) c.m(view, R.id.tv_device_state);
                                                                                                                                                    if (textView2 != null) {
                                                                                                                                                        return new FragmentDeviceBinding((LinearLayout) view, batteryImageView, imageView, preferenceItem, preferenceTextView, preferenceTextView2, preferenceTextView3, bind, preferenceRelativeLayout, preferenceTextView4, preferenceTextView5, preferenceItem2, preferenceItem3, preferenceTextView6, preferenceItem4, preferenceItem5, preferenceTextView7, preferenceTextView8, preferenceTextView9, preferenceItem6, preferenceTextView10, preferenceTextView11, preferenceItem7, preferenceTextView12, preferenceTextView13, preferenceTextView14, preferenceItem8, preferenceItem9, preferenceItem10, preferenceItem11, preferenceItem12, preferenceItem13, linearLayout, scrollView, fitPaddingMaterialToolbar, textView, textView2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentDeviceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDeviceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device, viewGroup, false);
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
