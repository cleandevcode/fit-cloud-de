package com.huawei.hms.scankit.p;

/* renamed from: com.huawei.hms.scankit.p.z */
/* loaded from: classes.dex */
public final class C0740z {

    /* renamed from: a */
    private final byte[] f8124a;

    /* renamed from: b */
    private int f8125b;

    /* renamed from: c */
    private int f8126c;

    public C0740z(byte[] bArr) {
        this.f8124a = bArr;
    }

    public int a() {
        return ((this.f8124a.length - this.f8125b) * 8) - this.f8126c;
    }

    public int a(int i10) {
        if (i10 < 1 || i10 > 32 || i10 > a()) {
            try {
                throw new IllegalArgumentException(String.valueOf(i10));
            } catch (Exception e10) {
                throw e10;
            }
        }
        int i11 = this.f8126c;
        int i12 = 0;
        if (i11 > 0) {
            int i13 = 8 - i11;
            int i14 = i10 < i13 ? i10 : i13;
            int i15 = i13 - i14;
            int i16 = com.huawei.hms.scankit.util.b.a(this.f8124a, this.f8125b) ? (((255 >> (8 - i14)) << i15) & this.f8124a[this.f8125b]) >> i15 : 0;
            i10 -= i14;
            int i17 = this.f8126c + i14;
            this.f8126c = i17;
            if (i17 == 8) {
                this.f8126c = 0;
                this.f8125b++;
            }
            i12 = i16;
        }
        if (i10 > 0) {
            while (i10 >= 8) {
                if (com.huawei.hms.scankit.util.b.a(this.f8124a, this.f8125b)) {
                    i12 = (i12 << 8) | (this.f8124a[this.f8125b] & 255);
                }
                this.f8125b++;
                i10 -= 8;
            }
            if (i10 > 0) {
                int i18 = 8 - i10;
                int i19 = (255 >> i18) << i18;
                if (com.huawei.hms.scankit.util.b.a(this.f8124a, this.f8125b)) {
                    i12 = ((i19 & this.f8124a[this.f8125b]) >> i18) | (i12 << i10);
                }
                this.f8126c += i10;
            }
        }
        return i12;
    }

    public int b() {
        return this.f8126c;
    }

    public int c() {
        return this.f8125b;
    }
}
