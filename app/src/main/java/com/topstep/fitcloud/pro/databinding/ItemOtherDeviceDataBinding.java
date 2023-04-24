package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemOtherDeviceDataBinding implements a {
    public final Button btnAction;
    private final RelativeLayout rootView;
    public final TextView tvAddress;
    public final TextView tvName;

    private ItemOtherDeviceDataBinding(RelativeLayout relativeLayout, Button button, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.btnAction = button;
        this.tvAddress = textView;
        this.tvName = textView2;
    }

    public static ItemOtherDeviceDataBinding bind(View view) {
        int i10 = R.id.btn_action;
        Button button = (Button) c.m(view, R.id.btn_action);
        if (button != null) {
            i10 = R.id.tv_address;
            TextView textView = (TextView) c.m(view, R.id.tv_address);
            if (textView != null) {
                i10 = R.id.tv_name;
                TextView textView2 = (TextView) c.m(view, R.id.tv_name);
                if (textView2 != null) {
                    return new ItemOtherDeviceDataBinding((RelativeLayout) view, button, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemOtherDeviceDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemOtherDeviceDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_other_device_data, viewGroup, false);
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
