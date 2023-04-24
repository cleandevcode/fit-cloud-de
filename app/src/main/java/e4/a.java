package e4;

import j4.a1;
import j4.b1;
import j4.d1;
import j4.e1;
import j4.g0;
import j4.i0;
import j4.j0;
import j4.t0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class a implements j, c {

    /* renamed from: g */
    public static int f13345g;

    /* renamed from: a */
    public static TimeZone f13339a = TimeZone.getDefault();

    /* renamed from: b */
    public static Locale f13340b = Locale.getDefault();

    /* renamed from: c */
    public static String f13341c = "@type";

    /* renamed from: d */
    public static final b1[] f13342d = new b1[0];

    /* renamed from: e */
    public static String f13343e = "yyyy-MM-dd HH:mm:ss";

    /* renamed from: h */
    public static final ConcurrentHashMap<Type, Type> f13346h = new ConcurrentHashMap<>(16);

    /* renamed from: f */
    public static int f13344f = (((((((h4.b.AutoCloseSource.f15812a | 0) | h4.b.InternFieldNames.f15812a) | h4.b.UseBigDecimal.f15812a) | h4.b.AllowUnQuotedFieldNames.f15812a) | h4.b.AllowSingleQuotes.f15812a) | h4.b.AllowArbitraryCommas.f15812a) | h4.b.SortFeidFastMatch.f15812a) | h4.b.IgnoreNotMatch.f15812a;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    static {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.a.<clinit>():void");
    }

    public static Type i(Type type) {
        if (type != null) {
            return f13346h.get(type);
        }
        return null;
    }

    public static Object n(String str, h4.k kVar, int i10) {
        if (str == null) {
            return null;
        }
        h4.a aVar = new h4.a(str, kVar, i10);
        Object E = aVar.E(null);
        aVar.C(E);
        aVar.close();
        return E;
    }

    public static Object o(String str, Type type, h4.k kVar, int i10, h4.b... bVarArr) {
        if (str == null || str.length() == 0) {
            return null;
        }
        for (h4.b bVar : bVarArr) {
            i10 |= bVar.f15812a;
        }
        h4.a aVar = new h4.a(str, kVar, i10);
        Object P = aVar.P(null, type);
        aVar.C(P);
        aVar.close();
        return P;
    }

    public static Object p(Object obj) {
        return r(obj, a1.f17315i);
    }

    public static Object r(Object obj, a1 a1Var) {
        Map hashMap;
        String obj2;
        if (obj == null) {
            return null;
        }
        if (obj instanceof a) {
            return obj;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            int size = map.size();
            if (map instanceof LinkedHashMap) {
                hashMap = new LinkedHashMap(size);
            } else if (map instanceof TreeMap) {
                hashMap = new TreeMap();
            } else {
                hashMap = new HashMap(size);
            }
            e eVar = new e(hashMap);
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Pattern pattern = n4.n.f22012a;
                if (key == null) {
                    obj2 = null;
                } else {
                    obj2 = key.toString();
                }
                eVar.f13350i.put(obj2, r(entry.getValue(), a1Var));
            }
            return eVar;
        } else if (obj instanceof Collection) {
            Collection<Object> collection = (Collection) obj;
            b bVar = new b(collection.size());
            for (Object obj3 : collection) {
                bVar.add(r(obj3, a1Var));
            }
            return bVar;
        } else if (obj instanceof g0) {
            return n(t(obj), h4.k.f15845u, f13344f);
        } else {
            Class<?> cls = obj.getClass();
            if (cls.isEnum()) {
                return ((Enum) obj).name();
            }
            if (cls.isArray()) {
                int length = Array.getLength(obj);
                b bVar2 = new b(length);
                for (int i10 = 0; i10 < length; i10++) {
                    bVar2.add(p(Array.get(obj, i10)));
                }
                return bVar2;
            } else if (h4.k.g(cls)) {
                return obj;
            } else {
                t0 e10 = a1Var.e(cls);
                if (e10 instanceof j0) {
                    j0 j0Var = (j0) e10;
                    j0Var.f17420k.getClass();
                    e eVar2 = new e(false);
                    try {
                        for (Map.Entry entry2 : j0Var.m(obj).entrySet()) {
                            eVar2.f13350i.put((String) entry2.getKey(), r(entry2.getValue(), a1Var));
                        }
                        return eVar2;
                    } catch (Exception e11) {
                        throw new d("toJSON error", e11);
                    }
                }
                return n(u(obj, a1Var, new b1[]{null}, f13345g, new e1[0]), h4.k.f15845u, f13344f);
            }
        }
    }

    public static String t(Object obj) {
        return u(obj, a1.f17315i, f13342d, f13345g, new e1[0]);
    }

    public static String u(Object obj, a1 a1Var, b1[] b1VarArr, int i10, e1... e1VarArr) {
        d1 d1Var = new d1(i10, e1VarArr);
        try {
            i0 i0Var = new i0(d1Var, a1Var);
            if (b1VarArr != null) {
                for (b1 b1Var : b1VarArr) {
                    i0Var.b(b1Var);
                }
            }
            i0Var.s(obj);
            return d1Var.toString();
        } finally {
            d1Var.close();
        }
    }

    @Override // e4.c
    public final String e() {
        d1 d1Var = new d1();
        try {
            new i0(d1Var).s(this);
            return d1Var.toString();
        } finally {
            d1Var.close();
        }
    }

    @Override // e4.j
    public final void f(d1 d1Var) {
        d1 d1Var2 = new d1();
        try {
            try {
                new i0(d1Var2).s(this);
                d1Var.b(d1Var2.toString());
            } catch (IOException e10) {
                throw new d(e10.getMessage(), e10);
            }
        } finally {
            d1Var2.close();
        }
    }

    public final String toString() {
        return e();
    }
}
