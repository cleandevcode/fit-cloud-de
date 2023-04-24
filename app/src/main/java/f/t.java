package f;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a */
    public static Field f13975a;

    /* renamed from: b */
    public static boolean f13976b;

    /* renamed from: c */
    public static Class<?> f13977c;

    /* renamed from: d */
    public static boolean f13978d;

    /* renamed from: e */
    public static Field f13979e;

    /* renamed from: f */
    public static boolean f13980f;

    /* renamed from: g */
    public static Field f13981g;

    /* renamed from: h */
    public static boolean f13982h;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    public static void a(Object obj) {
        if (!f13978d) {
            try {
                f13977c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f13978d = true;
        }
        Class<?> cls = f13977c;
        if (cls == null) {
            return;
        }
        if (!f13980f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f13979e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f13980f = true;
        }
        Field field = f13979e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}
