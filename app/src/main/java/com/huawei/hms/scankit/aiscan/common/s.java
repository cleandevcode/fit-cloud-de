package com.huawei.hms.scankit.aiscan.common;

import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class s extends m {

    /* renamed from: c */
    private final byte[] f7306c;

    /* renamed from: d */
    private final int f7307d;

    /* renamed from: e */
    private final int f7308e;

    /* renamed from: f */
    private final int f7309f;

    /* renamed from: g */
    private final int f7310g;

    public s(int i10, int i11, int[] iArr) {
        super(i10, i11);
        this.f7307d = i10;
        this.f7308e = i11;
        this.f7309f = 0;
        this.f7310g = 0;
        int i12 = i10 * i11;
        this.f7306c = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = iArr[i13];
            if (((-16777216) & i14) == 0) {
                i14 = -1;
            }
            int i15 = ((i14 >> 8) & 255) * 601;
            this.f7306c[i13] = (byte) (((((i14 & 255) * 117) + (i15 + (((i14 >> 16) & 255) * 306))) + DfuBaseService.ERROR_REMOTE_TYPE_SECURE) >> 10);
        }
    }

    private s(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15) {
        super(i14, i15);
        if (i14 + i12 > i10 || i15 + i13 > i11) {
            try {
                throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
            } catch (Exception e10) {
                throw e10;
            }
        }
        this.f7306c = bArr;
        this.f7307d = i10;
        this.f7308e = i11;
        this.f7309f = i12;
        this.f7310g = i13;
    }

    @Override // com.huawei.hms.scankit.aiscan.common.m
    public m a(int i10, int i11, int i12, int i13) {
        return new s(this.f7306c, this.f7307d, this.f7308e, this.f7309f + i10, this.f7310g + i11, i12, i13);
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
        System.arraycopy(this.f7306c, ((i10 + this.f7310g) * this.f7307d) + this.f7309f, bArr, 0, c10);
        return bArr;
    }

    @Override // com.huawei.hms.scankit.aiscan.common.m
    public m b(int i10, int i11, int i12, int i13) {
        int i14 = this.f7308e;
        int i15 = this.f7307d;
        if (i14 <= i15) {
            byte[] bArr = new byte[i10 * i11];
            System.arraycopy(this.f7306c, 0, bArr, i13 * i10, i14 * i15);
            int i16 = this.f7307d;
            return new r(bArr, i16, i11, this.f7309f, this.f7310g, i16, i11, false);
        }
        byte[] bArr2 = new byte[i10 * i11];
        for (int i17 = 0; i17 < this.f7308e; i17++) {
            byte[] bArr3 = this.f7306c;
            int i18 = this.f7307d;
            System.arraycopy(bArr3, i17 * i18, bArr2, (i17 * i10) + i12, i18);
        }
        return new r(bArr2, i10, i11, this.f7309f, this.f7310g, i10, i11, false);
    }

    @Override // com.huawei.hms.scankit.aiscan.common.m
    public byte[] b() {
        int c10 = c();
        int a10 = a();
        int i10 = this.f7307d;
        if (c10 == i10 && a10 == this.f7308e) {
            return this.f7306c;
        }
        int i11 = c10 * a10;
        byte[] bArr = new byte[i11];
        int i12 = (this.f7310g * i10) + this.f7309f;
        if (c10 == i10) {
            System.arraycopy(this.f7306c, i12, bArr, 0, i11);
            return bArr;
        }
        for (int i13 = 0; i13 < a10; i13++) {
            System.arraycopy(this.f7306c, i12, bArr, i13 * c10, c10);
            i12 += this.f7307d;
        }
        return bArr;
    }
}
