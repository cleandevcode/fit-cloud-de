package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentNotificationHelpBinding implements a {
    public final Button btnContacts;
    public final Button btnNotification;
    public final Button btnSms;
    public final Button btnTelephony;
    public final LinearLayout layoutContacts;
    public final LinearLayout layoutSms;
    public final LinearLayout layoutTelephony;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvNotificationDes;

    private FragmentNotificationHelpBinding(LinearLayout linearLayout, Button button, Button button2, Button button3, Button button4, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, MaterialToolbar materialToolbar, TextView textView) {
        this.rootView = linearLayout;
        this.btnContacts = button;
        this.btnNotification = button2;
        this.btnSms = button3;
        this.btnTelephony = button4;
        this.layoutContacts = linearLayout2;
        this.layoutSms = linearLayout3;
        this.layoutTelephony = linearLayout4;
        this.toolbar = materialToolbar;
        this.tvNotificationDes = textView;
    }

    public static FragmentNotificationHelpBinding bind(View view) {
        int i10 = R.id.btn_contacts;
        Button button = (Button) c.m(view, R.id.btn_contacts);
        if (button != null) {
            i10 = R.id.btn_notification;
            Button button2 = (Button) c.m(view, R.id.btn_notification);
            if (button2 != null) {
                i10 = R.id.btn_sms;
                Button button3 = (Button) c.m(view, R.id.btn_sms);
                if (button3 != null) {
                    i10 = R.id.btn_telephony;
                    Button button4 = (Button) c.m(view, R.id.btn_telephony);
                    if (button4 != null) {
                        i10 = R.id.layout_contacts;
                        LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_contacts);
                        if (linearLayout != null) {
                            i10 = R.id.layout_sms;
                            LinearLayout linearLayout2 = (LinearLayout) c.m(view, R.id.layout_sms);
                            if (linearLayout2 != null) {
                                i10 = R.id.layout_telephony;
                                LinearLayout linearLayout3 = (LinearLayout) c.m(view, R.id.layout_telephony);
                                if (linearLayout3 != null) {
                                    i10 = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                    if (materialToolbar != null) {
                                        i10 = R.id.tv_notification_des;
                                        TextView textView = (TextView) c.m(view, R.id.tv_notification_des);
                                        if (textView != null) {
                                            return new FragmentNotificationHelpBinding((LinearLayout) view, button, button2, button3, button4, linearLayout, linearLayout2, linearLayout3, materialToolbar, textView);
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

    public static FragmentNotificationHelpBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNotificationHelpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_notification_help, viewGroup, false);
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
