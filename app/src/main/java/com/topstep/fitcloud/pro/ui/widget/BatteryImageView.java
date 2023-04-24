package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import com.topstep.fitcloudpro.R;
import z0.f;

/* loaded from: classes2.dex */
public class BatteryImageView extends AppCompatImageView {

    /* renamed from: d */
    public boolean f12244d;

    /* renamed from: e */
    public boolean f12245e;

    /* renamed from: f */
    public int f12246f;

    /* renamed from: g */
    public Drawable f12247g;

    /* renamed from: h */
    public Drawable f12248h;

    public BatteryImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12244d = true;
        Resources resources = getResources();
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal<TypedValue> threadLocal = f.f31856a;
        this.f12247g = f.a.a(resources, R.drawable.ic_battery_unknown, theme);
        this.f12248h = f.a.a(getResources(), R.drawable.ic_battery_charging, getContext().getTheme());
        Drawable drawable = this.f12247g;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f12247g.getIntrinsicHeight());
        Drawable drawable2 = this.f12248h;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f12248h.getIntrinsicHeight());
        setImageDrawable(this.f12247g);
    }

    public final LayerDrawable c(int i10, boolean z10) {
        ClipDrawable clipDrawable;
        Resources resources = getResources();
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal<TypedValue> threadLocal = f.f31856a;
        Drawable a10 = f.a.a(resources, R.drawable.ic_battery_zero, theme);
        if (z10) {
            clipDrawable = new ClipDrawable(f.a.a(getResources(), R.drawable.ic_battery_low, getContext().getTheme()), 8388611, 1);
        } else {
            clipDrawable = new ClipDrawable(f.a.a(getResources(), R.drawable.ic_battery_full, getContext().getTheme()), 8388611, 1);
        }
        clipDrawable.setLevel((int) (((i10 / 100.0f) * 0.84000003f * 10000.0f) + 300.0f));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a10, clipDrawable});
        layerDrawable.setBounds(0, 0, layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight());
        return layerDrawable;
    }
}
