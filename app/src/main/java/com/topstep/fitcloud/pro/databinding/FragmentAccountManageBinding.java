package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b0.c;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.github.kilnn.tool.widget.preference.PreferenceTextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentAccountManageBinding implements a {
    public final PreferenceTextView itemAccountDelete;
    public final PreferenceItem itemEmail;
    public final PreferenceTextView itemModifyPwd;
    public final PreferenceItem itemPhone;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentAccountManageBinding(LinearLayout linearLayout, PreferenceTextView preferenceTextView, PreferenceItem preferenceItem, PreferenceTextView preferenceTextView2, PreferenceItem preferenceItem2, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.itemAccountDelete = preferenceTextView;
        this.itemEmail = preferenceItem;
        this.itemModifyPwd = preferenceTextView2;
        this.itemPhone = preferenceItem2;
        this.toolbar = materialToolbar;
    }

    public static FragmentAccountManageBinding bind(View view) {
        int i10 = R.id.item_account_delete;
        PreferenceTextView preferenceTextView = (PreferenceTextView) c.m(view, R.id.item_account_delete);
        if (preferenceTextView != null) {
            i10 = R.id.item_email;
            PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_email);
            if (preferenceItem != null) {
                i10 = R.id.item_modify_pwd;
                PreferenceTextView preferenceTextView2 = (PreferenceTextView) c.m(view, R.id.item_modify_pwd);
                if (preferenceTextView2 != null) {
                    i10 = R.id.item_phone;
                    PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_phone);
                    if (preferenceItem2 != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                        if (materialToolbar != null) {
                            return new FragmentAccountManageBinding((LinearLayout) view, preferenceTextView, preferenceItem, preferenceTextView2, preferenceItem2, materialToolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentAccountManageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAccountManageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_account_manage, viewGroup, false);
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
