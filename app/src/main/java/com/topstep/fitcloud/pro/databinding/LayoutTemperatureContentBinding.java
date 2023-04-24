package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloudpro.R;
import pl.droidsonroids.gif.GifImageView;

/* loaded from: classes2.dex */
public final class LayoutTemperatureContentBinding implements a {
    public final Button btnStart;
    public final Button btnStop;
    public final GifImageView gifImgTest;
    public final ImageView imgHealthIcon;
    public final LinearLayout layoutCenterValue;
    public final LinearLayout layoutTest;
    private final LinearLayout rootView;
    public final TextView tvBodyValue;
    public final TextView tvResult;
    public final TextView tvTime;
    public final TextView tvWristValue;

    private LayoutTemperatureContentBinding(LinearLayout linearLayout, Button button, Button button2, GifImageView gifImageView, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.btnStart = button;
        this.btnStop = button2;
        this.gifImgTest = gifImageView;
        this.imgHealthIcon = imageView;
        this.layoutCenterValue = linearLayout2;
        this.layoutTest = linearLayout3;
        this.tvBodyValue = textView;
        this.tvResult = textView2;
        this.tvTime = textView3;
        this.tvWristValue = textView4;
    }

    public static LayoutTemperatureContentBinding bind(View view) {
        int i10 = R.id.btn_start;
        Button button = (Button) c.m(view, R.id.btn_start);
        if (button != null) {
            i10 = R.id.btn_stop;
            Button button2 = (Button) c.m(view, R.id.btn_stop);
            if (button2 != null) {
                i10 = R.id.gif_img_test;
                GifImageView gifImageView = (GifImageView) c.m(view, R.id.gif_img_test);
                if (gifImageView != null) {
                    i10 = R.id.img_health_icon;
                    ImageView imageView = (ImageView) c.m(view, R.id.img_health_icon);
                    if (imageView != null) {
                        i10 = R.id.layout_center_value;
                        LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_center_value);
                        if (linearLayout != null) {
                            i10 = R.id.layout_test;
                            LinearLayout linearLayout2 = (LinearLayout) c.m(view, R.id.layout_test);
                            if (linearLayout2 != null) {
                                i10 = R.id.tv_body_value;
                                TextView textView = (TextView) c.m(view, R.id.tv_body_value);
                                if (textView != null) {
                                    i10 = R.id.tv_result;
                                    TextView textView2 = (TextView) c.m(view, R.id.tv_result);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_time;
                                        TextView textView3 = (TextView) c.m(view, R.id.tv_time);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_wrist_value;
                                            TextView textView4 = (TextView) c.m(view, R.id.tv_wrist_value);
                                            if (textView4 != null) {
                                                return new LayoutTemperatureContentBinding((LinearLayout) view, button, button2, gifImageView, imageView, linearLayout, linearLayout2, textView, textView2, textView3, textView4);
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

    public static LayoutTemperatureContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutTemperatureContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.layout_temperature_content, viewGroup, false);
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
