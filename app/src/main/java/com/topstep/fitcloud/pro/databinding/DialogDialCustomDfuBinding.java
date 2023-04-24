package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.topstep.fitcloud.pro.ui.widget.PushStateView;
import com.topstep.fitcloud.sdk.v2.utils.dial.DialView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class DialogDialCustomDfuBinding implements a {
    public final DialView dialView;
    public final LinearLayout layoutSelect;
    public final RecyclerView recyclerView;
    private final NestedScrollView rootView;
    public final PushStateView stateView;
    public final TextView tvName;

    private DialogDialCustomDfuBinding(NestedScrollView nestedScrollView, DialView dialView, LinearLayout linearLayout, RecyclerView recyclerView, PushStateView pushStateView, TextView textView) {
        this.rootView = nestedScrollView;
        this.dialView = dialView;
        this.layoutSelect = linearLayout;
        this.recyclerView = recyclerView;
        this.stateView = pushStateView;
        this.tvName = textView;
    }

    public static DialogDialCustomDfuBinding bind(View view) {
        int i10 = R.id.dial_view;
        DialView dialView = (DialView) c.m(view, R.id.dial_view);
        if (dialView != null) {
            i10 = R.id.layout_select;
            LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_select);
            if (linearLayout != null) {
                i10 = R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
                if (recyclerView != null) {
                    i10 = R.id.state_view;
                    PushStateView pushStateView = (PushStateView) c.m(view, R.id.state_view);
                    if (pushStateView != null) {
                        i10 = R.id.tv_name;
                        TextView textView = (TextView) c.m(view, R.id.tv_name);
                        if (textView != null) {
                            return new DialogDialCustomDfuBinding((NestedScrollView) view, dialView, linearLayout, recyclerView, pushStateView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogDialCustomDfuBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogDialCustomDfuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_dial_custom_dfu, viewGroup, false);
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
