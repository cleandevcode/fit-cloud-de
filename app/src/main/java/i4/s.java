package i4;

import a0.q0;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class s implements t {

    /* renamed from: a */
    public static final s f16487a = new s();

    @Override // i4.t
    public final int b() {
        return 2;
    }

    /* JADX WARN: Type inference failed for: r9v22, types: [java.math.BigDecimal, T] */
    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        h4.c cVar = aVar.f15774f;
        if (cVar.h0() == 2) {
            if (type != Double.TYPE && type != Double.class) {
                long j10 = cVar.j();
                cVar.J(16);
                if (type != Short.TYPE && type != Short.class) {
                    if (type != Byte.TYPE && type != Byte.class) {
                        if (j10 >= -2147483648L && j10 <= 2147483647L) {
                            return (T) Integer.valueOf((int) j10);
                        }
                        return (T) Long.valueOf(j10);
                    } else if (j10 <= 127 && j10 >= -128) {
                        return (T) Byte.valueOf((byte) j10);
                    } else {
                        throw new e4.d(q0.a("short overflow : ", j10));
                    }
                } else if (j10 <= 32767 && j10 >= -32768) {
                    return (T) Short.valueOf((short) j10);
                } else {
                    throw new e4.d(q0.a("short overflow : ", j10));
                }
            }
            String I0 = cVar.I0();
            cVar.J(16);
            return (T) Double.valueOf(Double.parseDouble(I0));
        } else if (cVar.h0() == 3) {
            if (type != Double.TYPE && type != Double.class) {
                short s10 = 0;
                byte b10 = 0;
                if (type != Short.TYPE && type != Short.class) {
                    if (type != Byte.TYPE && type != Byte.class) {
                        ?? r92 = (T) cVar.L();
                        cVar.J(16);
                        if (cVar.I(h4.b.UseBigDecimal)) {
                            return r92;
                        }
                        return (T) Double.valueOf(r92.doubleValue());
                    }
                    BigDecimal L = cVar.L();
                    cVar.J(16);
                    Pattern pattern = n4.n.f22012a;
                    if (L != null) {
                        int scale = L.scale();
                        if (scale >= -100 && scale <= 100) {
                            b10 = L.byteValue();
                        } else {
                            b10 = L.byteValueExact();
                        }
                    }
                    return (T) Byte.valueOf(b10);
                }
                BigDecimal L2 = cVar.L();
                cVar.J(16);
                Pattern pattern2 = n4.n.f22012a;
                if (L2 != null) {
                    int scale2 = L2.scale();
                    if (scale2 >= -100 && scale2 <= 100) {
                        s10 = L2.shortValue();
                    } else {
                        s10 = L2.shortValueExact();
                    }
                }
                return (T) Short.valueOf(s10);
            }
            String I02 = cVar.I0();
            cVar.J(16);
            return (T) Double.valueOf(Double.parseDouble(I02));
        } else if (cVar.h0() == 18 && "NaN".equals(cVar.W())) {
            cVar.nextToken();
            if (type == Double.class) {
                return (T) Double.valueOf(Double.NaN);
            }
            if (type != Float.class) {
                return null;
            }
            return (T) Float.valueOf(Float.NaN);
        } else {
            Object E = aVar.E(null);
            if (E == null) {
                return null;
            }
            if (type != Double.TYPE && type != Double.class) {
                if (type != Short.TYPE && type != Short.class) {
                    if (type != Byte.TYPE && type != Byte.class) {
                        return (T) n4.n.e(E);
                    }
                    try {
                        return (T) n4.n.h(E);
                    } catch (Exception e10) {
                        throw new e4.d(g4.g.a("parseByte error, field : ", obj), e10);
                    }
                }
                try {
                    return (T) n4.n.p(E);
                } catch (Exception e11) {
                    throw new e4.d(g4.g.a("parseShort error, field : ", obj), e11);
                }
            }
            try {
                return (T) n4.n.k(E);
            } catch (Exception e12) {
                throw new e4.d(g4.g.a("parseDouble error, field : ", obj), e12);
            }
        }
    }
}
