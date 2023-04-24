package cb;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final a f4607a;

    /* renamed from: b */
    public final int[] f4608b;

    public b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f4607a = aVar;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f4608b = iArr;
            return;
        }
        int i10 = 1;
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f4608b = new int[]{0};
            return;
        }
        int i11 = length - i10;
        int[] iArr2 = new int[i11];
        this.f4608b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
    }

    public final b a(b bVar) {
        if (this.f4607a.equals(bVar.f4607a)) {
            if (b()) {
                return bVar;
            }
            if (bVar.b()) {
                return this;
            }
            int[] iArr = this.f4608b;
            int[] iArr2 = bVar.f4608b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                iArr3[i10] = iArr2[i10 - length] ^ iArr[i10];
            }
            return new b(this.f4607a, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final boolean b() {
        return this.f4608b[0] == 0;
    }

    public final b c(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 == 0) {
                return this.f4607a.f4603c;
            }
            int length = this.f4608b.length;
            int[] iArr = new int[i10 + length];
            for (int i12 = 0; i12 < length; i12++) {
                iArr[i12] = this.f4607a.a(this.f4608b[i12], i11);
            }
            return new b(this.f4607a, iArr);
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        int[] iArr;
        char c10;
        StringBuilder sb2 = new StringBuilder((this.f4608b.length - 1) * 8);
        int length = this.f4608b.length;
        while (true) {
            length--;
            if (length >= 0) {
                int i10 = this.f4608b[(iArr.length - 1) - length];
                if (i10 != 0) {
                    if (i10 < 0) {
                        sb2.append(" - ");
                        i10 = -i10;
                    } else if (sb2.length() > 0) {
                        sb2.append(" + ");
                    }
                    if (length == 0 || i10 != 1) {
                        a aVar = this.f4607a;
                        if (i10 != 0) {
                            int i11 = aVar.f4602b[i10];
                            if (i11 == 0) {
                                c10 = '1';
                            } else if (i11 == 1) {
                                c10 = 'a';
                            } else {
                                sb2.append("a^");
                                sb2.append(i11);
                            }
                            sb2.append(c10);
                        } else {
                            aVar.getClass();
                            throw new IllegalArgumentException();
                        }
                    }
                    if (length != 0) {
                        if (length == 1) {
                            sb2.append('x');
                        } else {
                            sb2.append("x^");
                            sb2.append(length);
                        }
                    }
                }
            } else {
                return sb2.toString();
            }
        }
    }
}
