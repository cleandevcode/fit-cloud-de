package com.huawei.hms.scankit.p;

import androidx.appcompat.widget.u0;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.p.rc */
/* loaded from: classes.dex */
public final class C0711rc extends AbstractC0727vc {
    @Override // com.huawei.hms.scankit.p.AbstractC0719tc, com.huawei.hms.scankit.p.Pb
    public C0736y a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<Jc, ?> map) {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.a(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0719tc
    public boolean[] a(String str) {
        int length = str.length();
        if (length != 7) {
            if (length == 8) {
                try {
                    if (!AbstractC0654da.a((CharSequence) str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (C0628a unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException(u0.a("Requested contents should be 8 digits long, but got ", length));
            }
        } else {
            try {
                str = u0.a(str, AbstractC0654da.b(str));
            } catch (C0628a e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        boolean[] zArr = new boolean[67];
        int a10 = AbstractC0719tc.a(zArr, 0, AbstractC0654da.f7842a, true) + 0;
        for (int i10 = 0; i10 <= 3; i10++) {
            a10 += AbstractC0719tc.a(zArr, a10, AbstractC0654da.f7845d[Character.digit(str.charAt(i10), 10)], false);
        }
        int a11 = AbstractC0719tc.a(zArr, a10, AbstractC0654da.f7843b, false) + a10;
        for (int i11 = 4; i11 <= 7; i11++) {
            a11 += AbstractC0719tc.a(zArr, a11, AbstractC0654da.f7845d[Character.digit(str.charAt(i11), 10)], true);
        }
        AbstractC0719tc.a(zArr, a11, AbstractC0654da.f7842a, true);
        return zArr;
    }
}
