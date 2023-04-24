package com.huawei.hms.scankit;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import com.huawei.hms.scankit.p.C0728w;
import com.huawei.hms.scankit.p.C0736y;
import com.huawei.hms.scankit.p.L;
import com.huawei.hms.scankit.p.M;
import com.huawei.hms.scankit.p.Xa;
import com.huawei.hms.scankit.p._a;
import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    private com.huawei.hms.scankit.aiscan.common.m f7431a;

    /* renamed from: b */
    private C0728w f7432b;

    /* renamed from: c */
    private C0728w f7433c;

    /* renamed from: d */
    private C0728w f7434d;

    /* renamed from: e */
    private boolean f7435e = false;

    /* renamed from: f */
    private float f7436f = 0.0f;

    /* renamed from: g */
    private float f7437g = 0.0f;

    /* renamed from: h */
    private float f7438h = 0.0f;

    /* renamed from: j */
    private float f7440j = 1.778f;

    /* renamed from: k */
    private int f7441k = 0;

    /* renamed from: l */
    private int f7442l = 0;

    /* renamed from: i */
    public com.huawei.hms.scankit.aiscan.common.l f7439i = new com.huawei.hms.scankit.aiscan.common.l();

    public l(com.huawei.hms.scankit.aiscan.common.m mVar) {
        this.f7431a = mVar;
        this.f7432b = new C0728w(new com.huawei.hms.scankit.p.A(mVar));
        this.f7433c = new C0728w(new com.huawei.hms.scankit.p.B(this.f7431a));
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.huawei.hms.scankit.aiscan.common.x a(com.huawei.hms.scankit.aiscan.common.o r15, com.huawei.hms.scankit.aiscan.common.m r16, com.huawei.hms.scankit.aiscan.common.x r17, java.util.Map<com.huawei.hms.scankit.aiscan.common.EnumC0631d, java.lang.Object> r18, float r19, int r20, int r21) {
        /*
            r14 = this;
            r7 = r14
            r4 = r17
            r5 = r18
            r6 = r19
            r0 = r20
            r1 = r21
            boolean r2 = com.huawei.hms.scankit.p._a.f7790a
            r3 = 0
            if (r2 == 0) goto L9a
            r2 = 3
            com.huawei.hms.scankit.p.A r8 = new com.huawei.hms.scankit.p.A     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L4a
            r9 = r16
            r8.<init>(r9)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L48
            com.huawei.hms.scankit.p.w r10 = new com.huawei.hms.scankit.p.w     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L48
            r10.<init>(r8)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L48
            r8 = r15
            com.huawei.hms.scankit.aiscan.common.x r3 = r15.a(r10, r5)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L46
            if (r3 == 0) goto L2f
            java.lang.String r11 = r3.i()     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L46
            if (r11 == 0) goto L2f
            com.huawei.hms.scankit.aiscan.common.x r0 = r14.a(r3, r6, r0, r1)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L46
            return r0
        L2f:
            if (r3 == 0) goto L4f
            com.huawei.hms.scankit.aiscan.common.z[] r11 = r3.h()     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L46
            if (r11 == 0) goto L4f
            com.huawei.hms.scankit.aiscan.common.z[] r11 = r3.h()     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L46
            int r11 = r11.length     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L46
            if (r11 < r2) goto L4f
            com.huawei.hms.scankit.aiscan.common.z[] r3 = r3.h()     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L46
            r4.b(r3)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L46
            goto L4f
        L46:
            goto L4f
        L48:
            r8 = r15
            goto L4d
        L4a:
            r8 = r15
            r9 = r16
        L4d:
            r10 = r3
        L4f:
            if (r4 == 0) goto L8b
            com.huawei.hms.scankit.aiscan.common.z[] r3 = r17.h()     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8b
            if (r3 == 0) goto L8b
            com.huawei.hms.scankit.aiscan.common.z[] r3 = r17.h()     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8b
            int r3 = r3.length     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8b
            if (r3 < r2) goto L8b
            boolean r3 = com.huawei.hms.scankit.p._a.f7797h     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8b
            if (r3 != 0) goto L8b
            r3 = 6
            double[] r3 = new double[r3]     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8b
            r11 = 0
            r12 = 0
            r3[r11] = r12     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8b
            r11 = 1
            r3[r11] = r12     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8b
            r11 = 2
            r3[r11] = r12     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8b
            r3[r2] = r12     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8b
            r2 = 4
            r3[r2] = r12     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8b
            r2 = 5
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3[r2] = r11     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8b
            com.huawei.hms.scankit.aiscan.common.x r2 = r14.a(r10, r5, r4, r3)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8b
            if (r2 == 0) goto L8b
            java.lang.String r3 = r2.i()     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8b
            if (r3 == 0) goto L8b
            com.huawei.hms.scankit.aiscan.common.x r0 = r14.a(r2, r6, r0, r1)     // Catch: com.huawei.hms.scankit.aiscan.common.C0628a -> L8b
            return r0
        L8b:
            r0 = r14
            r1 = r10
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            com.huawei.hms.scankit.aiscan.common.x r3 = r0.a(r1, r2, r3, r4, r5, r6)
        L9a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.l.a(com.huawei.hms.scankit.aiscan.common.o, com.huawei.hms.scankit.aiscan.common.m, com.huawei.hms.scankit.aiscan.common.x, java.util.Map, float, int, int):com.huawei.hms.scankit.aiscan.common.x");
    }

    private com.huawei.hms.scankit.aiscan.common.x a(com.huawei.hms.scankit.aiscan.common.o oVar, com.huawei.hms.scankit.aiscan.common.m mVar, C0728w c0728w, Map<EnumC0631d, Object> map, float f10, L l10) {
        com.huawei.hms.scankit.aiscan.common.x xVar = null;
        if (_a.f7790a && !_a.f7791b) {
            try {
                C0728w c0728w2 = new C0728w(new com.huawei.hms.scankit.p.A(mVar));
                try {
                    xVar = oVar.a(c0728w2, map);
                    if (xVar != null && xVar.i() != null) {
                        M.a(xVar.h(), f10, l10);
                        return xVar;
                    }
                } catch (C0628a unused) {
                }
                c0728w = c0728w2;
            } catch (C0628a unused2) {
            }
            if (xVar != null && xVar.h() != null && xVar.h().length >= 3) {
                try {
                    xVar = a(c0728w, map, xVar, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d});
                    if (xVar != null && xVar.i() != null) {
                        M.a(xVar.h(), f10, l10);
                        return xVar;
                    }
                } catch (C0628a unused3) {
                }
            }
        }
        C0728w c0728w3 = new C0728w(new com.huawei.hms.scankit.p.B(mVar));
        try {
            com.huawei.hms.scankit.aiscan.common.x a10 = oVar.a(c0728w3, map);
            if (a10 == null || a10.i() == null) {
                throw C0628a.a();
            }
            M.a(a10.h(), f10, l10);
            return a10;
        } catch (C0628a unused4) {
            if (_a.f7790a && !_a.f7791b && xVar != null && xVar.h() != null && xVar.h().length >= 3 && (xVar = a(c0728w3, map, xVar, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d})) != null && xVar.i() != null) {
                M.a(xVar.h(), f10, l10);
            }
            return xVar;
        }
    }

    private com.huawei.hms.scankit.aiscan.common.x a(com.huawei.hms.scankit.aiscan.common.x xVar, float f10, int i10, int i11) {
        if (xVar != null && xVar.h().length == 4 && (f10 != 1.0f || i10 != 0 || i11 != 0)) {
            com.huawei.hms.scankit.aiscan.common.z[] zVarArr = new com.huawei.hms.scankit.aiscan.common.z[4];
            for (int i12 = 0; i12 < 4; i12++) {
                zVarArr[i12] = new com.huawei.hms.scankit.aiscan.common.z((xVar.h()[i12].b() * f10) + i10, (xVar.h()[i12].c() * f10) + i11);
            }
            xVar.a();
            xVar.a(zVarArr);
        }
        return xVar;
    }

    public static com.huawei.hms.scankit.aiscan.common.x a(l lVar) {
        float a10 = lVar.a(lVar.f7432b);
        com.huawei.hms.scankit.aiscan.common.x xVar = new com.huawei.hms.scankit.aiscan.common.x(1.0f);
        xVar.b(a10);
        xVar.b(new L(false, 0.0f, 0.0f, lVar.f7432b.e(), lVar.f7432b.e(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f));
        return xVar;
    }

    private com.huawei.hms.scankit.aiscan.common.x a(C0728w c0728w, com.huawei.hms.scankit.aiscan.common.o oVar, com.huawei.hms.scankit.aiscan.common.m mVar, com.huawei.hms.scankit.aiscan.common.x xVar, Map<EnumC0631d, Object> map, float f10) {
        com.huawei.hms.scankit.aiscan.common.x xVar2 = null;
        try {
            Xa.a(this.f7431a, xVar);
            if (_a.f7792c && _a.f7806q[1]) {
                _a.f7803n = true;
                xVar2 = oVar.a(this.f7432b, map);
                _a.f7803n = false;
                if (xVar2 != null && xVar2.i() != null) {
                    return a(xVar2, f10, 0, 0);
                }
            }
        } catch (C0628a unused) {
            _a.f7803n = false;
        }
        float e10 = c0728w.e() / c0728w.c();
        if (e10 < 1.0f) {
            e10 = 1.0f / e10;
        }
        if (!_a.f7797h && !_a.f7798i) {
            double d10 = e10;
            if (d10 > 1.27d && d10 < 1.272d) {
                _a.f7805p = true;
                try {
                    com.huawei.hms.scankit.aiscan.common.x a10 = oVar.a(new C0728w(new com.huawei.hms.scankit.p.B(mVar)), map);
                    if (a10 != null) {
                        try {
                            if (a10.i() != null) {
                                return a(a10, f10, 0, 0);
                            }
                        } catch (C0628a unused2) {
                        }
                    }
                    xVar2 = a10;
                } catch (C0628a unused3) {
                }
                _a.f7805p = false;
            }
        }
        return xVar2;
    }

    private com.huawei.hms.scankit.aiscan.common.x a(C0728w c0728w, com.huawei.hms.scankit.aiscan.common.x xVar, com.huawei.hms.scankit.aiscan.common.x xVar2, com.huawei.hms.scankit.aiscan.common.o oVar, Map<EnumC0631d, Object> map, float f10, L l10) {
        try {
            if (_a.f7790a) {
                c0728w.a(a(c0728w.d(), c0728w.e(), c0728w.c()));
                xVar = oVar.a(c0728w, map);
                if (xVar != null && xVar.i() == null && xVar.h() != null && xVar.h().length >= 3) {
                    com.huawei.hms.scankit.aiscan.common.x xVar3 = new com.huawei.hms.scankit.aiscan.common.x(null, null, xVar.h(), BarcodeFormat.QR_CODE);
                    try {
                        xVar = a(c0728w, map, xVar, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d});
                    } catch (C0628a unused) {
                        xVar2 = xVar3;
                        if (xVar == null && (_a.f7808s || (!_a.f7792c && _a.f7801l))) {
                            try {
                                c0728w.a(c0728w.b().c());
                                com.huawei.hms.scankit.aiscan.common.x a10 = oVar.a(c0728w, map);
                                if (a10 != null && a10.i() != null) {
                                    M.a(a10.h(), f10, l10);
                                    return a10;
                                }
                            } catch (C0628a unused2) {
                            }
                        }
                        return xVar2;
                    }
                }
                if (xVar != null && xVar.i() != null) {
                    M.a(xVar.h(), f10, l10);
                    return xVar;
                }
            }
            throw C0628a.a();
        } catch (C0628a unused3) {
        }
    }

    private com.huawei.hms.scankit.aiscan.common.x a(C0728w c0728w, Map<EnumC0631d, Object> map, com.huawei.hms.scankit.aiscan.common.x xVar, double[] dArr) {
        com.huawei.hms.scankit.aiscan.common.x xVar2;
        if (c0728w == null) {
            return null;
        }
        com.huawei.hms.scankit.aiscan.common.o oVar = new com.huawei.hms.scankit.aiscan.common.o();
        int[] iArr = {0, 0};
        byte[] a10 = com.huawei.hms.scankit.aiscan.common.D.a(c0728w, map, xVar, iArr, dArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        com.huawei.hms.scankit.aiscan.common.r rVar = new com.huawei.hms.scankit.aiscan.common.r(a10, i10, i11, 0, 0, i10, i11, false);
        try {
            xVar2 = oVar.a(new C0728w(new com.huawei.hms.scankit.p.A(rVar)), map);
            if (xVar2 != null) {
                try {
                    if (xVar2.i() != null) {
                        com.huawei.hms.scankit.aiscan.common.z[] a11 = com.huawei.hms.scankit.aiscan.common.D.a(xVar2.h(), c0728w.e(), c0728w.c(), dArr);
                        xVar2.a();
                        xVar2.b(a11);
                        return xVar2;
                    }
                } catch (C0628a unused) {
                    C0728w c0728w2 = new C0728w(new com.huawei.hms.scankit.p.B(rVar));
                    try {
                        com.huawei.hms.scankit.aiscan.common.x a12 = oVar.a(c0728w2, map);
                        if (a12 == null || a12.i() == null) {
                            throw C0628a.a();
                        }
                        com.huawei.hms.scankit.aiscan.common.z[] a13 = com.huawei.hms.scankit.aiscan.common.D.a(a12.h(), c0728w.e(), c0728w.c(), dArr);
                        a12.a();
                        a12.b(a13);
                        return a12;
                    } catch (C0628a unused2) {
                        c0728w2.a(a(rVar.b(), rVar.c(), rVar.a()));
                        try {
                            com.huawei.hms.scankit.aiscan.common.x a14 = oVar.a(c0728w2, map);
                            if (a14 == null || a14.i() == null) {
                                throw C0628a.a();
                            }
                            com.huawei.hms.scankit.aiscan.common.z[] a15 = com.huawei.hms.scankit.aiscan.common.D.a(a14.h(), c0728w.e(), c0728w.c(), dArr);
                            a14.a();
                            a14.b(a15);
                            return a14;
                        } catch (C0628a unused3) {
                            return xVar2;
                        }
                    }
                }
            }
            throw C0628a.a();
        } catch (C0628a unused4) {
            xVar2 = xVar;
        }
    }

    public static com.huawei.hms.scankit.aiscan.common.x a(List<L> list, l lVar) {
        for (L l10 : list) {
            if (_a.f7791b || l10.h() > 0.4d) {
                int j10 = (int) l10.j();
                int k10 = (int) l10.k();
                if (j10 > lVar.f7431a.c() / 3 && j10 < (lVar.f7431a.c() * 2) / 3 && k10 > lVar.f7431a.a() / 3 && k10 < (lVar.f7431a.a() * 2) / 3) {
                    float a10 = lVar.a(lVar.f7434d);
                    com.huawei.hms.scankit.aiscan.common.x xVar = new com.huawei.hms.scankit.aiscan.common.x(1.0f);
                    xVar.a(a10);
                    xVar.a(l10);
                    return xVar;
                }
            }
        }
        return null;
    }

    public static C0736y a(byte[] bArr, int i10, int i11) {
        byte[] adaptivebinary = LoadOpencvJNIUtil.adaptivebinary(bArr, i11, i10, 45);
        if (adaptivebinary != null) {
            C0736y c0736y = new C0736y(i10, i11);
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i10; i13++) {
                    if (adaptivebinary[(i12 * i10) + i13] == 0) {
                        c0736y.c(i13, i12);
                    }
                }
            }
            return c0736y;
        }
        throw C0628a.a();
    }

    private static boolean a(C0728w c0728w, L l10) {
        if (_a.f7790a && !_a.f7791b) {
            float d10 = l10.d();
            float e10 = l10.e();
            float f10 = l10.f();
            float c10 = l10.c();
            float f11 = d10 - ((f10 * 0.2f) / 2.0f);
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            float f12 = e10 - ((0.2f * c10) / 2.0f);
            float f13 = f12 >= 0.0f ? f12 : 0.0f;
            float f14 = (f10 * 1.2f) + f11;
            if (f14 > c0728w.e()) {
                f14 = c0728w.e();
            }
            float f15 = (c10 * 1.2f) + f13;
            if (f15 > c0728w.c()) {
                f15 = c0728w.c();
            }
            float f16 = f14 - f11;
            float f17 = f15 - f13;
            if (f16 < c0728w.e() / 2.0f && f17 < c0728w.c() / 2.0f) {
                for (L l11 : M.a(_a.f7791b, c0728w.a((int) f11, (int) f13, (int) f16, (int) f17), 0, true)) {
                    boolean z10 = l11.g() == 1.0f && ((double) l11.h()) > 0.5d;
                    boolean z11 = l10.g() == 2.0f && l11.g() == 2.0f && ((double) l11.h()) > 0.7d;
                    boolean z12 = l10.g() == 3.0f && l11.g() == 3.0f && ((double) l11.h()) > 0.7d;
                    if (z10 || z11) {
                        return true;
                    }
                    if (z12) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private C0728w b(C0728w c0728w) {
        int e10 = c0728w.e();
        int c10 = c0728w.c();
        int i10 = (int) (e10 * 0.75d);
        int i11 = (int) (c10 * 0.75d);
        int i12 = (e10 - i10) / 2;
        this.f7441k += i12;
        int i13 = (c10 - i11) / 2;
        this.f7442l += i13;
        return c0728w.a(i12, i13, i10, i11);
    }

    private void b(List<L> list) {
        for (L l10 : list) {
            l10.a(this.f7431a.c(), this.f7431a.a(), this.f7441k, this.f7442l);
            float min = Math.min(Math.abs(l10.i() % 90.0f), 90.0f - Math.abs(l10.i() % 90.0f));
            if (l10.f() * l10.c() > this.f7431a.a() * 0.9f * this.f7431a.c() && min < 5.0f) {
                l10.b(this.f7431a.c(), this.f7431a.a());
            }
        }
    }

    private C0728w c(C0728w c0728w) {
        int e10 = c0728w.e();
        int c10 = c0728w.c();
        if (e10 < c10) {
            if (c10 / e10 > 1.2d) {
                int i10 = (int) (e10 * 1.2d);
                int i11 = (c10 - i10) / 2;
                this.f7442l = i11;
                return c0728w.a(0, i11, e10, i10);
            }
            return c0728w;
        } else if (e10 / c10 > 1.2d) {
            int i12 = (int) (c10 * 1.2d);
            int i13 = (e10 - i12) / 2;
            this.f7441k = i13;
            return c0728w.a(i13, 0, i12, c10);
        } else {
            return c0728w;
        }
    }

    public float a(C0728w c0728w) {
        byte[] b10 = (c0728w == null || (c0728w.a() == null && c0728w.a().c() == null)) ? null : c0728w.a().c().b();
        if (b10 == null) {
            return 1.0f;
        }
        long j10 = 0;
        int e10 = c0728w.e();
        int c10 = c0728w.c();
        for (int i10 = c10 / 4; i10 < (c10 * 3) / 4; i10++) {
            for (int i11 = e10 / 4; i11 < (e10 * 3) / 4; i11++) {
                j10 += b10[(i10 * e10) + i11] & 255;
            }
        }
        return (float) ((j10 / b10.length) * 4);
    }

    public com.huawei.hms.scankit.aiscan.common.x a(List<BarcodeFormat> list, L l10) {
        com.huawei.hms.scankit.aiscan.common.o oVar = new com.huawei.hms.scankit.aiscan.common.o();
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0631d.POSSIBLE_FORMATS, list);
        if (_a.f7792c) {
            hashMap.put(EnumC0631d.PHOTO_MODE, Boolean.valueOf(_a.f7792c));
        }
        com.huawei.hms.scankit.aiscan.common.x xVar = null;
        try {
            xVar = l10 != null ? oVar.a(this.f7432b, this.f7434d, hashMap, this.f7439i, l10) : oVar.a(this.f7432b, (C0728w) null, hashMap, this.f7439i, (L) null);
        } catch (C0628a unused) {
        }
        if (xVar != null || _a.f7791b || l10 == null || !_a.f7792c || l10.h() >= 0.8d) {
            return xVar;
        }
        float i10 = l10.i() % 180.0f;
        boolean z10 = true;
        boolean z11 = ((double) l10.c()) > ((double) this.f7432b.c()) * 0.97d && ((i10 < 5.0f && i10 > -5.0f) || i10 < -175.0f || i10 > 175.0f);
        if (l10.b() <= this.f7432b.e() * 0.97d || ((i10 >= 95.0f || i10 <= 85.0f) && (i10 >= -85.0f || i10 <= -95.0f))) {
            z10 = false;
        }
        if (z11 || z10) {
            this.f7439i.a();
            try {
                return oVar.a(this.f7432b, (C0728w) null, hashMap, this.f7439i, (L) null);
            } catch (C0628a unused2) {
                return xVar;
            }
        }
        return xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.huawei.hms.scankit.aiscan.common.x a(java.util.Map<com.huawei.hms.scankit.aiscan.common.EnumC0631d, java.lang.Object> r14) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.l.a(java.util.Map):com.huawei.hms.scankit.aiscan.common.x");
    }

    public com.huawei.hms.scankit.aiscan.common.x a(Map<EnumC0631d, Object> map, L l10) {
        C0728w c0728w;
        float f10;
        com.huawei.hms.scankit.aiscan.common.x xVar;
        C0728w c0728w2;
        com.huawei.hms.scankit.aiscan.common.x xVar2;
        com.huawei.hms.scankit.aiscan.common.o oVar = new com.huawei.hms.scankit.aiscan.common.o();
        C0728w c0728w3 = this.f7434d;
        if (c0728w3 == null) {
            return null;
        }
        _a.f7793d = true;
        int e10 = c0728w3.e() > this.f7434d.c() ? this.f7434d.e() : this.f7434d.c();
        if (!_a.f7790a || e10 <= 500) {
            c0728w = this.f7434d;
            f10 = 1.0f;
        } else {
            float f11 = e10 / 500.0f;
            if (f11 < 1.0f) {
                f11 = 1.0f;
            }
            c0728w = this.f7439i.g(this.f7434d, f11);
            f10 = f11;
        }
        try {
            if (_a.f7799j) {
                c0728w = new C0728w(new com.huawei.hms.scankit.p.A(com.huawei.hms.scankit.aiscan.common.C.a(c0728w.a().c())));
            }
            com.huawei.hms.scankit.aiscan.common.x a10 = oVar.a(c0728w, map);
            if (a10 != null) {
                try {
                    if (a10.i() == null && a10.h() != null && a10.h().length >= 3) {
                        xVar = new com.huawei.hms.scankit.aiscan.common.x(null, null, a10.h(), BarcodeFormat.QR_CODE);
                        try {
                            a10 = a(c0728w, map, a10, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d});
                        } catch (C0628a unused) {
                            c0728w2 = c0728w;
                            xVar2 = a10;
                            com.huawei.hms.scankit.aiscan.common.x a11 = a(c0728w2, xVar2, xVar, oVar, map, f10, l10);
                            if ((a11 == null || a11.i() == null) && !_a.f7792c && a11 != null && a11.h() != null && a11.h().length >= 3) {
                                M.a(a11.h(), f10, l10);
                                float a12 = H.a(this.f7431a.c(), this.f7431a.a(), a11.h());
                                if (Math.abs(1.0f - a12) > 0.001d) {
                                    this.f7436f = a12;
                                    this.f7435e = true;
                                }
                            }
                            return a11;
                        }
                    }
                } catch (C0628a unused2) {
                    xVar = null;
                }
            }
            if (a10 == null || a10.i() == null) {
                throw C0628a.a();
            }
            M.a(a10.h(), f10, l10);
            return a10;
        } catch (C0628a unused3) {
            xVar = null;
            c0728w2 = c0728w;
            xVar2 = null;
        }
    }

    public List<L> a(int i10, boolean z10) {
        List<L> a10;
        C0728w c0728w;
        ArrayList arrayList = new ArrayList();
        if (_a.f7790a) {
            boolean z11 = _a.f7791b;
            if (z11) {
                a10 = M.a(z11, this.f7432b, i10, z10);
            } else {
                byte[] c10 = z.c();
                float[] d10 = z.d();
                int a11 = z.a();
                byte[] b10 = z.b();
                LoadOpencvJNIUtil.setModel(c10, c10.length, d10, a11, b10, b10.length);
                C0728w c0728w2 = this.f7432b;
                long currentTimeMillis = System.currentTimeMillis() % 10;
                boolean z12 = currentTimeMillis % 2 == 0;
                boolean z13 = currentTimeMillis % 3 == 0;
                if (i10 == 0 && !_a.f7792c && z12) {
                    c0728w2 = c(this.f7432b);
                } else if (i10 == 0 && !_a.f7792c && z13) {
                    c0728w2 = b(c(this.f7432b));
                } else {
                    float a12 = this.f7431a.a() / this.f7431a.c();
                    if (a12 > 1.35d) {
                        int a13 = (int) (this.f7431a.a() / 1.3f);
                        this.f7442l = 0;
                        this.f7441k = (-(a13 - this.f7431a.c())) / 2;
                        com.huawei.hms.scankit.aiscan.common.m mVar = this.f7431a;
                        c0728w = new C0728w(new com.huawei.hms.scankit.p.A(mVar.b(a13, mVar.a(), -this.f7441k, -this.f7442l)));
                    } else if (1.0f / a12 > 1.35d) {
                        int c11 = (int) (this.f7431a.c() / 1.3f);
                        this.f7442l = (-(c11 - this.f7431a.a())) / 2;
                        this.f7441k = 0;
                        com.huawei.hms.scankit.aiscan.common.m mVar2 = this.f7431a;
                        c0728w = new C0728w(new com.huawei.hms.scankit.p.A(mVar2.b(mVar2.c(), c11, -this.f7441k, -this.f7442l)));
                    }
                    c0728w2 = c0728w;
                }
                a10 = M.a(_a.f7791b, c0728w2, i10, z10);
            }
            List<L> list = a10;
            b(list);
            return list;
        }
        return arrayList;
    }

    public void a(L l10) {
        try {
            if (_a.f7790a) {
                M.a(_a.f7791b, this.f7432b, l10);
                this.f7434d = l10.f7592l;
            }
        } catch (C0628a unused) {
        }
    }

    public boolean a() {
        return this.f7435e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0080, code lost:
        if (a(r11.f7432b, r0) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0082, code lost:
        r1 = com.huawei.hms.scankit.p._a.f7796g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0085, code lost:
        if (r1 <= 4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0088, code lost:
        com.huawei.hms.scankit.p._a.f7796g = r1 + 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.util.List<com.huawei.hms.scankit.p.L> r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.l.a(java.util.List):boolean");
    }

    public float b() {
        return this.f7436f;
    }

    public com.huawei.hms.scankit.aiscan.common.x b(List<BarcodeFormat> list, L l10) {
        com.huawei.hms.scankit.aiscan.common.o oVar = new com.huawei.hms.scankit.aiscan.common.o();
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0631d.POSSIBLE_FORMATS, list);
        try {
            com.huawei.hms.scankit.aiscan.common.x a10 = l10 != null ? oVar.a(this.f7432b, this.f7433c, this.f7434d, hashMap, this.f7439i, l10) : oVar.a(this.f7432b, this.f7433c, null, hashMap, this.f7439i, null);
            try {
                if (_a.f7792c || a10 == null || a10.i() != null || a10.h() == null || a10.h().length < 3) {
                    return a10;
                }
                float b10 = H.b(this.f7431a.c(), this.f7431a.a(), a10.h());
                if (Math.abs(1.0f - b10) > 0.001d) {
                    this.f7438h = b10;
                    this.f7435e = true;
                    return a10;
                }
                return a10;
            } catch (C0628a unused) {
                return a10;
            }
        } catch (C0628a unused2) {
            return null;
        }
    }

    public float c() {
        return this.f7438h;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00f0 A[Catch: a -> 0x00f8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {a -> 0x00f8, blocks: (B:75:0x0038, B:104:0x00f0, B:81:0x0056, B:83:0x0064, B:89:0x007e, B:91:0x0089, B:97:0x009c, B:95:0x0094), top: B:122:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.huawei.hms.scankit.aiscan.common.x c(java.util.List<com.huawei.hms.scankit.aiscan.common.BarcodeFormat> r31, com.huawei.hms.scankit.p.L r32) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.l.c(java.util.List, com.huawei.hms.scankit.p.L):com.huawei.hms.scankit.aiscan.common.x");
    }

    public float d() {
        return this.f7437g;
    }

    public com.huawei.hms.scankit.aiscan.common.x d(List<BarcodeFormat> list, L l10) {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0631d.POSSIBLE_FORMATS, list);
        if (l10 == null) {
            com.huawei.hms.scankit.aiscan.common.x a10 = a(hashMap);
            if (a10 != null && a10.i() == null && _a.f7801l) {
                _a.f7797h = true;
                a10 = a(hashMap);
                _a.f7797h = false;
            }
            com.huawei.hms.scankit.aiscan.common.x xVar = a10;
            if (xVar != null && xVar.i() == null && _a.f7802m) {
                _a.f7798i = true;
                com.huawei.hms.scankit.aiscan.common.x a11 = a(hashMap);
                _a.f7798i = false;
                return a11;
            }
            return xVar;
        }
        com.huawei.hms.scankit.aiscan.common.x a12 = a(hashMap, l10);
        if (a12 != null && a12.i() == null && _a.f7800k) {
            _a.f7797h = true;
            a12 = f(list, l10);
            _a.f7797h = false;
        }
        if (a12 != null && a12.i() == null && _a.f7801l) {
            _a.f7798i = true;
            a12 = a(hashMap, l10);
            _a.f7798i = false;
        }
        if ((a12 == null || a12.i() == null) && _a.f7802m) {
            _a.f7799j = true;
            com.huawei.hms.scankit.aiscan.common.x a13 = a(hashMap, l10);
            _a.f7799j = false;
            return a13;
        }
        return a12;
    }

    public com.huawei.hms.scankit.aiscan.common.x e(List<BarcodeFormat> list, L l10) {
        com.huawei.hms.scankit.aiscan.common.m mVar;
        float f10;
        C0728w c0728w;
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0631d.POSSIBLE_FORMATS, list);
        try {
            com.huawei.hms.scankit.aiscan.common.m c10 = l10 != null ? this.f7434d.a().c() : this.f7431a;
            if (!_a.f7790a || (this.f7432b.e() <= 800 && this.f7432b.c() <= 800)) {
                mVar = c10;
                f10 = 1.0f;
            } else {
                float e10 = (this.f7432b.e() > this.f7432b.c() ? this.f7432b.e() : this.f7432b.c()) / 800.0f;
                mVar = this.f7439i.h(new C0728w(new com.huawei.hms.scankit.p.A(c10)), e10).a().c();
                f10 = e10;
            }
            if (mVar != null) {
                if (!_a.f7790a || _a.f7791b) {
                    c0728w = new C0728w(new com.huawei.hms.scankit.p.A(mVar));
                } else {
                    C0736y a10 = a(mVar.b(), mVar.c(), mVar.a());
                    c0728w = new C0728w(new com.huawei.hms.scankit.p.A(mVar));
                    c0728w.a(a10);
                }
                com.huawei.hms.scankit.aiscan.common.o oVar = new com.huawei.hms.scankit.aiscan.common.o();
                try {
                    com.huawei.hms.scankit.aiscan.common.x a11 = oVar.a(c0728w, hashMap);
                    if (a11 == null || a11.i() == null) {
                        throw C0628a.a();
                    }
                    M.a(a11.h(), f10, l10);
                    return a11;
                } catch (C0628a unused) {
                    return a(oVar, mVar, c0728w, hashMap, f10, l10);
                }
            }
            throw C0628a.a();
        } catch (C0628a unused2) {
            return null;
        }
    }

    public com.huawei.hms.scankit.aiscan.common.x f(List<BarcodeFormat> list, L l10) {
        C0728w c0728w;
        C0728w c0728w2;
        com.huawei.hms.scankit.aiscan.common.o oVar = new com.huawei.hms.scankit.aiscan.common.o();
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0631d.POSSIBLE_FORMATS, list);
        float f10 = 1.0f;
        boolean z10 = _a.f7790a;
        if (l10 == null) {
            if (!z10 || (this.f7432b.e() <= 500 && this.f7432b.c() <= 500)) {
                c0728w = this.f7432b;
            } else {
                f10 = (this.f7432b.e() > this.f7432b.c() ? this.f7432b.e() : this.f7432b.c()) / 500.0f;
                c0728w = this.f7439i.c(this.f7432b, f10);
            }
        } else if (!z10 || (c0728w2 = this.f7434d) == null || (c0728w2.e() <= 500 && this.f7434d.c() <= 500)) {
            c0728w = this.f7434d;
        } else {
            f10 = (this.f7434d.e() > this.f7434d.c() ? this.f7434d.e() : this.f7434d.c()) / 500.0f;
            c0728w = this.f7439i.g(this.f7434d, f10);
        }
        try {
            com.huawei.hms.scankit.aiscan.common.x a10 = oVar.a(c0728w, hashMap);
            if (a10 != null) {
                try {
                    if (a10.i() != null) {
                        M.a(a10.h(), f10, l10);
                        return a10;
                    }
                    return a10;
                } catch (C0628a unused) {
                    return a10;
                }
            }
            return a10;
        } catch (C0628a unused2) {
            return null;
        }
    }
}
