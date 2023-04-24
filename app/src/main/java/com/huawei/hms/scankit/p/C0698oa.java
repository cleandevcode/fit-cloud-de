package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.p.oa */
/* loaded from: classes.dex */
public final class C0698oa {

    /* renamed from: a */
    private static final int[] f8014a = {0, 4, 1, 5};

    /* renamed from: b */
    private static final int[] f8015b = {6, 2, 7, 3};

    /* renamed from: c */
    private static final int[] f8016c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    private static final int[] f8017d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: e */
    private static boolean f8018e = false;

    private static float a(int[] iArr, int[] iArr2, float f10) {
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

    public static C0721ua a(C0728w c0728w, Map<EnumC0631d, ?> map, boolean z10) {
        C0736y b10 = c0728w.b();
        a(false);
        List<com.huawei.hms.scankit.aiscan.common.z[]> a10 = a(z10, b10);
        if (a10.isEmpty()) {
            b10 = b10.m4clone();
            b10.e();
            a10 = a(z10, b10);
            a(true);
        }
        return new C0721ua(b10, a10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x001d, code lost:
        if (r5 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0020, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0028, code lost:
        if (r4.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x002a, code lost:
        r5 = (com.huawei.hms.scankit.aiscan.common.z[]) r4.next();
        r7 = r5[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0032, code lost:
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0034, code lost:
        r3 = (int) java.lang.Math.max(r3, r7.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x003e, code lost:
        r5 = r5[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0040, code lost:
        if (r5 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0042, code lost:
        r3 = java.lang.Math.max(r3, (int) r5.c());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<com.huawei.hms.scankit.aiscan.common.z[]> a(boolean r8, com.huawei.hms.scankit.p.C0736y r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
        L8:
            r4 = 0
            r5 = 0
        La:
            int r6 = r9.b()
            if (r3 >= r6) goto L74
            com.huawei.hms.scankit.aiscan.common.z[] r4 = a(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L4f
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L4f
            if (r5 != 0) goto L20
            goto L74
        L20:
            java.util.Iterator r4 = r0.iterator()
        L24:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4c
            java.lang.Object r5 = r4.next()
            com.huawei.hms.scankit.aiscan.common.z[] r5 = (com.huawei.hms.scankit.aiscan.common.z[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L3e
            float r3 = (float) r3
            float r7 = r7.c()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L3e:
            r5 = r5[r6]
            if (r5 == 0) goto L24
            float r5 = r5.c()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L24
        L4c:
            int r3 = r3 + 5
            goto L8
        L4f:
            r0.add(r4)
            if (r8 != 0) goto L55
            goto L74
        L55:
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L62
            float r5 = r5.b()
            int r5 = (int) r5
            r3 = r4[r3]
            goto L6c
        L62:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.b()
            int r5 = (int) r5
            r3 = r4[r3]
        L6c:
            float r3 = r3.c()
            int r3 = (int) r3
            r4 = r5
            r5 = 1
            goto La
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.C0698oa.a(boolean, com.huawei.hms.scankit.p.y):java.util.List");
    }

    public static void a(boolean z10) {
        f8018e = z10;
    }

    private static void a(com.huawei.hms.scankit.aiscan.common.z[] zVarArr, com.huawei.hms.scankit.aiscan.common.z[] zVarArr2, int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            zVarArr[iArr[i10]] = zVarArr2[i10];
        }
    }

    public static boolean a() {
        return f8018e;
    }

    private static int[] a(C0736y c0736y, int i10, int i11, int i12, boolean z10, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i13 = 0;
        while (c0736y.b(i10, i11) && i10 > 0) {
            int i14 = i13 + 1;
            if (i13 >= 3) {
                break;
            }
            i10--;
            i13 = i14;
        }
        int length = iArr.length;
        boolean z11 = z10;
        int i15 = 0;
        int i16 = i10;
        while (i10 < i12) {
            if (c0736y.b(i10, i11) != z11) {
                iArr2[i15] = iArr2[i15] + 1;
            } else {
                if (i15 != length - 1) {
                    i15++;
                } else if (a(iArr2, iArr, 0.8f) < 0.42f) {
                    return new int[]{i16, i10};
                } else {
                    i16 += iArr2[0] + iArr2[1];
                    int i17 = i15 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i17);
                    iArr2[i17] = 0;
                    iArr2[i15] = 0;
                    i15--;
                }
                iArr2[i15] = 1;
                z11 = !z11;
            }
            i10++;
        }
        if (i15 != length - 1 || a(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i16, i10 - 1};
    }

    private static com.huawei.hms.scankit.aiscan.common.z[] a(C0736y c0736y, int i10, int i11) {
        int b10 = c0736y.b();
        int d10 = c0736y.d();
        com.huawei.hms.scankit.aiscan.common.z[] zVarArr = new com.huawei.hms.scankit.aiscan.common.z[8];
        a(zVarArr, a(c0736y, b10, d10, i10, i11, f8016c), f8014a);
        com.huawei.hms.scankit.aiscan.common.z zVar = zVarArr[4];
        if (zVar != null) {
            i11 = (int) zVar.b();
            i10 = (int) zVarArr[4].c();
        }
        a(zVarArr, a(c0736y, b10, d10, i10, i11, f8017d), f8015b);
        return zVarArr;
    }

    private static com.huawei.hms.scankit.aiscan.common.z[] a(C0736y c0736y, int i10, int i11, int i12, int i13, int[] iArr) {
        boolean z10;
        int i14;
        int i15;
        int i16;
        com.huawei.hms.scankit.aiscan.common.z[] zVarArr = new com.huawei.hms.scankit.aiscan.common.z[4];
        int[] iArr2 = new int[iArr.length];
        int i17 = i12;
        while (true) {
            if (i17 >= i10) {
                z10 = false;
                break;
            }
            int[] a10 = a(c0736y, i13, i17, i11, false, iArr, iArr2);
            if (a10 != null) {
                int i18 = i17;
                int[] iArr3 = a10;
                int i19 = i18;
                while (true) {
                    if (i19 <= 0) {
                        i16 = i19;
                        break;
                    }
                    int i20 = i19 - 1;
                    int[] a11 = a(c0736y, i13, i20, i11, false, iArr, iArr2);
                    if (a11 == null) {
                        i16 = i20 + 1;
                        break;
                    }
                    iArr3 = a11;
                    i19 = i20;
                }
                float f10 = i16;
                zVarArr[0] = new com.huawei.hms.scankit.aiscan.common.z(iArr3[0], f10);
                zVarArr[1] = new com.huawei.hms.scankit.aiscan.common.z(iArr3[1], f10);
                i17 = i16;
                z10 = true;
            } else {
                i17 += 5;
            }
        }
        int i21 = i17 + 1;
        if (z10) {
            int[] iArr4 = {(int) zVarArr[0].b(), (int) zVarArr[1].b()};
            int i22 = i21;
            int i23 = 0;
            while (true) {
                if (i22 >= i10) {
                    i14 = i23;
                    i15 = i22;
                    break;
                }
                i14 = i23;
                i15 = i22;
                int[] a12 = a(c0736y, iArr4[0], i22, i11, false, iArr, iArr2);
                if (a12 != null && Math.abs(iArr4[0] - a12[0]) < 5 && Math.abs(iArr4[1] - a12[1]) < 5) {
                    iArr4 = a12;
                    i23 = 0;
                } else if (i14 > 25) {
                    break;
                } else {
                    i23 = i14 + 1;
                }
                i22 = i15 + 1;
            }
            i21 = i15 - (i14 + 1);
            float f11 = i21;
            zVarArr[2] = new com.huawei.hms.scankit.aiscan.common.z(iArr4[0], f11);
            zVarArr[3] = new com.huawei.hms.scankit.aiscan.common.z(iArr4[1], f11);
        }
        if (i21 - i17 < 10) {
            Arrays.fill(zVarArr, (Object) null);
        }
        return zVarArr;
    }
}
