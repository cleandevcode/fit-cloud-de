package com.huawei.hms.scankit.p;

/* loaded from: classes.dex */
final class zc {

    /* renamed from: a */
    private final byte[] f8140a;

    /* renamed from: b */
    private int f8141b = 0;

    public zc(int i10) {
        this.f8140a = new byte[i10];
    }

    private void a(int i10, boolean z10) {
        try {
            if (!com.huawei.hms.scankit.util.b.a(this.f8140a, i10)) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f8140a[i10] = z10 ? (byte) 1 : (byte) 0;
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }

    public void a(boolean z10, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f8141b;
            this.f8141b = i12 + 1;
            a(i12, z10);
        }
    }

    public byte[] a(int i10) {
        int length = this.f8140a.length * i10;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = this.f8140a[i11 / i10];
        }
        return bArr;
    }
}
