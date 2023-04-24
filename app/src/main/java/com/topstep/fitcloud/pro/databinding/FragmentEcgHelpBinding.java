package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.ui.widget.DotViewPagerIndicator;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentEcgHelpBinding implements a {
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final ViewPager viewPager;
    public final DotViewPagerIndicator viewPagerIndicator;

    private FragmentEcgHelpBinding(LinearLayout linearLayout, MaterialToolbar materialToolbar, ViewPager viewPager, DotViewPagerIndicator dotViewPagerIndicator) {
        this.rootView = linearLayout;
        this.toolbar = materialToolbar;
        this.viewPager = viewPager;
        this.viewPagerIndicator = dotViewPagerIndicator;
    }

    public static FragmentEcgHelpBinding bind(View view) {
        int i10 = R.id.toolbar;
        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
        if (materialToolbar != null) {
            i10 = R.id.view_pager;
            ViewPager viewPager = (ViewPager) c.m(view, R.id.view_pager);
            if (viewPager != null) {
                i10 = R.id.view_pager_indicator;
                DotViewPagerIndicator dotViewPagerIndicator = (DotViewPagerIndicator) c.m(view, R.id.view_pager_indicator);
                if (dotViewPagerIndicator != null) {
                    return new FragmentEcgHelpBinding((LinearLayout) view, materialToolbar, viewPager, dotViewPagerIndicator);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentEcgHelpBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEcgHelpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_ecg_help, viewGroup, false);
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
