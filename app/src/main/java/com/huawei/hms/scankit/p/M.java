package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.List;

/* loaded from: classes.dex */
public class M {

    /* renamed from: a */
    private static N f7606a;

    /* renamed from: b */
    private static C0728w f7607b;

    private static com.huawei.hms.scankit.aiscan.common.z a(float f10, float f11, L l10) {
        float[] fArr = l10.f7593m;
        if (fArr == null || fArr.length != 5) {
            return new com.huawei.hms.scankit.aiscan.common.z(f10, f11);
        }
        double d10 = f10 - fArr[0];
        double d11 = -fArr[4];
        double cos = Math.cos(d11) * d10;
        double sin = Math.sin(d11);
        float f12 = l10.f7593m[0];
        double sin2 = Math.sin(d11);
        double cos2 = Math.cos(d11) * (f11 - l10.f7593m[1]);
        float[] fArr2 = l10.f7593m;
        return new com.huawei.hms.scankit.aiscan.common.z((((int) (((sin * (f11 - l10.f7593m[1])) + cos) + f12)) - fArr2[2]) + l10.f7598r, (((int) ((cos2 + (sin2 * (-(f10 - f12)))) + fArr2[1])) - fArr2[3]) + l10.f7599s);
    }

    public static List<L> a(boolean z10, C0728w c0728w, int i10, boolean z11) {
        int e10 = c0728w.e();
        int c10 = c0728w.c();
        byte[] b10 = c0728w.a().c().b();
        N n10 = new N();
        f7606a = n10;
        n10.a(z10, b10, c10, e10, i10, z11);
        return f7606a.f7611a;
    }

    private static void a(C0728w c0728w, float f10, L l10, float[] fArr) {
        float min;
        float max;
        C0728w a10;
        float radians = (float) Math.toRadians(f10);
        double d10 = radians;
        int abs = (int) ((Math.abs(Math.cos(d10)) * l10.f7597q) + (Math.abs(Math.sin(d10)) * l10.f7596p));
        int abs2 = (int) ((Math.abs(Math.cos(d10)) * l10.f7596p) + (Math.abs(Math.sin(d10)) * l10.f7597q));
        float[] fArr2 = l10.f7593m;
        fArr2[0] = abs2 * 0.5f;
        fArr2[1] = abs * 0.5f;
        fArr2[2] = (abs2 - l10.f7596p) * 0.5f;
        fArr2[3] = (abs - l10.f7597q) * 0.5f;
        fArr2[4] = radians;
        if (f10 == 0.0f) {
            l10.f7600t = 0;
            l10.f7601u = 0;
            a10 = c0728w;
        } else {
            C0728w c0728w2 = new C0728w(new A(new com.huawei.hms.scankit.aiscan.common.r(LoadOpencvJNIUtil.imageRotate(c0728w.a().c().b(), l10.f7597q, l10.f7596p, abs, abs2, f10, 1.0d), abs2, abs, 0, 0, abs2, abs, false)));
            if ((l10.g() == 3.0f || l10.g() == 4.0f) && c0728w2.c() > c0728w2.e()) {
                min = Math.min(fArr[2], fArr[3]);
                max = Math.max(fArr[2], fArr[3]);
            } else {
                min = Math.max(fArr[2], fArr[3]);
                max = Math.min(fArr[2], fArr[3]);
            }
            l10.f7600t = (int) Math.max((abs2 * 0.5d) - (min * 0.5d), 0.0d);
            l10.f7601u = (int) Math.max((abs * 0.5d) - (max * 0.5d), 0.0d);
            a10 = c0728w2.a(l10.f7600t, l10.f7601u, Math.min(abs2 - l10.f7600t, (int) min), Math.min(abs - l10.f7601u, (int) max));
        }
        l10.f7592l = a10;
    }

    public static void a(C0736y c0736y, com.huawei.hms.scankit.aiscan.common.x xVar, float f10, L l10) {
        int c10;
        int c11;
        com.huawei.hms.scankit.aiscan.common.z[] h10 = xVar.h();
        float min = Math.min(h10[0].b(), h10[1].b());
        float max = Math.max(h10[0].b(), h10[1].b());
        float c12 = h10[0].c();
        if (max > c0736y.d() - 1) {
            max = c0736y.d() - 1;
        }
        float f11 = max;
        float b10 = c12 > ((float) (c0736y.b() - 1)) ? c0736y.b() - 1 : c12;
        int b11 = c0736y.b();
        try {
            int[] a10 = a(c0736y, h10, min, f11, b10, b11, new int[b11]);
            c10 = a10[0];
            c11 = a10[1];
        } catch (IndexOutOfBoundsException unused) {
            c10 = (int) h10[0].c();
            c11 = (int) h10[0].c();
        }
        float f12 = c10;
        float f13 = c11;
        com.huawei.hms.scankit.aiscan.common.z[] zVarArr = {new com.huawei.hms.scankit.aiscan.common.z(min, f12), new com.huawei.hms.scankit.aiscan.common.z(f11, f12), new com.huawei.hms.scankit.aiscan.common.z(f11, f13), new com.huawei.hms.scankit.aiscan.common.z(min, f13)};
        if (l10 != null) {
            a(zVarArr, f10, l10);
        }
        xVar.a();
        xVar.a(zVarArr);
    }

