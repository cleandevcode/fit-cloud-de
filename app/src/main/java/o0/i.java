package o0;

/* loaded from: classes.dex */
public class i<E> implements Cloneable {

    /* renamed from: e */
    public static final Object f22553e = new Object();

    /* renamed from: a */
    public boolean f22554a = false;

    /* renamed from: b */
    public int[] f22555b;

    /* renamed from: c */
    public Object[] f22556c;

    /* renamed from: d */
    public int f22557d;

    public i() {
        int i10 = 40;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f22555b = new int[i13];
        this.f22556c = new Object[i13];
    }

    public final void a(int i10, E e10) {
        int i11 = this.f22557d;
        if (i11 != 0 && i10 <= this.f22555b[i11 - 1]) {
            e(i10, e10);
            return;
        }
        if (this.f22554a && i11 >= this.f22555b.length) {
            c();
        }
        int i12 = this.f22557d;
        if (i12 >= this.f22555b.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] iArr = new int[i16];
            Object[] objArr = new Object[i16];
            int[] iArr2 = this.f22555b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f22556c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f22555b = iArr;
            this.f22556c = objArr;
        }
        this.f22555b[i12] = i10;
        this.f22556c[i12] = e10;
        this.f22557d = i12 + 1;
    }

    /* renamed from: b */
    public final i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f22555b = (int[]) this.f22555b.clone();
            iVar.f22556c = (Object[]) this.f22556c.clone();
            return iVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void c() {
        int i10 = this.f22557d;
        int[] iArr = this.f22555b;
        Object[] objArr = this.f22556c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f22553e) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f22554a = false;
        this.f22557d = i11;
    }

    public final Object d(int i10, Integer num) {
        Object obj;
        int b10 = hh.d.b(this.f22557d, i10, this.f22555b);
        return (b10 < 0 || (obj = this.f22556c[b10]) == f22553e) ? num : obj;
    }

    public final void e(int i10, E e10) {
        int b10 = hh.d.b(this.f22557d, i10, this.f22555b);
        if (b10 >= 0) {
            this.f22556c[b10] = e10;
            return;
        }
        int i11 = ~b10;
        int i12 = this.f22557d;
        if (i11 < i12) {
            Object[] objArr = this.f22556c;
            if (objArr[i11] == f22553e) {
                this.f22555b[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f22554a && i12 >= this.f22555b.length) {
            c();
            i11 = ~hh.d.b(this.f22557d, i10, this.f22555b);
        }
        int i13 = this.f22557d;
        if (i13 >= this.f22555b.length) {
            int i14 = (i13 + 1) * 4;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 4;
            int[] iArr = new int[i17];
            Object[] objArr2 = new Object[i17];
            int[] iArr2 = this.f22555b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f22556c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f22555b = iArr;
            this.f22556c = objArr2;
        }
        int i18 = this.f22557d - i11;
        if (i18 != 0) {
            int[] iArr3 = this.f22555b;
            int i19 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i19, i18);
            Object[] objArr4 = this.f22556c;
            System.arraycopy(objArr4, i11, objArr4, i19, this.f22557d - i11);
        }
        this.f22555b[i11] = i10;
        this.f22556c[i11] = e10;
        this.f22557d++;
    }

    public final int f() {
        if (this.f22554a) {
            c();
        }
        return this.f22557d;
    }

    public final E g(int i10) {
        if (this.f22554a) {
            c();
        }
        return (E) this.f22556c[i10];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f22557d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f22557d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            if (this.f22554a) {
                c();
            }
            sb2.append(this.f22555b[i10]);
            sb2.append('=');
            E g10 = g(i10);
            if (g10 != this) {
                sb2.append(g10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
