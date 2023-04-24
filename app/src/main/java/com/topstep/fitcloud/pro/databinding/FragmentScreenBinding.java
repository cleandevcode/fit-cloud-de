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
public final class FragmentScreenBinding implements a {
    public final PreferenceItem itemAlwaysBright;
    public final PreferenceItem itemBrightDuration;
    public final PreferenceItem itemBrightness;
    public final PreferenceItem itemLongTimeBrightDuration;
    public final PreferenceItem itemTurnWristBrightDuration;
    public final LinearLayout layoutContent;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentScreenBinding(LinearLayout linearLayout, PreferenceItem preferenceItem, PreferenceItem preferenceItem2, PreferenceItem preferenceItem3, PreferenceItem preferenceItem4, PreferenceItem preferenceItem5, LinearLayout linearLayout2, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.itemAlwaysBright = preferenceItem;
        this.itemBrightDuration = preferenceItem2;
        this.itemBrightness = preferenceItem3;
        this.itemLongTimeBrightDuration = preferenceItem4;
        this.itemTurnWristBrightDuration = preferenceItem5;
        this.layoutContent = linearLayout2;
        this.toolbar = materialToolbar;
    }

    public static FragmentScreenBinding bind(View view) {
        int i10 = R.id.item_always_bright;
        PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_always_bright);
        if (preferenceItem != null) {
            i10 = R.id.item_bright_duration;
            PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_bright_duration);
            if (preferenceItem2 != null) {
                i10 = R.id.item_brightness;
                PreferenceItem preferenceItem3 = (PreferenceItem) c.m(view, R.id.item_brightness);
                if (preferenceItem3 != null) {
                    i10 = R.id.item_long_time_bright_duration;
                    PreferenceItem preferenceItem4 = (PreferenceItem) c.m(view, R.id.item_long_time_bright_duration);
                    if (preferenceItem4 != null) {
                        i10 = R.id.item_turn_wrist_bright_duration;
                        PreferenceItem preferenceItem5 = (PreferenceItem) c.m(view, R.id.item_turn_wrist_bright_duration);
                        if (preferenceItem5 != null) {
                            i10 = R.id.layout_content;
                            LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_content);
                            if (linearLayout != null) {
                                i10 = R.id.toolbar;
                                MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                if (materialToolbar != null) {
                                    return new FragmentScreenBinding((LinearLayout) view, preferenceItem, preferenceItem2, preferenceItem3, preferenceItem4, preferenceItem5, linearLayout, materialToolbar);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentScreenBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentScreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_screen, viewGroup, false);
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
