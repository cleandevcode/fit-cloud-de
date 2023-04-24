package androidx.appcompat.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k1.o0;

/* loaded from: classes.dex */
public final class x2 {

    /* renamed from: a */
    public static Method f1598a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f1598a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f1598a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
        return o0.e.d(view) == 1;
    }
}
