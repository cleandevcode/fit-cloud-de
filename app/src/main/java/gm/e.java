package gm;

import bi.m0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e implements mm.b<Object>, d {

    /* renamed from: b */
    public static final Map<Class<? extends tl.a<?>>, Integer> f15497b;

    /* renamed from: c */
    public static final LinkedHashMap f15498c;

    /* renamed from: a */
    public final Class<?> f15499a;

    static {
        int i10 = 0;
        List q10 = h7.a.q(fm.a.class, fm.l.class, fm.p.class, fm.q.class, fm.r.class, fm.s.class, fm.t.class, fm.u.class, fm.v.class, fm.w.class, fm.b.class, fm.c.class, fm.d.class, fm.e.class, fm.f.class, fm.g.class, fm.h.class, fm.i.class, fm.j.class, fm.k.class, fm.m.class, fm.n.class, fm.o.class);
        ArrayList arrayList = new ArrayList(ul.l.B(q10, 10));
        for (Object obj : q10) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                arrayList.add(new tl.f((Class) obj, Integer.valueOf(i10)));
                i10 = i11;
            } else {
                h7.a.z();
                throw null;
            }
        }
        f15497b = ul.z.F(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        l.e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            l.e(str, "kotlinName");
            sb2.append(om.l.w0(str, str));
            sb2.append("CompanionObject");
            String sb3 = sb2.toString();
            hashMap3.put(sb3, str + ".Companion");
        }
        for (Map.Entry<Class<? extends tl.a<?>>, Integer> entry : f15497b.entrySet()) {
            int intValue = entry.getValue().intValue();
            String name = entry.getKey().getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ih.v.j(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, om.l.w0(str2, str2));
        }
        f15498c = linkedHashMap;
    }

    public e(Class<?> cls) {
        l.f(cls, "jClass");
        this.f15499a = cls;
    }

    @Override // mm.b
    public final String a() {
        String str;
        Method enclosingMethod;
        Constructor<?> enclosingConstructor;
        String str2;
        Class<?> cls = this.f15499a;
        l.f(cls, "jClass");
        String str3 = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                if (cls.getEnclosingMethod() != null) {
                    str2 = enclosingMethod.getName() + '$';
                } else {
                    if (cls.getEnclosingConstructor() != null) {
                        str2 = enclosingConstructor.getName() + '$';
                    } else {
                        return om.l.u0(simpleName, '$');
                    }
                }
                return om.l.v0(simpleName, str2);
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) f15498c.get(componentType.getName())) != null) {
                    str3 = a.b.b(str, "Array");
                }
                if (str3 == null) {
                    return "Array";
                }
            } else {
                String str4 = (String) f15498c.get(cls.getName());
                if (str4 == null) {
                    return cls.getSimpleName();
                }
                return str4;
            }
        }
        return str3;
    }

    @Override // gm.d
    public final Class<?> b() {
        return this.f15499a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && l.a(m0.q(this), m0.q((mm.b) obj));
    }

    public final int hashCode() {
        return m0.q(this).hashCode();
    }

    public final String toString() {
        return this.f15499a.toString() + " (Kotlin reflection is not available)";
    }
}
