package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.p.K;

/* loaded from: classes.dex */
final class D {

    /* renamed from: a */
    private final int f7494a;

    /* renamed from: b */
    private final byte[] f7495b;

    private D(int i10, byte[] bArr) {
        this.f7494a = i10;
        this.f7495b = bArr;
    }

    public static D[] a(byte[] bArr, K k10) {
        K.b c10 = k10.c();
        K.a[] a10 = c10.a();
        int i10 = 0;
        for (K.a aVar : a10) {
            i10 += aVar.a();
        }
        D[] dArr = new D[i10];
        int i11 = 0;
        for (K.a aVar2 : a10) {
            int i12 = 0;
            while (i12 < aVar2.a()) {
                int b10 = aVar2.b();
                dArr[i11] = new D(b10, new byte[c10.b() + b10]);
                i12++;
                i11++;
            }
        }
        int length = dArr[0].f7495b.length - c10.b();
        int i13 = length - 1;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = 0;
            while (i16 < i11) {
                dArr[i16].f7495b[i15] = bArr[i14];
                i16++;
                i14++;
            }
        }
        boolean z10 = k10.g() == 24;
        int i17 = z10 ? 8 : i11;
        int i18 = 0;
        while (i18 < i17) {
            dArr[i18].f7495b[i13] = bArr[i14];
            i18++;
            i14++;
        }
        int length2 = dArr[0].f7495b.length;
        while (length < length2) {
            int i19 = 0;
            while (i19 < i11) {
                int i20 = z10 ? (i19 + 8) % i11 : i19;
                dArr[i20].f7495b[(!z10 || i20 <= 7) ? length : length - 1] = bArr[i14];
                i19++;
                i14++;
            }
            length++;
        }
        if (i14 == bArr.length) {
            return dArr;
        }
        throw new IllegalArgumentException();
    }

    public byte[] a() {
        return this.f7495b;
    }

    public int b() {
        return this.f7494a;
    }
}
