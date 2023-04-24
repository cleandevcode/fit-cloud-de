package eb;

import androidx.appcompat.widget.u0;
import java.util.EnumMap;
import yb.y;

/* loaded from: classes.dex */
public final class p extends n {
    @Override // yb.y, za.f
    public final bb.b d(String str, za.a aVar, EnumMap enumMap) {
        if (aVar == za.a.UPC_E) {
            return super.d(str, aVar, enumMap);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(aVar)));
    }

    @Override // yb.y
    public final boolean[] k(String str) {
        int length = str.length();
        if (length != 7) {
            if (length == 8) {
                try {
                    if (!m.C(str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (za.d unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
        } else {
            try {
                str = u0.a(str, m.D(o.E(str)));
            } catch (za.d e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        int digit = Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i10 = o.f13533h[digit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int h10 = y.h(zArr, 0, m.f13528c, true) + 0;
        for (int i11 = 1; i11 <= 6; i11++) {
            int digit2 = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                digit2 += 10;
            }
            h10 += y.h(zArr, h10, m.f13532g[digit2], false);
        }
        y.h(zArr, h10, m.f13530e, false);
        return zArr;
    }
}
