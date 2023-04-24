package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentSongPushBinding implements a {
    public final AppBarLayout appbar;
    public final Button btnCancel;
    public final FloatingActionButton fabAdd;
    public final LinearLayout layoutEmpty;
    public final LinearLayout layoutInfo;
    public final LinearLayout layoutTransfer;
    public final LoadingView loadingView;
    public final RecyclerView recyclerView;
    private final CoordinatorLayout rootView;
    public final MaterialToolbar toolbar;
    public final ProgressBar transferProgress;
    public final TextView tvEmptyRemaining;
    public final TextView tvHasCount;
    public final TextView tvStorageRemaining;
    public final TextView tvTransferIndex;
    public final TextView tvTransferName;
    public final TextView tvTransferTitle;

    private FragmentSongPushBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Button button, FloatingActionButton floatingActionButton, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LoadingView loadingView, RecyclerView recyclerView, MaterialToolbar materialToolbar, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = coordinatorLayout;
        this.appbar = appBarLayout;
        this.btnCancel = button;
        this.fabAdd = floatingActionButton;
        this.layoutEmpty = linearLayout;
        this.layoutInfo = linearLayout2;
        this.layoutTransfer = linearLayout3;
        this.loadingView = loadingView;
        this.recyclerView = recyclerView;
        this.toolbar = materialToolbar;
        this.transferProgress = progressBar;
        this.tvEmptyRemaining = textView;
        this.tvHasCount = textView2;
        this.tvStorageRemaining = textView3;
        this.tvTransferIndex = textView4;
        this.tvTransferName = textView5;
        this.tvTransferTitle = textView6;
    }

    public static FragmentSongPushBinding bind(View view) {
        int i10 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) c.m(view, R.id.appbar);
        if (appBarLayout != null) {
            i10 = R.id.btn_cancel;
            Button button = (Button) c.m(view, R.id.btn_cancel);
            if (button != null) {
                i10 = R.id.fab_add;
                FloatingActionButton floatingActionButton = (FloatingActionButton) c.m(view, R.id.fab_add);
                if (floatingActionButton != null) {
                    i10 = R.id.layout_empty;
                    LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_empty);
                    if (linearLayout != null) {
                        i10 = R.id.layout_info;
                        LinearLayout linearLayout2 = (LinearLayout) c.m(view, R.id.layout_info);
                        if (linearLayout2 != null) {
                            i10 = R.id.layout_transfer;
                            LinearLayout linearLayout3 = (LinearLayout) c.m(view, R.id.layout_transfer);
                            if (linearLayout3 != null) {
                                i10 = R.id.loading_view;
                                LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
                                if (loadingView != null) {
                                    i10 = R.id.recycler_view;
                                    RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
                                    if (recyclerView != null) {
                                        i10 = R.id.toolbar;
                                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                        if (materialToolbar != null) {
                                            i10 = R.id.transfer_progress;
                                            ProgressBar progressBar = (ProgressBar) c.m(view, R.id.transfer_progress);
                                            if (progressBar != null) {
                                                i10 = R.id.tv_empty_remaining;
                                                TextView textView = (TextView) c.m(view, R.id.tv_empty_remaining);
                                                if (textView != null) {
                                                    i10 = R.id.tv_has_count;
                                                    TextView textView2 = (TextView) c.m(view, R.id.tv_has_count);
                                                    if (textView2 != null) {
                                                        i10 = R.id.tv_storage_remaining;
                                                        TextView textView3 = (TextView) c.m(view, R.id.tv_storage_remaining);
                                                        if (textView3 != null) {
                                                            i10 = R.id.tv_transfer_index;
                                                            TextView textView4 = (TextView) c.m(view, R.id.tv_transfer_index);
                                                            if (textView4 != null) {
                                                                i10 = R.id.tv_transfer_name;
                                                                TextView textView5 = (TextView) c.m(view, R.id.tv_transfer_name);
                                                                if (textView5 != null) {
                                                                    i10 = R.id.tv_transfer_title;
                                                                    TextView textView6 = (TextView) c.m(view, R.id.tv_transfer_title);
                                                                    if (textView6 != null) {
                                                                        return new FragmentSongPushBinding((CoordinatorLayout) view, appBarLayout, button, floatingActionButton, linearLayout, linearLayout2, linearLayout3, loadingView, recyclerView, materialToolbar, progressBar, textView, textView2, textView3, textView4, textView5, textView6);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSongPushBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSongPushBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_song_push, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