    public static void a(com.huawei.hms.scankit.aiscan.common.z[] zVarArr, float f10, L l10) {
        if (l10 == null || zVarArr == null) {
            return;
        }
        for (int i10 = 0; i10 < zVarArr.length; i10++) {
            zVarArr[i10] = a((zVarArr[i10].b() * f10) + l10.f7600t, (zVarArr[i10].c() * f10) + l10.f7601u, l10);
        }
    }

    public static boolean a(boolean z10, C0728w c0728w, L l10) {
        float i10;
        int e10;
        int e11 = c0728w.e();
        int c10 = c0728w.c();
        float[] fArr = {l10.j(), l10.k(), l10.f(), l10.c()};
        if (z10) {
            l10.f7594n = Math.max(l10.m(), l10.l());
            l10.f7595o = Math.min(l10.m(), l10.l());
            l10.i();
            i10 = (l10.g() == 11.0f || l10.g() == 0.0f) ? 0.0f : 0.0f;
            l10.f7602v = Math.max(fArr[2], fArr[3]);
            l10.f7598r = (int) Math.max(fArr[0] - (fArr[2] * 0.5d), 0.0d);
            e10 = (int) Math.max(fArr[1] - (fArr[3] * 0.5d), 0.0d);
        } else {
            i10 = l10.i();
            l10.f7602v = Math.max(fArr[2], fArr[3]);
            l10.f7598r = (int) l10.d();
            e10 = (int) l10.e();
        }
        l10.f7599s = e10;
        l10.f7596p = Math.min(e11 - l10.f7598r, (int) fArr[2]);
        int min = Math.min(c10 - l10.f7599s, (int) fArr[3]);
        l10.f7597q = min;
        int i11 = l10.f7596p;
        if (i11 <= 0 || min <= 0) {
            throw C0628a.a("crop_w <= 0 || crop_h <= 0");
        }
        C0728w a10 = c0728w.a(l10.f7598r, l10.f7599s, i11, min);
        f7607b = a10;
        a(a10, i10, l10, fArr);
        return true;
    }

    private static int[] a(C0736y c0736y, com.huawei.hms.scankit.aiscan.common.z[] zVarArr, float f10, float f11, float f12, int i10, int[] iArr) {
        int i11;
        int i12;
        int i13;
        int i14 = (int) f10;
        int i15 = i14;
        int i16 = 0;
        while (true) {
            i11 = ((int) f11) - 1;
            if (i15 >= i11) {
                break;
            }
            int i17 = (int) f12;
            boolean b10 = c0736y.b(i15, i17);
            i15++;
            if (c0736y.b(i15, i17) ^ b10) {
                i16++;
            }
        }
        int i18 = 0;
        for (int i19 = 0; i19 < i10; i19++) {
            int i20 = i14;
            int i21 = 0;
            while (i20 < i11) {
                boolean b11 = c0736y.b(i20, i19);
                i20++;
                if (b11 ^ c0736y.b(i20, i19)) {
                    i21++;
                }
            }
            float f13 = i16;
            if (i21 > 1.5f * f13) {
                i21 = 0;
            }
            if (i21 < f13 * 0.5f) {
                i21 = 0;
            }
            iArr[i19] = i21;
            if (i21 > i18) {
                i18 = i21;
            }
        }
        if (i18 > 0) {
            float[] fArr = new float[i10];
            for (int i22 = 0; i22 < i10; i22++) {
                fArr[i22] = iArr[i22] / i18;
            }
            float f14 = 0.0f;
            for (int i23 = 0; i23 < i10; i23++) {
                f14 += fArr[i23];
            }
            float f15 = f14 / i10;
            if (f15 > 1.0d) {
                f15 = 0.99f;
            }
            i12 = (int) f12;
            i13 = i12;
            while (true) {
                if (i13 < 0) {
                    i13 = 0;
                    break;
                } else if (fArr[i13] < f15) {
                    break;
                } else {
                    i13--;
                }
            }
            while (true) {
                if (i12 >= i10) {
                    i12 = 0;
                    break;
                } else if (fArr[i12] < f15) {
                    break;
                } else {
                    i12++;
                }
            }
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (i13 == 0 && i12 == 0) {
            i13 = ((int) zVarArr[0].c()) + (-10) < 0 ? 0 : ((int) zVarArr[0].c()) - 10;
            i12 = i10 - 1;
            if (((int) zVarArr[0].c()) + 10 <= i12) {
                i12 = ((int) zVarArr[0].c()) + 10;
            }
        }
        return new int[]{i13, i12};
    }
}
