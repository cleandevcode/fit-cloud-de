package eb;

import java.util.EnumMap;
import yb.y;

/* loaded from: classes.dex */
public final class h extends y {
    public static void C(boolean[] zArr, int i10, int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            zArr[i10] = iArr[i11] != 0;
            i11++;
            i10 = i12;
        }
    }

    public static int D(int i10, String str) {
        int i11 = 0;
        int i12 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i11 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i12;
            i12++;
            if (i12 > i10) {
                i12 = 1;
            }
        }
        return i11 % 47;
    }

    public static void E(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) == 0) {
                i12 = 0;
            }
            iArr[i11] = i12;
        }
    }

    @Override // yb.y, za.f
    public final bb.b d(String str, za.a aVar, EnumMap enumMap) {
        if (aVar == za.a.CODE_93) {
            return super.d(str, aVar, enumMap);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(aVar)));
    }

    @Override // yb.y
    public final boolean[] k(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            E(g.f13523c[47], iArr);
            boolean[] zArr = new boolean[((str.length() + 2 + 2) * 9) + 1];
            C(zArr, 0, iArr);
            int i10 = 9;
            for (int i11 = 0; i11 < length; i11++) {
                E(g.f13523c["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i11))], iArr);
                C(zArr, i10, iArr);
                i10 += 9;
            }
            int D = D(20, str);
            int[] iArr2 = g.f13523c;
            E(iArr2[D], iArr);
            C(zArr, i10, iArr);
            int i12 = i10 + 9;
            StringBuilder a10 = android.support.v4.media.d.a(str);
            a10.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(D));
            E(iArr2[D(15, a10.toString())], iArr);
            C(zArr, i12, iArr);
            int i13 = i12 + 9;
            E(iArr2[47], iArr);
            C(zArr, i13, iArr);
            zArr[i13 + 9] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
