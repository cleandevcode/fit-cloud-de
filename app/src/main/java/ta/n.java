package ta;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import qa.b;
import qa.x;
import qa.y;
import sa.q;
import va.a;

/* loaded from: classes.dex */
public final class n implements y {

    /* renamed from: a */
    public final sa.e f27890a;

    /* renamed from: b */
    public final qa.c f27891b;

    /* renamed from: c */
    public final sa.l f27892c;

    /* renamed from: d */
    public final e f27893d;

    /* renamed from: e */
    public final List<qa.t> f27894e;

    /* loaded from: classes.dex */
    public static abstract class a<T, A> extends x<T> {

        /* renamed from: a */
        public final Map<String, b> f27895a;

        public a(LinkedHashMap linkedHashMap) {
            this.f27895a = linkedHashMap;
        }

        @Override // qa.x
        public final T a(ya.a aVar) {
            if (aVar.h0() == 9) {
                aVar.X();
                return null;
            }
            A c10 = c();
            try {
                aVar.b();
                while (aVar.D()) {
                    b bVar = this.f27895a.get(aVar.R());
                    if (bVar != null && bVar.f27899d) {
                        e(c10, aVar, bVar);
                    }
                    aVar.t0();
                }
                aVar.q();
                return d(c10);
            } catch (IllegalAccessException e10) {
                a.AbstractC0528a abstractC0528a = va.a.f29185a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            } catch (IllegalStateException e11) {
                throw new qa.s(e11);
            }
        }

        @Override // qa.x
        public final void b(ya.b bVar, T t10) {
            if (t10 == null) {
                bVar.y();
                return;
            }
            bVar.h();
            try {
                for (b bVar2 : this.f27895a.values()) {
                    bVar2.c(bVar, t10);
                }
                bVar.q();
            } catch (IllegalAccessException e10) {
                a.AbstractC0528a abstractC0528a = va.a.f29185a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            }
        }

        public abstract A c();

        public abstract T d(A a10);

        public abstract void e(A a10, ya.a aVar, b bVar);
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a */
        public final String f27896a;

        /* renamed from: b */
        public final String f27897b;

        /* renamed from: c */
        public final boolean f27898c;

        /* renamed from: d */
        public final boolean f27899d;

        public b(String str, String str2, boolean z10, boolean z11) {
            this.f27896a = str;
            this.f27897b = str2;
            this.f27898c = z10;
            this.f27899d = z11;
        }

        public abstract void a(ya.a aVar, int i10, Object[] objArr);

        public abstract void b(ya.a aVar, Object obj);

        public abstract void c(ya.b bVar, Object obj);
    }

    /* loaded from: classes.dex */
    public static final class c<T> extends a<T, T> {

        /* renamed from: b */
        public final sa.p<T> f27900b;

        public c(sa.p pVar, LinkedHashMap linkedHashMap) {
            super(linkedHashMap);
            this.f27900b = pVar;
        }

        @Override // ta.n.a
        public final T c() {
            return this.f27900b.a();
        }

        @Override // ta.n.a
        public final T d(T t10) {
            return t10;
        }

