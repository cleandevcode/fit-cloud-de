package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloud.pro.ui.widget.SwipeItemLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemContactsListBinding implements a {
    public final ImageView imgSort;
    private final SwipeItemLayout rootView;
    public final TextView tvDelete;
    public final TextView tvName;
    public final TextView tvNumber;

    private ItemContactsListBinding(SwipeItemLayout swipeItemLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = swipeItemLayout;
        this.imgSort = imageView;
        this.tvDelete = textView;
        this.tvName = textView2;
        this.tvNumber = textView3;
    }

    public static ItemContactsListBinding bind(View view) {
        int i10 = R.id.img_sort;
        ImageView imageView = (ImageView) c.m(view, R.id.img_sort);
        if (imageView != null) {
            i10 = R.id.tv_delete;
            TextView textView = (TextView) c.m(view, R.id.tv_delete);
            if (textView != null) {
                i10 = R.id.tv_name;
                TextView textView2 = (TextView) c.m(view, R.id.tv_name);
                if (textView2 != null) {
                    i10 = R.id.tv_number;
                    TextView textView3 = (TextView) c.m(view, R.id.tv_number);
                    if (textView3 != null) {
                        return new ItemContactsListBinding((SwipeItemLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemContactsListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemContactsListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_contacts_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public SwipeItemLayout getRoot() {
        return this.rootView;
    }
}
