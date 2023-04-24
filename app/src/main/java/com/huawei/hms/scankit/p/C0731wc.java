package com.huawei.hms.scankit.p;

import androidx.appcompat.widget.u0;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.p.wc */
/* loaded from: classes.dex */
public final class C0731wc extends AbstractC0727vc {
    @Override // com.huawei.hms.scankit.p.AbstractC0719tc, com.huawei.hms.scankit.p.Pb
    public C0736y a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<Jc, ?> map) {
        if (barcodeFormat == BarcodeFormat.UPC_E) {
            return super.a(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got " + barcodeFormat);
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
                str = u0.a(str, AbstractC0654da.b(C0658ea.b(str)));
            } catch (C0628a e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        int digit = Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i10 = C0658ea.f7875i[digit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int a10 = AbstractC0719tc.a(zArr, 0, AbstractC0654da.f7842a, true) + 0;
        for (int i11 = 1; i11 <= 6; i11++) {
            int digit2 = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                digit2 += 10;
            }
            a10 += AbstractC0719tc.a(zArr, a10, AbstractC0654da.f7846e[digit2], false);
        }
        AbstractC0719tc.a(zArr, a10, AbstractC0654da.f7844c, false);
        return zArr;
    }
}
