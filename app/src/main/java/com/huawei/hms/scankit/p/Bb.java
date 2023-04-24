package com.huawei.hms.scankit.p;

import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanBase;

/* loaded from: classes.dex */
public final class Bb extends Fb {
    @Override // com.huawei.hms.scankit.p.Fb
    public HmsScan b(com.huawei.hms.scankit.aiscan.common.x xVar) {
        if (Fb.a(xVar.b()) != HmsScanBase.EAN13_SCAN_TYPE) {
            return null;
        }
        String a10 = Fb.a(xVar);
        if (a10.length() != 13) {
            return null;
        }
        if (a10.startsWith("978") || a10.startsWith("979")) {
            return new HmsScan(xVar.i(), Fb.a(xVar.b()), a10, HmsScan.ISBN_NUMBER_FORM, xVar.g(), Fb.a(xVar.h()), null, null);
        }
        return null;
    }
}
