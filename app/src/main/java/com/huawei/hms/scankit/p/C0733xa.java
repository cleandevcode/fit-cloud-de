package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.C0632e;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.p.xa */
/* loaded from: classes.dex */
public final class C0733xa {

    /* renamed from: a */
    private static final C0702pa f8108a = new C0702pa();

    private static int a(C0686la c0686la, int i10, int i11, boolean z10) {
        C0674ia[] b10;
        int i12 = z10 ? 1 : -1;
        int i13 = i10 - i12;
        C0674ia a10 = a(c0686la, i13) ? c0686la.a(i13).a(i11) : null;
        if (a10 != null) {
            return z10 ? a10.b() : a10.d();
        }
        C0674ia b11 = c0686la.a(i10).b(i11);
        if (b11 != null) {
            return z10 ? b11.d() : b11.b();
        }
        if (a(c0686la, i13)) {
            b11 = c0686la.a(i13).b(i11);
        }
        if (b11 != null) {
            return z10 ? b11.b() : b11.d();
        }
        int i14 = 0;
        while (true) {
            i10 -= i12;
            if (!a(c0686la, i10)) {
                C0670ha d10 = c0686la.d();
                return z10 ? d10.e() : d10.c();
            }
            for (C0674ia c0674ia : c0686la.a(i10).b()) {
                if (c0674ia != null) {
                    return ((c0674ia.b() - c0674ia.d()) * i12 * i14) + (z10 ? c0674ia.b() : c0674ia.d());
                }
            }
            i14++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(com.huawei.hms.scankit.p.C0736y r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            if (r8 == 0) goto L4
            r0 = -1
            goto L5
        L4:
            r0 = 1
        L5:
            r1 = 0
            r2 = r9
        L7:
            r3 = 2
            if (r1 >= r3) goto L28
        La:
            if (r8 == 0) goto Lf
            if (r2 < r6) goto L22
            goto L11
        Lf:
            if (r2 >= r7) goto L22
        L11:
            boolean r4 = r5.b(r2, r10)
            if (r8 != r4) goto L22
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L20
            return r9
        L20:
            int r2 = r2 + r0
            goto La
        L22:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L7
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.C0733xa.a(com.huawei.hms.scankit.p.y, int, int, boolean, int, int):int");
    }

    private static int a(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    private static int a(int[] iArr, int[] iArr2, int i10) {
        if ((iArr2 == null || iArr2.length <= (i10 / 2) + 3) && i10 >= 0 && i10 <= 512) {
            return f8108a.a(iArr, i10, iArr2);
        }
        throw C0628a.a();
    }

    private static C0632e a(int i10, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4, Map<EnumC0631d, ?> map) {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i11 = 100;
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                throw C0628a.a();
            }
            for (int i13 = 0; i13 < length; i13++) {
                iArr[iArr3[i13]] = iArr4[i13][iArr5[i13]];
            }
            try {
                return a(iArr, i10, iArr2, map);
            } catch (C0628a unused) {
                if (length == 0) {
                    throw C0628a.a();
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        break;
                    }
                    int i15 = iArr5[i14];
                    if (i15 < iArr4[i14].length - 1) {
                        iArr5[i14] = i15 + 1;
                        break;
                    }
                    iArr5[i14] = 0;
                    if (i14 == length - 1) {
                        throw C0628a.a();
                    }
                    i14++;
                }
                i11 = i12;
            }
        }
    }

