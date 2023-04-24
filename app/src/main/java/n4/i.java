package n4;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public final Class<?> f21988a;

    /* renamed from: b */
    public final Class<?> f21989b;

    /* renamed from: c */
    public final Constructor<?> f21990c;

    /* renamed from: d */
    public final Constructor<?> f21991d;

    /* renamed from: e */
    public final Method f21992e;

    /* renamed from: f */
    public final Method f21993f;

    /* renamed from: g */
    public final int f21994g;

    /* renamed from: h */
    public final c[] f21995h;

    /* renamed from: i */
    public final c[] f21996i;

    /* renamed from: j */
    public final int f21997j;

    /* renamed from: k */
    public final String f21998k;

    /* renamed from: l */
    public final String f21999l;

    /* renamed from: m */
    public String[] f22000m;

    /* renamed from: n */
    public Type[] f22001n;

    /* renamed from: o */
    public String[] f22002o;

    /* renamed from: p */
    public boolean f22003p;

    /* renamed from: q */
    public Constructor<?> f22004q;

    /* JADX WARN: Removed duplicated region for block: B:152:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(java.lang.Class r8, java.lang.Class r9, java.lang.reflect.Constructor r10, java.lang.reflect.Constructor r11, java.lang.reflect.Method r12, java.lang.reflect.Method r13, f4.d r14, java.util.ArrayList r15) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.i.<init>(java.lang.Class, java.lang.Class, java.lang.reflect.Constructor, java.lang.reflect.Constructor, java.lang.reflect.Method, java.lang.reflect.Method, f4.d, java.util.ArrayList):void");
    }

    public static void a(ArrayList arrayList, c cVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar2 = (c) arrayList.get(size);
            if (cVar2.f21947a.equals(cVar.f21947a) && (!cVar2.f21954h || cVar.f21954h)) {
                if (cVar2.f21951e.isAssignableFrom(cVar.f21951e)) {
                    arrayList.set(size, cVar);
                    return;
                } else if (cVar2.compareTo(cVar) < 0) {
                    arrayList.set(size, cVar);
                    return;
                } else {
                    return;
                }
            }
        }
        arrayList.add(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:988:0x0890, code lost:
        if (r3 == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:994:0x08aa, code lost:
        if (n4.n.f22013b != false) goto L263;
     */
    /* JADX WARN: Removed duplicated region for block: B:1005:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:1015:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:1018:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:999:0x08bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static n4.i b(java.lang.Class r45, java.lang.reflect.Type r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 2886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.i.b(java.lang.Class, java.lang.reflect.Type, boolean):n4.i");
    }

    public static HashMap c(Class cls) {
        Class superclass = cls.getSuperclass();
        HashMap hashMap = null;
        if (superclass == null) {
            return null;
        }
        while (true) {
            Class cls2 = superclass;
            Class cls3 = cls;
            cls = cls2;
            if (cls == null || cls == Object.class) {
                break;
            }
            if (cls3.getGenericSuperclass() instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) cls3.getGenericSuperclass()).getActualTypeArguments();
                TypeVariable[] typeParameters = cls.getTypeParameters();
                for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    if (hashMap.containsKey(actualTypeArguments[i10])) {
                        hashMap.put(typeParameters[i10], (Type) hashMap.get(actualTypeArguments[i10]));
                    } else {
                        hashMap.put(typeParameters[i10], actualTypeArguments[i10]);
                    }
                }
            }
            superclass = cls.getSuperclass();
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x004f, code lost:
        if ((java.util.Map.class.isAssignableFrom(r2) || java.util.Collection.class.isAssignableFrom(r2) || java.util.concurrent.atomic.AtomicLong.class.equals(r2) || java.util.concurrent.atomic.AtomicInteger.class.equals(r2) || java.util.concurrent.atomic.AtomicBoolean.class.equals(r2)) == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(java.lang.Class r20, java.lang.reflect.Type r21, e4.m r22, java.util.ArrayList r23, java.lang.reflect.Field[] r24) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.i.d(java.lang.Class, java.lang.reflect.Type, e4.m, java.util.ArrayList, java.lang.reflect.Field[]):void");
    }

    public static Class<?> e(Class<?> cls, f4.d dVar) {
        Class<?> builder;
        if (cls != null && cls.getName().equals("org.springframework.security.web.savedrequest.DefaultSavedRequest")) {
            return n.b0("org.springframework.security.web.savedrequest.DefaultSavedRequest$Builder", false);
        }
        if (dVar == null || (builder = dVar.builder()) == Void.class) {
            return null;
        }
        return builder;
    }

    public static Constructor<?> f(Constructor[] constructorArr) {
        boolean z10;
        Constructor constructor = null;
        for (Constructor constructor2 : constructorArr) {
            if (((f4.a) constructor2.getAnnotation(f4.a.class)) != null) {
                if (constructor != null) {
                    throw new e4.d("multi-JSONCreator");
                }
                constructor = constructor2;
            }
        }
        if (constructor != null) {
            return constructor;
        }
        for (Constructor constructor3 : constructorArr) {
            Annotation[][] M = n.M(constructor3);
            if (M.length != 0) {
                int length = M.length;
                int i10 = 0;
                while (true) {
                    z10 = true;
                    if (i10 >= length) {
                        break;
                    }
                    Annotation[] annotationArr = M[i10];
                    int length2 = annotationArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            z10 = false;
                            break;
                        } else if (annotationArr[i11] instanceof f4.b) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (!z10) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
                if (!z10) {
                    continue;
                } else if (constructor != null) {
                    throw new e4.d("multi-JSONCreator");
                } else {
                    constructor = constructor3;
                }
            }
        }
        return constructor;
    }

    public static Constructor<?> g(Class<?> cls, Constructor<?>[] constructorArr) {
        Constructor<?> constructor = null;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        int length = constructorArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Constructor<?> constructor2 = constructorArr[i10];
            if (constructor2.getParameterTypes().length == 0) {
                constructor = constructor2;
                break;
            }
            i10++;
        }
        if (constructor == null && cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
            for (Constructor<?> constructor3 : constructorArr) {
                Class<?>[] parameterTypes = constructor3.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].equals(cls.getDeclaringClass())) {
                    return constructor3;
                }
            }
            return constructor;
        }
        return constructor;
    }
}
