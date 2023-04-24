package i4;

import j4.d1;
import j4.e1;
import j4.i0;
import j4.t0;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/* loaded from: classes.dex */
public final class q extends e implements t0, j4.u {

    /* renamed from: a */
    public static final q f16465a = new q();

    /* renamed from: b */
    public static final DateTimeFormatter f16466b = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /* renamed from: c */
    public static final DateTimeFormatter f16467c = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    /* renamed from: d */
    public static final DateTimeFormatter f16468d = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    /* renamed from: e */
    public static final DateTimeFormatter f16469e = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm:ss");

    /* renamed from: f */
    public static final DateTimeFormatter f16470f = DateTimeFormatter.ofPattern("yyyy年M月d日 H时m分s秒");

    /* renamed from: g */
    public static final DateTimeFormatter f16471g = DateTimeFormatter.ofPattern("yyyy년M월d일 HH:mm:ss");

    /* renamed from: h */
    public static final DateTimeFormatter f16472h = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

    /* renamed from: i */
    public static final DateTimeFormatter f16473i = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    /* renamed from: j */
    public static final DateTimeFormatter f16474j = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    /* renamed from: k */
    public static final DateTimeFormatter f16475k = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    /* renamed from: l */
    public static final DateTimeFormatter f16476l = DateTimeFormatter.ofPattern("yyyyMMdd");

    /* renamed from: m */
    public static final DateTimeFormatter f16477m = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    /* renamed from: n */
    public static final DateTimeFormatter f16478n = DateTimeFormatter.ofPattern("yyyy年M月d日");

    /* renamed from: o */
    public static final DateTimeFormatter f16479o = DateTimeFormatter.ofPattern("yyyy년M월d일");

    /* renamed from: p */
    public static final DateTimeFormatter f16480p = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    /* renamed from: q */
    public static final DateTimeFormatter f16481q = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    /* renamed from: r */
    public static final DateTimeFormatter f16482r = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    /* renamed from: s */
    public static final DateTimeFormatter f16483s = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    /* renamed from: t */
    public static final DateTimeFormatter f16484t = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault());

    /* renamed from: u */
    public static final DateTimeFormatter f16485u = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    public static Object g(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        return LocalDateTime.parse(obj.toString(), DateTimeFormatter.ofPattern(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0078, code lost:
        if (r0.equals("AU") == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.time.LocalDate h(java.lang.String r13, java.time.format.DateTimeFormatter r14) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.q.h(java.lang.String, java.time.format.DateTimeFormatter):java.time.LocalDate");
    }

    public static void i(d1 d1Var, TemporalAccessor temporalAccessor, String str) {
        if ("unixtime".equals(str)) {
            if (temporalAccessor instanceof ChronoZonedDateTime) {
                d1Var.L((int) ((ChronoZonedDateTime) temporalAccessor).toEpochSecond());
                return;
            } else if (temporalAccessor instanceof LocalDateTime) {
                d1Var.L((int) ((LocalDateTime) temporalAccessor).atZone(e4.a.f13339a.toZoneId()).toEpochSecond());
                return;
            }
        }
        if ("millis".equals(str)) {
            Instant instant = null;
            if (temporalAccessor instanceof ChronoZonedDateTime) {
                instant = ((ChronoZonedDateTime) temporalAccessor).toInstant();
            } else if (temporalAccessor instanceof LocalDateTime) {
                instant = ((LocalDateTime) temporalAccessor).atZone(e4.a.f13339a.toZoneId()).toInstant();
            }
            if (instant != null) {
                d1Var.P(instant.toEpochMilli());
                return;
            }
        }
        d1Var.Z((str == "yyyy-MM-dd'T'HH:mm:ss" ? f16485u : DateTimeFormatter.ofPattern(str)).format(temporalAccessor));
    }

    @Override // i4.t
    public final int b() {
        return 4;
    }

    @Override // j4.u
    public final void c(i0 i0Var, Object obj, j4.j jVar) {
        i(i0Var.f17406j, (TemporalAccessor) obj, (String) jVar.f17415b);
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
        if (type == LocalDateTime.class) {
            e1 e1Var = e1.UseISO8601DateFormat;
            int i11 = e1Var.f17396a;
            LocalDateTime localDateTime = (LocalDateTime) obj;
            String k10 = i0Var.k();
            if (k10 == null) {
                if ((i10 & i11) == 0 && !i0Var.f17406j.q(e1Var)) {
                    if (i0Var.n(e1.WriteDateUseDateFormat)) {
                        k10 = e4.a.f13343e;
                    } else {
                        int nano = localDateTime.getNano();
                        if (nano != 0) {
                            if (nano % 1000000 == 0) {
                                k10 = "yyyy-MM-dd'T'HH:mm:ss.SSS";
                            } else {
                                k10 = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS";
                            }
                        }
                    }
                }
                k10 = "yyyy-MM-dd'T'HH:mm:ss";
            }
            if (k10 != null) {
                i(d1Var, localDateTime, k10);
                return;
            } else {
                d1Var.P(localDateTime.atZone(e4.a.f13339a.toZoneId()).toInstant().toEpochMilli());
                return;
            }
        }
        d1Var.Z(obj.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:425:0x00ee, code lost:
        if (r0.equals("AU") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x02c5, code lost:
        if (r6 == ' ') goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0320, code lost:
        if (r0.equals("AU") == false) goto L231;
     */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0382  */
    @Override // i4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> T f(h4.a r18, java.lang.reflect.Type r19, java.lang.Object r20, java.lang.String r21, int r22) {
        /*
            Method dump skipped, instructions count: 1347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.q.f(h4.a, java.lang.reflect.Type, java.lang.Object, java.lang.String, int):java.lang.Object");
    }
}
