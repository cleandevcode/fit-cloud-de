package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.C0632e;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.Map;

/* loaded from: classes.dex */
public final class E implements com.huawei.hms.scankit.aiscan.common.t {

    /* renamed from: a */
    private static final com.huawei.hms.scankit.aiscan.common.z[] f7498a = new com.huawei.hms.scankit.aiscan.common.z[0];

    /* renamed from: b */
    private final H f7499b = new H();

    @Override // com.huawei.hms.scankit.aiscan.common.t
    public com.huawei.hms.scankit.aiscan.common.x a(C0728w c0728w, Map<EnumC0631d, ?> map) {
        com.huawei.hms.scankit.aiscan.common.g a10 = new I(c0728w.b()).a();
        try {
            C0632e a11 = this.f7499b.a(a10.a(), map);
            return new com.huawei.hms.scankit.aiscan.common.x(a11.d(), a11.c(), a10.d(), BarcodeFormat.DATA_MATRIX);
        } catch (C0628a e10) {
            if (a10.d() == null || _a.f7792c) {
                throw e10;
            }
            double sqrt = Math.sqrt(Math.pow(a10.d()[0].c() - a10.d()[1].c(), 2.0d) + Math.pow(a10.d()[0].b() - a10.d()[1].b(), 2.0d));
            double sqrt2 = Math.sqrt(Math.pow(a10.d()[0].c() - a10.d()[3].c(), 2.0d) + Math.pow(a10.d()[0].b() - a10.d()[3].b(), 2.0d));
            if (this.f7499b.a() == null || Math.abs(sqrt - sqrt2) / sqrt >= 0.1d) {
                throw e10;
            }
            return new com.huawei.hms.scankit.aiscan.common.x(null, null, a10.d(), BarcodeFormat.DATA_MATRIX);
        }
    }
}
