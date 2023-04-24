package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;

/* loaded from: classes.dex */
public class A extends AbstractC0724v {

    /* renamed from: b */
    private static final byte[] f7454b = new byte[0];

    /* renamed from: c */
    private static int f7455c = -1;

    /* renamed from: d */
    private byte[] f7456d;

    /* renamed from: e */
    private final int[] f7457e;

    public A(com.huawei.hms.scankit.aiscan.common.m mVar) {
        super(mVar);
        this.f7456d = f7454b;
        this.f7457e = new int[32];
    }

    private static int a(int[] iArr, boolean z10) {
        int length = iArr.length;
        boolean z11 = false;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            if (i14 > i10) {
                i12 = i13;
                i10 = i14;
            }
            if (i14 > i11) {
                i11 = i14;
            }
        }
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 - i12;
            int i19 = iArr[i17] * i18 * i18;
            if (i19 > i16) {
                i15 = i17;
                i16 = i19;
            }
        }
        if (i12 <= i15) {
            int i20 = i12;
            i12 = i15;
            i15 = i20;
        }
        int i21 = i12 - i15;
        if (i21 > length / 16) {
            int i22 = i12 - 1;
            int i23 = i22;
            int i24 = -1;
            while (i22 > i15) {
                int i25 = i22 - i15;
                int i26 = (i11 - iArr[i22]) * (i12 - i22) * i25 * i25;
                if (i26 > i24) {
                    i23 = i22;
                    i24 = i26;
                }
                i22--;
            }
            if (z10) {
                if (i23 < 10 && i24 < 100000 && i21 < 10) {
                    z11 = true;
                }
                _a.f7804o = z11;
            }
            return i23 << 3;
        }
        throw C0628a.a();
    }

    private void a(int i10) {
        if (this.f7456d.length < i10) {
            this.f7456d = new byte[i10];
        }
        for (int i11 = 0; i11 < 32; i11++) {
            this.f7457e[i11] = 0;
        }
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0724v
    public AbstractC0724v a(com.huawei.hms.scankit.aiscan.common.m mVar) {
        return new A(mVar);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0724v
    public C0732x a(int i10, C0732x c0732x) {
        com.huawei.hms.scankit.aiscan.common.m c10 = c();
        int c11 = c10.c();
        if (c0732x == null || c0732x.d() < c11) {
            c0732x = new C0732x(c11);
        } else {
            c0732x.a();
        }
        a(c11);
        byte[] a10 = c10.a(i10, this.f7456d);
        int[] iArr = this.f7457e;
        for (int i11 = 0; i11 < c11; i11++) {
            int i12 = (a10[i11] & 255) >> 3;
            iArr[i12] = iArr[i12] + 1;
        }
        int a11 = a(iArr, false);
        if (c11 < 3) {
            for (int i13 = 0; i13 < c11; i13++) {
                if ((a10[i13] & 255) < a11) {
                    c0732x.d(i13);
                }
            }
        } else {
            int i14 = a10[1] & 255;
            int i15 = 1;
            int i16 = a10[0] & 255;
            int i17 = i14;
            while (i15 < c11 - 1) {
                int i18 = i15 + 1;
                int i19 = a10[i18] & 255;
                if ((((i17 * 4) - i16) - i19) / 2 < a11) {
                    c0732x.d(i15);
                }
                i16 = i17;
                i15 = i18;
                i17 = i19;
            }
        }
        return c0732x;
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0724v
    public C0736y a() {
        com.huawei.hms.scankit.aiscan.common.m c10 = c();
        int c11 = c10.c();
        int a10 = c10.a();
        a(c11);
        int[] iArr = this.f7457e;
        for (int i10 = 1; i10 < 5; i10++) {
            byte[] a11 = c10.a((a10 * i10) / 5, this.f7456d);
            int i11 = (c11 * 4) / 5;
            for (int i12 = c11 / 5; i12 < i11; i12++) {
                int i13 = (a11[i12] & 255) >> 3;
                iArr[i13] = iArr[i13] + 1;
            }
        }
        int a12 = a(iArr, true);
        byte[] b10 = c10.b();
        int i14 = (c11 + 31) / 32;
        int[] iArr2 = new int[i14 * a10];
        for (int i15 = 0; i15 < a10; i15++) {
            int i16 = i15 * c11;
            for (int i17 = 0; i17 < c11; i17++) {
                if ((b10[i16 + i17] & 255) < a12) {
                    int i18 = (i15 * i14) + (i17 >> 5);
                    iArr2[i18] = iArr2[i18] | (1 << (i17 & 31));
                }
            }
        }
        return new C0736y(c11, a10, i14, iArr2);
    }
}
