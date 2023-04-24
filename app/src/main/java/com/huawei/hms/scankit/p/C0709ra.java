package com.huawei.hms.scankit.p;

/* renamed from: com.huawei.hms.scankit.p.ra */
/* loaded from: classes.dex */
public final class C0709ra {

    /* renamed from: a */
    private final C0706qa f8041a;

    /* renamed from: b */
    private final int[] f8042b;

    public C0709ra(C0706qa c0706qa, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f8041a = c0706qa;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f8042b = iArr;
            return;
        }
        int i10 = 1;
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f8042b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i10];
        this.f8042b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
    }

    public int a() {
        return this.f8042b.length - 1;
    }

    public int a(int i10) {
        if (i10 == 0) {
            return b(0);
        }
        if (i10 == 1) {
            int i11 = 0;
            for (int i12 : this.f8042b) {
                i11 = this.f8041a.a(i11, i12);
            }
            return i11;
        }
        int[] iArr = this.f8042b;
        int i13 = iArr[0];
        int length = iArr.length;
        for (int i14 = 1; i14 < length; i14++) {
            C0706qa c0706qa = this.f8041a;
            i13 = c0706qa.a(c0706qa.c(i10, i13), this.f8042b[i14]);
        }
        return i13;
    }

    public C0709ra a(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 == 0) {
                return this.f8041a.c();
            }
            int length = this.f8042b.length;
            int[] iArr = new int[i10 + length];
            for (int i12 = 0; i12 < length; i12++) {
                iArr[i12] = this.f8041a.c(this.f8042b[i12], i11);
            }
            return new C0709ra(this.f8041a, iArr);
        }
        throw new IllegalArgumentException();
    }

    public C0709ra a(C0709ra c0709ra) {
        if (this.f8041a.equals(c0709ra.f8041a)) {
            if (b()) {
                return c0709ra;
            }
            if (c0709ra.b()) {
                return this;
            }
            int[] iArr = this.f8042b;
            int[] iArr2 = c0709ra.f8042b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                iArr3[i10] = this.f8041a.a(iArr2[i10 - length], iArr[i10]);
            }
            return new C0709ra(this.f8041a, iArr3);
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public int b(int i10) {
        int[] iArr = this.f8042b;
        return iArr[(iArr.length - 1) - i10];
    }

    public C0709ra b(C0709ra c0709ra) {
        if (this.f8041a.equals(c0709ra.f8041a)) {
            if (b() || c0709ra.b()) {
                return this.f8041a.c();
            }
            int[] iArr = this.f8042b;
            int length = iArr.length;
            int[] iArr2 = c0709ra.f8042b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[(length + length2) - 1];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArr[i10];
                for (int i12 = 0; i12 < length2; i12++) {
                    int i13 = i10 + i12;
                    C0706qa c0706qa = this.f8041a;
                    iArr3[i13] = c0706qa.a(iArr3[i13], c0706qa.c(i11, iArr2[i12]));
                }
            }
            return new C0709ra(this.f8041a, iArr3);
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public boolean b() {
        return this.f8042b[0] == 0;
    }

    public C0709ra c() {
        int length = this.f8042b.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = this.f8041a.d(0, this.f8042b[i10]);
        }
        return new C0709ra(this.f8041a, iArr);
    }

    public C0709ra c(int i10) {
        if (i10 == 0) {
            return this.f8041a.c();
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f8042b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f8041a.c(this.f8042b[i11], i10);
        }
        return new C0709ra(this.f8041a, iArr);
    }

    public C0709ra c(C0709ra c0709ra) {
        if (this.f8041a.equals(c0709ra.f8041a)) {
            return c0709ra.b() ? this : a(c0709ra.c());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(a() * 8);
        for (int a10 = a(); a10 >= 0; a10--) {
            int b10 = b(a10);
            if (b10 != 0) {
                if (b10 < 0) {
                    sb2.append(" - ");
                    b10 = -b10;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (a10 == 0 || b10 != 1) {
                    sb2.append(b10);
                }
                if (a10 != 0) {
                    if (a10 == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(a10);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
