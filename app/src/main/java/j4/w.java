package j4;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class w extends i4.b implements t0 {

    /* renamed from: a */
    public static final w f17469a = new w();

    @Override // i4.t
    public final int b() {
        return 2;
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        int i11;
        Date j10;
        int i12;
        char[] charArray;
        int i13;
        d1 d1Var = i0Var.f17406j;
        if (obj == null) {
            d1Var.R();
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == java.sql.Date.class && !d1Var.q(e1.WriteDateUseDateFormat)) {
            long time = ((java.sql.Date) obj).getTime();
            if ((time + i0Var.f17412p.getOffset(time)) % 86400000 == 0 && !e1.c(d1Var.f17355c, i10, e1.WriteClassName)) {
                d1Var.Z(obj.toString());
                return;
            }
        }
        if (cls == Time.class) {
            long time2 = ((Time) obj).getTime();
            if ("unixtime".equals(i0Var.k())) {
                d1Var.P(time2 / 1000);
                return;
            } else if ("millis".equals(i0Var.k())) {
                d1Var.P(time2);
                return;
            } else if (time2 < 86400000) {
                d1Var.Z(obj.toString());
                return;
            }
        }
        if (cls == Timestamp.class) {
            i11 = ((Timestamp) obj).getNanos();
        } else {
            i11 = 0;
        }
        if (obj instanceof Date) {
            j10 = (Date) obj;
        } else {
            j10 = n4.n.j(obj, null);
        }
        if ("unixtime".equals(i0Var.k())) {
            d1Var.P(j10.getTime() / 1000);
        } else if ("millis".equals(i0Var.k())) {
            d1Var.P(j10.getTime());
        } else if (d1Var.q(e1.WriteDateUseDateFormat)) {
            if (i0Var.f17409m == null) {
                i0Var.getClass();
            }
            SimpleDateFormat simpleDateFormat = i0Var.f17409m;
            if (simpleDateFormat == null) {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(e4.a.f13343e, i0Var.f17413q);
                simpleDateFormat2.setTimeZone(i0Var.f17412p);
                simpleDateFormat = simpleDateFormat2;
            }
            d1Var.Z(simpleDateFormat.format(j10));
        } else if (d1Var.q(e1.WriteClassName) && cls != type) {
            if (cls == Date.class) {
                d1Var.write("new Date(");
                d1Var.P(((Date) obj).getTime());
                i13 = 41;
            } else {
                d1Var.write(123);
                d1Var.y(e4.a.f13341c);
                i0Var.t(cls.getName());
                d1Var.D(',', "val", ((Date) obj).getTime());
                i13 = 125;
            }
            d1Var.write(i13);
        } else {
            long time3 = j10.getTime();
            if (d1Var.q(e1.UseISO8601DateFormat)) {
                if (d1Var.q(e1.UseSingleQuotes)) {
                    i12 = 39;
                } else {
                    i12 = 34;
                }
                d1Var.write(i12);
                Calendar calendar = Calendar.getInstance(i0Var.f17412p, i0Var.f17413q);
                calendar.setTimeInMillis(time3);
                int i14 = calendar.get(1);
                int i15 = calendar.get(2) + 1;
                int i16 = calendar.get(5);
                int i17 = calendar.get(11);
                int i18 = calendar.get(12);
                int i19 = calendar.get(13);
                int i20 = calendar.get(14);
                if (i11 > 0) {
                    charArray = "0000-00-00 00:00:00.000000000".toCharArray();
                    n4.g.d(charArray, i11, 29);
                    n4.g.d(charArray, i19, 19);
                    n4.g.d(charArray, i18, 16);
                    n4.g.d(charArray, i17, 13);
                    n4.g.d(charArray, i16, 10);
                    n4.g.d(charArray, i15, 7);
                    n4.g.d(charArray, i14, 4);
                } else if (i20 != 0) {
                    char[] charArray2 = "0000-00-00T00:00:00.000".toCharArray();
                    n4.g.d(charArray2, i20, 23);
                    n4.g.d(charArray2, i19, 19);
                    n4.g.d(charArray2, i18, 16);
                    n4.g.d(charArray2, i17, 13);
                    n4.g.d(charArray2, i16, 10);
                    n4.g.d(charArray2, i15, 7);
                    n4.g.d(charArray2, i14, 4);
                    charArray = charArray2;
                } else if (i19 == 0 && i18 == 0 && i17 == 0) {
                    char[] charArray3 = "0000-00-00".toCharArray();
                    n4.g.d(charArray3, i16, 10);
                    n4.g.d(charArray3, i15, 7);
                    n4.g.d(charArray3, i14, 4);
                    charArray = charArray3;
                } else {
                    charArray = "0000-00-00T00:00:00".toCharArray();
                    n4.g.d(charArray, i19, 19);
                    n4.g.d(charArray, i18, 16);
                    n4.g.d(charArray, i17, 13);
                    n4.g.d(charArray, i16, 10);
                    n4.g.d(charArray, i15, 7);
                    n4.g.d(charArray, i14, 4);
                }
                if (i11 > 0) {
                    int i21 = 0;
                    while (i21 < 9 && charArray[(charArray.length - i21) - 1] == '0') {
                        i21++;
                    }
                    d1Var.write(charArray, 0, charArray.length - i21);
                    d1Var.write(i12);
                    return;
                }
                d1Var.write(charArray);
                float offset = calendar.getTimeZone().getOffset(calendar.getTimeInMillis()) / 3600000.0f;
                int i22 = (int) offset;
                if (i22 == 0.0d) {
                    d1Var.write(90);
                } else {
                    if (i22 > 9) {
                        d1Var.write(43);
                    } else if (i22 > 0) {
                        d1Var.write(43);
                        d1Var.write(48);
                    } else {
                        if (i22 < -9) {
                            d1Var.write(45);
                        } else {
                            if (i22 < 0) {
                                d1Var.write(45);
                                d1Var.write(48);
                            }
                            d1Var.write(58);
                            d1Var.b(String.format("%02d", Integer.valueOf((int) (Math.abs(offset - i22) * 60.0f))));
                        }
                        d1Var.L(-i22);
                        d1Var.write(58);
                        d1Var.b(String.format("%02d", Integer.valueOf((int) (Math.abs(offset - i22) * 60.0f))));
                    }
                    d1Var.L(i22);
                    d1Var.write(58);
                    d1Var.b(String.format("%02d", Integer.valueOf((int) (Math.abs(offset - i22) * 60.0f))));
                }
                d1Var.write(i12);
                return;
            }
            d1Var.P(time3);
        }
    }

    @Override // i4.b
    public final Object g(h4.a aVar, Type type, Object obj) {
        boolean z10;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return obj;
        }
        if (obj instanceof BigDecimal) {
            return new Date(n4.n.d0((BigDecimal) obj));
        }
        if (obj instanceof Number) {
            return new Date(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0) {
                return null;
            }
            if (str.length() == 23 && str.endsWith(" 000")) {
                str = str.substring(0, 19);
            }
            h4.h hVar = new h4.h(str);
            try {
                if (hVar.t1(false)) {
                    Calendar calendar = hVar.f15824j;
                    if (type == Calendar.class) {
                        return calendar;
                    }
                    return calendar.getTime();
                }
                hVar.close();
                String str2 = aVar.f15772d;
                if (str.length() != str2.length() && ((str.length() != 22 || !str2.equals("yyyyMMddHHmmssSSSZ")) && (str.indexOf(84) == -1 || !str2.contains("'T'") || str.length() + 2 != str2.length()))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    try {
                        return aVar.v().parse(str);
                    } catch (ParseException unused) {
                    }
                }
                if (str.startsWith("/Date(") && str.endsWith(")/")) {
                    str = str.substring(6, str.length() - 2);
                }
                if ("0000-00-00".equals(str) || "0000-00-00T00:00:00".equalsIgnoreCase(str) || "0001-01-01T00:00:00+08:00".equalsIgnoreCase(str)) {
                    return null;
                }
                int lastIndexOf = str.lastIndexOf(124);
                if (lastIndexOf > 20) {
                    TimeZone timeZone = TimeZone.getTimeZone(str.substring(lastIndexOf + 1));
                    if (!"GMT".equals(timeZone.getID())) {
                        hVar = new h4.h(str.substring(0, lastIndexOf));
                        try {
                            if (hVar.t1(false)) {
                                Calendar calendar2 = hVar.f15824j;
                                calendar2.setTimeZone(timeZone);
                                if (type == Calendar.class) {
                                    return calendar2;
                                }
                                return calendar2.getTime();
                            }
                        } finally {
                        }
                    }
                }
                return new Date(Long.parseLong(str));
            } finally {
            }
        }
        throw new e4.d("parse error");
    }
}
