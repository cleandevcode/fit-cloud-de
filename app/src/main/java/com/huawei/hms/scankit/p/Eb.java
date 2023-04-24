package com.huawei.hms.scankit.p;

import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanBase;

/* loaded from: classes.dex */
public final class Eb extends Fb {
    @Override // com.huawei.hms.scankit.p.Fb
    public HmsScan b(com.huawei.hms.scankit.aiscan.common.x xVar) {
        int a10 = Fb.a(xVar.b());
        if (a10 == HmsScanBase.EAN13_SCAN_TYPE || a10 == HmsScanBase.EAN8_SCAN_TYPE || a10 == HmsScanBase.UPCCODE_A_SCAN_TYPE || a10 == HmsScanBase.UPCCODE_E_SCAN_TYPE) {
            String a11 = Fb.a(xVar);
            if (Fb.a(a11, a11.length())) {
                return new HmsScan(a11, Fb.a(xVar.b()), a11, HmsScan.ARTICLE_NUMBER_FORM, xVar.g(), Fb.a(xVar.h()), null, null);
            }
            return null;
        }
        return null;
    }
}
