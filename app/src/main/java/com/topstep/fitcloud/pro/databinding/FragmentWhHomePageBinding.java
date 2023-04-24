package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b0.c;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentWhHomePageBinding implements a {
    public final PreferenceItem itemEnabled;
    public final PreferenceItem itemModeMenstruation;
    public final PreferenceItem itemModePregnancy;
    public final PreferenceItem itemModePregnancyPrepare;
    public final LinearLayout layoutDetail;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentWhHomePageBinding(LinearLayout linearLayout, PreferenceItem preferenceItem, PreferenceItem preferenceItem2, PreferenceItem preferenceItem3, PreferenceItem preferenceItem4, LinearLayout linearLayout2, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.itemEnabled = preferenceItem;
        this.itemModeMenstruation = preferenceItem2;
        this.itemModePregnancy = preferenceItem3;
        this.itemModePregnancyPrepare = preferenceItem4;
        this.layoutDetail = linearLayout2;
        this.toolbar = materialToolbar;
    }

    public static FragmentWhHomePageBinding bind(View view) {
        int i10 = R.id.item_enabled;
        PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_enabled);
        if (preferenceItem != null) {
            i10 = R.id.item_mode_menstruation;
            PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_mode_menstruation);
            if (preferenceItem2 != null) {
                i10 = R.id.item_mode_pregnancy;
                PreferenceItem preferenceItem3 = (PreferenceItem) c.m(view, R.id.item_mode_pregnancy);
                if (preferenceItem3 != null) {
                    i10 = R.id.item_mode_pregnancy_prepare;
                    PreferenceItem preferenceItem4 = (PreferenceItem) c.m(view, R.id.item_mode_pregnancy_prepare);
                    if (preferenceItem4 != null) {
                        i10 = R.id.layout_detail;
                        LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_detail);
                        if (linearLayout != null) {
                            i10 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                            if (materialToolbar != null) {
                                return new FragmentWhHomePageBinding((LinearLayout) view, preferenceItem, preferenceItem2, preferenceItem3, preferenceItem4, linearLayout, materialToolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentWhHomePageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWhHomePageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_wh_home_page, viewGroup, false);
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
