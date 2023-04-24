package bj;

import a0.m;
import cn.sharesdk.framework.Platform;
import p000do.a;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a */
    public boolean f4406a;

    /* renamed from: b */
    public int f4407b;

    /* renamed from: c */
    public int f4408c;

    /* renamed from: d */
    public int f4409d;

    /* renamed from: e */
    public final byte[] f4410e = new byte[504];

    /* renamed from: f */
    public int f4411f;

    public static c a(byte[] bArr) {
        if (bArr.length != 8) {
            return null;
        }
        if (bArr[0] != -85) {
            return null;
        }
        byte b10 = bArr[1];
        if ((b10 == 16 || b10 == 48) && bArr[2] == 0 && bArr[3] == 0 && bArr[4] == 0 && bArr[5] == 0) {
            return new c(((bArr[7] & 255) | (bArr[6] << 8)) & Platform.CUSTOMER_ACTION_MASK, (b10 & 32) != 0);
        }
        return null;
    }

    public static byte[] b(int i10, boolean z10, boolean z11, byte[] bArr) {
        int i11;
        int i12;
        int i13;
        if (bArr != null) {
            i12 = 0;
            for (byte b10 : bArr) {
                i12 = (i12 >> 8) ^ m.f121a[(b10 ^ i12) & 255];
            }
        } else {
            i11 = 0;
            i12 = 0;
        }
        byte[] bArr2 = new byte[8];
        byte[] bArr3 = new byte[i11 + 8];
        bArr2[0] = -85;
        if (z11) {
            if (z10) {
                i13 = 48;
            } else {
                i13 = 16;
            }
        } else {
            i13 = 0;
        }
        bArr2[1] = (byte) (i13 | 0);
        bArr2[2] = (byte) ((i11 >> 8) & 255);
        bArr2[3] = (byte) (i11 & 255);
        bArr2[4] = (byte) ((i12 >> 8) & 255);
        bArr2[5] = (byte) (i12 & 255);
        bArr2[6] = (byte) ((i10 >> 8) & 255);
        bArr2[7] = (byte) (i10 & 255);
        System.arraycopy(bArr2, 0, bArr3, 0, 8);
        if (i11 > 0) {
            System.arraycopy(bArr, 0, bArr3, 8, i11);
        }
        return bArr3;
    }

    public final int c(byte[] bArr) {
        int i10 = this.f4411f;
        int length = bArr.length + i10;
        boolean z10 = false;
        if (length <= 504 && length <= this.f4407b) {
            System.arraycopy(bArr, 0, this.f4410e, i10, bArr.length);
            this.f4411f = length;
            if (length != this.f4407b) {
                return 0;
            }
            this.f4406a = false;
            byte[] d10 = d();
            int i11 = this.f4408c;
            int i12 = 0;
            for (byte b10 : d10) {
                i12 = (i12 >> 8) ^ m.f121a[(b10 ^ i12) & 255];
            }
            if (i12 == i11) {
                z10 = true;
            }
            if (!z10) {
                return 2;
            }
            return 1;
        }
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#TransportPacket");
        bVar.p("parseData error:length", new Object[0]);
        this.f4406a = false;
        return 2;
    }

    public final byte[] d() {
        int i10 = this.f4411f;
        int i11 = this.f4407b;
        if (i10 != i11) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#TransportPacket");
            bVar.p("getRealPayload error:not integrated", new Object[0]);
            return null;
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f4410e, 0, bArr, 0, i11);
        return bArr;
    }

    public final int e(byte[] bArr) {
        boolean z10;
        if (!this.f4406a) {
            if (bArr.length < 8) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("Fc#TransportPacket");
                bVar.p("parseHeader error:length", new Object[0]);
                return 0;
            } else if (bArr[0] != -85) {
                a.b bVar2 = p000do.a.f13275a;
                bVar2.t("Fc#TransportPacket");
                bVar2.p("parseHeader error:magic", new Object[0]);
                return 0;
            } else {
                if ((bArr[1] & 16) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f4407b = ((bArr[2] << 8) | (bArr[3] & 255)) & Platform.CUSTOMER_ACTION_MASK;
                this.f4408c = ((bArr[4] << 8) | (bArr[5] & 255)) & Platform.CUSTOMER_ACTION_MASK;
                this.f4409d = ((bArr[6] << 8) | (bArr[7] & 255)) & Platform.CUSTOMER_ACTION_MASK;
                this.f4411f = 0;
                if (!z10) {
                    this.f4406a = true;
                    int length = bArr.length - 8;
                    if (length <= 0) {
                        return 0;
                    }
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, 8, bArr2, 0, length);
                    return c(bArr2);
                }
                throw new IllegalArgumentException("parseHeader error:isAck");
            }
        }
        return c(bArr);
    }
}
