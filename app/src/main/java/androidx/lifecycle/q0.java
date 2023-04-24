package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a */
    public static final List<Class<?>> f2771a = h7.a.q(Application.class, l0.class);

    /* renamed from: b */
    public static final List<Class<?>> f2772b = h7.a.p(l0.class);

    public static final <T> Constructor<T> a(Class<T> cls, List<? extends Class<?>> list) {
        gm.l.f(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        gm.l.e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            gm.l.e(parameterTypes, "constructor.parameterTypes");
            List G = ul.i.G(parameterTypes);
            if (gm.l.a(list, G)) {
                return constructor2;
            }
            if (list.size() == G.size() && G.containsAll(list)) {
                StringBuilder a10 = android.support.v4.media.d.a("Class ");
                a10.append(cls.getSimpleName());
                a10.append(" must have parameters in the proper order: ");
                a10.append(list);
                throw new UnsupportedOperationException(a10.toString());
            }
        }
        return null;
    }

    public static final <T extends s0> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
