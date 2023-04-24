package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentResetPwdBinding implements a {
    public final Button btnAuthCode;
    public final Button btnCommit;
    public final TextInputEditText editAuthCode;
    public final TextInputEditText editPwd;
    public final TextInputEditText editUsername;
    public final ImageView imgAuthCodeHelp;
    public final TextInputLayout inputAuthCode;
    public final TextInputLayout inputPwd;
    public final TextInputLayout inputUsername;
    public final FrameLayout layoutAuthCode;
    private final RelativeLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvAuthCodeTips;

    private FragmentResetPwdBinding(RelativeLayout relativeLayout, Button button, Button button2, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, ImageView imageView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, FrameLayout frameLayout, MaterialToolbar materialToolbar, TextView textView) {
        this.rootView = relativeLayout;
        this.btnAuthCode = button;
        this.btnCommit = button2;
        this.editAuthCode = textInputEditText;
        this.editPwd = textInputEditText2;
        this.editUsername = textInputEditText3;
        this.imgAuthCodeHelp = imageView;
        this.inputAuthCode = textInputLayout;
        this.inputPwd = textInputLayout2;
        this.inputUsername = textInputLayout3;
        this.layoutAuthCode = frameLayout;
        this.toolbar = materialToolbar;
        this.tvAuthCodeTips = textView;
    }

    public static FragmentResetPwdBinding bind(View view) {
        int i10 = R.id.btn_auth_code;
        Button button = (Button) c.m(view, R.id.btn_auth_code);
        if (button != null) {
            i10 = R.id.btn_commit;
            Button button2 = (Button) c.m(view, R.id.btn_commit);
            if (button2 != null) {
                i10 = R.id.edit_auth_code;
                TextInputEditText textInputEditText = (TextInputEditText) c.m(view, R.id.edit_auth_code);
                if (textInputEditText != null) {
                    i10 = R.id.edit_pwd;
                    TextInputEditText textInputEditText2 = (TextInputEditText) c.m(view, R.id.edit_pwd);
                    if (textInputEditText2 != null) {
                        i10 = R.id.edit_username;
                        TextInputEditText textInputEditText3 = (TextInputEditText) c.m(view, R.id.edit_username);
                        if (textInputEditText3 != null) {
                            i10 = R.id.img_auth_code_help;
                            ImageView imageView = (ImageView) c.m(view, R.id.img_auth_code_help);
                            if (imageView != null) {
                                i10 = R.id.input_auth_code;
                                TextInputLayout textInputLayout = (TextInputLayout) c.m(view, R.id.input_auth_code);
                                if (textInputLayout != null) {
                                    i10 = R.id.input_pwd;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) c.m(view, R.id.input_pwd);
                                    if (textInputLayout2 != null) {
                                        i10 = R.id.input_username;
                                        TextInputLayout textInputLayout3 = (TextInputLayout) c.m(view, R.id.input_username);
                                        if (textInputLayout3 != null) {
                                            i10 = R.id.layout_auth_code;
                                            FrameLayout frameLayout = (FrameLayout) c.m(view, R.id.layout_auth_code);
                                            if (frameLayout != null) {
                                                i10 = R.id.toolbar;
                                                MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                                if (materialToolbar != null) {
                                                    i10 = R.id.tv_auth_code_tips;
                                                    TextView textView = (TextView) c.m(view, R.id.tv_auth_code_tips);
                                                    if (textView != null) {
                                                        return new FragmentResetPwdBinding((RelativeLayout) view, button, button2, textInputEditText, textInputEditText2, textInputEditText3, imageView, textInputLayout, textInputLayout2, textInputLayout3, frameLayout, materialToolbar, textView);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentResetPwdBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentResetPwdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_reset_pwd, viewGroup, false);
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
