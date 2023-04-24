package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.p.da */
/* loaded from: classes.dex */
public abstract class AbstractC0654da extends Y {

    /* renamed from: a */
    public static final int[] f7842a = {1, 1, 1};

    /* renamed from: b */
    public static final int[] f7843b = {1, 1, 1, 1, 1};

    /* renamed from: c */
    public static final int[] f7844c = {1, 1, 1, 1, 1, 1};

    /* renamed from: d */
    public static final int[][] f7845d;

    /* renamed from: e */
    public static final int[][] f7846e;

    /* renamed from: f */
    private final StringBuilder f7847f = new StringBuilder(20);

    /* renamed from: g */
    private final C0650ca f7848g = new C0650ca();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f7845d = iArr;
        int[][] iArr2 = new int[20];
        f7846e = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f7845d[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f7846e[i10] = iArr4;
        }
    }

    public static int a(C0732x c0732x, int[] iArr, int i10, int[][] iArr2) {
        Y.a(c0732x, i10, iArr);
        int length = iArr2.length;
        float f10 = 0.46f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float a10 = Y.a(iArr, iArr2[i12], 0.8f);
            if (a10 < f10) {
                i11 = i12;
                f10 = a10;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw C0628a.a();
    }

    private void a(com.huawei.hms.scankit.aiscan.common.x xVar, int[] iArr, int i10, C0732x c0732x, Map<EnumC0631d, ?> map) {
        int i11;
        boolean z10 = true;
        try {
            com.huawei.hms.scankit.aiscan.common.x a10 = this.f7848g.a(i10, c0732x, iArr[1]);
            xVar.a(a10.h());
            i11 = a10.i().length();
        } catch (C0628a unused) {
            i11 = 0;
        }
        int[] iArr2 = map == null ? null : (int[]) map.get(EnumC0631d.ALLOWED_EAN_EXTENSIONS);
        if (iArr2 != null) {
            int length = iArr2.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    z10 = false;
                    break;
                } else if (i11 == iArr2[i12]) {
                    break;
                } else {
                    i12++;
                }
            }
            if (!z10) {
                throw C0628a.a();
            }
        }
    }

    public static boolean a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        return b(charSequence.subSequence(0, i10)) == Character.digit(charSequence.charAt(i10), 10);
    }

    public static int[] a(C0732x c0732x) {
        return b(c0732x, 0);
    }

    public static int[] a(C0732x c0732x, int i10, boolean z10, int[] iArr) {
        return a(c0732x, i10, z10, iArr, new int[iArr.length]);
    }

    private static int[] a(C0732x c0732x, int i10, boolean z10, int[] iArr, int[] iArr2) {
        int d10 = c0732x.d();
        int c10 = z10 ? c0732x.c(i10) : c0732x.b(i10);
        int length = iArr.length;
        boolean z11 = z10;
        int i11 = 0;
        int i12 = c10;
        while (c10 < d10) {
            if (c0732x.a(c10) == z11) {
                if (i11 != length - 1) {
                    i11++;
                } else if (Y.a(iArr2, iArr, 0.8f) < 0.46f) {
                    return new int[]{i12, c10};
                } else {
                    i12 += iArr2[0] + iArr2[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i11] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z11 = !z11;
            } else if (i11 < 0 || i11 >= iArr2.length) {
                throw C0628a.a();
            } else {
                iArr2[i11] = iArr2[i11] + 1;
            }
            c10++;
        }
        throw C0628a.a();
    }

    public static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int charAt = charSequence.charAt(i11) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C0628a.a();
            }
            i10 += charAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int charAt2 = charSequence.charAt(i13) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C0628a.a();
            }
            i12 += charAt2;
        }
        return (1000 - i12) % 10;
    }

    public static ArrayList<int[]> b(C0732x c0732x) {
        int d10 = c0732x.d() / 2;
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i10 = 0;
        while (i10 < d10) {
            try {
                int[] b10 = b(c0732x, i10);
                arrayList.add(b10);
                i10 = b10[0] + 1;
            } catch (C0628a unused) {
            }
        }
        if (arrayList.size() != 0) {
            return arrayList;
        }
        throw C0628a.a();
    }

    public static int[] b(C0732x c0732x, int i10) {
        int[] iArr = new int[f7842a.length];
        int[] iArr2 = null;
        boolean z10 = false;
        while (!z10) {
            int[] iArr3 = f7842a;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = a(c0732x, i10, false, iArr3, iArr);
            int i11 = iArr2[0];
            int i12 = iArr2[1];
            int i13 = i11 - (i12 - i11);
            int i14 = i13 + 3;
            while (i13 <= i14 && (i13 < 0 || !(z10 = c0732x.a(i13, i11, false, true)))) {
                i13++;
            }
            i10 = i12;
        }
        return iArr2;
    }

    public abstract int a(C0732x c0732x, int[] iArr, StringBuilder sb2);

    public abstract BarcodeFormat a();

    @Override // com.huawei.hms.scankit.p.Y
    public com.huawei.hms.scankit.aiscan.common.x a(int i10, C0732x c0732x, Map<EnumC0631d, ?> map) {
        return a(i10, c0732x, a(c0732x), map);
    }

    public com.huawei.hms.scankit.aiscan.common.x a(int i10, C0732x c0732x, int[] iArr, Map<EnumC0631d, ?> map) {
        com.huawei.hms.scankit.aiscan.common.A a10 = map == null ? null : (com.huawei.hms.scankit.aiscan.common.A) map.get(EnumC0631d.NEED_RESULT_POINT_CALLBACK);
        if (a10 != null) {
            a10.a(new com.huawei.hms.scankit.aiscan.common.z((iArr[0] + iArr[1]) / 2.0f, i10));
        }
        StringBuilder sb2 = this.f7847f;
        sb2.setLength(0);
        int a11 = a(c0732x, iArr, sb2);
        if (a10 != null) {
            a10.a(new com.huawei.hms.scankit.aiscan.common.z(a11, i10));
        }
        int[] a12 = a(c0732x, a11);
        if (a12[0] - a11 <= 1) {
            if (a10 != null) {
                a10.a(new com.huawei.hms.scankit.aiscan.common.z((a12[0] + a12[1]) / 2.0f, i10));
            }
            if (a(iArr, a12)) {
                int i11 = a12[1];
                if ((i11 - a12[0]) + i11 >= c0732x.d() || !a(a12[0], i11, c0732x)) {
                    throw C0628a.a();
                }
                String sb3 = sb2.toString();
                if (sb3.length() >= 8) {
                    if (a(sb3)) {
                        float f10 = i10;
                        com.huawei.hms.scankit.aiscan.common.x xVar = new com.huawei.hms.scankit.aiscan.common.x(sb3, null, new com.huawei.hms.scankit.aiscan.common.z[]{new com.huawei.hms.scankit.aiscan.common.z(iArr[0], f10), new com.huawei.hms.scankit.aiscan.common.z(a12[1], f10)}, a());
                        a(xVar, a12, i10, c0732x, map);
                        return xVar;
                    }
                    throw C0628a.a();
                }
                throw C0628a.a();
            }
            throw C0628a.a();
        }
        throw C0628a.a();
    }

    public abstract boolean a(int i10, int i11, C0732x c0732x);

    public boolean a(String str) {
        return a((CharSequence) str);
    }

    public abstract boolean a(int[] iArr, int[] iArr2);

    public int[] a(C0732x c0732x, int i10) {
        return a(c0732x, i10, false, f7842a);
    }
}
