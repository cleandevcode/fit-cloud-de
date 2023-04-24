package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.topstep.fitcloud.pro.ui.widget.PushStateView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class DialogDialPacketDfuBinding implements a {
    public final ImageView imgView;
    public final LinearLayout layoutSelect;
    public final RecyclerView recyclerView;
    private final NestedScrollView rootView;
    public final PushStateView stateView;
    public final TextView tvName;

    private DialogDialPacketDfuBinding(NestedScrollView nestedScrollView, ImageView imageView, LinearLayout linearLayout, RecyclerView recyclerView, PushStateView pushStateView, TextView textView) {
        this.rootView = nestedScrollView;
        this.imgView = imageView;
        this.layoutSelect = linearLayout;
        this.recyclerView = recyclerView;
        this.stateView = pushStateView;
        this.tvName = textView;
    }

    public static DialogDialPacketDfuBinding bind(View view) {
        int i10 = R.id.img_view;
        ImageView imageView = (ImageView) c.m(view, R.id.img_view);
        if (imageView != null) {
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
                            return new DialogDialPacketDfuBinding((NestedScrollView) view, imageView, linearLayout, recyclerView, pushStateView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogDialPacketDfuBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogDialPacketDfuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_dial_packet_dfu, viewGroup, false);
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
