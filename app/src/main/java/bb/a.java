package bb;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements Cloneable {

    /* renamed from: a */
    public int[] f4126a;

    /* renamed from: b */
    public int f4127b;

    public a() {
        this.f4127b = 0;
        this.f4126a = new int[1];
    }

    public a(int[] iArr, int i10) {
        this.f4126a = iArr;
        this.f4127b = i10;
    }

    public final void a(boolean z10) {
        c(this.f4127b + 1);
        if (z10) {
            int[] iArr = this.f4126a;
            int i10 = this.f4127b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f4127b++;
    }

    public final void b(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        c(this.f4127b + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            a(z10);
            i11--;
        }
    }

    public final void c(int i10) {
        int[] iArr = this.f4126a;
        if (i10 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i10 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f4126a = iArr2;
        }
    }

    public final Object clone() {
        return new a((int[]) this.f4126a.clone(), this.f4127b);
    }

    public final boolean d(int i10) {
        return ((1 << (i10 & 31)) & this.f4126a[i10 / 32]) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f4127b == aVar.f4127b && Arrays.equals(this.f4126a, aVar.f4126a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4126a) + (this.f4127b * 31);
    }

    public final String toString() {
        int i10 = this.f4127b;
        StringBuilder sb2 = new StringBuilder((i10 / 8) + i10 + 1);
        for (int i11 = 0; i11 < this.f4127b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(d(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }
}
