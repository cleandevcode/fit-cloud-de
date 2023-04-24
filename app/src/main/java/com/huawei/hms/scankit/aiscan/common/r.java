package com.huawei.hms.scankit.aiscan.common;

/* loaded from: classes.dex */
public final class r extends m {

    /* renamed from: c */
    private final byte[] f7301c;

    /* renamed from: d */
    private final int f7302d;

    /* renamed from: e */
    private final int f7303e;

    /* renamed from: f */
    private final int f7304f;

    /* renamed from: g */
    private final int f7305g;

    public r(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        super(i14, i15);
        if (i12 + i14 > i10 || i13 + i15 > i11) {
            try {
                throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
            } catch (Exception e10) {
                throw e10;
            }
        }
        this.f7301c = bArr;
        this.f7302d = i10;
        this.f7303e = i11;
        this.f7304f = i12;
        this.f7305g = i13;
        if (z10) {
            a(i14, i15);
        }
    }

    private void a(int i10, int i11) {
        byte[] bArr = this.f7301c;
        int i12 = (this.f7305g * this.f7302d) + this.f7304f;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = (i10 / 2) + i12;
            int i15 = (i12 + i10) - 1;
            int i16 = i12;
            while (i16 < i14) {
                if (com.huawei.hms.scankit.util.b.a(bArr, i16) && com.huawei.hms.scankit.util.b.a(bArr, i15)) {
                    byte b10 = bArr[i16];
                    bArr[i16] = bArr[i15];
                    bArr[i15] = b10;
                }
                i16++;
                i15--;
            }
            i13++;
            i12 += this.f7302d;
        }
    }

    @Override // com.huawei.hms.scankit.aiscan.common.m
    public m a(int i10, int i11, int i12, int i13) {
        return new r(this.f7301c, this.f7302d, this.f7303e, this.f7304f + i10, this.f7305g + i11, i12, i13, false);
    }

    @Override // com.huawei.hms.scankit.aiscan.common.m
    public byte[] a(int i10, byte[] bArr) {
        if (i10 < 0 || i10 >= a()) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Requested row is outside the image: ");
                sb2.append(i10);
                throw new IllegalArgumentException(sb2.toString());
            } catch (Exception e10) {
                throw e10;
            }
        }
        int c10 = c();
        if (bArr == null || bArr.length < c10) {
            bArr = new byte[c10];
        }
        System.arraycopy(this.f7301c, ((i10 + this.f7305g) * this.f7302d) + this.f7304f, bArr, 0, c10);
        return bArr;
    }

    @Override // com.huawei.hms.scankit.aiscan.common.m
    public m b(int i10, int i11, int i12, int i13) {
        int i14 = this.f7303e;
        int i15 = this.f7302d;
        if (i14 <= i15) {
            byte[] bArr = new byte[i10 * i11];
            System.arraycopy(this.f7301c, 0, bArr, i13 * i10, i14 * i15);
            int i16 = this.f7302d;
            return new r(bArr, i16, i11, this.f7304f, this.f7305g, i16, i11, false);
        }
        byte[] bArr2 = new byte[i10 * i11];
        for (int i17 = 0; i17 < this.f7303e; i17++) {
            byte[] bArr3 = this.f7301c;
            int i18 = this.f7302d;
            System.arraycopy(bArr3, i17 * i18, bArr2, (i17 * i10) + i12, i18);
        }
        return new r(bArr2, i10, i11, this.f7304f, this.f7305g, i10, i11, false);
    }

    @Override // com.huawei.hms.scankit.aiscan.common.m
    public byte[] b() {
        int c10 = c();
        int a10 = a();
        int i10 = this.f7302d;
        if (c10 == i10 && a10 == this.f7303e) {
            return this.f7301c;
        }
        int i11 = c10 * a10;
        byte[] bArr = new byte[i11];
        int i12 = (this.f7305g * i10) + this.f7304f;
        if (c10 == i10) {
            try {
                System.arraycopy(this.f7301c, i12, bArr, 0, i11);
                return bArr;
            } catch (ArrayIndexOutOfBoundsException | Exception unused) {
                return null;
            }
        }
        for (int i13 = 0; i13 < a10; i13++) {
            try {
                System.arraycopy(this.f7301c, i12, bArr, i13 * c10, c10);
                i12 += this.f7302d;
            } catch (ArrayIndexOutOfBoundsException | Exception unused2) {
                return null;
            }
        }
        return bArr;
    }
}
