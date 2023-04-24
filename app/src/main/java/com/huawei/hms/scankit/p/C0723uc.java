package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.p.uc */
/* loaded from: classes.dex */
public final class C0723uc implements Pb {

    /* renamed from: a */
    private final C0708qc f8087a = new C0708qc();

    @Override // com.huawei.hms.scankit.p.Pb
    public C0736y a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<Jc, ?> map) {
        if (barcodeFormat != BarcodeFormat.UPC_A) {
            throw new IllegalArgumentException("Can only encode UPC-A, but got " + barcodeFormat);
        }
        C0708qc c0708qc = this.f8087a;
        return c0708qc.a('0' + str, BarcodeFormat.EAN_13, i10, i11, map);
    }
}
