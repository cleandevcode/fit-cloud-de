package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ActivitySportDetailBinding implements a {
    public final ImageView imgAvatar;
    public final LinearLayout layoutContent;
    public final RelativeLayout layoutUser;
    public final LoadingView loadingView;
    private final LinearLayout rootView;
    public final TabLayout tabLayout;
    public final MaterialToolbar toolbar;
    public final TextView tvNickName;
    public final ViewPager2 viewPager;

    private ActivitySportDetailBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, RelativeLayout relativeLayout, LoadingView loadingView, TabLayout tabLayout, MaterialToolbar materialToolbar, TextView textView, ViewPager2 viewPager2) {
        this.rootView = linearLayout;
        this.imgAvatar = imageView;
        this.layoutContent = linearLayout2;
        this.layoutUser = relativeLayout;
        this.loadingView = loadingView;
        this.tabLayout = tabLayout;
        this.toolbar = materialToolbar;
        this.tvNickName = textView;
        this.viewPager = viewPager2;
    }

    public static ActivitySportDetailBinding bind(View view) {
        int i10 = R.id.img_avatar;
        ImageView imageView = (ImageView) c.m(view, R.id.img_avatar);
        if (imageView != null) {
            i10 = R.id.layout_content;
            LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_content);
            if (linearLayout != null) {
                i10 = R.id.layout_user;
                RelativeLayout relativeLayout = (RelativeLayout) c.m(view, R.id.layout_user);
                if (relativeLayout != null) {
                    i10 = R.id.loading_view;
                    LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
                    if (loadingView != null) {
                        i10 = R.id.tab_layout;
                        TabLayout tabLayout = (TabLayout) c.m(view, R.id.tab_layout);
                        if (tabLayout != null) {
                            i10 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                            if (materialToolbar != null) {
                                i10 = R.id.tv_nick_name;
                                TextView textView = (TextView) c.m(view, R.id.tv_nick_name);
                                if (textView != null) {
                                    i10 = R.id.view_pager;
                                    ViewPager2 viewPager2 = (ViewPager2) c.m(view, R.id.view_pager);
                                    if (viewPager2 != null) {
                                        return new ActivitySportDetailBinding((LinearLayout) view, imageView, linearLayout, relativeLayout, loadingView, tabLayout, materialToolbar, textView, viewPager2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivitySportDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySportDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_sport_detail, viewGroup, false);
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
