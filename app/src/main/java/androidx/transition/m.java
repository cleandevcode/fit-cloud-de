package androidx.transition;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a */
    public static Method f3453a;

    /* renamed from: b */
    public static boolean f3454b;

    /* renamed from: c */
    public static Field f3455c;

    /* renamed from: d */
    public static boolean f3456d;

    public void a(View view, int i10, int i11, int i12, int i13) {
        if (!f3454b) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f3453a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e10);
            }
            f3454b = true;
        }
        Method method = f3453a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    public void b(View view, int i10) {
        if (!f3456d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f3455c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f3456d = true;
        }
        Field field = f3455c;
        if (field != null) {
            try {
                f3455c.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
