package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.c;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.github.kilnn.tool.widget.preference.PreferenceLinearLayout;
import com.github.kilnn.tool.widget.preference.PreferenceTextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentSettingsBinding implements a {
    public final Button btnSignOut;
    public final PreferenceTextView itemAbout;
    public final PreferenceItem itemAccountManage;
    public final PreferenceTextView itemBgRunSettings;
    public final PreferenceLinearLayout itemCloudSync;
    public final PreferenceTextView itemConnectHelp;
    public final PreferenceTextView itemNotificationHelp;
    public final PreferenceItem itemTheme;
    public final PreferenceItem itemVersionUpdate;
    private final RelativeLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvLastSyncTime;
    public final TextView tvNewDataCount;

    private FragmentSettingsBinding(RelativeLayout relativeLayout, Button button, PreferenceTextView preferenceTextView, PreferenceItem preferenceItem, PreferenceTextView preferenceTextView2, PreferenceLinearLayout preferenceLinearLayout, PreferenceTextView preferenceTextView3, PreferenceTextView preferenceTextView4, PreferenceItem preferenceItem2, PreferenceItem preferenceItem3, MaterialToolbar materialToolbar, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.btnSignOut = button;
        this.itemAbout = preferenceTextView;
        this.itemAccountManage = preferenceItem;
        this.itemBgRunSettings = preferenceTextView2;
        this.itemCloudSync = preferenceLinearLayout;
        this.itemConnectHelp = preferenceTextView3;
        this.itemNotificationHelp = preferenceTextView4;
        this.itemTheme = preferenceItem2;
        this.itemVersionUpdate = preferenceItem3;
        this.toolbar = materialToolbar;
        this.tvLastSyncTime = textView;
        this.tvNewDataCount = textView2;
    }

    public static FragmentSettingsBinding bind(View view) {
        int i10 = R.id.btn_sign_out;
        Button button = (Button) c.m(view, R.id.btn_sign_out);
        if (button != null) {
            i10 = R.id.item_about;
            PreferenceTextView preferenceTextView = (PreferenceTextView) c.m(view, R.id.item_about);
            if (preferenceTextView != null) {
                i10 = R.id.item_account_manage;
                PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_account_manage);
                if (preferenceItem != null) {
                    i10 = R.id.item_bg_run_settings;
                    PreferenceTextView preferenceTextView2 = (PreferenceTextView) c.m(view, R.id.item_bg_run_settings);
                    if (preferenceTextView2 != null) {
                        i10 = R.id.item_cloud_sync;
                        PreferenceLinearLayout preferenceLinearLayout = (PreferenceLinearLayout) c.m(view, R.id.item_cloud_sync);
                        if (preferenceLinearLayout != null) {
                            i10 = R.id.item_connect_help;
                            PreferenceTextView preferenceTextView3 = (PreferenceTextView) c.m(view, R.id.item_connect_help);
                            if (preferenceTextView3 != null) {
                                i10 = R.id.item_notification_help;
                                PreferenceTextView preferenceTextView4 = (PreferenceTextView) c.m(view, R.id.item_notification_help);
                                if (preferenceTextView4 != null) {
                                    i10 = R.id.item_theme;
                                    PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_theme);
                                    if (preferenceItem2 != null) {
                                        i10 = R.id.item_version_update;
                                        PreferenceItem preferenceItem3 = (PreferenceItem) c.m(view, R.id.item_version_update);
                                        if (preferenceItem3 != null) {
                                            i10 = R.id.toolbar;
                                            MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                            if (materialToolbar != null) {
                                                i10 = R.id.tv_last_sync_time;
                                                TextView textView = (TextView) c.m(view, R.id.tv_last_sync_time);
                                                if (textView != null) {
                                                    i10 = R.id.tv_new_data_count;
                                                    TextView textView2 = (TextView) c.m(view, R.id.tv_new_data_count);
                                                    if (textView2 != null) {
                                                        return new FragmentSettingsBinding((RelativeLayout) view, button, preferenceTextView, preferenceItem, preferenceTextView2, preferenceLinearLayout, preferenceTextView3, preferenceTextView4, preferenceItem2, preferenceItem3, materialToolbar, textView, textView2);
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

    public static FragmentSettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_settings, viewGroup, false);
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
