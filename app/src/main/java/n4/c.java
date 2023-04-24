package n4;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c implements Comparable<c> {

    /* renamed from: a */
    public final String f21947a;

    /* renamed from: b */
    public final Method f21948b;

    /* renamed from: c */
    public final Field f21949c;

    /* renamed from: d */
    public int f21950d;

    /* renamed from: e */
    public final Class<?> f21951e;

    /* renamed from: f */
    public final Type f21952f;

    /* renamed from: g */
    public final Class<?> f21953g;

    /* renamed from: h */
    public final boolean f21954h;

    /* renamed from: i */
    public final int f21955i;

    /* renamed from: j */
    public final int f21956j;

    /* renamed from: k */
    public final String f21957k;

    /* renamed from: l */
    public final boolean f21958l;

    /* renamed from: m */
    public final char[] f21959m;

    /* renamed from: n */
    public final boolean f21960n;

    /* renamed from: o */
    public final boolean f21961o;

    /* renamed from: p */
    public final boolean f21962p;

    /* renamed from: q */
    public final String f21963q;

    /* renamed from: r */
    public final String[] f21964r;

    /* renamed from: s */
    public final long f21965s;

    public c(String str, Class<?> cls, Class<?> cls2, Type type, Field field, int i10, int i11, int i12) {
        this.f21950d = 0;
        i10 = i10 < 0 ? 0 : i10;
        this.f21947a = str;
        this.f21953g = cls;
        this.f21951e = cls2;
        this.f21952f = type;
        this.f21948b = null;
        this.f21949c = field;
        this.f21950d = i10;
        this.f21955i = i11;
        this.f21956j = i12;
        this.f21960n = cls2.isEnum();
        if (field != null) {
            this.f21958l = Modifier.isTransient(field.getModifiers());
        } else {
            this.f21958l = false;
        }
        this.f21959m = c();
        if (field != null) {
            n.g0(field);
        }
        this.f21957k = "";
        f4.b bVar = field == null ? null : (f4.b) n.y(f4.b.class, field);
        this.f21954h = false;
        this.f21961o = false;
        this.f21962p = false;
        this.f21963q = null;
        this.f21964r = new String[0];
        this.f21965s = (bVar == null || bVar.name().length() == 0) ? n.u(str) : n.v(str);
    }

    public c(String str, Method method, Field field, Class cls, int i10, int i11, int i12, f4.b bVar, f4.b bVar2, String str2) {
        this(str, method, field, cls, null, i10, i11, i12, bVar, bVar2, str2, null);
    }

    public static boolean e(Type[] typeArr, HashMap hashMap) {
        if (hashMap == null || hashMap.size() == 0) {
            return false;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < typeArr.length; i10++) {
            Type type = typeArr[i10];
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (e(actualTypeArguments, hashMap)) {
                    typeArr[i10] = e4.n.a(new k(parameterizedType.getOwnerType(), parameterizedType.getRawType(), actualTypeArguments));
                    z10 = true;
                }
            } else {
                if ((type instanceof TypeVariable) && hashMap.containsKey(type)) {
                    typeArr[i10] = (Type) hashMap.get(type);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public static boolean f(Type[] typeArr, TypeVariable[] typeVariableArr, Type[] typeArr2) {
        if (typeArr2 == null || typeVariableArr.length == 0) {
            return false;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < typeArr.length; i10++) {
            Type type = typeArr[i10];
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (f(actualTypeArguments, typeVariableArr, typeArr2)) {
                    typeArr[i10] = e4.n.a(new k(parameterizedType.getOwnerType(), parameterizedType.getRawType(), actualTypeArguments));
                    z10 = true;
                }
            } else if (type instanceof TypeVariable) {
                for (int i11 = 0; i11 < typeVariableArr.length; i11++) {
                    if (type.equals(typeVariableArr[i11])) {
                        typeArr[i10] = typeArr2[i11];
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    public static Type g(Class cls, Type type, Type type2, HashMap hashMap) {
        TypeVariable<Class<?>>[] typeParameters;
        ParameterizedType parameterizedType;
        if (cls != null && type != null) {
            if (type2 instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                Type g10 = g(cls, type, genericComponentType, hashMap);
                return genericComponentType != g10 ? Array.newInstance(n.A(g10), 0).getClass() : type2;
            } else if (!n.U(type)) {
                return type2;
            } else {
                if (type2 instanceof TypeVariable) {
                    ParameterizedType parameterizedType2 = (ParameterizedType) n.J(type);
                    TypeVariable typeVariable = (TypeVariable) type2;
                    TypeVariable<Class<?>>[] typeParameters2 = n.A(parameterizedType2).getTypeParameters();
                    for (int i10 = 0; i10 < typeParameters2.length; i10++) {
                        if (typeParameters2[i10].getName().equals(typeVariable.getName())) {
                            return parameterizedType2.getActualTypeArguments()[i10];
                        }
                    }
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType3 = (ParameterizedType) type2;
                    Type[] actualTypeArguments = parameterizedType3.getActualTypeArguments();
                    boolean e10 = e(actualTypeArguments, hashMap);
                    if (!e10) {
                        if (type instanceof ParameterizedType) {
                            parameterizedType = (ParameterizedType) type;
                        } else if (cls.getGenericSuperclass() instanceof ParameterizedType) {
                            parameterizedType = (ParameterizedType) cls.getGenericSuperclass();
                            cls = cls.getSuperclass();
                        } else {
                            typeParameters = type.getClass().getTypeParameters();
                            parameterizedType = parameterizedType3;
                            e10 = f(actualTypeArguments, typeParameters, parameterizedType.getActualTypeArguments());
                        }
                        typeParameters = cls.getTypeParameters();
                        e10 = f(actualTypeArguments, typeParameters, parameterizedType.getActualTypeArguments());
                    }
                    if (e10) {
                        return e4.n.a(new k(parameterizedType3.getOwnerType(), parameterizedType3.getRawType(), actualTypeArguments));
                    }
                }
            }
        }
        return type2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(c cVar) {
        Class<?> cls;
        boolean z10;
        Method method = cVar.f21948b;
        if (method != null && this.f21948b != null && method.isBridge() && !this.f21948b.isBridge() && cVar.f21948b.getName().equals(this.f21948b.getName())) {
            return 1;
        }
        int i10 = this.f21950d;
        int i11 = cVar.f21950d;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int compareTo = this.f21947a.compareTo(cVar.f21947a);
        if (compareTo != 0) {
            return compareTo;
        }
        Method method2 = this.f21948b;
        Class<?> cls2 = null;
        if (method2 != null) {
            cls = method2.getDeclaringClass();
        } else {
            Field field = this.f21949c;
            if (field != null) {
                cls = field.getDeclaringClass();
            } else {
                cls = null;
            }
        }
        Method method3 = cVar.f21948b;
        if (method3 != null) {
            cls2 = method3.getDeclaringClass();
        } else {
            Field field2 = cVar.f21949c;
            if (field2 != null) {
                cls2 = field2.getDeclaringClass();
            }
        }
        if (cls != null && cls2 != null && cls != cls2) {
            if (cls.isAssignableFrom(cls2)) {
                return -1;
            }
            if (cls2.isAssignableFrom(cls)) {
                return 1;
            }
        }
        Field field3 = this.f21949c;
        boolean z11 = false;
        if (field3 != null && field3.getType() == this.f21951e) {
            z10 = true;
        } else {
            z10 = false;
        }
        Field field4 = cVar.f21949c;
        if (field4 != null && field4.getType() == cVar.f21951e) {
            z11 = true;
        }
        if (z10 && !z11) {
            return 1;
        }
        if (z11 && !z10) {
            return -1;
        }
        if (cVar.f21951e.isPrimitive() && !this.f21951e.isPrimitive()) {
            return 1;
        }
        if (this.f21951e.isPrimitive() && !cVar.f21951e.isPrimitive()) {
            return -1;
        }
        if (cVar.f21951e.getName().startsWith("java.") && !this.f21951e.getName().startsWith("java.")) {
            return 1;
        }
        if (this.f21951e.getName().startsWith("java.") && !cVar.f21951e.getName().startsWith("java.")) {
            return -1;
        }
        return this.f21951e.getName().compareTo(cVar.f21951e.getName());
    }

    public final char[] c() {
        int length = this.f21947a.length();
        char[] cArr = new char[length + 3];
        String str = this.f21947a;
        str.getChars(0, str.length(), cArr, 1);
        cArr[0] = '\"';
        cArr[length + 1] = '\"';
        cArr[length + 2] = ':';
        return cArr;
    }

    public final f4.b d() {
        return null;
    }

    public final void h(Object obj, Object obj2) {
        Method method = this.f21948b;
        if (method != null) {
            method.invoke(obj, obj2);
        } else {
            this.f21949c.set(obj, obj2);
        }
    }

    public final String toString() {
        return this.f21947a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x014b, code lost:
        if (r9 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x014e, code lost:
        r9 = r9.getTypeParameters();
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0153, code lost:
        if (r0 >= r9.length) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x015b, code lost:
        if (r5.equals(r9[r0]) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x015d, code lost:
        r4 = r11[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0160, code lost:
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(java.lang.String r4, java.lang.reflect.Method r5, java.lang.reflect.Field r6, java.lang.Class r7, java.lang.reflect.Type r8, int r9, int r10, int r11, f4.b r12, f4.b r13, java.lang.String r14, java.util.HashMap r15) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.c.<init>(java.lang.String, java.lang.reflect.Method, java.lang.reflect.Field, java.lang.Class, java.lang.reflect.Type, int, int, int, f4.b, f4.b, java.lang.String, java.util.HashMap):void");
    }
}
