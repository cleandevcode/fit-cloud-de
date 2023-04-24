package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import b0.c;
import com.topstep.fitcloud.pro.ui.widget.PushStateView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class DialogSportDfuBinding implements a {
    public final ImageView imgView;
    private final NestedScrollView rootView;
    public final PushStateView stateView;
    public final TextView tvName;

    private DialogSportDfuBinding(NestedScrollView nestedScrollView, ImageView imageView, PushStateView pushStateView, TextView textView) {
        this.rootView = nestedScrollView;
        this.imgView = imageView;
        this.stateView = pushStateView;
        this.tvName = textView;
    }

    public static DialogSportDfuBinding bind(View view) {
        int i10 = R.id.img_view;
        ImageView imageView = (ImageView) c.m(view, R.id.img_view);
        if (imageView != null) {
            i10 = R.id.state_view;
            PushStateView pushStateView = (PushStateView) c.m(view, R.id.state_view);
            if (pushStateView != null) {
                i10 = R.id.tv_name;
                TextView textView = (TextView) c.m(view, R.id.tv_name);
                if (textView != null) {
                    return new DialogSportDfuBinding((NestedScrollView) view, imageView, pushStateView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogSportDfuBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogSportDfuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_sport_dfu, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
