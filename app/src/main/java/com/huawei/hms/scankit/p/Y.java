package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Y implements com.huawei.hms.scankit.aiscan.common.t {
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

    private com.huawei.hms.scankit.aiscan.common.x a(C0728w c0728w, C0732x c0732x, Map<EnumC0631d, ?> map, int i10, int i11) {
        int i12 = 0;
        while (true) {
            int i13 = 3;
            if (i12 >= 3) {
                return null;
            }
            if (i12 == 0) {
                try {
                    c0732x = c0728w.a(i10, c0732x);
                } catch (C0628a unused) {
                    continue;
                }
            } else if (i12 == 1) {
                c0732x = c0728w.b().a(i10, c0732x);
                i13 = 1;
            } else if (i12 == 2) {
                if (_a.f7804o) {
                    c0732x = c0728w.a(i10, 1);
                } else {
                    continue;
                    i12++;
                }
            }
            if (a(c0732x.c())) {
                com.huawei.hms.scankit.aiscan.common.x a10 = a(c0732x, !_a.f7792c ? 1 : i13, map, i10, i11);
                if (a10 != null && a10.i() != null) {
                    return a10;
                }
            } else {
                continue;
            }
            i12++;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:14|(2:16|(6:18|19|20|(1:24)|25|(2:30|31)(2:27|28))))|38|19|20|(2:22|24)|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0090, code lost:
        if (r7 == 1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0092, code lost:
        r19.g();
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.huawei.hms.scankit.aiscan.common.x a(com.huawei.hms.scankit.p.C0732x r19, int r20, java.util.Map<com.huawei.hms.scankit.aiscan.common.EnumC0631d, ?> r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r23
            r1 = 0
            r3 = r20
            r2 = r21
            r4 = 0
        L8:
            if (r4 >= r3) goto La3
            if (r4 != 0) goto Lf
            r19.b()
        Lf:
            r5 = 1
            if (r4 != r5) goto L15
            r19.h()
        L15:
            r6 = 2
            if (r4 != r6) goto L1e
            r19.f()
            r19.i()
        L1e:
            r7 = 0
        L1f:
            if (r7 >= r6) goto L99
            if (r7 != r5) goto L45
            r19.g()
            if (r2 == 0) goto L45
            com.huawei.hms.scankit.aiscan.common.d r8 = com.huawei.hms.scankit.aiscan.common.EnumC0631d.NEED_RESULT_POINT_CALLBACK
            boolean r9 = r2.containsKey(r8)
            if (r9 == 0) goto L45
            java.util.EnumMap r9 = new java.util.EnumMap
            java.lang.Class<com.huawei.hms.scankit.aiscan.common.d> r10 = com.huawei.hms.scankit.aiscan.common.EnumC0631d.class
            r9.<init>(r10)
            r9.putAll(r2)
            r9.remove(r8)
            r8 = r18
            r10 = r22
            r2 = r9
            r9 = r19
            goto L4b
        L45:
            r8 = r18
            r9 = r19
            r10 = r22
        L4b:
            com.huawei.hms.scankit.aiscan.common.x r11 = r8.a(r10, r9, r2)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            if (r7 != r5) goto L87
            com.huawei.hms.scankit.aiscan.common.z[] r12 = r11.h()     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            if (r12 == 0) goto L87
            com.huawei.hms.scankit.aiscan.common.z r13 = new com.huawei.hms.scankit.aiscan.common.z     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            float r14 = (float) r0     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            r15 = r12[r1]     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            float r15 = r15.b()     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            float r15 = r14 - r15
            r16 = 1065353216(0x3f800000, float:1.0)
            float r15 = r15 - r16
            r17 = r12[r1]     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            float r6 = r17.c()     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            r13.<init>(r15, r6)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            r12[r1] = r13     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            com.huawei.hms.scankit.aiscan.common.z r6 = new com.huawei.hms.scankit.aiscan.common.z     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            r13 = r12[r5]     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            float r13 = r13.b()     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            float r14 = r14 - r13
            float r14 = r14 - r16
            r13 = r12[r5]     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            float r13 = r13.c()     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            r6.<init>(r14, r13)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            r12[r5] = r6     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
        L87:
            boolean r6 = a(r11, r0)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8f
            if (r6 != 0) goto L8e
            goto L95
        L8e:
            return r11
        L8f:
            if (r7 != r5) goto L95
            r19.g()
        L95:
            int r7 = r7 + 1
            r6 = 2
            goto L1f
        L99:
            r8 = r18
            r9 = r19
            r10 = r22
            int r4 = r4 + 1
            goto L8
        La3:
            r8 = r18
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Y.a(com.huawei.hms.scankit.p.x, int, java.util.Map, int, int):com.huawei.hms.scankit.aiscan.common.x");
    }

    public static void a(C0732x c0732x, int i10, int[] iArr) {
        int length = iArr.length;
        Arrays.fill(iArr, 0, length, 0);
        int d10 = c0732x.d();
        if (i10 >= d10) {
            throw C0628a.a();
        }
        boolean z10 = !c0732x.a(i10);
        int i11 = 0;
        while (i10 < d10) {
            if (c0732x.a(i10) == z10) {
                i11++;
                if (i11 == length) {
                    break;
                } else if (i11 < 0 || i11 >= iArr.length) {
                    throw C0628a.a();
                } else {
                    iArr[i11] = 1;
                    z10 = !z10;
                }
            } else if (i11 < 0 || i11 >= iArr.length) {
                throw C0628a.a();
            } else {
                iArr[i11] = iArr[i11] + 1;
            }
            i10++;
        }
        if (i11 != length) {
            if (i11 != length - 1 || i10 != d10) {
                throw C0628a.a();
            }
        }
    }

    private static boolean a(com.huawei.hms.scankit.aiscan.common.x xVar, int i10) {
        com.huawei.hms.scankit.aiscan.common.z[] h10 = xVar.h();
        return Math.abs(((double) h10[1].b()) - ((double) h10[0].b())) / ((double) i10) > 0.4d;
    }

    private static boolean a(int[] iArr) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length && i10 < 20; i12++) {
            int i13 = iArr[i12];
            i10 += Integer.bitCount((i11 | (i13 << 1)) ^ i13);
            i11 = (iArr[i12] >> 31) & 1;
        }
        return i10 >= 20;
    }

    private com.huawei.hms.scankit.aiscan.common.x b(C0728w c0728w, Map<EnumC0631d, ?> map) {
        int e10 = c0728w.e();
        int c10 = c0728w.c();
        C0732x c0732x = new C0732x(e10);
        int max = Math.max(1, c10 >> 5);
        int i10 = c10 / 2;
        if (map != null) {
            EnumC0631d enumC0631d = EnumC0631d.PHOTO_MODE_NUM;
            if (map.containsKey(enumC0631d)) {
                i10 += (((Integer) map.get(enumC0631d)).intValue() * max) / 3;
            }
        }
        int i11 = i10;
        int i12 = 0;
        while (i12 < 15) {
            int i13 = i12 + 1;
            int i14 = i13 / 2;
            if (!((i12 & 1) == 0)) {
                i14 = -i14;
            }
            int i15 = (i14 * max) + i11;
            if (i15 < 0 || i15 >= c10) {
                break;
            }
            com.huawei.hms.scankit.aiscan.common.x a10 = a(c0728w, c0732x, map, i15, e10);
            if (a10 != null && a10.i() != null) {
                return a10;
            }
            i12 = i13;
        }
        throw C0628a.a();
    }

    public abstract com.huawei.hms.scankit.aiscan.common.x a(int i10, C0732x c0732x, Map<EnumC0631d, ?> map);

    @Override // com.huawei.hms.scankit.aiscan.common.t
    public com.huawei.hms.scankit.aiscan.common.x a(C0728w c0728w, Map<EnumC0631d, ?> map) {
        return b(c0728w, map);
    }
}
