package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b0.c;
import com.topstep.fitcloud.sdk.v2.utils.dial.DialView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemDialCustomGridAddBinding implements a {
    public final DialView dialView;
    private final FrameLayout rootView;

    private ItemDialCustomGridAddBinding(FrameLayout frameLayout, DialView dialView) {
        this.rootView = frameLayout;
        this.dialView = dialView;
    }

    public static ItemDialCustomGridAddBinding bind(View view) {
        DialView dialView = (DialView) c.m(view, R.id.dial_view);
        if (dialView != null) {
            return new ItemDialCustomGridAddBinding((FrameLayout) view, dialView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.dial_view)));
    }

    public static ItemDialCustomGridAddBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDialCustomGridAddBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_dial_custom_grid_add, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
