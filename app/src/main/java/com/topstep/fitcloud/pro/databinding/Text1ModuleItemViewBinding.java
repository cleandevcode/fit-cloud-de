package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class Text1ModuleItemViewBinding implements a {
    public final ImageView imgIcon;
    public final ImageView imgMark;
    public final LinearLayout layoutContent;
    private final View rootView;
    public final TextView tvText1;
    public final TextView tvTitle;

    private Text1ModuleItemViewBinding(View view, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = view;
        this.imgIcon = imageView;
        this.imgMark = imageView2;
        this.layoutContent = linearLayout;
        this.tvText1 = textView;
        this.tvTitle = textView2;
    }

    public static Text1ModuleItemViewBinding bind(View view) {
        int i10 = R.id.img_icon;
        ImageView imageView = (ImageView) c.m(view, R.id.img_icon);
        if (imageView != null) {
            i10 = R.id.img_mark;
            ImageView imageView2 = (ImageView) c.m(view, R.id.img_mark);
            if (imageView2 != null) {
                i10 = R.id.layout_content;
                LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_content);
                if (linearLayout != null) {
                    i10 = R.id.tv_text1;
                    TextView textView = (TextView) c.m(view, R.id.tv_text1);
                    if (textView != null) {
                        i10 = R.id.tv_title;
                        TextView textView2 = (TextView) c.m(view, R.id.tv_title);
                        if (textView2 != null) {
                            return new Text1ModuleItemViewBinding(view, imageView, imageView2, linearLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static Text1ModuleItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.text1_module_item_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // a3.a
    public View getRoot() {
        return this.rootView;
    }
}
