package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.c;
import com.topstep.fitcloud.pro.ui.widget.SwipeItemLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ItemAlarmListBinding implements a {
    public final ConstraintLayout layoutContent;
    private final SwipeItemLayout rootView;
    public final SwitchCompat switchIsEnabled;
    public final TextView tvAmPm;
    public final TextView tvDelete;
    public final TextView tvLabel;
    public final TextView tvRepeat;
    public final TextView tvTime;

    private ItemAlarmListBinding(SwipeItemLayout swipeItemLayout, ConstraintLayout constraintLayout, SwitchCompat switchCompat, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = swipeItemLayout;
        this.layoutContent = constraintLayout;
        this.switchIsEnabled = switchCompat;
        this.tvAmPm = textView;
        this.tvDelete = textView2;
        this.tvLabel = textView3;
        this.tvRepeat = textView4;
        this.tvTime = textView5;
    }

    public static ItemAlarmListBinding bind(View view) {
        int i10 = R.id.layout_content;
        ConstraintLayout constraintLayout = (ConstraintLayout) c.m(view, R.id.layout_content);
        if (constraintLayout != null) {
            i10 = R.id.switch_is_enabled;
            SwitchCompat switchCompat = (SwitchCompat) c.m(view, R.id.switch_is_enabled);
            if (switchCompat != null) {
                i10 = R.id.tv_am_pm;
                TextView textView = (TextView) c.m(view, R.id.tv_am_pm);
                if (textView != null) {
                    i10 = R.id.tv_delete;
                    TextView textView2 = (TextView) c.m(view, R.id.tv_delete);
                    if (textView2 != null) {
                        i10 = R.id.tv_label;
                        TextView textView3 = (TextView) c.m(view, R.id.tv_label);
                        if (textView3 != null) {
                            i10 = R.id.tv_repeat;
                            TextView textView4 = (TextView) c.m(view, R.id.tv_repeat);
                            if (textView4 != null) {
                                i10 = R.id.tv_time;
                                TextView textView5 = (TextView) c.m(view, R.id.tv_time);
                                if (textView5 != null) {
                                    return new ItemAlarmListBinding((SwipeItemLayout) view, constraintLayout, switchCompat, textView, textView2, textView3, textView4, textView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemAlarmListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemAlarmListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_alarm_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public SwipeItemLayout getRoot() {
        return this.rootView;
    }
}
