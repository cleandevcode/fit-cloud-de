package com.huawei.hms.scankit.aiscan.common;

import com.huawei.hms.scankit.p.C0725va;
import com.huawei.hms.scankit.p.C0728w;
import com.huawei.hms.scankit.p.L;
import com.huawei.hms.scankit.p.M;
import com.huawei.hms.scankit.p.W;
import com.huawei.hms.scankit.p.Xa;
import com.huawei.hms.scankit.p._a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class o implements t {
    private x a(int i10, l lVar, C0728w c0728w, C0728w c0728w2, Map<EnumC0631d, ?> map) {
        t[] a10 = a(map);
        try {
            if (_a.f7790a) {
                float f10 = (i10 * 1.0f) / 500.0f;
                if (f10 <= 1.0f) {
                    f10 = 1.0f;
                }
                x a11 = a(lVar.g(lVar.g(c0728w, f10)), a10, map);
                if (a11 != null && a11.i() != null) {
                    M.a(a11.h(), f10, (L) null);
                    return a11;
                }
            }
            throw C0628a.a();
        } catch (C0628a unused) {
            float f11 = (i10 * 1.0f) / 1080.0f;
            float f12 = f11 > 1.0f ? f11 : 1.0f;
            x a12 = a(lVar.b(c0728w2, f12), a10, map);
            if (a12 != null && a12.i() != null) {
                M.a(a12.h(), f12, (L) null);
            }
            return a12;
        }
    }

    private x a(int i10, C0728w c0728w, l lVar, Map<EnumC0631d, ?> map, L l10) {
        float f10 = (i10 * 1.0f) / 250.0f;
        if (f10 < 1.0f) {
            f10 = 1.0f;
        }
        C0728w f11 = lVar.f(c0728w, f10);
        t[] a10 = a(map);
        try {
            try {
                x a11 = a(lVar.e(f11), a10, map);
                if (a11 == null || a11.i() == null) {
                    throw C0628a.a();
                }
                M.a(a11.h(), f10, l10);
                return a11;
            } catch (C0628a unused) {
                x a12 = a(new C0728w(new com.huawei.hms.scankit.p.B(c0728w.a().c())), a10, map);
                if (a12 != null && a12.i() != null) {
                    M.a(a12.h(), 1.0f, l10);
                }
                return a12;
            }
        } catch (C0628a unused2) {
            x a13 = a(lVar.f(f11), a10, map);
            if (a13 == null || a13.i() == null) {
                throw C0628a.a();
            }
            M.a(a13.h(), f10, l10);
            return a13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0080, code lost:
        r10 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.huawei.hms.scankit.aiscan.common.x a(com.huawei.hms.scankit.p.C0728w r9, com.huawei.hms.scankit.aiscan.common.l r10, java.util.Map<com.huawei.hms.scankit.aiscan.common.EnumC0631d, java.lang.Object> r11, float[] r12) {
        /*
            r8 = this;
            int r0 = r9.c()
            int r1 = r9.e()
            int r0 = java.lang.Math.min(r0, r1)
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r1
            r2 = 1149698048(0x44870000, float:1080.0)
            float r0 = r0 / r2
            boolean r2 = com.huawei.hms.scankit.p._a.f7790a
            if (r2 == 0) goto L1d
            com.huawei.hms.scankit.p.w r9 = r10.a(r9, r0)
            goto L29
        L1d:
            r2 = 1069547520(0x3fc00000, float:1.5)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L24
            r1 = r0
        L24:
            com.huawei.hms.scankit.p.w r9 = r10.a(r9, r1)
            r0 = r1
        L29:
            com.huawei.hms.scankit.aiscan.common.t[] r1 = r8.a(r11)
            boolean r2 = com.huawei.hms.scankit.p._a.f7791b
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L45
            boolean r2 = com.huawei.hms.scankit.p._a.f7790a
            if (r2 == 0) goto L45
            com.huawei.hms.scankit.aiscan.common.d r10 = com.huawei.hms.scankit.aiscan.common.EnumC0631d.PHOTO_MODE_NUM
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r11.put(r10, r2)
            com.huawei.hms.scankit.aiscan.common.x r10 = r8.a(r9, r1, r11)
            goto L81
        L45:
            r2 = r3
            r5 = 0
        L47:
            r6 = 2
            if (r5 >= r6) goto L80
            r6 = 1
            if (r5 != r6) goto L5e
            com.huawei.hms.scankit.p.w r7 = com.huawei.hms.scankit.aiscan.common.k.a(r9)
            com.huawei.hms.scankit.p.w r7 = r10.c(r7)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L7d
            com.huawei.hms.scankit.aiscan.common.x r2 = r8.a(r7, r1, r11)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L7d
            r7 = 1073741824(0x40000000, float:2.0)
            r12[r6] = r7     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L7d
            goto L80
        L5e:
            com.huawei.hms.scankit.p.w r7 = r10.b(r9)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L67
            com.huawei.hms.scankit.aiscan.common.x r10 = r8.a(r7, r1, r11)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L67
            goto L81
        L67:
            boolean r7 = com.huawei.hms.scankit.p._a.f7800k     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L7d
            if (r7 == 0) goto L7d
            com.huawei.hms.scankit.aiscan.common.d r7 = com.huawei.hms.scankit.aiscan.common.EnumC0631d.PHOTO_MODE_NUM     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L7d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L7d
            r11.put(r7, r6)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L7d
            com.huawei.hms.scankit.p.w r6 = r10.d(r9)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L7d
            com.huawei.hms.scankit.aiscan.common.x r10 = r8.a(r6, r1, r11)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L7d
            goto L81
        L7d:
            int r5 = r5 + 1
            goto L47
        L80:
            r10 = r2
        L81:
            if (r10 == 0) goto L8a
            com.huawei.hms.scankit.p.y r9 = r9.b()
            com.huawei.hms.scankit.p.M.a(r9, r10, r0, r3)
        L8a:
            r12[r4] = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.aiscan.common.o.a(com.huawei.hms.scankit.p.w, com.huawei.hms.scankit.aiscan.common.l, java.util.Map, float[]):com.huawei.hms.scankit.aiscan.common.x");
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.huawei.hms.scankit.aiscan.common.x a(com.huawei.hms.scankit.p.C0728w r11, com.huawei.hms.scankit.aiscan.common.l r12, java.util.Map<com.huawei.hms.scankit.aiscan.common.EnumC0631d, java.lang.Object> r13, float[] r14, com.huawei.hms.scankit.p.L r15) {
        /*
            r10 = this;
            float r0 = r15.n()
            int r1 = r11.e()
            int r2 = r11.c()
            if (r1 >= r2) goto L13
            int r1 = r11.e()
            goto L17
        L13:
            int r1 = r11.c()
        L17:
            float r1 = (float) r1
            r2 = 1140457472(0x43fa0000, float:500.0)
            float r2 = r1 / r2
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L24
            r2 = 1065353216(0x3f800000, float:1.0)
        L24:
            com.huawei.hms.scankit.p.w r4 = r12.g(r11, r2)
            com.huawei.hms.scankit.aiscan.common.t[] r5 = r10.a(r13)
            float r6 = r15.a()
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L3f
            float r6 = r15.b()
            float r7 = r15.a()
            float r6 = r6 / r7
            goto L41
        L3f:
            r6 = 1065353216(0x3f800000, float:1.0)
        L41:
            r7 = 0
            com.huawei.hms.scankit.aiscan.common.x r8 = r10.a(r4, r5, r13)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L54
            float r9 = r0 / r2
            boolean r9 = a(r8, r9, r6)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L56
            if (r9 != 0) goto L4f
            goto Lab
        L4f:
            com.huawei.hms.scankit.aiscan.common.a r8 = com.huawei.hms.scankit.aiscan.common.C0628a.a()     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L54
            throw r8     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L54
        L54:
            goto L58
        L56:
            r7 = r8
        L58:
            boolean r8 = com.huawei.hms.scankit.p._a.f7800k
            if (r8 == 0) goto Laa
            r2 = 1132068864(0x437a0000, float:250.0)
            float r1 = r1 / r2
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 >= 0) goto L64
            goto L65
        L64:
            r3 = r1
        L65:
            com.huawei.hms.scankit.p.w r4 = r12.f(r11, r3)
            com.huawei.hms.scankit.aiscan.common.d r11 = com.huawei.hms.scankit.aiscan.common.EnumC0631d.PHOTO_MODE_NUM     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L89
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L89
            r13.put(r11, r1)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L89
            com.huawei.hms.scankit.p.w r11 = r12.e(r4)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L89
            com.huawei.hms.scankit.aiscan.common.x r11 = r10.a(r11, r5, r13)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L89
            float r1 = r0 / r3
            boolean r1 = a(r11, r1, r6)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L89
            if (r1 != 0) goto L84
            goto La3
        L84:
            com.huawei.hms.scankit.aiscan.common.a r11 = com.huawei.hms.scankit.aiscan.common.C0628a.a()     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L89
            throw r11     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L89
        L89:
            com.huawei.hms.scankit.aiscan.common.d r11 = com.huawei.hms.scankit.aiscan.common.EnumC0631d.PHOTO_MODE_NUM
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.put(r11, r1)
            com.huawei.hms.scankit.p.w r11 = r12.f(r4)
            com.huawei.hms.scankit.aiscan.common.x r11 = r10.a(r11, r5, r13)
            float r0 = r0 / r3
            boolean r12 = a(r11, r0, r6)
            if (r12 != 0) goto La5
        La3:
            r2 = r3
            goto Lac
        La5:
            com.huawei.hms.scankit.aiscan.common.a r11 = com.huawei.hms.scankit.aiscan.common.C0628a.a()
            throw r11
        Laa:
            r8 = r7
        Lab:
            r11 = r8
        Lac:
            r12 = 0
            r14[r12] = r2
            if (r11 == 0) goto Lb8
            com.huawei.hms.scankit.p.y r12 = r4.b()
            com.huawei.hms.scankit.p.M.a(r12, r11, r2, r15)
        Lb8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.aiscan.common.o.a(com.huawei.hms.scankit.p.w, com.huawei.hms.scankit.aiscan.common.l, java.util.Map, float[], com.huawei.hms.scankit.p.L):com.huawei.hms.scankit.aiscan.common.x");
    }

    private x a(C0728w c0728w, t[] tVarArr, Map<EnumC0631d, ?> map) {
        if (tVarArr != null) {
            for (t tVar : tVarArr) {
                try {
                    x a10 = tVar.a(c0728w, map);
                    if (a10 != null && a10.h() != null) {
                        int i10 = 0;
                        for (z zVar : a10.h()) {
                            if (zVar != null) {
                                i10++;
                            }
                        }
                        if (i10 == 0 && a10.b() == BarcodeFormat.PDF_417) {
                            throw C0628a.a();
                            break;
                        }
                    }
                    return a10;
                } catch (C0628a unused) {
                }
            }
        }
        throw C0628a.a();
    }

    public static boolean a(x xVar, float f10, float f11) {
        double abs = Math.abs(xVar.h()[0].b() - xVar.h()[1].b()) / f10;
        return (abs < 0.55d && ((double) f11) > 1.5d) || abs < 0.3d;
    }

    public x a(C0728w c0728w, l lVar, Map<EnumC0631d, ?> map, L l10) {
        int e10 = c0728w.e();
        int c10 = c0728w.c();
        int i10 = e10 < c10 ? e10 : c10;
        float f10 = i10 * 1.0f;
        float f11 = f10 / 128.0f;
        if (f11 < 1.0f && _a.f7792c) {
            c0728w = lVar.e(c0728w, f11);
        }
        C0728w c0728w2 = c0728w;
        float f12 = f10 / 500.0f;
        float f13 = f12 >= 1.0f ? f12 : 1.0f;
        try {
            x a10 = a(lVar.g(c0728w2, f13), a(map), map);
            if (a10 != null && a10.i() != null) {
                M.a(a10.h(), f13, l10);
                return a10;
            }
            if (!_a.f7792c && a10 != null && a10.i() == null && a10.h().length >= 3) {
                z[] zVarArr = (z[]) a10.h().clone();
            }
            throw C0628a.a();
        } catch (C0628a unused) {
            x a11 = a(i10, c0728w2, lVar, map, l10);
            if (a11 != null) {
                if (0 != 0) {
                    a11.a();
                    a11.b((z[]) null);
                    M.a(a11.h(), f13, l10);
                }
                return a11;
            }
            throw C0628a.a();
        }
    }

    public x a(C0728w c0728w, C0728w c0728w2, l lVar, Map<EnumC0631d, ?> map) {
        C0728w a10;
        int e10 = c0728w.e();
        int c10 = c0728w.c();
        int i10 = e10 < c10 ? e10 : c10;
        float f10 = (i10 * 1.0f) / 1080.0f;
        if (f10 <= 1.0f) {
            f10 = 1.0f;
        }
        if (_a.f7790a) {
            a10 = lVar.a(c0728w, f10);
        } else {
            float f11 = f10 > 1.5f ? f10 : 1.0f;
            float f12 = f11;
            a10 = lVar.a(c0728w, f11);
            f10 = f12;
        }
        try {
            x a11 = a(a10, a(map), map);
            if (a11 != null && a11.i() != null) {
                M.a(a11.h(), f10, (L) null);
                return a11;
            }
            if (!_a.f7792c && a11 != null && a11.i() == null && a11.h().length >= 3) {
                z[] zVarArr = (z[]) a11.h().clone();
            }
            throw C0628a.a();
        } catch (C0628a unused) {
            x a12 = a(i10, lVar, c0728w, c0728w2, map);
            if (a12 != null) {
                if (0 != 0) {
                    a12.a();
                    a12.b((z[]) null);
                }
                return a12;
            }
            throw C0628a.a();
        }
    }

    public x a(C0728w c0728w, C0728w c0728w2, C0728w c0728w3, Map<EnumC0631d, ?> map, l lVar, L l10) {
        return c0728w3 != null ? a(c0728w3, lVar, map, l10) : a(c0728w, c0728w2, lVar, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.huawei.hms.scankit.aiscan.common.x a(com.huawei.hms.scankit.p.C0728w r10, com.huawei.hms.scankit.p.C0728w r11, java.util.Map<com.huawei.hms.scankit.aiscan.common.EnumC0631d, java.lang.Object> r12, com.huawei.hms.scankit.aiscan.common.l r13, com.huawei.hms.scankit.p.L r14) {
        /*
            r9 = this;
            com.huawei.hms.scankit.aiscan.common.d r0 = com.huawei.hms.scankit.aiscan.common.EnumC0631d.PHOTO_MODE
            boolean r0 = r12.containsKey(r0)
            r1 = 2
            float[] r6 = new float[r1]
            r6 = {x0066: FILL_ARRAY_DATA  , data: [1065353216, 0} // fill-array
            r1 = 0
            r8 = 1
            if (r11 == 0) goto L1b
            r2 = r9
            r3 = r11
            r4 = r13
            r5 = r12
            r7 = r14
            com.huawei.hms.scankit.aiscan.common.x r11 = r2.a(r3, r4, r5, r6, r7)
        L19:
            r12 = 0
            goto L31
        L1b:
            if (r0 != 0) goto L24
            boolean r11 = com.huawei.hms.scankit.p._a.f7790a
            if (r11 != 0) goto L22
            goto L24
        L22:
            r11 = 0
            goto L19
        L24:
            com.huawei.hms.scankit.aiscan.common.x r11 = r9.a(r10, r13, r12, r6)
            r12 = r6[r8]
            r13 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L19
            r12 = 1
        L31:
            if (r11 == 0) goto L60
            if (r12 == 0) goto L5f
            com.huawei.hms.scankit.aiscan.common.z[] r12 = r11.h()
            if (r12 == 0) goto L5f
        L3b:
            int r13 = r12.length
            if (r1 >= r13) goto L5f
            r13 = r12[r1]
            if (r13 == 0) goto L5c
            com.huawei.hms.scankit.aiscan.common.z r13 = new com.huawei.hms.scankit.aiscan.common.z
            r14 = r12[r1]
            float r14 = r14.c()
            int r0 = r10.c()
            int r0 = r0 - r8
            float r0 = (float) r0
            r2 = r12[r1]
            float r2 = r2.b()
            float r0 = r0 - r2
            r13.<init>(r14, r0)
            r12[r1] = r13
        L5c:
            int r1 = r1 + 1
            goto L3b
        L5f:
            return r11
        L60:
            com.huawei.hms.scankit.aiscan.common.a r10 = com.huawei.hms.scankit.aiscan.common.C0628a.a()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.aiscan.common.o.a(com.huawei.hms.scankit.p.w, com.huawei.hms.scankit.p.w, java.util.Map, com.huawei.hms.scankit.aiscan.common.l, com.huawei.hms.scankit.p.L):com.huawei.hms.scankit.aiscan.common.x");
    }

    @Override // com.huawei.hms.scankit.aiscan.common.t
    public x a(C0728w c0728w, Map<EnumC0631d, ?> map) {
        return a(c0728w, a(map), map);
    }

    public t[] a(Map<EnumC0631d, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(EnumC0631d.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.UPC_E) || collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.CODABAR) || collection.contains(BarcodeFormat.CODE_39) || collection.contains(BarcodeFormat.CODE_93) || collection.contains(BarcodeFormat.CODE_128) || collection.contains(BarcodeFormat.ITF)) {
                arrayList.add(new W(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE)) {
                arrayList.add(new Xa());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList.add(new com.huawei.hms.scankit.p.E());
            }
            if (collection.contains(BarcodeFormat.AZTEC)) {
                arrayList.add(new com.huawei.hms.scankit.p.r());
            }
            if (collection.contains(BarcodeFormat.PDF_417)) {
                arrayList.add(new C0725va());
            }
        }
        return (t[]) arrayList.toArray(new t[arrayList.size()]);
    }
}
