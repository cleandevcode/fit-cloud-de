package a8;

import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a */
    public static DisplayMetrics f387a = null;

    /* renamed from: b */
    public static int f388b = 50;

    /* renamed from: c */
    public static int f389c = 8000;

    /* renamed from: d */
    public static Rect f390d;

    /* renamed from: e */
    public static Paint.FontMetrics f391e;

    /* renamed from: f */
    public static Rect f392f;

    /* renamed from: g */
    public static u7.b f393g;

    /* renamed from: h */
    public static Rect f394h;

    /* renamed from: i */
    public static Paint.FontMetrics f395i;

    static {
        Double.longBitsToDouble(1L);
        Float.intBitsToFloat(1);
        f390d = new Rect();
        f391e = new Paint.FontMetrics();
        f392f = new Rect();
        f393g = new u7.b(1);
        new Rect();
        f394h = new Rect();
        f395i = new Paint.FontMetrics();
    }

    public static int a(Paint paint, String str) {
        Rect rect = f390d;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static a b(Paint paint, String str) {
        a b10 = a.b(0.0f, 0.0f);
        Rect rect = f392f;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        b10.f364b = rect.width();
        b10.f365c = rect.height();
        return b10;
    }

    public static float c(float f10) {
        DisplayMetrics displayMetrics = f387a;
        if (displayMetrics == null) {
            Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
            return f10;
        }
        return f10 * displayMetrics.density;
    }

    public static a d(float f10, float f11) {
        double d10 = 0.0f;
        return a.b(Math.abs(((float) Math.sin(d10)) * f11) + Math.abs(((float) Math.cos(d10)) * f10), Math.abs(f11 * ((float) Math.cos(d10))) + Math.abs(f10 * ((float) Math.sin(d10))));
    }

    public static float e(double d10) {
        if (Double.isInfinite(d10) || Double.isNaN(d10) || d10 == 0.0d) {
            return 0.0f;
        }
        float pow = (float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d10 < 0.0d ? -d10 : d10))));
        return ((float) Math.round(d10 * pow)) / pow;
    }
}
