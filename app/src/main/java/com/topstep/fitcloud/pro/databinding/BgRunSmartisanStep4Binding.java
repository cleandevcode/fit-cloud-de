package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class BgRunSmartisanStep4Binding implements a {
    private final LinearLayout rootView;

    private BgRunSmartisanStep4Binding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static BgRunSmartisanStep4Binding bind(View view) {
        if (view != null) {
            return new BgRunSmartisanStep4Binding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static BgRunSmartisanStep4Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BgRunSmartisanStep4Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.bg_run_smartisan_step4, viewGroup, false);
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
