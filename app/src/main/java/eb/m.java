package eb;

import yb.y;

/* loaded from: classes.dex */
public abstract class m extends y {

    /* renamed from: c */
    public static final int[] f13528c = {1, 1, 1};

    /* renamed from: d */
    public static final int[] f13529d = {1, 1, 1, 1, 1};

    /* renamed from: e */
    public static final int[] f13530e = {1, 1, 1, 1, 1, 1};

    /* renamed from: f */
    public static final int[][] f13531f;

    /* renamed from: g */
    public static final int[][] f13532g;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f13531f = iArr;
        int[][] iArr2 = new int[20];
        f13532g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f13531f[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f13532g[i10] = iArr4;
        }
    }

    public static boolean C(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        return D(charSequence.subSequence(0, i10)) == Character.digit(charSequence.charAt(i10), 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x003a, code lost:
        r5 = za.d.f32197c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x003e, code lost:
        if (za.e.f32198a == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0048, code lost:
        throw za.d.f32197c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
        throw new za.d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int D(java.lang.CharSequence r5) {
        /*
            int r0 = r5.length()
            int r1 = r0 + (-1)
            r2 = 0
        L7:
            r3 = 9
            if (r1 < 0) goto L28
            char r4 = r5.charAt(r1)
            int r4 = r4 + (-48)
            if (r4 < 0) goto L19
            if (r4 > r3) goto L19
            int r2 = r2 + r4
            int r1 = r1 + (-2)
            goto L7
        L19:
            za.d r5 = za.d.f32197c
            boolean r5 = za.e.f32198a
            if (r5 == 0) goto L25
            za.d r5 = new za.d
            r5.<init>()
            goto L27
        L25:
            za.d r5 = za.d.f32197c
        L27:
            throw r5
        L28:
            int r2 = r2 * 3
        L2a:
            int r0 = r0 + (-2)
            if (r0 < 0) goto L49
            char r1 = r5.charAt(r0)
            int r1 = r1 + (-48)
            if (r1 < 0) goto L3a
            if (r1 > r3) goto L3a
            int r2 = r2 + r1
            goto L2a
        L3a:
            za.d r5 = za.d.f32197c
            boolean r5 = za.e.f32198a
            if (r5 == 0) goto L46
            za.d r5 = new za.d
            r5.<init>()
            goto L48
        L46:
            za.d r5 = za.d.f32197c
        L48:
            throw r5
        L49:
            int r5 = 1000 - r2
            int r5 = r5 % 10
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.m.D(java.lang.CharSequence):int");
    }
}
