package i4;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a */
    public final n4.c f16452a;

    /* renamed from: b */
    public final Class<?> f16453b;

    public l(Class<?> cls, n4.c cVar) {
        this.f16453b = cls;
        this.f16452a = cVar;
    }

    public static void a(Field field, Method method, Object obj, Object obj2) {
        boolean z10;
        if (field != null && !Modifier.isFinal(field.getModifiers())) {
            field.set(obj, obj2);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        try {
            Class<?> cls = obj.getClass();
            cls.getDeclaredMethod("set" + method.getName().substring(3), method.getReturnType()).invoke(obj, obj2);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    public int b() {
        return 0;
    }

    public abstract void c(h4.a aVar, Object obj, Type type, HashMap hashMap);

    public void d(Object obj, Object obj2) {
        String str;
        if (obj2 == null && this.f16452a.f21951e.isPrimitive()) {
            return;
        }
        n4.c cVar = this.f16452a;
        if (cVar.f21951e == String.class && (str = cVar.f21963q) != null && str.equals("trim")) {
            obj2 = ((String) obj2).trim();
        }
        try {
            n4.c cVar2 = this.f16452a;
            Method method = cVar2.f21948b;
            if (method != null) {
                if (cVar2.f21954h) {
                    Class<?> cls = cVar2.f21951e;
                    if (cls == AtomicInteger.class) {
                        AtomicInteger atomicInteger = (AtomicInteger) method.invoke(obj, new Object[0]);
                        if (atomicInteger != null) {
                            atomicInteger.set(((AtomicInteger) obj2).get());
                            return;
                        }
                    } else if (cls == AtomicLong.class) {
                        AtomicLong atomicLong = (AtomicLong) method.invoke(obj, new Object[0]);
                        if (atomicLong != null) {
                            atomicLong.set(((AtomicLong) obj2).get());
                            return;
                        }
                    } else if (cls == AtomicBoolean.class) {
                        AtomicBoolean atomicBoolean = (AtomicBoolean) method.invoke(obj, new Object[0]);
                        if (atomicBoolean != null) {
                            atomicBoolean.set(((AtomicBoolean) obj2).get());
                            return;
                        }
                    } else if (Map.class.isAssignableFrom(method.getReturnType())) {
                        try {
                            Map map = (Map) method.invoke(obj, new Object[0]);
                            if (map != null) {
                                if (map == Collections.emptyMap()) {
                                    return;
                                }
                                if (map.isEmpty() && ((Map) obj2).isEmpty()) {
                                    return;
                                }
                                String name = map.getClass().getName();
                                if (!name.equals("java.util.ImmutableCollections$Map1") && !name.equals("java.util.ImmutableCollections$MapN") && !name.startsWith("java.util.Collections$Unmodifiable")) {
                                    if (map.getClass().getName().equals("ul.t")) {
                                        a(this.f16452a.f21949c, method, obj, obj2);
                                        return;
                                    } else {
                                        map.putAll((Map) obj2);
                                        return;
                                    }
                                }
                                return;
                            } else if (obj2 == null) {
                                return;
                            }
                        } catch (InvocationTargetException unused) {
                            a(this.f16452a.f21949c, method, obj, obj2);
                            return;
                        }
                    } else {
                        try {
                            Collection collection = (Collection) method.invoke(obj, new Object[0]);
                            if (collection != null && obj2 != null) {
                                String name2 = collection.getClass().getName();
                                if (collection != Collections.emptySet() && collection != Collections.emptyList() && name2 != "java.util.ImmutableCollections$ListN" && name2 != "java.util.ImmutableCollections$List12" && !name2.startsWith("java.util.Collections$Unmodifiable")) {
                                    if (!collection.isEmpty()) {
                                        collection.clear();
                                    } else if (((Collection) obj2).isEmpty()) {
                                        return;
                                    }
                                    if (!name2.equals("ul.s") && !name2.equals("ul.u")) {
                                        collection.addAll((Collection) obj2);
                                        return;
                                    }
                                    a(this.f16452a.f21949c, method, obj, obj2);
                                    return;
                                }
                                return;
                            } else if (collection != null || obj2 == null) {
                                return;
                            }
                        } catch (InvocationTargetException unused2) {
                            a(this.f16452a.f21949c, method, obj, obj2);
                            return;
                        }
                    }
                    a(this.f16452a.f21949c, method, obj, obj2);
                    return;
                }
                method.invoke(obj, obj2);
                return;
            }
            Field field = cVar2.f21949c;
            if (cVar2.f21954h) {
                Class<?> cls2 = cVar2.f21951e;
                if (cls2 == AtomicInteger.class) {
                    AtomicInteger atomicInteger2 = (AtomicInteger) field.get(obj);
                    if (atomicInteger2 != null) {
                        atomicInteger2.set(((AtomicInteger) obj2).get());
                    }
                } else if (cls2 == AtomicLong.class) {
                    AtomicLong atomicLong2 = (AtomicLong) field.get(obj);
                    if (atomicLong2 != null) {
                        atomicLong2.set(((AtomicLong) obj2).get());
                    }
                } else if (cls2 == AtomicBoolean.class) {
                    AtomicBoolean atomicBoolean2 = (AtomicBoolean) field.get(obj);
                    if (atomicBoolean2 != null) {
                        atomicBoolean2.set(((AtomicBoolean) obj2).get());
                    }
                } else if (Map.class.isAssignableFrom(cls2)) {
                    Map map2 = (Map) field.get(obj);
                    if (map2 != null && map2 != Collections.emptyMap() && !map2.getClass().getName().startsWith("java.util.Collections$Unmodifiable")) {
                        map2.putAll((Map) obj2);
                    }
                } else {
                    Collection collection2 = (Collection) field.get(obj);
                    if (collection2 != null && obj2 != null && collection2 != Collections.emptySet() && collection2 != Collections.emptyList() && !collection2.getClass().getName().startsWith("java.util.Collections$Unmodifiable")) {
                        collection2.clear();
                        collection2.addAll((Collection) obj2);
                    }
                }
            } else if (field != null) {
                field.set(obj, obj2);
            }
        } catch (Exception e10) {
            StringBuilder a10 = android.support.v4.media.d.a("set property error, ");
            a10.append(this.f16453b.getName());
            a10.append("#");
            a10.append(this.f16452a.f21947a);
            throw new e4.d(a10.toString(), e10);
        }
    }

    public final void e(Object obj, String str) {
        d(obj, str);
    }
}
