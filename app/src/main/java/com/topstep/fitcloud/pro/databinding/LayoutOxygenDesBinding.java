package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class LayoutOxygenDesBinding implements a {
    private final LinearLayout rootView;

    private LayoutOxygenDesBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static LayoutOxygenDesBinding bind(View view) {
        if (view != null) {
            return new LayoutOxygenDesBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static LayoutOxygenDesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutOxygenDesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.layout_oxygen_des, viewGroup, false);
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
