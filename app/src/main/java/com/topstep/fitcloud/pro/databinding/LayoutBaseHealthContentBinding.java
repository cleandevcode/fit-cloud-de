package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.c;
import com.topstep.fitcloudpro.R;
import pl.droidsonroids.gif.GifImageView;

/* loaded from: classes2.dex */
public final class LayoutBaseHealthContentBinding implements a {
    public final Button btnStart;
    public final Button btnStop;
    public final GifImageView gifImgTest;
    public final ImageView imgHealthIcon;
    public final ConstraintLayout layoutCenterValue;
    public final LinearLayout layoutTest;
    private final LinearLayout rootView;
    public final TextView tvResult;
    public final TextView tvTime;
    public final TextView tvValue;
    public final TextView tvValueDes;
    public final TextView tvValueUnit;

    private LayoutBaseHealthContentBinding(LinearLayout linearLayout, Button button, Button button2, GifImageView gifImageView, ImageView imageView, ConstraintLayout constraintLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.btnStart = button;
        this.btnStop = button2;
        this.gifImgTest = gifImageView;
        this.imgHealthIcon = imageView;
        this.layoutCenterValue = constraintLayout;
        this.layoutTest = linearLayout2;
        this.tvResult = textView;
        this.tvTime = textView2;
        this.tvValue = textView3;
        this.tvValueDes = textView4;
        this.tvValueUnit = textView5;
    }

    public static LayoutBaseHealthContentBinding bind(View view) {
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
                        ConstraintLayout constraintLayout = (ConstraintLayout) c.m(view, R.id.layout_center_value);
                        if (constraintLayout != null) {
                            i10 = R.id.layout_test;
                            LinearLayout linearLayout = (LinearLayout) c.m(view, R.id.layout_test);
                            if (linearLayout != null) {
                                i10 = R.id.tv_result;
                                TextView textView = (TextView) c.m(view, R.id.tv_result);
                                if (textView != null) {
                                    i10 = R.id.tv_time;
                                    TextView textView2 = (TextView) c.m(view, R.id.tv_time);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_value;
                                        TextView textView3 = (TextView) c.m(view, R.id.tv_value);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_value_des;
                                            TextView textView4 = (TextView) c.m(view, R.id.tv_value_des);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_value_unit;
                                                TextView textView5 = (TextView) c.m(view, R.id.tv_value_unit);
                                                if (textView5 != null) {
                                                    return new LayoutBaseHealthContentBinding((LinearLayout) view, button, button2, gifImageView, imageView, constraintLayout, linearLayout, textView, textView2, textView3, textView4, textView5);
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

    public static LayoutBaseHealthContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutBaseHealthContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.layout_base_health_content, viewGroup, false);
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
