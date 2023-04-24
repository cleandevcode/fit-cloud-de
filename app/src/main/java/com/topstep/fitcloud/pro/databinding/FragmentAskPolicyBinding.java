package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentAskPolicyBinding implements a {
    public final Button btnAgree;
    public final Button btnCancel;
    public final ImageView imgLogo;
    public final ConstraintLayout layoutBottom;
    private final RelativeLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvAppName;
    public final TextView tvDes1;
    public final TextView tvDes2;
    public final TextView tvWelcome;

    private FragmentAskPolicyBinding(RelativeLayout relativeLayout, Button button, Button button2, ImageView imageView, ConstraintLayout constraintLayout, MaterialToolbar materialToolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = relativeLayout;
        this.btnAgree = button;
        this.btnCancel = button2;
        this.imgLogo = imageView;
        this.layoutBottom = constraintLayout;
        this.toolbar = materialToolbar;
        this.tvAppName = textView;
        this.tvDes1 = textView2;
        this.tvDes2 = textView3;
        this.tvWelcome = textView4;
    }

    public static FragmentAskPolicyBinding bind(View view) {
        int i10 = R.id.btn_agree;
        Button button = (Button) c.m(view, R.id.btn_agree);
        if (button != null) {
            i10 = R.id.btn_cancel;
            Button button2 = (Button) c.m(view, R.id.btn_cancel);
            if (button2 != null) {
                i10 = R.id.img_logo;
                ImageView imageView = (ImageView) c.m(view, R.id.img_logo);
                if (imageView != null) {
                    i10 = R.id.layout_bottom;
                    ConstraintLayout constraintLayout = (ConstraintLayout) c.m(view, R.id.layout_bottom);
                    if (constraintLayout != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                        if (materialToolbar != null) {
                            i10 = R.id.tv_app_name;
                            TextView textView = (TextView) c.m(view, R.id.tv_app_name);
                            if (textView != null) {
                                i10 = R.id.tv_des1;
                                TextView textView2 = (TextView) c.m(view, R.id.tv_des1);
                                if (textView2 != null) {
                                    i10 = R.id.tv_des2;
                                    TextView textView3 = (TextView) c.m(view, R.id.tv_des2);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_welcome;
                                        TextView textView4 = (TextView) c.m(view, R.id.tv_welcome);
                                        if (textView4 != null) {
                                            return new FragmentAskPolicyBinding((RelativeLayout) view, button, button2, imageView, constraintLayout, materialToolbar, textView, textView2, textView3, textView4);
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

    public static FragmentAskPolicyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAskPolicyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_ask_policy, viewGroup, false);
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
