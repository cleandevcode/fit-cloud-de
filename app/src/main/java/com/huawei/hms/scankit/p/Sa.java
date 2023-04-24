package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class Sa {

    /* renamed from: a */
    private static final int[] f7703a = {1, 3, 1, 1};

    /* renamed from: b */
    private static final int[] f7704b = {1, 1, 3, 1};

    /* renamed from: c */
    private static boolean f7705c = false;

    /* renamed from: d */
    private static boolean f7706d = false;

    /* renamed from: e */
    private static final b f7707e = new b();

    /* renamed from: f */
    private final C0736y f7708f;

    /* renamed from: j */
    private final com.huawei.hms.scankit.aiscan.common.A f7712j;

    /* renamed from: g */
    private final List<Qa> f7709g = new ArrayList();

    /* renamed from: i */
    private final int[] f7711i = new int[5];

    /* renamed from: h */
    private final List<Qa> f7710h = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a implements Comparator<Qa>, Serializable {

        /* renamed from: a */
        private final float f7713a;

        private a(float f10) {
            this.f7713a = f10;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Qa qa2, Qa qa3) {
            int compare = Integer.compare(qa3.a(), qa2.a());
            return compare == 0 ? Float.compare(Math.abs(qa2.e() - this.f7713a), Math.abs(qa3.e() - this.f7713a)) : compare;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Comparator<Qa>, Serializable {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Qa qa2, Qa qa3) {
            return Float.compare(qa2.e(), qa3.e());
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Comparator<Qa>, Serializable {

        /* renamed from: a */
        private final float f7714a;

        private c(float f10) {
            this.f7714a = f10;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Qa qa2, Qa qa3) {
            return Float.compare(Math.abs(qa3.e() - this.f7714a), Math.abs(qa2.e() - this.f7714a));
        }
    }

    public Sa(C0736y c0736y, com.huawei.hms.scankit.aiscan.common.A a10) {
        this.f7708f = c0736y;
        this.f7712j = a10;
    }

    private static double a(Qa qa2, Qa qa3) {
        double b10 = qa2.b() - qa3.b();
        double c10 = qa2.c() - qa3.c();
        return (c10 * c10) + (b10 * b10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x005c, code lost:
        if (r2[3] < r12) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0060, code lost:
        if (r10 >= r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0066, code lost:
        if (r0.b(r11, r10) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0068, code lost:
        r8 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x006a, code lost:
        if (r8 >= r12) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x006c, code lost:
        r2[4] = r8 + 1;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0073, code lost:
        r11 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0075, code lost:
        if (r11 < r12) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0077, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x008e, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r11) - r13) * 5) < (r13 * 2)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0090, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0093, code lost:
        if (com.huawei.hms.scankit.p._a.f7793d == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0099, code lost:
        if (a(r2, true) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x009f, code lost:
        return a(r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00a4, code lost:
        if (a(r2, false) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00aa, code lost:
        return a(r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:?, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:?, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:?, code lost:
        return Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float a(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            com.huawei.hms.scankit.p.y r0 = r9.f7708f
            int r1 = r0.b()
            int[] r2 = r9.d()
            boolean r3 = r9.c(r10, r11, r12, r2)
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r3 == 0) goto L13
            return r4
        L13:
            r3 = 1
            int r10 = r10 + r3
        L15:
            if (r10 >= r1) goto L28
            boolean r5 = r0.b(r11, r10)
            if (r5 != 0) goto L28
            r5 = r2[r3]
            if (r5 > r12) goto L28
            int r5 = r5 + 1
            r2[r3] = r5
            int r10 = r10 + 1
            goto L15
        L28:
            if (r10 < 0) goto Laa
            r5 = r2[r3]
            if (r5 <= r12) goto L30
            goto Laa
        L30:
            r5 = 2
            if (r10 >= r1) goto L41
            boolean r6 = r0.b(r11, r10)
            if (r6 == 0) goto L41
            r6 = r2[r5]
            int r6 = r6 + r3
            r2[r5] = r6
            int r10 = r10 + 1
            goto L30
        L41:
            if (r10 != r1) goto L44
            return r4
        L44:
            r6 = 3
            if (r10 >= r1) goto L58
            boolean r7 = r0.b(r11, r10)
            if (r7 != 0) goto L58
            r7 = r2[r6]
            if (r7 >= r12) goto L58
            int r7 = r7 + 1
            r2[r6] = r7
            int r10 = r10 + 1
            goto L44
        L58:
            if (r10 == r1) goto Laa
            r7 = r2[r6]
            if (r7 < r12) goto L5f
            goto Laa
        L5f:
            r7 = 4
            if (r10 >= r1) goto L73
            boolean r8 = r0.b(r11, r10)
            if (r8 == 0) goto L73
            r8 = r2[r7]
            if (r8 >= r12) goto L73
            int r8 = r8 + 1
            r2[r7] = r8
            int r10 = r10 + 1
            goto L5f
        L73:
            r11 = r2[r7]
            if (r11 < r12) goto L78
            return r4
        L78:
            r12 = 0
            r0 = r2[r12]
            r1 = r2[r3]
            int r0 = r0 + r1
            r1 = r2[r5]
            int r0 = r0 + r1
            r1 = r2[r6]
            int r0 = r0 + r1
            int r0 = r0 + r11
            int r0 = r0 - r13
            int r11 = java.lang.Math.abs(r0)
            int r11 = r11 * 5
            int r13 = r13 * 2
            if (r11 < r13) goto L91
            return r4
        L91:
            boolean r11 = com.huawei.hms.scankit.p._a.f7793d
            if (r11 == 0) goto La0
            boolean r11 = a(r2, r3)
            if (r11 == 0) goto L9f
            float r4 = a(r2, r10)
        L9f:
            return r4
        La0:
            boolean r11 = a(r2, r12)
            if (r11 == 0) goto Laa
            float r4 = a(r2, r10)
        Laa:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.a(int, int, int, int):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x005c, code lost:
        if (r3.b(r5, r7) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x005e, code lost:
        r10 = r6[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0060, code lost:
        if (r10 > r19) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0062, code lost:
        r6[1] = r10 + 1;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0069, code lost:
        if (r7 < 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0070, code lost:
        if (r6[1] <= r11) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0074, code lost:
        if (r7 >= r4) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x007a, code lost:
        if (r3.b(r5, r7) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x007c, code lost:
        r6[2] = r6[2] + 1;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0096, code lost:
        if ((java.lang.Math.abs(((r6[0] + r6[1]) + r6[2]) - r20) * 5) < (r20 * 2)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x009d, code lost:
        if (b(r6) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00a7, code lost:
        return (r7 - (r6[1] / 2)) - r6[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00a8, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00a8, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00a8, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00a8, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00a8, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x002b, code lost:
        r11 = r19 * 1.5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0035, code lost:
        if (r6[1] <= r11) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x003a, code lost:
        if (r7 < 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0040, code lost:
        if (r3.b(r5, r7) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0042, code lost:
        r10 = r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0044, code lost:
        if (r10 > r19) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0046, code lost:
        r6[0] = r10 + 1;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0051, code lost:
        if (r6[0] <= (r19 / 2)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0054, code lost:
        r7 = r16 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0056, code lost:
        if (r7 >= r4) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float a(int r16, int r17, int r18, int r19, int r20) {
        /*
            r15 = this;
            r0 = r18
            r1 = r19
            r2 = r15
            com.huawei.hms.scankit.p.y r3 = r2.f7708f
            int r4 = r3.b()
            r5 = r17
        Ld:
            if (r5 > r0) goto Lad
            int[] r6 = r15.d()
            r7 = r16
        L15:
            r8 = 1
            if (r7 < 0) goto L29
            boolean r9 = r3.b(r5, r7)
            if (r9 != 0) goto L29
            r9 = r6[r8]
            if (r9 > r1) goto L29
            int r9 = r9 + 1
            r6[r8] = r9
            int r7 = r7 + (-1)
            goto L15
        L29:
            if (r7 < 0) goto La8
            r9 = r6[r8]
            double r9 = (double) r9
            double r11 = (double) r1
            r13 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r11 = r11 * r13
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L39
            goto La8
        L39:
            r9 = 0
            if (r7 < 0) goto L4d
            boolean r10 = r3.b(r5, r7)
            if (r10 == 0) goto L4d
            r10 = r6[r9]
            if (r10 > r1) goto L4d
            int r10 = r10 + 1
            r6[r9] = r10
            int r7 = r7 + (-1)
            goto L39
        L4d:
            r7 = r6[r9]
            int r10 = r1 / 2
            if (r7 <= r10) goto L54
            goto La8
        L54:
            int r7 = r16 + 1
        L56:
            if (r7 >= r4) goto L69
            boolean r10 = r3.b(r5, r7)
            if (r10 != 0) goto L69
            r10 = r6[r8]
            if (r10 > r1) goto L69
            int r10 = r10 + 1
            r6[r8] = r10
            int r7 = r7 + 1
            goto L56
        L69:
            if (r7 < 0) goto La8
            r10 = r6[r8]
            double r13 = (double) r10
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 <= 0) goto L73
            goto La8
        L73:
            r10 = 2
            if (r7 >= r4) goto L84
            boolean r11 = r3.b(r5, r7)
            if (r11 == 0) goto L84
            r11 = r6[r10]
            int r11 = r11 + r8
            r6[r10] = r11
            int r7 = r7 + 1
            goto L73
        L84:
            r9 = r6[r9]
            r11 = r6[r8]
            int r9 = r9 + r11
            r11 = r6[r10]
            int r9 = r9 + r11
            int r9 = r9 - r20
            int r9 = java.lang.Math.abs(r9)
            int r9 = r9 * 5
            int r11 = r20 * 2
            if (r9 < r11) goto L99
            goto La8
        L99:
            boolean r9 = b(r6)
            if (r9 == 0) goto La8
            r0 = r6[r8]
            int r0 = r0 / r10
            int r7 = r7 - r0
            r0 = r6[r10]
            int r7 = r7 - r0
            float r0 = (float) r7
            return r0
        La8:
            int r6 = r0 - r17
            int r5 = r5 + r6
            goto Ld
        Lad:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.a(int, int, int, int, int):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x007d, code lost:
        if (com.huawei.hms.scankit.p.Sa.f7706d != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0081, code lost:
        if (com.huawei.hms.scankit.p.Sa.f7705c != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0083, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0088, code lost:
        if (a(r2, r14) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x008e, code lost:
        return a(r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:?, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:?, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0041, code lost:
        if (r2[3] < r12) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0045, code lost:
        if (r10 >= r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x004b, code lost:
        if (r0.b(r10, r11) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x004d, code lost:
        r8 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x004f, code lost:
        if (r8 >= r12) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0051, code lost:
        r2[4] = r8 + 1;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0058, code lost:
        r11 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x005a, code lost:
        if (r11 < r12) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x005e, code lost:
        if (com.huawei.hms.scankit.p.Sa.f7706d != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0062, code lost:
        if (com.huawei.hms.scankit.p.Sa.f7705c != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0064, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0079, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r11) - r13) * 5) < r13) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float a(int r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            com.huawei.hms.scankit.p.y r0 = r9.f7708f
            int r1 = r0.d()
            int[] r2 = r9.d()
            boolean r3 = r9.a(r10, r11, r12, r2)
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r3 == 0) goto L13
            return r4
        L13:
            r3 = 1
            int r10 = r10 + r3
        L15:
            r5 = 2
            if (r10 >= r1) goto L26
            boolean r6 = r0.b(r10, r11)
            if (r6 == 0) goto L26
            r6 = r2[r5]
            int r6 = r6 + r3
            r2[r5] = r6
            int r10 = r10 + 1
            goto L15
        L26:
            if (r10 != r1) goto L29
            return r4
        L29:
            r6 = 3
            if (r10 >= r1) goto L3d
            boolean r7 = r0.b(r10, r11)
            if (r7 != 0) goto L3d
            r7 = r2[r6]
            if (r7 >= r12) goto L3d
            int r7 = r7 + 1
            r2[r6] = r7
            int r10 = r10 + 1
            goto L29
        L3d:
            if (r10 == r1) goto L8e
            r7 = r2[r6]
            if (r7 < r12) goto L44
            goto L8e
        L44:
            r7 = 4
            if (r10 >= r1) goto L58
            boolean r8 = r0.b(r10, r11)
            if (r8 == 0) goto L58
            r8 = r2[r7]
            if (r8 >= r12) goto L58
            int r8 = r8 + 1
            r2[r7] = r8
            int r10 = r10 + 1
            goto L44
        L58:
            r11 = r2[r7]
            if (r11 < r12) goto L65
            boolean r12 = com.huawei.hms.scankit.p.Sa.f7706d
            if (r12 != 0) goto L65
            boolean r12 = com.huawei.hms.scankit.p.Sa.f7705c
            if (r12 != 0) goto L65
            return r4
        L65:
            r12 = 0
            r12 = r2[r12]
            r0 = r2[r3]
            int r12 = r12 + r0
            r0 = r2[r5]
            int r12 = r12 + r0
            r0 = r2[r6]
            int r12 = r12 + r0
            int r12 = r12 + r11
            int r12 = r12 - r13
            int r11 = java.lang.Math.abs(r12)
            int r11 = r11 * 5
            if (r11 < r13) goto L84
            boolean r11 = com.huawei.hms.scankit.p.Sa.f7706d
            if (r11 != 0) goto L84
            boolean r11 = com.huawei.hms.scankit.p.Sa.f7705c
            if (r11 != 0) goto L84
            return r4
        L84:
            boolean r11 = a(r2, r14)
            if (r11 == 0) goto L8e
            float r4 = a(r2, r10)
        L8e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.a(int, int, int, int, boolean):float");
    }

    private static float a(int[] iArr, int i10) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static float a(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i10;
        float f12 = f11 / i11;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f15 = iArr2[i13] * f12;
            float f16 = iArr[i13];
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    private void a(int r11, int r12, int r13) {
        /*
            r10 = this;
            r0 = 5
            int[] r1 = new int[r0]
            int r2 = r11 + (-1)
        L5:
            if (r2 >= r12) goto L5e
            r10.a(r1)
            int[] r3 = new int[r0]
            r4 = 0
            r3[r4] = r4
            r5 = 1
            r3[r5] = r2
            r6 = 2
            r3[r6] = r4
            r7 = 3
            r3[r7] = r13
            r7 = 4
            r3[r7] = r11
            r8 = 0
        L1c:
            if (r8 >= r13) goto L39
            r3[r6] = r8
            com.huawei.hms.scankit.p.y r9 = r10.f7708f
            boolean r9 = r9.b(r8, r2)
            if (r9 == 0) goto L2c
            r10.a(r1, r3)
            goto L33
        L2c:
            boolean r9 = r10.b(r1, r3)
            if (r9 == 0) goto L33
            goto L37
        L33:
            r8 = r3[r6]
            r11 = r3[r7]
        L37:
            int r8 = r8 + r5
            goto L1c
        L39:
            boolean r5 = b(r1)
            if (r5 == 0) goto L4e
            r3 = r3[r4]
            r5 = r13
        L42:
            if (r3 <= r6) goto L4a
            r7 = r1[r3]
            int r5 = r5 - r7
            int r3 = r3 + (-1)
            goto L42
        L4a:
            r10.b(r1, r2, r5)
            goto L4f
        L4e:
            r5 = r13
        L4f:
            boolean r3 = a(r1, r4)
            if (r3 == 0) goto L5c
            boolean r3 = r10.a(r1, r2, r5, r4)
            if (r3 == 0) goto L5c
            r11 = 2
        L5c:
            int r2 = r2 + r11
            goto L5
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.a(int, int, int):void");
    }

    private void a(int[] iArr, int[] iArr2) {
        int i10 = iArr2[0];
        if ((i10 & 1) == 1) {
            iArr2[0] = i10 + 1;
        }
        int i11 = iArr2[0];
        if (i11 >= 0 && i11 < iArr.length) {
            iArr[i11] = iArr[i11] + 1;
        }
        if (iArr2[2] == iArr2[3] - 1 && iArr2[0] == 4) {
            if (a(iArr, false)) {
                boolean a10 = a(iArr, iArr2[1], iArr2[2], false);
                if (a10) {
                    iArr2[4] = 2;
                }
                if (!a10) {
                    a10 = a(iArr, iArr2[1], iArr2[2]);
                }
                if (a10) {
                    iArr2[0] = 0;
                    a(iArr);
                    while (iArr2[2] < this.f7708f.d() && !this.f7708f.b(iArr2[2], iArr2[1])) {
                        iArr2[2] = iArr2[2] + 1;
                    }
                }
            }
            if (_a.f7793d && a(iArr, true) && a(iArr, iArr2[1], iArr2[2], true)) {
                iArr2[0] = 0;
                a(iArr);
            }
        }
    }

    private boolean a(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int[] d10 = d();
        int i15 = 0;
        while (i10 >= i15 && i11 >= i15 && this.f7708f.b(i11 - i15, i10 - i15)) {
            d10[2] = d10[2] + 1;
            i15++;
        }
        if (d10[2] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && !this.f7708f.b(i11 - i15, i10 - i15)) {
            d10[1] = d10[1] + 1;
            i15++;
        }
        if (d10[1] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && this.f7708f.b(i11 - i15, i10 - i15)) {
            d10[0] = d10[0] + 1;
            i15++;
        }
        if (d10[0] == 0) {
            return false;
        }
        int b10 = this.f7708f.b();
        int d11 = this.f7708f.d();
        int i16 = 1;
        while (true) {
            int i17 = i10 + i16;
            if (i17 >= b10 || (i14 = i11 + i16) >= d11 || !this.f7708f.b(i14, i17)) {
                break;
            }
            d10[2] = d10[2] + 1;
            i16++;
        }
        while (true) {
            int i18 = i10 + i16;
            if (i18 >= b10 || (i13 = i11 + i16) >= d11 || this.f7708f.b(i13, i18)) {
                break;
            }
            d10[3] = d10[3] + 1;
            i16++;
        }
        if (d10[3] == 0) {
            return false;
        }
        while (true) {
            int i19 = i10 + i16;
            if (i19 >= b10 || (i12 = i11 + i16) >= d11 || !this.f7708f.b(i12, i19)) {
                break;
            }
            d10[4] = d10[4] + 1;
            i16++;
        }
        if (d10[4] == 0) {
            return false;
        }
        return c(d10);
    }

    private boolean a(int i10, int i11, int i12, int[] iArr) {
        int i13;
        C0736y c0736y = this.f7708f;
        while (i10 >= 0 && c0736y.b(i10, i11)) {
            iArr[2] = iArr[2] + 1;
            i10--;
        }
        if (i10 < 0) {
            return true;
        }
        while (i10 >= 0 && !c0736y.b(i10, i11)) {
            int i14 = iArr[1];
            if (i14 > i12) {
                break;
            }
            iArr[1] = i14 + 1;
            i10--;
        }
        if (i10 < 0 || iArr[1] > i12) {
            return true;
        }
        while (i10 >= 0 && c0736y.b(i10, i11) && (i13 = iArr[0]) <= i12) {
            iArr[0] = i13 + 1;
            i10--;
        }
        return (iArr[0] <= i12 || f7706d || f7705c) ? false : true;
    }

    private boolean a(boolean z10, float f10, float f11, float f12) {
        int i10 = 0;
        while (true) {
            if (i10 >= this.f7710h.size()) {
                break;
            }
            Qa qa2 = this.f7710h.get(i10);
            if (qa2.a(f12, f10, f11)) {
                this.f7710h.set(i10, qa2.a(f10, f11, f12, false));
                z10 = true;
                break;
            }
            i10++;
        }
        if (!z10) {
            Qa qa3 = new Qa(f11, f10, f12, false);
            this.f7710h.add(qa3);
            com.huawei.hms.scankit.aiscan.common.A a10 = this.f7712j;
            if (a10 != null) {
                a10.a(qa3);
            }
        }
        return true;
    }

    public static boolean a(int[] iArr, boolean z10) {
        float f10;
        float f11;
        e();
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        if (z10 && _a.f7793d) {
            f10 = 0.75f;
            f11 = 1.0f;
        } else {
            f10 = 0.5f;
            f11 = 3.0f;
        }
        float f12 = i10 / 7.0f;
        float f13 = f10 * f12;
        if (Math.abs(f12 - iArr[0]) >= f13 || Math.abs(f12 - iArr[1]) >= f13 || Math.abs((3.0f * f12) - iArr[2]) >= f11 * f13 || Math.abs(f12 - iArr[3]) >= f13 || Math.abs(f12 - iArr[4]) >= f13) {
            if (z10) {
                int[] iArr2 = new int[iArr.length - 1];
                int i13 = 0;
                while (i13 < iArr.length - 1) {
                    int i14 = i13 + 1;
                    iArr2[i13] = iArr[i14];
                    i13 = i14;
                }
                int[] iArr3 = new int[iArr.length - 1];
                for (int i15 = 0; i15 < iArr.length - 1; i15++) {
                    iArr3[i15] = iArr[i15];
                }
                float a10 = a(iArr2, f7703a, 0.5f);
                float a11 = a(iArr3, f7704b, 0.5f);
                boolean z11 = a10 < 0.3f;
                f7705c = z11;
                boolean z12 = a11 < 0.3f;
                f7706d = z12;
                return z11 || z12;
            }
            return false;
        }
        return true;
    }

    private Qa[] a(boolean z10) {
        float f10;
        Collections.sort(this.f7709g, f7707e);
        float f11 = z10 ? 0.4f : 0.25f;
        double[] dArr = new double[3];
        Qa[] qaArr = new Qa[3];
        int i10 = 0;
        double d10 = Double.MAX_VALUE;
        while (true) {
            char c10 = 2;
            if (i10 >= this.f7709g.size() - 2) {
                break;
            }
            Qa qa2 = this.f7709g.get(i10);
            float e10 = qa2.e();
            i10++;
            int i11 = i10;
            while (i11 < this.f7709g.size() - 1) {
                Qa qa3 = this.f7709g.get(i11);
                double a10 = a(qa2, qa3);
                i11++;
                int i12 = i11;
                while (i12 < this.f7709g.size()) {
                    Qa qa4 = this.f7709g.get(i12);
                    if (qa4.e() <= 1.4f * e10) {
                        dArr[0] = a10;
                        dArr[1] = a(qa3, qa4);
                        dArr[c10] = a(qa2, qa4);
                        Arrays.sort(dArr);
                        double abs = Math.abs(dArr[c10] - (dArr[0] * 2.0d)) + Math.abs(dArr[c10] - (dArr[1] * 2.0d));
                        double d11 = dArr[c10];
                        double d12 = abs / d11;
                        double d13 = dArr[1];
                        double d14 = dArr[0];
                        double sqrt = ((d13 + d14) - d11) / (Math.sqrt(dArr[1]) * (Math.sqrt(d14) * 2.0d));
                        if (d12 < d10) {
                            f10 = e10;
                            if (Math.abs(sqrt) < f11) {
                                qaArr[0] = qa2;
                                qaArr[1] = qa3;
                                c10 = 2;
                                qaArr[2] = qa4;
                                d10 = d12;
                            } else {
                                c10 = 2;
                            }
                            i12++;
                            e10 = f10;
                        }
                    }
                    f10 = e10;
                    i12++;
                    e10 = f10;
                }
            }
        }
        if (Double.MAX_VALUE != d10) {
            return qaArr;
        }
        throw C0628a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x002d, code lost:
        if (r2[3] <= r11) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0031, code lost:
        if (r9 >= r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0037, code lost:
        if (r0.b(r10, r9) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0039, code lost:
        r2[4] = r2[4] + 1;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0041, code lost:
        r10 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0043, code lost:
        if (r10 <= r11) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0045, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x005d, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r10) - r12) * 5) < (r12 * 2)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005f, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0064, code lost:
        if (a(r2, true) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x006a, code lost:
        return a(r2, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
        return Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float b(int r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            com.huawei.hms.scankit.p.y r0 = r8.f7708f
            int r1 = r0.b()
            int[] r2 = r8.d()
            boolean r3 = r8.d(r9, r10, r11, r2)
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r3 == 0) goto L13
            return r4
        L13:
            r3 = 1
            int r9 = r9 + r3
        L15:
            r5 = 3
            if (r9 >= r1) goto L29
            boolean r6 = r0.b(r10, r9)
            if (r6 != 0) goto L29
            r6 = r2[r5]
            if (r6 > r11) goto L29
            int r6 = r6 + 1
            r2[r5] = r6
            int r9 = r9 + 1
            goto L15
        L29:
            if (r9 < 0) goto L6a
            r6 = r2[r5]
            if (r6 <= r11) goto L30
            goto L6a
        L30:
            r6 = 4
            if (r9 >= r1) goto L41
            boolean r7 = r0.b(r10, r9)
            if (r7 == 0) goto L41
            r7 = r2[r6]
            int r7 = r7 + r3
            r2[r6] = r7
            int r9 = r9 + 1
            goto L30
        L41:
            r10 = r2[r6]
            if (r10 <= r11) goto L46
            return r4
        L46:
            r11 = 0
            r11 = r2[r11]
            r0 = r2[r3]
            int r11 = r11 + r0
            r0 = 2
            r1 = r2[r0]
            int r11 = r11 + r1
            r1 = r2[r5]
            int r11 = r11 + r1
            int r11 = r11 + r10
            int r11 = r11 - r12
            int r10 = java.lang.Math.abs(r11)
            int r10 = r10 * 5
            int r12 = r12 * 2
            if (r10 < r12) goto L60
            return r4
        L60:
            boolean r10 = a(r2, r3)
            if (r10 == 0) goto L6a
            float r4 = a(r2, r9)
        L6a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.b(int, int, int, int):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0058, code lost:
        r11 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x005a, code lost:
        if (r11 < r12) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x005e, code lost:
        if (com.huawei.hms.scankit.p.Sa.f7706d != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0062, code lost:
        if (com.huawei.hms.scankit.p.Sa.f7705c != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0064, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0065, code lost:
        r12 = (((r2[0] + r2[1]) + r2[2]) + r2[3]) + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0072, code lost:
        if (r14 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x007d, code lost:
        if ((java.lang.Math.abs(r12 - r13) * 5) < (r13 * 3)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0081, code lost:
        if (com.huawei.hms.scankit.p.Sa.f7706d != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0085, code lost:
        if (com.huawei.hms.scankit.p.Sa.f7705c != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0087, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x008a, code lost:
        if (r12 >= (r13 * 3)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x008e, code lost:
        if ((r12 * 3) > r13) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0095, code lost:
        if (a(r2, r14) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x009b, code lost:
        return a(r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:?, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:?, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:?, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:?, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0041, code lost:
        if (r2[3] < r12) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0045, code lost:
        if (r10 >= r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x004b, code lost:
        if (r0.b(r11, r10) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x004d, code lost:
        r8 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x004f, code lost:
        if (r8 >= r12) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0051, code lost:
        r2[4] = r8 + 1;
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float b(int r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            com.huawei.hms.scankit.p.y r0 = r9.f7708f
            int r1 = r0.b()
            int[] r2 = r9.d()
            boolean r3 = r9.b(r10, r11, r12, r2)
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r3 == 0) goto L13
            return r4
        L13:
            r3 = 1
            int r10 = r10 + r3
        L15:
            r5 = 2
            if (r10 >= r1) goto L26
            boolean r6 = r0.b(r11, r10)
            if (r6 == 0) goto L26
            r6 = r2[r5]
            int r6 = r6 + r3
            r2[r5] = r6
            int r10 = r10 + 1
            goto L15
        L26:
            if (r10 != r1) goto L29
            return r4
        L29:
            r6 = 3
            if (r10 >= r1) goto L3d
            boolean r7 = r0.b(r11, r10)
            if (r7 != 0) goto L3d
            r7 = r2[r6]
            if (r7 >= r12) goto L3d
            int r7 = r7 + 1
            r2[r6] = r7
            int r10 = r10 + 1
            goto L29
        L3d:
            if (r10 == r1) goto L9b
            r7 = r2[r6]
            if (r7 < r12) goto L44
            goto L9b
        L44:
            r7 = 4
            if (r10 >= r1) goto L58
            boolean r8 = r0.b(r11, r10)
            if (r8 == 0) goto L58
            r8 = r2[r7]
            if (r8 >= r12) goto L58
            int r8 = r8 + 1
            r2[r7] = r8
            int r10 = r10 + 1
            goto L44
        L58:
            r11 = r2[r7]
            if (r11 < r12) goto L65
            boolean r12 = com.huawei.hms.scankit.p.Sa.f7706d
            if (r12 != 0) goto L65
            boolean r12 = com.huawei.hms.scankit.p.Sa.f7705c
            if (r12 != 0) goto L65
            return r4
        L65:
            r12 = 0
            r12 = r2[r12]
            r0 = r2[r3]
            int r12 = r12 + r0
            r0 = r2[r5]
            int r12 = r12 + r0
            r0 = r2[r6]
            int r12 = r12 + r0
            int r12 = r12 + r11
            if (r14 == 0) goto L88
            int r12 = r12 - r13
            int r11 = java.lang.Math.abs(r12)
            int r11 = r11 * 5
            int r13 = r13 * 3
            if (r11 < r13) goto L91
            boolean r11 = com.huawei.hms.scankit.p.Sa.f7706d
            if (r11 != 0) goto L91
            boolean r11 = com.huawei.hms.scankit.p.Sa.f7705c
            if (r11 != 0) goto L91
            return r4
        L88:
            int r11 = r13 * 3
            if (r12 >= r11) goto L9b
            int r12 = r12 * 3
            if (r12 > r13) goto L91
            goto L9b
        L91:
            boolean r11 = a(r2, r14)
            if (r11 == 0) goto L9b
            float r4 = a(r2, r10)
        L9b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.b(int, int, int, int, boolean):float");
    }

    private boolean b(int i10, int i11, int i12, int[] iArr) {
        int i13;
        C0736y c0736y = this.f7708f;
        while (i10 >= 0 && c0736y.b(i11, i10)) {
            iArr[2] = iArr[2] + 1;
            i10--;
        }
        if (i10 < 0) {
            return true;
        }
        while (i10 >= 0 && !c0736y.b(i11, i10)) {
            int i14 = iArr[1];
            if (i14 > i12) {
                break;
            }
            iArr[1] = i14 + 1;
            i10--;
        }
        if (i10 < 0 || iArr[1] > i12) {
            return true;
        }
        while (i10 >= 0 && c0736y.b(i11, i10) && (i13 = iArr[0]) <= i12) {
            iArr[0] = i13 + 1;
            i10--;
        }
        return (iArr[0] <= i12 || f7706d || f7705c) ? false : true;
    }

    public static boolean b(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = 0.5f * f10;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs((5.0f * f10) - ((float) iArr[1])) < f11 && Math.abs(f10 - ((float) iArr[2])) < f11;
    }

    private boolean b(int[] iArr, int[] iArr2) {
        int i10 = iArr2[0];
        if ((i10 & 1) != 0) {
            iArr[i10] = iArr[i10] + 1;
        } else if (i10 == 4) {
            if (a(iArr, false)) {
                boolean a10 = a(iArr, iArr2[1], iArr2[2], false);
                if (a10) {
                    iArr2[4] = 2;
                }
                if (!a10) {
                    a10 = a(iArr, iArr2[1], iArr2[2]);
                }
                if (a10) {
                    iArr2[0] = 0;
                    a(iArr);
                    return true;
                }
            }
            if (b(iArr)) {
                int i11 = iArr2[2];
                for (int i12 = iArr2[0]; i12 > 2; i12--) {
                    i11 -= iArr[i12];
                }
                if (b(iArr, iArr2[1], i11)) {
                    d(iArr);
                    iArr2[0] = 3;
                    return true;
                }
            }
            if (_a.f7793d && a(iArr, true) && a(iArr, iArr2[1], iArr2[2], true)) {
                iArr2[0] = 0;
                a(iArr);
                return true;
            }
            d(iArr);
            iArr2[0] = 3;
        } else {
            int i13 = i10 + 1;
            iArr2[0] = i13;
            iArr[i13] = iArr[i13] + 1;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.huawei.hms.scankit.p.Qa[] b() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.b():com.huawei.hms.scankit.p.Qa[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x001a, code lost:
        if (r8[1] <= r7) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x001e, code lost:
        if (r5 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0024, code lost:
        if (r0.b(r6, r5) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0026, code lost:
        r3 = r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0028, code lost:
        if (r3 > r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x002a, code lost:
        r8[0] = r3 + 1;
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0033, code lost:
        if (r8[0] <= r7) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0035, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0036, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c(int r5, int r6, int r7, int[] r8) {
        /*
            r4 = this;
            com.huawei.hms.scankit.p.y r0 = r4.f7708f
        L2:
            r1 = 1
            if (r5 < 0) goto L16
            boolean r2 = r0.b(r6, r5)
            if (r2 != 0) goto L16
            r2 = r8[r1]
            if (r2 > r7) goto L16
            int r2 = r2 + 1
            r8[r1] = r2
            int r5 = r5 + (-1)
            goto L2
        L16:
            if (r5 < 0) goto L37
            r2 = r8[r1]
            if (r2 <= r7) goto L1d
            goto L37
        L1d:
            r2 = 0
            if (r5 < 0) goto L31
            boolean r3 = r0.b(r6, r5)
            if (r3 == 0) goto L31
            r3 = r8[r2]
            if (r3 > r7) goto L31
            int r3 = r3 + 1
            r8[r2] = r3
            int r5 = r5 + (-1)
            goto L1d
        L31:
            r5 = r8[r2]
            if (r5 <= r7) goto L36
            return r1
        L36:
            return r2
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.c(int, int, int, int[]):boolean");
    }

    public static boolean c(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = 0.75f * f10;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    private Qa[] c() {
        Qa[] a10 = this.f7709g.size() > 2 ? a(true) : null;
        if (this.f7709g.size() == 2) {
            int i10 = this.f7709g.get(0).e() > this.f7709g.get(1).e() ? 0 : 1;
            if (Math.max(this.f7709g.get(0).e(), this.f7709g.get(1).e()) / Math.min(this.f7709g.get(0).e(), this.f7709g.get(1).e()) > 1.5d) {
                this.f7709g.clear();
                this.f7709g.add(this.f7709g.get(i10));
            }
        }
        if (this.f7709g.size() == 1 && this.f7710h.size() > 1) {
            a10 = g();
        }
        if (this.f7709g.size() == 1 && this.f7710h.size() == 1) {
            this.f7709g.addAll(this.f7710h);
            this.f7710h.clear();
        }
        if (this.f7709g.size() == 2) {
            try {
                a10 = h();
            } catch (C0628a unused) {
                a10 = b();
            }
        }
        if (this.f7709g.size() == 0) {
            this.f7709g.addAll(this.f7710h);
            return this.f7709g.size() < 20 ? a(false) : f();
        }
        return a10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x005c, code lost:
        r3 = r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x005e, code lost:
        if (r3 > r7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0060, code lost:
        r8[0] = r3 + 1;
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0069, code lost:
        if (r8[0] <= r7) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x006b, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x006c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0036, code lost:
        if (r8[2] <= r7) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0039, code lost:
        if (r5 < 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x003f, code lost:
        if (r0.b(r6, r5) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0041, code lost:
        r1 = r8[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0043, code lost:
        if (r1 > r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0045, code lost:
        r8[1] = r1 + 1;
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x004c, code lost:
        if (r5 < 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0050, code lost:
        if (r8[1] <= r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0054, code lost:
        if (r5 < 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x005a, code lost:
        if (r0.b(r6, r5) == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean d(int r5, int r6, int r7, int[] r8) {
        /*
            r4 = this;
            com.huawei.hms.scankit.p.y r0 = r4.f7708f
        L2:
            r1 = 3
            if (r5 < 0) goto L16
            boolean r2 = r0.b(r6, r5)
            if (r2 != 0) goto L16
            r2 = r8[r1]
            if (r2 > r7) goto L16
            int r2 = r2 + 1
            r8[r1] = r2
            int r5 = r5 + (-1)
            goto L2
        L16:
            r2 = 1
            if (r5 < 0) goto L6d
            r1 = r8[r1]
            if (r1 <= r7) goto L1e
            goto L6d
        L1e:
            r1 = 2
            if (r5 < 0) goto L32
            boolean r3 = r0.b(r6, r5)
            if (r3 == 0) goto L32
            r3 = r8[r1]
            if (r3 > r7) goto L32
            int r3 = r3 + 1
            r8[r1] = r3
            int r5 = r5 + (-1)
            goto L1e
        L32:
            if (r5 < 0) goto L6d
            r1 = r8[r1]
            if (r1 <= r7) goto L39
            goto L6d
        L39:
            if (r5 < 0) goto L4c
            boolean r1 = r0.b(r6, r5)
            if (r1 != 0) goto L4c
            r1 = r8[r2]
            if (r1 > r7) goto L4c
            int r1 = r1 + 1
            r8[r2] = r1
            int r5 = r5 + (-1)
            goto L39
        L4c:
            if (r5 < 0) goto L6d
            r1 = r8[r2]
            if (r1 <= r7) goto L53
            goto L6d
        L53:
            r1 = 0
            if (r5 < 0) goto L67
            boolean r3 = r0.b(r6, r5)
            if (r3 == 0) goto L67
            r3 = r8[r1]
            if (r3 > r7) goto L67
            int r3 = r3 + 1
            r8[r1] = r3
            int r5 = r5 + (-1)
            goto L53
        L67:
            r5 = r8[r1]
            if (r5 <= r7) goto L6c
            return r2
        L6c:
            return r1
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.d(int, int, int, int[]):boolean");
    }

    private int[] d() {
        a(this.f7711i);
        return this.f7711i;
    }

    private static void e() {
        f7705c = false;
        f7706d = false;
    }

    private Qa[] f() {
        float f10;
        int size = this.f7709g.size();
        if (size >= 3) {
            float f11 = 0.0f;
            if (size > 3) {
                float f12 = 0.0f;
                float f13 = 0.0f;
                for (Qa qa2 : this.f7709g) {
                    float e10 = qa2.e();
                    f12 += e10;
                    f13 += e10 * e10;
                }
                float f14 = f12 / size;
                float sqrt = (float) Math.sqrt((f13 / f10) - (f14 * f14));
                Collections.sort(this.f7709g, new c(f14));
                float max = Math.max(0.2f * f14, sqrt);
                int i10 = 0;
                while (i10 < this.f7709g.size() && this.f7709g.size() > 3) {
                    if (Math.abs(this.f7709g.get(i10).e() - f14) > max) {
                        this.f7709g.remove(i10);
                        i10--;
                    }
                    i10++;
                }
            }
            if (this.f7709g.size() > 3) {
                for (Qa qa3 : this.f7709g) {
                    f11 += qa3.e();
                }
                Collections.sort(this.f7709g, new a(f11 / this.f7709g.size()));
                List<Qa> list = this.f7709g;
                list.subList(3, list.size()).clear();
            }
            double[] dArr = {a(this.f7709g.get(0), this.f7709g.get(1)), a(this.f7709g.get(1), this.f7709g.get(2)), a(this.f7709g.get(0), this.f7709g.get(2))};
            Arrays.sort(dArr);
            double d10 = dArr[1];
            double d11 = dArr[0];
            if (Math.abs(((d10 + d11) - dArr[2]) / (Math.sqrt(dArr[1]) * (Math.sqrt(d11) * 2.0d))) <= 0.25d) {
                return new Qa[]{this.f7709g.get(0), this.f7709g.get(1), this.f7709g.get(2)};
            }
            throw C0628a.a();
        }
        throw C0628a.a();
    }

    private Qa[] g() {
        Collections.sort(this.f7710h, f7707e);
        double[] dArr = new double[3];
        Qa[] qaArr = new Qa[3];
        int i10 = 0;
        double d10 = Double.MAX_VALUE;
        while (i10 < this.f7709g.size()) {
            Qa qa2 = this.f7709g.get(i10);
            float e10 = qa2.e();
            int i11 = 0;
            while (i11 < this.f7710h.size() - 1) {
                Qa qa3 = this.f7710h.get(i11);
                double e11 = qa3.e() / e10;
                if (e11 <= 1.25d && e11 >= 0.75d) {
                    double a10 = a(qa2, qa3);
                    if (Math.sqrt(a10) >= e10 * 13.0f) {
                        int i12 = i11 + 1;
                        while (i12 < this.f7710h.size()) {
                            Qa qa4 = this.f7710h.get(i12);
                            int i13 = i10;
                            double e12 = qa4.e() / e10;
                            if (e12 <= 1.25d && e12 >= 0.75d) {
                                dArr[0] = a10;
                                dArr[1] = a(qa3, qa4);
                                dArr[2] = a(qa2, qa4);
                                Arrays.sort(dArr);
                                double abs = Math.abs(dArr[2] - (dArr[0] * 2.0d)) + Math.abs(dArr[2] - (dArr[1] * 2.0d));
                                double d11 = dArr[2];
                                double d12 = abs / d11;
                                double d13 = dArr[1];
                                double d14 = dArr[0];
                                double sqrt = ((d13 + d14) - d11) / (Math.sqrt(dArr[1]) * (Math.sqrt(d14) * 2.0d));
                                if (d12 < d10 && Math.abs(sqrt) < 0.2d) {
                                    qaArr[0] = qa2;
                                    qaArr[1] = qa3;
                                    qaArr[2] = qa4;
                                    d10 = d12;
                                }
                            }
                            i12++;
                            i10 = i13;
                        }
                    }
                }
                i11++;
                i10 = i10;
            }
            i10++;
        }
        if (d10 != Double.MAX_VALUE) {
            return qaArr;
        }
        throw C0628a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x01b8, code lost:
        if (r2 == false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.huawei.hms.scankit.p.Qa[] h() {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.h():com.huawei.hms.scankit.p.Qa[]");
    }

    public final Ta a() {
        int b10 = this.f7708f.b();
        int d10 = this.f7708f.d();
        int i10 = (b10 * 3) / 388;
        if (i10 < 3) {
            i10 = 3;
        }
        if (_a.f7798i) {
            i10 = 2;
        }
        a(i10, b10, d10);
        Qa[] c10 = c();
        if (c10 != null) {
            com.huawei.hms.scankit.aiscan.common.z.a(c10);
            double a10 = a(c10[0], c10[1]);
            double a11 = a(c10[1], c10[2]);
            if ((this.f7708f.d() * this.f7708f.b()) / (Math.sqrt(a11) * Math.sqrt(a10)) <= 900.0d) {
                return new Ta(c10);
            }
            throw C0628a.a();
        }
        throw C0628a.a();
    }

    public final void a(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr[i10] = 0;
        }
    }

    public final boolean a(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        float a10 = a(iArr, i11);
        float b10 = b(i10, (int) a10, iArr[2], i12, false);
        if (Float.isNaN(b10)) {
            int i13 = iArr[2];
            int i14 = iArr[1];
            int i15 = iArr[3];
            b10 = a(i10, (int) ((a10 - (i13 / 2)) - (i14 / 2)), (int) ((i13 / 2) + a10 + (i15 / 2)), i14 + i13 + i15, i12);
        }
        if (Float.isNaN(b10)) {
            return false;
        }
        return a(false, b10, a10, i12 / 7.0f);
    }

    public final boolean a(int[] iArr, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        boolean z11 = false;
        int i14 = iArr[0];
        int i15 = iArr[1];
        int i16 = iArr[2];
        int i17 = iArr[3];
        int i18 = iArr[4];
        int i19 = i14 + i15 + i16 + i17 + i18;
        if (f7705c) {
            i12 = i11;
            i13 = i15 + i15 + i16 + i17 + i18;
        } else if (f7706d) {
            i13 = i14 + i15 + i16 + i17 + i17;
            i12 = i11;
        } else {
            i12 = i11;
            i13 = i19;
        }
        int a10 = (int) a(iArr, i12);
        float b10 = b(i10, a10, iArr[2], i13, z10);
        if (!Float.isNaN(b10)) {
            float f10 = i13 / 7.0f;
            int i20 = (int) b10;
            float a11 = a(a10, i20, iArr[2], i13, z10);
            if (!Float.isNaN(a11) && (a(i20, (int) a11) || (z10 && (f7706d || f7705c)))) {
                if (z10) {
                    return a(false, b10, a11, f10);
                }
                int i21 = 0;
                while (true) {
                    if (i21 >= this.f7709g.size()) {
                        break;
                    }
                    Qa qa2 = this.f7709g.get(i21);
                    if (qa2.a(f10, b10, a11)) {
                        this.f7709g.set(i21, qa2.a(b10, a11, f10, true));
                        z11 = true;
                        break;
                    }
                    i21++;
                }
                if (!z11) {
                    Qa qa3 = new Qa(a11, b10, f10, true);
                    this.f7709g.add(qa3);
                    com.huawei.hms.scankit.aiscan.common.A a12 = this.f7712j;
                    if (a12 != null) {
                        a12.a(qa3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean b(int[] iArr, int i10, int i11) {
        int i12;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = i13 + i14 + iArr[2];
        float f10 = i11 - (i15 / 2);
        int i16 = (int) f10;
        float a10 = a(i10, i16, i14, i15);
        if (Float.isNaN(a10)) {
            a10 = a(i10, (int) (f10 - ((i12 * 2) / 5)), (int) (((i12 * 2) / 5) + f10), iArr[1], i15);
            if (Float.isNaN(a10) && _a.f7793d) {
                a10 = b(i10, i16, iArr[1], i15);
            }
        }
        if (Float.isNaN(a10)) {
            return false;
        }
        return a(false, a10, f10, i15 / 7.0f);
    }

    public final void d(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}
