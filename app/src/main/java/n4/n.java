package n4;

import i4.o;
import i4.t;
import j4.e1;
import j4.z0;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Clob;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class n {
    public static volatile HashMap A;
    public static volatile boolean B;
    public static Class<?> D;
    public static Class L;
    public static a M;
    public static b N;
    public static c O;
    public static d P;
    public static e Q;
    public static f R;
    public static final h S;
    public static Object T;
    public static boolean U;

    /* renamed from: b */
    public static boolean f22013b;

    /* renamed from: c */
    public static boolean f22014c;

    /* renamed from: f */
    public static Method f22017f;

    /* renamed from: h */
    public static Method f22019h;

    /* renamed from: j */
    public static Class<?> f22021j;

    /* renamed from: l */
    public static Class<? extends Annotation> f22023l;

    /* renamed from: s */
    public static volatile Class f22030s;

    /* renamed from: t */
    public static volatile boolean f22031t;

    /* renamed from: u */
    public static volatile boolean f22032u;

    /* renamed from: v */
    public static volatile Constructor f22033v;

    /* renamed from: w */
    public static volatile Method f22034w;

    /* renamed from: x */
    public static volatile Method f22035x;

    /* renamed from: y */
    public static volatile Method f22036y;

    /* renamed from: z */
    public static volatile boolean f22037z;

    /* renamed from: a */
    public static final Pattern f22012a = Pattern.compile("\\.0*$");

    /* renamed from: d */
    public static boolean f22015d = true;

    /* renamed from: e */
    public static boolean f22016e = false;

    /* renamed from: g */
    public static boolean f22018g = false;

    /* renamed from: i */
    public static boolean f22020i = false;

    /* renamed from: k */
    public static boolean f22022k = false;

    /* renamed from: m */
    public static Class<? extends Annotation> f22024m = null;

    /* renamed from: n */
    public static boolean f22025n = false;

    /* renamed from: o */
    public static Class<? extends Annotation> f22026o = null;

    /* renamed from: p */
    public static boolean f22027p = false;

    /* renamed from: q */
    public static Method f22028q = null;

    /* renamed from: r */
    public static boolean f22029r = false;
    public static ConcurrentHashMap C = new ConcurrentHashMap(DfuBaseService.ERROR_REMOTE_TYPE_LEGACY, 0.75f, 1);
    public static boolean E = false;
    public static volatile Class F = null;
    public static volatile Class G = null;
    public static volatile boolean H = false;
    public static volatile Method I = null;
    public static volatile Field J = null;
    public static volatile Object K = null;

    /* loaded from: classes.dex */
    public static class a implements n4.d<Class, Boolean> {
        @Override // n4.d
        public final Boolean apply(Class cls) {
            return Boolean.valueOf(Clob.class.isAssignableFrom(cls));
        }
    }

    /* loaded from: classes.dex */
    public static class b implements n4.d<Object, Object> {
        @Override // n4.d
        public final Object apply(Object obj) {
            long j10;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Date) {
                return (Date) obj;
            }
            if (obj instanceof java.util.Date) {
                return new Date(((java.util.Date) obj).getTime());
            }
            if (obj instanceof Calendar) {
                return new Date(((Calendar) obj).getTimeInMillis());
            }
            if (obj instanceof BigDecimal) {
                j10 = n.d0((BigDecimal) obj);
            } else if (obj instanceof Number) {
                j10 = ((Number) obj).longValue();
            } else {
                j10 = 0;
            }
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                    return null;
                }
                if (n.X(str)) {
                    j10 = Long.parseLong(str);
                } else {
                    h4.h hVar = new h4.h(str);
                    if (hVar.t1(false)) {
                        j10 = hVar.f15824j.getTime().getTime();
                    } else {
                        throw new e4.d(a.b.b("can not cast to Timestamp, value : ", str));
                    }
                }
            }
            if (j10 > 0) {
                return new Date(j10);
            }
            throw new e4.d(g4.g.a("can not cast to Date, value : ", obj));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements n4.d<Object, Object> {
        @Override // n4.d
        public final Object apply(Object obj) {
            long j10;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Time) {
                return (Time) obj;
            }
            if (obj instanceof java.util.Date) {
                return new Time(((java.util.Date) obj).getTime());
            }
            if (obj instanceof Calendar) {
                return new Time(((Calendar) obj).getTimeInMillis());
            }
            if (obj instanceof BigDecimal) {
                j10 = n.d0((BigDecimal) obj);
            } else if (obj instanceof Number) {
                j10 = ((Number) obj).longValue();
            } else {
                j10 = 0;
            }
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() == 0 || "null".equalsIgnoreCase(str)) {
                    return null;
                }
                if (n.X(str)) {
                    j10 = Long.parseLong(str);
                } else if (str.length() == 8 && str.charAt(2) == ':' && str.charAt(5) == ':') {
                    return Time.valueOf(str);
                } else {
                    h4.h hVar = new h4.h(str);
                    if (hVar.t1(false)) {
                        j10 = hVar.f15824j.getTime().getTime();
                    } else {
                        throw new e4.d(a.b.b("can not cast to Timestamp, value : ", str));
                    }
                }
            }
            if (j10 > 0) {
                return new Time(j10);
            }
            throw new e4.d(g4.g.a("can not cast to Date, value : ", obj));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements n4.d<Object, Object> {
        /* JADX WARN: Removed duplicated region for block: B:189:0x01e8  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x01ed  */
        @Override // n4.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object apply(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 534
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: n4.n.d.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static class e {
    }

    /* loaded from: classes.dex */
    public static class f implements n4.d<Map<String, Class<?>>, Void> {
        @Override // n4.d
        public final Void apply(Map<String, Class<?>> map) {
            Map<String, Class<?>> map2 = map;
            Class<?>[] clsArr = {Time.class, Date.class, Timestamp.class};
            for (int i10 = 0; i10 < 3; i10++) {
                Class<?> cls = clsArr[i10];
                if (cls != null) {
                    map2.put(cls.getName(), cls);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends HashMap<Class, String> {
        public g() {
            super(8);
            put(Boolean.TYPE, "Z");
            put(Character.TYPE, "C");
            put(Byte.TYPE, "B");
            put(Short.TYPE, "S");
            put(Integer.TYPE, "I");
            put(Long.TYPE, "J");
            put(Float.TYPE, "F");
            put(Double.TYPE, "D");
        }
    }

    /* loaded from: classes.dex */
    public static class h extends HashSet<String> {
        public h() {
            super(6);
            add("net.sf.cglib.proxy.Factory");
            add("org.springframework.cglib.proxy.Factory");
            add("javassist.util.proxy.ProxyObject");
            add("org.apache.ibatis.javassist.util.proxy.ProxyObject");
            add("org.hibernate.proxy.HibernateProxy");
            add("org.springframework.context.annotation.ConfigurationClassEnhancer$EnhancedConfiguration");
        }
    }

    /* loaded from: classes.dex */
    public static class i implements Comparator<Method> {
        @Override // java.util.Comparator
        public final int compare(Method method, Method method2) {
            Method method3 = method;
            Method method4 = method2;
            int compareTo = method3.getName().compareTo(method4.getName());
            if (compareTo != 0) {
                return compareTo;
            }
            Class<?> returnType = method3.getReturnType();
            Class<?> returnType2 = method4.getReturnType();
            if (!returnType.equals(returnType2)) {
                if (returnType.isAssignableFrom(returnType2)) {
                    return -1;
                }
                if (returnType2.isAssignableFrom(returnType)) {
                    return 1;
                }
            }
            return 0;
        }
    }

    static {
        f22013b = false;
        f22014c = false;
        L = null;
        try {
            f22013b = "true".equals(n4.g.e("fastjson.compatibleWithJavaBean"));
            f22014c = "true".equals(n4.g.e("fastjson.compatibleWithFieldName"));
        } catch (Throwable unused) {
        }
        try {
            L = Class.forName("java.util.Deque");
        } catch (Throwable unused2) {
        }
        M = new a();
        N = new b();
        O = new c();
        P = new d();
        Q = new e();
        R = new f();
        C.put("byte", Byte.TYPE);
        C.put("short", Short.TYPE);
        C.put("int", Integer.TYPE);
        C.put("long", Long.TYPE);
        C.put("float", Float.TYPE);
        C.put("double", Double.TYPE);
        C.put("boolean", Boolean.TYPE);
        C.put("char", Character.TYPE);
        C.put("[byte", byte[].class);
        C.put("[short", short[].class);
        C.put("[int", int[].class);
        C.put("[long", long[].class);
        C.put("[float", float[].class);
        C.put("[double", double[].class);
        C.put("[boolean", boolean[].class);
        C.put("[char", char[].class);
        C.put("[B", byte[].class);
        C.put("[S", short[].class);
        C.put("[I", int[].class);
        C.put("[J", long[].class);
        C.put("[F", float[].class);
        C.put("[D", double[].class);
        C.put("[C", char[].class);
        C.put("[Z", boolean[].class);
        Class[] clsArr = {Object.class, Cloneable.class, b0("java.lang.AutoCloseable", false), Exception.class, RuntimeException.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class, HashMap.class, LinkedHashMap.class, Hashtable.class, TreeMap.class, IdentityHashMap.class, WeakHashMap.class, LinkedHashMap.class, HashSet.class, LinkedHashSet.class, TreeSet.class, ArrayList.class, TimeUnit.class, ConcurrentHashMap.class, AtomicInteger.class, AtomicLong.class, Collections.EMPTY_MAP.getClass(), Boolean.class, Character.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, Number.class, String.class, BigDecimal.class, BigInteger.class, BitSet.class, Calendar.class, java.util.Date.class, Locale.class, UUID.class, SimpleDateFormat.class, e4.e.class, e4.f.class, e4.b.class};
        for (int i10 = 0; i10 < 69; i10++) {
            Class cls = clsArr[i10];
            if (cls != null) {
                C.put(cls.getName(), cls);
            }
        }
        j.a(R, C);
        new g();
        S = new h();
        U = false;
    }

    public static Class<?> A(Type type) {
        Type type2;
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            type2 = ((ParameterizedType) type).getRawType();
        } else if (type instanceof TypeVariable) {
            Type type3 = ((TypeVariable) type).getBounds()[0];
            return type3 instanceof Class ? (Class) type3 : A(type3);
        } else if (!(type instanceof WildcardType)) {
            return Object.class;
        } else {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length != 1) {
                return Object.class;
            }
            type2 = upperBounds[0];
        }
        return A(type2);
    }

    public static Class<?> B(String str) {
        return (Class) C.get(str);
    }

    public static Class<?> C(Type type) {
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                if (upperBounds.length == 1) {
                    type2 = upperBounds[0];
                }
            }
            if (type2 instanceof Class) {
                Class<?> cls = (Class) type2;
                if (Modifier.isPublic(cls.getModifiers())) {
                    return cls;
                }
                throw new e4.d("can not create ASMParser");
            }
            throw new e4.d("can not create ASMParser");
        }
        return Object.class;
    }

    public static Type D(Class<?> cls) {
        return cls.getName().startsWith("java.") ? Object.class : F(G(cls));
    }

    public static Type E(ParameterizedType parameterizedType) {
        Type rawType = parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (rawType == Collection.class) {
            Type type = actualTypeArguments[0];
            if (type instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                if (upperBounds.length > 0) {
                    return upperBounds[0];
                }
                return Object.class;
            }
            return type;
        }
        Class cls = (Class) rawType;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        HashMap hashMap = new HashMap(length);
        for (int i10 = 0; i10 < length; i10++) {
            hashMap.put(typeParameters[i10], actualTypeArguments[i10]);
        }
        Type G2 = G(cls);
        if (G2 instanceof ParameterizedType) {
            Class<?> P2 = P(G2);
            Type[] actualTypeArguments2 = ((ParameterizedType) G2).getActualTypeArguments();
            if (actualTypeArguments2.length > 0) {
                return E(e0(P2, actualTypeArguments2, hashMap));
            }
            return D(P2);
        }
        return D((Class) G2);
    }

    public static Type F(Type type) {
        return type instanceof ParameterizedType ? E((ParameterizedType) type) : type instanceof Class ? D((Class) type) : Object.class;
    }

    public static Type G(Class<?> cls) {
        Type[] genericInterfaces;
        Type type = null;
        for (Type type2 : cls.getGenericInterfaces()) {
            Class<?> P2 = P(type2);
            if (P2 == Collection.class) {
                return type2;
            }
            if (Collection.class.isAssignableFrom(P2)) {
                type = type2;
            }
        }
        return type == null ? cls.getGenericSuperclass() : type;
    }

    public static Field H(Class<?> cls, String str, Field[] fieldArr) {
        char charAt;
        char charAt2;
        for (Field field : fieldArr) {
            String name = field.getName();
            if (str.equals(name)) {
                return field;
            }
            if (str.length() > 2 && (charAt = str.charAt(0)) >= 'a' && charAt <= 'z' && (charAt2 = str.charAt(1)) >= 'A' && charAt2 <= 'Z' && str.equalsIgnoreCase(name)) {
                return field;
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            return null;
        }
        return H(superclass, str, superclass.getDeclaredFields());
    }

    public static ArrayList I(Class cls, LinkedHashMap linkedHashMap, boolean z10) {
        ArrayList arrayList = new ArrayList();
        f4.d dVar = (f4.d) x(cls, f4.d.class);
        String[] orders = dVar != null ? dVar.orders() : null;
        if (orders == null || orders.length <= 0) {
            arrayList.addAll(linkedHashMap.values());
            if (z10) {
                Collections.sort(arrayList);
            }
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
            for (n4.c cVar : linkedHashMap.values()) {
                linkedHashMap2.put(cVar.f21947a, cVar);
            }
            for (String str : orders) {
                n4.c cVar2 = (n4.c) linkedHashMap2.get(str);
                if (cVar2 != null) {
                    arrayList.add(cVar2);
                    linkedHashMap2.remove(str);
                }
            }
            arrayList.addAll(linkedHashMap2.values());
        }
        return arrayList;
    }

    public static Type J(Type type) {
        return (!(type instanceof ParameterizedType) && (type instanceof Class)) ? J(((Class) type).getGenericSuperclass()) : type;
    }

    public static String[] K(Class cls) {
        if (f22033v == null && !f22032u) {
            try {
                f22033v = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getConstructor(Class.class);
            } catch (Throwable unused) {
                f22032u = true;
            }
        }
        if (f22033v == null) {
            return null;
        }
        if (f22034w == null && !f22032u) {
            try {
                f22034w = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getMethod("getConstructors", new Class[0]);
            } catch (Throwable unused2) {
                f22032u = true;
            }
        }
        if (f22035x == null && !f22032u) {
            try {
                f22035x = mm.c.class.getMethod("getParameters", new Class[0]);
            } catch (Throwable unused3) {
                f22032u = true;
            }
        }
        if (f22036y == null && !f22032u) {
            try {
                f22036y = mm.e.class.getMethod("getName", new Class[0]);
            } catch (Throwable unused4) {
                f22032u = true;
            }
        }
        if (f22037z) {
            return null;
        }
        try {
            Iterator it = ((Iterable) f22034w.invoke(f22033v.newInstance(cls), new Object[0])).iterator();
            Object obj = null;
            while (it.hasNext()) {
                Object next = it.next();
                List list = (List) f22035x.invoke(next, new Object[0]);
                if (obj == null || list.size() != 0) {
                    obj = next;
                }
                it.hasNext();
            }
            if (obj == null) {
                return null;
            }
            List list2 = (List) f22035x.invoke(obj, new Object[0]);
            String[] strArr = new String[list2.size()];
            for (int i10 = 0; i10 < list2.size(); i10++) {
                strArr[i10] = (String) f22036y.invoke(list2.get(i10), new Object[0]);
            }
            return strArr;
        } catch (Throwable th2) {
            th2.printStackTrace();
            f22037z = true;
            return null;
        }
    }

    public static Constructor L(Constructor[] constructorArr, String[] strArr) {
        Constructor constructor = null;
        for (Constructor constructor2 : constructorArr) {
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            if ((strArr == null || parameterTypes.length == strArr.length) && ((parameterTypes.length <= 0 || !parameterTypes[parameterTypes.length - 1].getName().equals("kotlin.jvm.internal.DefaultConstructorMarker")) && (constructor == null || constructor.getParameterTypes().length < parameterTypes.length))) {
                constructor = constructor2;
            }
        }
        return constructor;
    }

    public static Annotation[][] M(Constructor constructor) {
        Annotation[][] parameterAnnotations;
        Constructor declaredConstructor;
        Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
        Type i10 = e4.a.i(constructor.getDeclaringClass());
        Constructor constructor2 = null;
        Class cls = i10 instanceof Class ? (Class) i10 : null;
        if (cls != null) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            ArrayList arrayList = new ArrayList(2);
            for (Class<?> enclosingClass = cls.getEnclosingClass(); enclosingClass != null; enclosingClass = enclosingClass.getEnclosingClass()) {
                arrayList.add(enclosingClass);
            }
            int size = arrayList.size();
            Class cls2 = cls;
            while (true) {
                if (cls2 == null || cls2 == Object.class) {
                    break;
                }
                try {
                    if (size != 0) {
                        Class<?>[] clsArr = new Class[parameterTypes.length + size];
                        System.arraycopy(parameterTypes, 0, clsArr, size, parameterTypes.length);
                        for (int i11 = size; i11 > 0; i11--) {
                            int i12 = i11 - 1;
                            clsArr[i12] = (Class) arrayList.get(i12);
                        }
                        declaredConstructor = cls.getDeclaredConstructor(clsArr);
                    } else {
                        declaredConstructor = cls.getDeclaredConstructor(parameterTypes);
                    }
                    constructor2 = declaredConstructor;
                } catch (NoSuchMethodException unused) {
                    size--;
                    cls2 = cls2.getSuperclass();
                }
            }
            if (constructor2 != null && (parameterAnnotations = constructor2.getParameterAnnotations()) != null) {
                return parameterAnnotations;
            }
        }
        return parameterAnnotations2;
    }

    public static Annotation[][] N(Method method) {
        Annotation[][] parameterAnnotations;
        Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
        Type i10 = e4.a.i(method.getDeclaringClass());
        Method method2 = null;
        Class cls = i10 instanceof Class ? (Class) i10 : null;
        if (cls != null) {
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            while (cls != null && cls != Object.class) {
                try {
                    method2 = cls.getDeclaredMethod(name, parameterTypes);
                    break;
                } catch (NoSuchMethodException unused) {
                    cls = cls.getSuperclass();
                }
            }
            if (method2 != null && (parameterAnnotations = method2.getParameterAnnotations()) != null) {
                return parameterAnnotations;
            }
        }
        return parameterAnnotations2;
    }

    public static String O(String str) {
        return Character.toLowerCase(str.charAt(3)) + str.substring(4);
    }

    public static Class<?> P(Type type) {
        Type type2;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            type2 = ((ParameterizedType) type).getRawType();
        } else if (!(type instanceof WildcardType)) {
            throw new e4.d("TODO");
        } else {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length != 1) {
                throw new e4.d("TODO");
            }
            type2 = upperBounds[0];
        }
        return P(type2);
    }

    public static f4.b Q(Class<?> cls, Method method) {
        Method[] methods;
        boolean z10;
        f4.b bVar;
        Method[] methods2;
        boolean z11;
        f4.b bVar2;
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces.length > 0) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> cls2 : interfaces) {
                for (Method method2 : cls2.getMethods()) {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    if (parameterTypes2.length == parameterTypes.length && method2.getName().equals(method.getName())) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= parameterTypes.length) {
                                z11 = true;
                                break;
                            } else if (!parameterTypes2[i10].equals(parameterTypes[i10])) {
                                z11 = false;
                                break;
                            } else {
                                i10++;
                            }
                        }
                        if (z11 && (bVar2 = (f4.b) z(f4.b.class, method2)) != null) {
                            return bVar2;
                        }
                    }
                }
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && Modifier.isAbstract(superclass.getModifiers())) {
            Class<?>[] parameterTypes3 = method.getParameterTypes();
            for (Method method3 : superclass.getMethods()) {
                Class<?>[] parameterTypes4 = method3.getParameterTypes();
                if (parameterTypes4.length == parameterTypes3.length && method3.getName().equals(method.getName())) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= parameterTypes3.length) {
                            z10 = true;
                            break;
                        } else if (!parameterTypes4[i11].equals(parameterTypes3[i11])) {
                            z10 = false;
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (z10 && (bVar = (f4.b) z(f4.b.class, method3)) != null) {
                        return bVar;
                    }
                }
            }
        }
        return null;
    }

    public static int R(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return 0;
        }
        int scale = bigDecimal.scale();
        return (scale < -100 || scale > 100) ? bigDecimal.intValueExact() : bigDecimal.intValue();
    }

    public static boolean S(Method method) {
        if (method == null) {
            return false;
        }
        if (f22026o == null && !f22027p) {
            try {
                f22026o = Class.forName("javax.persistence.ManyToMany");
            } catch (Throwable unused) {
                f22027p = true;
            }
        }
        if (f22026o != null) {
            return method.isAnnotationPresent(f22024m) || method.isAnnotationPresent(f22026o);
        }
        return false;
    }

    public static boolean T(Method method) {
        if (method == null) {
            return false;
        }
        if (f22024m == null && !f22025n) {
            try {
                f22024m = Class.forName("javax.persistence.OneToMany");
            } catch (Throwable unused) {
                f22025n = true;
            }
        }
        Class<? extends Annotation> cls = f22024m;
        return cls != null && method.isAnnotationPresent(cls);
    }

    public static boolean U(Type type) {
        Type genericSuperclass;
        if (type instanceof ParameterizedType) {
            return true;
        }
        return (type instanceof Class) && (genericSuperclass = ((Class) type).getGenericSuperclass()) != Object.class && U(genericSuperclass);
    }

    public static boolean V(String str, Class cls) {
        f4.d dVar = (f4.d) x(cls, f4.d.class);
        if (dVar != null) {
            String[] includes = dVar.includes();
            if (includes.length > 0) {
                for (String str2 : includes) {
                    if (str.equals(str2)) {
                        return false;
                    }
                }
                return true;
            }
            for (String str3 : dVar.ignores()) {
                if (str.equals(str3)) {
                    return true;
                }
            }
        }
        if (cls.getSuperclass() == Object.class || cls.getSuperclass() == null) {
            return false;
        }
        return V(str, cls.getSuperclass());
    }

    public static boolean W(Class cls) {
        if (f22030s == null && !f22031t) {
            try {
                f22030s = Class.forName("tl.e");
            } catch (Throwable unused) {
                f22031t = true;
            }
        }
        return f22030s != null && cls.isAnnotationPresent(f22030s);
    }

    public static boolean X(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '+' || charAt == '-') {
                if (i10 != 0) {
                    return false;
                }
            } else if (charAt < '0' || charAt > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean Y(Class<?> cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (S.contains(cls2.getName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean Z(Method method) {
        if (method == null) {
            return false;
        }
        if (!f22022k) {
            try {
                f22023l = Class.forName("java.beans.Transient");
            } catch (Exception unused) {
            } catch (Throwable th2) {
                f22022k = true;
                throw th2;
            }
            f22022k = true;
        }
        Class<? extends Annotation> cls = f22023l;
        return (cls == null || z(cls, method) == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static z0 a(Class cls, boolean z10) {
        String[] strArr;
        String str;
        String str2;
        int i10;
        ArrayList r10;
        ArrayList arrayList;
        f4.d dVar = (f4.d) x(cls, f4.d.class);
        e4.m mVar = null;
        if (dVar != null) {
            strArr = dVar.orders();
            str = dVar.typeName();
            if (str.length() == 0) {
                str = null;
            }
            e4.m naming = dVar.naming();
            if (naming == e4.m.NeverUseThisValueExceptDefaultValue) {
                naming = null;
            }
            i10 = e1.e(dVar.serialzeFeatures());
            String str3 = null;
            for (Class superclass = cls.getSuperclass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                f4.d dVar2 = (f4.d) x(superclass, f4.d.class);
                if (dVar2 == null) {
                    break;
                }
                str3 = dVar2.typeKey();
                if (str3.length() != 0) {
                    break;
                }
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                f4.d dVar3 = (f4.d) x(cls2, f4.d.class);
                if (dVar3 != null) {
                    str3 = dVar3.typeKey();
                    if (str3.length() != 0) {
                        break;
                    }
                }
            }
            if (str3 == null || str3.length() != 0) {
                mVar = str3;
            }
            e4.m mVar2 = naming;
            str2 = mVar;
            mVar = mVar2;
        } else {
            strArr = null;
            str = null;
            str2 = 0;
            i10 = 0;
        }
        HashMap hashMap = new HashMap();
        h4.k.h(cls, hashMap);
        if (z10) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Class cls3 = cls; cls3 != null; cls3 = cls3.getSuperclass()) {
                q(cls3, mVar, linkedHashMap, cls3.getDeclaredFields());
            }
            r10 = I(cls, linkedHashMap, false);
        } else {
            r10 = r(cls, hashMap, false, mVar);
        }
        n4.c[] cVarArr = new n4.c[r10.size()];
        r10.toArray(cVarArr);
        if (strArr != null && strArr.length != 0) {
            if (z10) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Class cls4 = cls; cls4 != null; cls4 = cls4.getSuperclass()) {
                    q(cls4, mVar, linkedHashMap2, cls4.getDeclaredFields());
                }
                arrayList = I(cls, linkedHashMap2, true);
            } else {
                arrayList = r(cls, hashMap, true, mVar);
            }
        } else {
            arrayList = new ArrayList(r10);
            Collections.sort(arrayList);
        }
        n4.c[] cVarArr2 = new n4.c[arrayList.size()];
        arrayList.toArray(cVarArr2);
        if (Arrays.equals(cVarArr2, cVarArr)) {
            cVarArr2 = cVarArr;
        }
        return new z0(cls, dVar, str, str2, i10, cVarArr, cVarArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a0(java.lang.Class r5) {
        /*
            java.lang.Class r0 = n4.n.G
            r1 = 1
            if (r0 != 0) goto L14
            boolean r0 = n4.n.H
            if (r0 != 0) goto L14
            java.lang.String r0 = "javax.xml.bind.annotation.XmlAccessorType"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L12
            n4.n.G = r0     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            n4.n.H = r1
        L14:
            java.lang.Class r0 = n4.n.G
            r2 = 0
            if (r0 != 0) goto L1a
            return r2
        L1a:
            java.lang.Class r0 = n4.n.G
            java.lang.annotation.Annotation r5 = x(r5, r0)
            if (r5 != 0) goto L23
            return r2
        L23:
            java.lang.reflect.Method r0 = n4.n.I
            if (r0 != 0) goto L3a
            boolean r0 = n4.n.H
            if (r0 != 0) goto L3a
            java.lang.Class r0 = n4.n.G     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "value"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r0 = r0.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L38
            n4.n.I = r0     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            n4.n.H = r1
        L3a:
            java.lang.reflect.Method r0 = n4.n.I
            if (r0 != 0) goto L3f
            return r2
        L3f:
            boolean r0 = n4.n.H
            r3 = 0
            if (r0 != 0) goto L4f
            java.lang.reflect.Method r0 = n4.n.I     // Catch: java.lang.Throwable -> L4d
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r5 = r0.invoke(r5, r4)     // Catch: java.lang.Throwable -> L4d
            goto L50
        L4d:
            n4.n.H = r1
        L4f:
            r5 = r3
        L50:
            if (r5 != 0) goto L53
            return r2
        L53:
            java.lang.Class r0 = n4.n.F
            if (r0 != 0) goto L78
            boolean r0 = n4.n.H
            if (r0 != 0) goto L78
            java.lang.String r0 = "javax.xml.bind.annotation.XmlAccessType"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L76
            n4.n.F = r0     // Catch: java.lang.Throwable -> L76
            java.lang.Class r0 = n4.n.F     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = "FIELD"
            java.lang.reflect.Field r0 = r0.getField(r4)     // Catch: java.lang.Throwable -> L76
            n4.n.J = r0     // Catch: java.lang.Throwable -> L76
            java.lang.reflect.Field r0 = n4.n.J     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L76
            n4.n.K = r0     // Catch: java.lang.Throwable -> L76
            goto L78
        L76:
            n4.n.H = r1
        L78:
            java.lang.Object r0 = n4.n.K
            if (r5 != r0) goto L7d
            goto L7e
        L7d:
            r1 = 0
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.n.a0(java.lang.Class):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T b(java.lang.Object r6, java.lang.Class<T> r7, h4.k r8) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.n.b(java.lang.Object, java.lang.Class, h4.k):java.lang.Object");
    }

    public static Class b0(String str, boolean z10) {
        if (str != null && str.length() != 0) {
            if (str.length() <= 198) {
                Class<?> cls = (Class) C.get(str);
                if (cls != null) {
                    return cls;
                }
                if (str.charAt(0) == '[') {
                    return Array.newInstance(b0(str.substring(1), false), 0).getClass();
                }
                if (str.startsWith("L") && str.endsWith(";")) {
                    return b0(str.substring(1, str.length() - 1), false);
                }
                try {
                    ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                    if (contextClassLoader != null) {
                        cls = contextClassLoader.loadClass(str);
                        if (z10) {
                            C.put(str, cls);
                        }
                        return cls;
                    }
                } catch (Throwable unused) {
                }
                try {
                    cls = Class.forName(str);
                    if (z10) {
                        C.put(str, cls);
                    }
                } catch (Throwable unused2) {
                }
                return cls;
            }
            throw new e4.d(a.b.b("illegal className : ", str));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.Map, e4.e] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, e4.e] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.Map$Entry, T] */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v9, types: [T, java.util.HashMap] */
    public static <T> T c(Object obj, ParameterizedType parameterizedType, h4.k kVar) {
        ?? d10;
        T t10;
        ?? d11;
        Type rawType = parameterizedType.getRawType();
        if (rawType == List.class || rawType == ArrayList.class) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof List) {
                List list = (List) obj;
                ?? r72 = (T) new ArrayList(list.size());
                for (Object obj2 : list) {
                    if (type instanceof Class) {
                        if (obj2 != null && obj2.getClass() == e4.e.class) {
                            d10 = (e4.e) obj2;
                            Class cls = (Class) type;
                            if (cls != Map.class && (cls != Object.class || d10.containsKey(e4.a.f13341c))) {
                                d10 = n(d10, cls, kVar);
                            }
                        } else {
                            d10 = b(obj2, (Class) type, kVar);
                        }
                    } else {
                        d10 = d(obj2, type, kVar);
                    }
                    r72.add(d10);
                }
                return r72;
            }
        }
        if (rawType == Set.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == Collection.class || rawType == List.class || rawType == ArrayList.class) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof Iterable) {
                if (rawType != Set.class && rawType != HashSet.class) {
                    if (rawType == TreeSet.class) {
                        t10 = (T) new TreeSet();
                    } else {
                        t10 = (T) new ArrayList();
                    }
                } else {
                    t10 = (T) new HashSet();
                }
                for (T t11 : (Iterable) obj) {
                    if (type2 instanceof Class) {
                        if (t11 != null && t11.getClass() == e4.e.class) {
                            d11 = (e4.e) t11;
                            Class cls2 = (Class) type2;
                            if (cls2 != Map.class && (cls2 != Object.class || d11.containsKey(e4.a.f13341c))) {
                                d11 = n(d11, cls2, kVar);
                            }
                        } else {
                            d11 = b(t11, (Class) type2, kVar);
                        }
                    } else {
                        d11 = d(t11, type2, kVar);
                    }
                    ((Collection) t10).add(d11);
                }
                return t10;
            }
        }
        if (rawType == Map.class || rawType == HashMap.class) {
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            Type type4 = parameterizedType.getActualTypeArguments()[1];
            if (obj instanceof Map) {
                ?? r73 = (T) new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    r73.put(d(entry.getKey(), type3, kVar), d(entry.getValue(), type4, kVar));
                }
                return r73;
            }
        }
        if ((obj instanceof String) && ((String) obj).length() == 0) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length == 1 && (parameterizedType.getActualTypeArguments()[0] instanceof WildcardType)) {
            return (T) d(obj, rawType, kVar);
        }
        if (rawType == Map.Entry.class && (obj instanceof Map)) {
            Map map = (Map) obj;
            if (map.size() == 1) {
                ?? r62 = (T) ((Map.Entry) map.entrySet().iterator().next());
                Object value = r62.getValue();
                if (actualTypeArguments.length == 2 && (value instanceof Map)) {
                    r62.setValue(d(value, actualTypeArguments[1], kVar));
                }
                return r62;
            }
        }
        if (rawType instanceof Class) {
            if (kVar == null) {
                kVar = h4.k.f15845u;
            }
            t d12 = kVar.d(rawType);
            if (d12 != null) {
                String t12 = e4.a.t(obj);
                return (T) d12.d(new h4.a(t12, new h4.h(t12, e4.a.f13344f), kVar), parameterizedType, null);
            }
        }
        throw new e4.d("can not cast to : " + parameterizedType);
    }

    public static long c0(Number number) {
        return number instanceof BigDecimal ? ((BigDecimal) number).longValueExact() : number.longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T d(Object obj, Type type, h4.k kVar) {
        if (obj == 0) {
            return null;
        }
        if (type instanceof Class) {
            return (T) b(obj, (Class) type, kVar);
        }
        if (type instanceof ParameterizedType) {
            return (T) c(obj, (ParameterizedType) type, kVar);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
        }
        if (type instanceof TypeVariable) {
            return obj;
        }
        throw new e4.d("can not cast to : " + type);
    }

    public static long d0(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return 0L;
        }
        int scale = bigDecimal.scale();
        return (scale < -100 || scale > 100) ? bigDecimal.longValueExact() : bigDecimal.longValue();
    }

    public static BigDecimal e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Float) {
            Float f10 = (Float) obj;
            if (Float.isNaN(f10.floatValue()) || Float.isInfinite(f10.floatValue())) {
                return null;
            }
        } else if (obj instanceof Double) {
            Double d10 = (Double) obj;
            if (Double.isNaN(d10.doubleValue()) || Double.isInfinite(d10.doubleValue())) {
                return null;
            }
        } else if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        } else {
            if (obj instanceof BigInteger) {
                return new BigDecimal((BigInteger) obj);
            }
            if ((obj instanceof Map) && ((Map) obj).size() == 0) {
                return null;
            }
        }
        String obj2 = obj.toString();
        if (obj2.length() == 0 || obj2.equalsIgnoreCase("null")) {
            return null;
        }
        if (obj2.length() <= 65535) {
            return new BigDecimal(obj2);
        }
        throw new e4.d("decimal overflow");
    }

    public static k e0(Class cls, Type[] typeArr, HashMap hashMap) {
        int length = typeArr.length;
        Type[] typeArr2 = new Type[length];
        for (int i10 = 0; i10 < length; i10++) {
            typeArr2[i10] = w(typeArr[i10], hashMap);
        }
        return new k(null, cls, typeArr2);
    }

    public static BigInteger f(Object obj) {
        BigDecimal bigDecimal;
        int scale;
        long longValue;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Float) {
            Float f10 = (Float) obj;
            if (Float.isNaN(f10.floatValue()) || Float.isInfinite(f10.floatValue())) {
                return null;
            }
            longValue = f10.longValue();
        } else if (!(obj instanceof Double)) {
            if (obj instanceof BigInteger) {
                return (BigInteger) obj;
            }
            if (!(obj instanceof BigDecimal) || (scale = (bigDecimal = (BigDecimal) obj).scale()) <= -1000 || scale >= 1000) {
                String obj2 = obj.toString();
                if (obj2.length() == 0 || obj2.equalsIgnoreCase("null")) {
                    return null;
                }
                if (obj2.length() <= 65535) {
                    return new BigInteger(obj2);
                }
                throw new e4.d("decimal overflow");
            }
            return bigDecimal.toBigInteger();
        } else {
            Double d10 = (Double) obj;
            if (Double.isNaN(d10.doubleValue()) || Double.isInfinite(d10.doubleValue())) {
                return null;
            }
            longValue = d10.longValue();
        }
        return BigInteger.valueOf(longValue);
    }

    public static int f0(char c10, char c11) {
        if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9') {
            return -1;
        }
        return (c11 - '0') + ((c10 - '0') * 10);
    }

    public static Boolean g(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        boolean z10 = false;
        if (obj instanceof BigDecimal) {
            if (R((BigDecimal) obj) == 1) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        } else if (obj instanceof Number) {
            if (((Number) obj).intValue() == 1) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        } else {
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                    return null;
                }
                if (!"true".equalsIgnoreCase(str) && !"1".equals(str)) {
                    if (!"false".equalsIgnoreCase(str) && !"0".equals(str)) {
                        if (!"Y".equalsIgnoreCase(str) && !"T".equals(str)) {
                            if ("F".equalsIgnoreCase(str) || "N".equals(str)) {
                                return Boolean.FALSE;
                            }
                        } else {
                            return Boolean.TRUE;
                        }
                    } else {
                        return Boolean.FALSE;
                    }
                } else {
                    return Boolean.TRUE;
                }
            }
            throw new e4.d(g4.g.a("can not cast to boolean, value : ", obj));
        }
    }

    public static void g0(AccessibleObject accessibleObject) {
        if (f22015d && !accessibleObject.isAccessible()) {
            try {
                accessibleObject.setAccessible(true);
            } catch (Throwable unused) {
                f22015d = false;
            }
        }
    }

    public static Byte h(Object obj) {
        byte parseByte;
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            int scale = bigDecimal.scale();
            if (scale >= -100 && scale <= 100) {
                parseByte = bigDecimal.byteValue();
            } else {
                parseByte = bigDecimal.byteValueExact();
            }
        } else if (obj instanceof Number) {
            parseByte = ((Number) obj).byteValue();
        } else if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            parseByte = Byte.parseByte(str);
        } else if (obj instanceof Boolean) {
            return Byte.valueOf(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
        } else {
            throw new e4.d(g4.g.a("can not cast to byte, value : ", obj));
        }
        return Byte.valueOf(parseByte);
    }

    public static Locale h0(String str) {
        String[] split = str.split("_");
        return split.length == 1 ? new Locale(split[0]) : split.length == 2 ? new Locale(split[0], split[1]) : new Locale(split[0], split[1], split[2]);
    }

    public static Character i(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return (Character) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0) {
                return null;
            }
            if (str.length() == 1) {
                return Character.valueOf(str.charAt(0));
            }
            throw new e4.d(g4.g.a("can not cast to char, value : ", obj));
        }
        throw new e4.d(g4.g.a("can not cast to char, value : ", obj));
    }

    public static java.util.Date j(Object obj, String str) {
        long j10;
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.util.Date) {
            return (java.util.Date) obj;
        }
        if (obj instanceof Calendar) {
            return ((Calendar) obj).getTime();
        }
        if (obj instanceof BigDecimal) {
            return new java.util.Date(d0((BigDecimal) obj));
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if ("unixtime".equals(str)) {
                longValue *= 1000;
            }
            return new java.util.Date(longValue);
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            h4.h hVar = new h4.h(str2);
            try {
                if (hVar.t1(false)) {
                    return hVar.f15824j.getTime();
                }
                hVar.close();
                if (str2.startsWith("/Date(") && str2.endsWith(")/")) {
                    str2 = str2.substring(6, str2.length() - 2);
                }
                if (str2.indexOf(45) <= 0 && str2.indexOf(43) <= 0 && str == null) {
                    if (str2.length() == 0) {
                        return null;
                    }
                    j10 = Long.parseLong(str2);
                } else {
                    if (str == null) {
                        int length = str2.length();
                        if (length != e4.a.f13343e.length() && (length != 22 || !e4.a.f13343e.equals("yyyyMMddHHmmssSSSZ"))) {
                            if (length == 10) {
                                str = "yyyy-MM-dd";
                            } else if (length == 19) {
                                str = "yyyy-MM-dd HH:mm:ss";
                            } else if (length == 29 && str2.charAt(26) == ':' && str2.charAt(28) == '0') {
                                str = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
                            } else if (length == 23 && str2.charAt(19) == ',') {
                                str = "yyyy-MM-dd HH:mm:ss,SSS";
                            } else {
                                str = "yyyy-MM-dd HH:mm:ss.SSS";
                            }
                        } else {
                            str = e4.a.f13343e;
                        }
                    }
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, e4.a.f13340b);
                    simpleDateFormat.setTimeZone(e4.a.f13339a);
                    try {
                        return simpleDateFormat.parse(str2);
                    } catch (ParseException unused) {
                        throw new e4.d(a.b.b("can not cast to Date, value : ", str2));
                    }
                }
            } finally {
                hVar.close();
            }
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            Class<?> cls = obj.getClass();
            if ("oracle.sql.TIMESTAMP".equals(cls.getName())) {
                if (f22017f == null && !f22016e) {
                    try {
                        f22017f = cls.getMethod("toJdbc", new Class[0]);
                    } catch (NoSuchMethodException unused2) {
                    } catch (Throwable th2) {
                        f22016e = true;
                        throw th2;
                    }
                    f22016e = true;
                }
                try {
                    return (java.util.Date) f22017f.invoke(obj, new Object[0]);
                } catch (Exception e10) {
                    throw new e4.d("can not cast oracle.sql.TIMESTAMP to Date", e10);
                }
            } else if ("oracle.sql.DATE".equals(cls.getName())) {
                if (f22019h == null && !f22018g) {
                    try {
                        f22019h = cls.getMethod("toJdbc", new Class[0]);
                    } catch (NoSuchMethodException unused3) {
                    } catch (Throwable th3) {
                        f22018g = true;
                        throw th3;
                    }
                    f22018g = true;
                }
                try {
                    return (java.util.Date) f22019h.invoke(obj, new Object[0]);
                } catch (Exception e11) {
                    throw new e4.d("can not cast oracle.sql.DATE to Date", e11);
                }
            } else {
                throw new e4.d(g4.g.a("can not cast to Date, value : ", obj));
            }
        }
        return new java.util.Date(j10);
    }

    public static Double k(Object obj) {
        double d10;
        double parseDouble;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            parseDouble = ((Number) obj).doubleValue();
        } else if (obj instanceof String) {
            String obj2 = obj.toString();
            if (obj2.length() == 0 || "null".equals(obj2) || "NULL".equals(obj2)) {
                return null;
            }
            if (obj2.indexOf(44) != -1) {
                obj2 = obj2.replaceAll(",", "");
            }
            parseDouble = Double.parseDouble(obj2);
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                d10 = 1.0d;
            } else {
                d10 = 0.0d;
            }
            return Double.valueOf(d10);
        } else {
            throw new e4.d(g4.g.a("can not cast to double, value : ", obj));
        }
        return Double.valueOf(parseDouble);
    }

    public static Float l(Object obj) {
        float f10;
        float parseFloat;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            parseFloat = ((Number) obj).floatValue();
        } else if (obj instanceof String) {
            String obj2 = obj.toString();
            if (obj2.length() == 0 || "null".equals(obj2) || "NULL".equals(obj2)) {
                return null;
            }
            if (obj2.indexOf(44) != -1) {
                obj2 = obj2.replaceAll(",", "");
            }
            parseFloat = Float.parseFloat(obj2);
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            return Float.valueOf(f10);
        } else {
            throw new e4.d(g4.g.a("can not cast to float, value : ", obj));
        }
        return Float.valueOf(parseFloat);
    }

    public static Integer m(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof BigDecimal) {
            return Integer.valueOf(R((BigDecimal) obj));
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            if (str.indexOf(44) != -1) {
                str = str.replaceAll(",", "");
            }
            Matcher matcher = f22012a.matcher(str);
            if (matcher.find()) {
                str = matcher.replaceAll("");
            }
            return Integer.valueOf(Integer.parseInt(str));
        } else if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.size() == 2 && map.containsKey("andIncrement") && map.containsKey("andDecrement")) {
                    Iterator it = map.values().iterator();
                    it.next();
                    return m(it.next());
                }
            }
            throw new e4.d(g4.g.a("can not cast to int, value : ", obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T n(Map<String, Object> map, Class<T> cls, h4.k kVar) {
        e4.e eVar;
        int i10 = 0;
        try {
            if (cls == StackTraceElement.class) {
                String str = (String) map.get("className");
                String str2 = (String) map.get("methodName");
                String str3 = (String) map.get("fileName");
                Number number = (Number) map.get("lineNumber");
                if (number != null) {
                    if (number instanceof BigDecimal) {
                        i10 = ((BigDecimal) number).intValueExact();
                    } else {
                        i10 = number.intValue();
                    }
                }
                return (T) new StackTraceElement(str, str2, str3, i10);
            }
            Object obj = map.get(e4.a.f13341c);
            o oVar = null;
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (kVar == null) {
                    kVar = h4.k.f15845u;
                }
                kVar.getClass();
                Class a10 = kVar.a(str4, e4.a.f13344f, null);
                if (a10 != null) {
                    if (!a10.equals(cls)) {
                        return (T) n(map, a10, kVar);
                    }
                } else {
                    throw new ClassNotFoundException(str4 + " not found");
                }
            }
            if (cls.isInterface()) {
                if (map instanceof e4.e) {
                    eVar = (e4.e) map;
                } else {
                    eVar = new e4.e(map);
                }
                if (kVar == null) {
                    kVar = h4.k.f15845u;
                }
                if (kVar.b(cls) != null) {
                    return (T) e4.a.o(e4.a.t(eVar), cls, h4.k.f15845u, e4.a.f13344f, new h4.b[0]);
                }
                return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, eVar);
            }
            if (cls == Locale.class) {
                Object obj2 = map.get("language");
                Object obj3 = map.get("country");
                if (obj2 instanceof String) {
                    String str5 = (String) obj2;
                    if (obj3 instanceof String) {
                        return (T) new Locale(str5, (String) obj3);
                    }
                    if (obj3 == null) {
                        return (T) new Locale(str5);
                    }
                }
            }
            if (cls == String.class && (map instanceof e4.e)) {
                return (T) map.toString();
            }
            if (cls == e4.a.class && (map instanceof e4.e)) {
                return map;
            }
            if (cls == LinkedHashMap.class && (map instanceof e4.e)) {
                T t10 = (T) ((e4.e) map).f13350i;
                if (t10 instanceof LinkedHashMap) {
                    return t10;
                }
            }
            if (cls.isInstance(map)) {
                return map;
            }
            if (cls == e4.e.class) {
                return (T) new e4.e(map);
            }
            if (kVar == null) {
                kVar = h4.k.f15845u;
            }
            t d10 = kVar.d(cls);
            if (d10 instanceof o) {
                oVar = (o) d10;
            }
            if (oVar != null) {
                return (T) oVar.e(map, kVar);
            }
            throw new e4.d("can not get javaBeanDeserializer. " + cls.getName());
        } catch (Exception e10) {
            throw new e4.d(e10.getMessage(), e10);
        }
    }

    public static Long o(Object obj) {
        long j10;
        Calendar calendar = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            return Long.valueOf(d0((BigDecimal) obj));
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            if (str.indexOf(44) != -1) {
                str = str.replaceAll(",", "");
            }
            try {
                return Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                h4.h hVar = new h4.h(str);
                if (hVar.t1(false)) {
                    calendar = hVar.f15824j;
                }
                hVar.close();
                if (calendar != null) {
                    return Long.valueOf(calendar.getTimeInMillis());
                }
            }
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.size() == 2 && map.containsKey("andIncrement") && map.containsKey("andDecrement")) {
                Iterator it = map.values().iterator();
                it.next();
                return o(it.next());
            }
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                j10 = 1;
            } else {
                j10 = 0;
            }
            return Long.valueOf(j10);
        }
        throw new e4.d(g4.g.a("can not cast to long, value : ", obj));
    }

    public static Short p(Object obj) {
        short parseShort;
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            int scale = bigDecimal.scale();
            if (scale >= -100 && scale <= 100) {
                parseShort = bigDecimal.shortValue();
            } else {
                parseShort = bigDecimal.shortValueExact();
            }
        } else if (obj instanceof Number) {
            parseShort = ((Number) obj).shortValue();
        } else if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            parseShort = Short.parseShort(str);
        } else if (obj instanceof Boolean) {
            return Short.valueOf(((Boolean) obj).booleanValue() ? (short) 1 : (short) 0);
        } else {
            throw new e4.d(g4.g.a("can not cast to short, value : ", obj));
        }
        return Short.valueOf(parseShort);
    }

    public static void q(Class cls, e4.m mVar, LinkedHashMap linkedHashMap, Field[] fieldArr) {
        String str;
        int i10;
        int i11;
        int i12;
        for (Field field : fieldArr) {
            if (!Modifier.isStatic(field.getModifiers())) {
                f4.b bVar = (f4.b) y(f4.b.class, field);
                String name = field.getName();
                if (bVar == null) {
                    str = null;
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                } else if (bVar.serialize()) {
                    int ordinal = bVar.ordinal();
                    int e10 = e1.e(bVar.serialzeFeatures());
                    int a10 = h4.b.a(bVar.parseFeatures());
                    if (bVar.name().length() != 0) {
                        name = bVar.name();
                    }
                    str = bVar.label().length() != 0 ? bVar.label() : null;
                    i11 = e10;
                    i12 = a10;
                    i10 = ordinal;
                }
                if (mVar != null) {
                    name = mVar.a(name);
                }
                String str2 = name;
                if (!linkedHashMap.containsKey(str2)) {
                    linkedHashMap.put(str2, new n4.c(str2, null, field, cls, i10, i11, i12, null, bVar, str));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:332:0x0099, code lost:
        if (r10.getName().equals("groovy.lang.MetaClass") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x012c, code lost:
        if (r1 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0485, code lost:
        if (r11.containsKey(r0) != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x04a3, code lost:
        if (r10 == null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x04c0, code lost:
        if (r10 == null) goto L227;
     */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x04cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList r(java.lang.Class r34, java.util.HashMap r35, boolean r36, e4.m r37) {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.n.r(java.lang.Class, java.util.HashMap, boolean, e4.m):java.util.ArrayList");
    }

    public static String s(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (str.length() > 1 && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    public static long t(String str) {
        long j10 = -3750763034362895579L;
        for (int i10 = 0; i10 < str.length(); i10++) {
            j10 = (j10 ^ str.charAt(i10)) * 1099511628211L;
        }
        return j10;
    }

    public static long u(String str) {
        long j10 = -3750763034362895579L;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '_' && charAt != '-') {
                if (charAt >= 'A' && charAt <= 'Z') {
                    charAt = (char) (charAt + ' ');
                }
                j10 = (j10 ^ charAt) * 1099511628211L;
            }
        }
        return j10;
    }

    public static long v(String str) {
        long j10 = -3750763034362895579L;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= 'A' && charAt <= 'Z') {
                charAt = (char) (charAt + ' ');
            }
            j10 = (j10 ^ charAt) * 1099511628211L;
        }
        return j10;
    }

    public static Type w(Type type, HashMap hashMap) {
        return type instanceof TypeVariable ? (Type) hashMap.get(type) : type instanceof ParameterizedType ? e0(P(type), ((ParameterizedType) type).getActualTypeArguments(), hashMap) : type instanceof GenericArrayType ? new n4.e(w(((GenericArrayType) type).getGenericComponentType(), hashMap)) : type;
    }

    public static <A extends Annotation> A x(Class<?> cls, Class<A> cls2) {
        A a10 = (A) cls.getAnnotation(cls2);
        Type i10 = e4.a.i(cls);
        Class cls3 = i10 instanceof Class ? (Class) i10 : null;
        if (cls3 != null) {
            A a11 = (A) cls3.getAnnotation(cls2);
            Annotation[] annotations = cls3.getAnnotations();
            if (a11 == null && annotations.length > 0) {
                for (Annotation annotation : annotations) {
                    a11 = (A) annotation.annotationType().getAnnotation(cls2);
                    if (a11 != null) {
                        break;
                    }
                }
            }
            if (a11 != null) {
                return a11;
            }
        }
        Annotation[] annotations2 = cls.getAnnotations();
        if (a10 == null && annotations2.length > 0) {
            for (Annotation annotation2 : annotations2) {
                a10 = (A) annotation2.annotationType().getAnnotation(cls2);
                if (a10 != null) {
                    break;
                }
            }
        }
        return a10;
    }

    public static Annotation y(Class cls, Field field) {
        Annotation annotation;
        Annotation annotation2 = field.getAnnotation(cls);
        Type i10 = e4.a.i(field.getDeclaringClass());
        Field field2 = null;
        Class cls2 = i10 instanceof Class ? (Class) i10 : null;
        if (cls2 != null) {
            String name = field.getName();
            while (cls2 != null && cls2 != Object.class) {
                try {
                    field2 = cls2.getDeclaredField(name);
                    break;
                } catch (NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                }
            }
            if (field2 != null && (annotation = field2.getAnnotation(cls)) != null) {
                return annotation;
            }
        }
        return annotation2;
    }

    public static Annotation z(Class cls, Method method) {
        Annotation annotation;
        Annotation annotation2 = method.getAnnotation(cls);
        Type i10 = e4.a.i(method.getDeclaringClass());
        Method method2 = null;
        Class cls2 = i10 instanceof Class ? (Class) i10 : null;
        if (cls2 != null) {
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            while (cls2 != null && cls2 != Object.class) {
                try {
                    method2 = cls2.getDeclaredMethod(name, parameterTypes);
                    break;
                } catch (NoSuchMethodException unused) {
                    cls2 = cls2.getSuperclass();
                }
            }
            if (method2 != null && (annotation = method2.getAnnotation(cls)) != null) {
                return annotation;
            }
        }
        return annotation2;
    }
}
