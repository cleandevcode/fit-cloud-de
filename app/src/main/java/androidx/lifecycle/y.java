package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a */
    public static HashMap f2808a = new HashMap();

    /* renamed from: b */
    public static HashMap f2809b = new HashMap();

    public static h a(Constructor<? extends h> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    public static int c(Class<?> cls) {
        Constructor<?> constructor;
        boolean z10;
        boolean z11;
        HashMap hashMap;
        boolean z12;
        String str;
        Integer num = (Integer) f2808a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            List list = null;
            try {
                Package r42 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r42 != null) {
                    str = r42.getName();
                } else {
                    str = "";
                }
                if (!str.isEmpty()) {
                    canonicalName = canonicalName.substring(str.length() + 1);
                }
                String b10 = b(canonicalName);
                if (!str.isEmpty()) {
                    b10 = str + "." + b10;
                }
                constructor = Class.forName(b10).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            if (constructor != null) {
                hashMap = f2809b;
                list = Collections.singletonList(constructor);
            } else {
                c cVar = c.f2695c;
                Boolean bool = (Boolean) cVar.f2697b.get(cls);
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                if (((c0) declaredMethods[i11].getAnnotation(c0.class)) != null) {
                                    cVar.a(cls, declaredMethods);
                                    z10 = true;
                                    break;
                                }
                                i11++;
                            } else {
                                cVar.f2697b.put(cls, Boolean.FALSE);
                                z10 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!z10) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && t.class.isAssignableFrom(superclass)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (c(superclass) != 1) {
                            list = new ArrayList((Collection) f2809b.get(superclass));
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            Class<?> cls2 = interfaces[i12];
                            if (cls2 != null && t.class.isAssignableFrom(cls2)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                if (c(cls2) == 1) {
                                    break;
                                }
                                if (list == null) {
                                    list = new ArrayList();
                                }
                                list.addAll((Collection) f2809b.get(cls2));
                            }
                            i12++;
                        } else if (list != null) {
                            hashMap = f2809b;
                        }
                    }
                }
            }
            hashMap.put(cls, list);
            i10 = 2;
        }
        f2808a.put(cls, Integer.valueOf(i10));
        return i10;
    }
}
