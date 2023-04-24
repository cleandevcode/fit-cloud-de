package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemSportHistoryRecordBinding implements a {
    public final ImageView imgFlagWristband;
    public final ImageView imgMainAttr;
    public final ImageView imgSportType;
    private final LinearLayout rootView;
    public final TextView tvCalories;
    public final TextView tvDate;
    public final TextView tvDuration;
    public final TextView tvMainAttr;
    public final TextView tvMainAttrUnit;
    public final TextView tvTime;
    public final View viewDivider;

    private ItemSportHistoryRecordBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view) {
        this.rootView = linearLayout;
        this.imgFlagWristband = imageView;
        this.imgMainAttr = imageView2;
        this.imgSportType = imageView3;
        this.tvCalories = textView;
        this.tvDate = textView2;
        this.tvDuration = textView3;
        this.tvMainAttr = textView4;
        this.tvMainAttrUnit = textView5;
        this.tvTime = textView6;
        this.viewDivider = view;
    }

    public static ItemSportHistoryRecordBinding bind(View view) {
        int i10 = R.id.img_flag_wristband;
        ImageView imageView = (ImageView) c.m(view, R.id.img_flag_wristband);
        if (imageView != null) {
            i10 = R.id.img_main_attr;
            ImageView imageView2 = (ImageView) c.m(view, R.id.img_main_attr);
            if (imageView2 != null) {
                i10 = R.id.img_sport_type;
                ImageView imageView3 = (ImageView) c.m(view, R.id.img_sport_type);
                if (imageView3 != null) {
                    i10 = R.id.tv_calories;
                    TextView textView = (TextView) c.m(view, R.id.tv_calories);
                    if (textView != null) {
                        i10 = R.id.tv_date;
                        TextView textView2 = (TextView) c.m(view, R.id.tv_date);
                        if (textView2 != null) {
                            i10 = R.id.tv_duration;
                            TextView textView3 = (TextView) c.m(view, R.id.tv_duration);
                            if (textView3 != null) {
                                i10 = R.id.tv_main_attr;
                                TextView textView4 = (TextView) c.m(view, R.id.tv_main_attr);
                                if (textView4 != null) {
                                    i10 = R.id.tv_main_attr_unit;
                                    TextView textView5 = (TextView) c.m(view, R.id.tv_main_attr_unit);
                                    if (textView5 != null) {
                                        i10 = R.id.tv_time;
                                        TextView textView6 = (TextView) c.m(view, R.id.tv_time);
                                        if (textView6 != null) {
                                            i10 = R.id.view_divider;
                                            View m10 = c.m(view, R.id.view_divider);
                                            if (m10 != null) {
                                                return new ItemSportHistoryRecordBinding((LinearLayout) view, imageView, imageView2, imageView3, textView, textView2, textView3, textView4, textView5, textView6, m10);
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

    public static ItemSportHistoryRecordBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSportHistoryRecordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_sport_history_record, viewGroup, false);
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
