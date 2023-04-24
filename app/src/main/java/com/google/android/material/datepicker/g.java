package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* renamed from: d */
    public static final int f6471d;

    /* renamed from: a */
    public final Calendar f6472a;

    /* renamed from: b */
    public final int f6473b;

    /* renamed from: c */
    public final int f6474c;

    static {
        f6471d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar d10 = d0.d(null);
        this.f6472a = d10;
        this.f6473b = d10.getMaximum(7);
        this.f6474c = d10.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f6473b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f6473b;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f6474c;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f6472a;
        int i11 = i10 + this.f6474c;
        int i12 = this.f6473b;
        if (i11 > i12) {
            i11 -= i12;
        }
        calendar.set(7, i11);
        textView.setText(this.f6472a.getDisplayName(7, f6471d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f6472a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
