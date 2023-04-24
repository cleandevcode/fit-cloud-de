package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;

/* loaded from: classes.dex */
final class Nc {

    /* renamed from: a */
    private static final int[][] f7615a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f7616b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f7617c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    private static final int[][] f7618d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int a(int i10) {
        return 32 - Integer.numberOfLeadingZeros(i10);
    }

    public static int a(int i10, int i11) {
        if (i11 == 0) {
            try {
                throw new IllegalArgumentException("0 polynomial");
            } catch (Exception e10) {
                throw e10;
            }
        }
        int a10 = a(i11);
        int i12 = i10 << (a10 - 1);
        while (a(i12) >= a10) {
            i12 ^= i11 << (a(i12) - a10);
        }
        return i12;
    }

    private static void a(int i10, int i11, Ic ic2) {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (!b(ic2.a(i13, i11))) {
                throw new WriterException();
            }
            ic2.a(i13, i11, 0);
        }
    }

    public static void a(Ic ic2) {
        ic2.a((byte) -1);
    }

    public static void a(Pa pa2, int i10, Ic ic2) {
        C0732x c0732x = new C0732x();
        a(pa2, i10, c0732x);
        for (int i11 = 0; i11 < c0732x.d(); i11++) {
            boolean a10 = c0732x.a((c0732x.d() - 1) - i11);
            int[] iArr = f7618d[i11];
            ic2.a(iArr[0], iArr[1], a10);
            if (i11 < 8) {
                ic2.a((ic2.c() - i11) - 1, 8, a10);
            } else {
                ic2.a(8, (i11 - 8) + (ic2.b() - 7), a10);
            }
        }
    }

    public static void a(Pa pa2, int i10, C0732x c0732x) {
        if (!Oc.a(i10)) {
            throw new WriterException("Invalid mask pattern");
        }
        int a10 = (pa2.a() << 3) | i10;
        c0732x.a(a10, 5);
        c0732x.a(a(a10, 1335), 10);
        C0732x c0732x2 = new C0732x();
        c0732x2.a(21522, 15);
        c0732x.b(c0732x2);
        if (c0732x.d() == 15) {
            return;
        }
        StringBuilder a11 = android.support.v4.media.d.a("should not happen but we got: ");
        a11.append(c0732x.d());
        throw new WriterException(a11.toString());
    }

    public static void a(Ya ya2, Ic ic2) {
        c(ic2);
        b(ic2);
        c(ya2, ic2);
        d(ic2);
    }

    public static void a(C0732x c0732x, int i10, Ic ic2) {
        boolean z10;
        int c10 = ic2.c() - 1;
        int b10 = ic2.b() - 1;
        int i11 = 0;
        int i12 = -1;
        while (c10 > 0) {
            if (c10 == 6) {
                c10--;
            }
            while (b10 >= 0 && b10 < ic2.b()) {
                for (int i13 = 0; i13 < 2; i13++) {
                    int i14 = c10 - i13;
                    if (b(ic2.a(i14, b10))) {
                        if (i11 < c0732x.d()) {
                            z10 = c0732x.a(i11);
                            i11++;
                        } else {
                            z10 = false;
                        }
                        if (i10 != -1 && Mc.a(i10, i14, b10)) {
                            z10 = !z10;
                        }
                        ic2.a(i14, b10, z10);
                    }
                }
                b10 += i12;
            }
            i12 = -i12;
            b10 += i12;
            c10 -= 2;
        }
        if (i11 == c0732x.d()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i11 + '/' + c0732x.d());
    }

    public static void a(C0732x c0732x, Pa pa2, Ya ya2, int i10, Ic ic2) {
        a(ic2);
        a(ya2, ic2);
        a(pa2, i10, ic2);
        b(ya2, ic2);
        a(c0732x, i10, ic2);
    }

    private static void b(int i10, int i11, Ic ic2) {
        for (int i12 = 0; i12 < 5; i12++) {
            int[] iArr = f7616b[i12];
            for (int i13 = 0; i13 < 5; i13++) {
                ic2.a(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    private static void b(Ic ic2) {
        if (ic2.a(8, ic2.b() - 8) == 0) {
            throw new WriterException();
        }
        ic2.a(8, ic2.b() - 8, 1);
    }

    public static void b(Ya ya2, Ic ic2) {
        if (ya2.e() < 7) {
            return;
        }
        C0732x c0732x = new C0732x();
        a(ya2, c0732x);
        int i10 = 17;
        for (int i11 = 0; i11 < 6; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                boolean a10 = c0732x.a(i10);
                i10--;
                ic2.a(i11, (ic2.b() - 11) + i12, a10);
                ic2.a((ic2.b() - 11) + i12, i11, a10);
            }
        }
    }

    private static boolean b(int i10) {
        return i10 == -1;
    }

    private static void c(int i10, int i11, Ic ic2) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f7615a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                ic2.a(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    private static void c(Ic ic2) {
        int length = f7615a[0].length;
        c(0, 0, ic2);
        c(ic2.c() - length, 0, ic2);
        c(0, ic2.c() - length, ic2);
        a(0, 7, ic2);
        a(ic2.c() - 8, 7, ic2);
        a(0, ic2.c() - 8, ic2);
        d(7, 0, ic2);
        d((ic2.b() - 7) - 1, 0, ic2);
        d(7, ic2.b() - 7, ic2);
    }

    private static void c(Ya ya2, Ic ic2) {
        if (ya2.e() < 2) {
            return;
        }
        int e10 = ya2.e() - 1;
        int[][] iArr = f7617c;
        if (e10 < iArr.length) {
            int[] iArr2 = iArr[e10];
            for (int i10 : iArr2) {
                if (i10 >= 0) {
                    for (int i11 : iArr2) {
                        if (i11 >= 0 && b(ic2.a(i11, i10))) {
                            b(i11 - 2, i10 - 2, ic2);
                        }
                    }
                }
            }
        }
    }

    private static void d(int i10, int i11, Ic ic2) {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (!b(ic2.a(i10, i13))) {
                throw new WriterException();
            }
            ic2.a(i10, i13, 0);
        }
    }

    private static void d(Ic ic2) {
        int i10 = 8;
        while (i10 < ic2.c() - 8) {
            int i11 = i10 + 1;
            int i12 = i11 % 2;
            if (b(ic2.a(i10, 6))) {
                ic2.a(i10, 6, i12);
            }
            if (b(ic2.a(6, i10))) {
                ic2.a(6, i10, i12);
            }
            i10 = i11;
        }
    }

    public static void a(Ya ya2, C0732x c0732x) {
        c0732x.a(ya2.e(), 6);
        c0732x.a(a(ya2.e(), 7973), 12);
        if (c0732x.d() == 18) {
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("should not happen but we got: ");
        a10.append(c0732x.d());
        throw new WriterException(a10.toString());
    }
}
