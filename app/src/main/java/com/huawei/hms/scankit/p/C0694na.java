package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;

/* renamed from: com.huawei.hms.scankit.p.na */
/* loaded from: classes.dex */
final class C0694na extends C0690ma {

    /* renamed from: c */
    private final boolean f8003c;

    public C0694na(C0670ha c0670ha, boolean z10) {
        super(c0670ha);
        this.f8003c = z10;
    }

    private void a(C0674ia[] c0674iaArr, C0662fa c0662fa) {
        for (int i10 = 0; i10 < c0674iaArr.length; i10++) {
            C0674ia c0674ia = c0674iaArr[i10];
            if (c0674ia != null) {
                int e10 = c0674ia.e() % 30;
                int c10 = c0674ia.c();
                if (c10 > c0662fa.c()) {
                    c0674iaArr[i10] = null;
                } else {
                    if (!this.f8003c) {
                        c10 += 2;
                    }
                    int i11 = c10 % 3;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw C0628a.a();
                            }
                            if (e10 + 1 != c0662fa.a()) {
                                c0674iaArr[i10] = null;
                            }
                        } else if (e10 / 3 != c0662fa.b() || e10 % 3 != c0662fa.d()) {
                            c0674iaArr[i10] = null;
                        }
                    } else if ((e10 * 3) + 1 != c0662fa.e()) {
                        c0674iaArr[i10] = null;
                    }
                }
            }
        }
    }

    private void b(C0662fa c0662fa) {
        C0670ha a10 = a();
        com.huawei.hms.scankit.aiscan.common.z g10 = this.f8003c ? a10.g() : a10.h();
        com.huawei.hms.scankit.aiscan.common.z a11 = this.f8003c ? a10.a() : a10.b();
        int c10 = c((int) a11.c());
        C0674ia[] b10 = b();
        int i10 = -1;
        int i11 = 0;
        int i12 = 1;
        for (int c11 = c((int) g10.c()); c11 < c10; c11++) {
            C0674ia c0674ia = b10[c11];
            if (c0674ia != null) {
                c0674ia.h();
                int c12 = c0674ia.c() - i10;
                if (c12 == 0) {
                    i11++;
                } else {
                    if (c12 == 1) {
                        i12 = Math.max(i12, i11);
                    } else if (c0674ia.c() >= c0662fa.c()) {
                        b10[c11] = null;
                    }
                    i10 = c0674ia.c();
                    i11 = 1;
                }
            }
        }
    }

    private void f() {
        C0674ia[] b10;
        for (C0674ia c0674ia : b()) {
            if (c0674ia != null) {
                c0674ia.h();
            }
        }
    }

    public void a(C0662fa c0662fa) {
        C0674ia[] b10 = b();
        f();
        a(b10, c0662fa);
        C0670ha a10 = a();
        com.huawei.hms.scankit.aiscan.common.z g10 = this.f8003c ? a10.g() : a10.h();
        com.huawei.hms.scankit.aiscan.common.z a11 = this.f8003c ? a10.a() : a10.b();
        int c10 = c((int) g10.c());
        int c11 = c((int) a11.c());
        int i10 = -1;
        int i11 = 0;
        int i12 = 1;
        while (c10 < c11) {
            C0674ia c0674ia = b10[c10];
            if (c0674ia != null) {
                int c12 = c0674ia.c() - i10;
                if (c12 == 0) {
                    i11++;
                } else {
                    if (c12 == 1) {
                        i12 = Math.max(i12, i11);
                    } else if (c12 < 0 || c0674ia.c() >= c0662fa.c() || c12 > c10) {
                        b10[c10] = null;
                    } else {
                        if (i12 > 2) {
                            c12 *= i12 - 2;
                        }
                        boolean z10 = c12 >= c10;
                        for (int i13 = 1; i13 <= c12 && !z10; i13++) {
                            z10 = b10[c10 - i13] != null;
                        }
                        if (z10) {
                            b10[c10] = null;
                        }
                    }
                    i10 = c0674ia.c();
                    i11 = 1;
                }
            }
            c10++;
        }
    }

    public C0662fa c() {
        C0674ia[] b10 = b();
        C0666ga c0666ga = new C0666ga();
        C0666ga c0666ga2 = new C0666ga();
        C0666ga c0666ga3 = new C0666ga();
        C0666ga c0666ga4 = new C0666ga();
        for (C0674ia c0674ia : b10) {
            if (c0674ia != null) {
                c0674ia.h();
                int e10 = c0674ia.e() % 30;
                int c10 = c0674ia.c();
                if (!this.f8003c) {
                    c10 += 2;
                }
                int i10 = c10 % 3;
                if (i10 == 0) {
                    c0666ga2.a((e10 * 3) + 1);
                } else if (i10 == 1) {
                    c0666ga4.a(e10 / 3);
                    c0666ga3.a(e10 % 3);
                } else if (i10 != 2) {
                    throw C0628a.a();
                } else {
                    c0666ga.a(e10 + 1);
                }
            }
        }
        if (c0666ga.a().length == 0 || c0666ga2.a().length == 0 || c0666ga3.a().length == 0 || c0666ga4.a().length == 0 || c0666ga.a()[0] < 1 || c0666ga2.a()[0] + c0666ga3.a()[0] < 3 || c0666ga2.a()[0] + c0666ga3.a()[0] > 90) {
            return null;
        }
        C0662fa c0662fa = new C0662fa(c0666ga.a()[0], c0666ga2.a()[0], c0666ga3.a()[0], c0666ga4.a()[0]);
        a(b10, c0662fa);
        return c0662fa;
    }

    public int[] d() {
        C0674ia[] b10;
        int c10;
        C0662fa c11 = c();
        if (c11 == null) {
            return null;
        }
        b(c11);
        int c12 = c11.c();
        int[] iArr = new int[c12];
        for (C0674ia c0674ia : b()) {
            if (c0674ia != null && (c10 = c0674ia.c()) < c12) {
                iArr[c10] = iArr[c10] + 1;
            }
        }
        return iArr;
    }

    public boolean e() {
        return this.f8003c;
    }

    @Override // com.huawei.hms.scankit.p.C0690ma
    public String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("IsLeft: ");
        a10.append(this.f8003c);
        a10.append('\n');
        a10.append(super.toString());
        return a10.toString();
    }
}
