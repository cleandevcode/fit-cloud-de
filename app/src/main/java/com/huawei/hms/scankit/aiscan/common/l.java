package com.huawei.hms.scankit.aiscan.common;

import com.huawei.hms.scankit.p.C0728w;
import com.huawei.hms.scankit.p._a;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    private static final int[] f7259a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 9, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 20, 20, 21, 21, 22, 22, 23, 24, 24, 25, 26, 26, 27, 28, 28, 29, 30, 30, 31, 32, 32, 33, 34, 35, 35, 36, 37, 38, 38, 39, 40, 41, 42, 42, 43, 44, 45, 46, 47, 48, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 81, 82, 83, 84, 85, 86, 87, 89, 90, 91, 92, 93, 95, 96, 97, 98, 100, 101, 102, 103, 105, 106, 107, 109, 110, 111, 113, 114, 115, 117, 118, 119, 121, 122, 123, 125, 126, 128, 129, 131, 132, 133, 135, 136, 138, 139, 141, 142, 144, 145, 147, 148, 150, 151, 153, 154, 156, 158, 159, 161, 162, 164, 166, 167, 169, 170, 172, 174, 175, 177, 179, 180, 182, 184, 185, 187, 189, 191, 192, 194, 196, 198, 199, 201, 203, 205, 207, 208, 210, 212, 214, 216, 217, 219, 221, 223, 225, 227, 229, 231, 233, 234, 236, 238, 240, 242, 244, 246, 248, 250, 252, 254};

    /* renamed from: b */
    private C0728w f7260b;

    /* renamed from: c */
    private C0728w f7261c;

    /* renamed from: d */
    private C0728w f7262d;

    /* renamed from: e */
    private C0728w f7263e;

    /* renamed from: f */
    private C0728w f7264f;

    /* renamed from: g */
    private C0728w f7265g;

    /* renamed from: h */
    private C0728w f7266h;

    /* renamed from: i */
    private C0728w f7267i;

    /* renamed from: j */
    private C0728w f7268j;

    /* renamed from: k */
    private C0728w f7269k;

    /* renamed from: l */
    private C0728w f7270l;

    /* renamed from: m */
    private C0728w f7271m;

    /* renamed from: n */
    private C0728w f7272n;

    /* renamed from: o */
    private C0728w f7273o;

    public static C0728w a(C0728w c0728w) {
        byte[] b10 = c0728w.a().c().b();
        if (b10 == null || b10.length <= 0) {
            return c0728w;
        }
        byte[] bArr = new byte[b10.length];
        for (int i10 = 0; i10 < b10.length; i10++) {
            bArr[i10] = (byte) (f7259a[b10[i10] & 255] & 255);
        }
        return new C0728w(new com.huawei.hms.scankit.p.B(new r(bArr, c0728w.e(), c0728w.c(), 0, 0, c0728w.e(), c0728w.c(), false)));
    }

    public static C0728w h(C0728w c0728w) {
        byte[] b10 = c0728w.a().c().b();
        if (b10 == null || b10.length <= 0) {
            return c0728w;
        }
        int length = b10.length;
        float[] fArr = new float[length];
        float f10 = 0.0f;
        float f11 = 255.0f;
        for (int i10 = 0; i10 < b10.length; i10++) {
            float f12 = (b10[i10] & 255) / 255.0f;
            fArr[i10] = f12;
            if (f12 < 0.5d) {
                fArr[i10] = 2.0f * f12 * f12;
            } else if (f12 > 0.5d) {
                fArr[i10] = t0.e.a(f12, 1.0f, (f12 - 1.0f) * (-2.0f), 1.0f);
            }
            float f13 = fArr[i10];
            if (f13 > f10) {
                f10 = f13;
            }
            if (f13 < f11) {
                f11 = f13;
            }
        }
        float f14 = f10 - f11;
        if (Math.abs(f14) >= 0.001d) {
            byte[] bArr = new byte[b10.length];
            for (int i11 = 0; i11 < length; i11++) {
                bArr[i11] = (byte) (((int) (((fArr[i11] - f11) / f14) * 255.0f)) & 255);
            }
            return new C0728w(new com.huawei.hms.scankit.p.B(new r(bArr, c0728w.e(), c0728w.c(), 0, 0, c0728w.e(), c0728w.c(), false)));
        }
        throw C0628a.a();
    }

    public C0728w a(C0728w c0728w, float f10) {
        if (this.f7260b == null) {
            this.f7260b = _a.f7790a ? k.a(_a.f7791b, c0728w, f10) : k.a(c0728w, f10);
        }
        return this.f7260b;
    }

    public void a() {
        this.f7273o = null;
        this.f7266h = null;
        this.f7268j = null;
        this.f7269k = null;
        this.f7270l = null;
        this.f7271m = null;
        this.f7272n = null;
    }

    public C0728w b(C0728w c0728w) {
        if (this.f7262d == null) {
            this.f7262d = a(c0728w);
        }
        return this.f7262d;
    }

    public C0728w b(C0728w c0728w, float f10) {
        if (this.f7261c == null) {
            this.f7261c = _a.f7790a ? k.a(_a.f7791b, c0728w, f10) : k.a(c0728w, f10);
        }
        return this.f7261c;
    }

    public C0728w c(C0728w c0728w) {
        if (this.f7263e == null) {
            this.f7263e = a(c0728w);
        }
        return this.f7263e;
    }

    public C0728w c(C0728w c0728w, float f10) {
        if (this.f7267i == null) {
            this.f7267i = _a.f7790a ? k.a(_a.f7791b, c0728w, f10) : k.a(c0728w, f10);
        }
        return this.f7267i;
    }

    public C0728w d(C0728w c0728w) {
        if (this.f7264f == null) {
            this.f7264f = h(c0728w);
        }
        return this.f7264f;
    }

    public C0728w d(C0728w c0728w, float f10) {
        if (this.f7265g == null) {
            this.f7265g = _a.f7790a ? k.a(_a.f7791b, c0728w, f10) : k.a(c0728w, f10);
        }
        return this.f7265g;
    }

    public C0728w e(C0728w c0728w) {
        if (this.f7271m == null) {
            this.f7271m = a(c0728w);
        }
        return this.f7271m;
    }

    public C0728w e(C0728w c0728w, float f10) {
        if (this.f7273o == null) {
            this.f7273o = _a.f7790a ? k.a(_a.f7791b, c0728w, f10) : k.a(c0728w, f10);
        }
        return this.f7273o;
    }

    public C0728w f(C0728w c0728w) {
        if (this.f7272n == null) {
            this.f7272n = h(c0728w);
        }
        return this.f7272n;
    }

    public C0728w f(C0728w c0728w, float f10) {
        if (this.f7270l == null) {
            this.f7270l = _a.f7790a ? k.a(_a.f7791b, c0728w, f10) : k.a(c0728w, f10);
        }
        return this.f7270l;
    }

    public C0728w g(C0728w c0728w) {
        if (this.f7269k == null) {
            this.f7269k = h(c0728w);
        }
        return this.f7269k;
    }

    public C0728w g(C0728w c0728w, float f10) {
        if (this.f7268j == null) {
            this.f7268j = _a.f7790a ? k.a(_a.f7791b, c0728w, f10) : k.a(c0728w, f10);
        }
        return this.f7268j;
    }

    public C0728w h(C0728w c0728w, float f10) {
        if (this.f7266h == null) {
            this.f7266h = _a.f7790a ? k.a(_a.f7791b, c0728w, f10) : k.a(c0728w, f10);
        }
        return this.f7266h;
    }
}
