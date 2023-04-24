package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;

/* renamed from: com.huawei.hms.scankit.p.w */
/* loaded from: classes.dex */
public final class C0728w {

    /* renamed from: a */
    private final AbstractC0724v f8092a;

    /* renamed from: b */
    private C0736y f8093b;

    public C0728w(AbstractC0724v abstractC0724v) {
        if (abstractC0724v != null) {
            this.f8092a = abstractC0724v;
            return;
        }
        try {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        } catch (Exception e10) {
            throw e10;
        }
    }

    private C0732x a(int i10, int i11, int[] iArr, int[] iArr2, byte[] bArr, int i12) {
        int i13;
        int i14;
        int i15;
        C0732x c0732x = new C0732x(i11);
        for (int i16 = 1; i16 < i11; i16++) {
            int i17 = iArr2[i16 - 1];
            byte b10 = bArr[i16];
            iArr2[i16] = ((b10 & 255) * (b10 & 255)) + i17;
        }
        int i18 = i12 + 1;
        int i19 = i18;
        while (true) {
            i13 = i11 - i12;
            if (i19 >= i13) {
                break;
            }
            double d10 = iArr[i19 + i12] - iArr[(i19 - i12) - 1];
            double d11 = i10;
            if ((bArr[i19] & 255) <= (((Math.sqrt(((iArr2[i14] - iArr2[i15]) - ((d10 * d10) / d11)) / (i10 - 1)) / 127) * 0.5f) + 1.0d) * (d10 / d11)) {
                c0732x.d(i19);
            }
            i19++;
        }
        if (c0732x.a(i18)) {
            c0732x.c(0, i18);
        }
        if (c0732x.a(i13 - 1)) {
            c0732x.c(i13, i11);
        }
        return c0732x;
    }

    public AbstractC0724v a() {
        return this.f8092a;
    }

    public C0728w a(int i10, int i11, int i12, int i13) {
        return new C0728w(this.f8092a.a(this.f8092a.c().a(i10, i11, i12, i13)));
    }

    public C0732x a(int i10, int i11) {
        int i12;
        int e10 = e();
        if (e10 >= 45) {
            C0732x c0732x = new C0732x(e10);
            byte[] bArr = new byte[e10];
            a().c().a(i10, bArr);
            int[] iArr = new int[e10];
            int[] iArr2 = new int[e10];
            int i13 = bArr[0] & 255;
            iArr[0] = i13;
            iArr2[0] = i13 * i13;
            for (int i14 = 1; i14 < e10; i14++) {
                iArr[i14] = iArr[i14 - 1] + (bArr[i14] & 255);
            }
            if (i11 == 0) {
                int i15 = 23;
                while (true) {
                    i12 = e10 - 22;
                    if (i15 >= i12) {
                        break;
                    }
                    if ((bArr[i15] & 255) + 5 < (iArr[i15 + 22] - iArr[(i15 - 22) - 1]) / 45) {
                        c0732x.d(i15);
                    }
                    i15++;
                }
                if (c0732x.a(23)) {
                    c0732x.c(0, 23);
                }
                if (c0732x.a(i12 - 1)) {
                    c0732x.c(i12, e10);
                }
                return c0732x;
            }
            return a(45, e10, iArr, iArr2, bArr, 22);
        }
        throw C0628a.a();
    }

    public C0732x a(int i10, C0732x c0732x) {
        return this.f8092a.a(i10, c0732x);
    }

    public void a(C0736y c0736y) {
        this.f8093b = c0736y;
    }

    public C0736y b() {
        if (this.f8093b == null) {
            this.f8093b = this.f8092a.a();
        }
        return this.f8093b;
    }

    public int c() {
        return this.f8092a.b();
    }

    public byte[] d() {
        return this.f8092a.c().b();
    }

    public int e() {
        return this.f8092a.d();
    }
}
