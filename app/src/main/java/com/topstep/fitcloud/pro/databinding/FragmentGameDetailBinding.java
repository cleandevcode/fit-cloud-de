package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentGameDetailBinding implements a {
    public final Button btnEnableLocationService;
    public final ImageView imgGame;
    public final PreferenceRelativeLayout layoutLocationService;
    public final LoadingView loadingView;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvDescription;
    public final TextView tvDownloadCount;
    public final TextView tvName;

    private FragmentGameDetailBinding(LinearLayout linearLayout, Button button, ImageView imageView, PreferenceRelativeLayout preferenceRelativeLayout, LoadingView loadingView, RecyclerView recyclerView, MaterialToolbar materialToolbar, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.btnEnableLocationService = button;
        this.imgGame = imageView;
        this.layoutLocationService = preferenceRelativeLayout;
        this.loadingView = loadingView;
        this.recyclerView = recyclerView;
        this.toolbar = materialToolbar;
        this.tvDescription = textView;
        this.tvDownloadCount = textView2;
        this.tvName = textView3;
    }

    public static FragmentGameDetailBinding bind(View view) {
        int i10 = R.id.btn_enable_location_service;
        Button button = (Button) c.m(view, R.id.btn_enable_location_service);
        if (button != null) {
            i10 = R.id.img_game;
            ImageView imageView = (ImageView) c.m(view, R.id.img_game);
            if (imageView != null) {
                i10 = R.id.layout_location_service;
                PreferenceRelativeLayout preferenceRelativeLayout = (PreferenceRelativeLayout) c.m(view, R.id.layout_location_service);
                if (preferenceRelativeLayout != null) {
                    i10 = R.id.loading_view;
                    LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
                    if (loadingView != null) {
                        i10 = R.id.recycler_view;
                        RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
                        if (recyclerView != null) {
                            i10 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                            if (materialToolbar != null) {
                                i10 = R.id.tv_description;
                                TextView textView = (TextView) c.m(view, R.id.tv_description);
                                if (textView != null) {
                                    i10 = R.id.tv_download_count;
                                    TextView textView2 = (TextView) c.m(view, R.id.tv_download_count);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_name;
                                        TextView textView3 = (TextView) c.m(view, R.id.tv_name);
                                        if (textView3 != null) {
                                            return new FragmentGameDetailBinding((LinearLayout) view, button, imageView, preferenceRelativeLayout, loadingView, recyclerView, materialToolbar, textView, textView2, textView3);
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

    public static FragmentGameDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentGameDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_game_detail, viewGroup, false);
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
