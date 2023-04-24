package bb;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements Cloneable {

    /* renamed from: a */
    public final int f4128a;

    /* renamed from: b */
    public final int f4129b;

    /* renamed from: c */
    public final int f4130c;

    /* renamed from: d */
    public final int[] f4131d;

    public b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f4128a = i10;
        this.f4129b = i11;
        int i12 = (i10 + 31) / 32;
        this.f4130c = i12;
        this.f4131d = new int[i12 * i11];
    }

    public b(int i10, int i11, int i12, int[] iArr) {
        this.f4128a = i10;
        this.f4129b = i11;
        this.f4130c = i12;
        this.f4131d = iArr;
    }

    public final boolean a(int i10, int i11) {
        return ((this.f4131d[(i10 / 32) + (i11 * this.f4130c)] >>> (i10 & 31)) & 1) != 0;
    }

    public final void b(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.f4130c);
        int[] iArr = this.f4131d;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public final void c(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f4129b || i14 > this.f4128a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f4130c * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.f4131d;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public final Object clone() {
        return new b(this.f4128a, this.f4129b, this.f4130c, (int[]) this.f4131d.clone());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f4128a == bVar.f4128a && this.f4129b == bVar.f4129b && this.f4130c == bVar.f4130c && Arrays.equals(this.f4131d, bVar.f4131d);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f4128a;
        return Arrays.hashCode(this.f4131d) + (((((((i10 * 31) + i10) * 31) + this.f4129b) * 31) + this.f4130c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f4128a + 1) * this.f4129b);
        for (int i10 = 0; i10 < this.f4129b; i10++) {
            for (int i11 = 0; i11 < this.f4128a; i11++) {
                sb2.append(a(i11, i10) ? "X " : "  ");
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
