package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.C0632e;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.Map;

/* loaded from: classes.dex */
public final class r implements com.huawei.hms.scankit.aiscan.common.t {
    @Override // com.huawei.hms.scankit.aiscan.common.t
    public com.huawei.hms.scankit.aiscan.common.x a(C0728w c0728w, Map<EnumC0631d, ?> map) {
        com.huawei.hms.scankit.aiscan.common.z[] zVarArr;
        com.huawei.hms.scankit.aiscan.common.A a10;
        C0720u c0720u = new C0720u(c0728w.b());
        C0632e c0632e = null;
        try {
            C0705q a11 = c0720u.a(false);
            zVarArr = a11.d();
            try {
                C0632e a12 = new C0716t().a(a11, map);
                e = null;
                c0632e = a12;
            } catch (C0628a e10) {
                e = e10;
            }
        } catch (C0628a e11) {
            e = e11;
            zVarArr = null;
        }
        if (c0632e == null) {
            try {
                C0705q a13 = c0720u.a(true);
                zVarArr = a13.d();
                c0632e = new C0716t().a(a13, map);
            } catch (C0628a e12) {
                if (zVarArr == null || _a.f7792c) {
                    if (e != null) {
                        throw e;
                    }
                    throw e12;
                }
                return new com.huawei.hms.scankit.aiscan.common.x(null, null, 0, (com.huawei.hms.scankit.aiscan.common.z[]) zVarArr.clone(), BarcodeFormat.AZTEC, System.currentTimeMillis());
            }
        }
        com.huawei.hms.scankit.aiscan.common.z[] zVarArr2 = zVarArr;
        if (map != null && (a10 = (com.huawei.hms.scankit.aiscan.common.A) map.get(EnumC0631d.NEED_RESULT_POINT_CALLBACK)) != null && zVarArr2 != null) {
            for (com.huawei.hms.scankit.aiscan.common.z zVar : zVarArr2) {
                a10.a(zVar);
            }
        }
        return new com.huawei.hms.scankit.aiscan.common.x(c0632e.d(), c0632e.c(), c0632e.a(), zVarArr2, BarcodeFormat.AZTEC, System.currentTimeMillis());
    }
}
