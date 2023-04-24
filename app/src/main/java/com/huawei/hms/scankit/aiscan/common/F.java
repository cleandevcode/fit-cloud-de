package com.huawei.hms.scankit.aiscan.common;

import com.huawei.hms.scankit.p.C0736y;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a */
    private final C0736y f7180a;

    /* renamed from: b */
    private final int f7181b;

    /* renamed from: c */
    private final int f7182c;

    /* renamed from: d */
    private final int f7183d;

    /* renamed from: e */
    private final int f7184e;

    /* renamed from: f */
    private final int f7185f;

    /* renamed from: g */
    private final int f7186g;

    public F(C0736y c0736y) {
        this(c0736y, 10, c0736y.d() / 2, c0736y.b() / 2);
    }

    public F(C0736y c0736y, int i10, int i11, int i12) {
        this.f7180a = c0736y;
        int b10 = c0736y.b();
        this.f7181b = b10;
        int d10 = c0736y.d();
        this.f7182c = d10;
        int i13 = i10 / 2;
        int i14 = i11 - i13;
        this.f7183d = i14;
        int i15 = i11 + i13;
        this.f7184e = i15;
        int i16 = i12 - i13;
        this.f7186g = i16;
        int i17 = i12 + i13;
        this.f7185f = i17;
        if (i16 < 0 || i14 < 0 || i17 >= b10 || i15 >= d10) {
            throw C0628a.a();
        }
    }

    private z a(float f10, float f11, float f12, float f13) {
        int a10 = n.a(n.a(f10, f11, f12, f13));
        float f14 = a10;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i10 = 0; i10 < a10; i10++) {
            float f17 = i10;
            int a11 = n.a((f17 * f15) + f10);
            int a12 = n.a((f17 * f16) + f11);
            if (this.f7180a.b(a11, a12)) {
                return new z(a11, a12);
            }
        }
        return null;
    }

    private void a(int[] iArr) {
        int i10;
        boolean z10 = true;
        while (true) {
            if ((!z10 && iArr[8] == 1) || (i10 = iArr[3]) >= this.f7181b) {
                return;
            }
            boolean a10 = a(iArr[0], iArr[1], i10, true);
            if (a10) {
                iArr[3] = iArr[3] + 1;
                iArr[5] = 1;
                iArr[8] = 1;
            } else if (iArr[8] != 1) {
                iArr[3] = iArr[3] + 1;
            }
            z10 = a10;
        }
    }

    private boolean a(int i10, int i11, int i12, boolean z10) {
        if (z10) {
            while (i10 <= i11) {
                if (this.f7180a.b(i10, i12)) {
                    return true;
                }
                i10++;
            }
            return false;
        }
        while (i10 <= i11) {
            if (this.f7180a.b(i12, i10)) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private z[] a(z zVar, z zVar2, z zVar3, z zVar4) {
        float b10 = zVar.b();
        float c10 = zVar.c();
        float b11 = zVar2.b();
        float c11 = zVar2.c();
        float b12 = zVar3.b();
        float c12 = zVar3.c();
        float b13 = zVar4.b();
        float c13 = zVar4.c();
        return b10 < ((float) this.f7182c) / 2.0f ? new z[]{new z(b13 - 1.0f, c13 + 1.0f), new z(b11 + 1.0f, c11 + 1.0f), new z(b12 - 1.0f, c12 - 1.0f), new z(b10 + 1.0f, c10 - 1.0f)} : new z[]{new z(b13 + 1.0f, c13 + 1.0f), new z(b11 + 1.0f, c11 - 1.0f), new z(b12 - 1.0f, c12 + 1.0f), new z(b10 - 1.0f, c10 - 1.0f)};
    }

    private z[] b(int[] iArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = iArr[1] - iArr[0];
        z zVar = null;
        z zVar2 = null;
        for (int i19 = 1; zVar2 == null && i19 < i18; i19++) {
            zVar2 = a(iArr[0], i17 - i19, i16 + i19, iArr[3]);
        }
        if (zVar2 != null) {
            z zVar3 = null;
            for (int i20 = 1; zVar3 == null && i20 < i18; i20++) {
                zVar3 = a(iArr[0], i15 + i20, i14 + i20, iArr[2]);
            }
            if (zVar3 != null) {
                z zVar4 = null;
                for (int i21 = 1; zVar4 == null && i21 < i18; i21++) {
                    zVar4 = a(iArr[1], i13 + i21, i12 - i21, iArr[2]);
                }
                if (zVar4 != null) {
                    for (int i22 = 1; zVar == null && i22 < i18; i22++) {
                        zVar = a(iArr[1], i11 - i22, i10 - i22, iArr[3]);
                    }
                    if (zVar != null) {
                        return a(zVar, zVar2, zVar4, zVar3);
                    }
                    throw C0628a.a();
                }
                throw C0628a.a();
            }
            throw C0628a.a();
        }
        throw C0628a.a();
    }

    private void c(int[] iArr) {
        int i10;
        boolean z10 = true;
        while (true) {
            if ((!z10 && iArr[9] == 1) || (i10 = iArr[0]) < 0) {
                return;
            }
            boolean a10 = a(iArr[2], iArr[3], i10, false);
            if (a10) {
                iArr[0] = iArr[0] - 1;
                iArr[5] = 1;
                iArr[9] = 1;
            } else if (iArr[9] != 1) {
                iArr[0] = iArr[0] - 1;
            }
            z10 = a10;
        }
    }

    private void d(int[] iArr) {
        int i10;
        boolean z10 = true;
        while (true) {
            if ((!z10 && iArr[7] == 1) || (i10 = iArr[1]) >= this.f7182c) {
                return;
            }
            z10 = a(iArr[2], iArr[3], i10, false);
            if (z10) {
                iArr[1] = iArr[1] + 1;
                iArr[5] = 1;
                iArr[7] = 1;
            } else if (iArr[7] != 1) {
                iArr[1] = iArr[1] + 1;
            }
        }
    }

    private void e(int[] iArr) {
        int i10;
        boolean z10 = true;
        while (true) {
            if ((!z10 && iArr[10] == 1) || (i10 = iArr[2]) < 0) {
                return;
            }
            boolean a10 = a(iArr[0], iArr[1], i10, true);
            if (a10) {
                iArr[2] = iArr[2] - 1;
                iArr[5] = 1;
                iArr[10] = 1;
            } else if (iArr[10] != 1) {
                iArr[2] = iArr[2] - 1;
            }
            z10 = a10;
        }
    }

    public z[] a() {
        int[] iArr = {this.f7183d, this.f7184e, this.f7186g, this.f7185f, 0, 1, 0, 0, 0, 0, 0};
        while (true) {
            if (iArr[5] != 1) {
                break;
            }
            iArr[5] = 0;
            d(iArr);
            if (iArr[1] >= this.f7182c) {
                iArr[4] = 1;
                break;
            }
            a(iArr);
            if (iArr[3] >= this.f7181b) {
                iArr[4] = 1;
                break;
            }
            c(iArr);
            if (iArr[0] < 0) {
                iArr[4] = 1;
                break;
            }
            e(iArr);
            if (iArr[2] < 0) {
                iArr[4] = 1;
                break;
            } else if (iArr[5] == 1) {
                iArr[6] = 1;
            }
        }
        if (iArr[4] == 1 || iArr[6] != 1) {
            throw C0628a.a();
        }
        return b(iArr);
    }
}
