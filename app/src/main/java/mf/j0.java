package mf;

import androidx.fragment.app.h1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mf.t;
import mf.y;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a */
    public static final b f20595a = new b();

    /* renamed from: b */
    public static final c f20596b = new c();

    /* renamed from: c */
    public static final d f20597c = new d();

    /* renamed from: d */
    public static final e f20598d = new e();

    /* renamed from: e */
    public static final f f20599e = new f();

    /* renamed from: f */
    public static final g f20600f = new g();

    /* renamed from: g */
    public static final h f20601g = new h();

    /* renamed from: h */
    public static final i f20602h = new i();

    /* renamed from: i */
    public static final j f20603i = new j();

    /* renamed from: j */
    public static final a f20604j = new a();

    /* loaded from: classes.dex */
    public class a extends t<String> {
        @Override // mf.t
        public final String b(y yVar) {
            return yVar.E();
        }

        @Override // mf.t
        public final void f(e0 e0Var, String str) {
            e0Var.I(str);
        }

        public final String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* loaded from: classes.dex */
    public class b implements t.a {
        @Override // mf.t.a
        public final t<?> a(Type type, Set<? extends Annotation> set, h0 h0Var) {
            t<?> tVar;
            t kVar;
            Constructor<?> declaredConstructor;
            Object[] objArr;
            Class<?> cls = null;
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return j0.f20596b;
            }
            if (type == Byte.TYPE) {
                return j0.f20597c;
            }
            if (type == Character.TYPE) {
                return j0.f20598d;
            }
            if (type == Double.TYPE) {
                return j0.f20599e;
            }
            if (type == Float.TYPE) {
                return j0.f20600f;
            }
            if (type == Integer.TYPE) {
                return j0.f20601g;
            }
            if (type == Long.TYPE) {
                return j0.f20602h;
            }
            if (type == Short.TYPE) {
                return j0.f20603i;
            }
            if (type == Boolean.class) {
                kVar = j0.f20596b;
            } else if (type == Byte.class) {
                kVar = j0.f20597c;
            } else if (type == Character.class) {
                kVar = j0.f20598d;
            } else if (type == Double.class) {
                kVar = j0.f20599e;
            } else if (type == Float.class) {
                kVar = j0.f20600f;
            } else if (type == Integer.class) {
                kVar = j0.f20601g;
            } else if (type == Long.class) {
                kVar = j0.f20602h;
            } else if (type == Short.class) {
                kVar = j0.f20603i;
            } else if (type == String.class) {
                kVar = j0.f20604j;
            } else if (type == Object.class) {
                kVar = new l(h0Var);
            } else {
                Class<?> c10 = l0.c(type);
                Set<Annotation> set2 = nf.b.f22339a;
                u uVar = (u) c10.getAnnotation(u.class);
                if (uVar != null && uVar.generateAdapter()) {
                    String name = c10.getName();
                    try {
                        try {
                            Class<?> cls2 = Class.forName(name.replace("$", "_") + "JsonAdapter", true, c10.getClassLoader());
                            try {
                                if (type instanceof ParameterizedType) {
                                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                                    try {
                                        declaredConstructor = cls2.getDeclaredConstructor(h0.class, Type[].class);
                                        objArr = new Object[]{h0Var, actualTypeArguments};
                                    } catch (NoSuchMethodException unused) {
                                        declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                                        objArr = new Object[]{actualTypeArguments};
                                    }
                                } else {
                                    try {
                                        declaredConstructor = cls2.getDeclaredConstructor(h0.class);
                                        objArr = new Object[]{h0Var};
                                    } catch (NoSuchMethodException unused2) {
                                        declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                                        objArr = new Object[0];
                                    }
                                }
                                declaredConstructor.setAccessible(true);
                                tVar = ((t) declaredConstructor.newInstance(objArr)).d();
                            } catch (NoSuchMethodException e10) {
                                e = e10;
                                cls = cls2;
                                if (!(type instanceof ParameterizedType) && cls.getTypeParameters().length != 0) {
                                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                                }
                                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e);
                            }
                        } catch (ClassNotFoundException e11) {
                            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e11);
                        } catch (IllegalAccessException e12) {
                            throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e12);
                        } catch (InstantiationException e13) {
                            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e13);
                        } catch (InvocationTargetException e14) {
                            nf.b.j(e14);
                            throw null;
                        }
                    } catch (NoSuchMethodException e15) {
                        e = e15;
                    }
                } else {
                    tVar = null;
                }
                if (tVar != null) {
                    return tVar;
                }
                if (!c10.isEnum()) {
                    return null;
                }
                kVar = new k(c10);
            }
            return kVar.d();
        }
    }

    /* loaded from: classes.dex */
    public class c extends t<Boolean> {
        @Override // mf.t
        public final Boolean b(y yVar) {
            return Boolean.valueOf(yVar.s());
        }

        @Override // mf.t
        public final void f(e0 e0Var, Boolean bool) {
            e0Var.J(bool.booleanValue());
        }

        public final String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* loaded from: classes.dex */
    public class d extends t<Byte> {
        @Override // mf.t
        public final Byte b(y yVar) {
            return Byte.valueOf((byte) j0.a(yVar, "a byte", -128, 255));
        }

        @Override // mf.t
        public final void f(e0 e0Var, Byte b10) {
            e0Var.E(b10.intValue() & 255);
        }

        public final String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* loaded from: classes.dex */
    public class e extends t<Character> {
        @Override // mf.t
        public final Character b(y yVar) {
            String E = yVar.E();
            if (E.length() <= 1) {
                return Character.valueOf(E.charAt(0));
            }
            throw new v(String.format("Expected %s but was %s at path %s", "a char", '\"' + E + '\"', yVar.k()));
        }

        @Override // mf.t
        public final void f(e0 e0Var, Character ch2) {
            e0Var.I(ch2.toString());
        }

        public final String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* loaded from: classes.dex */
    public class f extends t<Double> {
        @Override // mf.t
        public final Double b(y yVar) {
            return Double.valueOf(yVar.v());
        }

        @Override // mf.t
        public final void f(e0 e0Var, Double d10) {
            e0Var.D(d10.doubleValue());
        }

        public final String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* loaded from: classes.dex */
    public class g extends t<Float> {
        @Override // mf.t
        public final Float b(y yVar) {
            float v10 = (float) yVar.v();
            if (!yVar.f20631e && Float.isInfinite(v10)) {
                throw new v("JSON forbids NaN and infinities: " + v10 + " at path " + yVar.k());
            }
            return Float.valueOf(v10);
        }

        @Override // mf.t
        public final void f(e0 e0Var, Float f10) {
            Float f11 = f10;
            f11.getClass();
            e0Var.F(f11);
        }

        public final String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* loaded from: classes.dex */
    public class h extends t<Integer> {
        @Override // mf.t
        public final Integer b(y yVar) {
            return Integer.valueOf(yVar.y());
        }

        @Override // mf.t
        public final void f(e0 e0Var, Integer num) {
            e0Var.E(num.intValue());
        }

        public final String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* loaded from: classes.dex */
    public class i extends t<Long> {
        @Override // mf.t
        public final Long b(y yVar) {
            return Long.valueOf(yVar.C());
        }

        @Override // mf.t
        public final void f(e0 e0Var, Long l10) {
            e0Var.E(l10.longValue());
        }

        public final String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* loaded from: classes.dex */
    public class j extends t<Short> {
        @Override // mf.t
        public final Short b(y yVar) {
            return Short.valueOf((short) j0.a(yVar, "a short", -32768, 32767));
        }

        @Override // mf.t
        public final void f(e0 e0Var, Short sh2) {
            e0Var.E(sh2.intValue());
        }

        public final String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* loaded from: classes.dex */
    public static final class k<T extends Enum<T>> extends t<T> {

        /* renamed from: a */
        public final Class<T> f20605a;

        /* renamed from: b */
        public final String[] f20606b;

        /* renamed from: c */
        public final T[] f20607c;

        /* renamed from: d */
        public final y.a f20608d;

        public k(Class<T> cls) {
            this.f20605a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f20607c = enumConstants;
                this.f20606b = new String[enumConstants.length];
                int i10 = 0;
                while (true) {
                    T[] tArr = this.f20607c;
                    if (i10 < tArr.length) {
                        String name = tArr[i10].name();
                        String[] strArr = this.f20606b;
                        Field field = cls.getField(name);
                        Set<Annotation> set = nf.b.f22339a;
                        p pVar = (p) field.getAnnotation(p.class);
                        if (pVar != null) {
                            String name2 = pVar.name();
                            if (!"\u0000".equals(name2)) {
                                name = name2;
                            }
                        }
                        strArr[i10] = name;
                        i10++;
                    } else {
                        this.f20608d = y.a.a(this.f20606b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError(k.f.a(cls, android.support.v4.media.d.a("Missing field in ")), e10);
            }
        }

        @Override // mf.t
        public final Object b(y yVar) {
            int P = yVar.P(this.f20608d);
            if (P != -1) {
                return this.f20607c[P];
            }
            String k10 = yVar.k();
            String E = yVar.E();
            StringBuilder a10 = android.support.v4.media.d.a("Expected one of ");
            a10.append(Arrays.asList(this.f20606b));
            a10.append(" but was ");
            a10.append(E);
            a10.append(" at path ");
            a10.append(k10);
            throw new v(a10.toString());
        }

        @Override // mf.t
        public final void f(e0 e0Var, Object obj) {
            e0Var.I(this.f20606b[((Enum) obj).ordinal()]);
        }

        public final String toString() {
            return h1.a(this.f20605a, android.support.v4.media.d.a("JsonAdapter("), ")");
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends t<Object> {

        /* renamed from: a */
        public final h0 f20609a;

        /* renamed from: b */
        public final t<List> f20610b;

        /* renamed from: c */
        public final t<Map> f20611c;

        /* renamed from: d */
        public final t<String> f20612d;

        /* renamed from: e */
        public final t<Double> f20613e;

        /* renamed from: f */
        public final t<Boolean> f20614f;

        public l(h0 h0Var) {
            this.f20609a = h0Var;
            this.f20610b = h0Var.a(List.class);
            this.f20611c = h0Var.a(Map.class);
            this.f20612d = h0Var.a(String.class);
            this.f20613e = h0Var.a(Double.class);
            this.f20614f = h0Var.a(Boolean.class);
        }

        @Override // mf.t
        public final Object b(y yVar) {
            int b10 = s.c0.b(yVar.F());
            if (b10 != 0) {
                if (b10 != 2) {
                    if (b10 != 5) {
                        if (b10 != 6) {
                            if (b10 != 7) {
                                if (b10 == 8) {
                                    yVar.D();
                                    return null;
                                }
                                StringBuilder a10 = android.support.v4.media.d.a("Expected a value but was ");
                                a10.append(z.a(yVar.F()));
                                a10.append(" at path ");
                                a10.append(yVar.k());
                                throw new IllegalStateException(a10.toString());
                            }
                            return this.f20614f.b(yVar);
                        }
                        return this.f20613e.b(yVar);
                    }
                    return this.f20612d.b(yVar);
                }
                return this.f20611c.b(yVar);
            }
            return this.f20610b.b(yVar);
        }

        @Override // mf.t
        public final void f(e0 e0Var, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                e0Var.b();
                e0Var.k();
                return;
            }
            h0 h0Var = this.f20609a;
            if (Map.class.isAssignableFrom(cls)) {
                cls = Map.class;
            } else if (Collection.class.isAssignableFrom(cls)) {
                cls = Collection.class;
            }
            h0Var.c(cls, nf.b.f22339a, null).f(e0Var, obj);
        }

        public final String toString() {
            return "JsonAdapter(Object)";
        }
    }

    public static int a(y yVar, String str, int i10, int i11) {
        int y10 = yVar.y();
        if (y10 < i10 || y10 > i11) {
            throw new v(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(y10), yVar.k()));
        }
        return y10;
    }
}
