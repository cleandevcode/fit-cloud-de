package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class EditTextAlertDialogBinding implements a {
    public final EditText edit;
    private final FrameLayout rootView;

    private EditTextAlertDialogBinding(FrameLayout frameLayout, EditText editText) {
        this.rootView = frameLayout;
        this.edit = editText;
    }

    public static EditTextAlertDialogBinding bind(View view) {
        EditText editText = (EditText) c.m(view, R.id.edit);
        if (editText != null) {
            return new EditTextAlertDialogBinding((FrameLayout) view, editText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.edit)));
    }

    public static EditTextAlertDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EditTextAlertDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.edit_text_alert_dialog, viewGroup, false);
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
