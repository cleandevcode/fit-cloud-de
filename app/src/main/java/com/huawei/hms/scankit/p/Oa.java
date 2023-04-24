package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.Map;

/* loaded from: classes.dex */
public class Oa {

    /* renamed from: a */
    private final C0736y f7626a;

    /* renamed from: b */
    private com.huawei.hms.scankit.aiscan.common.A f7627b;

    public Oa(C0736y c0736y) {
        this.f7626a = c0736y;
    }

    private float a(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Oa oa2;
        boolean z10;
        boolean z11;
        int i19 = 1;
        boolean z12 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z12) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i20 = (-abs) / 2;
        int i21 = i14 < i16 ? 1 : -1;
        int i22 = i15 < i17 ? 1 : -1;
        int i23 = i16 + i21;
        int i24 = i14;
        int i25 = i15;
        int i26 = 0;
        while (true) {
            if (i24 == i23) {
                i18 = i23;
                break;
            }
            int i27 = z12 ? i25 : i24;
            int i28 = z12 ? i24 : i25;
            if (i26 == i19) {
                oa2 = this;
                z10 = z12;
                i18 = i23;
                z11 = true;
            } else {
                oa2 = this;
                z10 = z12;
                i18 = i23;
                z11 = false;
            }
            if (z11 == oa2.f7626a.b(i27, i28)) {
                if (i26 == 2) {
                    return com.huawei.hms.scankit.aiscan.common.n.a(i24, i25, i14, i15);
                }
                i26++;
            }
            i20 += abs2;
            if (i20 > 0) {
                if (i25 == i17) {
                    break;
                }
                i25 += i22;
                i20 -= abs;
            }
            i24 += i21;
            i23 = i18;
            z12 = z10;
            i19 = 1;
        }
        if (i26 == 2) {
            return com.huawei.hms.scankit.aiscan.common.n.a(i18, i17, i14, i15);
        }
        return Float.NaN;
    }

    private float a(com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2) {
        float b10 = b((int) zVar.b(), (int) zVar.c(), (int) zVar2.b(), (int) zVar2.c());
        float b11 = b((int) zVar2.b(), (int) zVar2.c(), (int) zVar.b(), (int) zVar.c());
        return Float.isNaN(b10) ? b11 / 7.0f : Float.isNaN(b11) ? b10 / 7.0f : (b10 + b11) / 14.0f;
    }

    private static int a(com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2, com.huawei.hms.scankit.aiscan.common.z zVar3, float f10) {
        int a10;
        int i10;
        try {
            a10 = ((com.huawei.hms.scankit.aiscan.common.n.a(com.huawei.hms.scankit.aiscan.common.z.a(zVar, zVar2) / f10) + com.huawei.hms.scankit.aiscan.common.n.a(com.huawei.hms.scankit.aiscan.common.z.a(zVar, zVar3) / f10)) / 2) + 7;
            i10 = a10 & 3;
        } catch (C0628a unused) {
            a10 = ((((int) (com.huawei.hms.scankit.aiscan.common.z.a(zVar, zVar2) / f10)) + ((int) (com.huawei.hms.scankit.aiscan.common.z.a(zVar, zVar3) / f10))) / 2) + 7;
            int i11 = a10 & 3;
            if (i11 != 0) {
                if (i11 != 2) {
                    return i11 != 3 ? a10 : a10 + 2;
                }
            }
        }
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return a10;
                }
                throw C0628a.a();
            }
            return a10 - 1;
        }
        return a10 + 1;
    }

    private int a(Qa qa2, Qa qa3, Qa qa4, float f10, int i10, Ya ya2, C0737ya[] c0737yaArr, C0737ya[] c0737yaArr2, int i11, int i12, C0737ya[] c0737yaArr3) {
        int i13;
        int i14;
        float b10 = qa4.b() + (qa3.b() - qa2.b());
        float c10 = qa4.c() + (qa3.c() - qa2.c());
        float f11 = i12;
        float f12 = 3.0f / f11;
        float f13 = 1.0f - f12;
        int b11 = (int) (((b10 - qa2.b()) * f13) + qa2.b());
        int c11 = (int) (((c10 - qa2.c()) * f13) + qa2.c());
        if (_a.f7806q[0] && i12 == 22) {
            i13 = 2;
            i14 = 8;
        } else {
            i13 = 4;
            i14 = 16;
        }
        for (int i15 = i13; i15 <= i14; i15 <<= 1) {
            try {
                c0737yaArr3[0] = a(f10, b11, c11, i15);
                break;
            } catch (C0628a unused) {
            }
        }
        float f14 = i10 - 6.5f;
        c0737yaArr3[1] = new C0737ya(f14, f14, qa4.e());
        C0737ya c0737ya = c0737yaArr3[0];
        if (c0737ya != null && com.huawei.hms.scankit.aiscan.common.n.a(b11, c11, c0737ya.b(), c0737yaArr3[0].c()) > f10 * 4.0f) {
            c0737yaArr3[0] = null;
        }
        if (c0737yaArr3[0] == null && i11 > 2) {
            int i16 = i11 - 2;
            c0737yaArr3[1] = new C0737ya(ya2.b()[i16] + 0.5f, f14, qa4.e());
            int c12 = (int) (qa4.c() - ((qa4.c() - qa2.c()) * f12));
            int b12 = (int) (qa4.b() + ((qa3.b() - qa2.b()) * ((ya2.b()[i16] - 3.0f) / f11)));
            while (i13 <= i14) {
                try {
                    c0737yaArr3[0] = a(f10, b12, c12, i13);
                    break;
                } catch (C0628a unused2) {
                    i13 <<= 1;
                }
            }
            C0737ya c0737ya2 = c0737yaArr3[0];
            if (c0737ya2 != null && com.huawei.hms.scankit.aiscan.common.n.a(b12, c12, c0737ya2.b(), c0737yaArr3[0].c()) > f10 * 4.0f) {
                c0737yaArr3[0] = null;
            }
        }
        if (_a.f7800k && _a.f7797h) {
            return a(ya2, i12, qa3, qa2, qa4, f10, i11, 0, c0737yaArr, c0737yaArr2);
        }
        return 0;
    }

    private int a(Ya ya2, int i10, Qa qa2, Qa qa3, Qa qa4, float f10, int i11, int i12, C0737ya[] c0737yaArr, C0737ya[] c0737yaArr2) {
        int i13;
        int i14;
        int i15;
        int i16 = i11;
        int i17 = i12;
        int i18 = 0;
        while (i18 < i16) {
            if (i18 == 0) {
                i13 = i16 - 1;
                i14 = 1;
            } else {
                i13 = i16;
                i14 = 0;
            }
            int i19 = i18 != i16 + (-1) ? i14 : 1;
            float f11 = 3.0f;
            float f12 = i10;
            float b10 = qa3.b() + (((qa2.b() - qa3.b()) * (ya2.b()[i18] - 3.0f)) / f12);
            float c10 = qa3.c() + (((qa2.c() - qa3.c()) * (ya2.b()[i18] - 3.0f)) / f12);
            while (i19 < i13) {
                int c11 = (int) (c10 - (((qa3.c() - qa4.c()) * (ya2.b()[i19] - f11)) / f12));
                int b11 = (int) (b10 - (((qa3.b() - qa4.b()) * (ya2.b()[i19] - f11)) / f12));
                int i20 = 4;
                int i21 = 4;
                while (true) {
                    if (i21 > i20) {
                        i15 = i13;
                        break;
                    }
                    int i22 = (i18 * i16) + i19;
                    try {
                        c0737yaArr[i22] = a(f10, b11, c11, i21);
                        i15 = i13;
                        try {
                            c0737yaArr2[i22] = new C0737ya(ya2.b()[i18] + 0.5f, ya2.b()[i19] + 0.5f, qa4.e());
                            i17++;
                            break;
                        } catch (C0628a unused) {
                            continue;
                        }
                    } catch (C0628a unused2) {
                        i15 = i13;
                    }
                    i21 <<= 1;
                    i16 = i11;
                    i13 = i15;
                    i20 = 4;
                }
                i19++;
                i16 = i11;
                i13 = i15;
                f11 = 3.0f;
            }
            i18++;
            i16 = i11;
        }
        return i17;
    }

    private com.huawei.hms.scankit.aiscan.common.g a(Qa qa2, Qa qa3, Qa qa4, float f10) {
        C0737ya[] c0737yaArr;
        C0737ya[] c0737yaArr2;
        C0737ya[] c0737yaArr3;
        char c10;
        int i10;
        com.huawei.hms.scankit.aiscan.common.q qVar;
        com.huawei.hms.scankit.aiscan.common.z[] zVarArr;
        int a10 = a((com.huawei.hms.scankit.aiscan.common.z) qa2, (com.huawei.hms.scankit.aiscan.common.z) qa3, (com.huawei.hms.scankit.aiscan.common.z) qa4, f10);
        _a.f7807r.push(Integer.valueOf(a10));
        Ya b10 = Ya.b(a10);
        if (_a.f7803n && _a.f7792c) {
            return a(qa2, qa3, qa4, f10, a10);
        }
        int c11 = b10.c() - 7;
        int length = b10.b().length;
        int i11 = length * length;
        C0737ya[] c0737yaArr4 = new C0737ya[i11];
        C0737ya[] c0737yaArr5 = new C0737ya[i11];
        C0737ya[] c0737yaArr6 = new C0737ya[2];
        if (b10.b().length > 0) {
            c0737yaArr = c0737yaArr6;
            c10 = 2;
            c0737yaArr2 = c0737yaArr5;
            c0737yaArr3 = c0737yaArr4;
            i10 = a(qa2, qa3, qa4, f10, a10, b10, c0737yaArr4, c0737yaArr5, length, c11, c0737yaArr);
        } else {
            c0737yaArr = c0737yaArr6;
            c0737yaArr2 = c0737yaArr5;
            c0737yaArr3 = c0737yaArr4;
            c10 = 2;
            i10 = 0;
        }
        C0737ya c0737ya = c0737yaArr[0];
        com.huawei.hms.scankit.aiscan.common.q a11 = a(qa2, qa3, qa4, c0737ya, c0737yaArr[1], a10);
        if (_a.f7800k && _a.f7797h) {
            qVar = a11;
            a(a11, length, a10, qa2, qa3, qa4, c0737yaArr3, i10, c0737yaArr2);
        } else {
            qVar = a11;
        }
        C0736y a12 = a(this.f7626a, qVar, a10);
        if (c0737ya == null) {
            zVarArr = new com.huawei.hms.scankit.aiscan.common.z[3];
            zVarArr[0] = qa4;
            zVarArr[1] = qa2;
            zVarArr[c10] = qa3;
        } else {
            zVarArr = new com.huawei.hms.scankit.aiscan.common.z[4];
            zVarArr[0] = qa4;
            zVarArr[1] = qa2;
            zVarArr[c10] = qa3;
            zVarArr[3] = c0737ya;
        }
        float[] fArr = new float[8];
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f11 = a10;
        fArr[c10] = f11;
        fArr[3] = 0.0f;
        fArr[4] = f11;
        fArr[5] = f11;
        fArr[6] = 0.0f;
        fArr[7] = f11;
        qVar.a(fArr);
        com.huawei.hms.scankit.aiscan.common.z zVar = new com.huawei.hms.scankit.aiscan.common.z(fArr[0], fArr[1], qa2.d());
        com.huawei.hms.scankit.aiscan.common.z zVar2 = new com.huawei.hms.scankit.aiscan.common.z(fArr[c10], fArr[3], qa3.d());
        com.huawei.hms.scankit.aiscan.common.z zVar3 = new com.huawei.hms.scankit.aiscan.common.z(fArr[4], fArr[5], qa4.d());
        com.huawei.hms.scankit.aiscan.common.z[] zVarArr2 = new com.huawei.hms.scankit.aiscan.common.z[4];
        zVarArr2[0] = a(new com.huawei.hms.scankit.aiscan.common.z(fArr[6], fArr[7]));
        zVarArr2[1] = a(zVar);
        zVarArr2[c10] = a(zVar2);
        zVarArr2[3] = a(zVar3);
        return new com.huawei.hms.scankit.aiscan.common.g(a12, zVarArr, zVarArr2, f10);
    }

    private com.huawei.hms.scankit.aiscan.common.g a(Qa qa2, Qa qa3, Qa qa4, float f10, int i10) {
        C0736y c0736y = new C0736y(i10, i10);
        float f11 = i10;
        float b10 = this.f7626a.b() / f11;
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                double d10 = b10 * 0.5d;
                int i13 = (int) ((i12 * b10) + d10);
                int i14 = (int) ((i11 * b10) + d10);
                if (i13 < -1 || i13 > this.f7626a.d() || i14 < -1 || i14 > this.f7626a.b() || this.f7626a.b(i13, i14)) {
                    c0736y.c(i12, i11);
                }
            }
        }
        com.huawei.hms.scankit.aiscan.common.z[] zVarArr = {qa4, qa2, qa3};
        float[] fArr = {0.0f, 0.0f, f11, 0.0f, f11, f11, 0.0f, f11};
        a(qa2, qa3, qa4, null, null, i10).a(fArr);
        return new com.huawei.hms.scankit.aiscan.common.g(c0736y, zVarArr, new com.huawei.hms.scankit.aiscan.common.z[]{a(new com.huawei.hms.scankit.aiscan.common.z(fArr[6], fArr[7])), a(new com.huawei.hms.scankit.aiscan.common.z(fArr[0], fArr[1])), a(new com.huawei.hms.scankit.aiscan.common.z(fArr[2], fArr[3])), a(new com.huawei.hms.scankit.aiscan.common.z(fArr[4], fArr[5]))}, f10);
    }

    private static com.huawei.hms.scankit.aiscan.common.q a(com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2, com.huawei.hms.scankit.aiscan.common.z zVar3, com.huawei.hms.scankit.aiscan.common.z zVar4, com.huawei.hms.scankit.aiscan.common.z zVar5, int i10) {
        float f10;
        float c10;
        float f11;
        float f12;
        float f13 = i10 - 3.5f;
        if (zVar4 != null) {
            float b10 = zVar4.b();
            float c11 = zVar4.c();
            f10 = b10;
            c10 = c11;
            f11 = zVar5.b();
            f12 = zVar5.c();
        } else {
            float b11 = zVar3.b() + (zVar2.b() - zVar.b());
            f10 = b11;
            c10 = zVar3.c() + (zVar2.c() - zVar.c());
            f11 = f13;
            f12 = f11;
        }
        return com.huawei.hms.scankit.aiscan.common.q.a(3.5f, 3.5f, f13, 3.5f, f11, f12, 3.5f, f13, zVar.b(), zVar.c(), zVar2.b(), zVar2.c(), f10, c10, zVar3.b(), zVar3.c());
    }

    private com.huawei.hms.scankit.aiscan.common.z a(com.huawei.hms.scankit.aiscan.common.z zVar) {
        float b10 = zVar.b();
        float c10 = zVar.c();
        int d10 = this.f7626a.d() - 1;
        int b11 = this.f7626a.b() - 1;
        if (b10 < 0.0f) {
            b10 = 0.0f;
        }
        float f10 = d10;
        if (b10 > f10) {
            b10 = f10;
        }
        if (c10 < 0.0f) {
            c10 = 0.0f;
        }
        float f11 = b11;
        if (c10 > f11) {
            c10 = f11;
        }
        return new com.huawei.hms.scankit.aiscan.common.z(b10, c10, zVar.d());
    }

    private static C0736y a(C0736y c0736y, com.huawei.hms.scankit.aiscan.common.q qVar, int i10) {
        return com.huawei.hms.scankit.aiscan.common.j.a().a(c0736y, i10, i10, qVar, true);
    }

    private void a(com.huawei.hms.scankit.aiscan.common.q qVar, int i10, int i11, Qa qa2, Qa qa3, Qa qa4, C0737ya[] c0737yaArr, int i12, C0737ya[] c0737yaArr2) {
        int i13 = i12 + 3;
        int i14 = i13 * 2;
        float[] fArr = new float[i14];
        float[] fArr2 = new float[i14];
        fArr[0] = qa2.b();
        fArr[1] = qa2.c();
        fArr[2] = qa3.b();
        fArr[3] = qa3.c();
        fArr[4] = qa4.b();
        fArr[5] = qa4.c();
        fArr2[0] = 3.5f;
        fArr2[1] = 3.5f;
        float f10 = i11 - 3.5f;
        fArr2[2] = f10;
        fArr2[3] = 3.5f;
        fArr2[4] = 3.5f;
        fArr2[5] = f10;
        int i15 = 6;
        int i16 = 6;
        for (int i17 = 0; i17 < i10 * i10; i17++) {
            C0737ya c0737ya = c0737yaArr[i17];
            if (c0737ya != null) {
                int i18 = i15 + 1;
                fArr[i15] = c0737ya.b();
                i15 = i18 + 1;
                fArr[i18] = c0737yaArr[i17].c();
                int i19 = i16 + 1;
                fArr2[i16] = c0737yaArr2[i17].b();
                i16 = i19 + 1;
                fArr2[i19] = c0737yaArr2[i17].c();
            }
        }
        float[] QuadFitting = LoadOpencvJNIUtil.QuadFitting(fArr2, i13, fArr);
        if (QuadFitting.length != 0) {
            qVar.a(QuadFitting[0], QuadFitting[1], QuadFitting[2], QuadFitting[3], QuadFitting[4], QuadFitting[5], QuadFitting[6], QuadFitting[7], QuadFitting[8], QuadFitting[9], QuadFitting[10], QuadFitting[11], QuadFitting[12], QuadFitting[13]);
        }
    }

    private float b(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float a10 = a(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f10 = i10 / (i10 - i14);
            i14 = 0;
        } else if (i14 >= this.f7626a.d()) {
            f10 = ((this.f7626a.d() - 1) - i10) / (i14 - i10);
            i14 = this.f7626a.d() - 1;
        } else {
            f10 = 1.0f;
        }
        float f12 = i11;
        int i16 = (int) (f12 - ((i13 - i11) * f10));
        if (i16 < 0) {
            f11 = f12 / (i11 - i16);
        } else if (i16 >= this.f7626a.b()) {
            f11 = ((this.f7626a.b() - 1) - i11) / (i16 - i11);
            i15 = this.f7626a.b() - 1;
        } else {
            i15 = i16;
            f11 = 1.0f;
        }
        float a11 = a(i10, i11, (int) (((i14 - i10) * f11) + i10), i15);
        if (Math.max(a10, a11) > Math.min(a10, a11) * 1.5d) {
            return Float.NaN;
        }
        return (a10 + a11) - 1.0f;
    }

    public final float a(com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2, com.huawei.hms.scankit.aiscan.common.z zVar3) {
        return (a(zVar, zVar2) + a(zVar, zVar3)) / 2.0f;
    }

    public final com.huawei.hms.scankit.aiscan.common.g a(Ta ta2) {
        Qa b10 = ta2.b();
        Qa c10 = ta2.c();
        Qa a10 = ta2.a();
        try {
            float a11 = a(b10, c10, a10);
            if (a11 >= 1.0f) {
                return a(b10, c10, a10, a11);
            }
            throw C0628a.a();
        } catch (C0628a unused) {
            float e10 = (a10.e() + (c10.e() + b10.e())) / 3.0f;
            if (e10 >= 1.0f) {
                return a(b10, c10, a10, e10);
            }
            throw C0628a.a();
        }
    }

    public final com.huawei.hms.scankit.aiscan.common.g a(Map<EnumC0631d, ?> map) {
        this.f7627b = map == null ? null : (com.huawei.hms.scankit.aiscan.common.A) map.get(EnumC0631d.NEED_RESULT_POINT_CALLBACK);
        return a(new Sa(this.f7626a, this.f7627b).a());
    }

    public final C0737ya a(float f10, int i10, int i11, float f11) {
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i10 - i12);
        int min = Math.min(this.f7626a.d() - 1, i10 + i12) - max;
        float f12 = 3.0f * f10;
        if (min >= f12) {
            int max2 = Math.max(0, i11 - i12);
            int min2 = Math.min(this.f7626a.b() - 1, i11 + i12) - max2;
            if (min2 >= f12) {
                return new C0741za(this.f7626a, max, max2, min, min2, f10, this.f7627b).a();
            }
            throw C0628a.a();
        }
        throw C0628a.a();
    }
}
