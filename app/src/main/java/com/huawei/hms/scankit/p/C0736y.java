package com.huawei.hms.scankit.p;

import java.util.Arrays;

/* renamed from: com.huawei.hms.scankit.p.y */
/* loaded from: classes.dex */
public final class C0736y implements Cloneable {

    /* renamed from: a */
    private final int f8111a;

    /* renamed from: b */
    private final int f8112b;

    /* renamed from: c */
    private final int f8113c;

    /* renamed from: d */
    private final int[] f8114d;

    public C0736y(int i10) {
        this(i10, i10);
    }

    public C0736y(int i10, int i11) {
        if (i10 < 1 || i11 < 1) {
            try {
                throw new IllegalArgumentException("Both dimensions must be greater than 0");
            } catch (Exception e10) {
                throw e10;
            }
        }
        this.f8111a = i10;
        this.f8112b = i11;
        int i12 = (i10 + 31) / 32;
        this.f8113c = i12;
        this.f8114d = new int[i12 * i11];
    }

    public C0736y(int i10, int i11, int i12, int[] iArr) {
        this.f8111a = i10;
        this.f8112b = i11;
        this.f8113c = i12;
        this.f8114d = iArr;
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder((this.f8111a + 1) * this.f8112b);
        for (int i10 = 0; i10 < this.f8112b; i10++) {
            for (int i11 = 0; i11 < this.f8111a; i11++) {
                sb2.append(b(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public C0732x a(int i10, C0732x c0732x) {
        if (c0732x == null || c0732x.d() < this.f8111a) {
            c0732x = new C0732x(this.f8111a);
        } else {
            c0732x.a();
        }
        int i11 = i10 * this.f8113c;
        for (int i12 = 0; i12 < this.f8113c; i12++) {
            c0732x.b(i12 * 32, this.f8114d[i11 + i12]);
        }
        return c0732x;
    }

    public String a(String str, String str2) {
        return a(str, str2, "\n");
    }

    public void a() {
        int length = this.f8114d.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f8114d[i10] = 0;
        }
    }

    public void a(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.f8113c);
        if (com.huawei.hms.scankit.util.b.a(this.f8114d, i12)) {
            int[] iArr = this.f8114d;
            iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
        }
    }

    public void a(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            try {
                throw new IllegalArgumentException("Left and top must be nonnegative");
            } catch (Exception e10) {
                throw e10;
            }
        } else if (i13 < 1 || i12 < 1) {
            try {
                throw new IllegalArgumentException("Height and width must be at least 1");
            } catch (Exception e11) {
                throw e11;
            }
        } else {
            int i14 = i12 + i10;
            int i15 = i13 + i11;
            if (i15 > this.f8112b || i14 > this.f8111a) {
                try {
                    throw new IllegalArgumentException("The region must fit inside the matrix");
                } catch (Exception e12) {
                    throw e12;
                }
            }
            while (i11 < i15) {
                int i16 = this.f8113c * i11;
                for (int i17 = i10; i17 < i14; i17++) {
                    int[] iArr = this.f8114d;
                    int i18 = (i17 / 32) + i16;
                    iArr[i18] = iArr[i18] | (1 << (i17 & 31));
                }
                i11++;
            }
        }
    }

    public int b() {
        return this.f8112b;
    }

    public void b(int i10, C0732x c0732x) {
        int[] c10 = c0732x.c();
        int[] iArr = this.f8114d;
        int i11 = this.f8113c;
        System.arraycopy(c10, 0, iArr, i10 * i11, i11);
    }

    public boolean b(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.f8113c);
        return com.huawei.hms.scankit.util.b.a(this.f8114d, i12) && ((this.f8114d[i12] >>> (i10 & 31)) & 1) != 0;
    }

    public C0736y c() {
        int[] iArr = new int[this.f8114d.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f8114d;
            if (i10 >= iArr2.length) {
                return new C0736y(this.f8111a, this.f8112b, this.f8113c, iArr);
            }
            iArr[i10] = ~iArr2[i10];
            i10++;
        }
    }

    public void c(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.f8113c);
        if (com.huawei.hms.scankit.util.b.a(this.f8114d, i12)) {
            int[] iArr = this.f8114d;
            iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
        }
    }

    /* renamed from: clone */
    public C0736y m4clone() {
        return new C0736y(this.f8111a, this.f8112b, this.f8113c, (int[]) this.f8114d.clone());
    }

    public int d() {
        return this.f8111a;
    }

    public void e() {
        int d10 = d();
        int b10 = b();
        C0732x c0732x = new C0732x(d10);
        C0732x c0732x2 = new C0732x(d10);
        for (int i10 = 0; i10 < (b10 + 1) / 2; i10++) {
            c0732x = a(i10, c0732x);
            int i11 = (b10 - 1) - i10;
            c0732x2 = a(i11, c0732x2);
            c0732x.g();
            c0732x2.g();
            b(i10, c0732x2);
            b(i11, c0732x);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0736y) {
            C0736y c0736y = (C0736y) obj;
            return this.f8111a == c0736y.f8111a && this.f8112b == c0736y.f8112b && this.f8113c == c0736y.f8113c && Arrays.equals(this.f8114d, c0736y.f8114d);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f8111a;
        return Arrays.hashCode(this.f8114d) + (((((((i10 * 31) + i10) * 31) + this.f8112b) * 31) + this.f8113c) * 31);
    }

    public String toString() {
        return a("X ", "  ");
    }
}