    private static C0632e a(C0686la c0686la, Map<EnumC0631d, ?> map) {
        C0666ga[][] a10 = a(c0686la);
        a(c0686la, a10);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[c0686la.c() * c0686la.a()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < c0686la.c(); i10++) {
            int i11 = 0;
            while (i11 < c0686la.a()) {
                int i12 = i11 + 1;
                int[] a11 = a10[i10][i12].a();
                int a12 = (c0686la.a() * i10) + i11;
                if (a11.length == 0) {
                    arrayList.add(Integer.valueOf(a12));
                } else if (a11.length == 1) {
                    iArr[a12] = a11[0];
                } else {
                    arrayList3.add(Integer.valueOf(a12));
                    arrayList2.add(a11);
                }
                i11 = i12;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            iArr2[i13] = (int[]) arrayList2.get(i13);
        }
        return a(c0686la.b(), iArr, C0717ta.a(arrayList), C0717ta.a(arrayList3), iArr2, map);
    }

    public static C0632e a(C0736y c0736y, com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2, com.huawei.hms.scankit.aiscan.common.z zVar3, com.huawei.hms.scankit.aiscan.common.z zVar4, int i10, int i11, Map<EnumC0631d, ?> map) {
        C0686la b10;
        C0694na c0694na = null;
        C0694na c0694na2 = null;
        C0670ha c0670ha = new C0670ha(c0736y, zVar, zVar2, zVar3, zVar4);
        boolean z10 = true;
        while (true) {
            if (zVar != null) {
                c0694na = a(c0736y, c0670ha, zVar, true, i10, i11);
            }
            if (zVar3 != null) {
                c0694na2 = a(c0736y, c0670ha, zVar3, false, i10, i11);
            }
            b10 = b(c0694na, c0694na2);
            if (b10 == null) {
                throw C0628a.a();
            }
            C0670ha d10 = b10.d();
            if (!z10 || d10 == null || (d10.f() >= c0670ha.f() && d10.d() <= c0670ha.d())) {
                break;
            }
            c0670ha = d10;
            z10 = false;
        }
        b10.a(c0670ha);
        int a10 = b10.a() + 1;
        b10.a(0, c0694na);
        b10.a(a10, c0694na2);
        a(b10, c0694na, c0670ha, a10, c0736y, i10, i11);
        return a(b10, map);
    }

    private static C0632e a(int[] iArr, int i10, int[] iArr2, Map<EnumC0631d, ?> map) {
        if (iArr.length != 0) {
            int i11 = 1 << (i10 + 1);
            int a10 = a(iArr, iArr2, i11);
            a(iArr, i11);
            C0632e a11 = C0682ka.a(iArr, String.valueOf(i10), map);
            a11.b(Integer.valueOf(a10));
            a11.a(Integer.valueOf(iArr2.length));
            return a11;
        }
        throw C0628a.a();
    }

    private static C0662fa a(C0694na c0694na, C0694na c0694na2) {
        C0662fa c10;
        C0662fa c11;
        if (c0694na == null || (c10 = c0694na.c()) == null) {
            if (c0694na2 == null) {
                return null;
            }
            return c0694na2.c();
        } else if (c0694na2 == null || (c11 = c0694na2.c()) == null || c10.a() == c11.a() || c10.b() == c11.b() || c10.c() == c11.c()) {
            return c10;
        } else {
            return null;
        }
    }

    private static C0670ha a(C0694na c0694na) {
        int[] d10;
        if (c0694na == null || (d10 = c0694na.d()) == null) {
            return null;
        }
        int b10 = b(d10);
        int i10 = 0;
        int i11 = 0;
        for (int i12 : d10) {
            i11 += b10 - i12;
            if (i12 > 0) {
                break;
            }
        }
        C0674ia[] b11 = c0694na.b();
        for (int i13 = 0; i11 > 0 && b11[i13] == null; i13++) {
            i11--;
        }
        for (int length = d10.length - 1; length >= 0; length--) {
            int i14 = d10[length];
            i10 += b10 - i14;
            if (i14 > 0) {
                break;
            }
        }
        for (int length2 = b11.length - 1; i10 > 0 && b11[length2] == null; length2--) {
            i10--;
        }
        return c0694na.a().a(i11, i10, c0694na.e());
    }

    private static C0674ia a(C0736y c0736y, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        int i16;
        int a10;
        int a11;
        int a12 = a(c0736y, i10, i11, z10, i12, i13);
        int[] b10 = b(c0736y, i10, i11, z10, a12, i13);
        if (b10 == null) {
            return null;
        }
        int a13 = com.huawei.hms.scankit.aiscan.common.n.a(b10);
        if (z10) {
            i16 = a12 + a13;
        } else {
            for (int i17 = 0; i17 < b10.length / 2; i17++) {
                int i18 = b10[i17];
                b10[i17] = b10[(b10.length - 1) - i17];
                b10[(b10.length - 1) - i17] = i18;
            }
            a12 -= a13;
            i16 = a12;
        }
        if (a(a13, i14, i15) && (a11 = C0717ta.a((a10 = C0713sa.a(b10)))) != -1) {
            return new C0674ia(a12, i16, b(a10), a11);
        }
        return null;
    }

    private static C0694na a(C0736y c0736y, C0670ha c0670ha, com.huawei.hms.scankit.aiscan.common.z zVar, boolean z10, int i10, int i11) {
        C0694na c0694na = new C0694na(c0670ha, z10);
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i12 == 0 ? 1 : -1;
            int b10 = (int) zVar.b();
            for (int c10 = (int) zVar.c(); c10 <= c0670ha.d() && c10 >= c0670ha.f(); c10 += i13) {
                C0674ia a10 = a(c0736y, 0, c0736y.d(), z10, b10, c10, i10, i11);
                if (a10 != null) {
                    c0694na.a(c10, a10);
                    b10 = z10 ? a10.d() : a10.b();
                }
            }
            i12++;
        }
        return c0694na;
    }

