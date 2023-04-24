package com.huawei.hms.scankit.p;

import java.lang.reflect.Array;

/* renamed from: com.huawei.hms.scankit.p.yc */
/* loaded from: classes.dex */
public final class C0739yc {

    /* renamed from: a */
    private final zc[] f8120a;

    /* renamed from: b */
    private int f8121b;

    /* renamed from: c */
    private final int f8122c;

    /* renamed from: d */
    private final int f8123d;

    public C0739yc(int i10, int i11) {
        zc[] zcVarArr = new zc[i10];
        this.f8120a = zcVarArr;
        int length = zcVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f8120a[i12] = new zc(((i11 + 4) * 17) + 1);
        }
        this.f8123d = i11 * 17;
        this.f8122c = i10;
        this.f8121b = -1;
    }

    public zc a() {
        try {
            int i10 = this.f8121b;
            if (i10 >= 0) {
                zc[] zcVarArr = this.f8120a;
                if (i10 < zcVarArr.length) {
                    return zcVarArr[i10];
                }
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }

    public byte[][] a(int i10, int i11) {
        int i12 = this.f8122c * i11;
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, i12, this.f8123d * i10);
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f8120a[i13 / i11].a(i10);
        }
        return bArr;
    }

    public void b() {
        this.f8121b++;
    }
}
