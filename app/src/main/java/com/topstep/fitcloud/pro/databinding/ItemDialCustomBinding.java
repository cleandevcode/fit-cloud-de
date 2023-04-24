package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import b0.c;
import com.topstep.fitcloud.pro.ui.device.dial.DialCardView;
import com.topstep.fitcloud.sdk.v2.utils.dial.DialView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemDialCustomBinding implements a {
    public final DialCardView cardView;
    public final DialView dialView;
    private final DialCardView rootView;

    private ItemDialCustomBinding(DialCardView dialCardView, DialCardView dialCardView2, DialView dialView) {
        this.rootView = dialCardView;
        this.cardView = dialCardView2;
        this.dialView = dialView;
    }

    public static ItemDialCustomBinding bind(View view) {
        DialCardView dialCardView = (DialCardView) view;
        DialView dialView = (DialView) c.m(view, R.id.dial_view);
        if (dialView != null) {
            return new ItemDialCustomBinding(dialCardView, dialCardView, dialView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.dial_view)));
    }

    public static ItemDialCustomBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDialCustomBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_dial_custom, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public DialCardView getRoot() {
        return this.rootView;
    }
}
