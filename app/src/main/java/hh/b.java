package hh;

import java.util.Calendar;
import java.util.Locale;
import o5.a0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public static final int f16094a;

    /* renamed from: b */
    public static final int f16095b;

    static {
        int i10 = Calendar.getInstance().get(1);
        f16094a = i10;
        f16095b = i10 - 100;
    }

    public static final String a() {
        return a0.a(new Object[]{2000, 1, 1}, 3, Locale.US, "%d/%d/%d", "format(locale, format, *args)");
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(java.lang.String r6) {
        /*
            java.lang.String r0 = "/"
            java.lang.String r1 = "<this>"
            gm.l.f(r6, r1)
            int r1 = r6.length()
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            r4 = 2000(0x7d0, float:2.803E-42)
            if (r1 == 0) goto L65
            r1 = 0
            boolean r5 = om.l.c0(r6, r0, r2)     // Catch: java.lang.NumberFormatException -> L52
            if (r5 == 0) goto L1e
            goto L2a
        L1e:
            java.lang.String r0 = "."
            boolean r0 = om.l.c0(r6, r0, r2)     // Catch: java.lang.NumberFormatException -> L52
            if (r0 == 0) goto L29
            java.lang.String r0 = "\\."
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 == 0) goto L4d
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch: java.lang.NumberFormatException -> L52
            r1[r2] = r0     // Catch: java.lang.NumberFormatException -> L52
            r0 = 6
            java.util.List r6 = om.l.s0(r6, r1, r2, r0)     // Catch: java.lang.NumberFormatException -> L52
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch: java.lang.NumberFormatException -> L52
            java.lang.Object[] r6 = r6.toArray(r0)     // Catch: java.lang.NumberFormatException -> L52
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gm.l.d(r6, r0)     // Catch: java.lang.NumberFormatException -> L52
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch: java.lang.NumberFormatException -> L52
            int r0 = r6.length     // Catch: java.lang.NumberFormatException -> L52
            if (r0 != 0) goto L47
            r0 = 1
            goto L48
        L47:
            r0 = 0
        L48:
            r0 = r0 ^ r3
            if (r0 == 0) goto L56
            r6 = r6[r2]     // Catch: java.lang.NumberFormatException -> L52
        L4d:
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L52
            goto L58
        L52:
            r6 = move-exception
            r6.printStackTrace()
        L56:
            r6 = 2000(0x7d0, float:2.803E-42)
        L58:
            int r0 = hh.b.f16095b
            int r1 = hh.b.f16094a
            if (r6 > r1) goto L61
            if (r0 > r6) goto L61
            r2 = 1
        L61:
            if (r2 != 0) goto L64
            goto L65
        L64:
            r4 = r6
        L65:
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            int r6 = r6.get(r3)
            int r6 = r6 - r4
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hh.b.b(java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Date c(java.lang.String r8) {
        /*
            java.lang.String r0 = "/"
            java.lang.String r1 = "<this>"
            gm.l.f(r8, r1)
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            int r2 = r8.length()
            r3 = 1
            r4 = 0
            if (r2 <= 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L93
            boolean r2 = om.l.c0(r8, r0, r4)     // Catch: java.lang.NumberFormatException -> L8a
            if (r2 == 0) goto L21
            goto L2d
        L21:
            java.lang.String r0 = "."
            boolean r0 = om.l.c0(r8, r0, r4)     // Catch: java.lang.NumberFormatException -> L8a
            if (r0 == 0) goto L2c
            java.lang.String r0 = "\\."
            goto L2d
        L2c:
            r0 = r6
        L2d:
            if (r0 == 0) goto L7e
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch: java.lang.NumberFormatException -> L8a
            r2[r4] = r0     // Catch: java.lang.NumberFormatException -> L8a
            r0 = 6
            java.util.List r8 = om.l.s0(r8, r2, r4, r0)     // Catch: java.lang.NumberFormatException -> L8a
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.NumberFormatException -> L8a
            java.lang.Object[] r8 = r8.toArray(r0)     // Catch: java.lang.NumberFormatException -> L8a
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gm.l.d(r8, r0)     // Catch: java.lang.NumberFormatException -> L8a
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch: java.lang.NumberFormatException -> L8a
            int r0 = r8.length     // Catch: java.lang.NumberFormatException -> L8a
            if (r0 != 0) goto L4a
            r0 = 1
            goto L4b
        L4a:
            r0 = 0
        L4b:
            r0 = r0 ^ r3
            if (r0 == 0) goto L59
            r0 = r8[r4]     // Catch: java.lang.NumberFormatException -> L8a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L8a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L8a
            goto L5a
        L59:
            r0 = r6
        L5a:
            int r2 = r8.length     // Catch: java.lang.NumberFormatException -> L7b
            if (r2 <= r3) goto L69
            r2 = r8[r3]     // Catch: java.lang.NumberFormatException -> L7b
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L7b
            int r2 = r2 - r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L7b
            goto L6a
        L69:
            r2 = r6
        L6a:
            int r7 = r8.length     // Catch: java.lang.NumberFormatException -> L79
            if (r7 <= r5) goto L90
            r8 = r8[r5]     // Catch: java.lang.NumberFormatException -> L79
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L79
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.NumberFormatException -> L79
            r6 = r8
            goto L90
        L79:
            r8 = move-exception
            goto L8d
        L7b:
            r8 = move-exception
            r2 = r6
            goto L8d
        L7e:
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L8a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.NumberFormatException -> L8a
            r2 = r6
            r6 = r8
            r8 = r2
            goto L95
        L8a:
            r8 = move-exception
            r0 = r6
            r2 = r0
        L8d:
            r8.printStackTrace()
        L90:
            r8 = r6
            r6 = r0
            goto L95
        L93:
            r8 = r6
            r2 = r8
        L95:
            if (r6 == 0) goto L9c
            int r0 = r6.intValue()
            goto L9e
        L9c:
            r0 = 2000(0x7d0, float:2.803E-42)
        L9e:
            r1.set(r3, r0)
            if (r2 == 0) goto La7
            int r4 = r2.intValue()
        La7:
            r1.set(r5, r4)
            r0 = 5
            if (r8 == 0) goto Lb1
            int r3 = r8.intValue()
        Lb1:
            r1.set(r0, r3)
            java.util.Date r8 = r1.getTime()
            java.lang.String r0 = "calendar.time"
            gm.l.e(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: hh.b.c(java.lang.String):java.util.Date");
    }

    public static final float d(float f10, int i10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return (i10 / 60.0f) * (1 / f10);
    }

    public static final float e(float f10) {
        return (f10 * 1.8f) + 32;
    }

    public static final boolean f(long j10) {
        return j10 == Long.MAX_VALUE;
    }

    public static final boolean g(long j10) {
        return j10 > 0;
    }
}
