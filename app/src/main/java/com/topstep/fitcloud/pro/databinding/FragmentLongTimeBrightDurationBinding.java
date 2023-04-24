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
public final class FragmentLongTimeBrightDurationBinding implements a {
    public final PreferenceItem itemDuration;
    public final PreferenceItem itemEnabled;
    public final LinearLayout layoutContent;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentLongTimeBrightDurationBinding(LinearLayout linearLayout, PreferenceItem preferenceItem, PreferenceItem preferenceItem2, LinearLayout linearLayout2, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.itemDuration = preferenceItem;
        this.itemEnabled = preferenceItem2;
        this.layoutContent = linearLayout2;
        this.toolbar = materialToolbar;
    }

    public static FragmentLongTimeBrightDurationBinding bind(View view) {
        int i10 = R.id.item_duration;
        PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_duration);
        if (preferenceItem != null) {
            i10 = R.id.item_enabled;
            PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_enabled);
            if (preferenceItem2 != null) {
                i10 = R.id.layout_content;
                LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_content);
                if (linearLayout != null) {
                    i10 = R.id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                    if (materialToolbar != null) {
                        return new FragmentLongTimeBrightDurationBinding((LinearLayout) view, preferenceItem, preferenceItem2, linearLayout, materialToolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentLongTimeBrightDurationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLongTimeBrightDurationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_long_time_bright_duration, viewGroup, false);
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
