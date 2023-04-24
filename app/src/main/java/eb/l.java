package eb;

import java.util.EnumMap;
import yb.y;

/* loaded from: classes.dex */
public final class l extends y {

    /* renamed from: c */
    public static final int[] f13525c = {1, 1, 1, 1};

    /* renamed from: d */
    public static final int[] f13526d = {3, 1, 1};

    /* renamed from: e */
    public static final int[][] f13527e = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // yb.y, za.f
    public final bb.b d(String str, za.a aVar, EnumMap enumMap) {
        if (aVar == za.a.ITF) {
            return super.d(str, aVar, enumMap);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(aVar)));
    }

    @Override // yb.y
    public final boolean[] k(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            if (length <= 80) {
                boolean[] zArr = new boolean[(length * 9) + 9];
                int h10 = y.h(zArr, 0, f13525c, true);
                for (int i10 = 0; i10 < length; i10 += 2) {
                    int digit = Character.digit(str.charAt(i10), 10);
                    int digit2 = Character.digit(str.charAt(i10 + 1), 10);
                    int[] iArr = new int[10];
                    for (int i11 = 0; i11 < 5; i11++) {
                        int i12 = i11 * 2;
                        int[][] iArr2 = f13527e;
                        iArr[i12] = iArr2[digit][i11];
                        iArr[i12 + 1] = iArr2[digit2][i11];
                    }
                    h10 += y.h(zArr, h10, iArr, true);
                }
                y.h(zArr, h10, f13526d, true);
                return zArr;
            }
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        throw new IllegalArgumentException("The length of the input should be even");
    }
}
