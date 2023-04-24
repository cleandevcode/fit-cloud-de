package n0;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class d extends Drawable {

    /* renamed from: a */
    public static final double f21920a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    public static final /* synthetic */ int f21921b = 0;

    public static float a(float f10, float f11, boolean z10) {
        float f12 = f10 * 1.5f;
        if (z10) {
            return (float) (((1.0d - f21920a) * f11) + f12);
        }
        return f12;
    }
}
