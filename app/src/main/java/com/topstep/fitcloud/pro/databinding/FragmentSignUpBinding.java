package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentSignUpBinding implements a {
    public final Button btnAuthCode;
    public final Button btnSignUp;
    public final Button btnToggle;
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

    private FragmentSignUpBinding(RelativeLayout relativeLayout, Button button, Button button2, Button button3, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, ImageView imageView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, FrameLayout frameLayout, MaterialToolbar materialToolbar) {
        this.rootView = relativeLayout;
        this.btnAuthCode = button;
        this.btnSignUp = button2;
        this.btnToggle = button3;
        this.editAuthCode = textInputEditText;
        this.editPwd = textInputEditText2;
        this.editUsername = textInputEditText3;
        this.imgAuthCodeHelp = imageView;
        this.inputAuthCode = textInputLayout;
        this.inputPwd = textInputLayout2;
        this.inputUsername = textInputLayout3;
        this.layoutAuthCode = frameLayout;
        this.toolbar = materialToolbar;
    }

    public static FragmentSignUpBinding bind(View view) {
        int i10 = R.id.btn_auth_code;
        Button button = (Button) c.m(view, R.id.btn_auth_code);
        if (button != null) {
            i10 = R.id.btn_sign_up;
            Button button2 = (Button) c.m(view, R.id.btn_sign_up);
            if (button2 != null) {
                i10 = R.id.btn_toggle;
                Button button3 = (Button) c.m(view, R.id.btn_toggle);
                if (button3 != null) {
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
                                                        return new FragmentSignUpBinding((RelativeLayout) view, button, button2, button3, textInputEditText, textInputEditText2, textInputEditText3, imageView, textInputLayout, textInputLayout2, textInputLayout3, frameLayout, materialToolbar);
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

    public static FragmentSignUpBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSignUpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sign_up, viewGroup, false);
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
