package mf;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import mf.t;

/* loaded from: classes.dex */
public final class a implements t.a {

    /* renamed from: a */
    public final List<b> f20486a;

    /* renamed from: b */
    public final List<b> f20487b;

    /* renamed from: mf.a$a */
    /* loaded from: classes.dex */
    public class C0372a extends t<Object> {

        /* renamed from: a */
        public final /* synthetic */ b f20488a;

        /* renamed from: b */
        public final /* synthetic */ t f20489b;

        /* renamed from: c */
        public final /* synthetic */ b f20490c;

        /* renamed from: d */
        public final /* synthetic */ Set f20491d;

        /* renamed from: e */
        public final /* synthetic */ Type f20492e;

        public C0372a(b bVar, t tVar, h0 h0Var, b bVar2, Set set, Type type) {
            this.f20488a = bVar;
            this.f20489b = tVar;
            this.f20490c = bVar2;
            this.f20491d = set;
            this.f20492e = type;
        }

        @Override // mf.t
        public final Object b(y yVar) {
            b bVar = this.f20490c;
            if (bVar == null) {
                return this.f20489b.b(yVar);
            }
            if (!bVar.f20499g && yVar.F() == 9) {
                yVar.D();
                return null;
            }
            try {
                return this.f20490c.b(yVar);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new v(cause + " at " + yVar.k(), cause);
            }
        }

        @Override // mf.t
        public final void f(e0 e0Var, Object obj) {
            b bVar = this.f20488a;
            if (bVar == null) {
                this.f20489b.f(e0Var, obj);
            } else if (!bVar.f20499g && obj == null) {
                e0Var.v();
            } else {
                try {
                    bVar.d(e0Var, obj);
                } catch (InvocationTargetException e10) {
                    Throwable cause = e10.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    throw new v(cause + " at " + e0Var.q(), cause);
                }
            }
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("JsonAdapter");
            a10.append(this.f20491d);
            a10.append("(");
            a10.append(this.f20492e);
            a10.append(")");
            return a10.toString();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a */
        public final Type f20493a;

        /* renamed from: b */
        public final Set<? extends Annotation> f20494b;

        /* renamed from: c */
        public final Object f20495c;

        /* renamed from: d */
        public final Method f20496d;

        /* renamed from: e */
        public final int f20497e;

        /* renamed from: f */
        public final t<?>[] f20498f;

        /* renamed from: g */
        public final boolean f20499g;

        public b(Type type, Set<? extends Annotation> set, Object obj, Method method, int i10, int i11, boolean z10) {
            this.f20493a = nf.b.a(type);
            this.f20494b = set;
            this.f20495c = obj;
            this.f20496d = method;
            this.f20497e = i11;
            this.f20498f = new t[i10 - i11];
            this.f20499g = z10;
        }

        public void a(h0 h0Var, t.a aVar) {
            t<?> c10;
            if (this.f20498f.length > 0) {
                Type[] genericParameterTypes = this.f20496d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f20496d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i10 = this.f20497e; i10 < length; i10++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i10]).getActualTypeArguments()[0];
                    Set<? extends Annotation> f10 = nf.b.f(parameterAnnotations[i10]);
                    t<?>[] tVarArr = this.f20498f;
                    int i11 = i10 - this.f20497e;
                    if (l0.b(this.f20493a, type) && this.f20494b.equals(f10)) {
                        c10 = h0Var.d(aVar, type, f10);
                    } else {
                        c10 = h0Var.c(type, f10, null);
                    }
                    tVarArr[i11] = c10;
                }
            }
        }

        public Object b(y yVar) {
            throw new AssertionError();
        }

        public final Object c(Object obj) {
            t<?>[] tVarArr = this.f20498f;
            Object[] objArr = new Object[tVarArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(tVarArr, 0, objArr, 1, tVarArr.length);
            try {
                return this.f20496d.invoke(this.f20495c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public void d(e0 e0Var, Object obj) {
            throw new AssertionError();
        }
    }

    public a(ArrayList arrayList, ArrayList arrayList2) {
        this.f20486a = arrayList;
        this.f20487b = arrayList2;
    }

    public static b b(List<b> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = list.get(i10);
            if (l0.b(bVar.f20493a, type) && bVar.f20494b.equals(set)) {
                return bVar;
            }
        }
        return null;
    }

    @Override // mf.t.a
    public final t<?> a(Type type, Set<? extends Annotation> set, h0 h0Var) {
        String str;
        b b10 = b(this.f20486a, type, set);
        b b11 = b(this.f20487b, type, set);
        t tVar = null;
        if (b10 == null && b11 == null) {
            return null;
        }
        if (b10 == null || b11 == null) {
            try {
                tVar = h0Var.d(this, type, set);
            } catch (IllegalArgumentException e10) {
                if (b10 == null) {
                    str = "@ToJson";
                } else {
                    str = "@FromJson";
                }
                StringBuilder a10 = androidx.activity.result.d.a("No ", str, " adapter for ");
                a10.append(nf.b.k(type, set));
                throw new IllegalArgumentException(a10.toString(), e10);
            }
        }
        t tVar2 = tVar;
        if (b10 != null) {
            b10.a(h0Var, this);
        }
        if (b11 != null) {
            b11.a(h0Var, this);
        }
        return new C0372a(b10, tVar2, h0Var, b11, set, type);
    }
}
