package j4;

import java.lang.reflect.Type;
import java.util.TimeZone;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/* loaded from: classes.dex */
public final class k0 implements t0, u, i4.t {

    /* renamed from: a */
    public static final k0 f17425a = new k0();

    /* renamed from: b */
    public static final DateTimeFormatter f17426b = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");

    /* renamed from: c */
    public static final DateTimeFormatter f17427c = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSS");

    /* renamed from: d */
    public static final DateTimeFormatter f17428d = DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss");

    /* renamed from: e */
    public static final DateTimeFormatter f17429e = DateTimeFormat.forPattern("yyyy年M月d日 HH:mm:ss");

    /* renamed from: f */
    public static final DateTimeFormatter f17430f = DateTimeFormat.forPattern("yyyy年M月d日 H时m分s秒");

    /* renamed from: g */
    public static final DateTimeFormatter f17431g = DateTimeFormat.forPattern("yyyy년M월d일 HH:mm:ss");

    /* renamed from: h */
    public static final DateTimeFormatter f17432h = DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss");

    /* renamed from: i */
    public static final DateTimeFormatter f17433i = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");

    /* renamed from: j */
    public static final DateTimeFormatter f17434j = DateTimeFormat.forPattern("dd.MM.yyyy HH:mm:ss");

    /* renamed from: k */
    public static final DateTimeFormatter f17435k = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss");

    /* renamed from: l */
    public static final DateTimeFormatter f17436l = DateTimeFormat.forPattern("yyyyMMdd");

    /* renamed from: m */
    public static final DateTimeFormatter f17437m = DateTimeFormat.forPattern("yyyy/MM/dd");

    /* renamed from: n */
    public static final DateTimeFormatter f17438n = DateTimeFormat.forPattern("yyyy年M月d日");

    /* renamed from: o */
    public static final DateTimeFormatter f17439o = DateTimeFormat.forPattern("yyyy년M월d일");

    /* renamed from: p */
    public static final DateTimeFormatter f17440p = DateTimeFormat.forPattern("MM/dd/yyyy");

    /* renamed from: q */
    public static final DateTimeFormatter f17441q = DateTimeFormat.forPattern("dd/MM/yyyy");

    /* renamed from: r */
    public static final DateTimeFormatter f17442r = DateTimeFormat.forPattern("dd.MM.yyyy");

    /* renamed from: s */
    public static final DateTimeFormatter f17443s = DateTimeFormat.forPattern("dd-MM-yyyy");

    /* renamed from: t */
    public static final DateTimeFormatter f17444t = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZone(DateTimeZone.getDefault());

    /* renamed from: u */
    public static final DateTimeFormatter f17445u = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss");

