package w1;

import java.util.Arrays;
import w1.z;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: f */
    public static final k1 f29631f = new k1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f29632a;

    /* renamed from: b */
    public int[] f29633b;

    /* renamed from: c */
    public Object[] f29634c;

    /* renamed from: d */
    public int f29635d;

    /* renamed from: e */
    public boolean f29636e;

    public k1() {
        this(0, new int[8], new Object[8], true);
    }

    public k1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f29635d = -1;
        this.f29632a = i10;
        this.f29633b = iArr;
        this.f29634c = objArr;
        this.f29636e = z10;
    }

    public final int a() {
        int g02;
        int i10 = this.f29635d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f29632a; i12++) {
            int i13 = this.f29633b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 == 5) {
                                ((Integer) this.f29634c[i12]).intValue();
                                g02 = k.L(i14);
                            } else {
                                int i16 = z.f29731a;
                                throw new IllegalStateException(new z.a());
                            }
                        } else {
                            i11 = ((k1) this.f29634c[i12]).a() + (k.d0(i14) * 2) + i11;
                        }
                    } else {
                        g02 = k.I(i14, (g) this.f29634c[i12]);
                    }
                } else {
                    ((Long) this.f29634c[i12]).longValue();
                    g02 = k.M(i14);
                }
            } else {
                g02 = k.g0(i14, ((Long) this.f29634c[i12]).longValue());
            }
            i11 = g02 + i11;
        }
        this.f29635d = i11;
        return i11;
    }

    public final void b(int i10, Object obj) {
        int i11;
        if (this.f29636e) {
            int i12 = this.f29632a;
            int[] iArr = this.f29633b;
            if (i12 == iArr.length) {
                if (i12 < 4) {
                    i11 = 8;
                } else {
                    i11 = i12 >> 1;
                }
                int i13 = i12 + i11;
                this.f29633b = Arrays.copyOf(iArr, i13);
                this.f29634c = Arrays.copyOf(this.f29634c, i13);
            }
            int[] iArr2 = this.f29633b;
            int i14 = this.f29632a;
            iArr2[i14] = i10;
            this.f29634c[i14] = obj;
            this.f29632a = i14 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void c(l lVar) {
        if (this.f29632a == 0) {
            return;
        }
        lVar.getClass();
        for (int i10 = 0; i10 < this.f29632a; i10++) {
            int i11 = this.f29633b[i10];
            Object obj = this.f29634c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                lVar.e(i12, ((Integer) obj).intValue());
                            } else {
                                int i14 = z.f29731a;
                                throw new RuntimeException(new z.a());
                            }
                        } else {
                            lVar.f29637a.A0(i12, 3);
                            ((k1) obj).c(lVar);
                            lVar.f29637a.A0(i12, 4);
                        }
                    } else {
                        lVar.b(i12, (g) obj);
                    }
                } else {
                    lVar.f(i12, ((Long) obj).longValue());
                }
            } else {
                lVar.j(i12, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        int i10 = this.f29632a;
        if (i10 == k1Var.f29632a) {
            int[] iArr = this.f29633b;
            int[] iArr2 = k1Var.f29633b;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (iArr[i11] != iArr2[i11]) {
                        z10 = false;
                        break;
                    }
                    i11++;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                Object[] objArr = this.f29634c;
                Object[] objArr2 = k1Var.f29634c;
                int i12 = this.f29632a;
                int i13 = 0;
                while (true) {
                    if (i13 < i12) {
                        if (!objArr[i13].equals(objArr2[i13])) {
                            z11 = false;
                            break;
                        }
                        i13++;
                    } else {
                        z11 = true;
                        break;
                    }
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f29632a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f29633b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f29634c;
        int i16 = this.f29632a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
