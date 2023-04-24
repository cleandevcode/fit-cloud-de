package ab;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e */
    public static final f f446e = new f(g.f451b, 0, 0, 0);

    /* renamed from: a */
    public final int f447a;

    /* renamed from: b */
    public final g f448b;

    /* renamed from: c */
    public final int f449c;

    /* renamed from: d */
    public final int f450d;

    public f(g gVar, int i10, int i11, int i12) {
        this.f448b = gVar;
        this.f447a = i10;
        this.f449c = i11;
        this.f450d = i12;
    }

    public final f a(int i10) {
        int i11;
        g gVar = this.f448b;
        int i12 = this.f447a;
        int i13 = this.f450d;
        if (i12 == 4 || i12 == 2) {
            int i14 = d.f440c[i12][0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVar.getClass();
            i13 += i16;
            gVar = new e(gVar, i15, i16);
            i12 = 0;
        }
        int i17 = this.f449c;
        if (i17 != 0 && i17 != 31) {
            if (i17 == 62) {
                i11 = 9;
            } else {
                i11 = 8;
            }
        } else {
            i11 = 18;
        }
        int i18 = i17 + 1;
        f fVar = new f(gVar, i12, i18, i13 + i11);
        if (i18 == 2078) {
            return fVar.b(i10 + 1);
        }
        return fVar;
    }

    public final f b(int i10) {
        int i11 = this.f449c;
        if (i11 == 0) {
            return this;
        }
        g gVar = this.f448b;
        gVar.getClass();
        return new f(new a(gVar, i10 - i11, i11), this.f447a, 0, this.f450d);
    }

    public final boolean c(f fVar) {
        int i10;
        int i11 = this.f450d + (d.f440c[this.f447a][fVar.f447a] >> 16);
        int i12 = fVar.f449c;
        if (i12 > 0 && ((i10 = this.f449c) == 0 || i10 > i12)) {
            i11 += 10;
        }
        return i11 <= fVar.f450d;
    }

    public final f d(int i10, int i11) {
        int i12;
        int i13 = this.f450d;
        g gVar = this.f448b;
        int i14 = this.f447a;
        if (i10 != i14) {
            int i15 = d.f440c[i14][i10];
            int i16 = 65535 & i15;
            int i17 = i15 >> 16;
            gVar.getClass();
            i13 += i17;
            gVar = new e(gVar, i16, i17);
        }
        if (i10 == 2) {
            i12 = 4;
        } else {
            i12 = 5;
        }
        gVar.getClass();
        return new f(new e(gVar, i11, i12), i10, 0, i13 + i12);
    }

    public final f e(int i10, int i11) {
        int i12;
        g gVar = this.f448b;
        int i13 = this.f447a;
        if (i13 == 2) {
            i12 = 4;
        } else {
            i12 = 5;
        }
        int i14 = d.f442e[i13][i10];
        gVar.getClass();
        return new f(new e(new e(gVar, i14, i12), i11, 5), this.f447a, 0, this.f450d + i12 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", d.f439b[this.f447a], Integer.valueOf(this.f450d), Integer.valueOf(this.f449c));
    }
}
