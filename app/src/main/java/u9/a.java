package u9;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import da.b;

/* loaded from: classes.dex */
public final class a {
    public static int a(Context context, int i10, int i11) {
        TypedValue a10 = b.a(context, i10);
        return a10 != null ? a10.data : i11;
    }

    public static int b(View view, int i10) {
        return b.b(view.getContext(), i10, view.getClass().getCanonicalName());
    }

    public static boolean c(int i10) {
        double pow;
        double pow2;
        double pow3;
        if (i10 != 0) {
            ThreadLocal<double[]> threadLocal = a1.a.f212a;
            double[] dArr = threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i10);
            int green = Color.green(i10);
            int blue = Color.blue(i10);
            if (dArr.length == 3) {
                double d10 = red / 255.0d;
                if (d10 < 0.04045d) {
                    pow = d10 / 12.92d;
                } else {
                    pow = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
                }
                double d11 = green / 255.0d;
                if (d11 < 0.04045d) {
                    pow2 = d11 / 12.92d;
                } else {
                    pow2 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
                }
                double[] dArr2 = dArr;
                double d12 = blue / 255.0d;
                if (d12 < 0.04045d) {
                    pow3 = d12 / 12.92d;
                } else {
                    pow3 = Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
                }
                dArr2[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d13 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr2[1] = d13;
                double d14 = pow3 * 0.9505d;
                dArr2[2] = (d14 + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d13 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        }
        return false;
    }

    public static int d(float f10, int i10, int i11) {
        return a1.a.b(a1.a.d(i11, Math.round(Color.alpha(i11) * f10)), i10);
    }
}
