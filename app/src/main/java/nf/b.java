package nf;

import android.support.v4.media.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import mf.l0;
import mf.v;
import mf.x;
import mf.y;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final Set<Annotation> f22339a;

    /* renamed from: b */
    public static final Type[] f22340b;

    /* renamed from: c */
    public static final Class<?> f22341c;

    /* renamed from: d */
    public static final Class<? extends Annotation> f22342d;

    /* renamed from: e */
    public static final Map<Class<?>, Class<?>> f22343e;

    /* loaded from: classes.dex */
    public static final class a implements GenericArrayType {

        /* renamed from: a */
        public final Type f22344a;

        public a(Type type) {
            this.f22344a = b.a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && l0.b(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f22344a;
        }

        public final int hashCode() {
            return this.f22344a.hashCode();
        }

        public final String toString() {
            return b.l(this.f22344a) + "[]";
        }
    }

    /* renamed from: nf.b$b */
    /* loaded from: classes.dex */
    public static final class C0392b implements ParameterizedType {

        /* renamed from: a */
        public final Type f22345a;

        /* renamed from: b */
        public final Type f22346b;

        /* renamed from: c */
        public final Type[] f22347c;

        public C0392b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || l0.c(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f22345a = type == null ? null : b.a(type);
            this.f22346b = b.a(type2);
            this.f22347c = (Type[]) typeArr.clone();
            int i10 = 0;
            while (true) {
                Type[] typeArr2 = this.f22347c;
                if (i10 >= typeArr2.length) {
                    return;
                }
                Type type3 = typeArr2[i10];
                type3.getClass();
                b.b(type3);
                Type[] typeArr3 = this.f22347c;
                typeArr3[i10] = b.a(typeArr3[i10]);
                i10++;
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && l0.b(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f22347c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f22345a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f22346b;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.f22347c) ^ this.f22346b.hashCode();
            Type type = this.f22345a;
            Set<Annotation> set = b.f22339a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder((this.f22347c.length + 1) * 30);
            sb2.append(b.l(this.f22346b));
            if (this.f22347c.length == 0) {
                return sb2.toString();
            }
            sb2.append("<");
            sb2.append(b.l(this.f22347c[0]));
            for (int i10 = 1; i10 < this.f22347c.length; i10++) {
                sb2.append(", ");
                sb2.append(b.l(this.f22347c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements WildcardType {

        /* renamed from: a */
        public final Type f22348a;

        /* renamed from: b */
        public final Type f22349b;

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
                b.b(type);
                this.f22349b = null;
                this.f22348a = b.a(typeArr[0]);
                return;
            }
            Type type2 = typeArr2[0];
            type2.getClass();
            b.b(type2);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f22349b = b.a(typeArr2[0]);
            this.f22348a = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && l0.b(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f22349b;
            return type != null ? new Type[]{type} : b.f22340b;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f22348a};
        }

        public final int hashCode() {
            Type type = this.f22349b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f22348a.hashCode() + 31);
        }

        public final String toString() {
            StringBuilder a10;
            Type type;
            if (this.f22349b != null) {
                a10 = d.a("? super ");
                type = this.f22349b;
            } else if (this.f22348a == Object.class) {
                return "?";
            } else {
                a10 = d.a("? extends ");
                type = this.f22348a;
            }
            a10.append(b.l(type));
            return a10.toString();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:23:0x001a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            java.util.Set r0 = java.util.Collections.emptySet()
            nf.b.f22339a = r0
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            nf.b.f22340b = r0
            r0 = 0
            java.lang.String r1 = getKotlinMetadataClassName()     // Catch: java.lang.ClassNotFoundException -> L15
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L15
            goto L16
        L15:
            r1 = r0
        L16:
            nf.b.f22342d = r1
            java.lang.Class<kotlin.jvm.internal.DefaultConstructorMarker> r0 = kotlin.jvm.internal.DefaultConstructorMarker.class
        L1a:
            nf.b.f22341c = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 16
            r0.<init>(r1)
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Void.TYPE
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            nf.b.f22343e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.b.<clinit>():void");
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof C0392b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0392b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return type instanceof a ? type : new a(((GenericArrayType) type).getGenericComponentType());
        } else if (!(type instanceof WildcardType) || (type instanceof c)) {
            return type;
        } else {
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    public static Type c(Type type, Class<?> cls, Class<?> cls2) {
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
                    return c(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
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
                    return c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static boolean d(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static Set<? extends Annotation> f(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(x.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f22339a;
    }

    public static v g(String str, String str2, y yVar) {
        String k10 = yVar.k();
        return new v(str2.equals(str) ? String.format("Required value '%s' missing at %s", str, k10) : String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, k10));
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static Type h(Type type) {
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return type;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return upperBounds[0];
            }
            throw new IllegalArgumentException();
        }
        return type;
    }

    public static Type i(Type type, Class cls, Type type2, LinkedHashSet linkedHashSet) {
        Type[] typeArr;
        Type[] typeArr2;
        boolean z10;
        TypeVariable typeVariable;
        Class cls2;
        do {
            int i10 = 0;
            if (type2 instanceof TypeVariable) {
                typeVariable = (TypeVariable) type2;
                if (linkedHashSet.contains(typeVariable)) {
                    return type2;
                }
                linkedHashSet.add(typeVariable);
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type c10 = c(type, cls, cls2);
                    if (c10 instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        while (i10 < typeParameters.length) {
                            if (typeVariable.equals(typeParameters[i10])) {
                                type2 = ((ParameterizedType) c10).getActualTypeArguments()[i10];
                                continue;
                            } else {
                                i10++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable;
                continue;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type i11 = i(type, cls, componentType, linkedHashSet);
                        if (componentType != i11) {
                            return new a(i11);
                        }
                        return cls3;
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type i12 = i(type, cls, genericComponentType, linkedHashSet);
                    if (genericComponentType != i12) {
                        return new a(i12);
                    }
                    return genericArrayType;
                } else if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type i13 = i(type, cls, ownerType, linkedHashSet);
                    if (i13 != ownerType) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i10 < length) {
                        Type i14 = i(type, cls, actualTypeArguments[i10], linkedHashSet);
                        if (i14 != actualTypeArguments[i10]) {
                            if (!z10) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z10 = true;
                            }
                            actualTypeArguments[i10] = i14;
                        }
                        i10++;
                    }
                    if (z10) {
                        return new C0392b(i13, parameterizedType.getRawType(), actualTypeArguments);
                    }
                    return parameterizedType;
                } else {
                    boolean z11 = type2 instanceof WildcardType;
                    WildcardType wildcardType = type2;
                    if (z11) {
                        WildcardType wildcardType2 = (WildcardType) type2;
                        Type[] lowerBounds = wildcardType2.getLowerBounds();
                        Type[] upperBounds = wildcardType2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type i15 = i(type, cls, lowerBounds[0], linkedHashSet);
                            wildcardType = wildcardType2;
                            if (i15 != lowerBounds[0]) {
                                if (i15 instanceof WildcardType) {
                                    typeArr2 = ((WildcardType) i15).getLowerBounds();
                                } else {
                                    typeArr2 = new Type[]{i15};
                                }
                                return new c(new Type[]{Object.class}, typeArr2);
                            }
                        } else {
                            wildcardType = wildcardType2;
                            if (upperBounds.length == 1) {
                                Type i16 = i(type, cls, upperBounds[0], linkedHashSet);
                                wildcardType = wildcardType2;
                                if (i16 != upperBounds[0]) {
                                    if (i16 instanceof WildcardType) {
                                        typeArr = ((WildcardType) i16).getUpperBounds();
                                    } else {
                                        typeArr = new Type[]{i16};
                                    }
                                    return new c(typeArr, f22340b);
                                }
                            }
                        }
                    }
                    return wildcardType;
                }
            }
        } while (type2 != typeVariable);
        return type2;
    }

    public static void j(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw ((Error) targetException);
    }

    public static String k(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String l(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static v m(String str, String str2, y yVar) {
        String k10 = yVar.k();
        return new v(str2.equals(str) ? String.format("Non-null value '%s' was null at %s", str, k10) : String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, k10));
    }
}
