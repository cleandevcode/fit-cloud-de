package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemSportUiCategoryBinding implements a {
    private final TextView rootView;
    public final TextView tvName;

    private ItemSportUiCategoryBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.tvName = textView2;
    }

    public static ItemSportUiCategoryBinding bind(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new ItemSportUiCategoryBinding(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static ItemSportUiCategoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSportUiCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_sport_ui_category, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public TextView getRoot() {
        return this.rootView;
    }
}
