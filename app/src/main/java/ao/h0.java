package ao;

import androidx.appcompat.widget.e2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a */
    public static final Type[] f3818a = new Type[0];

    /* loaded from: classes2.dex */
    public static final class a implements GenericArrayType {

        /* renamed from: a */
        public final Type f3819a;

        public a(Type type) {
            this.f3819a = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && h0.c(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f3819a;
        }

        public final int hashCode() {
            return this.f3819a.hashCode();
        }

        public final String toString() {
            return h0.o(this.f3819a) + "[]";
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements ParameterizedType {

        /* renamed from: a */
        public final Type f3820a;

        /* renamed from: b */
        public final Type f3821b;

        /* renamed from: c */
        public final Type[] f3822c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                h0.b(type3);
            }
            this.f3820a = type;
            this.f3821b = type2;
            this.f3822c = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && h0.c(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f3822c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f3820a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f3821b;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.f3822c) ^ this.f3821b.hashCode();
            Type type = this.f3820a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f3822c;
            if (typeArr.length == 0) {
                return h0.o(this.f3821b);
            }
            StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
            sb2.append(h0.o(this.f3821b));
            sb2.append("<");
            sb2.append(h0.o(this.f3822c[0]));
            for (int i10 = 1; i10 < this.f3822c.length; i10++) {
                sb2.append(", ");
                sb2.append(h0.o(this.f3822c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements WildcardType {

        /* renamed from: a */
        public final Type f3823a;

        /* renamed from: b */
        public final Type f3824b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Type type = typeArr[0];
                type.getClass();
                h0.b(type);
                this.f3824b = null;
                this.f3823a = typeArr[0];
                return;
            }
            Type type2 = typeArr2[0];
            type2.getClass();
            h0.b(type2);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f3824b = typeArr2[0];
            this.f3823a = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && h0.c(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f3824b;
            return type != null ? new Type[]{type} : h0.f3818a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f3823a};
        }

        public final int hashCode() {
            Type type = this.f3824b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f3823a.hashCode() + 31);
        }

        public final String toString() {
            StringBuilder a10;
            Type type;
            if (this.f3824b != null) {
                a10 = android.support.v4.media.d.a("? super ");
                type = this.f3824b;
            } else if (this.f3823a == Object.class) {
                return "?";
            } else {
                a10 = android.support.v4.media.d.a("? extends ");
                type = this.f3823a;
            }
            a10.append(h0.o(type));
            return a10.toString();
        }
    }

    public static zm.b0 a(zm.c0 c0Var) {
        ln.e eVar = new ln.e();
        c0Var.h().k0(eVar);
        zm.s b10 = c0Var.b();
        long a10 = c0Var.a();
        zm.c0.f32573a.getClass();
        return new zm.b0(b10, a10, eVar);
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean c(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        } else if (type instanceof WildcardType) {
            if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
            }
            return false;
        } else if ((type instanceof TypeVariable) && (type2 instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        } else {
            return false;
        }
    }

    public static Type d(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return d(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type e(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 >= 0 && i10 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i10];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        StringBuilder a10 = e2.a("Index ", i10, " not in range [0,");
        a10.append(actualTypeArguments.length);
        a10.append(") for ");
        a10.append(parameterizedType);
        throw new IllegalArgumentException(a10.toString());
    }

    public static Class<?> f(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(f(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return f(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    public static Type g(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m(cls, type, d(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static boolean h(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (h(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return h(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
    }

    public static boolean i(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException j(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder a10 = p.a.a(String.format(str, objArr), "\n    for method ");
        a10.append(method.getDeclaringClass().getSimpleName());
        a10.append(".");
        a10.append(method.getName());
        return new IllegalArgumentException(a10.toString(), exc);
    }

    public static IllegalArgumentException k(Method method, int i10, String str, Object... objArr) {
        StringBuilder a10 = p.a.a(str, " (parameter #");
        a10.append(i10 + 1);
        a10.append(")");
        return j(method, null, a10.toString(), objArr);
    }

    public static IllegalArgumentException l(Method method, Exception exc, int i10, String str, Object... objArr) {
        StringBuilder a10 = p.a.a(str, " (parameter #");
        a10.append(i10 + 1);
        a10.append(")");
        return j(method, exc, a10.toString(), objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
        r10 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0043 A[LOOP:0: B:91:0x0000->B:113:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type m(java.lang.Class r8, java.lang.reflect.Type r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.h0.m(java.lang.Class, java.lang.reflect.Type, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static void n(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    public static String o(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
