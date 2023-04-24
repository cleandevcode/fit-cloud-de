package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentModifyPwdBinding implements a {
    public final Button btnCommit;
    public final TextInputEditText editNewPwd;
    public final TextInputEditText editOldPwd;
    public final TextInputLayout inputNewPwd;
    public final TextInputLayout inputOldPwd;
    private final RelativeLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentModifyPwdBinding(RelativeLayout relativeLayout, Button button, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, MaterialToolbar materialToolbar) {
        this.rootView = relativeLayout;
        this.btnCommit = button;
        this.editNewPwd = textInputEditText;
        this.editOldPwd = textInputEditText2;
        this.inputNewPwd = textInputLayout;
        this.inputOldPwd = textInputLayout2;
        this.toolbar = materialToolbar;
    }

    public static FragmentModifyPwdBinding bind(View view) {
        int i10 = R.id.btn_commit;
        Button button = (Button) c.m(view, R.id.btn_commit);
        if (button != null) {
            i10 = R.id.edit_new_pwd;
            TextInputEditText textInputEditText = (TextInputEditText) c.m(view, R.id.edit_new_pwd);
            if (textInputEditText != null) {
                i10 = R.id.edit_old_pwd;
                TextInputEditText textInputEditText2 = (TextInputEditText) c.m(view, R.id.edit_old_pwd);
                if (textInputEditText2 != null) {
                    i10 = R.id.input_new_pwd;
                    TextInputLayout textInputLayout = (TextInputLayout) c.m(view, R.id.input_new_pwd);
                    if (textInputLayout != null) {
                        i10 = R.id.input_old_pwd;
                        TextInputLayout textInputLayout2 = (TextInputLayout) c.m(view, R.id.input_old_pwd);
                        if (textInputLayout2 != null) {
                            i10 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                            if (materialToolbar != null) {
                                return new FragmentModifyPwdBinding((RelativeLayout) view, button, textInputEditText, textInputEditText2, textInputLayout, textInputLayout2, materialToolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentModifyPwdBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentModifyPwdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_modify_pwd, viewGroup, false);
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
