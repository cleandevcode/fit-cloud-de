package n4;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final boolean f21946a;

    static {
        boolean z10;
        String property = System.getProperty("java.vm.name");
        if (property != null) {
            String lowerCase = property.toLowerCase();
            if (lowerCase.contains("dalvik") || lowerCase.contains("lemur")) {
                z10 = true;
                f21946a = z10;
            }
        }
        z10 = false;
        f21946a = z10;
    }

    public static boolean a(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < 1 || charAt > 127 || charAt == '.') {
                return false;
            }
        }
        return true;
    }

    public static String b(Class<?> cls) {
        StringBuilder a10;
        String str;
        if (cls.isPrimitive()) {
            return d(cls);
        }
        if (cls.isArray()) {
            a10 = android.support.v4.media.d.a("[");
            str = b(cls.getComponentType());
        } else {
            a10 = android.support.v4.media.d.a("L");
            a10.append(f(cls));
            str = ";";
        }
        a10.append(str);
        return a10.toString();
    }

    public static String c(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        StringBuilder sb2 = new StringBuilder((parameterTypes.length + 1) << 4);
        sb2.append('(');
        for (Class<?> cls : parameterTypes) {
            sb2.append(b(cls));
        }
        sb2.append(')');
        sb2.append(b(method.getReturnType()));
        return sb2.toString();
    }

    public static String d(Class<?> cls) {
        if (Integer.TYPE == cls) {
            return "I";
        }
        if (Void.TYPE == cls) {
            return "V";
        }
        if (Boolean.TYPE == cls) {
            return "Z";
        }
        if (Character.TYPE == cls) {
            return "C";
        }
        if (Byte.TYPE == cls) {
            return "B";
        }
        if (Short.TYPE == cls) {
            return "S";
        }
        if (Float.TYPE == cls) {
            return "F";
        }
        if (Long.TYPE == cls) {
            return "J";
        }
        if (Double.TYPE == cls) {
            return "D";
        }
        StringBuilder a10 = android.support.v4.media.d.a("Type: ");
        a10.append(cls.getCanonicalName());
        a10.append(" is not a primitive type");
        throw new IllegalStateException(a10.toString());
    }

    public static String[] e(AccessibleObject accessibleObject) {
        Class<?>[] parameterTypes;
        Class<?> declaringClass;
        Annotation[][] M;
        String str;
        String name;
        if (f21946a) {
            return new String[0];
        }
        if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            parameterTypes = method.getParameterTypes();
            str = method.getName();
            declaringClass = method.getDeclaringClass();
            M = n.N(method);
        } else {
            Constructor constructor = (Constructor) accessibleObject;
            parameterTypes = constructor.getParameterTypes();
            declaringClass = constructor.getDeclaringClass();
            M = n.M(constructor);
            str = "<init>";
        }
        if (parameterTypes.length == 0) {
            return new String[0];
        }
        ClassLoader classLoader = declaringClass.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        String name2 = declaringClass.getName();
        InputStream resourceAsStream = classLoader.getResourceAsStream(name2.replace('.', '/') + ".class");
        try {
            if (resourceAsStream == null) {
                return new String[0];
            }
            g4.a aVar = new g4.a(resourceAsStream, false);
            g4.j jVar = new g4.j(str, parameterTypes);
            aVar.a(jVar);
            String[] a10 = jVar.a();
            for (int i10 = 0; i10 < a10.length; i10++) {
                Annotation[] annotationArr = M[i10];
                if (annotationArr != null) {
                    for (Annotation annotation : annotationArr) {
                        if ((annotation instanceof f4.b) && (name = ((f4.b) annotation).name()) != null && name.length() > 0) {
                            a10[i10] = name;
                        }
                    }
                }
            }
            return a10;
        } catch (IOException unused) {
            return new String[0];
        } finally {
            g.a(resourceAsStream);
        }
    }

    public static String f(Class<?> cls) {
        if (cls.isArray()) {
            StringBuilder a10 = android.support.v4.media.d.a("[");
            a10.append(b(cls.getComponentType()));
            return a10.toString();
        } else if (!cls.isPrimitive()) {
            return cls.getName().replace('.', '/');
        } else {
            return d(cls);
        }
    }
}
