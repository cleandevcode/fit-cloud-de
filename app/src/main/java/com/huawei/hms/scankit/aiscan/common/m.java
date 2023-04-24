package com.huawei.hms.scankit.aiscan.common;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a */
    private final int f7274a;

    /* renamed from: b */
    private final int f7275b;

    public m(int i10, int i11) {
        this.f7274a = i10;
        this.f7275b = i11;
    }

    public final int a() {
        return this.f7275b;
    }

    public abstract m a(int i10, int i11, int i12, int i13);

    public abstract byte[] a(int i10, byte[] bArr);

    public abstract m b(int i10, int i11, int i12, int i13);

    public abstract byte[] b();

    public final int c() {
        return this.f7274a;
    }

    public final String toString() {
        int i10 = this.f7274a;
        byte[] bArr = new byte[i10];
        StringBuilder sb2 = new StringBuilder((i10 + 1) * this.f7275b);
        for (int i11 = 0; i11 < this.f7275b; i11++) {
            bArr = a(i11, bArr);
            for (int i12 = 0; i12 < this.f7274a; i12++) {
                int i13 = bArr[i12] & 255;
                sb2.append(i13 < 64 ? '#' : i13 < 128 ? '+' : i13 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
