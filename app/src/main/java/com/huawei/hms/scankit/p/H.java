package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.C0632e;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.Map;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: b */
    private K f7529b = null;

    /* renamed from: a */
    private final com.huawei.hms.scankit.aiscan.common.u f7528a = new com.huawei.hms.scankit.aiscan.common.u(com.huawei.hms.scankit.aiscan.common.h.f7246f);

    private void a(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f7528a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (C0628a unused) {
            throw C0628a.a();
        }
    }

    public C0632e a(C0736y c0736y, Map<EnumC0631d, ?> map) {
        C c10 = new C(c0736y);
        K a10 = c10.a();
        this.f7529b = a10;
        D[] a11 = D.a(c10.b(), a10);
        int i10 = 0;
        for (D d10 : a11) {
            i10 += d10.b();
        }
        byte[] bArr = new byte[i10];
        int length = a11.length;
        for (int i11 = 0; i11 < length; i11++) {
            D d11 = a11[i11];
            byte[] a12 = d11.a();
            int b10 = d11.b();
            a(a12, b10);
            for (int i12 = 0; i12 < b10; i12++) {
                bArr[(i12 * length) + i11] = a12[i12];
            }
        }
        return G.a(bArr, map);
    }

    public K a() {
        return this.f7529b;
    }
}
