package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentConnectHelpBinding implements a {
    public final Button btnEnableLocationService;
    public final Button btnGrantPermission;
    public final RelativeLayout layoutLocationService;
    public final RelativeLayout layoutPermission;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentConnectHelpBinding(LinearLayout linearLayout, Button button, Button button2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.btnEnableLocationService = button;
        this.btnGrantPermission = button2;
        this.layoutLocationService = relativeLayout;
        this.layoutPermission = relativeLayout2;
        this.toolbar = materialToolbar;
    }

    public static FragmentConnectHelpBinding bind(View view) {
        int i10 = R.id.btn_enable_location_service;
        Button button = (Button) c.m(view, R.id.btn_enable_location_service);
        if (button != null) {
            i10 = R.id.btn_grant_permission;
            Button button2 = (Button) c.m(view, R.id.btn_grant_permission);
            if (button2 != null) {
                i10 = R.id.layout_location_service;
                RelativeLayout relativeLayout = (RelativeLayout) c.m(view, R.id.layout_location_service);
                if (relativeLayout != null) {
                    i10 = R.id.layout_permission;
                    RelativeLayout relativeLayout2 = (RelativeLayout) c.m(view, R.id.layout_permission);
                    if (relativeLayout2 != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                        if (materialToolbar != null) {
                            return new FragmentConnectHelpBinding((LinearLayout) view, button, button2, relativeLayout, relativeLayout2, materialToolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentConnectHelpBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentConnectHelpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_connect_help, viewGroup, false);
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
