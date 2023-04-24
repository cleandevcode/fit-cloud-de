package um;

import pm.b2;
import xl.f;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a */
    public static final x f28944a = new x("NO_THREAD_ELEMENTS");

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.p<Object, f.b, Object> {

        /* renamed from: b */
        public static final a f28945b = new a();

        public a() {
            super(2);
        }

        @Override // fm.p
        public final Object A(Object obj, f.b bVar) {
            f.b bVar2 = bVar;
            if (bVar2 instanceof b2) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? bVar2 : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.p<b2<?>, f.b, b2<?>> {

        /* renamed from: b */
        public static final b f28946b = new b();

        public b() {
            super(2);
        }

        @Override // fm.p
        public final b2<?> A(b2<?> b2Var, f.b bVar) {
            b2<?> b2Var2 = b2Var;
            f.b bVar2 = bVar;
            if (b2Var2 != null) {
                return b2Var2;
            }
            if (bVar2 instanceof b2) {
                return (b2) bVar2;
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.p<e0, f.b, e0> {

        /* renamed from: b */
        public static final c f28947b = new c();

        public c() {
            super(2);
        }

        @Override // fm.p
        public final e0 A(e0 e0Var, f.b bVar) {
            e0 e0Var2 = e0Var;
            f.b bVar2 = bVar;
            if (bVar2 instanceof b2) {
                b2<Object> b2Var = (b2) bVar2;
                Object j10 = b2Var.j(e0Var2.f28897a);
                Object[] objArr = e0Var2.f28898b;
                int i10 = e0Var2.f28900d;
                objArr[i10] = j10;
                b2<Object>[] b2VarArr = e0Var2.f28899c;
                e0Var2.f28900d = i10 + 1;
                b2VarArr[i10] = b2Var;
            }
            return e0Var2;
        }
    }

    public static final void a(xl.f fVar, Object obj) {
        if (obj == f28944a) {
            return;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            int length = e0Var.f28899c.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i10 = length - 1;
                b2<Object> b2Var = e0Var.f28899c[length];
                gm.l.c(b2Var);
                b2Var.W(e0Var.f28898b[length]);
                if (i10 >= 0) {
                    length = i10;
                } else {
                    return;
                }
            }
        } else {
            Object Z = fVar.Z(null, b.f28946b);
            if (Z != null) {
                ((b2) Z).W(obj);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    public static final Object b(xl.f fVar) {
        Object Z = fVar.Z(0, a.f28945b);
        gm.l.c(Z);
        return Z;
    }

    public static final Object c(xl.f fVar, Object obj) {
        if (obj == null) {
            obj = b(fVar);
        }
        return obj == 0 ? f28944a : obj instanceof Integer ? fVar.Z(new e0(fVar, ((Number) obj).intValue()), c.f28947b) : ((b2) obj).j(fVar);
    }
}
