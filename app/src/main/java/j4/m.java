package j4;

import java.lang.reflect.Type;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class m implements t0, i4.t {

    /* renamed from: a */
    public static final BigInteger f17449a = BigInteger.valueOf(-9007199254740991L);

    /* renamed from: b */
    public static final BigInteger f17450b = BigInteger.valueOf(9007199254740991L);

    /* renamed from: c */
    public static final m f17451c = new m();

    @Override // i4.t
    public final int b() {
        return 2;
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        h4.c cVar = aVar.f15774f;
        if (cVar.h0() != 2) {
            Object D = aVar.D();
            return (T) (D == null ? null : n4.n.f(D));
        }
        String I0 = cVar.I0();
        cVar.J(16);
        if (I0.length() <= 65535) {
            return (T) new BigInteger(I0);
        }
        throw new e4.d("decimal overflow");
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        d1 d1Var = i0Var.f17406j;
        if (obj == null) {
            d1Var.X(e1.WriteNullNumberAsZero);
            return;
        }
        BigInteger bigInteger = (BigInteger) obj;
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.length() < 16 || !e1.c(i10, d1Var.f17355c, e1.BrowserCompatible) || (bigInteger.compareTo(f17449a) >= 0 && bigInteger.compareTo(f17450b) <= 0)) {
            d1Var.write(bigInteger2);
        } else {
            d1Var.Z(bigInteger2);
        }
    }
}
