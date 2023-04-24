package om;

/* loaded from: classes2.dex */
public class g extends f {
    /* JADX WARN: Code restructure failed: missing block: B:55:0x002f, code lost:
        if (r3 == '+') goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Integer S(java.lang.String r10) {
        /*
            java.lang.String r0 = "<this>"
            gm.l.f(r10, r0)
            r0 = 10
            ih.v.c(r0)
            int r1 = r10.length()
            if (r1 != 0) goto L11
            goto L56
        L11:
            r2 = 0
            char r3 = r10.charAt(r2)
            r4 = 48
            int r4 = gm.l.h(r3, r4)
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r6 = 1
            if (r4 >= 0) goto L32
            if (r1 != r6) goto L25
            goto L56
        L25:
            r4 = 45
            if (r3 != r4) goto L2d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            goto L34
        L2d:
            r4 = 43
            if (r3 != r4) goto L56
            goto L33
        L32:
            r6 = 0
        L33:
            r3 = 0
        L34:
            r4 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r7 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L3a:
            if (r6 >= r1) goto L5c
            char r8 = r10.charAt(r6)
            int r8 = java.lang.Character.digit(r8, r0)
            if (r8 >= 0) goto L47
            goto L56
        L47:
            if (r2 >= r7) goto L50
            if (r7 != r4) goto L56
            int r7 = r5 / 10
            if (r2 >= r7) goto L50
            goto L56
        L50:
            int r2 = r2 * 10
            int r9 = r5 + r8
            if (r2 >= r9) goto L58
        L56:
            r10 = 0
            goto L68
        L58:
            int r2 = r2 - r8
            int r6 = r6 + 1
            goto L3a
        L5c:
            if (r3 == 0) goto L63
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            goto L68
        L63:
            int r10 = -r2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
        L68:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: om.g.S(java.lang.String):java.lang.Integer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x002e, code lost:
        if (r4 == '+') goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Long T(java.lang.String r18) {
        /*
            r0 = r18
            r1 = 10
            ih.v.c(r1)
            int r2 = r18.length()
            if (r2 != 0) goto Le
            goto L61
        Le:
            r3 = 0
            char r4 = r0.charAt(r3)
            r5 = 48
            int r5 = gm.l.h(r4, r5)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1
            if (r5 >= 0) goto L31
            if (r2 != r8) goto L24
            goto L61
        L24:
            r5 = 45
            if (r4 != r5) goto L2c
            r6 = -9223372036854775808
            r3 = 1
            goto L32
        L2c:
            r5 = 43
            if (r4 != r5) goto L61
            goto L32
        L31:
            r8 = 0
        L32:
            r4 = 0
            r9 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r11 = r9
        L3a:
            if (r8 >= r2) goto L67
            char r13 = r0.charAt(r8)
            int r13 = java.lang.Character.digit(r13, r1)
            if (r13 >= 0) goto L47
            goto L61
        L47:
            int r14 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r14 >= 0) goto L57
            int r14 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r14 != 0) goto L61
            long r11 = (long) r1
            long r11 = r6 / r11
            int r14 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r14 >= 0) goto L57
            goto L61
        L57:
            long r14 = (long) r1
            long r4 = r4 * r14
            long r13 = (long) r13
            long r15 = r6 + r13
            int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r17 >= 0) goto L63
        L61:
            r0 = 0
            goto L73
        L63:
            long r4 = r4 - r13
            int r8 = r8 + 1
            goto L3a
        L67:
            if (r3 == 0) goto L6e
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            goto L73
        L6e:
            long r0 = -r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: om.g.T(java.lang.String):java.lang.Long");
    }
}
