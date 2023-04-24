package h9;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final LinearInterpolator f16043a = new LinearInterpolator();

    /* renamed from: b */
    public static final c2.b f16044b = new c2.b();

    /* renamed from: c */
    public static final c2.a f16045c = new c2.a();

    /* renamed from: d */
    public static final c2.c f16046d = new c2.c();

    /* renamed from: e */
    public static final DecelerateInterpolator f16047e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12, float f13, float f14) {
        return f14 < f12 ? f10 : f14 > f13 ? f11 : t0.e.a(f11, f10, (f14 - f12) / (f13 - f12), f10);
    }

    public static int b(float f10, int i10, int i11) {
        return Math.round(f10 * (i11 - i10)) + i10;
    }
}
