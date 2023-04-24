package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import b0.c;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.github.kilnn.wheellayout.OneWheelLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentAlarmDetailBinding implements a {
    public final Button btnDelete;
    public final Button btnSave;
    public final PreferenceItem itemLabel;
    public final PreferenceItem itemRepeat;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final OneWheelLayout wheelAmPm;
    public final OneWheelLayout wheelHour;
    public final OneWheelLayout wheelMinute;

    private FragmentAlarmDetailBinding(LinearLayout linearLayout, Button button, Button button2, PreferenceItem preferenceItem, PreferenceItem preferenceItem2, MaterialToolbar materialToolbar, OneWheelLayout oneWheelLayout, OneWheelLayout oneWheelLayout2, OneWheelLayout oneWheelLayout3) {
        this.rootView = linearLayout;
        this.btnDelete = button;
        this.btnSave = button2;
        this.itemLabel = preferenceItem;
        this.itemRepeat = preferenceItem2;
        this.toolbar = materialToolbar;
        this.wheelAmPm = oneWheelLayout;
        this.wheelHour = oneWheelLayout2;
        this.wheelMinute = oneWheelLayout3;
    }

    public static FragmentAlarmDetailBinding bind(View view) {
        int i10 = R.id.btn_delete;
        Button button = (Button) c.m(view, R.id.btn_delete);
        if (button != null) {
            i10 = R.id.btn_save;
            Button button2 = (Button) c.m(view, R.id.btn_save);
            if (button2 != null) {
                i10 = R.id.item_label;
                PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_label);
                if (preferenceItem != null) {
                    i10 = R.id.item_repeat;
                    PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_repeat);
                    if (preferenceItem2 != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                        if (materialToolbar != null) {
                            i10 = R.id.wheel_am_pm;
                            OneWheelLayout oneWheelLayout = (OneWheelLayout) c.m(view, R.id.wheel_am_pm);
                            if (oneWheelLayout != null) {
                                i10 = R.id.wheel_hour;
                                OneWheelLayout oneWheelLayout2 = (OneWheelLayout) c.m(view, R.id.wheel_hour);
                                if (oneWheelLayout2 != null) {
                                    i10 = R.id.wheel_minute;
                                    OneWheelLayout oneWheelLayout3 = (OneWheelLayout) c.m(view, R.id.wheel_minute);
                                    if (oneWheelLayout3 != null) {
                                        return new FragmentAlarmDetailBinding((LinearLayout) view, button, button2, preferenceItem, preferenceItem2, materialToolbar, oneWheelLayout, oneWheelLayout2, oneWheelLayout3);
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

    public static FragmentAlarmDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAlarmDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_alarm_detail, viewGroup, false);
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