    private static void a(C0686la c0686la, C0694na c0694na, C0670ha c0670ha, int i10, C0736y c0736y, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        C0690ma c0690ma;
        boolean z10 = c0694na != null;
        int i17 = i11;
        int i18 = i12;
        for (int i19 = 1; i19 <= i10; i19++) {
            int i20 = z10 ? i19 : i10 - i19;
            if (c0686la.a(i20) == null) {
                C0690ma c0694na2 = (i20 == 0 || i20 == i10) ? new C0694na(c0670ha, i20 == 0) : new C0690ma(c0670ha);
                c0686la.a(i20, c0694na2);
                int i21 = -1;
                int i22 = i17;
                int i23 = i18;
                int f10 = c0670ha.f();
                int i24 = -1;
                while (f10 <= c0670ha.d()) {
                    int a10 = a(c0686la, i20, f10, z10);
                    if (a10 >= 0 && a10 <= c0670ha.c()) {
                        i13 = a10;
                    } else if (i24 == i21) {
                        i14 = i24;
                        i15 = f10;
                        i16 = i22;
                        c0690ma = c0694na2;
                        i22 = i16;
                        i13 = i14;
                        f10 = i15 + 1;
                        c0694na2 = c0690ma;
                        i24 = i13;
                        i21 = -1;
                    } else {
                        i13 = i24;
                    }
                    i14 = i24;
                    int i25 = f10;
                    int i26 = i23;
                    int i27 = i22;
                    c0690ma = c0694na2;
                    C0674ia a11 = a(c0736y, c0670ha.e(), c0670ha.c(), z10, i13, i25, i27, i26);
                    i15 = i25;
                    if (a11 != null) {
                        c0690ma.a(i15, a11);
                        int min = Math.min(i27, a11.f());
                        i23 = Math.max(i26, a11.f());
                        i22 = min;
                        f10 = i15 + 1;
                        c0694na2 = c0690ma;
                        i24 = i13;
                        i21 = -1;
                    } else {
                        i23 = i26;
                        i16 = i27;
                        i22 = i16;
                        i13 = i14;
                        f10 = i15 + 1;
                        c0694na2 = c0690ma;
                        i24 = i13;
                        i21 = -1;
                    }
                }
                i17 = i22;
                i18 = i23;
            }
        }
    }

    private static void a(C0686la c0686la, C0666ga[][] c0666gaArr) {
        C0666ga c0666ga = c0666gaArr[0][1];
        int[] a10 = c0666ga.a();
        int a11 = (c0686la.a() * c0686la.c()) - c(c0686la.b());
        if (a10.length == 0) {
            if (a11 < 1 || a11 > 928) {
                throw C0628a.a();
            }
        } else if (a10[0] == a11) {
            return;
        }
        c0666ga.a(a11);
    }

