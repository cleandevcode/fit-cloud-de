package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentContainerView;
import b0.c;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ActivityMainBinding implements a {
    public final BottomNavigationView bottomNavView;
    public final RelativeLayout layoutContent;
    public final FragmentContainerView navHost;
    private final RelativeLayout rootView;
    public final FrameLayout viewNavigationBarScrim;

    private ActivityMainBinding(RelativeLayout relativeLayout, BottomNavigationView bottomNavigationView, RelativeLayout relativeLayout2, FragmentContainerView fragmentContainerView, FrameLayout frameLayout) {
        this.rootView = relativeLayout;
        this.bottomNavView = bottomNavigationView;
        this.layoutContent = relativeLayout2;
        this.navHost = fragmentContainerView;
        this.viewNavigationBarScrim = frameLayout;
    }

    public static ActivityMainBinding bind(View view) {
        int i10 = R.id.bottom_nav_view;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) c.m(view, R.id.bottom_nav_view);
        if (bottomNavigationView != null) {
            i10 = R.id.layout_content;
            RelativeLayout relativeLayout = (RelativeLayout) c.m(view, R.id.layout_content);
            if (relativeLayout != null) {
                i10 = R.id.nav_host;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) c.m(view, R.id.nav_host);
                if (fragmentContainerView != null) {
                    i10 = R.id.view_navigation_bar_scrim;
                    FrameLayout frameLayout = (FrameLayout) c.m(view, R.id.view_navigation_bar_scrim);
                    if (frameLayout != null) {
                        return new ActivityMainBinding((RelativeLayout) view, bottomNavigationView, relativeLayout, fragmentContainerView, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
