package com.huawei.hms.scankit.drawable;

import android.view.animation.Interpolator;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public class a implements Interpolator {

    /* renamed from: a */
    private static final BigDecimal f7361a;

    /* renamed from: b */
    private static final BigDecimal f7362b;

    /* renamed from: c */
    private static final float f7363c;

    /* renamed from: d */
    private float f7364d;

    /* renamed from: e */
    private float f7365e;

    /* renamed from: f */
    private float f7366f;

    /* renamed from: g */
    private float f7367g;

    static {
        BigDecimal bigDecimal = new BigDecimal(Float.toString(1.0f));
        f7361a = bigDecimal;
        BigDecimal bigDecimal2 = new BigDecimal(Long.toString(4000L));
        f7362b = bigDecimal2;
        f7363c = bigDecimal.divide(bigDecimal2, 20, 4).floatValue();
    }

    public a(float f10, float f11, float f12, float f13) {
        this.f7364d = f10;
        this.f7365e = f11;
        this.f7366f = f12;
        this.f7367g = f13;
    }

    private long a(float f10) {
        long j10 = 0;
        long j11 = 4000;
        while (j10 <= j11) {
            long j12 = (j10 + j11) >>> 1;
            int i10 = (b(f7363c * ((float) j12)) > f10 ? 1 : (b(f7363c * ((float) j12)) == f10 ? 0 : -1));
            if (i10 < 0) {
                j10 = j12 + 1;
            } else if (i10 <= 0) {
                return j12;
            } else {
                j11 = j12 - 1;
            }
        }
        return j10;
    }

    private String a() {
        return "CubicBezierInterpolator  mControlPoint1x = " + this.f7364d + ", mControlPoint1y = " + this.f7365e + ", mControlPoint2x = " + this.f7366f + ", mControlPoint2y = " + this.f7367g;
    }

    private float b(float f10) {
        float f11 = 1.0f - f10;
        float f12 = 3.0f * f11;
        return (f10 * f10 * f10) + (f12 * f10 * f10 * this.f7366f) + (f11 * f12 * f10 * this.f7364d);
    }

    private float c(float f10) {
        float f11 = 1.0f - f10;
        float f12 = 3.0f * f11;
        return (f10 * f10 * f10) + (f12 * f10 * f10 * this.f7367g) + (f11 * f12 * f10 * this.f7365e);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return c(f7363c * ((float) a(f10)));
    }

    public String toString() {
        return a();
    }
}
