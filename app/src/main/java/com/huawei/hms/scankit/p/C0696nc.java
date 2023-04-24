package com.huawei.hms.scankit.p;

import androidx.appcompat.widget.u0;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.p.nc */
/* loaded from: classes.dex */
public final class C0696nc extends AbstractC0719tc {

    /* renamed from: com.huawei.hms.scankit.p.nc$a */
    /* loaded from: classes.dex */
    public enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static int a(CharSequence charSequence, int i10, int i11) {
        a aVar;
        a a10;
        a a11;
        a a12 = a(charSequence, i10);
        a aVar2 = a.UNCODABLE;
        if (a12 != aVar2 && a12 != (aVar = a.ONE_DIGIT)) {
            if (i11 == 99) {
                return 99;
            }
            if (i11 == 100) {
                a aVar3 = a.FNC_1;
                if (a12 == aVar3 || (a10 = a(charSequence, i10 + 2)) == aVar2 || a10 == aVar) {
                    return 100;
                }
                if (a10 == aVar3) {
                    return a(charSequence, i10 + 3) == a.TWO_DIGITS ? 99 : 100;
                }
                int i12 = i10 + 4;
                while (true) {
                    a11 = a(charSequence, i12);
                    if (a11 != a.TWO_DIGITS) {
                        break;
                    }
                    i12 += 2;
                }
                return a11 == a.ONE_DIGIT ? 100 : 99;
            }
            if (a12 == a.FNC_1) {
                a12 = a(charSequence, i10 + 1);
            }
            if (a12 == a.TWO_DIGITS) {
                return 99;
            }
        }
        return 100;
    }

    private static a a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        if (i10 >= length) {
            return a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i10);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return a.UNCODABLE;
        }
        int i11 = i10 + 1;
        if (i11 >= length) {
            return a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i11);
        return (charAt2 < '0' || charAt2 > '9') ? a.ONE_DIGIT : a.TWO_DIGITS;
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0719tc, com.huawei.hms.scankit.p.Pb
    public C0736y a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<Jc, ?> map) {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.a(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0719tc
    public boolean[] a(String str) {
        int length = str.length();
        if (length >= 1 && length <= 80) {
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if (charAt < ' ' || charAt > '~') {
                    switch (charAt) {
                        case 241:
                        case 242:
                        case 243:
                        case 244:
                            break;
                        default:
                            throw new IllegalArgumentException("Bad character in input: " + charAt);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 1;
            while (i12 < length) {
                int a10 = a(str, i12, i14);
                if (a10 == i14) {
                    switch (str.charAt(i12)) {
                        case 241:
                            a10 = 102;
                            break;
                        case 242:
                            a10 = 97;
                            break;
                        case 243:
                            a10 = 96;
                            break;
                        case 244:
                            a10 = 100;
                            break;
                        default:
                            if (i14 == 100) {
                                a10 = str.charAt(i12) - ' ';
                                break;
                            } else {
                                try {
                                    a10 = Integer.parseInt(str.substring(i12, i12 + 2));
                                    i12++;
                                    break;
                                } catch (NumberFormatException unused) {
                                    throw new IllegalArgumentException("contents substring can not format integer");
                                }
                            }
                    }
                    i12++;
                } else if (i14 == 0) {
                    if (a10 == 100) {
                        i14 = a10;
                        a10 = 104;
                    } else {
                        i14 = a10;
                        a10 = 105;
                    }
                } else {
                    i14 = a10;
                }
                arrayList.add(P.f7633a[a10]);
                i13 += a10 * i15;
                if (i12 != 0) {
                    i15++;
                }
            }
            int[][] iArr = P.f7633a;
            arrayList.add(iArr[i13 % 103]);
            arrayList.add(iArr[106]);
            Iterator it = arrayList.iterator();
            int i16 = 0;
            while (it.hasNext()) {
                for (int i17 : (int[]) it.next()) {
                    i16 += i17;
                }
            }
            boolean[] zArr = new boolean[i16];
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                i10 += AbstractC0719tc.a(zArr, i10, (int[]) it2.next(), true);
            }
            return zArr;
        }
        throw new IllegalArgumentException(u0.a("Contents length should be between 1 and 80 characters, but got ", length));
    }
}
