package i4;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.sql.Time;

/* loaded from: classes.dex */
public final class b0 implements t {

    /* renamed from: a */
    public static final b0 f16440a = new b0();

    @Override // i4.t
    public final int b() {
        return 2;
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        long parseLong;
        h4.c cVar = aVar.f15774f;
        if (cVar.h0() == 16) {
            cVar.J(4);
            if (cVar.h0() == 4) {
                cVar.D();
                if (cVar.h0() == 2) {
                    long j10 = cVar.j();
                    cVar.J(13);
                    if (cVar.h0() == 13) {
                        cVar.J(16);
                        return (T) new Time(j10);
                    }
                    throw new e4.d("syntax error");
                }
                throw new e4.d("syntax error");
            }
            throw new e4.d("syntax error");
        }
        T t10 = (T) aVar.E(null);
        if (t10 == null) {
            return null;
        }
        if (t10 instanceof Time) {
            return t10;
        }
        if (t10 instanceof BigDecimal) {
            return (T) new Time(n4.n.d0((BigDecimal) t10));
        }
        if (t10 instanceof Number) {
            return (T) new Time(((Number) t10).longValue());
        }
        if (t10 instanceof String) {
            String str = (String) t10;
            if (str.length() == 0) {
                return null;
            }
            h4.h hVar = new h4.h(str);
            boolean z10 = true;
            if (hVar.t1(true)) {
                parseLong = hVar.f15824j.getTimeInMillis();
            } else {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (charAt < '0' || charAt > '9') {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    hVar.close();
                    return (T) Time.valueOf(str);
                }
                parseLong = Long.parseLong(str);
            }
            hVar.close();
            return (T) new Time(parseLong);
        }
        throw new e4.d("parse error");
    }
}
