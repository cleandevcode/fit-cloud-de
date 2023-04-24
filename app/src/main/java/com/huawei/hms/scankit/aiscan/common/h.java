package com.huawei.hms.scankit.aiscan.common;

import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public static final h f7241a = new h(4201, 4096, 1);

    /* renamed from: b */
    public static final h f7242b = new h(1033, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, 1);

    /* renamed from: c */
    public static final h f7243c;

    /* renamed from: d */
    public static final h f7244d;

    /* renamed from: e */
    public static final h f7245e;

    /* renamed from: f */
    public static final h f7246f;

    /* renamed from: g */
    public static final h f7247g;

    /* renamed from: h */
    public static final h f7248h;

    /* renamed from: i */
    private final int[] f7249i;

    /* renamed from: j */
    private final int[] f7250j;

    /* renamed from: k */
    private final i f7251k;

    /* renamed from: l */
    private final i f7252l;

    /* renamed from: m */
    private final int f7253m;

    /* renamed from: n */
    private final int f7254n;

    /* renamed from: o */
    private final int f7255o;

    static {
        h hVar = new h(67, 64, 1);
        f7243c = hVar;
        f7244d = new h(19, 16, 1);
        f7245e = new h(285, DfuBaseService.ERROR_REMOTE_TYPE_LEGACY, 0);
        h hVar2 = new h(301, DfuBaseService.ERROR_REMOTE_TYPE_LEGACY, 1);
        f7246f = hVar2;
        f7247g = hVar2;
        f7248h = hVar;
    }

    public h(int i10, int i11, int i12) {
        this.f7254n = i10;
        this.f7253m = i11;
        this.f7255o = i12;
        this.f7249i = new int[i11];
        this.f7250j = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f7249i[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f7250j[this.f7249i[i15]] = i15;
        }
        this.f7251k = new i(this, new int[]{0});
        this.f7252l = new i(this, new int[]{1});
    }

    public static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    public int a() {
        return this.f7255o;
    }

    public int a(int i10) {
        if (com.huawei.hms.scankit.util.b.a(this.f7249i, i10)) {
            return this.f7249i[i10];
        }
        return -1;
    }

    public int b(int i10) {
        if (i10 != 0) {
            return this.f7249i[(this.f7253m - this.f7250j[i10]) - 1];
        }
        try {
            throw new ArithmeticException();
        } catch (Exception e10) {
            throw e10;
        }
    }

    public i b() {
        return this.f7252l;
    }

    public i b(int i10, int i11) {
        if (i10 < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (Exception e10) {
                throw e10;
            }
        } else if (i11 == 0) {
            return this.f7251k;
        } else {
            int[] iArr = new int[i10 + 1];
            iArr[0] = i11;
            return new i(this, iArr);
        }
    }

    public int c() {
        return this.f7253m;
    }

    public int c(int i10) {
        if (i10 != 0) {
            return this.f7250j[i10];
        }
        try {
            throw new IllegalArgumentException();
        } catch (Exception e10) {
            throw e10;
        }
    }

    public int c(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f7249i;
        int[] iArr2 = this.f7250j;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f7253m - 1)];
    }

    public i d() {
        return this.f7251k;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("GF(0x");
        a10.append(Integer.toHexString(this.f7254n));
        a10.append(',');
        return a1.b.a(a10, this.f7253m, ')');
    }
}
