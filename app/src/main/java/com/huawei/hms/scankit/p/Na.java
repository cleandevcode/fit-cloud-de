package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.C0632e;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.Map;

/* loaded from: classes.dex */
public final class Na {

    /* renamed from: a */
    private final com.huawei.hms.scankit.aiscan.common.u f7613a = new com.huawei.hms.scankit.aiscan.common.u(com.huawei.hms.scankit.aiscan.common.h.f7245e);

    private C0632e a(Aa aa2, Map<EnumC0631d, ?> map) {
        Ya d10 = aa2.d();
        Pa b10 = aa2.c().b();
        Ba[] a10 = Ba.a(aa2.b(), d10, b10);
        int i10 = 0;
        for (Ba ba2 : a10) {
            i10 += ba2.b();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (Ba ba3 : a10) {
            byte[] a11 = ba3.a();
            int b11 = ba3.b();
            a(a11, b11);
            int i12 = 0;
            while (i12 < b11) {
                bArr[i11] = a11[i12];
                i12++;
                i11++;
            }
        }
        return Ma.a(bArr, d10, b10, map);
    }

    private void a(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f7613a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (C0628a unused) {
            throw C0628a.a();
        }
    }

    public C0632e a(C0736y c0736y, Map<EnumC0631d, ?> map) {
        Aa aa2 = new Aa(c0736y);
        try {
            return a(aa2, map);
        } catch (C0628a e10) {
            try {
                aa2.e();
                aa2.a(true);
                aa2.d();
                aa2.c();
                aa2.a();
                C0632e a10 = a(aa2, map);
                a10.a(new Wa(true));
                return a10;
            } catch (C0628a unused) {
                throw e10;
            }
        }
    }
}
