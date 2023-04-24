package g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.z1;
import java.util.WeakHashMap;
import z0.b;
import z0.f;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a {
    public static ColorStateList a(Context context, int i10) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        f.c cVar;
        Object obj = y0.a.f30807a;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        f.d dVar = new f.d(resources, theme);
        synchronized (f.f31858c) {
            SparseArray<f.c> sparseArray = f.f31857b.get(dVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (cVar = sparseArray.get(i10)) != null) {
                if (cVar.f31860b.equals(resources.getConfiguration()) && ((theme == null && cVar.f31861c == 0) || (theme != null && cVar.f31861c == theme.hashCode()))) {
                    colorStateList2 = cVar.f31859a;
                } else {
                    sparseArray.remove(i10);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 == null) {
            ThreadLocal<TypedValue> threadLocal = f.f31856a;
            TypedValue typedValue = threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            boolean z10 = true;
            resources.getValue(i10, typedValue, true);
            int i11 = typedValue.type;
            if (!((i11 < 28 || i11 > 31) ? false : false)) {
                try {
                    colorStateList = b.a(resources, resources.getXml(i10), theme);
                } catch (Exception e10) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
                }
            }
            if (colorStateList != null) {
                synchronized (f.f31858c) {
                    WeakHashMap<f.d, SparseArray<f.c>> weakHashMap = f.f31857b;
                    SparseArray<f.c> sparseArray2 = weakHashMap.get(dVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray<>();
                        weakHashMap.put(dVar, sparseArray2);
                    }
                    sparseArray2.append(i10, new f.c(colorStateList, dVar.f31862a.getConfiguration(), theme));
                }
                return colorStateList;
            } else if (Build.VERSION.SDK_INT >= 23) {
                return f.b.b(resources, i10, theme);
            } else {
                return resources.getColorStateList(i10);
            }
        }
        return colorStateList2;
    }

    public static Drawable b(Context context, int i10) {
        return z1.d().f(context, i10);
    }
}
