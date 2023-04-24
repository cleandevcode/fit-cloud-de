package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.c;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.ui.settings.wh.WhCalendarView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentWhDetailBinding implements a {
    public final WhCalendarView calendarView;
    public final ImageView imgArrowLeft;
    public final ImageView imgArrowRight;
    public final PreferenceItem itemBeginOperation;
    public final PreferenceItem itemEndOperation;
    public final PreferenceItem itemLatest;
    public final TextView itemNoOperation;
    public final PreferenceItem itemPregnancyDueDate;
    public final ConstraintLayout layoutLegendMenstruation;
    public final ConstraintLayout layoutLegendPregnancy;
    private final LinearLayout rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvGotoToday;
    public final TextView tvLegendMenstruation1;
    public final TextView tvLegendMenstruation2;
    public final TextView tvLegendMenstruation3;
    public final TextView tvLegendMenstruation4;
    public final TextView tvLegendPregnancy1;
    public final TextView tvLegendPregnancy2;
    public final TextView tvLegendPregnancy3;
    public final TextView tvSelectDate;
    public final TextView tvSelectInfo1;
    public final TextView tvSelectInfo2;
    public final TextView tvSelectWeek;
    public final TextView tvYearMonth;

    private FragmentWhDetailBinding(LinearLayout linearLayout, WhCalendarView whCalendarView, ImageView imageView, ImageView imageView2, PreferenceItem preferenceItem, PreferenceItem preferenceItem2, PreferenceItem preferenceItem3, TextView textView, PreferenceItem preferenceItem4, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, MaterialToolbar materialToolbar, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14) {
        this.rootView = linearLayout;
        this.calendarView = whCalendarView;
        this.imgArrowLeft = imageView;
        this.imgArrowRight = imageView2;
        this.itemBeginOperation = preferenceItem;
        this.itemEndOperation = preferenceItem2;
        this.itemLatest = preferenceItem3;
        this.itemNoOperation = textView;
        this.itemPregnancyDueDate = preferenceItem4;
        this.layoutLegendMenstruation = constraintLayout;
        this.layoutLegendPregnancy = constraintLayout2;
        this.toolbar = materialToolbar;
        this.tvGotoToday = textView2;
        this.tvLegendMenstruation1 = textView3;
        this.tvLegendMenstruation2 = textView4;
        this.tvLegendMenstruation3 = textView5;
        this.tvLegendMenstruation4 = textView6;
        this.tvLegendPregnancy1 = textView7;
        this.tvLegendPregnancy2 = textView8;
        this.tvLegendPregnancy3 = textView9;
        this.tvSelectDate = textView10;
        this.tvSelectInfo1 = textView11;
        this.tvSelectInfo2 = textView12;
        this.tvSelectWeek = textView13;
        this.tvYearMonth = textView14;
    }

    public static FragmentWhDetailBinding bind(View view) {
        int i10 = R.id.calendar_view;
        WhCalendarView whCalendarView = (WhCalendarView) c.m(view, R.id.calendar_view);
        if (whCalendarView != null) {
            i10 = R.id.img_arrow_left;
            ImageView imageView = (ImageView) c.m(view, R.id.img_arrow_left);
            if (imageView != null) {
                i10 = R.id.img_arrow_right;
                ImageView imageView2 = (ImageView) c.m(view, R.id.img_arrow_right);
                if (imageView2 != null) {
                    i10 = R.id.item_begin_operation;
                    PreferenceItem preferenceItem = (PreferenceItem) c.m(view, R.id.item_begin_operation);
                    if (preferenceItem != null) {
                        i10 = R.id.item_end_operation;
                        PreferenceItem preferenceItem2 = (PreferenceItem) c.m(view, R.id.item_end_operation);
                        if (preferenceItem2 != null) {
                            i10 = R.id.item_latest;
                            PreferenceItem preferenceItem3 = (PreferenceItem) c.m(view, R.id.item_latest);
                            if (preferenceItem3 != null) {
                                i10 = R.id.item_no_operation;
                                TextView textView = (TextView) c.m(view, R.id.item_no_operation);
                                if (textView != null) {
                                    i10 = R.id.item_pregnancy_due_date;
                                    PreferenceItem preferenceItem4 = (PreferenceItem) c.m(view, R.id.item_pregnancy_due_date);
                                    if (preferenceItem4 != null) {
                                        i10 = R.id.layout_legend_menstruation;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) c.m(view, R.id.layout_legend_menstruation);
                                        if (constraintLayout != null) {
                                            i10 = R.id.layout_legend_pregnancy;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) c.m(view, R.id.layout_legend_pregnancy);
                                            if (constraintLayout2 != null) {
                                                i10 = R.id.toolbar;
                                                MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                                                if (materialToolbar != null) {
                                                    i10 = R.id.tv_goto_today;
                                                    TextView textView2 = (TextView) c.m(view, R.id.tv_goto_today);
                                                    if (textView2 != null) {
                                                        i10 = R.id.tv_legend_menstruation1;
                                                        TextView textView3 = (TextView) c.m(view, R.id.tv_legend_menstruation1);
                                                        if (textView3 != null) {
                                                            i10 = R.id.tv_legend_menstruation2;
                                                            TextView textView4 = (TextView) c.m(view, R.id.tv_legend_menstruation2);
                                                            if (textView4 != null) {
                                                                i10 = R.id.tv_legend_menstruation3;
                                                                TextView textView5 = (TextView) c.m(view, R.id.tv_legend_menstruation3);
                                                                if (textView5 != null) {
                                                                    i10 = R.id.tv_legend_menstruation4;
                                                                    TextView textView6 = (TextView) c.m(view, R.id.tv_legend_menstruation4);
                                                                    if (textView6 != null) {
                                                                        i10 = R.id.tv_legend_pregnancy1;
                                                                        TextView textView7 = (TextView) c.m(view, R.id.tv_legend_pregnancy1);
                                                                        if (textView7 != null) {
                                                                            i10 = R.id.tv_legend_pregnancy2;
                                                                            TextView textView8 = (TextView) c.m(view, R.id.tv_legend_pregnancy2);
                                                                            if (textView8 != null) {
                                                                                i10 = R.id.tv_legend_pregnancy3;
                                                                                TextView textView9 = (TextView) c.m(view, R.id.tv_legend_pregnancy3);
                                                                                if (textView9 != null) {
                                                                                    i10 = R.id.tv_select_date;
                                                                                    TextView textView10 = (TextView) c.m(view, R.id.tv_select_date);
                                                                                    if (textView10 != null) {
                                                                                        i10 = R.id.tv_select_info1;
                                                                                        TextView textView11 = (TextView) c.m(view, R.id.tv_select_info1);
                                                                                        if (textView11 != null) {
                                                                                            i10 = R.id.tv_select_info2;
                                                                                            TextView textView12 = (TextView) c.m(view, R.id.tv_select_info2);
                                                                                            if (textView12 != null) {
                                                                                                i10 = R.id.tv_select_week;
                                                                                                TextView textView13 = (TextView) c.m(view, R.id.tv_select_week);
                                                                                                if (textView13 != null) {
                                                                                                    i10 = R.id.tv_year_month;
                                                                                                    TextView textView14 = (TextView) c.m(view, R.id.tv_year_month);
                                                                                                    if (textView14 != null) {
                                                                                                        return new FragmentWhDetailBinding((LinearLayout) view, whCalendarView, imageView, imageView2, preferenceItem, preferenceItem2, preferenceItem3, textView, preferenceItem4, constraintLayout, constraintLayout2, materialToolbar, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14);
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

    public static FragmentWhDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWhDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_wh_detail, viewGroup, false);
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
