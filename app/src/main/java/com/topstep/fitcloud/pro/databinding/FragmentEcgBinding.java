package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b0.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.ui.widget.EcgGridView;
import com.topstep.fitcloud.pro.ui.widget.EcgView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentEcgBinding implements a {
    public final Button btnStart;
    public final Button btnStop;
    public final EcgGridView ecgGridView;
    public final EcgView ecgView;
    public final TextView emptyView;
    public final ImageView imgHelpInfo;
    public final ProgressBar progressBar;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvAmplitude;
    public final TextView tvSpeed;
    public final TextView tvTime;

    private FragmentEcgBinding(LinearLayout linearLayout, Button button, Button button2, EcgGridView ecgGridView, EcgView ecgView, TextView textView, ImageView imageView, ProgressBar progressBar, RecyclerView recyclerView, MaterialToolbar materialToolbar, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.btnStart = button;
        this.btnStop = button2;
        this.ecgGridView = ecgGridView;
        this.ecgView = ecgView;
        this.emptyView = textView;
        this.imgHelpInfo = imageView;
        this.progressBar = progressBar;
        this.recyclerView = recyclerView;
        this.toolbar = materialToolbar;
        this.tvAmplitude = textView2;
        this.tvSpeed = textView3;
        this.tvTime = textView4;
    }

    public static FragmentEcgBinding bind(View view) {
        int i10 = R.id.btn_start;
        Button button = (Button) c.m(view, R.id.btn_start);
        if (button != null) {
            i10 = R.id.btn_stop;
            Button button2 = (Button) c.m(view, R.id.btn_stop);
            if (button2 != null) {
                i10 = R.id.ecg_grid_view;
                EcgGridView ecgGridView = (EcgGridView) c.m(view, R.id.ecg_grid_view);
                if (ecgGridView != null) {
                    i10 = R.id.ecg_view;
                    EcgView ecgView = (EcgView) c.m(view, R.id.ecg_view);
                    if (ecgView != null) {
                        i10 = R.id.empty_view;
                        TextView textView = (TextView) c.m(view, R.id.empty_view);
                        if (textView != null) {
                            i10 = R.id.img_help_info;
                            ImageView imageView = (ImageView) c.m(view, R.id.img_help_info);
                            if (imageView != null) {
                                i10 = R.id.progress_bar;
                                ProgressBar progressBar = (ProgressBar) c.m(view, R.id.progress_bar);
                                if (progressBar != null) {
                                    i10 = R.id.recycler_view;
                                    RecyclerView recyclerView = (RecyclerView) c.m(view, R.id.recycler_view);
                                    if (recyclerView != null) {
                                        i10 = R.id.toolbar;
                                        MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                        if (materialToolbar != null) {
                                            i10 = R.id.tv_amplitude;
                                            TextView textView2 = (TextView) c.m(view, R.id.tv_amplitude);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_speed;
                                                TextView textView3 = (TextView) c.m(view, R.id.tv_speed);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_time;
                                                    TextView textView4 = (TextView) c.m(view, R.id.tv_time);
                                                    if (textView4 != null) {
                                                        return new FragmentEcgBinding((LinearLayout) view, button, button2, ecgGridView, ecgView, textView, imageView, progressBar, recyclerView, materialToolbar, textView2, textView3, textView4);
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

    public static FragmentEcgBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEcgBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_ecg, viewGroup, false);
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
