package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentFeedbackBinding implements a {
    public final Button btnCommit;
    public final EditText editContact;
    public final EditText editContent;
    public final ImageView img00;
    public final ImageView img01;
    public final ImageView img02;
    public final ImageView img03;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvContentLimitTips;
    public final TextView tvImgLimitTips;

    private FragmentFeedbackBinding(LinearLayout linearLayout, Button button, EditText editText, EditText editText2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, MaterialToolbar materialToolbar, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.btnCommit = button;
        this.editContact = editText;
        this.editContent = editText2;
        this.img00 = imageView;
        this.img01 = imageView2;
        this.img02 = imageView3;
        this.img03 = imageView4;
        this.toolbar = materialToolbar;
        this.tvContentLimitTips = textView;
        this.tvImgLimitTips = textView2;
    }

    public static FragmentFeedbackBinding bind(View view) {
        int i10 = R.id.btn_commit;
        Button button = (Button) c.m(view, R.id.btn_commit);
        if (button != null) {
            i10 = R.id.edit_contact;
            EditText editText = (EditText) c.m(view, R.id.edit_contact);
            if (editText != null) {
                i10 = R.id.edit_content;
                EditText editText2 = (EditText) c.m(view, R.id.edit_content);
                if (editText2 != null) {
                    i10 = R.id.img00;
                    ImageView imageView = (ImageView) c.m(view, R.id.img00);
                    if (imageView != null) {
                        i10 = R.id.img01;
                        ImageView imageView2 = (ImageView) c.m(view, R.id.img01);
                        if (imageView2 != null) {
                            i10 = R.id.img02;
                            ImageView imageView3 = (ImageView) c.m(view, R.id.img02);
                            if (imageView3 != null) {
                                i10 = R.id.img03;
                                ImageView imageView4 = (ImageView) c.m(view, R.id.img03);
                                if (imageView4 != null) {
                                    i10 = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                    if (materialToolbar != null) {
                                        i10 = R.id.tv_content_limit_tips;
                                        TextView textView = (TextView) c.m(view, R.id.tv_content_limit_tips);
                                        if (textView != null) {
                                            i10 = R.id.tv_img_limit_tips;
                                            TextView textView2 = (TextView) c.m(view, R.id.tv_img_limit_tips);
                                            if (textView2 != null) {
                                                return new FragmentFeedbackBinding((LinearLayout) view, button, editText, editText2, imageView, imageView2, imageView3, imageView4, materialToolbar, textView, textView2);
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

    public static FragmentFeedbackBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFeedbackBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_feedback, viewGroup, false);
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
