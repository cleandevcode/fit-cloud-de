package com.huawei.hms.scankit.p;

/* renamed from: com.huawei.hms.scankit.p.qa */
/* loaded from: classes.dex */
public final class C0706qa {

    /* renamed from: a */
    public static final C0706qa f8034a = new C0706qa(929, 3);

    /* renamed from: b */
    private final int[] f8035b;

    /* renamed from: c */
    private final int[] f8036c;

    /* renamed from: d */
    private final C0709ra f8037d;

    /* renamed from: e */
    private final C0709ra f8038e;

    /* renamed from: f */
    private final int f8039f;

    private C0706qa(int i10, int i11) {
        this.f8039f = i10;
        this.f8035b = new int[i10];
        this.f8036c = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f8035b[i13] = i12;
            i12 = (i12 * i11) % i10;
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f8036c[this.f8035b[i14]] = i14;
        }
        this.f8037d = new C0709ra(this, new int[]{0});
        this.f8038e = new C0709ra(this, new int[]{1});
    }

    public int a(int i10) {
        return this.f8035b[i10];
    }

    public int a(int i10, int i11) {
        return (i10 + i11) % this.f8039f;
    }

    public C0709ra a() {
        return this.f8038e;
    }

    public int b() {
        return this.f8039f;
    }

    public int b(int i10) {
        if (i10 != 0) {
            return this.f8035b[(this.f8039f - this.f8036c[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    public C0709ra b(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 == 0) {
                return this.f8037d;
            }
            int[] iArr = new int[i10 + 1];
            iArr[0] = i11;
            return new C0709ra(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    public int c(int i10) {
        if (i10 != 0) {
            return this.f8036c[i10];
        }
        throw new IllegalArgumentException();
    }

    public int c(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return 0;
        }
        int[] iArr = this.f8035b;
        int[] iArr2 = this.f8036c;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f8039f - 1)];
    }

    public C0709ra c() {
        return this.f8037d;
    }

    public int d(int i10, int i11) {
        int i12 = this.f8039f;
        return ((i10 + i12) - i11) % i12;
    }
}
