package va;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import qa.m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final AbstractC0528a f29185a;

    /* renamed from: va.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0528a {
        public abstract Method a(Class<?> cls, Field field);

        public abstract <T> Constructor<T> b(Class<T> cls);

        public abstract String[] c(Class<?> cls);

        public abstract boolean d(Class<?> cls);
    }

    /* loaded from: classes.dex */
    public static class b extends AbstractC0528a {
        @Override // va.a.AbstractC0528a
        public final Method a(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // va.a.AbstractC0528a
        public final <T> Constructor<T> b(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // va.a.AbstractC0528a
        public final String[] c(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // va.a.AbstractC0528a
        public final boolean d(Class<?> cls) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends AbstractC0528a {

        /* renamed from: a */
        public final Method f29186a = Class.class.getMethod("isRecord", new Class[0]);

        /* renamed from: b */
        public final Method f29187b;

        /* renamed from: c */
        public final Method f29188c;

        /* renamed from: d */
        public final Method f29189d;

        public c() {
            Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
            this.f29187b = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.f29188c = componentType.getMethod("getName", new Class[0]);
            this.f29189d = componentType.getMethod("getType", new Class[0]);
        }

        @Override // va.a.AbstractC0528a
        public final Method a(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), new Class[0]);
            } catch (ReflectiveOperationException e10) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
            }
        }

        @Override // va.a.AbstractC0528a
        public final <T> Constructor<T> b(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.f29187b.invoke(cls, new Object[0]);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    clsArr[i10] = (Class) this.f29189d.invoke(objArr[i10], new Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e10) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
            }
        }

        @Override // va.a.AbstractC0528a
        public final String[] c(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.f29187b.invoke(cls, new Object[0]);
                String[] strArr = new String[objArr.length];
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    strArr[i10] = (String) this.f29188c.invoke(objArr[i10], new Object[0]);
                }
                return strArr;
            } catch (ReflectiveOperationException e10) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
            }
        }

        @Override // va.a.AbstractC0528a
        public final boolean d(Class<?> cls) {
            try {
                return ((Boolean) this.f29186a.invoke(cls, new Object[0])).booleanValue();
            } catch (ReflectiveOperationException e10) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
            }
        }
    }

    static {
        AbstractC0528a bVar;
        try {
            bVar = new c();
        } catch (NoSuchMethodException unused) {
            bVar = new b();
        }
        f29185a = bVar;
    }

    public static void a(AccessibleObject accessibleObject, StringBuilder sb2) {
        sb2.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i10].getSimpleName());
        }
        sb2.append(')');
    }

    public static String b(Constructor<?> constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        a(constructor, sb2);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.lang.reflect.AccessibleObject r4, boolean r5) {
        /*
            boolean r0 = r4 instanceof java.lang.reflect.Field
            java.lang.String r1 = "#"
            java.lang.String r2 = "'"
            if (r0 == 0) goto L23
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.String r0 = "field '"
            java.lang.StringBuilder r0 = android.support.v4.media.d.a(r0)
            java.lang.Class r3 = r4.getDeclaringClass()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r4 = r4.getName()
            goto L68
        L23:
            boolean r0 = r4 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L58
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = r4.getName()
            r0.<init>(r3)
            a(r4, r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "method '"
            java.lang.StringBuilder r3 = android.support.v4.media.d.a(r3)
            java.lang.Class r4 = r4.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r4 = r3.toString()
            goto L80
        L58:
            boolean r0 = r4 instanceof java.lang.reflect.Constructor
            if (r0 == 0) goto L6f
            java.lang.String r0 = "constructor '"
            java.lang.StringBuilder r0 = android.support.v4.media.d.a(r0)
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4
            java.lang.String r4 = b(r4)
        L68:
            r0.append(r4)
            r0.append(r2)
            goto L7c
        L6f:
            java.lang.String r0 = "<unknown AccessibleObject> "
            java.lang.StringBuilder r0 = android.support.v4.media.d.a(r0)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
        L7c:
            java.lang.String r4 = r0.toString()
        L80:
            if (r5 == 0) goto La9
            r5 = 0
            char r0 = r4.charAt(r5)
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 == 0) goto La9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r5 = r4.charAt(r5)
            char r5 = java.lang.Character.toUpperCase(r5)
            r0.append(r5)
            r5 = 1
            java.lang.String r4 = r4.substring(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        La9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: va.a.c(java.lang.reflect.AccessibleObject, boolean):java.lang.String");
    }

    public static void d(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e10) {
            throw new m(android.support.v4.media.a.a("Failed making ", c(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e10);
        }
    }
}
