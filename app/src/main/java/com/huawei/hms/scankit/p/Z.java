package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.Map;

/* loaded from: classes.dex */
public final class Z extends AbstractC0654da {

    /* renamed from: h */
    private final AbstractC0654da f7789h = new T();

    private static com.huawei.hms.scankit.aiscan.common.x a(com.huawei.hms.scankit.aiscan.common.x xVar) {
        String i10 = xVar.i();
        if (i10.charAt(0) == '0') {
            return new com.huawei.hms.scankit.aiscan.common.x(i10.substring(1), null, xVar.h(), BarcodeFormat.UPC_A);
        }
        throw C0628a.a();
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public int a(C0732x c0732x, int[] iArr, StringBuilder sb2) {
        return this.f7789h.a(c0732x, iArr, sb2);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public BarcodeFormat a() {
        return BarcodeFormat.UPC_A;
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da, com.huawei.hms.scankit.p.Y
    public com.huawei.hms.scankit.aiscan.common.x a(int i10, C0732x c0732x, Map<EnumC0631d, ?> map) {
        return a(this.f7789h.a(i10, c0732x, map));
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public com.huawei.hms.scankit.aiscan.common.x a(int i10, C0732x c0732x, int[] iArr, Map<EnumC0631d, ?> map) {
        return a(this.f7789h.a(i10, c0732x, iArr, map));
    }

    @Override // com.huawei.hms.scankit.p.Y, com.huawei.hms.scankit.aiscan.common.t
    public com.huawei.hms.scankit.aiscan.common.x a(C0728w c0728w, Map<EnumC0631d, ?> map) {
        return a(this.f7789h.a(c0728w, map));
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public boolean a(int i10, int i11, C0732x c0732x) {
        return c0732x.a(i11, (i11 - i10) + i11, false, false);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public boolean a(int[] iArr, int[] iArr2) {
        int i10 = iArr2[1];
        int i11 = iArr[1];
        int i12 = iArr[0];
        return Math.abs(((int) Math.round(((double) (i10 - i12)) / (((double) ((i11 - i12) + (i10 - iArr2[0]))) / 6.0d))) + (-113)) <= 5;
    }
}
