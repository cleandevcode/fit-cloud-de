package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.C0632e;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.Map;

/* loaded from: classes.dex */
public class Xa implements com.huawei.hms.scankit.aiscan.common.t {

    /* renamed from: a */
    private final Na f7771a = new Na();

    private int a(com.huawei.hms.scankit.aiscan.common.g gVar) {
        _a.f7794e = gVar.c();
        C0736y a10 = gVar.a();
        int[] iArr = {3, a10.d() - 4, 3};
        int[] iArr2 = {3, 3, a10.b() - 4};
        int i10 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            if (a(a10, iArr[i11], iArr2[i11])) {
                i10++;
            }
        }
        return i10;
    }

    public static void a(com.huawei.hms.scankit.aiscan.common.m mVar) {
        int a10 = mVar.a();
        if (a10 == mVar.c() && a10 == 805) {
            _a.f7806q[0] = true;
        }
    }

    public static void a(com.huawei.hms.scankit.aiscan.common.m mVar, com.huawei.hms.scankit.aiscan.common.x xVar) {
        boolean z10;
        int a10 = mVar.a();
        int c10 = mVar.c();
        while (true) {
            if (_a.f7807r.size() == 0) {
                z10 = false;
                break;
            }
            int intValue = _a.f7807r.pop().intValue();
            if (intValue != 0 && a10 % intValue == 0) {
                z10 = true;
                break;
            }
        }
        if (!(a10 == c10 && z10) || xVar == null || xVar.h() == null) {
            return;
        }
        float min = Math.min(Math.min(xVar.h()[0].b(), xVar.h()[1].b()), xVar.h()[2].b());
        if ((Math.max(Math.max(xVar.h()[0].c(), xVar.h()[1].c()), xVar.h()[2].c()) - Math.min(Math.min(xVar.h()[0].c(), xVar.h()[1].c()), xVar.h()[2].c())) * (Math.max(Math.max(xVar.h()[0].b(), xVar.h()[1].b()), xVar.h()[2].b()) - min) > a10 * c10 * 0.8d) {
            _a.f7806q[1] = true;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    private boolean a(C0736y c0736y, int i10, int i11) {
        if (c0736y != null && c0736y.b() >= 21 && c0736y.d() >= 21) {
            ?? b10 = c0736y.b(i10, i11);
            int i12 = b10;
            if (c0736y.b(i10 + 1, i11)) {
                i12 = b10 + 1;
            }
            int i13 = i12;
            if (!c0736y.b(i10 + 2, i11)) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (c0736y.b(i10 + 3, i11)) {
                i14 = i13 + 1;
            }
            int i15 = i14;
            if (c0736y.b(i10 - 1, i11)) {
                i15 = i14 + 1;
            }
            int i16 = i15;
            if (!c0736y.b(i10 - 2, i11)) {
                i16 = i15 + 1;
            }
            int i17 = i16;
            if (c0736y.b(i10 - 3, i11)) {
                i17 = i16 + 1;
            }
            int i18 = i17;
            if (c0736y.b(i10, i11 + 1)) {
                i18 = i17 + 1;
            }
            int i19 = i18;
            if (!c0736y.b(i10, i11 + 2)) {
                i19 = i18 + 1;
            }
            int i20 = i19;
            if (c0736y.b(i10, i11 + 3)) {
                i20 = i19 + 1;
            }
            int i21 = i20;
            if (c0736y.b(i10, i11 - 1)) {
                i21 = i20 + 1;
            }
            int i22 = i21;
            if (!c0736y.b(i10, i11 - 2)) {
                i22 = i21 + 1;
            }
            int i23 = i22;
            if (c0736y.b(i10, i11 - 3)) {
                i23 = i22 + 1;
            }
            return i23 > 10;
        }
        return false;
    }

    @Override // com.huawei.hms.scankit.aiscan.common.t
    public final com.huawei.hms.scankit.aiscan.common.x a(C0728w c0728w, Map<EnumC0631d, ?> map) {
        C0632e c0632e;
        boolean z10 = true;
        _a.f7795f++;
        try {
            com.huawei.hms.scankit.aiscan.common.g a10 = new Oa(c0728w.b()).a(map);
            int a11 = a(a10);
            boolean z11 = a11 > 0;
            try {
                c0632e = this.f7771a.a(a10.a(), map);
                z10 = false;
            } catch (Exception unused) {
                c0632e = null;
            }
            if (_a.f7792c) {
                if (z10 && a11 >= 2) {
                    return new com.huawei.hms.scankit.aiscan.common.x(null, null, a10.b(), BarcodeFormat.QR_CODE);
                }
            } else if (z10 && z11) {
                return new com.huawei.hms.scankit.aiscan.common.x(null, null, a10.b(), BarcodeFormat.QR_CODE);
            }
            if (z10) {
                throw C0628a.a();
            }
            if (c0632e == null) {
                return null;
            }
            com.huawei.hms.scankit.aiscan.common.z[] d10 = a10.d();
            if (c0632e.b() instanceof Wa) {
                ((Wa) c0632e.b()).a(d10);
            }
            com.huawei.hms.scankit.aiscan.common.x xVar = new com.huawei.hms.scankit.aiscan.common.x(c0632e.d(), c0632e.c(), d10, BarcodeFormat.QR_CODE);
            xVar.b(a10.b());
            return xVar;
        } catch (C0628a unused2) {
            throw C0628a.a();
        }
    }
}
