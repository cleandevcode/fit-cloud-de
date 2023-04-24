package mf;

import androidx.fragment.app.h1;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import mf.t;
import mf.y;

/* loaded from: classes.dex */
public final class k<T> extends t<T> {

    /* renamed from: d */
    public static final a f20615d = new a();

    /* renamed from: a */
    public final yb.y f20616a;

    /* renamed from: b */
    public final b<?>[] f20617b;

    /* renamed from: c */
    public final y.a f20618c;

    /* loaded from: classes.dex */
    public class a implements t.a {
        public static void b(Class cls, Type type) {
            Class<?> c10 = l0.c(type);
            if (cls.isAssignableFrom(c10)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + c10.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // mf.t.a
        public final t<?> a(Type type, Set<? extends Annotation> set, h0 h0Var) {
            boolean z10;
            yb.y jVar;
            Field[] declaredFields;
            boolean z11;
            p pVar;
            Type type2 = type;
            if (!(type2 instanceof Class) && !(type2 instanceof ParameterizedType)) {
                return null;
            }
            Class<?> c10 = l0.c(type);
            if (c10.isInterface() || c10.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (nf.b.e(c10)) {
                b(List.class, type2);
                b(Set.class, type2);
                b(Map.class, type2);
                b(Collection.class, type2);
                String str = "Platform " + c10;
                if (type2 instanceof ParameterizedType) {
                    str = str + " in " + type2;
                }
                throw new IllegalArgumentException(a.b.b(str, " requires explicit JsonAdapter to be registered"));
            } else if (!c10.isAnonymousClass()) {
                if (!c10.isLocalClass()) {
                    if (c10.getEnclosingClass() != null && !Modifier.isStatic(c10.getModifiers())) {
                        throw new IllegalArgumentException(k.f.a(c10, android.support.v4.media.d.a("Cannot serialize non-static nested class ")));
                    }
                    if (!Modifier.isAbstract(c10.getModifiers())) {
                        Class<? extends Annotation> cls = nf.b.f22342d;
                        if (cls != null && c10.isAnnotationPresent(cls)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            try {
                                try {
                                    Constructor<?> declaredConstructor = c10.getDeclaredConstructor(new Class[0]);
                                    declaredConstructor.setAccessible(true);
                                    jVar = new g(declaredConstructor, c10);
                                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                    try {
                                        try {
                                            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                                            declaredMethod.setAccessible(true);
                                            int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                                            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                                            declaredMethod2.setAccessible(true);
                                            jVar = new i(declaredMethod2, c10, intValue);
                                        } catch (IllegalAccessException unused2) {
                                            throw new AssertionError();
                                        } catch (NoSuchMethodException unused3) {
                                            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                                            declaredMethod3.setAccessible(true);
                                            jVar = new j(c10, declaredMethod3);
                                        } catch (InvocationTargetException e10) {
                                            nf.b.j(e10);
                                            throw null;
                                        }
                                    } catch (Exception unused4) {
                                        throw new IllegalArgumentException(k.f.a(c10, android.support.v4.media.d.a("cannot construct instances of ")));
                                    }
                                } catch (IllegalAccessException unused5) {
                                    throw new AssertionError();
                                }
                            } catch (NoSuchMethodException unused6) {
                                Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                                Field declaredField = cls2.getDeclaredField("theUnsafe");
                                declaredField.setAccessible(true);
                                jVar = new h(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), c10);
                            }
                            TreeMap treeMap = new TreeMap();
                            while (type2 != Object.class) {
                                Class<?> c11 = l0.c(type2);
                                boolean e11 = nf.b.e(c11);
                                for (Field field : c11.getDeclaredFields()) {
                                    int modifiers = field.getModifiers();
                                    if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !e11)) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11 && ((pVar = (p) field.getAnnotation(p.class)) == null || !pVar.ignore())) {
                                        Type i10 = nf.b.i(type2, c11, field.getGenericType(), new LinkedHashSet());
                                        Set<? extends Annotation> f10 = nf.b.f(field.getAnnotations());
                                        String name = field.getName();
                                        t<T> c12 = h0Var.c(i10, f10, name);
                                        field.setAccessible(true);
                                        if (pVar != null) {
                                            String name2 = pVar.name();
                                            if (!"\u0000".equals(name2)) {
                                                name = name2;
                                            }
                                        }
                                        b bVar = (b) treeMap.put(name, new b(name, field, c12));
                                        if (bVar != null) {
                                            StringBuilder a10 = android.support.v4.media.d.a("Conflicting fields:\n    ");
                                            a10.append(bVar.f20620b);
                                            a10.append("\n    ");
                                            a10.append(field);
                                            throw new IllegalArgumentException(a10.toString());
                                        }
                                    }
                                }
                                Class<?> c13 = l0.c(type2);
                                type2 = nf.b.i(type2, c13, c13.getGenericSuperclass(), new LinkedHashSet());
                            }
                            return (t<T>) new k(jVar, treeMap).d();
                        }
                        throw new IllegalArgumentException(h1.a(c10, android.support.v4.media.d.a("Cannot serialize Kotlin type "), ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact."));
                    }
                    throw new IllegalArgumentException(k.f.a(c10, android.support.v4.media.d.a("Cannot serialize abstract class ")));
                }
                throw new IllegalArgumentException(k.f.a(c10, android.support.v4.media.d.a("Cannot serialize local class ")));
            } else {
                throw new IllegalArgumentException(k.f.a(c10, android.support.v4.media.d.a("Cannot serialize anonymous class ")));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b<T> {

        /* renamed from: a */
        public final String f20619a;

        /* renamed from: b */
        public final Field f20620b;

        /* renamed from: c */
        public final t<T> f20621c;

        public b(String str, Field field, t<T> tVar) {
            this.f20619a = str;
            this.f20620b = field;
            this.f20621c = tVar;
        }
    }

    public k(yb.y yVar, TreeMap treeMap) {
        this.f20616a = yVar;
        this.f20617b = (b[]) treeMap.values().toArray(new b[treeMap.size()]);
        this.f20618c = y.a.a((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // mf.t
    public final T b(y yVar) {
        try {
            T t10 = (T) this.f20616a.y();
            try {
                yVar.b();
                while (yVar.q()) {
                    int L = yVar.L(this.f20618c);
                    if (L == -1) {
                        yVar.R();
                        yVar.W();
                    } else {
                        b<?> bVar = this.f20617b[L];
                        bVar.f20620b.set(t10, bVar.f20621c.b(yVar));
                    }
                }
                yVar.j();
                return t10;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            nf.b.j(e11);
            throw null;
        }
    }

    @Override // mf.t
    public final void f(e0 e0Var, T t10) {
        b<?>[] bVarArr;
        try {
            e0Var.b();
            for (b<?> bVar : this.f20617b) {
                e0Var.s(bVar.f20619a);
                bVar.f20621c.f(e0Var, bVar.f20620b.get(t10));
            }
            e0Var.k();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("JsonAdapter(");
        a10.append(this.f20616a);
        a10.append(")");
        return a10.toString();
    }
}
