package androidx.lifecycle;

import androidx.lifecycle.k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c */
    public static c f2695c = new c();

    /* renamed from: a */
    public final HashMap f2696a = new HashMap();

    /* renamed from: b */
    public final HashMap f2697b = new HashMap();

    @Deprecated
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final HashMap f2698a = new HashMap();

        /* renamed from: b */
        public final Map<b, k.b> f2699b;

        public a(HashMap hashMap) {
            this.f2699b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                k.b bVar = (k.b) entry.getValue();
                List list = (List) this.f2698a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2698a.put(bVar, list);
                }
                list.add((b) entry.getKey());
            }
        }

        public static void a(List<b> list, u uVar, k.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar2 = list.get(size);
                    bVar2.getClass();
                    try {
                        int i10 = bVar2.f2700a;
                        if (i10 == 0) {
                            bVar2.f2701b.invoke(obj, new Object[0]);
                        } else if (i10 == 1) {
                            bVar2.f2701b.invoke(obj, uVar);
                        } else if (i10 == 2) {
                            bVar2.f2701b.invoke(obj, uVar, bVar);
                        }
                    } catch (IllegalAccessException e10) {
                        throw new RuntimeException(e10);
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException("Failed to call observer method", e11.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f2700a;

        /* renamed from: b */
        public final Method f2701b;

        public b(Method method, int i10) {
            this.f2700a = i10;
            this.f2701b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f2700a == bVar.f2700a && this.f2701b.getName().equals(bVar.f2701b.getName());
            }
            return false;
        }

        public final int hashCode() {
            return this.f2701b.getName().hashCode() + (this.f2700a * 31);
        }
    }

    public static void c(HashMap hashMap, b bVar, k.b bVar2, Class cls) {
        k.b bVar3 = (k.b) hashMap.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f2701b;
            StringBuilder a10 = android.support.v4.media.d.a("Method ");
            a10.append(method.getName());
            a10.append(" in ");
            a10.append(cls.getName());
            a10.append(" already declared with different @OnLifecycleEvent value: previous value ");
            a10.append(bVar3);
            a10.append(", new value ");
            a10.append(bVar2);
            throw new IllegalArgumentException(a10.toString());
        } else if (bVar3 == null) {
            hashMap.put(bVar, bVar2);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f2699b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, k.b> entry : b(cls2).f2699b.entrySet()) {
                c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            c0 c0Var = (c0) method.getAnnotation(c0.class);
            if (c0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (parameterTypes[0].isAssignableFrom(u.class)) {
                        i10 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i10 = 0;
                }
                k.b value = c0Var.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(k.b.class)) {
                        if (value == k.b.ON_ANY) {
                            i10 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new b(method, i10), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f2696a.put(cls, aVar);
        this.f2697b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public final a b(Class<?> cls) {
        a aVar = (a) this.f2696a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }
}
