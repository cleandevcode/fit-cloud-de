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
import com.topstep.fitcloud.pro.ui.widget.ProgressDotView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class DialogDeviceConnectBinding implements a {
    public final Button btnAction;
    public final Button btnUnbind;
    public final RelativeLayout layoutAction;
    public final LinearLayout layoutConnecting;
    public final ProgressDotView progressDotView;
    private final LinearLayout rootView;
    public final TextView tvAddress;
    public final TextView tvExtraMsg;
    public final TextView tvName;
    public final TextView tvState;
    public final TextView tvUnableToConnect;

    private DialogDeviceConnectBinding(LinearLayout linearLayout, Button button, Button button2, RelativeLayout relativeLayout, LinearLayout linearLayout2, ProgressDotView progressDotView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.btnAction = button;
        this.btnUnbind = button2;
        this.layoutAction = relativeLayout;
        this.layoutConnecting = linearLayout2;
        this.progressDotView = progressDotView;
        this.tvAddress = textView;
        this.tvExtraMsg = textView2;
        this.tvName = textView3;
        this.tvState = textView4;
        this.tvUnableToConnect = textView5;
    }

    public static DialogDeviceConnectBinding bind(View view) {
        int i10 = R.id.btn_action;
        Button button = (Button) c.m(view, R.id.btn_action);
        if (button != null) {
            i10 = R.id.btn_unbind;
            Button button2 = (Button) c.m(view, R.id.btn_unbind);
            if (button2 != null) {
                i10 = R.id.layout_action;
                RelativeLayout relativeLayout = (RelativeLayout) c.m(view, R.id.layout_action);
                if (relativeLayout != null) {
                    i10 = R.id.layout_connecting;
                    LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_connecting);
                    if (linearLayout != null) {
                        i10 = R.id.progress_dot_view;
                        ProgressDotView progressDotView = (ProgressDotView) c.m(view, R.id.progress_dot_view);
                        if (progressDotView != null) {
                            i10 = R.id.tv_address;
                            TextView textView = (TextView) c.m(view, R.id.tv_address);
                            if (textView != null) {
                                i10 = R.id.tv_extra_msg;
                                TextView textView2 = (TextView) c.m(view, R.id.tv_extra_msg);
                                if (textView2 != null) {
                                    i10 = R.id.tv_name;
                                    TextView textView3 = (TextView) c.m(view, R.id.tv_name);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_state;
                                        TextView textView4 = (TextView) c.m(view, R.id.tv_state);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_unable_to_connect;
                                            TextView textView5 = (TextView) c.m(view, R.id.tv_unable_to_connect);
                                            if (textView5 != null) {
                                                return new DialogDeviceConnectBinding((LinearLayout) view, button, button2, relativeLayout, linearLayout, progressDotView, textView, textView2, textView3, textView4, textView5);
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

    public static DialogDeviceConnectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogDeviceConnectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_device_connect, viewGroup, false);
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
