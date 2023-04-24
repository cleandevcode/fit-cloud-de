package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a */
    private static final int[][] f7558a = {new int[]{1, 10, 10, 8, 8, 5, 1, 3}, new int[]{2, 12, 12, 10, 10, 7, 1, 5}, new int[]{3, 14, 14, 12, 12, 10, 1, 8}, new int[]{4, 16, 16, 14, 14, 12, 1, 12}, new int[]{5, 18, 18, 16, 16, 14, 1, 18}, new int[]{6, 20, 20, 18, 18, 18, 1, 22}, new int[]{7, 22, 22, 20, 20, 20, 1, 30}, new int[]{8, 24, 24, 22, 22, 24, 1, 36}, new int[]{9, 26, 26, 24, 24, 28, 1, 44}, new int[]{10, 32, 32, 14, 14, 36, 1, 62}, new int[]{11, 36, 36, 16, 16, 42, 1, 86}, new int[]{12, 40, 40, 18, 18, 48, 1, 114}, new int[]{13, 44, 44, 20, 20, 56, 1, 144}, new int[]{14, 48, 48, 22, 22, 68, 1, 174}, new int[]{15, 52, 52, 24, 24, 42, 2, 102}, new int[]{16, 64, 64, 14, 14, 56, 2, 140}, new int[]{17, 72, 72, 16, 16, 36, 4, 92}, new int[]{18, 80, 80, 18, 18, 48, 4, 114}, new int[]{19, 88, 88, 20, 20, 56, 4, 144}, new int[]{20, 96, 96, 22, 22, 68, 4, 174}, new int[]{21, 104, 104, 24, 24, 56, 6, 136}, new int[]{22, 120, 120, 18, 18, 68, 6, 175}, new int[]{23, 132, 132, 20, 20, 62, 8, 163}, new int[]{24, 144, 144, 22, 22, 62, 8, 156, 2, 155}, new int[]{25, 8, 18, 6, 16, 7, 1, 5}, new int[]{26, 8, 32, 6, 14, 11, 1, 10}, new int[]{27, 12, 26, 10, 24, 14, 1, 16}, new int[]{28, 12, 36, 10, 16, 18, 1, 22}, new int[]{29, 16, 36, 14, 16, 24, 1, 32}, new int[]{30, 16, 48, 14, 22, 28, 1, 49}};

    /* renamed from: b */
    private static final K[] f7559b = h();

    /* renamed from: c */
    private final int f7560c;

    /* renamed from: d */
    private final int f7561d;

    /* renamed from: e */
    private final int f7562e;

    /* renamed from: f */
    private final int f7563f;

    /* renamed from: g */
    private final int f7564g;

    /* renamed from: h */
    private final b f7565h;

    /* renamed from: i */
    private final int f7566i;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final int f7567a;

        /* renamed from: b */
        private final int f7568b;

        private a(int i10, int i11) {
            this.f7567a = i10;
            this.f7568b = i11;
        }

        public int a() {
            return this.f7567a;
        }

        public int b() {
            return this.f7568b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final int f7569a;

        /* renamed from: b */
        private final a[] f7570b;

        private b(int i10, a aVar) {
            this.f7569a = i10;
            this.f7570b = new a[]{aVar};
        }

        private b(int i10, a aVar, a aVar2) {
            this.f7569a = i10;
            this.f7570b = new a[]{aVar, aVar2};
        }

        public a[] a() {
            return this.f7570b;
        }

        public int b() {
            return this.f7569a;
        }
    }

    private K(int i10, int i11, int i12, int i13, int i14, b bVar) {
        a[] a10;
        this.f7560c = i10;
        this.f7561d = i11;
        this.f7562e = i12;
        this.f7563f = i13;
        this.f7564g = i14;
        this.f7565h = bVar;
        int b10 = bVar.b();
        int i15 = 0;
        for (a aVar : bVar.a()) {
            i15 += (aVar.b() + b10) * aVar.a();
        }
        this.f7566i = i15;
    }

    public static K a(int i10, int i11) {
        K[] kArr;
        if ((i10 & 1) == 0 && (i11 & 1) == 0) {
            for (K k10 : f7559b) {
                if (k10.f7561d == i10 && k10.f7562e == i11) {
                    return k10;
                }
            }
            throw C0628a.a();
        }
        throw C0628a.a();
    }

    private static K[] h() {
        K[] kArr = new K[f7558a.length];
        int i10 = 0;
        while (true) {
            int[][] iArr = f7558a;
            if (i10 >= iArr.length) {
                return kArr;
            }
            int[] iArr2 = iArr[i10];
            if (i10 == 23) {
                kArr[i10] = new K(iArr2[0], iArr2[1], iArr2[2], iArr2[3], iArr2[4], new b(iArr2[5], new a(iArr2[6], iArr2[7]), new a(iArr2[8], iArr2[9])));
            } else {
                kArr[i10] = new K(iArr2[0], iArr2[1], iArr2[2], iArr2[3], iArr2[4], new b(iArr2[5], new a(iArr2[6], iArr2[7])));
            }
            i10++;
        }
    }

    public int a() {
        return this.f7564g;
    }

    public int b() {
        return this.f7563f;
    }

    public b c() {
        return this.f7565h;
    }

    public int d() {
        return this.f7562e;
    }

    public int e() {
        return this.f7561d;
    }

    public int f() {
        return this.f7566i;
    }

    public int g() {
        return this.f7560c;
    }

    public String toString() {
        return String.valueOf(this.f7560c);
    }
}
