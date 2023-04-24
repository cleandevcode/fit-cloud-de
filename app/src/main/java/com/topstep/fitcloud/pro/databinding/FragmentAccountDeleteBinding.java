package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentAccountDeleteBinding implements a {
    public final Button btnSignIn;
    public final TextInputEditText editPwd;
    public final ImageView imgFacebook;
    public final ImageView imgQq;
    public final ImageView imgSina;
    public final ImageView imgWechat;
    public final TextInputLayout inputPwd;
    public final LinearLayout layoutQuickLogin;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvOthers;

    private FragmentAccountDeleteBinding(LinearLayout linearLayout, Button button, TextInputEditText textInputEditText, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextInputLayout textInputLayout, LinearLayout linearLayout2, MaterialToolbar materialToolbar, TextView textView) {
        this.rootView = linearLayout;
        this.btnSignIn = button;
        this.editPwd = textInputEditText;
        this.imgFacebook = imageView;
        this.imgQq = imageView2;
        this.imgSina = imageView3;
        this.imgWechat = imageView4;
        this.inputPwd = textInputLayout;
        this.layoutQuickLogin = linearLayout2;
        this.toolbar = materialToolbar;
        this.tvOthers = textView;
    }

    public static FragmentAccountDeleteBinding bind(View view) {
        int i10 = R.id.btn_sign_in;
        Button button = (Button) c.m(view, R.id.btn_sign_in);
        if (button != null) {
            i10 = R.id.edit_pwd;
            TextInputEditText textInputEditText = (TextInputEditText) c.m(view, R.id.edit_pwd);
            if (textInputEditText != null) {
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
                                    i10 = R.id.layout_quick_login;
                                    LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_quick_login);
                                    if (linearLayout != null) {
                                        i10 = R.id.toolbar;
                                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                        if (materialToolbar != null) {
                                            i10 = R.id.tv_others;
                                            TextView textView = (TextView) c.m(view, R.id.tv_others);
                                            if (textView != null) {
                                                return new FragmentAccountDeleteBinding((LinearLayout) view, button, textInputEditText, imageView, imageView2, imageView3, imageView4, textInputLayout, linearLayout, materialToolbar, textView);
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

    public static FragmentAccountDeleteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAccountDeleteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_account_delete, viewGroup, false);
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
