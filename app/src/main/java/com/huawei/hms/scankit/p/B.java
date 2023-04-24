package com.huawei.hms.scankit.p;

/* loaded from: classes.dex */
public final class B extends A {

    /* renamed from: f */
    private static int f7469f = 3;

    /* renamed from: g */
    private static int f7470g = 0;

    /* renamed from: h */
    private static int f7471h = 0;

    /* renamed from: i */
    private static int f7472i = 0;

    /* renamed from: j */
    private static int f7473j = 24;

    /* renamed from: k */
    private C0736y f7474k;

    static {
        int i10 = 1 << f7469f;
        f7470g = i10;
        f7471h = i10 - 1;
        f7472i = i10 * 5;
    }

    public B(com.huawei.hms.scankit.aiscan.common.m mVar) {
        super(mVar);
        a(_a.f7798i);
    }

    private static int a(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    private static C0736y a(byte[] bArr, int i10, int i11, int i12, int i13, int[][] iArr) {
        int i14;
        int i15;
        int i16;
        int[] iArr2 = new int[i10 * i11];
        for (int i17 = 0; i17 < i11; i17++) {
            int a10 = a(i17, 2, i11 - 3);
            for (int i18 = 0; i18 < i10; i18++) {
                int a11 = a(i18, 2, i10 - 3);
                int[] iArr3 = iArr[a10 + 2];
                int i19 = a11 + 2;
                int i20 = iArr3[i19];
                if (a10 == 2 && a11 == 2) {
                    i16 = 0;
                } else if (a10 == 2) {
                    i15 = iArr3[a11 - 3];
                    i16 = 0;
                    i14 = 0;
                    iArr2[(i17 * i10) + i18] = (((i20 + i14) - i16) - i15) / 25;
                } else if (a11 == 2) {
                    i16 = iArr[a10 - 3][i19];
                } else {
                    int[] iArr4 = iArr[a10 - 3];
                    int i21 = a11 - 3;
                    i14 = iArr4[i21];
                    int i22 = iArr4[i19];
                    i15 = iArr3[i21];
                    i16 = i22;
                    iArr2[(i17 * i10) + i18] = (((i20 + i14) - i16) - i15) / 25;
                }
                i15 = 0;
                i14 = 0;
                iArr2[(i17 * i10) + i18] = (((i20 + i14) - i16) - i15) / 25;
            }
        }
        return new C0736y(i12, i13, (i12 + 31) / 32, a(bArr, iArr2, i10, i11, i12, i13));
    }

    private void a(boolean z10) {
        int i10;
        if (z10) {
            f7469f = 2;
            i10 = 1 << 2;
        } else {
            f7469f = 3;
            i10 = 1 << 3;
        }
        f7470g = i10;
        f7471h = i10 - 1;
        f7472i = i10 * 5;
    }

    private static int[] a(int i10, int i11, int i12, byte[] bArr) {
        int i13 = (i11 * i12) + i10;
        int i14 = 0;
        int i15 = 0;
        int i16 = 255;
        int i17 = 0;
        while (i14 < f7470g) {
            for (int i18 = 0; i18 < f7470g; i18++) {
                int i19 = bArr[i13 + i18] & 255;
                i15 += i19;
                if (i19 < i16) {
                    i16 = i19;
                }
                if (i19 > i17) {
                    i17 = i19;
                }
            }
            if (i17 - i16 <= f7473j) {
                i14++;
                i13 += i12;
            }
            while (true) {
                i14++;
                i13 += i12;
                if (i14 < f7470g) {
                    for (int i20 = 0; i20 < f7470g; i20++) {
                        i15 += bArr[i13 + i20] & 255;
                    }
                }
            }
            i14++;
            i13 += i12;
        }
        return new int[]{i15, i16, i17};
    }

    private static int[] a(byte[] bArr, int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = (i12 + 31) / 32;
        int i15 = i14 * i13;
        int[] iArr2 = new int[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            iArr2[i16] = 0;
        }
        int i17 = f7470g;
        for (int i18 = 0; i18 < i13; i18++) {
            int i19 = i18 / i17;
            for (int i20 = 0; i20 < i12; i20++) {
                if ((bArr[(i18 * i12) + i20] & 255) <= iArr[(i19 * i10) + (i20 / i17)]) {
                    int i21 = (i20 / 32) + (i18 * i14);
                    if (i21 < i15) {
                        iArr2[i21] = iArr2[i21] | (1 << (i20 & 31));
                    }
                }
            }
        }
        return iArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0071, code lost:
        if (r8 < r7) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[][] a(byte[] r20, int r21, int r22, int r23, int r24) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            int r3 = com.huawei.hms.scankit.p.B.f7470g
            int r4 = r24 - r3
            int r3 = r2 - r3
            r5 = 2
            int[] r6 = new int[r5]
            r7 = 1
            r6[r7] = r0
            r8 = 0
            r6[r8] = r1
            java.lang.Class r9 = java.lang.Integer.TYPE
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r9, r6)
            int[][] r6 = (int[][]) r6
            int[] r10 = new int[r5]
            r10[r7] = r0
            r10[r8] = r1
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r9, r10)
            int[][] r9 = (int[][]) r9
            r10 = 0
        L2a:
            if (r10 >= r1) goto La2
            int r11 = com.huawei.hms.scankit.p.B.f7469f
            int r11 = r10 << r11
            if (r11 <= r4) goto L33
            r11 = r4
        L33:
            r12 = 0
            r13 = 0
        L35:
            if (r12 >= r0) goto L9b
            int r14 = com.huawei.hms.scankit.p.B.f7469f
            int r14 = r12 << r14
            r15 = r20
            if (r14 <= r3) goto L40
            r14 = r3
        L40:
            int[] r14 = a(r14, r11, r2, r15)
            r16 = r14[r8]
            r8 = r14[r7]
            r14 = r14[r5]
            int r17 = com.huawei.hms.scankit.p.B.f7469f
            int r17 = r17 * 2
            int r16 = r16 >> r17
            int r14 = r14 - r8
            int r7 = com.huawei.hms.scankit.p.B.f7473j
            if (r14 > r7) goto L74
            int r16 = r8 / 2
            if (r10 <= 0) goto L74
            if (r12 <= 0) goto L74
            int r7 = r10 + (-1)
            r7 = r9[r7]
            r14 = r7[r12]
            r18 = r9[r10]
            int r19 = r12 + (-1)
            r18 = r18[r19]
            int r18 = r18 * 2
            int r18 = r18 + r14
            r7 = r7[r19]
            int r18 = r18 + r7
            int r7 = r18 / 4
            if (r8 >= r7) goto L74
            goto L76
        L74:
            r7 = r16
        L76:
            int r13 = r13 + r7
            r8 = r9[r10]
            r8[r12] = r7
            if (r10 != 0) goto L84
            if (r12 != 0) goto L84
            r8 = r6[r10]
            r8[r12] = r7
            goto L96
        L84:
            if (r10 != 0) goto L8b
            r7 = r6[r10]
            r7[r12] = r13
            goto L96
        L8b:
            r7 = r6[r10]
            int r8 = r10 + (-1)
            r8 = r6[r8]
            r8 = r8[r12]
            int r8 = r8 + r13
            r7[r12] = r8
        L96:
            int r12 = r12 + 1
            r7 = 1
            r8 = 0
            goto L35
        L9b:
            r15 = r20
            int r10 = r10 + 1
            r7 = 1
            r8 = 0
            goto L2a
        La2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.B.a(byte[], int, int, int, int):int[][]");
    }

    @Override // com.huawei.hms.scankit.p.A, com.huawei.hms.scankit.p.AbstractC0724v
    public AbstractC0724v a(com.huawei.hms.scankit.aiscan.common.m mVar) {
        return new B(mVar);
    }

    @Override // com.huawei.hms.scankit.p.A, com.huawei.hms.scankit.p.AbstractC0724v
    public C0736y a() {
        C0736y a10;
        C0736y c0736y = this.f7474k;
        if (c0736y != null) {
            return c0736y;
        }
        com.huawei.hms.scankit.aiscan.common.m c10 = c();
        int c11 = c10.c();
        int a11 = c10.a();
        int i10 = f7472i;
        if (c11 < i10 || a11 < i10) {
            a10 = super.a();
        } else {
            byte[] b10 = c10.b();
            int i11 = f7469f;
            int i12 = c11 >> i11;
            int i13 = f7471h;
            if ((c11 & i13) != 0) {
                i12++;
            }
            int i14 = a11 >> i11;
            if ((i13 & a11) != 0) {
                i14++;
            }
            int i15 = i14;
            a10 = a(b10, i12, i15, c11, a11, a(b10, i12, i15, c11, a11));
        }
        this.f7474k = a10;
        return this.f7474k;
    }
}
