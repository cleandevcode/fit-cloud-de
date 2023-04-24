package w9;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import com.google.android.material.R;
import da.b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f */
    public static final int f29762f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    public final boolean f29763a;

    /* renamed from: b */
    public final int f29764b;

    /* renamed from: c */
    public final int f29765c;

    /* renamed from: d */
    public final int f29766d;

    /* renamed from: e */
    public final float f29767e;

    public a(Context context) {
        boolean z10;
        TypedValue a10 = b.a(context, R.attr.elevationOverlayEnabled);
        if (a10 != null && a10.type == 18 && a10.data != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int a11 = u9.a.a(context, R.attr.elevationOverlayColor, 0);
        int a12 = u9.a.a(context, R.attr.elevationOverlayAccentColor, 0);
        int a13 = u9.a.a(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f29763a = z10;
        this.f29764b = a11;
        this.f29765c = a12;
        this.f29766d = a13;
        this.f29767e = f10;
    }

    public final int a(float f10, int i10) {
        boolean z10;
        float f11;
        int i11;
        if (this.f29763a) {
            if (a1.a.d(i10, 255) == this.f29766d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                float f12 = this.f29767e;
                if (f12 > 0.0f && f10 > 0.0f) {
                    f11 = Math.min(((((float) Math.log1p(f10 / f12)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                } else {
                    f11 = 0.0f;
                }
                int alpha = Color.alpha(i10);
                int d10 = u9.a.d(f11, a1.a.d(i10, 255), this.f29764b);
                if (f11 > 0.0f && (i11 = this.f29765c) != 0) {
                    d10 = a1.a.b(a1.a.d(i11, f29762f), d10);
                }
                return a1.a.d(d10, alpha);
            }
        }
        return i10;
    }
}
