package h4;

import i4.b0;
import i4.p;
import i4.t;
import i4.y;
import j4.w;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: q */
    public static final String[] f15841q;

    /* renamed from: t */
    public static final long[] f15844t;

    /* renamed from: u */
    public static k f15845u;

    /* renamed from: v */
    public static boolean f15846v;

    /* renamed from: w */
    public static boolean f15847w;

    /* renamed from: x */
    public static boolean f15848x;

    /* renamed from: y */
    public static boolean f15849y;

    /* renamed from: z */
    public static b f15850z;

    /* renamed from: d */
    public boolean f15854d;

    /* renamed from: f */
    public i4.a f15856f;

    /* renamed from: h */
    public long[] f15858h;

    /* renamed from: i */
    public long[] f15859i;

    /* renamed from: j */
    public long[] f15860j;

    /* renamed from: k */
    public final boolean f15861k;

    /* renamed from: l */
    public ArrayList f15862l;

    /* renamed from: m */
    public boolean f15863m;

    /* renamed from: n */
    public final a f15864n;

    /* renamed from: o */
    public static final String[] f15839o = j(n4.g.e("fastjson.parser.deny.internal"));

    /* renamed from: p */
    public static final String[] f15840p = j(n4.g.e("fastjson.parser.deny"));

    /* renamed from: r */
    public static final boolean f15842r = "true".equals(n4.g.e("fastjson.parser.autoTypeSupport"));

    /* renamed from: s */
    public static final boolean f15843s = "true".equals(n4.g.e("fastjson.parser.safeMode"));

    /* renamed from: a */
    public final n4.h<Type, t> f15851a = new n4.h<>();

    /* renamed from: b */
    public final n4.h<Type, n4.h<Type, t>> f15852b = new n4.h<>(16);

    /* renamed from: c */
    public final ConcurrentHashMap f15853c = new ConcurrentHashMap(16, 0.75f, 1);

    /* renamed from: e */
    public final l f15855e = new l(4096, 0);

    /* renamed from: g */
    public boolean f15857g = f15842r;

    /* loaded from: classes.dex */
    public class a implements Callable<Void> {
        public a() {
            k.this = r1;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            k.this.f15851a.b(Timestamp.class, y.f16497c);
            k.this.f15851a.b(Date.class, y.f16496b);
            k.this.f15851a.b(Time.class, b0.f16440a);
            k.this.f15851a.b(java.util.Date.class, w.f17469a);
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements n4.d<Class<?>, Boolean> {
        @Override // n4.d
        public final Boolean apply(Class<?> cls) {
            Class<?> cls2 = cls;
            return Boolean.valueOf(cls2 == Date.class || cls2 == Time.class || cls2 == Timestamp.class);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        Class a();
    }

    static {
        String[] j10 = j(n4.g.e("fastjson.parser.autoTypeAccept"));
        if (j10 == null) {
            j10 = new String[0];
        }
        f15841q = j10;
        f15844t = new long[]{-6976602508726000783L, -6293031534589903644L, 59775428743665658L, 7267793227937552092L};
        f15845u = new k();
        f15846v = false;
        f15847w = false;
        f15848x = false;
        f15849y = false;
        f15850z = new b();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0344 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x028c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k() {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.k.<init>():void");
    }

    public static Method e(Class cls, Class cls2) {
        Method[] methods;
        for (Method method : cls.getMethods()) {
            if (Modifier.isStatic(method.getModifiers()) && method.getReturnType() == cls2 && method.getParameterTypes().length == 1 && ((f4.a) method.getAnnotation(f4.a.class)) != null) {
                return method;
            }
        }
        return null;
    }

    public static Field f(String str, HashMap hashMap) {
        Field field = (Field) hashMap.get(str);
        if (field == null) {
            field = (Field) hashMap.get("_" + str);
        }
        if (field == null) {
            field = (Field) hashMap.get("m_" + str);
        }
        if (field == null) {
            char charAt = str.charAt(0);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                charArray[0] = (char) (charArray[0] - ' ');
                field = (Field) hashMap.get(new String(charArray));
            }
            if (str.length() > 2) {
                char charAt2 = str.charAt(1);
                if (charAt < 'a' || charAt > 'z' || charAt2 < 'A' || charAt2 > 'Z') {
                    return field;
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (str.equalsIgnoreCase((String) entry.getKey())) {
                        return (Field) entry.getValue();
                    }
                }
                return field;
            }
            return field;
        }
        return field;
    }

    public static boolean g(Class<?> cls) {
        Boolean valueOf = Boolean.valueOf(cls.isPrimitive() || cls == Boolean.class || cls == Character.class || cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == String.class || cls == java.util.Date.class || cls.isEnum());
        if (!valueOf.booleanValue()) {
            valueOf = (Boolean) n4.j.a(f15850z, cls);
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    public static void h(Class cls, HashMap hashMap) {
        Field[] declaredFields;
        for (Field field : cls.getDeclaredFields()) {
            String name = field.getName();
            if (!hashMap.containsKey(name)) {
                hashMap.put(name, field);
            }
        }
        if (cls.getSuperclass() == null || cls.getSuperclass() == Object.class) {
            return;
        }
        h(cls.getSuperclass(), hashMap);
    }

    public static String[] j(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.split(",");
    }

    /* JADX WARN: Removed duplicated region for block: B:321:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0381  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class a(java.lang.String r21, int r22, java.lang.Class r23) {
        /*
            Method dump skipped, instructions count: 929
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.k.a(java.lang.String, int, java.lang.Class):java.lang.Class");
    }

    public final t b(Type type) {
        t a10;
        Type i10 = e4.a.i(type);
        if (i10 == null) {
            a10 = this.f15851a.a(type);
        } else {
            n4.h<Type, t> a11 = this.f15852b.a(type);
            if (a11 == null) {
                return null;
            }
            a10 = a11.a(i10);
        }
        return a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:576:0x033a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final i4.t c(java.lang.Class<?> r23, java.lang.reflect.Type r24) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.k.c(java.lang.Class, java.lang.reflect.Type):i4.t");
    }

    public final t d(Type type) {
        t b10 = b(type);
        if (b10 != null) {
            return b10;
        }
        if (type instanceof Class) {
            return c((Class) type, type);
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            return rawType instanceof Class ? c((Class) rawType, type) : d(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return d(upperBounds[0]);
            }
        }
        return p.f16464a;
    }

    public final void i(Type type, t tVar) {
        Type i10 = e4.a.i(type);
        if (i10 == null) {
            this.f15851a.b(type, tVar);
            return;
        }
        n4.h<Type, t> a10 = this.f15852b.a(type);
        if (a10 == null) {
            a10 = new n4.h<>(4);
            this.f15852b.b(type, a10);
        }
        a10.b(i10, tVar);
    }
}
