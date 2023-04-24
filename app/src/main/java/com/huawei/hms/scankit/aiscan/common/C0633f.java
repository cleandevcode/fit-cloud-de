package com.huawei.hms.scankit.aiscan.common;

import com.huawei.hms.scankit.p.C0736y;
import com.huawei.hms.scankit.p._a;

/* renamed from: com.huawei.hms.scankit.aiscan.common.f */
/* loaded from: classes.dex */
public final class C0633f extends j {
    @Override // com.huawei.hms.scankit.aiscan.common.j
    public C0736y a(C0736y c0736y, int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return a(c0736y, i10, i11, q.a(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25), false);
    }

    public C0736y a(C0736y c0736y, int i10, int i11, q qVar) {
        if (i10 <= 0 || i11 <= 0) {
            throw C0628a.a();
        }
        C0736y c0736y2 = new C0736y(i10, i11);
        float[] fArr = new float[10];
        float f10 = 0.5f;
        char c10 = 0;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = 0;
            while (i13 < i10) {
                float f11 = i13;
                fArr[c10] = (f11 - 0.2f) + f10;
                float f12 = i12;
                float f13 = f12 + f10;
                fArr[1] = f13;
                fArr[2] = f11 + 0.2f + f10;
                fArr[3] = f13;
                float f14 = f11 + f10;
                fArr[4] = f14;
                fArr[5] = (f12 - 0.2f) + f10;
                fArr[6] = f14;
                fArr[7] = f12 + 0.2f + f10;
                fArr[8] = f14;
                fArr[9] = f13;
                if (_a.f7800k && _a.f7797h) {
                    qVar.b(fArr);
                } else {
                    qVar.a(fArr);
                }
                int d10 = c0736y.d();
                int b10 = c0736y.b();
                int i14 = 0;
                for (int i15 = 0; i15 < 5; i15++) {
                    int i16 = i15 * 2;
                    try {
                        int i17 = (int) fArr[i16];
                        int i18 = (int) fArr[i16 + 1];
                        if (i17 >= -1 && i17 <= d10 && i18 >= -1 && i18 <= b10) {
                            if (c0736y.b(i17, i18)) {
                                i14++;
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw C0628a.a();
                    }
                }
                if (i14 >= 3) {
                    c0736y2.c(i13, i12);
                }
                i13++;
                f10 = 0.5f;
                c10 = 0;
            }
            i12++;
            f10 = 0.5f;
            c10 = 0;
        }
        return c0736y2;
    }

    @Override // com.huawei.hms.scankit.aiscan.common.j
    public C0736y a(C0736y c0736y, int i10, int i11, q qVar, boolean z10) {
        boolean z11 = _a.f7798i;
        return (z11 && z10) || ((!z11 && !z10) || _a.f7805p) ? b(c0736y, i10, i11, qVar) : a(c0736y, i10, i11, qVar);
    }

    public C0736y b(C0736y c0736y, int i10, int i11, q qVar) {
        int i12;
        if (i10 <= 0 || i11 <= 0) {
            throw C0628a.a();
        }
        C0736y c0736y2 = new C0736y(i10, i11);
        int i13 = i10 * 2;
        float[] fArr = new float[i13];
        for (int i14 = 0; i14 < i11; i14++) {
            float f10 = i14 + 0.5f;
            for (int i15 = 0; i15 < i13; i15 += 2) {
                fArr[i15] = (i15 / 2) + 0.5f;
                fArr[i15 + 1] = f10;
            }
            if (_a.f7800k && _a.f7797h) {
                qVar.b(fArr);
            } else {
                qVar.a(fArr);
            }
            int d10 = c0736y.d();
            int b10 = c0736y.b();
            while (i12 < i13) {
                try {
                    int i16 = (int) fArr[i12];
                    int i17 = (int) fArr[i12 + 1];
                    i12 = (i16 >= -1 && i16 <= d10 && i17 >= -1 && i17 <= b10 && !c0736y.b(i16, i17)) ? i12 + 2 : 0;
                    c0736y2.c(i12 / 2, i14);
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C0628a.a();
                }
            }
        }
        return c0736y2;
    }
}
