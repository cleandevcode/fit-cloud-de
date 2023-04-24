package v5;

import gm.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public static final /* synthetic */ int f29124a = 0;

    static {
        new j();
    }

    public static final Class<?> a(String str) {
        if (i6.a.b(j.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            i6.a.a(j.class, th2);
            return null;
        }
    }

    public static final Method b(Class<?> cls, String str, Class<?>... clsArr) {
        if (i6.a.b(j.class)) {
            return null;
        }
        try {
            l.f(clsArr, "args");
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            i6.a.a(j.class, th2);
            return null;
        }
    }

    public static final Method c(Class<?> cls, String str, Class<?>... clsArr) {
        if (i6.a.b(j.class)) {
            return null;
        }
        try {
            l.f(cls, "clazz");
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            i6.a.a(j.class, th2);
            return null;
        }
    }

    public static final Object d(Class cls, Object obj, Method method, Object... objArr) {
        if (i6.a.b(j.class)) {
            return null;
        }
        try {
            l.f(cls, "clazz");
            l.f(method, "method");
            l.f(objArr, "args");
            if (obj != null) {
                obj = cls.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th2) {
            i6.a.a(j.class, th2);
            return null;
        }
    }
}
