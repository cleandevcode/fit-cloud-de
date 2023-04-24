package aa;

import a1.f;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.v4.media.d;
import android.util.TypedValue;
import c2.b;

/* loaded from: classes.dex */
public final class a {
    public static float a(String[] strArr, int i10) {
        float parseFloat = Float.parseFloat(strArr[i10]);
        if (parseFloat < 0.0f || parseFloat > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
        }
        return parseFloat;
    }

    public static boolean b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("(");
        return str.startsWith(sb2.toString()) && str.endsWith(")");
    }

    public static TimeInterpolator c(Context context, int i10, b bVar) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            if (typedValue.type == 3) {
                String valueOf = String.valueOf(typedValue.string);
                if (b(valueOf, "cubic-bezier")) {
                    String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                    if (split.length == 4) {
                        return m1.a.b(a(split, 0), a(split, 1), a(split, 2), a(split, 3));
                    }
                    StringBuilder a10 = d.a("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                    a10.append(split.length);
                    throw new IllegalArgumentException(a10.toString());
                } else if (b(valueOf, "path")) {
                    return m1.a.c(f.d(valueOf.substring(5, valueOf.length() - 1)));
                } else {
                    throw new IllegalArgumentException(a.b.b("Invalid motion easing type: ", valueOf));
                }
            }
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
        return bVar;
    }
}