    private static void a(int[] iArr, int i10) {
        if (iArr.length < 4) {
            throw C0628a.a();
        }
        int i11 = iArr[0];
        if (i11 > iArr.length) {
            throw C0628a.a();
        }
        if (i11 == 0) {
            if (i10 >= iArr.length) {
                throw C0628a.a();
            }
            iArr[0] = iArr.length - i10;
        }
    }

    private static boolean a(int i10, int i11, int i12) {
        return i11 + (-2) <= i10 && i10 <= i12 + 2;
    }

    private static boolean a(C0686la c0686la, int i10) {
        return i10 >= 0 && i10 <= c0686la.a() + 1;
    }

    private static int[] a(int i10) {
        int[] iArr = new int[8];
        int i11 = 0;
        int i12 = 7;
        while (true) {
            int i13 = i10 & 1;
            if (i13 != i11) {
                i12--;
                if (i12 < 0) {
                    return iArr;
                }
                i11 = i13;
            }
            iArr[i12] = iArr[i12] + 1;
            i10 >>= 1;
        }
    }

    private static C0666ga[][] a(C0686la c0686la) {
        C0690ma[] e10;
        C0674ia[] b10;
        int c10;
        C0666ga[][] c0666gaArr = (C0666ga[][]) Array.newInstance(C0666ga.class, c0686la.c(), c0686la.a() + 2);
        for (C0666ga[] c0666gaArr2 : c0666gaArr) {
            int i10 = 0;
            while (true) {
                if (i10 < c0666gaArr2.length) {
                    c0666gaArr2[i10] = new C0666ga();
                    i10++;
                }
            }
        }
        int i11 = 0;
        for (C0690ma c0690ma : c0686la.e()) {
            if (c0690ma != null) {
                for (C0674ia c0674ia : c0690ma.b()) {
                    if (c0674ia != null && (c10 = c0674ia.c()) >= 0 && c10 < c0666gaArr.length) {
                        c0666gaArr[c10][i11].a(c0674ia.e());
                    }
                }
            }
            i11++;
        }
        return c0666gaArr;
    }

    private static int b(int i10) {
        return a(a(i10));
    }

    private static int b(int[] iArr) {
        int i10 = -1;
        for (int i11 : iArr) {
            i10 = Math.max(i10, i11);
        }
        return i10;
    }

    private static C0686la b(C0694na c0694na, C0694na c0694na2) {
        C0662fa a10;
        if ((c0694na == null && c0694na2 == null) || (a10 = a(c0694na, c0694na2)) == null) {
            return null;
        }
        return new C0686la(a10, C0670ha.a(a(c0694na), a(c0694na2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x002b A[EDGE_INSN: B:71:0x002b->B:60:0x002b ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[] b(com.huawei.hms.scankit.p.C0736y r8, int r9, int r10, boolean r11, int r12, int r13) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r11 == 0) goto L9
            r3 = 1
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r6 = r11
            r5 = 0
        Ld:
            if (r11 == 0) goto L12
            if (r12 >= r10) goto L2b
            goto L14
        L12:
            if (r12 < r9) goto L2b
        L14:
            if (r5 >= r0) goto L2b
            boolean r7 = r8.b(r12, r13)
            if (r7 != r6) goto L23
            r7 = r1[r5]
            int r7 = r7 + r2
            r1[r5] = r7
            int r12 = r12 + r3
            goto Ld
        L23:
            int r5 = r5 + 1
            if (r6 != 0) goto L29
            r6 = 1
            goto Ld
        L29:
            r6 = 0
            goto Ld
        L2b:
            if (r5 == r0) goto L38
            if (r11 == 0) goto L30
            r9 = r10
        L30:
            if (r12 != r9) goto L36
            r8 = 7
            if (r5 != r8) goto L36
            goto L38
        L36:
            r8 = 0
            return r8
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.C0733xa.b(com.huawei.hms.scankit.p.y, int, int, boolean, int, int):int[]");
    }

    private static int c(int i10) {
        return 2 << i10;
    }
}
