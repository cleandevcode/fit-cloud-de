package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloud.pro.ui.widget.SignalView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemScanDeviceBinding implements a {
    public final Button btnAction;
    public final LinearLayout layoutRssi;
    private final RelativeLayout rootView;
    public final SignalView signalView;
    public final TextView tvAddress;
    public final TextView tvName;
    public final TextView tvRssi;

    private ItemScanDeviceBinding(RelativeLayout relativeLayout, Button button, LinearLayout linearLayout, SignalView signalView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = relativeLayout;
        this.btnAction = button;
        this.layoutRssi = linearLayout;
        this.signalView = signalView;
        this.tvAddress = textView;
        this.tvName = textView2;
        this.tvRssi = textView3;
    }

    public static ItemScanDeviceBinding bind(View view) {
        int i10 = R.id.btn_action;
        Button button = (Button) c.m(view, R.id.btn_action);
        if (button != null) {
            i10 = R.id.layout_rssi;
            LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_rssi);
            if (linearLayout != null) {
                i10 = R.id.signal_view;
                SignalView signalView = (SignalView) c.m(view, R.id.signal_view);
                if (signalView != null) {
                    i10 = R.id.tv_address;
                    TextView textView = (TextView) c.m(view, R.id.tv_address);
                    if (textView != null) {
                        i10 = R.id.tv_name;
                        TextView textView2 = (TextView) c.m(view, R.id.tv_name);
                        if (textView2 != null) {
                            i10 = R.id.tv_rssi;
                            TextView textView3 = (TextView) c.m(view, R.id.tv_rssi);
                            if (textView3 != null) {
                                return new ItemScanDeviceBinding((RelativeLayout) view, button, linearLayout, signalView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemScanDeviceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemScanDeviceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_scan_device, viewGroup, false);
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
