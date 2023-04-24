package rl;

import android.support.v4.media.d;
import no.nordicsemi.android.dfu.DfuBaseService;
import rl.b;

/* loaded from: classes2.dex */
public final class a extends b {

    /* renamed from: f */
    public static final byte[] f25786f = {13, 10};

    /* renamed from: g */
    public static final byte[] f25787g = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: h */
    public static final byte[] f25788h = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: b */
    public final byte[] f25789b;

    /* renamed from: c */
    public final byte[] f25790c;

    /* renamed from: d */
    public final int f25791d;

    /* renamed from: e */
    public final int f25792e;

    /* JADX WARN: Removed duplicated region for block: B:42:0x0024 A[LOOP:0: B:29:0x0008->B:42:0x0024, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(byte[] r9) {
        /*
            r8 = this;
            int r0 = r9.length
            r1 = 4
            r8.<init>(r0)
            int r0 = r9.length
            r2 = 0
            r3 = 0
        L8:
            r4 = 1
            if (r3 >= r0) goto L28
            r5 = r9[r3]
            r6 = 61
            if (r6 == r5) goto L27
            if (r5 < 0) goto L20
            byte[] r6 = rl.a.f25788h
            r7 = 123(0x7b, float:1.72E-43)
            if (r5 >= r7) goto L20
            r5 = r6[r5]
            r6 = -1
            if (r5 == r6) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = 0
        L21:
            if (r5 == 0) goto L24
            goto L27
        L24:
            int r3 = r3 + 1
            goto L8
        L27:
            r2 = 1
        L28:
            if (r2 != 0) goto L37
            r8.f25792e = r1
            r9 = 0
            r8.f25790c = r9
            int r1 = r1 - r4
            r8.f25791d = r1
            byte[] r9 = rl.a.f25787g
            r8.f25789b = r9
            return
        L37:
            java.nio.charset.Charset r0 = rk.a.f25785a
            java.lang.String r1 = new java.lang.String
            r1.<init>(r9, r0)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "lineSeparator must not contain base64 characters: ["
            java.lang.String r2 = "]"
            java.lang.String r0 = android.support.v4.media.a.a(r0, r1, r2)
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rl.a.<init>(byte[]):void");
    }

    public final void c(byte[] bArr, int i10, b.a aVar) {
        byte b10;
        if (aVar.f25798e) {
            return;
        }
        if (i10 < 0) {
            aVar.f25798e = true;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            byte[] b11 = b.b(this.f25791d, aVar);
            int i13 = i12 + 1;
            byte b12 = bArr[i12];
            if (b12 == 61) {
                aVar.f25798e = true;
                break;
            }
            if (b12 >= 0) {
                byte[] bArr2 = f25788h;
                if (b12 < 123 && (b10 = bArr2[b12]) >= 0) {
                    int i14 = (aVar.f25800g + 1) % 4;
                    aVar.f25800g = i14;
                    int i15 = (aVar.f25794a << 6) + b10;
                    aVar.f25794a = i15;
                    if (i14 == 0) {
                        int i16 = aVar.f25796c;
                        int i17 = i16 + 1;
                        b11[i16] = (byte) ((i15 >> 16) & 255);
                        int i18 = i17 + 1;
                        b11[i17] = (byte) ((i15 >> 8) & 255);
                        aVar.f25796c = i18 + 1;
                        b11[i18] = (byte) (i15 & 255);
                    }
                }
            }
            i11++;
            i12 = i13;
        }
        if (aVar.f25798e && aVar.f25800g != 0) {
            byte[] b13 = b.b(this.f25791d, aVar);
            int i19 = aVar.f25800g;
            if (i19 != 1) {
                if (i19 != 2) {
                    if (i19 == 3) {
                        int i20 = aVar.f25794a >> 2;
                        aVar.f25794a = i20;
                        int i21 = aVar.f25796c;
                        int i22 = i21 + 1;
                        b13[i21] = (byte) ((i20 >> 8) & 255);
                        aVar.f25796c = i22 + 1;
                        b13[i22] = (byte) (i20 & 255);
                        return;
                    }
                    StringBuilder a10 = d.a("Impossible modulus ");
                    a10.append(aVar.f25800g);
                    throw new IllegalStateException(a10.toString());
                }
                int i23 = aVar.f25794a >> 4;
                aVar.f25794a = i23;
                int i24 = aVar.f25796c;
                aVar.f25796c = i24 + 1;
                b13[i24] = (byte) (i23 & 255);
            }
        }
    }

    public final void d(byte[] bArr, int i10, b.a aVar) {
        if (aVar.f25798e) {
            return;
        }
        if (i10 < 0) {
            aVar.f25798e = true;
            if (aVar.f25800g == 0 && this.f25793a == 0) {
                return;
            }
            byte[] b10 = b.b(this.f25792e, aVar);
            int i11 = aVar.f25796c;
            int i12 = aVar.f25800g;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = i11 + 1;
                        byte[] bArr2 = this.f25789b;
                        int i14 = aVar.f25794a;
                        b10[i11] = bArr2[(i14 >> 10) & 63];
                        int i15 = i13 + 1;
                        b10[i13] = bArr2[(i14 >> 4) & 63];
                        int i16 = i15 + 1;
                        aVar.f25796c = i16;
                        b10[i15] = bArr2[(i14 << 2) & 63];
                        if (bArr2 == f25787g) {
                            aVar.f25796c = i16 + 1;
                            b10[i16] = 61;
                        }
                    } else {
                        StringBuilder a10 = d.a("Impossible modulus ");
                        a10.append(aVar.f25800g);
                        throw new IllegalStateException(a10.toString());
                    }
                } else {
                    int i17 = i11 + 1;
                    byte[] bArr3 = this.f25789b;
                    int i18 = aVar.f25794a;
                    b10[i11] = bArr3[(i18 >> 2) & 63];
                    int i19 = i17 + 1;
                    aVar.f25796c = i19;
                    b10[i17] = bArr3[(i18 << 4) & 63];
                    if (bArr3 == f25787g) {
                        int i20 = i19 + 1;
                        b10[i19] = 61;
                        aVar.f25796c = i20 + 1;
                        b10[i20] = 61;
                    }
                }
            }
            int i21 = aVar.f25799f;
            int i22 = aVar.f25796c;
            int i23 = (i22 - i11) + i21;
            aVar.f25799f = i23;
            if (this.f25793a > 0 && i23 > 0) {
                byte[] bArr4 = this.f25790c;
                System.arraycopy(bArr4, 0, b10, i22, bArr4.length);
                aVar.f25796c += this.f25790c.length;
                return;
            }
            return;
        }
        int i24 = 0;
        int i25 = 0;
        while (i24 < i10) {
            byte[] b11 = b.b(this.f25792e, aVar);
            int i26 = (aVar.f25800g + 1) % 3;
            aVar.f25800g = i26;
            int i27 = i25 + 1;
            int i28 = bArr[i25];
            if (i28 < 0) {
                i28 += DfuBaseService.ERROR_REMOTE_TYPE_LEGACY;
            }
            int i29 = (aVar.f25794a << 8) + i28;
            aVar.f25794a = i29;
            if (i26 == 0) {
                int i30 = aVar.f25796c;
                int i31 = i30 + 1;
                byte[] bArr5 = this.f25789b;
                b11[i30] = bArr5[(i29 >> 18) & 63];
                int i32 = i31 + 1;
                b11[i31] = bArr5[(i29 >> 12) & 63];
                int i33 = i32 + 1;
                b11[i32] = bArr5[(i29 >> 6) & 63];
                int i34 = i33 + 1;
                aVar.f25796c = i34;
                b11[i33] = bArr5[i29 & 63];
                int i35 = aVar.f25799f + 4;
                aVar.f25799f = i35;
                int i36 = this.f25793a;
                if (i36 > 0 && i36 <= i35) {
                    byte[] bArr6 = this.f25790c;
                    System.arraycopy(bArr6, 0, b11, i34, bArr6.length);
                    aVar.f25796c += this.f25790c.length;
                    aVar.f25799f = 0;
                }
            }
            i24++;
            i25 = i27;
        }
    }
}
