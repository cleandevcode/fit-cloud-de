package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class LayoutDeviceBindBinding implements a {
    private final FrameLayout rootView;

    private LayoutDeviceBindBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    public static LayoutDeviceBindBinding bind(View view) {
        if (view != null) {
            return new LayoutDeviceBindBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static LayoutDeviceBindBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutDeviceBindBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.layout_device_bind, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
