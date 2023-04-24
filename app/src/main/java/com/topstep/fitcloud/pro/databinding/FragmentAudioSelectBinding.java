package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.tabs.TabLayout;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentAudioSelectBinding implements a {
    public final Button btnSure;
    public final ImageView imgSelectAll;
    public final RelativeLayout layoutBottom;
    public final LinearLayout layoutSelectAll;
    public final LoadingView loadingView;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final TabLayout tabLayout;
    public final MaterialToolbar toolbar;
    public final TextView tvSelectCount;
    public final MaterialDivider viewDivider;

    private FragmentAudioSelectBinding(LinearLayout linearLayout, Button button, ImageView imageView, RelativeLayout relativeLayout, LinearLayout linearLayout2, LoadingView loadingView, RecyclerView recyclerView, TabLayout tabLayout, MaterialToolbar materialToolbar, TextView textView, MaterialDivider materialDivider) {
        this.rootView = linearLayout;
        this.btnSure = button;
        this.imgSelectAll = imageView;
        this.layoutBottom = relativeLayout;
        this.layoutSelectAll = linearLayout2;
        this.loadingView = loadingView;
        this.recyclerView = recyclerView;
        this.tabLayout = tabLayout;
        this.toolbar = materialToolbar;
        this.tvSelectCount = textView;
        this.viewDivider = materialDivider;
    }

    public static FragmentAudioSelectBinding bind(View view) {
        int i10 = R.id.btn_sure;
        Button button = (Button) c.m(view, R.id.btn_sure);
        if (button != null) {
            i10 = R.id.img_select_all;
            ImageView imageView = (ImageView) c.m(view, R.id.img_select_all);
            if (imageView != null) {
                i10 = R.id.layout_bottom;
                RelativeLayout relativeLayout = (RelativeLayout) c.m(view, R.id.layout_bottom);
                if (relativeLayout != null) {
                    i10 = R.id.layout_select_all;
                    LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_select_all);
                    if (linearLayout != null) {
                        i10 = R.id.loading_view;
                        LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
                        if (loadingView != null) {
                            i10 = R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
                            if (recyclerView != null) {
                                i10 = R.id.tab_layout;
                                TabLayout tabLayout = (TabLayout) c.m(view, R.id.tab_layout);
                                if (tabLayout != null) {
                                    i10 = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                    if (materialToolbar != null) {
                                        i10 = R.id.tv_select_count;
                                        TextView textView = (TextView) c.m(view, R.id.tv_select_count);
                                        if (textView != null) {
                                            i10 = R.id.view_divider;
                                            MaterialDivider materialDivider = (MaterialDivider) c.m(view, R.id.view_divider);
                                            if (materialDivider != null) {
                                                return new FragmentAudioSelectBinding((LinearLayout) view, button, imageView, relativeLayout, linearLayout, loadingView, recyclerView, tabLayout, materialToolbar, textView, materialDivider);
                                            }
                                        }
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

    public static FragmentAudioSelectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAudioSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_audio_select, viewGroup, false);
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
