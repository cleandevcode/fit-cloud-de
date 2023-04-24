package eb;

import java.util.EnumMap;
import yb.y;

/* loaded from: classes.dex */
public final class d extends y {
    public static int C(int i10, CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 1;
        if (i10 >= length) {
            return 1;
        }
        char charAt = charSequence.charAt(i10);
        if (charAt == 241) {
            return 4;
        }
        if (charAt >= '0' && charAt <= '9') {
            int i12 = i10 + 1;
            i11 = 2;
            if (i12 >= length) {
                return 2;
            }
            char charAt2 = charSequence.charAt(i12);
            if (charAt2 >= '0' && charAt2 <= '9') {
                return 3;
            }
        }
        return i11;
    }

    @Override // yb.y, za.f
    public final bb.b d(String str, za.a aVar, EnumMap enumMap) {
        if (aVar == za.a.CODE_128) {
            return super.d(str, aVar, enumMap);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x007f, code lost:
        if (C(r5 + 3, r17) == 3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x008d, code lost:
        if (r11 == 2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0098, code lost:
        if (r10 == 3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0037 A[SYNTHETIC] */
    @Override // yb.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean[] k(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.d.k(java.lang.String):boolean[]");
    }
}
