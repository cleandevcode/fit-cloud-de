package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentDeviceInfoBinding implements a {
    public final Button btnCopy;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvInfo;

    private FragmentDeviceInfoBinding(LinearLayout linearLayout, Button button, RecyclerView recyclerView, MaterialToolbar materialToolbar, TextView textView) {
        this.rootView = linearLayout;
        this.btnCopy = button;
        this.recyclerView = recyclerView;
        this.toolbar = materialToolbar;
        this.tvInfo = textView;
    }

    public static FragmentDeviceInfoBinding bind(View view) {
        int i10 = R.id.btn_copy;
        Button button = (Button) c.m(view, R.id.btn_copy);
        if (button != null) {
            i10 = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
            if (recyclerView != null) {
                i10 = R.id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                if (materialToolbar != null) {
                    i10 = R.id.tv_info;
                    TextView textView = (TextView) c.m(view, R.id.tv_info);
                    if (textView != null) {
                        return new FragmentDeviceInfoBinding((LinearLayout) view, button, recyclerView, materialToolbar, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentDeviceInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDeviceInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_info, viewGroup, false);
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
