package j4;

import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d0 implements t0, i4.t {

    /* renamed from: a */
    public static d0 f17349a = new d0();

    @Override // i4.t
    public final int b() {
        return 2;
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        T t10;
        h4.c cVar = aVar.f15774f;
        int h02 = cVar.h0();
        if (h02 == 8) {
            cVar.J(16);
            return null;
        }
        try {
            if (h02 == 2) {
                int E = cVar.E();
                cVar.J(16);
                t10 = (T) Integer.valueOf(E);
            } else if (h02 == 3) {
                t10 = (T) Integer.valueOf(n4.n.R(cVar.L()));
                cVar.J(16);
            } else if (h02 == 12) {
                e4.e eVar = new e4.e(true);
                aVar.R(eVar, null);
                t10 = (T) n4.n.m(eVar);
            } else {
                t10 = (T) n4.n.m(aVar.E(null));
            }
            obj = AtomicInteger.class;
            return type == obj ? (T) new AtomicInteger(((Integer) t10).intValue()) : t10;
        } catch (Exception e10) {
            String str = "parseInt error";
            if (obj != null) {
                str = "parseInt error, field : " + obj;
            }
            throw new e4.d(str, e10);
        }
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        int i11;
        d1 d1Var = i0Var.f17406j;
        Number number = (Number) obj;
        if (number == null) {
            d1Var.X(e1.WriteNullNumberAsZero);
            return;
        }
        if (obj instanceof Long) {
            d1Var.P(number.longValue());
        } else {
            d1Var.L(number.intValue());
        }
        if (d1Var.q(e1.WriteClassName)) {
            Class<?> cls = number.getClass();
            if (cls == Byte.class) {
                i11 = 66;
            } else if (cls != Short.class) {
                return;
            } else {
                i11 = 83;
            }
            d1Var.write(i11);
        }
    }
}
