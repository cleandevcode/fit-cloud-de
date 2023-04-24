package j4;

import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class o0 implements t0, i4.t {

    /* renamed from: a */
    public static o0 f17455a = new o0();

    @Override // i4.t
    public final int b() {
        return 2;
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        Object o10;
        h4.c cVar = aVar.f15774f;
        try {
            int h02 = cVar.h0();
            if (h02 == 2) {
                long j10 = cVar.j();
                cVar.J(16);
                o10 = (T) Long.valueOf(j10);
            } else if (h02 == 3) {
                o10 = (T) Long.valueOf(n4.n.d0(cVar.L()));
                cVar.J(16);
            } else {
                if (h02 == 12) {
                    e4.e eVar = new e4.e(true);
                    aVar.R(eVar, null);
                    o10 = (T) n4.n.o(eVar);
                } else {
                    o10 = n4.n.o(aVar.E(null));
                }
                if (o10 == null) {
                    return null;
                }
            }
            return type == AtomicLong.class ? (T) new AtomicLong(((Long) o10).longValue()) : (T) o10;
        } catch (Exception e10) {
            throw new e4.d(g4.g.a("parseLong error, field : ", obj), e10);
        }
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        d1 d1Var = i0Var.f17406j;
        if (obj == null) {
            d1Var.X(e1.WriteNullNumberAsZero);
            return;
        }
        long longValue = ((Long) obj).longValue();
        d1Var.P(longValue);
        if (!d1Var.q(e1.WriteClassName) || longValue > 2147483647L || longValue < -2147483648L || type == Long.class || type == Long.TYPE) {
            return;
        }
        d1Var.write(76);
    }
}