        @Override // ta.n.a
        public final void e(T t10, ya.a aVar, b bVar) {
            bVar.b(aVar, t10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d<T> extends a<T, Object[]> {

        /* renamed from: e */
        public static final HashMap f27901e;

        /* renamed from: b */
        public final Constructor<T> f27902b;

        /* renamed from: c */
        public final Object[] f27903c;

        /* renamed from: d */
        public final HashMap f27904d;

        static {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            f27901e = hashMap;
        }

        public d(Class cls, LinkedHashMap linkedHashMap, boolean z10) {
            super(linkedHashMap);
            this.f27904d = new HashMap();
            a.AbstractC0528a abstractC0528a = va.a.f29185a;
            Constructor<T> b10 = abstractC0528a.b(cls);
            this.f27902b = b10;
            if (z10) {
                n.b(null, b10);
            } else {
                va.a.d(b10);
            }
            String[] c10 = abstractC0528a.c(cls);
            for (int i10 = 0; i10 < c10.length; i10++) {
                this.f27904d.put(c10[i10], Integer.valueOf(i10));
            }
            Class<?>[] parameterTypes = this.f27902b.getParameterTypes();
            this.f27903c = new Object[parameterTypes.length];
            for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                this.f27903c[i11] = f27901e.get(parameterTypes[i11]);
            }
        }

        @Override // ta.n.a
        public final Object[] c() {
            return (Object[]) this.f27903c.clone();
        }

        @Override // ta.n.a
        public final Object d(Object[] objArr) {
            Object[] objArr2 = objArr;
            try {
                return this.f27902b.newInstance(objArr2);
            } catch (IllegalAccessException e10) {
                a.AbstractC0528a abstractC0528a = va.a.f29185a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            } catch (IllegalArgumentException e11) {
                e = e11;
                StringBuilder a10 = android.support.v4.media.d.a("Failed to invoke constructor '");
                a10.append(va.a.b(this.f27902b));
                a10.append("' with args ");
                a10.append(Arrays.toString(objArr2));
                throw new RuntimeException(a10.toString(), e);
            } catch (InstantiationException e12) {
                e = e12;
                StringBuilder a102 = android.support.v4.media.d.a("Failed to invoke constructor '");
                a102.append(va.a.b(this.f27902b));
                a102.append("' with args ");
                a102.append(Arrays.toString(objArr2));
                throw new RuntimeException(a102.toString(), e);
            } catch (InvocationTargetException e13) {
                StringBuilder a11 = android.support.v4.media.d.a("Failed to invoke constructor '");
                a11.append(va.a.b(this.f27902b));
                a11.append("' with args ");
                a11.append(Arrays.toString(objArr2));
                throw new RuntimeException(a11.toString(), e13.getCause());
            }
        }

        @Override // ta.n.a
        public final void e(Object[] objArr, ya.a aVar, b bVar) {
            Object[] objArr2 = objArr;
            Integer num = (Integer) this.f27904d.get(bVar.f27897b);
            if (num != null) {
                bVar.a(aVar, num.intValue(), objArr2);
                return;
            }
            StringBuilder a10 = android.support.v4.media.d.a("Could not find the index in the constructor '");
            a10.append(va.a.b(this.f27902b));
            a10.append("' for field with name '");
            throw new IllegalStateException(androidx.activity.e.b(a10, bVar.f27897b, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."));
        }
    }

    public n(sa.e eVar, sa.l lVar, e eVar2, List list) {
        b.a aVar = qa.b.f24647a;
        this.f27890a = eVar;
        this.f27891b = aVar;
        this.f27892c = lVar;
        this.f27893d = eVar2;
        this.f27894e = list;
    }

    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (q.a.f26800a.a(obj, accessibleObject)) {
            return;
        }
        throw new qa.m(a.b.b(va.a.c(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
    }

    @Override // qa.y
    public final <T> x<T> a(qa.h hVar, xa.a<T> aVar) {
        boolean z10;
        Class<? super T> cls = aVar.f30456a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        int a10 = sa.q.a(cls, this.f27894e);
        if (a10 != 4) {
            if (a10 == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (va.a.f29185a.d(cls)) {
                return new d(cls, c(hVar, aVar, cls, z10, true), z10);
            }
            return new c(this.f27890a.b(aVar), c(hVar, aVar, cls, z10, false));
        }
        throw new qa.m("ReflectionAccessFilter does not permit using reflection for " + cls + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x021a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [va.a$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.LinkedHashMap c(qa.h r37, xa.a r38, java.lang.Class r39, boolean r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.n.c(qa.h, xa.a, java.lang.Class, boolean, boolean):java.util.LinkedHashMap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x006b, code lost:
        if (r1 == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.reflect.Field r9, boolean r10) {
        /*
            r8 = this;
            sa.l r0 = r8.f27892c
            java.lang.Class r1 = r9.getType()
            boolean r2 = r0.b(r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L17
            boolean r0 = r0.c(r1, r10)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            if (r0 != 0) goto La5
            sa.l r0 = r8.f27892c
            int r1 = r0.f26764b
            int r2 = r9.getModifiers()
            r1 = r1 & r2
            if (r1 == 0) goto L27
            goto L9f
        L27:
            double r1 = r0.f26763a
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L46
            java.lang.Class<ra.c> r1 = ra.c.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            ra.c r1 = (ra.c) r1
            java.lang.Class<ra.d> r2 = ra.d.class
            java.lang.annotation.Annotation r2 = r9.getAnnotation(r2)
            ra.d r2 = (ra.d) r2
            boolean r1 = r0.e(r1, r2)
            if (r1 != 0) goto L46
            goto L9f
        L46:
            boolean r1 = r9.isSynthetic()
            if (r1 == 0) goto L4d
            goto L9f
        L4d:
            boolean r1 = r0.f26765c
            if (r1 != 0) goto L6e
            java.lang.Class r1 = r9.getType()
            boolean r2 = r1.isMemberClass()
            if (r2 == 0) goto L6a
            int r1 = r1.getModifiers()
            r1 = r1 & 8
            if (r1 == 0) goto L65
            r1 = 1
            goto L66
        L65:
            r1 = 0
        L66:
            if (r1 != 0) goto L6a
            r1 = 1
            goto L6b
        L6a:
            r1 = 0
        L6b:
            if (r1 == 0) goto L6e
            goto L9f
        L6e:
            java.lang.Class r1 = r9.getType()
            boolean r1 = sa.l.d(r1)
            if (r1 == 0) goto L79
            goto L9f
        L79:
            if (r10 == 0) goto L7e
            java.util.List<qa.a> r10 = r0.f26766d
            goto L80
        L7e:
            java.util.List<qa.a> r10 = r0.f26767e
        L80:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto La1
            java.util.Objects.requireNonNull(r9)
            java.util.Iterator r9 = r10.iterator()
        L8d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto La1
            java.lang.Object r10 = r9.next()
            qa.a r10 = (qa.a) r10
            boolean r10 = r10.b()
            if (r10 == 0) goto L8d
        L9f:
            r9 = 1
            goto La2
        La1:
            r9 = 0
        La2:
            if (r9 != 0) goto La5
            r3 = 1
        La5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.n.d(java.lang.reflect.Field, boolean):boolean");
    }
}
