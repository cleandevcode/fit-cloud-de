package eb;

import yb.y;

/* loaded from: classes.dex */
public final class a extends y {

    /* renamed from: c */
    public static final char[] f13515c = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: d */
    public static final int[] f13516d = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    public static boolean C(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }
}
