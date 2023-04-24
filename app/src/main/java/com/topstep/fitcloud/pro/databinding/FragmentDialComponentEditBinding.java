package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentDialComponentEditBinding implements a {
    public final Button btnSave;
    public final DialComponentView componentView;
    public final LinearLayout layoutContent;
    private final RelativeLayout rootView;
    public final ScrollView scrollView;
    public final MaterialToolbar toolbar;

    private FragmentDialComponentEditBinding(RelativeLayout relativeLayout, Button button, DialComponentView dialComponentView, LinearLayout linearLayout, ScrollView scrollView, MaterialToolbar materialToolbar) {
        this.rootView = relativeLayout;
        this.btnSave = button;
        this.componentView = dialComponentView;
        this.layoutContent = linearLayout;
        this.scrollView = scrollView;
        this.toolbar = materialToolbar;
    }

    public static FragmentDialComponentEditBinding bind(View view) {
        int i10 = R.id.btn_save;
        Button button = (Button) c.m(view, R.id.btn_save);
        if (button != null) {
            i10 = R.id.component_view;
            DialComponentView dialComponentView = (DialComponentView) c.m(view, R.id.component_view);
            if (dialComponentView != null) {
                i10 = R.id.layout_content;
                LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_content);
                if (linearLayout != null) {
                    i10 = R.id.scroll_view;
                    ScrollView scrollView = (ScrollView) c.m(view, R.id.scroll_view);
                    if (scrollView != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                        if (materialToolbar != null) {
                            return new FragmentDialComponentEditBinding((RelativeLayout) view, button, dialComponentView, linearLayout, scrollView, materialToolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentDialComponentEditBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDialComponentEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dial_component_edit, viewGroup, false);
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
