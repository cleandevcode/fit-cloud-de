package eb;

import java.util.EnumMap;
import yb.y;

/* loaded from: classes.dex */
public final class f extends y {
    public static void C(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    @Override // yb.y, za.f
    public final bb.b d(String str, za.a aVar, EnumMap enumMap) {
        if (aVar == za.a.CODE_39) {
            return super.d(str, aVar, enumMap);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
    }

    @Override // yb.y
    public final boolean[] k(String str) {
        String str2;
        int i10;
        int i11;
        int length = str.length();
        if (length <= 80) {
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                } else if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i12)) < 0) {
                    int length2 = str.length();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i13 = 0; i13 < length2; i13++) {
                        char charAt = str.charAt(i13);
                        if (charAt != 0) {
                            if (charAt != ' ') {
                                if (charAt != '@') {
                                    if (charAt != '`') {
                                        if (charAt != '-' && charAt != '.') {
                                            if (charAt <= 26) {
                                                sb2.append('$');
                                                i10 = charAt - 1;
                                            } else if (charAt < ' ') {
                                                sb2.append('%');
                                                i10 = charAt - 27;
                                            } else if (charAt > ',' && charAt != '/' && charAt != ':') {
                                                if (charAt <= '9') {
                                                    i11 = (charAt - '0') + 48;
                                                } else if (charAt <= '?') {
                                                    sb2.append('%');
                                                    i11 = (charAt - ';') + 70;
                                                } else if (charAt <= 'Z') {
                                                    i10 = charAt - 'A';
                                                } else if (charAt <= '_') {
                                                    sb2.append('%');
                                                    i11 = (charAt - '[') + 75;
                                                } else if (charAt <= 'z') {
                                                    sb2.append('+');
                                                    i10 = charAt - 'a';
                                                } else if (charAt <= 127) {
                                                    sb2.append('%');
                                                    i11 = (charAt - '{') + 80;
                                                } else {
                                                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i13) + "'");
                                                }
                                                charAt = (char) i11;
                                            } else {
                                                sb2.append('/');
                                                i10 = charAt - '!';
                                            }
                                            i11 = i10 + 65;
                                            charAt = (char) i11;
                                        }
                                    } else {
                                        str2 = "%W";
                                    }
                                } else {
                                    str2 = "%V";
                                }
                            }
                            sb2.append(charAt);
                        } else {
                            str2 = "%U";
                        }
                        sb2.append(str2);
                    }
                    str = sb2.toString();
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i12++;
                }
            }
            int[] iArr = new int[9];
            int i14 = length + 25;
            for (int i15 = 0; i15 < length; i15++) {
                C(e.f13522c["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i15))], iArr);
                for (int i16 = 0; i16 < 9; i16++) {
                    i14 += iArr[i16];
                }
            }
            boolean[] zArr = new boolean[i14];
            C(148, iArr);
            int h10 = y.h(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int h11 = y.h(zArr, h10, iArr2, false) + h10;
            for (int i17 = 0; i17 < length; i17++) {
                C(e.f13522c["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i17))], iArr);
                int h12 = y.h(zArr, h11, iArr, true) + h11;
                h11 = y.h(zArr, h12, iArr2, false) + h12;
            }
            C(148, iArr);
            y.h(zArr, h11, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
