package ke;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public int f18460a;

    /* renamed from: b */
    public int f18461b;

    /* renamed from: c */
    public String f18462c;

    /* renamed from: d */
    public int f18463d;

    /* renamed from: e */
    public int f18464e;

    /* renamed from: f */
    public int f18465f;

    /* renamed from: g */
    public int f18466g;

    public g(int i10, int i11, int i12) {
        this.f18460a = i10;
        this.f18461b = i11;
        this.f18463d = 0;
        this.f18464e = 0;
        this.f18465f = 0;
        this.f18466g = i12;
        this.f18462c = String.valueOf(i12);
    }

    public g(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f18460a = i10;
        this.f18461b = i11;
        this.f18463d = i12;
        this.f18464e = i13;
        this.f18465f = i14;
        this.f18466g = i15;
        this.f18462c = String.format("%d.%d.%d.%d", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
    }

    public static g b(int i10, int i11) {
        if (-1 == i11) {
            return new g(i11, i10, 0);
        }
        if (i10 == 1) {
            return new g(i11, i10, i11 & 255, (i11 >> 8) & 255, (i11 >> 16) & 255, (i11 >> 24) & 255);
        }
        if (i10 != 515 && i10 != 516 && i10 != 2) {
            if (i10 == 3) {
                return new g(i11, i10, i11 & 15, (i11 >> 4) & 255, (i11 >> 12) & 32767, (i11 >> 27) & 31);
            }
            if (i10 == 5) {
                return new g(i11, i10, i11 & 15, (i11 >> 4) & 255, (i11 >> 12) & 511, (i11 >> 21) & 2047);
            }
            if (i10 != 4 && i10 != 7 && i10 == 514) {
                return new g(i11, i10, (i11 >> 8) & 255, i11 & 255, (i11 >> 24) & 255, (i11 >> 16) & 255);
            }
            return new g(i11, i10, i11);
        }
        return new g(i11, i10, (i11 >> 24) & 255, (i11 >> 16) & 255, (i11 >> 8) & 255, i11 & 255);
    }

    public final int a(g gVar) {
        int i10 = this.f18463d;
        int i11 = gVar.f18463d;
        if (i10 > i11) {
            return 1;
        }
        if (i10 < i11) {
            return -1;
        }
        int i12 = this.f18464e;
        int i13 = gVar.f18464e;
        if (i12 > i13) {
            return 1;
        }
        if (i12 < i13) {
            return -1;
        }
        int i14 = this.f18465f;
        int i15 = gVar.f18465f;
        if (i14 > i15) {
            return 1;
        }
        if (i14 < i15) {
            return -1;
        }
        return Integer.compare(this.f18466g, gVar.f18466g);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ImageVersion{");
        a10.append(String.format("\n\t%d(%08X)", Integer.valueOf(this.f18460a), Integer.valueOf(this.f18460a)));
        a10.append(String.format("\n\t%d(%s))", Integer.valueOf(this.f18461b), this.f18462c));
        a10.append("\n}");
        return a10.toString();
    }
}
