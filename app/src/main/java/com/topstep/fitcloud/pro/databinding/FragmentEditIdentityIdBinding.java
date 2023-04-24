package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentEditIdentityIdBinding implements a {
    public final Button btnSave;
    public final EditText editIdentityId;
    public final TextInputLayout inputIdentityId;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentEditIdentityIdBinding(LinearLayout linearLayout, Button button, EditText editText, TextInputLayout textInputLayout, MaterialToolbar materialToolbar) {
        this.rootView = linearLayout;
        this.btnSave = button;
        this.editIdentityId = editText;
        this.inputIdentityId = textInputLayout;
        this.toolbar = materialToolbar;
    }

    public static FragmentEditIdentityIdBinding bind(View view) {
        int i10 = R.id.btn_save;
        Button button = (Button) c.m(view, R.id.btn_save);
        if (button != null) {
            i10 = R.id.edit_identity_id;
            EditText editText = (EditText) c.m(view, R.id.edit_identity_id);
            if (editText != null) {
                i10 = R.id.input_identity_id;
                TextInputLayout textInputLayout = (TextInputLayout) c.m(view, R.id.input_identity_id);
                if (textInputLayout != null) {
                    i10 = R.id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                    if (materialToolbar != null) {
                        return new FragmentEditIdentityIdBinding((LinearLayout) view, button, editText, textInputLayout, materialToolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentEditIdentityIdBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEditIdentityIdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_identity_id, viewGroup, false);
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
