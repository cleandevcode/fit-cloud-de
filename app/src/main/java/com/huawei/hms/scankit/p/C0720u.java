package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;

/* renamed from: com.huawei.hms.scankit.p.u */
/* loaded from: classes.dex */
public final class C0720u {

    /* renamed from: a */
    private static final int[] f8075a = {3808, 476, 2107, 1799};

    /* renamed from: b */
    private final C0736y f8076b;

    /* renamed from: c */
    private boolean f8077c;

    /* renamed from: d */
    private int f8078d;

    /* renamed from: e */
    private int f8079e;

    /* renamed from: f */
    private int f8080f;

    /* renamed from: g */
    private int f8081g;

    /* renamed from: com.huawei.hms.scankit.p.u$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final int f8082a;

        /* renamed from: b */
        private final int f8083b;

        public a(int i10, int i11) {
            this.f8082a = i10;
            this.f8083b = i11;
        }

        public int a() {
            return this.f8082a;
        }

        public int b() {
            return this.f8083b;
        }

        public com.huawei.hms.scankit.aiscan.common.z c() {
            return new com.huawei.hms.scankit.aiscan.common.z(this.f8082a, this.f8083b);
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("<");
            a10.append(this.f8082a);
            a10.append(' ');
            return a1.b.a(a10, this.f8083b, '>');
        }
    }

    public C0720u(C0736y c0736y) {
        this.f8076b = c0736y;
    }

    private static float a(com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2) {
        return com.huawei.hms.scankit.aiscan.common.n.a(zVar.b(), zVar.c(), zVar2.b(), zVar2.c());
    }

    private static float a(a aVar, a aVar2) {
        return com.huawei.hms.scankit.aiscan.common.n.a(aVar.a(), aVar.b(), aVar2.a(), aVar2.b());
    }

    private int a() {
        if (this.f8077c) {
            return (this.f8078d * 4) + 11;
        }
        int i10 = this.f8078d;
        if (i10 <= 4) {
            return (i10 * 4) + 15;
        }
        return ((((i10 - 4) / 8) + 1) * 2) + (i10 * 4) + 15;
    }

    private static int a(long j10, boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = 7;
            i11 = 2;
        } else {
            i10 = 10;
            i11 = 4;
        }
        int i12 = i10 - i11;
        int[] iArr = new int[i10];
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iArr[i13] = ((int) j10) & 15;
            j10 >>= 4;
        }
        try {
            new com.huawei.hms.scankit.aiscan.common.u(com.huawei.hms.scankit.aiscan.common.h.f7244d).a(iArr, i12);
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 = (i14 << 4) + iArr[i15];
            }
            return i14;
        } catch (C0628a unused) {
            throw C0628a.a();
        }
    }

    private int a(com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2, int i10) {
        float a10 = a(zVar, zVar2);
        float f10 = a10 / i10;
        float b10 = zVar.b();
        float c10 = zVar.c();
        float b11 = ((zVar2.b() - zVar.b()) * f10) / a10;
        float c11 = ((zVar2.c() - zVar.c()) * f10) / a10;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f11 = i12;
            if (this.f8076b.b(com.huawei.hms.scankit.aiscan.common.n.a((f11 * b11) + b10), com.huawei.hms.scankit.aiscan.common.n.a((f11 * c11) + c10))) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }

    private static int a(int[] iArr, int i10) {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 = (i11 << 3) + ((i12 >> (i10 - 2)) << 1) + (i12 & 1);
        }
        int i13 = ((i11 & 1) << 11) + (i11 >> 1);
        for (int i14 = 0; i14 < 4; i14++) {
            if (Integer.bitCount(f8075a[i14] ^ i13) <= 2) {
                return i14;
            }
        }
        throw C0628a.a();
    }

    private a a(a aVar, boolean z10, int i10, int i11) {
        int a10 = aVar.a() + i10;
        int b10 = aVar.b();
        while (true) {
            b10 += i11;
            if (!a(a10, b10) || this.f8076b.b(a10, b10) != z10) {
                break;
            }
            a10 += i10;
        }
        int i12 = a10 - i10;
        int i13 = b10 - i11;
        while (a(i12, i13) && this.f8076b.b(i12, i13) == z10) {
            i12 += i10;
        }
        int i14 = i12 - i10;
        while (a(i14, i13) && this.f8076b.b(i14, i13) == z10) {
            i13 += i11;
        }
        return new a(i14, i13 - i11);
    }

    private C0736y a(C0736y c0736y, com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2, com.huawei.hms.scankit.aiscan.common.z zVar3, com.huawei.hms.scankit.aiscan.common.z zVar4) {
        com.huawei.hms.scankit.aiscan.common.j a10 = com.huawei.hms.scankit.aiscan.common.j.a();
        int a11 = a();
        float f10 = a11 / 2.0f;
        float f11 = this.f8080f;
        float f12 = f10 - f11;
        float f13 = f10 + f11;
        return a10.a(c0736y, a11, a11, f12, f12, f13, f12, f13, f13, f12, f13, zVar.b(), zVar.c(), zVar2.b(), zVar2.c(), zVar3.b(), zVar3.c(), zVar4.b(), zVar4.c());
    }

    private void a(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        int i10;
        long j10;
        long j11;
        if (!a(zVarArr[0]) || !a(zVarArr[1]) || !a(zVarArr[2]) || !a(zVarArr[3])) {
            throw C0628a.a();
        }
        int i11 = this.f8080f * 2;
        int[] iArr = {a(zVarArr[0], zVarArr[1], i11), a(zVarArr[1], zVarArr[2], i11), a(zVarArr[2], zVarArr[3], i11), a(zVarArr[3], zVarArr[0], i11)};
        this.f8081g = a(iArr, i11);
        long j12 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = iArr[(this.f8081g + i12) % 4];
            if (this.f8077c) {
                j10 = j12 << 7;
                j11 = (i13 >> 1) & 127;
            } else {
                j10 = j12 << 10;
                j11 = ((i13 >> 2) & 992) + ((i13 >> 1) & 31);
            }
            j12 = j10 + j11;
        }
        int a10 = a(j12, this.f8077c);
        if (this.f8077c) {
            this.f8078d = (a10 >> 6) + 1;
            i10 = a10 & 63;
        } else {
            this.f8078d = (a10 >> 11) + 1;
            i10 = a10 & 2047;
        }
        this.f8079e = i10 + 1;
    }

    private boolean a(int i10, int i11) {
        return i10 >= 0 && i10 < this.f8076b.d() && i11 > 0 && i11 < this.f8076b.b();
    }

    private boolean a(com.huawei.hms.scankit.aiscan.common.z zVar) {
        return a(com.huawei.hms.scankit.aiscan.common.n.a(zVar.b()), com.huawei.hms.scankit.aiscan.common.n.a(zVar.c()));
    }

    private boolean a(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a((int) Math.ceil((((aVar.f8082a + aVar2.f8082a) + aVar3.f8082a) + aVar4.f8082a) / 4.0f), (int) Math.ceil((((aVar.f8083b + aVar2.f8083b) + aVar3.f8083b) + aVar4.f8083b) / 4.0f));
        float a10 = a(aVar5, aVar);
        float a11 = a(aVar5, aVar2);
        float a12 = a(aVar5, aVar3);
        float a13 = a(aVar5, aVar4);
        double d10 = a10 / a11;
        if (d10 <= 0.75d || d10 >= 1.25d) {
            return false;
        }
        double d11 = a10 / a12;
        if (d11 <= 0.75d || d11 >= 1.25d) {
            return false;
        }
        double d12 = a10 / a13;
        return d12 > 0.75d && d12 < 1.25d;
    }

    private com.huawei.hms.scankit.aiscan.common.z[] a(a aVar) {
        int i10 = 1;
        this.f8080f = 1;
        a aVar2 = aVar;
        a aVar3 = aVar2;
        a aVar4 = aVar3;
        a aVar5 = aVar4;
        boolean z10 = true;
        while (this.f8080f < 9) {
            a a10 = a(aVar5, z10, i10, -1);
            a a11 = a(aVar4, z10, i10, i10);
            a a12 = a(aVar3, z10, -1, i10);
            a a13 = a(aVar2, z10, -1, -1);
            if (this.f8080f > 2) {
                double a14 = (a(a13, a10) * this.f8080f) / (a(aVar2, aVar5) * (this.f8080f + 2));
                if (a14 < 0.75d) {
                    break;
                } else if (a14 > 1.25d) {
                    break;
                } else if (!a(a10, a11, a12, a13)) {
                    break;
                } else if (!b(a10, a11, a12, a13)) {
                    int i11 = this.f8080f;
                    if (i11 == 5 || i11 == 7) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            z10 = !z10;
            this.f8080f++;
            aVar2 = a13;
            aVar5 = a10;
            aVar4 = a11;
            aVar3 = a12;
            i10 = 1;
        }
        int i12 = this.f8080f;
        if (i12 == 5 || i12 == 7) {
            this.f8077c = i12 == 5;
            com.huawei.hms.scankit.aiscan.common.z[] zVarArr = {new com.huawei.hms.scankit.aiscan.common.z(aVar5.a() + 0.5f, aVar5.b() - 0.5f), new com.huawei.hms.scankit.aiscan.common.z(aVar4.a() + 0.5f, aVar4.b() + 0.5f), new com.huawei.hms.scankit.aiscan.common.z(aVar3.a() - 0.5f, aVar3.b() + 0.5f), new com.huawei.hms.scankit.aiscan.common.z(aVar2.a() - 0.5f, aVar2.b() - 0.5f)};
            int i13 = this.f8080f * 2;
            return a(zVarArr, i13 - 3, i13);
        }
        throw C0628a.a();
    }

    private static com.huawei.hms.scankit.aiscan.common.z[] a(com.huawei.hms.scankit.aiscan.common.z[] zVarArr, int i10, int i11) {
        float f10 = i11 / (i10 * 2.0f);
        float b10 = zVarArr[0].b() - zVarArr[2].b();
        float c10 = zVarArr[0].c() - zVarArr[2].c();
        float b11 = (zVarArr[2].b() + zVarArr[0].b()) / 2.0f;
        float c11 = (zVarArr[2].c() + zVarArr[0].c()) / 2.0f;
        float f11 = b10 * f10;
        float f12 = c10 * f10;
        com.huawei.hms.scankit.aiscan.common.z zVar = new com.huawei.hms.scankit.aiscan.common.z(b11 + f11, c11 + f12);
        com.huawei.hms.scankit.aiscan.common.z zVar2 = new com.huawei.hms.scankit.aiscan.common.z(b11 - f11, c11 - f12);
        float b12 = zVarArr[1].b() - zVarArr[3].b();
        float c12 = zVarArr[1].c() - zVarArr[3].c();
        float b13 = (zVarArr[3].b() + zVarArr[1].b()) / 2.0f;
        float c13 = (zVarArr[3].c() + zVarArr[1].c()) / 2.0f;
        float f13 = b12 * f10;
        float f14 = f10 * c12;
        return new com.huawei.hms.scankit.aiscan.common.z[]{zVar, new com.huawei.hms.scankit.aiscan.common.z(b13 + f13, c13 + f14), zVar2, new com.huawei.hms.scankit.aiscan.common.z(b13 - f13, c13 - f14)};
    }

    private int b(a aVar, a aVar2) {
        float a10 = a(aVar, aVar2);
        float a11 = (aVar2.a() - aVar.a()) / a10;
        float b10 = (aVar2.b() - aVar.b()) / a10;
        float a12 = aVar.a();
        float b11 = aVar.b();
        boolean b12 = this.f8076b.b(aVar.a(), aVar.b());
        int ceil = (int) Math.ceil(a10);
        int i10 = 0;
        for (int i11 = 0; i11 < ceil; i11++) {
            a12 += a11;
            b11 += b10;
            if (this.f8076b.b(com.huawei.hms.scankit.aiscan.common.n.a(a12), com.huawei.hms.scankit.aiscan.common.n.a(b11)) != b12) {
                i10++;
            }
        }
        float f10 = i10 / a10;
        if (f10 <= 0.1f || f10 >= 0.9f) {
            return (f10 <= 0.1f) == b12 ? 1 : -1;
        }
        return 0;
    }

    private a b() {
        com.huawei.hms.scankit.aiscan.common.z c10;
        com.huawei.hms.scankit.aiscan.common.z zVar;
        com.huawei.hms.scankit.aiscan.common.z zVar2;
        com.huawei.hms.scankit.aiscan.common.z zVar3;
        com.huawei.hms.scankit.aiscan.common.z c11;
        com.huawei.hms.scankit.aiscan.common.z c12;
        com.huawei.hms.scankit.aiscan.common.z c13;
        com.huawei.hms.scankit.aiscan.common.z c14;
        try {
            com.huawei.hms.scankit.aiscan.common.z[] a10 = new com.huawei.hms.scankit.aiscan.common.F(this.f8076b).a();
            zVar2 = a10[0];
            zVar3 = a10[1];
            zVar = a10[2];
            c10 = a10[3];
        } catch (C0628a unused) {
            int d10 = this.f8076b.d() / 2;
            int b10 = this.f8076b.b() / 2;
            int i10 = d10 + 7;
            int i11 = b10 - 7;
            com.huawei.hms.scankit.aiscan.common.z c15 = a(new a(i10, i11), false, 1, -1).c();
            int i12 = b10 + 7;
            com.huawei.hms.scankit.aiscan.common.z c16 = a(new a(i10, i12), false, 1, 1).c();
            int i13 = d10 - 7;
            com.huawei.hms.scankit.aiscan.common.z c17 = a(new a(i13, i12), false, -1, 1).c();
            c10 = a(new a(i13, i11), false, -1, -1).c();
            zVar = c17;
            zVar2 = c15;
            zVar3 = c16;
        }
        int a11 = com.huawei.hms.scankit.aiscan.common.n.a((zVar.b() + (zVar3.b() + (c10.b() + zVar2.b()))) / 4.0f);
        int a12 = com.huawei.hms.scankit.aiscan.common.n.a((zVar.c() + (zVar3.c() + (c10.c() + zVar2.c()))) / 4.0f);
        try {
            com.huawei.hms.scankit.aiscan.common.z[] a13 = new com.huawei.hms.scankit.aiscan.common.F(this.f8076b, 15, a11, a12).a();
            c11 = a13[0];
            c12 = a13[1];
            c13 = a13[2];
            c14 = a13[3];
        } catch (C0628a unused2) {
            int i14 = a11 + 7;
            int i15 = a12 - 7;
            c11 = a(new a(i14, i15), false, 1, -1).c();
            int i16 = a12 + 7;
            c12 = a(new a(i14, i16), false, 1, 1).c();
            int i17 = a11 - 7;
            c13 = a(new a(i17, i16), false, -1, 1).c();
            c14 = a(new a(i17, i15), false, -1, -1).c();
        }
        return new a(com.huawei.hms.scankit.aiscan.common.n.a((c13.b() + (c12.b() + (c14.b() + c11.b()))) / 4.0f), com.huawei.hms.scankit.aiscan.common.n.a((c13.c() + (c12.c() + (c14.c() + c11.c()))) / 4.0f));
    }

    private boolean b(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a(aVar.a() - 3, aVar.b() + 3);
        a aVar6 = new a(aVar2.a() - 3, aVar2.b() - 3);
        a aVar7 = new a(aVar3.a() + 3, aVar3.b() - 3);
        a aVar8 = new a(aVar4.a() + 3, aVar4.b() + 3);
        int b10 = b(aVar8, aVar5);
        return b10 != 0 && b(aVar5, aVar6) == b10 && b(aVar6, aVar7) == b10 && b(aVar7, aVar8) == b10;
    }

    private com.huawei.hms.scankit.aiscan.common.z[] b(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        return a(zVarArr, this.f8080f * 2, a());
    }

    public C0705q a(boolean z10) {
        com.huawei.hms.scankit.aiscan.common.z[] a10 = a(b());
        if (z10) {
            com.huawei.hms.scankit.aiscan.common.z zVar = a10[0];
            a10[0] = a10[2];
            a10[2] = zVar;
        }
        a(a10);
        C0736y c0736y = this.f8076b;
        int i10 = this.f8081g;
        return new C0705q(a(c0736y, a10[i10 % 4], a10[(i10 + 1) % 4], a10[(i10 + 2) % 4], a10[(i10 + 3) % 4]), b(a10), this.f8077c, this.f8079e, this.f8078d);
    }
}
