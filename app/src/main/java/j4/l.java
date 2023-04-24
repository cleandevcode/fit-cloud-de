package j4;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class l implements t0, i4.t {

    /* renamed from: a */
    public static final BigDecimal f17446a = BigDecimal.valueOf(-9007199254740991L);

    /* renamed from: b */
    public static final BigDecimal f17447b = BigDecimal.valueOf(9007199254740991L);

    /* renamed from: c */
    public static final l f17448c = new l();

    @Override // i4.t
    public final int b() {
        return 2;
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        try {
            h4.c cVar = aVar.f15774f;
            if (cVar.h0() != 2 && cVar.h0() != 3) {
                Object D = aVar.D();
                if (D == null) {
                    return null;
                }
                return (T) n4.n.e(D);
            }
            T t10 = (T) cVar.L();
            cVar.J(16);
            return t10;
        } catch (Exception e10) {
            throw new e4.d(g4.g.a("parseDecimal error, field : ", obj), e10);
        }
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        d1 d1Var = i0Var.f17406j;
        if (obj == null) {
            d1Var.X(e1.WriteNullNumberAsZero);
            return;
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        int scale = bigDecimal.scale();
        String bigDecimal2 = (!e1.c(i10, d1Var.f17355c, e1.WriteBigDecimalAsPlain) || scale < -100 || scale >= 100) ? bigDecimal.toString() : bigDecimal.toPlainString();
        if (scale == 0 && bigDecimal2.length() >= 16 && e1.c(i10, d1Var.f17355c, e1.BrowserCompatible) && (bigDecimal.compareTo(f17446a) < 0 || bigDecimal.compareTo(f17447b) > 0)) {
            d1Var.Z(bigDecimal2);
            return;
        }
        d1Var.write(bigDecimal2);
        if (d1Var.q(e1.WriteClassName) && type != BigDecimal.class && bigDecimal.scale() == 0) {
            d1Var.write(46);
        }
    }
}
