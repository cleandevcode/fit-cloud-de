package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.R;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final b f6454a;

    /* renamed from: b */
    public final b f6455b;

    /* renamed from: c */
    public final b f6456c;

    /* renamed from: d */
    public final b f6457d;

    /* renamed from: e */
    public final b f6458e;

    /* renamed from: f */
    public final b f6459f;

    /* renamed from: g */
    public final b f6460g;

    /* renamed from: h */
    public final Paint f6461h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(da.b.b(context, R.attr.materialCalendarStyle, h.class.getCanonicalName()), R.styleable.MaterialCalendar);
        this.f6454a = b.a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayStyle, 0));
        this.f6460g = b.a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.f6455b = b.a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.f6456c = b.a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a10 = da.d.a(context, obtainStyledAttributes, R.styleable.MaterialCalendar_rangeFillColor);
        this.f6457d = b.a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearStyle, 0));
        this.f6458e = b.a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f6459f = b.a(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f6461h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
