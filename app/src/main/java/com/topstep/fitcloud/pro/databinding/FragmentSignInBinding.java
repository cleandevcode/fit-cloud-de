package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentSignInBinding implements a {
    public final Button btnResetPwd;
    public final Button btnSignIn;
    public final Button btnSignUp;
    public final Button btnSkip;
    public final TextInputEditText editPwd;
    public final TextInputEditText editUsername;
    public final ImageView imgFacebook;
    public final ImageView imgQq;
    public final ImageView imgSina;
    public final ImageView imgWechat;
    public final TextInputLayout inputPwd;
    public final TextInputLayout inputUsername;
    public final LinearLayout layoutQuickEn;
    public final LinearLayout layoutQuickSignIn;
    public final LinearLayout layoutQuickZh;
    private final RelativeLayout rootView;
    public final MaterialToolbar toolbar;

    private FragmentSignInBinding(RelativeLayout relativeLayout, Button button, Button button2, Button button3, Button button4, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, MaterialToolbar materialToolbar) {
        this.rootView = relativeLayout;
        this.btnResetPwd = button;
        this.btnSignIn = button2;
        this.btnSignUp = button3;
        this.btnSkip = button4;
        this.editPwd = textInputEditText;
        this.editUsername = textInputEditText2;
        this.imgFacebook = imageView;
        this.imgQq = imageView2;
        this.imgSina = imageView3;
        this.imgWechat = imageView4;
        this.inputPwd = textInputLayout;
        this.inputUsername = textInputLayout2;
        this.layoutQuickEn = linearLayout;
        this.layoutQuickSignIn = linearLayout2;
        this.layoutQuickZh = linearLayout3;
        this.toolbar = materialToolbar;
    }

    public static FragmentSignInBinding bind(View view) {
        int i10 = R.id.btn_reset_pwd;
        Button button = (Button) c.m(view, R.id.btn_reset_pwd);
        if (button != null) {
            i10 = R.id.btn_sign_in;
            Button button2 = (Button) c.m(view, R.id.btn_sign_in);
            if (button2 != null) {
                i10 = R.id.btn_sign_up;
                Button button3 = (Button) c.m(view, R.id.btn_sign_up);
                if (button3 != null) {
                    i10 = R.id.btn_skip;
                    Button button4 = (Button) c.m(view, R.id.btn_skip);
                    if (button4 != null) {
                        i10 = R.id.edit_pwd;
                        TextInputEditText textInputEditText = (TextInputEditText) c.m(view, R.id.edit_pwd);
                        if (textInputEditText != null) {
                            i10 = R.id.edit_username;
                            TextInputEditText textInputEditText2 = (TextInputEditText) c.m(view, R.id.edit_username);
                            if (textInputEditText2 != null) {
                                i10 = R.id.img_facebook;
                                ImageView imageView = (ImageView) c.m(view, R.id.img_facebook);
                                if (imageView != null) {
                                    i10 = R.id.img_qq;
                                    ImageView imageView2 = (ImageView) c.m(view, R.id.img_qq);
                                    if (imageView2 != null) {
                                        i10 = R.id.img_sina;
                                        ImageView imageView3 = (ImageView) c.m(view, R.id.img_sina);
                                        if (imageView3 != null) {
                                            i10 = R.id.img_wechat;
                                            ImageView imageView4 = (ImageView) c.m(view, R.id.img_wechat);
                                            if (imageView4 != null) {
                                                i10 = R.id.input_pwd;
                                                TextInputLayout textInputLayout = (TextInputLayout) c.m(view, R.id.input_pwd);
                                                if (textInputLayout != null) {
                                                    i10 = R.id.input_username;
                                                    TextInputLayout textInputLayout2 = (TextInputLayout) c.m(view, R.id.input_username);
                                                    if (textInputLayout2 != null) {
                                                        i10 = R.id.layout_quick_en;
                                                        LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_quick_en);
                                                        if (linearLayout != null) {
                                                            i10 = R.id.layout_quick_sign_in;
                                                            LinearLayout linearLayout2 = (LinearLayout) c.m(view, R.id.layout_quick_sign_in);
                                                            if (linearLayout2 != null) {
                                                                i10 = R.id.layout_quick_zh;
                                                                LinearLayout linearLayout3 = (LinearLayout) c.m(view, R.id.layout_quick_zh);
                                                                if (linearLayout3 != null) {
                                                                    i10 = R.id.toolbar;
                                                                    MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                                                    if (materialToolbar != null) {
                                                                        return new FragmentSignInBinding((RelativeLayout) view, button, button2, button3, button4, textInputEditText, textInputEditText2, imageView, imageView2, imageView3, imageView4, textInputLayout, textInputLayout2, linearLayout, linearLayout2, linearLayout3, materialToolbar);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSignInBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSignInBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sign_in, viewGroup, false);
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
