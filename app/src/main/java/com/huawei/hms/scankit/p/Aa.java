package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;

/* loaded from: classes.dex */
final class Aa {

    /* renamed from: a */
    private final C0736y f7458a;

    /* renamed from: b */
    private Ya f7459b;

    /* renamed from: c */
    private Ua f7460c;

    /* renamed from: d */
    private boolean f7461d;

    public Aa(C0736y c0736y) {
        int b10 = c0736y.b();
        if (b10 < 21 || (b10 & 3) != 1) {
            throw C0628a.a();
        }
        this.f7458a = c0736y;
    }

    private int a(int i10, int i11, int i12) {
        return this.f7461d ? this.f7458a.b(i11, i10) : this.f7458a.b(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    public void a() {
        int i10 = 0;
        while (i10 < this.f7458a.d()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f7458a.b(); i12++) {
                if (this.f7458a.b(i10, i12) != this.f7458a.b(i12, i10)) {
                    this.f7458a.a(i12, i10);
                    this.f7458a.a(i10, i12);
                }
            }
            i10 = i11;
        }
    }

    public void a(boolean z10) {
        this.f7459b = null;
        this.f7460c = null;
        this.f7461d = z10;
    }

    public byte[] b() {
        Ua c10 = c();
        Ya d10 = d();
        Ka ka2 = Ka.values()[c10.a()];
        int b10 = this.f7458a.b();
        ka2.a(this.f7458a, b10);
        C0736y a10 = d10.a();
        byte[] bArr = new byte[d10.d()];
        int i10 = b10 - 1;
        boolean z10 = true;
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            if (i11 == 6) {
                i11--;
            }
            for (int i15 = 0; i15 < b10; i15++) {
                int i16 = z10 ? i10 - i15 : i15;
                for (int i17 = 0; i17 < 2; i17++) {
                    int i18 = i11 - i17;
                    if (!a10.b(i18, i16)) {
                        i14++;
                        i13 <<= 1;
                        if (this.f7458a.b(i18, i16)) {
                            i13 |= 1;
                        }
                        if (i14 == 8) {
                            bArr[i12] = (byte) i13;
                            i12++;
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i11 -= 2;
        }
        if (i12 == d10.d()) {
            return bArr;
        }
        throw C0628a.a();
    }

    public Ua c() {
        Ua ua2 = this.f7460c;
        if (ua2 != null) {
            return ua2;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = a(i12, 8, i11);
        }
        int a10 = a(8, 7, a(8, 8, a(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            a10 = a(8, i13, a10);
        }
        int b10 = this.f7458a.b();
        int i14 = b10 - 7;
        for (int i15 = b10 - 1; i15 >= i14; i15--) {
            i10 = a(8, i15, i10);
        }
        for (int i16 = b10 - 8; i16 < b10; i16++) {
            i10 = a(i16, 8, i10);
        }
        Ua a11 = Ua.a(a10, i10);
        this.f7460c = a11;
        if (a11 != null) {
            return a11;
        }
        throw C0628a.a();
    }

    public Ya d() {
        Ya ya2 = this.f7459b;
        if (ya2 != null) {
            return ya2;
        }
        int b10 = this.f7458a.b();
        int i10 = (b10 - 17) / 4;
        if (i10 <= 6) {
            return Ya.c(i10);
        }
        int i11 = b10 - 11;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = b10 - 9; i15 >= i11; i15--) {
                i13 = a(i15, i14, i13);
            }
        }
        Ya a10 = Ya.a(i13);
        if (a10 != null && a10.c() == b10) {
            this.f7459b = a10;
            return a10;
        }
        for (int i16 = 5; i16 >= 0; i16--) {
            for (int i17 = b10 - 9; i17 >= i11; i17--) {
                i12 = a(i16, i17, i12);
            }
        }
        Ya a11 = Ya.a(i12);
        if (a11 == null || a11.c() != b10) {
            throw C0628a.a();
        }
        this.f7459b = a11;
        return a11;
    }

    public void e() {
        if (this.f7460c == null) {
            return;
        }
        Ka.values()[this.f7460c.a()].a(this.f7458a, this.f7458a.b());
    }
}
