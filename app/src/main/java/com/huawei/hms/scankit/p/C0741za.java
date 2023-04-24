package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.hms.scankit.p.za */
/* loaded from: classes.dex */
final class C0741za {

    /* renamed from: a */
    private final C0736y f8127a;

    /* renamed from: c */
    private final int f8129c;

    /* renamed from: d */
    private final int f8130d;

    /* renamed from: e */
    private final int f8131e;

    /* renamed from: f */
    private final int f8132f;

    /* renamed from: g */
    private final float f8133g;

    /* renamed from: i */
    private final com.huawei.hms.scankit.aiscan.common.A f8135i;

    /* renamed from: b */
    private final List<C0737ya> f8128b = new ArrayList(5);

    /* renamed from: h */
    private final int[] f8134h = new int[3];

    public C0741za(C0736y c0736y, int i10, int i11, int i12, int i13, float f10, com.huawei.hms.scankit.aiscan.common.A a10) {
        this.f8127a = c0736y;
        this.f8129c = i10;
        this.f8130d = i11;
        this.f8131e = i12;
        this.f8132f = i13;
        this.f8133g = f10;
        this.f8135i = a10;
    }

    private float a(int i10, int i11, int i12, int i13) {
        int i14;
        C0736y c0736y = this.f8127a;
        int b10 = c0736y.b();
        int[] iArr = this.f8134h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i15 = i10;
        while (i15 >= 0 && c0736y.b(i11, i15)) {
            int i16 = iArr[1];
            if (i16 > i12) {
                break;
            }
            iArr[1] = i16 + 1;
            i15--;
        }
        if (i15 < 0 || iArr[1] > i12) {
            return Float.NaN;
        }
        while (i15 >= 0 && !c0736y.b(i11, i15)) {
            int i17 = iArr[0];
            if (i17 > i12) {
                break;
            }
            iArr[0] = i17 + 1;
            i15--;
        }
        if (iArr[0] > i12) {
            return Float.NaN;
        }
        int i18 = i10 + 1;
        while (i18 < b10 && c0736y.b(i11, i18)) {
            int i19 = iArr[1];
            if (i19 > i12) {
                break;
            }
            iArr[1] = i19 + 1;
            i18++;
        }
        if (i18 == b10 || iArr[1] > i12) {
            return Float.NaN;
        }
        while (i18 < b10 && !c0736y.b(i11, i18)) {
            int i20 = iArr[2];
            if (i20 > i12) {
                break;
            }
            iArr[2] = i20 + 1;
            i18++;
        }
        int i21 = iArr[2];
        if (i21 <= i12 && (i14 = iArr[0] + iArr[1] + i21) < i13 * 3 && i14 * 3 > i13 && a(iArr)) {
            return a(iArr, i18);
        }
        return Float.NaN;
    }

    private static float a(int[] iArr, int i10) {
        return (i10 - iArr[2]) - (iArr[1] / 2.0f);
    }

    private C0737ya a(int i10, int i11, int i12, int[] iArr) {
        C0737ya a10;
        int i13 = 0;
        while (i11 < i12) {
            if (!this.f8127a.b(i11, i10)) {
                if (i13 == 1) {
                    i13++;
                }
                iArr[i13] = iArr[i13] + 1;
            } else if (i13 == 1) {
                iArr[1] = iArr[1] + 1;
            } else if (i13 != 2) {
                i13++;
                iArr[i13] = iArr[i13] + 1;
            } else if (a(iArr) && (a10 = a(iArr, i10, i11)) != null) {
                return a10;
            } else {
                iArr[0] = iArr[2];
                iArr[1] = 1;
                iArr[2] = 0;
                i13 = 1;
            }
            i11++;
        }
        return null;
    }

    private C0737ya a(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2];
        float a10 = a(iArr, i11);
        float a11 = a(i10, (int) a10, iArr[1] * 3, i12);
        if (Float.isNaN(a11)) {
            return null;
        }
        float f10 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (C0737ya c0737ya : this.f8128b) {
            if (c0737ya.a(f10, a11, a10)) {
                return c0737ya.b(a11, a10, f10);
            }
        }
        C0737ya c0737ya2 = new C0737ya(a10, a11, f10);
        this.f8128b.add(c0737ya2);
        com.huawei.hms.scankit.aiscan.common.A a12 = this.f8135i;
        if (a12 != null) {
            a12.a(c0737ya2);
            return null;
        }
        return null;
    }

    private boolean a(int[] iArr) {
        float f10 = this.f8133g;
        float f11 = (3.0f * f10) / 4.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f10 - iArr[i10]) >= f11) {
                return false;
            }
        }
        return true;
    }

    public C0737ya a() {
        C0737ya a10;
        int i10 = this.f8129c;
        int i11 = this.f8132f;
        int i12 = this.f8131e + i10;
        int i13 = (i11 / 2) + this.f8130d;
        int[] iArr = new int[3];
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = ((i14 & 1) == 0 ? (i14 + 1) / 2 : -((i14 + 1) / 2)) + i13;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i16 = i10;
            while (i16 < i12 && !this.f8127a.b(i16, i15)) {
                i16++;
            }
            C0737ya a11 = a(i15, i16, i12, iArr);
            if (a11 != null) {
                return a11;
            }
            if (a(iArr) && (a10 = a(iArr, i15, i12)) != null) {
                return a10;
            }
        }
        if (this.f8128b.isEmpty()) {
            throw C0628a.a();
        }
        return this.f8128b.get(0);
    }
}
