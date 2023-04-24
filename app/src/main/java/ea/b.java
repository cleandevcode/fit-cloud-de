package ea;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final int[] f13510a = {16842919};

    /* renamed from: b */
    public static final int[] f13511b = {16842913, 16842919};

    /* renamed from: c */
    public static final int[] f13512c = {16842913};

    /* renamed from: d */
    public static final int[] f13513d = {16842910, 16842919};

    /* renamed from: e */
    public static final String f13514e = b.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        return new ColorStateList(new int[][]{f13512c, StateSet.NOTHING}, new int[]{b(colorStateList, f13511b), b(colorStateList, f13510a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return a1.a.d(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 22 && i10 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f13513d, 0)) != 0) {
                Log.w(f13514e, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean d(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
