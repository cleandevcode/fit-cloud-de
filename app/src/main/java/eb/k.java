package eb;

import androidx.appcompat.widget.u0;
import java.util.EnumMap;
import yb.y;

/* loaded from: classes.dex */
public final class k extends n {
    @Override // yb.y, za.f
    public final bb.b d(String str, za.a aVar, EnumMap enumMap) {
        if (aVar == za.a.EAN_8) {
            return super.d(str, aVar, enumMap);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
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
                str = u0.a(str, m.D(str));
            } catch (za.d e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        boolean[] zArr = new boolean[67];
        int h10 = y.h(zArr, 0, m.f13528c, true) + 0;
        for (int i10 = 0; i10 <= 3; i10++) {
            h10 += y.h(zArr, h10, m.f13531f[Character.digit(str.charAt(i10), 10)], false);
        }
        int h11 = y.h(zArr, h10, m.f13529d, false) + h10;
        for (int i11 = 4; i11 <= 7; i11++) {
            h11 += y.h(zArr, h11, m.f13531f[Character.digit(str.charAt(i11), 10)], true);
        }
        y.h(zArr, h11, m.f13528c, true);
        return zArr;
    }
}
