package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import b0.c;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentWhSettingsBinding implements a {
    public final Button btnCommit;
    public final PreferenceItem itemCycle;
    public final PreferenceItem itemDuration;
    public final PreferenceItem itemLatest;
    public final PreferenceItem itemPregnancyCycle;
    public final PreferenceItem itemPregnancyDueDate;
    public final PreferenceItem itemPregnancyLatest;
    public final PreferenceItem itemRemindAdvance;
    public final PreferenceItem itemRemindDevice;
    public final PreferenceItem itemRemindTime;
    public final PreferenceItem itemRemindType;
    public final LinearLayout layoutMenstruation1;
    public final LinearLayout layoutMenstruation2;
    public final LinearLayout layoutPregnancy1;
    public final LinearLayout layoutPregnancy2;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentWhSettingsBinding(LinearLayout linearLayout, Button button, PreferenceItem preferenceItem, PreferenceItem preferenceItem2, PreferenceItem preferenceItem3, PreferenceItem preferenceItem4, PreferenceItem preferenceItem5, PreferenceItem preferenceItem6, PreferenceItem preferenceItem7, PreferenceItem preferenceItem8, PreferenceItem preferenceItem9, PreferenceItem preferenceItem10, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.btnCommit = button;
        this.itemCycle = preferenceItem;
        this.itemDuration = preferenceItem2;
        this.itemLatest = preferenceItem3;
        this.itemPregnancyCycle = preferenceItem4;
        this.itemPregnancyDueDate = preferenceItem5;
        this.itemPregnancyLatest = preferenceItem6;
        this.itemRemindAdvance = preferenceItem7;
        this.itemRemindDevice = preferenceItem8;
        this.itemRemindTime = preferenceItem9;
        this.itemRemindType = preferenceItem10;
        this.layoutMenstruation1 = linearLayout2;
        this.layoutMenstruation2 = linearLayout3;
        this.layoutPregnancy1 = linearLayout4;
        this.layoutPregnancy2 = linearLayout5;
        this.toolbar = materialToolbar;
    }

    public static FragmentWhSettingsBinding bind(View view) {
        int i10 = R.id.btn_commit;
        Button button = (Button) c.m(view, R.id.btn_commit);
        if (button != null) {
            i10 = R.id.item_cycle;
            PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_cycle);
            if (preferenceItem != null) {
                i10 = R.id.item_duration;
                PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_duration);
                if (preferenceItem2 != null) {
                    i10 = R.id.item_latest;
                    PreferenceItem preferenceItem3 = (PreferenceItem) c.m(view, R.id.item_latest);
                    if (preferenceItem3 != null) {
                        i10 = R.id.item_pregnancy_cycle;
                        PreferenceItem preferenceItem4 = (PreferenceItem) c.m(view, R.id.item_pregnancy_cycle);
                        if (preferenceItem4 != null) {
                            i10 = R.id.item_pregnancy_due_date;
                            PreferenceItem preferenceItem5 = (PreferenceItem) c.m(view, R.id.item_pregnancy_due_date);
                            if (preferenceItem5 != null) {
                                i10 = R.id.item_pregnancy_latest;
                                PreferenceItem preferenceItem6 = (PreferenceItem) c.m(view, R.id.item_pregnancy_latest);
                                if (preferenceItem6 != null) {
                                    i10 = R.id.item_remind_advance;
                                    PreferenceItem preferenceItem7 = (PreferenceItem) c.m(view, R.id.item_remind_advance);
                                    if (preferenceItem7 != null) {
                                        i10 = R.id.item_remind_device;
                                        PreferenceItem preferenceItem8 = (PreferenceItem) c.m(view, R.id.item_remind_device);
                                        if (preferenceItem8 != null) {
                                            i10 = R.id.item_remind_time;
                                            PreferenceItem preferenceItem9 = (PreferenceItem) c.m(view, R.id.item_remind_time);
                                            if (preferenceItem9 != null) {
                                                i10 = R.id.item_remind_type;
                                                PreferenceItem preferenceItem10 = (PreferenceItem) c.m(view, R.id.item_remind_type);
                                                if (preferenceItem10 != null) {
                                                    i10 = R.id.layout_menstruation_1;
                                                    LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_menstruation_1);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.layout_menstruation_2;
                                                        LinearLayout linearLayout2 = (LinearLayout) c.m(view, R.id.layout_menstruation_2);
                                                        if (linearLayout2 != null) {
                                                            i10 = R.id.layout_pregnancy_1;
                                                            LinearLayout linearLayout3 = (LinearLayout) c.m(view, R.id.layout_pregnancy_1);
                                                            if (linearLayout3 != null) {
                                                                i10 = R.id.layout_pregnancy_2;
                                                                LinearLayout linearLayout4 = (LinearLayout) c.m(view, R.id.layout_pregnancy_2);
                                                                if (linearLayout4 != null) {
                                                                    i10 = R.id.toolbar;
                                                                    MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                                                    if (materialToolbar != null) {
                                                                        return new FragmentWhSettingsBinding((LinearLayout) view, button, preferenceItem, preferenceItem2, preferenceItem3, preferenceItem4, preferenceItem5, preferenceItem6, preferenceItem7, preferenceItem8, preferenceItem9, preferenceItem10, linearLayout, linearLayout2, linearLayout3, linearLayout4, materialToolbar);
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

    public static FragmentWhSettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWhSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_wh_settings, viewGroup, false);
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
