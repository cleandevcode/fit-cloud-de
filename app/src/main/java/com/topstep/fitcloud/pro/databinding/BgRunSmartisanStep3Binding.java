package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class BgRunSmartisanStep3Binding implements a {
    private final LinearLayout rootView;

    private BgRunSmartisanStep3Binding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static BgRunSmartisanStep3Binding bind(View view) {
        if (view != null) {
            return new BgRunSmartisanStep3Binding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static BgRunSmartisanStep3Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BgRunSmartisanStep3Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.bg_run_smartisan_step3, viewGroup, false);
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
