package com.permissionx.guolindev.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.permissionx.guolindev.R;

/* loaded from: classes.dex */
public final class PermissionxDefaultDialogLayoutBinding implements a {
    public final TextView messageText;
    public final Button negativeBtn;
    public final LinearLayout negativeLayout;
    public final LinearLayout permissionsLayout;
    public final Button positiveBtn;
    public final LinearLayout positiveLayout;
    private final LinearLayout rootView;

    private PermissionxDefaultDialogLayoutBinding(LinearLayout linearLayout, TextView textView, Button button, LinearLayout linearLayout2, LinearLayout linearLayout3, Button button2, LinearLayout linearLayout4) {
        this.rootView = linearLayout;
        this.messageText = textView;
        this.negativeBtn = button;
        this.negativeLayout = linearLayout2;
        this.permissionsLayout = linearLayout3;
        this.positiveBtn = button2;
        this.positiveLayout = linearLayout4;
    }

    public static PermissionxDefaultDialogLayoutBinding bind(View view) {
        int i10 = R.id.messageText;
        TextView textView = (TextView) c.m(view, i10);
        if (textView != null) {
            i10 = R.id.negativeBtn;
            Button button = (Button) c.m(view, i10);
            if (button != null) {
                i10 = R.id.negativeLayout;
                LinearLayout linearLayout = (LinearLayout) c.m(view, i10);
                if (linearLayout != null) {
                    i10 = R.id.permissionsLayout;
                    LinearLayout linearLayout2 = (LinearLayout) c.m(view, i10);
                    if (linearLayout2 != null) {
                        i10 = R.id.positiveBtn;
                        Button button2 = (Button) c.m(view, i10);
                        if (button2 != null) {
                            i10 = R.id.positiveLayout;
                            LinearLayout linearLayout3 = (LinearLayout) c.m(view, i10);
                            if (linearLayout3 != null) {
                                return new PermissionxDefaultDialogLayoutBinding((LinearLayout) view, textView, button, linearLayout, linearLayout2, button2, linearLayout3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static PermissionxDefaultDialogLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PermissionxDefaultDialogLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.permissionx_default_dialog_layout, viewGroup, false);
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
