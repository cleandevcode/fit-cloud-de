package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class O extends Y {

    /* renamed from: a */
    public static final char[] f7619a = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: b */
    public static final int[] f7620b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: c */
    private static final char[] f7621c = {'A', 'B', 'C', 'D'};

    /* renamed from: d */
    private final StringBuilder f7622d = new StringBuilder(20);

    /* renamed from: e */
    private int[] f7623e = new int[80];

    /* renamed from: f */
    private int f7624f = 0;

    /* renamed from: g */
    private int f7625g;

    private void a(int i10) {
        try {
            int[] iArr = this.f7623e;
            int i11 = this.f7624f;
            iArr[i11] = i10;
            int i12 = i11 + 1;
            this.f7624f = i12;
            if (i12 >= iArr.length) {
                int[] iArr2 = new int[i12 * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i12);
                this.f7623e = iArr2;
            }
        } catch (NumberFormatException unused) {
            throw C0628a.a();
        }
    }

    private void a(C0732x c0732x) {
        int i10 = 0;
        this.f7624f = 0;
        int c10 = c0732x.c(0);
        this.f7625g = c10;
        int d10 = c0732x.d();
        if (c10 >= d10) {
            throw C0628a.a();
        }
        boolean z10 = true;
        while (c10 < d10) {
            if (c0732x.a(c10) != z10) {
                i10++;
            } else {
                a(i10);
                z10 = !z10;
                i10 = 1;
            }
            c10++;
        }
        a(i10);
    }

    public static boolean a(char[] cArr, char c10) {
        if (cArr != null) {
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    private int[] a() {
        int b10 = b();
        this.f7622d.setLength(0);
        int i10 = b10;
        do {
            int b11 = b(i10);
            if (b11 == -1) {
                throw C0628a.a();
            }
            this.f7622d.append((char) b11);
            i10 += 8;
            if (this.f7622d.length() > 1 && a(f7621c, f7619a[b11])) {
                break;
            }
        } while (i10 < this.f7624f);
        int i11 = this.f7623e[i10 - 1];
        int i12 = 0;
        for (int i13 = -8; i13 < -1; i13++) {
            i12 += this.f7623e[i10 + i13];
        }
        if (i10 >= this.f7624f || i11 >= i12 / 2) {
            c(b10);
            return new int[]{b10, i10};
        }
        throw C0628a.a();
    }

    private int b() {
        for (int i10 = 1; i10 < this.f7624f; i10 += 2) {
            int b10 = b(i10);
            if (b10 != -1 && a(f7621c, f7619a[b10])) {
                int i11 = 0;
                for (int i12 = i10; i12 < i10 + 7; i12++) {
                    i11 += this.f7623e[i12];
                }
                if (i10 == 1 || this.f7623e[i10 - 1] >= i11 / 2) {
                    return i10;
                }
            }
        }
        throw C0628a.a();
    }

    private int b(int i10) {
        int i11 = i10 + 7;
        if (i11 >= this.f7624f) {
            return -1;
        }
        int[] iArr = this.f7623e;
        HashSet hashSet = new HashSet();
        for (int i12 = i10; i12 < i11; i12++) {
            hashSet.add(Integer.valueOf(iArr[i12]));
        }
        Iterator it = hashSet.iterator();
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            i14 += ((Integer) it.next()).intValue();
        }
        if (hashSet.size() > 0) {
            int size = i14 / hashSet.size();
            int i15 = 128;
            int i16 = 0;
            for (int i17 = 0; i17 < 7; i17++) {
                i15 >>= 1;
                if (iArr[i10 + i17] > size) {
                    i16 |= i15;
                }
            }
            while (true) {
                int[] iArr2 = f7620b;
                if (i13 >= iArr2.length) {
                    break;
                } else if (iArr2[i13] == i16) {
                    return i13;
                } else {
                    i13++;
                }
            }
        }
        return -1;
    }

    private void c(int i10) {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f7622d.length() - 1;
        int i11 = 0;
        int i12 = i10;
        int i13 = 0;
        while (true) {
            int i14 = f7620b[this.f7622d.charAt(i13)];
            for (int i15 = 6; i15 >= 0; i15--) {
                int i16 = ((i14 & 1) * 2) + (i15 & 1);
                iArr[i16] = iArr[i16] + this.f7623e[i12 + i15];
                iArr2[i16] = iArr2[i16] + 1;
                i14 >>= 1;
            }
            if (i13 >= length) {
                break;
            }
            i12 += 8;
            i13++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i17 = 0; i17 < 2; i17++) {
            fArr2[i17] = 0.0f;
            int i18 = i17 + 2;
            int i19 = iArr[i18];
            int i20 = iArr2[i18];
            float f10 = ((i19 / i20) + (iArr[i17] / iArr2[i17])) / 2.0f;
            fArr2[i18] = f10;
            fArr[i17] = f10;
            fArr[i18] = ((i19 * 2.0f) + 1.5f) / i20;
        }
        int i21 = i10;
        loop3: while (true) {
            int i22 = f7620b[this.f7622d.charAt(i11)];
            for (int i23 = 6; i23 >= 0; i23--) {
                int i24 = ((i22 & 1) * 2) + (i23 & 1);
                float f11 = this.f7623e[i21 + i23];
                if (f11 < fArr2[i24] || f11 > fArr[i24]) {
                    break loop3;
                }
                i22 >>= 1;
            }
            if (i11 >= length) {
                return;
            }
            i21 += 8;
            i11++;
        }
        throw C0628a.a();
    }

    @Override // com.huawei.hms.scankit.p.Y
    public com.huawei.hms.scankit.aiscan.common.x a(int i10, C0732x c0732x, Map<EnumC0631d, ?> map) {
        Arrays.fill(this.f7623e, 0);
        a(c0732x);
        int[] a10 = a();
        int i11 = a10[0];
        int i12 = a10[1];
        for (int i13 = 0; i13 < this.f7622d.length(); i13++) {
            StringBuilder sb2 = this.f7622d;
            sb2.setCharAt(i13, f7619a[sb2.charAt(i13)]);
        }
        char charAt = this.f7622d.charAt(0);
        char[] cArr = f7621c;
        if (a(cArr, charAt)) {
            StringBuilder sb3 = this.f7622d;
            if (a(cArr, sb3.charAt(sb3.length() - 1))) {
                if (this.f7622d.length() > 3) {
                    int i14 = this.f7625g;
                    for (int i15 = 0; i15 < i11; i15++) {
                        i14 += this.f7623e[i15];
                    }
                    float f10 = i14;
                    while (i11 < i12 - 1) {
                        i14 += this.f7623e[i11];
                        i11++;
                    }
                    float f11 = i10;
                    return new com.huawei.hms.scankit.aiscan.common.x(this.f7622d.toString(), null, new com.huawei.hms.scankit.aiscan.common.z[]{new com.huawei.hms.scankit.aiscan.common.z(f10, f11), new com.huawei.hms.scankit.aiscan.common.z(i14, f11)}, BarcodeFormat.CODABAR);
                }
                throw C0628a.a();
            }
            throw C0628a.a();
        }
        throw C0628a.a();
    }
}
