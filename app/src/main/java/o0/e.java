package o0;

/* loaded from: classes.dex */
public class e<E> implements Cloneable {

    /* renamed from: e */
    public static final Object f22521e = new Object();

    /* renamed from: a */
    public boolean f22522a = false;

    /* renamed from: b */
    public long[] f22523b;

    /* renamed from: c */
    public Object[] f22524c;

    /* renamed from: d */
    public int f22525d;

    public e() {
        int i10 = 80;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (80 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f22523b = new long[i13];
        this.f22524c = new Object[i13];
    }

    public final void a(long j10, Long l10) {
        int i10 = this.f22525d;
        if (i10 != 0 && j10 <= this.f22523b[i10 - 1]) {
            g(j10, l10);
            return;
        }
        if (this.f22522a && i10 >= this.f22523b.length) {
            d();
        }
        int i11 = this.f22525d;
        if (i11 >= this.f22523b.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] jArr = new long[i15];
            Object[] objArr = new Object[i15];
            long[] jArr2 = this.f22523b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f22524c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f22523b = jArr;
            this.f22524c = objArr;
        }
        this.f22523b[i11] = j10;
        this.f22524c[i11] = l10;
        this.f22525d = i11 + 1;
    }

    public final void b() {
        int i10 = this.f22525d;
        Object[] objArr = this.f22524c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f22525d = 0;
        this.f22522a = false;
    }

    /* renamed from: c */
    public final e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f22523b = (long[]) this.f22523b.clone();
            eVar.f22524c = (Object[]) this.f22524c.clone();
            return eVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void d() {
        int i10 = this.f22525d;
        long[] jArr = this.f22523b;
        Object[] objArr = this.f22524c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f22521e) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f22522a = false;
        this.f22525d = i11;
    }

    public final Object e(long j10, Long l10) {
        Object obj;
        int c10 = hh.d.c(this.f22523b, this.f22525d, j10);
        return (c10 < 0 || (obj = this.f22524c[c10]) == f22521e) ? l10 : obj;
    }

    public final long f(int i10) {
        if (this.f22522a) {
            d();
        }
        return this.f22523b[i10];
    }

    public final void g(long j10, E e10) {
        int c10 = hh.d.c(this.f22523b, this.f22525d, j10);
        if (c10 >= 0) {
            this.f22524c[c10] = e10;
            return;
        }
        int i10 = ~c10;
        int i11 = this.f22525d;
        if (i10 < i11) {
            Object[] objArr = this.f22524c;
            if (objArr[i10] == f22521e) {
                this.f22523b[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f22522a && i11 >= this.f22523b.length) {
            d();
            i10 = ~hh.d.c(this.f22523b, this.f22525d, j10);
        }
        int i12 = this.f22525d;
        if (i12 >= this.f22523b.length) {
            int i13 = (i12 + 1) * 8;
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
            int i16 = i13 / 8;
            long[] jArr = new long[i16];
            Object[] objArr2 = new Object[i16];
            long[] jArr2 = this.f22523b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f22524c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f22523b = jArr;
            this.f22524c = objArr2;
        }
        int i17 = this.f22525d - i10;
        if (i17 != 0) {
            long[] jArr3 = this.f22523b;
            int i18 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i18, i17);
            Object[] objArr4 = this.f22524c;
            System.arraycopy(objArr4, i10, objArr4, i18, this.f22525d - i10);
        }
        this.f22523b[i10] = j10;
        this.f22524c[i10] = e10;
        this.f22525d++;
    }

    public final void h(long j10) {
        int c10 = hh.d.c(this.f22523b, this.f22525d, j10);
        if (c10 >= 0) {
            Object[] objArr = this.f22524c;
            Object obj = objArr[c10];
            Object obj2 = f22521e;
            if (obj != obj2) {
                objArr[c10] = obj2;
                this.f22522a = true;
            }
        }
    }

    public final int i() {
        if (this.f22522a) {
            d();
        }
        return this.f22525d;
    }

    public final E l(int i10) {
        if (this.f22522a) {
            d();
        }
        return (E) this.f22524c[i10];
    }

    public final String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f22525d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f22525d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(f(i10));
            sb2.append('=');
            E l10 = l(i10);
            if (l10 != this) {
                sb2.append(l10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