    /* JADX WARN: Code restructure failed: missing block: B:124:0x00a2, code lost:
        if (r1.equals("AU") == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0125 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.joda.time.LocalDateTime g(java.lang.String r16, org.joda.time.format.DateTimeFormatter r17) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.k0.g(java.lang.String, org.joda.time.format.DateTimeFormatter):org.joda.time.LocalDateTime");
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0078, code lost:
        if (r0.equals("AU") == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.joda.time.LocalDate h(java.lang.String r13, org.joda.time.format.DateTimeFormatter r14) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.k0.h(java.lang.String, org.joda.time.format.DateTimeFormatter):org.joda.time.LocalDate");
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x009f, code lost:
        if (r0.equals("AU") == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.joda.time.DateTime i(java.lang.String r11, org.joda.time.format.DateTimeFormatter r12) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.k0.i(java.lang.String, org.joda.time.format.DateTimeFormatter):org.joda.time.DateTime");
    }

    public static void j(d1 d1Var, ReadablePartial readablePartial, String str) {
        d1Var.Z((str.equals("yyyy-MM-dd'T'HH:mm:ss") ? f17445u : DateTimeFormat.forPattern(str)).print(readablePartial));
    }

    @Override // i4.t
    public final int b() {
        return 4;
    }

    @Override // j4.u
    public final void c(i0 i0Var, Object obj, j jVar) {
        j(i0Var.f17406j, (ReadablePartial) obj, (String) jVar.f17415b);
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        return (T) f(aVar, type, obj, null, 0);
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        d1 d1Var = i0Var.f17406j;
        if (obj == null) {
            d1Var.R();
            return;
        }
        if (type == null) {
            type = obj.getClass();
        }
        if (type != LocalDateTime.class) {
            d1Var.Z(obj.toString());
            return;
        }
        e1 e1Var = e1.UseISO8601DateFormat;
        int a10 = e1Var.a();
        LocalDateTime localDateTime = (LocalDateTime) obj;
        String k10 = i0Var.k();
        if (k10 == null) {
            k10 = ((i10 & a10) != 0 || i0Var.n(e1Var)) ? "yyyy-MM-dd'T'HH:mm:ss" : i0Var.n(e1.WriteDateUseDateFormat) ? e4.a.f13343e : localDateTime.getMillisOfSecond() == 0 ? "yyyy-MM-dd'T'HH:mm:ss.SSS" : "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS";
        }
        if (k10 != null) {
            j(d1Var, localDateTime, k10);
        } else {
            d1Var.P(localDateTime.toDateTime(DateTimeZone.forTimeZone(e4.a.f13339a)).toInstant().getMillis());
        }
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [T, org.joda.time.LocalDateTime] */
    public final <T> T f(h4.a aVar, Type type, Object obj, String str, int i10) {
        h4.c cVar = aVar.f15774f;
        if (cVar.h0() == 8) {
            cVar.nextToken();
            return null;
        }
        if (cVar.h0() == 4) {
            String W = cVar.W();
            cVar.nextToken();
            if ("".equals(W)) {
                return null;
            }
            if (type == LocalDateTime.class) {
                return (W.length() == 10 || W.length() == 8) ? (T) h(W, null).toLocalDateTime(LocalTime.MIDNIGHT) : (T) g(W, null);
            } else if (type == LocalDate.class) {
                return W.length() == 23 ? (T) LocalDateTime.parse(W).toLocalDate() : (T) h(W, null);
            } else if (type == LocalTime.class) {
                return W.length() == 23 ? (T) LocalDateTime.parse(W).toLocalTime() : (T) LocalTime.parse(W);
            } else if (type == DateTime.class) {
                return (T) i(W, f17426b == null ? f17444t : null);
            } else if (type == DateTimeZone.class) {
                return (T) DateTimeZone.forID(W);
            } else {
                if (type == Period.class) {
                    return (T) Period.parse(W);
                }
                if (type == Duration.class) {
                    return (T) Duration.parse(W);
                }
                if (type == Instant.class) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= W.length()) {
                            z10 = true;
                            break;
                        }
                        char charAt = W.charAt(i11);
                        if (charAt < '0' || charAt > '9') {
                            break;
                        }
                        i11++;
                    }
                    return (!z10 || W.length() <= 8 || W.length() >= 19) ? (T) Instant.parse(W) : (T) new Instant(Long.parseLong(W));
                } else if (type == DateTimeFormatter.class) {
                    return (T) DateTimeFormat.forPattern(W);
                }
            }
        } else if (cVar.h0() == 2) {
            long j10 = cVar.j();
            cVar.nextToken();
            TimeZone timeZone = e4.a.f13339a;
            if (timeZone == null) {
                timeZone = TimeZone.getDefault();
            }
            if (type == DateTime.class) {
                return (T) new DateTime(j10, DateTimeZone.forTimeZone(timeZone));
            }
            ?? r52 = (T) new LocalDateTime(j10, DateTimeZone.forTimeZone(timeZone));
            if (type == LocalDateTime.class) {
                return r52;
            }
            if (type == LocalDate.class) {
                return (T) r52.toLocalDate();
            }
            if (type == LocalTime.class) {
                return (T) r52.toLocalTime();
            }
            if (type == Instant.class) {
                return (T) new Instant(j10);
            }
            throw new UnsupportedOperationException();
        } else if (cVar.h0() != 12) {
            throw new UnsupportedOperationException();
        } else {
            e4.e L = aVar.L();
            if (type == Instant.class) {
                Object obj2 = L.get("epochSecond");
                if (obj2 instanceof Number) {
                    return (T) Instant.ofEpochSecond(n4.n.c0((Number) obj2));
                }
                Object obj3 = L.get("millis");
                if (obj3 instanceof Number) {
                    return (T) Instant.ofEpochMilli(n4.n.c0((Number) obj3));
                }
            }
        }
        return null;
    }
}
