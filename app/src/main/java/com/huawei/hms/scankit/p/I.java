package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a */
    private final C0736y f7533a;

    /* renamed from: b */
    private final com.huawei.hms.scankit.aiscan.common.F f7534b;

    public I(C0736y c0736y) {
        this.f7533a = c0736y;
        this.f7534b = new com.huawei.hms.scankit.aiscan.common.F(c0736y);
    }

    private int a(com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2) {
        int i10;
        boolean z10;
        I i11 = this;
        int b10 = (int) zVar.b();
        int c10 = (int) zVar.c();
        int b11 = (int) zVar2.b();
        int c11 = (int) zVar2.c();
        boolean z11 = Math.abs(c11 - c10) > Math.abs(b11 - b10);
        if (!z11) {
            c10 = b10;
            b10 = c10;
            c11 = b11;
            b11 = c11;
        }
        int abs = Math.abs(c11 - c10);
        int abs2 = Math.abs(b11 - b10);
        int i12 = (-abs) / 2;
        int i13 = b10 < b11 ? 1 : -1;
        int i14 = c10 < c11 ? 1 : -1;
        boolean b12 = i11.f7533a.b(z11 ? b10 : c10, z11 ? c10 : b10);
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (c10 != c11) {
            boolean b13 = i11.f7533a.b(z11 ? b10 : c10, z11 ? c10 : b10);
            i15++;
            if (b13 != b12) {
                i10 = c11;
                z10 = z11;
                if (i15 > Math.ceil(i16 / 1.5d)) {
                    i17++;
                    i16 -= (i16 - i15) / i17;
                    b12 = b13;
                    i15 = 0;
                }
            } else {
                i10 = c11;
                z10 = z11;
            }
            i12 += abs2;
            if (i12 > 0) {
                if (b10 == b11) {
                    break;
                }
                b10 += i13;
                i12 -= abs;
            }
            c10 += i14;
            i11 = this;
            z11 = z10;
            c11 = i10;
        }
        return i17;
    }

    private static com.huawei.hms.scankit.aiscan.common.z a(com.huawei.hms.scankit.aiscan.common.z zVar, float f10, float f11) {
        float b10 = zVar.b();
        float c10 = zVar.c();
        return new com.huawei.hms.scankit.aiscan.common.z(b10 < f10 ? b10 - 1.0f : b10 + 1.0f, c10 < f11 ? c10 - 1.0f : c10 + 1.0f);
    }

    private static com.huawei.hms.scankit.aiscan.common.z a(com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2, int i10) {
        float f10 = i10 + 1;
        return new com.huawei.hms.scankit.aiscan.common.z(zVar.b() + ((zVar2.b() - zVar.b()) / f10), zVar.c() + ((zVar2.c() - zVar.c()) / f10));
    }

    private com.huawei.hms.scankit.aiscan.common.z a(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        com.huawei.hms.scankit.aiscan.common.z zVar = zVarArr[0];
        com.huawei.hms.scankit.aiscan.common.z zVar2 = zVarArr[1];
        com.huawei.hms.scankit.aiscan.common.z zVar3 = zVarArr[2];
        com.huawei.hms.scankit.aiscan.common.z zVar4 = zVarArr[3];
        int a10 = a(zVar, zVar4);
        com.huawei.hms.scankit.aiscan.common.z a11 = a(zVar, zVar2, (a(zVar2, zVar4) + 1) * 4);
        com.huawei.hms.scankit.aiscan.common.z a12 = a(zVar3, zVar2, (a10 + 1) * 4);
        int a13 = a(a11, zVar4);
        int a14 = a(a12, zVar4);
        float f10 = a13 + 1;
        com.huawei.hms.scankit.aiscan.common.z zVar5 = new com.huawei.hms.scankit.aiscan.common.z(((zVar3.b() - zVar2.b()) / f10) + zVar4.b(), ((zVar3.c() - zVar2.c()) / f10) + zVar4.c());
        float f11 = a14 + 1;
        com.huawei.hms.scankit.aiscan.common.z zVar6 = new com.huawei.hms.scankit.aiscan.common.z(((zVar.b() - zVar2.b()) / f11) + zVar4.b(), ((zVar.c() - zVar2.c()) / f11) + zVar4.c());
        if (a(zVar5)) {
            return (a(zVar6) && a(a11, zVar5) + a(a12, zVar5) <= a(a11, zVar6) + a(a12, zVar6)) ? zVar6 : zVar5;
        } else if (a(zVar6)) {
            return zVar6;
        } else {
            return null;
        }
    }

    private static C0736y a(C0736y c0736y, com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2, com.huawei.hms.scankit.aiscan.common.z zVar3, com.huawei.hms.scankit.aiscan.common.z zVar4, int i10, int i11) {
        float f10 = i10 - 0.5f;
        float f11 = i11 - 0.5f;
        return com.huawei.hms.scankit.aiscan.common.j.a().a(c0736y, i10, i11, 0.5f, 0.5f, f10, 0.5f, f10, f11, 0.5f, f11, zVar.b(), zVar.c(), zVar4.b(), zVar4.c(), zVar3.b(), zVar3.c(), zVar2.b(), zVar2.c());
    }

    private boolean a(com.huawei.hms.scankit.aiscan.common.z zVar) {
        return zVar.b() >= 0.0f && zVar.b() < ((float) this.f7533a.d()) && zVar.c() > 0.0f && zVar.c() < ((float) this.f7533a.b());
    }

    private com.huawei.hms.scankit.aiscan.common.z[] b(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        com.huawei.hms.scankit.aiscan.common.z zVar = zVarArr[0];
        com.huawei.hms.scankit.aiscan.common.z zVar2 = zVarArr[1];
        com.huawei.hms.scankit.aiscan.common.z zVar3 = zVarArr[3];
        com.huawei.hms.scankit.aiscan.common.z zVar4 = zVarArr[2];
        int a10 = a(zVar, zVar2);
        int a11 = a(zVar2, zVar3);
        int a12 = a(zVar3, zVar4);
        int a13 = a(zVar4, zVar);
        com.huawei.hms.scankit.aiscan.common.z[] zVarArr2 = {zVar4, zVar, zVar2, zVar3};
        if (a10 > a11) {
            zVarArr2[0] = zVar;
            zVarArr2[1] = zVar2;
            zVarArr2[2] = zVar3;
            zVarArr2[3] = zVar4;
            a10 = a11;
        }
        if (a10 > a12) {
            zVarArr2[0] = zVar2;
            zVarArr2[1] = zVar3;
            zVarArr2[2] = zVar4;
            zVarArr2[3] = zVar;
        } else {
            a12 = a10;
        }
        if (a12 > a13) {
            zVarArr2[0] = zVar3;
            zVarArr2[1] = zVar4;
            zVarArr2[2] = zVar;
            zVarArr2[3] = zVar2;
        }
        return zVarArr2;
    }

    private com.huawei.hms.scankit.aiscan.common.z[] c(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        com.huawei.hms.scankit.aiscan.common.z zVar = zVarArr[0];
        com.huawei.hms.scankit.aiscan.common.z zVar2 = zVarArr[1];
        com.huawei.hms.scankit.aiscan.common.z zVar3 = zVarArr[2];
        com.huawei.hms.scankit.aiscan.common.z zVar4 = zVarArr[3];
        int a10 = (a(zVar, zVar4) + 1) * 4;
        if (a(a(zVar2, zVar3, a10), zVar) < a(a(zVar3, zVar2, a10), zVar4)) {
            zVarArr[0] = zVar;
            zVarArr[1] = zVar2;
            zVarArr[2] = zVar3;
            zVarArr[3] = zVar4;
        } else {
            zVarArr[0] = zVar2;
            zVarArr[1] = zVar3;
            zVarArr[2] = zVar4;
            zVarArr[3] = zVar;
        }
        return zVarArr;
    }

    private com.huawei.hms.scankit.aiscan.common.z[] d(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        com.huawei.hms.scankit.aiscan.common.z zVar = zVarArr[0];
        com.huawei.hms.scankit.aiscan.common.z zVar2 = zVarArr[1];
        com.huawei.hms.scankit.aiscan.common.z zVar3 = zVarArr[2];
        com.huawei.hms.scankit.aiscan.common.z zVar4 = zVarArr[3];
        com.huawei.hms.scankit.aiscan.common.z a10 = a(zVar, zVar2, (a(zVar3, zVar4) + 1) * 4);
        com.huawei.hms.scankit.aiscan.common.z a11 = a(zVar3, zVar2, (a(zVar, zVar4) + 1) * 4);
        int a12 = a(a10, zVar4) + 1;
        int a13 = a(a11, zVar4) + 1;
        if ((a12 & 1) == 1) {
            a12++;
        }
        if ((a13 & 1) == 1) {
            a13++;
        }
        float b10 = (zVar4.b() + (zVar3.b() + (zVar2.b() + zVar.b()))) / 4.0f;
        float c10 = (zVar4.c() + (zVar3.c() + (zVar2.c() + zVar.c()))) / 4.0f;
        com.huawei.hms.scankit.aiscan.common.z a14 = a(zVar, b10, c10);
        com.huawei.hms.scankit.aiscan.common.z a15 = a(zVar2, b10, c10);
        com.huawei.hms.scankit.aiscan.common.z a16 = a(zVar3, b10, c10);
        com.huawei.hms.scankit.aiscan.common.z a17 = a(zVar4, b10, c10);
        int i10 = a13 * 4;
        int i11 = a12 * 4;
        return new com.huawei.hms.scankit.aiscan.common.z[]{a(a(a14, a15, i10), a17, i11), a(a(a15, a14, i10), a16, i11), a(a(a16, a17, i10), a15, i11), a(a(a17, a16, i10), a14, i11)};
    }

    public com.huawei.hms.scankit.aiscan.common.g a() {
        int i10;
        int i11;
        com.huawei.hms.scankit.aiscan.common.z[] c10 = c(b(this.f7534b.a()));
        com.huawei.hms.scankit.aiscan.common.z a10 = a(c10);
        c10[3] = a10;
        if (a10 != null) {
            com.huawei.hms.scankit.aiscan.common.z[] d10 = d(c10);
            com.huawei.hms.scankit.aiscan.common.z zVar = d10[0];
            com.huawei.hms.scankit.aiscan.common.z zVar2 = d10[1];
            com.huawei.hms.scankit.aiscan.common.z zVar3 = d10[2];
            com.huawei.hms.scankit.aiscan.common.z zVar4 = d10[3];
            int a11 = a(zVar, zVar4) + 1;
            int a12 = a(zVar3, zVar4) + 1;
            if ((a11 & 1) == 1) {
                a11++;
            }
            if ((a12 & 1) == 1) {
                a12++;
            }
            if (a11 * 4 >= a12 * 7 || a12 * 4 >= a11 * 7) {
                i10 = a11;
                i11 = a12;
            } else {
                i10 = Math.max(a11, a12);
                i11 = i10;
            }
            return new com.huawei.hms.scankit.aiscan.common.g(a(this.f7533a, zVar, zVar2, zVar3, zVar4, i10, i11), new com.huawei.hms.scankit.aiscan.common.z[]{zVar, zVar2, zVar3, zVar4});
        }
        throw C0628a.a();
    }
}
