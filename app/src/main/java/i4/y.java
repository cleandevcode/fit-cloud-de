package i4;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;

/* loaded from: classes.dex */
public final class y extends b {

    /* renamed from: b */
    public static final y f16496b = new y();

    /* renamed from: c */
    public static final y f16497c = new y(0);

    /* renamed from: a */
    public boolean f16498a = false;

    public y() {
    }

    public y(int i10) {
    }

    @Override // i4.t
    public final int b() {
        return 2;
    }

    @Override // i4.b
    public final Object g(h4.a aVar, Type type, Object obj) {
        h4.h hVar;
        long parseLong;
        long parseLong2;
        Timestamp timestamp;
        if (this.f16498a) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof Date) {
                return new Timestamp(((Date) obj).getTime());
            }
            if (obj instanceof BigDecimal) {
                return new Timestamp(n4.n.d0((BigDecimal) obj));
            }
            if (obj instanceof Number) {
                return new Timestamp(((Number) obj).longValue());
            }
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() == 0) {
                    return null;
                }
                hVar = new h4.h(str);
                try {
                    if (str.length() > 19 && str.charAt(4) == '-' && str.charAt(7) == '-' && str.charAt(10) == ' ' && str.charAt(13) == ':' && str.charAt(16) == ':' && str.charAt(19) == '.') {
                        String str2 = aVar.f15772d;
                        if (str2.length() != str.length() && str2 == e4.a.f13343e) {
                            timestamp = Timestamp.valueOf(str);
                            return timestamp;
                        }
                    }
                    if (hVar.t1(false)) {
                        parseLong2 = hVar.f15824j.getTimeInMillis();
                    } else {
                        try {
                            timestamp = new Timestamp(aVar.v().parse(str).getTime());
                            return timestamp;
                        } catch (ParseException unused) {
                            parseLong2 = Long.parseLong(str);
                        }
                    }
                    hVar.close();
                    return new Timestamp(parseLong2);
                } finally {
                }
            }
            throw new e4.d("parse error");
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof Date) {
                return new java.sql.Date(((Date) obj).getTime());
            }
            if (obj instanceof BigDecimal) {
                return new java.sql.Date(n4.n.d0((BigDecimal) obj));
            }
            if (obj instanceof Number) {
                return new java.sql.Date(((Number) obj).longValue());
            }
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (str3.length() == 0) {
                    return null;
                }
                hVar = new h4.h(str3);
                try {
                    if (hVar.t1(true)) {
                        parseLong = hVar.f15824j.getTimeInMillis();
                    } else {
                        try {
                            return new java.sql.Date(aVar.v().parse(str3).getTime());
                        } catch (ParseException unused2) {
                            parseLong = Long.parseLong(str3);
                        }
                    }
                    hVar.close();
                    return new java.sql.Date(parseLong);
                } finally {
                }
            }
            throw new e4.d(g4.g.a("parse error : ", obj));
        }
    }
}
