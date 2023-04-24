package sa;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a */
    public static final v f26807a;

    static {
        v uVar;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            uVar = new r(declaredField.get(null), cls.getMethod("allocateInstance", Class.class));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    uVar = new s(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    uVar = new t(declaredMethod3);
                }
            } catch (Exception unused3) {
                uVar = new u();
            }
        }
        f26807a = uVar;
    }

    public static void a(Class cls) {
        String a10 = e.a(cls);
        if (a10 == null) {
            return;
        }
        throw new AssertionError(a.b.b("UnsafeAllocator is used for non-instantiable type: ", a10));
    }

    public abstract <T> T b(Class<T> cls);
}
