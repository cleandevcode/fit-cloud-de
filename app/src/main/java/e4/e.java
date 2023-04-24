package e4;

import java.io.NotActiveException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class e extends e4.a implements Map<String, Object>, Cloneable, Serializable, InvocationHandler {

    /* renamed from: i */
    public final Map<String, Object> f13350i;

    /* loaded from: classes.dex */
    public static class a extends ObjectInputStream {

        /* renamed from: a */
        public static Field[] f13351a;

        /* renamed from: b */
        public static volatile boolean f13352b;

        public a(ObjectInputStream objectInputStream) {
            super(objectInputStream);
            int i10 = 0;
            while (true) {
                try {
                    Field[] fieldArr = f13351a;
                    if (i10 >= fieldArr.length) {
                        return;
                    }
                    Field field = fieldArr[i10];
                    field.set(this, field.get(objectInputStream));
                    i10++;
                } catch (IllegalAccessException unused) {
                    f13352b = true;
                    return;
                }
            }
        }

        public static void a() {
            if (f13351a != null || f13352b) {
                return;
            }
            try {
                Field[] declaredFields = ObjectInputStream.class.getDeclaredFields();
                String[] strArr = {"bin", "passHandle", "handles", "curContext"};
                Field[] fieldArr = new Field[4];
                for (int i10 = 0; i10 < 4; i10++) {
                    Field H = n4.n.H(ObjectInputStream.class, strArr[i10], declaredFields);
                    H.setAccessible(true);
                    fieldArr[i10] = H;
                }
                f13351a = fieldArr;
            } catch (Throwable unused) {
                f13352b = true;
            }
        }

        @Override // java.io.ObjectInputStream
        public final void readStreamHeader() {
        }

        @Override // java.io.ObjectInputStream
        public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
            String name = objectStreamClass.getName();
            if (name.length() > 2) {
                int lastIndexOf = name.lastIndexOf(91);
                if (lastIndexOf != -1) {
                    name = name.substring(lastIndexOf + 1);
                }
                if (name.length() > 2 && name.charAt(0) == 'L' && name.charAt(name.length() - 1) == ';') {
                    name = name.substring(1, name.length() - 1);
                }
                if (n4.n.B(name) == null) {
                    h4.k.f15845u.a(name, h4.b.SupportAutoType.f15812a, null);
                }
            }
            return super.resolveClass(objectStreamClass);
        }

        @Override // java.io.ObjectInputStream
        public final Class<?> resolveProxyClass(String[] strArr) {
            for (String str : strArr) {
                if (n4.n.B(str) == null) {
                    h4.k kVar = h4.k.f15845u;
                    kVar.getClass();
                    kVar.a(str, e4.a.f13344f, null);
                }
            }
            return super.resolveProxyClass(strArr);
        }
    }

    public e() {
        this(16, false);
    }

    public e(int i10, boolean z10) {
        this.f13350i = z10 ? new LinkedHashMap<>(i10) : new HashMap<>(i10);
    }

    public e(Map<String, Object> map) {
        if (map == null) {
            throw new IllegalArgumentException("map is null.");
        }
        this.f13350i = map;
    }

    public e(boolean z10) {
        this(16, z10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        a.a();
        if (a.f13351a != null && !a.f13352b) {
            try {
                new a(objectInputStream).defaultReadObject();
                return;
            } catch (NotActiveException unused) {
            }
        }
        objectInputStream.defaultReadObject();
        for (Map.Entry<String, Object> entry : this.f13350i.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                h4.k kVar = h4.k.f15845u;
                Class<?> cls = key.getClass();
                if (kVar.b(cls) == null) {
                    kVar.a(cls.getName(), e4.a.f13344f, null);
                }
            }
            Object value = entry.getValue();
            if (value != null) {
                h4.k kVar2 = h4.k.f15845u;
                Class<?> cls2 = value.getClass();
                if (kVar2.b(cls2) == null) {
                    kVar2.a(cls2.getName(), e4.a.f13344f, null);
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f13350i.clear();
    }

    public final Object clone() {
        return new e(this.f13350i instanceof LinkedHashMap ? new LinkedHashMap(this.f13350i) : new HashMap(this.f13350i));
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean containsKey = this.f13350i.containsKey(obj);
        return !containsKey ? ((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) ? this.f13350i.containsKey(obj.toString()) : containsKey : containsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f13350i.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        return this.f13350i.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        Map<String, Object> map;
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            map = this.f13350i;
            obj = ((e) obj).f13350i;
        } else {
            map = this.f13350i;
        }
        return map.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2 = this.f13350i.get(obj);
        return obj2 == null ? ((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) ? this.f13350i.get(obj.toString()) : obj2 : obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f13350i.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String substring;
        StringBuilder sb2;
        String str;
        String substring2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        String str2 = null;
        if (parameterTypes.length == 1) {
            if (method.getName().equals("equals")) {
                return Boolean.valueOf(equals(objArr[0]));
            }
            if (method.getReturnType() == Void.TYPE) {
                f4.b bVar = (f4.b) n4.n.z(f4.b.class, method);
                if (bVar != null && bVar.name().length() != 0) {
                    str = bVar.name();
                } else {
                    str = null;
                }
                if (str == null) {
                    String name = method.getName();
                    if (name.startsWith("set")) {
                        if (name.substring(3).length() != 0) {
                            str = Character.toLowerCase(substring2.charAt(0)) + substring2.substring(1);
                        } else {
                            throw new d("illegal setter");
                        }
                    } else {
                        throw new d("illegal setter");
                    }
                }
                this.f13350i.put(str, objArr[0]);
                return null;
            }
            throw new d("illegal setter");
        } else if (parameterTypes.length == 0) {
            if (method.getReturnType() != Void.TYPE) {
                f4.b bVar2 = (f4.b) n4.n.z(f4.b.class, method);
                if (bVar2 != null && bVar2.name().length() != 0) {
                    str2 = bVar2.name();
                }
                if (str2 == null) {
                    String name2 = method.getName();
                    if (name2.startsWith("get")) {
                        substring = name2.substring(3);
                        if (substring.length() != 0) {
                            sb2 = new StringBuilder();
                        } else {
                            throw new d("illegal getter");
                        }
                    } else if (name2.startsWith("is")) {
                        substring = name2.substring(2);
                        if (substring.length() != 0) {
                            sb2 = new StringBuilder();
                        } else {
                            throw new d("illegal getter");
                        }
                    } else if (name2.startsWith("hashCode")) {
                        return Integer.valueOf(hashCode());
                    } else {
                        if (name2.startsWith("toString")) {
                            return e();
                        }
                        throw new d("illegal getter");
                    }
                    sb2.append(Character.toLowerCase(substring.charAt(0)));
                    sb2.append(substring.substring(1));
                    str2 = sb2.toString();
                }
                return n4.n.d(this.f13350i.get(str2), method.getGenericReturnType(), h4.k.f15845u);
            }
            throw new d("illegal getter");
        } else {
            throw new UnsupportedOperationException(method.toGenericString());
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f13350i.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f13350i.keySet();
    }

    @Override // java.util.Map
    public final Object put(String str, Object obj) {
        return this.f13350i.put(str, obj);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends Object> map) {
        this.f13350i.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f13350i.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f13350i.size();
    }

    public final void v(String str) {
        this.f13350i.put("$ref", str);
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        return this.f13350i.values();
    }

    public final Map<String, Object> w() {
        return this.f13350i;
    }

    public final String x(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }
}
