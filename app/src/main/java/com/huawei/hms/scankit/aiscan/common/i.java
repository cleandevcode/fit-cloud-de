package com.huawei.hms.scankit.aiscan.common;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private final h f7256a;

    /* renamed from: b */
    private final int[] f7257b;

    public i(h hVar, int[] iArr) {
        if (iArr.length == 0) {
            try {
                throw new IllegalArgumentException();
            } catch (Exception e10) {
                throw e10;
            }
        }
        this.f7256a = hVar;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f7257b = iArr;
            return;
        }
        int i10 = 1;
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f7257b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i10];
        this.f7257b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
    }

    public int a(int i10) {
        if (i10 == 0) {
            return b(0);
        }
        if (i10 == 1) {
            int i11 = 0;
            for (int i12 : this.f7257b) {
                i11 = h.a(i11, i12);
            }
            return i11;
        }
        int[] iArr = this.f7257b;
        int i13 = iArr[0];
        int length = iArr.length;
        for (int i14 = 1; i14 < length; i14++) {
            i13 = h.a(this.f7256a.c(i10, i13), this.f7257b[i14]);
        }
        return i13;
    }

    public i a(int i10, int i11) {
        if (i10 < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (Exception e10) {
                throw e10;
            }
        } else if (i11 == 0) {
            return this.f7256a.d();
        } else {
            int length = this.f7257b.length;
            int[] iArr = new int[i10 + length];
            for (int i12 = 0; i12 < length; i12++) {
                iArr[i12] = this.f7256a.c(this.f7257b[i12], i11);
            }
            return new i(this.f7256a, iArr);
        }
    }

    public i a(i iVar) {
        if (!this.f7256a.equals(iVar.f7256a)) {
            try {
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            } catch (Exception e10) {
                throw e10;
            }
        } else if (c()) {
            return iVar;
        } else {
            if (iVar.c()) {
                return this;
            }
            int[] iArr = this.f7257b;
            int[] iArr2 = iVar.f7257b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                iArr3[i10] = h.a(iArr2[i10 - length], iArr[i10]);
            }
            return new i(this.f7256a, iArr3);
        }
    }

    public int[] a() {
        return this.f7257b;
    }

    public int b() {
        return this.f7257b.length - 1;
    }

    public int b(int i10) {
        int[] iArr = this.f7257b;
        return iArr[(iArr.length - 1) - i10];
    }

    public i[] b(i iVar) {
        if (!this.f7256a.equals(iVar.f7256a)) {
            try {
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            } catch (Exception e10) {
                throw e10;
            }
        } else if (iVar.c()) {
            try {
                throw new IllegalArgumentException("Divide by 0");
            } catch (Exception e11) {
                throw e11;
            }
        } else {
            i d10 = this.f7256a.d();
            int b10 = this.f7256a.b(iVar.b(iVar.b()));
            i iVar2 = this;
            while (iVar2.b() >= iVar.b() && !iVar2.c()) {
                int b11 = iVar2.b() - iVar.b();
                int c10 = this.f7256a.c(iVar2.b(iVar2.b()), b10);
                i a10 = iVar.a(b11, c10);
                d10 = d10.a(this.f7256a.b(b11, c10));
                iVar2 = iVar2.a(a10);
            }
            return new i[]{d10, iVar2};
        }
    }

    public i c(int i10) {
        if (i10 == 0) {
            return this.f7256a.d();
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f7257b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f7256a.c(this.f7257b[i11], i10);
        }
        return new i(this.f7256a, iArr);
    }

    public i c(i iVar) {
        if (!this.f7256a.equals(iVar.f7256a)) {
            try {
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            } catch (Exception e10) {
                throw e10;
            }
        } else if (c() || iVar.c()) {
            return this.f7256a.d();
        } else {
            int[] iArr = this.f7257b;
            int length = iArr.length;
            int[] iArr2 = iVar.f7257b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[(length + length2) - 1];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArr[i10];
                for (int i12 = 0; i12 < length2; i12++) {
                    int i13 = i10 + i12;
                    iArr3[i13] = h.a(iArr3[i13], this.f7256a.c(i11, iArr2[i12]));
                }
            }
            return new i(this.f7256a, iArr3);
        }
    }

    public boolean c() {
        return this.f7257b[0] == 0;
    }

    public String toString() {
        char c10;
        StringBuilder sb2 = new StringBuilder(b() * 8);
        for (int b10 = b(); b10 >= 0; b10--) {
            int b11 = b(b10);
            if (b11 != 0) {
                if (b11 < 0) {
                    sb2.append(" - ");
                    b11 = -b11;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (b10 == 0 || b11 != 1) {
                    int c11 = this.f7256a.c(b11);
                    if (c11 == 0) {
                        c10 = '1';
                    } else if (c11 == 1) {
                        c10 = 'a';
                    } else {
                        sb2.append("a^");
                        sb2.append(c11);
                    }
                    sb2.append(c10);
                }
                if (b10 != 0) {
                    if (b10 == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(b10);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
