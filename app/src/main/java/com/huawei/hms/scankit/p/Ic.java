package com.huawei.hms.scankit.p;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Ic {

    /* renamed from: a */
    private final byte[][] f7537a;

    /* renamed from: b */
    private final int f7538b;

    /* renamed from: c */
    private final int f7539c;

    public Ic(int i10, int i11) {
        this.f7537a = (byte[][]) Array.newInstance(Byte.TYPE, i11, i10);
        this.f7538b = i10;
        this.f7539c = i11;
    }

    public byte a(int i10, int i11) {
        try {
            if (com.huawei.hms.scankit.util.b.a(this.f7537a, i11) && com.huawei.hms.scankit.util.b.a(this.f7537a[i11], i10)) {
                return this.f7537a[i11][i10];
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }

    public void a(byte b10) {
        for (byte[] bArr : this.f7537a) {
            Arrays.fill(bArr, b10);
        }
    }

    public void a(int i10, int i11, int i12) {
        try {
            if (!com.huawei.hms.scankit.util.b.a(this.f7537a, i11) || !com.huawei.hms.scankit.util.b.a(this.f7537a[i11], i10)) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f7537a[i11][i10] = (byte) i12;
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }

    public void a(int i10, int i11, boolean z10) {
        try {
            if (!com.huawei.hms.scankit.util.b.a(this.f7537a, i11) || !com.huawei.hms.scankit.util.b.a(this.f7537a[i11], i10)) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f7537a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }

    public byte[][] a() {
        return this.f7537a;
    }

    public int b() {
        return this.f7539c;
    }

    public int c() {
        return this.f7538b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f7538b * 2 * this.f7539c) + 2);
        for (int i10 = 0; i10 < this.f7539c; i10++) {
            byte[] bArr = this.f7537a[i10];
            for (int i11 = 0; i11 < this.f7538b; i11++) {
                byte b10 = bArr[i11];
                sb2.append(b10 != 0 ? b10 != 1 ? "  " : " 1" : " 0");
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
