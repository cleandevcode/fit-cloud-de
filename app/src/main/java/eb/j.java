package eb;

import androidx.appcompat.widget.u0;
import java.util.EnumMap;
import yb.y;

/* loaded from: classes.dex */
public final class j extends n {
    @Override // yb.y, za.f
    public final bb.b d(String str, za.a aVar, EnumMap enumMap) {
        if (aVar == za.a.EAN_13) {
            return super.d(str, aVar, enumMap);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
    }

    @Override // yb.y
    public final boolean[] k(String str) {
        int length = str.length();
        if (length != 12) {
            if (length == 13) {
                try {
                    if (!m.C(str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (za.d unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
        } else {
            try {
                str = u0.a(str, m.D(str));
            } catch (za.d e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        int i10 = i.f13524h[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int h10 = y.h(zArr, 0, m.f13528c, true) + 0;
        for (int i11 = 1; i11 <= 6; i11++) {
            int digit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                digit += 10;
            }
            h10 += y.h(zArr, h10, m.f13532g[digit], false);
        }
        int h11 = y.h(zArr, h10, m.f13529d, false) + h10;
        for (int i12 = 7; i12 <= 12; i12++) {
            h11 += y.h(zArr, h11, m.f13531f[Character.digit(str.charAt(i12), 10)], true);
        }
        y.h(zArr, h11, m.f13528c, true);
        return zArr;
    }
}
