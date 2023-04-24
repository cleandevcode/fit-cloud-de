package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class BgRunVivoStep4Binding implements a {
    public final ImageView img01;
    public final ImageView img02;
    private final LinearLayout rootView;

    private BgRunVivoStep4Binding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2) {
        this.rootView = linearLayout;
        this.img01 = imageView;
        this.img02 = imageView2;
    }

    public static BgRunVivoStep4Binding bind(View view) {
        int i10 = R.id.img01;
        ImageView imageView = (ImageView) c.m(view, R.id.img01);
        if (imageView != null) {
            i10 = R.id.img02;
            ImageView imageView2 = (ImageView) c.m(view, R.id.img02);
            if (imageView2 != null) {
                return new BgRunVivoStep4Binding((LinearLayout) view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static BgRunVivoStep4Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BgRunVivoStep4Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.bg_run_vivo_step4, viewGroup, false);
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
