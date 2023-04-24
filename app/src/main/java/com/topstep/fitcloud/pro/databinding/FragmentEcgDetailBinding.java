package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentEcgDetailBinding implements a {
    public final LayoutEcgDetailBinding layoutDetail;
    private final FrameLayout rootView;
    public final CardView tipsContainer;
    public final MaterialToolbar toolbar;

    private FragmentEcgDetailBinding(FrameLayout frameLayout, LayoutEcgDetailBinding layoutEcgDetailBinding, CardView cardView, MaterialToolbar materialToolbar) {
        this.rootView = frameLayout;
        this.layoutDetail = layoutEcgDetailBinding;
        this.tipsContainer = cardView;
        this.toolbar = materialToolbar;
    }

    public static FragmentEcgDetailBinding bind(View view) {
        int i10 = R.id.layout_detail;
        View m10 = c.m(view, R.id.layout_detail);
        if (m10 != null) {
            LayoutEcgDetailBinding bind = LayoutEcgDetailBinding.bind(m10);
            CardView cardView = (CardView) c.m(view, R.id.tips_container);
            if (cardView != null) {
                MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                if (materialToolbar != null) {
                    return new FragmentEcgDetailBinding((FrameLayout) view, bind, cardView, materialToolbar);
                }
                i10 = R.id.toolbar;
            } else {
                i10 = R.id.tips_container;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentEcgDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEcgDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_ecg_detail, viewGroup, false);
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
