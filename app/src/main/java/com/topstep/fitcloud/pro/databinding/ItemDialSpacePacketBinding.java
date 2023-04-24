package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloud.sdk.v2.utils.dial.DialView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemDialSpacePacketBinding implements a {
    public final DialView dialView;
    private final LinearLayout rootView;
    public final TextView tvSpaceSize;

    private ItemDialSpacePacketBinding(LinearLayout linearLayout, DialView dialView, TextView textView) {
        this.rootView = linearLayout;
        this.dialView = dialView;
        this.tvSpaceSize = textView;
    }

    public static ItemDialSpacePacketBinding bind(View view) {
        int i10 = R.id.dial_view;
        DialView dialView = (DialView) c.m(view, R.id.dial_view);
        if (dialView != null) {
            i10 = R.id.tv_space_size;
            TextView textView = (TextView) c.m(view, R.id.tv_space_size);
            if (textView != null) {
                return new ItemDialSpacePacketBinding((LinearLayout) view, dialView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemDialSpacePacketBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDialSpacePacketBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_dial_space_packet, viewGroup, false);
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
