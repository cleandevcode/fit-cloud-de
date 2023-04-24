package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.p.Ya;

/* loaded from: classes.dex */
final class Ba {

    /* renamed from: a */
    private final int f7475a;

    /* renamed from: b */
    private final byte[] f7476b;

    private Ba(int i10, byte[] bArr) {
        this.f7475a = i10;
        this.f7476b = bArr;
    }

    public static Ba[] a(byte[] bArr, Ya ya2, Pa pa2) {
        if (bArr.length != ya2.d()) {
            try {
                throw new IllegalArgumentException();
            } catch (Exception e10) {
                throw e10;
            }
        }
        Ya.b a10 = ya2.a(pa2);
        Ya.a[] a11 = a10.a();
        int i10 = 0;
        for (Ya.a aVar : a11) {
            i10 += aVar.a();
        }
        Ba[] baArr = new Ba[i10];
        int i11 = 0;
        for (Ya.a aVar2 : a11) {
            int i12 = 0;
            while (i12 < aVar2.a()) {
                int b10 = aVar2.b();
                baArr[i11] = new Ba(b10, new byte[a10.b() + b10]);
                i12++;
                i11++;
            }
        }
        int length = baArr[0].f7476b.length;
        int i13 = i10 - 1;
        while (i13 >= 0 && baArr[i13].f7476b.length != length) {
            i13--;
        }
        return a(baArr, bArr, length, a10, i11, i13 + 1);
    }

    private static Ba[] a(Ba[] baArr, byte[] bArr, int i10, Ya.b bVar, int i11, int i12) {
        int b10 = i10 - bVar.b();
        int i13 = 0;
        for (int i14 = 0; i14 < b10; i14++) {
            int i15 = 0;
            while (i15 < i11) {
                baArr[i15].f7476b[i14] = bArr[i13];
                i15++;
                i13++;
            }
        }
        int i16 = i12;
        while (i16 < i11) {
            baArr[i16].f7476b[b10] = bArr[i13];
            i16++;
            i13++;
        }
        int length = baArr[0].f7476b.length;
        while (b10 < length) {
            int i17 = 0;
            while (i17 < i11) {
                int i18 = i17 < i12 ? b10 : b10 + 1;
                if (i17 >= 0) {
                    try {
                        if (i17 < baArr.length && com.huawei.hms.scankit.util.b.a(baArr[i17].f7476b, i18) && com.huawei.hms.scankit.util.b.a(bArr, i13)) {
                            baArr[i17].f7476b[i18] = bArr[i13];
                            i17++;
                            i13++;
                        }
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        throw e10;
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            b10++;
        }
        return baArr;
    }

    public byte[] a() {
        return this.f7476b;
    }

    public int b() {
        return this.f7475a;
    }
}
