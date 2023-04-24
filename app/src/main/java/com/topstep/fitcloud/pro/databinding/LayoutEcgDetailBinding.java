package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import b0.c;
import com.topstep.fitcloud.pro.ui.widget.EcgGridView;
import com.topstep.fitcloud.pro.ui.widget.EcgView;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class LayoutEcgDetailBinding implements a {
    public final Button btnDetailReport;
    public final Button btnEcgPlay;
    public final EcgGridView ecgGridView;
    public final EcgView ecgView;
    public final ImageView imgHealthReport;
    public final LinearLayout layoutContent;
    public final LoadingView loadingView;
    private final CardView rootView;
    public final TextView tvAmplitude;
    public final TextView tvSpeed;
    public final TextView tvTime;

    private LayoutEcgDetailBinding(CardView cardView, Button button, Button button2, EcgGridView ecgGridView, EcgView ecgView, ImageView imageView, LinearLayout linearLayout, LoadingView loadingView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = cardView;
        this.btnDetailReport = button;
        this.btnEcgPlay = button2;
        this.ecgGridView = ecgGridView;
        this.ecgView = ecgView;
        this.imgHealthReport = imageView;
        this.layoutContent = linearLayout;
        this.loadingView = loadingView;
        this.tvAmplitude = textView;
        this.tvSpeed = textView2;
        this.tvTime = textView3;
    }

    public static LayoutEcgDetailBinding bind(View view) {
        int i10 = R.id.btn_detail_report;
        Button button = (Button) c.m(view, R.id.btn_detail_report);
        if (button != null) {
            i10 = R.id.btn_ecg_play;
            Button button2 = (Button) c.m(view, R.id.btn_ecg_play);
            if (button2 != null) {
                i10 = R.id.ecg_grid_view;
                EcgGridView ecgGridView = (EcgGridView) c.m(view, R.id.ecg_grid_view);
                if (ecgGridView != null) {
                    i10 = R.id.ecg_view;
                    EcgView ecgView = (EcgView) c.m(view, R.id.ecg_view);
                    if (ecgView != null) {
                        i10 = R.id.img_health_report;
                        ImageView imageView = (ImageView) c.m(view, R.id.img_health_report);
                        if (imageView != null) {
                            i10 = R.id.layout_content;
                            LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_content);
                            if (linearLayout != null) {
                                i10 = R.id.loading_view;
                                LoadingView loadingView = (LoadingView) c.m(view, R.id.loading_view);
                                if (loadingView != null) {
                                    i10 = R.id.tv_amplitude;
                                    TextView textView = (TextView) c.m(view, R.id.tv_amplitude);
                                    if (textView != null) {
                                        i10 = R.id.tv_speed;
                                        TextView textView2 = (TextView) c.m(view, R.id.tv_speed);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_time;
                                            TextView textView3 = (TextView) c.m(view, R.id.tv_time);
                                            if (textView3 != null) {
                                                return new LayoutEcgDetailBinding((CardView) view, button, button2, ecgGridView, ecgView, imageView, linearLayout, loadingView, textView, textView2, textView3);
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

    public static LayoutEcgDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutEcgDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.layout_ecg_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public CardView getRoot() {
        return this.rootView;
    }
}
