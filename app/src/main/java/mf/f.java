package mf;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import mf.t;

/* loaded from: classes.dex */
public final class f extends t<Object> {

    /* renamed from: c */
    public static final a f20536c = new a();

    /* renamed from: a */
    public final Class<?> f20537a;

    /* renamed from: b */
    public final t<Object> f20538b;

    /* loaded from: classes.dex */
    public class a implements t.a {
        @Override // mf.t.a
        public final t<?> a(Type type, Set<? extends Annotation> set, h0 h0Var) {
            Type type2;
            if (type instanceof GenericArrayType) {
                type2 = ((GenericArrayType) type).getGenericComponentType();
            } else if (type instanceof Class) {
                type2 = ((Class) type).getComponentType();
            } else {
                type2 = null;
            }
            if (type2 == null || !set.isEmpty()) {
                return null;
            }
            return new f(l0.c(type2), h0Var.b(type2)).d();
        }
    }

    public f(Class<?> cls, t<Object> tVar) {
        this.f20537a = cls;
        this.f20538b = tVar;
    }

    @Override // mf.t
    public final Object b(y yVar) {
        ArrayList arrayList = new ArrayList();
        yVar.a();
        while (yVar.q()) {
            arrayList.add(this.f20538b.b(yVar));
        }
        yVar.h();
        Object newInstance = Array.newInstance(this.f20537a, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    @Override // mf.t
    public final void f(e0 e0Var, Object obj) {
        e0Var.a();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f20538b.f(e0Var, Array.get(obj, i10));
        }
        e0Var.j();
    }

    public final String toString() {
        return this.f20538b + ".array()";
    }
}
