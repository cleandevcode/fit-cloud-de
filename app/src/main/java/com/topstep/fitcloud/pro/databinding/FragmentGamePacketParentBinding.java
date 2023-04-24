package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentGamePacketParentBinding implements a {
    private final LinearLayout rootView;
    public final TabLayout tabLayout;
    public final MaterialToolbar toolbar;
    public final ViewPager2 viewPager;

    private FragmentGamePacketParentBinding(LinearLayout linearLayout, TabLayout tabLayout, MaterialToolbar materialToolbar, ViewPager2 viewPager2) {
        this.rootView = linearLayout;
        this.tabLayout = tabLayout;
        this.toolbar = materialToolbar;
        this.viewPager = viewPager2;
    }

    public static FragmentGamePacketParentBinding bind(View view) {
        int i10 = R.id.tab_layout;
        TabLayout tabLayout = (TabLayout) c.m(view, R.id.tab_layout);
        if (tabLayout != null) {
            i10 = R.id.toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
            if (materialToolbar != null) {
                i10 = R.id.view_pager;
                ViewPager2 viewPager2 = (ViewPager2) c.m(view, R.id.view_pager);
                if (viewPager2 != null) {
                    return new FragmentGamePacketParentBinding((LinearLayout) view, tabLayout, materialToolbar, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentGamePacketParentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentGamePacketParentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_game_packet_parent, viewGroup, false);
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
