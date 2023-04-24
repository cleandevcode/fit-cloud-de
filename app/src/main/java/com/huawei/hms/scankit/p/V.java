package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class V extends Y {

    /* renamed from: a */
    private static final int[] f7740a = {6, 8, 10, 12, 14};

    /* renamed from: b */
    private static final int[] f7741b = {1, 1, 1, 1};

    /* renamed from: c */
    private static final int[][] f7742c = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: d */
    public static final int[][] f7743d = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: e */
    private int f7744e = -1;

    /* renamed from: f */
    private int f7745f = -1;

    private static void a(C0732x c0732x, int i10, int i11, StringBuilder sb2) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i10 < i11) {
            Y.a(c0732x, i10, iArr);
            int i12 = -1;
            int i13 = 10000;
            for (int i14 = 0; i14 < 10; i14++) {
                int i15 = iArr[i14];
                if (i12 <= i15) {
                    i12 = i15;
                }
                if (i13 >= i15) {
                    i13 = i15;
                }
            }
            if (i12 / i13 > 8) {
                throw C0628a.a();
            }
            for (int i16 = 0; i16 < 5; i16++) {
                int i17 = i16 * 2;
                iArr2[i16] = iArr[i17];
                iArr3[i16] = iArr[i17 + 1];
            }
            sb2.append((char) (b(iArr2) + 48));
            sb2.append((char) (b(iArr3) + 48));
            for (int i18 = 0; i18 < 10; i18++) {
                i10 += iArr[i18];
            }
        }
        if (i10 != i11) {
            throw C0628a.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0023, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(com.huawei.hms.scankit.p.C0732x r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f7744e
            int r0 = r0 * 10
            int r1 = r5.f7745f
            double r1 = (double) r1
            r3 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r1 = r1 * r3
            int r1 = (int) r1
            if (r0 >= r1) goto Lf
            r0 = r1
        Lf:
            r1 = 1
            int r7 = r7 - r1
        L11:
            if (r0 <= 0) goto L21
            if (r7 < 0) goto L21
            boolean r2 = r6.a(r7)
            if (r2 == 0) goto L1c
            goto L21
        L1c:
            int r0 = r0 + (-1)
            int r7 = r7 + (-1)
            goto L11
        L21:
            if (r0 == 0) goto L25
            r6 = 0
            return r6
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.V.a(com.huawei.hms.scankit.p.x, int):boolean");
    }

    private int[] a(C0732x c0732x) {
        try {
            c0732x.g();
            int c10 = c(c0732x);
            while (true) {
                int[] b10 = b(c0732x, c10, f7742c[0]);
                if (a(c0732x, b10[0])) {
                    int i10 = b10[0];
                    b10[0] = c0732x.d() - b10[1];
                    b10[1] = c0732x.d() - i10;
                    return b10;
                }
                c10 = b10[2];
            }
        } finally {
            c0732x.g();
        }
    }

    private static int b(int[] iArr) {
        int length = f7743d.length;
        float f10 = 0.3f;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float a10 = Y.a(iArr, f7743d[i11], 0.75f);
            if (a10 < f10) {
                i10 = i11;
                f10 = a10;
            } else if (Math.abs(a10 - f10) < 1.0E-7d) {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            return i10 % 10;
        }
        throw C0628a.a();
    }

    private int[] b(C0732x c0732x) {
        int c10 = c(c0732x);
        while (true) {
            int[] c11 = c(c0732x, c10, f7741b);
            int i10 = c11[1];
            int i11 = c11[0];
            this.f7744e = (i10 - i11) / 4;
            if (a(c0732x, i11)) {
                return c11;
            }
            c10 = c11[2];
        }
    }

    private int[] b(C0732x c0732x, int i10, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int d10 = c0732x.d();
        int i11 = i10;
        int i12 = i11;
        boolean z10 = false;
        int i13 = 0;
        while (i11 < d10) {
            if (c0732x.a(i11) == z10) {
                if (i13 != length - 1) {
                    i13++;
                } else if (Math.min(iArr2[0], iArr2[1]) == 0 || Math.max(iArr2[0], iArr2[1]) == 0) {
                    throw C0628a.a();
                } else {
                    int i14 = iArr2[0];
                    int i15 = iArr2[1];
                    float f10 = (iArr2[2] * 2.0f) / (i14 + i15);
                    if (((float) Math.max(iArr2[0], iArr2[1])) / ((float) Math.min(iArr2[0], iArr2[1])) <= 3.0f && ((double) f10) > 1.5d && f10 < 4.0f) {
                        return new int[]{i12, i11, i12 + iArr2[0] + iArr2[1]};
                    }
                    i12 += i14 + i15;
                    int i16 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i16);
                    iArr2[i16] = 0;
                    iArr2[i13] = 0;
                    i13--;
                }
                iArr2[i13] = 1;
                z10 = !z10;
            } else if (i13 < 0 || i13 >= length) {
                throw C0628a.a();
            } else {
                iArr2[i13] = iArr2[i13] + 1;
            }
            i11++;
        }
        throw C0628a.a();
    }

    private static int c(C0732x c0732x) {
        int d10 = c0732x.d();
        int b10 = c0732x.b(0);
        if (b10 != d10) {
            return b10;
        }
        throw C0628a.a();
    }

    private int[] c(C0732x c0732x, int i10, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int d10 = c0732x.d();
        char c10 = 0;
        int i11 = i10;
        int i12 = i11;
        boolean z10 = false;
        int i13 = 0;
        while (i11 < d10) {
            if (c0732x.a(i11) == z10) {
                if (i13 == length - 1) {
                    int[] iArr3 = (int[]) iArr2.clone();
                    Arrays.sort(iArr3);
                    int i14 = iArr3[c10];
                    int i15 = iArr3[2];
                    int i16 = iArr3[3];
                    if (((i15 + i16) * 0.5d) / ((iArr3[1] + i14) * 0.5d) < 4.0d && (i16 * 1.0d) / i14 <= 3.0d) {
                        int[] iArr4 = new int[10];
                        Y.a(c0732x, i11, iArr4);
                        this.f7745f = -1;
                        for (int i17 = 0; i17 < 10; i17++) {
                            int i18 = iArr4[i17];
                            if (i18 > this.f7745f) {
                                this.f7745f = i18;
                            }
                        }
                        return new int[]{i12, i11, i12 + iArr2[0] + iArr2[1]};
                    }
                    c10 = 0;
                    i12 += iArr2[0] + iArr2[1];
                    int i19 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i19);
                    iArr2[i19] = 0;
                    iArr2[i13] = 0;
                    i13--;
                } else {
                    i13++;
                }
                iArr2[i13] = 1;
                z10 = !z10;
            } else if (i13 < 0 || i13 >= length) {
                throw C0628a.a();
            } else {
                iArr2[i13] = iArr2[i13] + 1;
            }
            i11++;
        }
        throw C0628a.a();
    }

    @Override // com.huawei.hms.scankit.p.Y
    public com.huawei.hms.scankit.aiscan.common.x a(int i10, C0732x c0732x, Map<EnumC0631d, ?> map) {
        boolean z10;
        int[] b10 = b(c0732x);
        int[] a10 = a(c0732x);
        StringBuilder sb2 = new StringBuilder(20);
        a(c0732x, b10[1], a10[0], sb2);
        String sb3 = sb2.toString();
        int[] iArr = f7740a;
        int length = sb3.length();
        int length2 = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= length2) {
                z10 = false;
                break;
            }
            int i13 = iArr[i11];
            if (length == i13) {
                z10 = true;
                break;
            }
            if (i13 > i12) {
                i12 = i13;
            }
            i11++;
        }
        if (!z10 && length > i12) {
            z10 = true;
        }
        if (z10) {
            float f10 = i10;
            return new com.huawei.hms.scankit.aiscan.common.x(sb3, null, new com.huawei.hms.scankit.aiscan.common.z[]{new com.huawei.hms.scankit.aiscan.common.z(b10[0], f10), new com.huawei.hms.scankit.aiscan.common.z(a10[1], f10)}, BarcodeFormat.ITF);
        }
        throw C0628a.a();
    }
}
