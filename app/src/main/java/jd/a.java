package jd;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public byte f17638a;

    /* renamed from: b */
    public byte[] f17639b;

    public a(byte b10, byte[] bArr) {
        this.f17638a = b10;
        this.f17639b = bArr;
    }

    public static a b(byte[] bArr) {
        byte[] d10;
        if (bArr != null && bArr.length >= 1) {
            int length = bArr.length;
            byte b10 = bArr[0];
            if (b10 == 0) {
                if (length < 2) {
                    return null;
                }
                int i10 = bArr[1] & 255;
                if (length < i10 + 2) {
                    return null;
                }
                d10 = new byte[i10];
                System.arraycopy(bArr, 2, d10, 0, i10);
            } else if (1 == b10) {
                if (length < 2) {
                    return null;
                }
                int i11 = bArr[1] & 255;
                if (length < i11 + 2) {
                    return null;
                }
                d10 = new byte[i11];
                System.arraycopy(bArr, 2, d10, 0, i11);
            } else if (2 == b10) {
                if (length < 2) {
                    return null;
                }
                int i12 = bArr[1] & 255;
                if (length < i12 + 2) {
                    return null;
                }
                d10 = new byte[i12];
                System.arraycopy(bArr, 2, d10, 0, i12);
            } else if (3 == b10) {
                if (length < 5) {
                    return null;
                }
                d10 = new byte[4];
                System.arraycopy(bArr, 1, d10, 0, 4);
            } else if (4 == b10) {
                if (length < 2) {
                    return null;
                }
                int i13 = length - 1;
                byte[] bArr2 = new byte[i13];
                System.arraycopy(bArr, 1, bArr2, 0, i13);
                d10 = d(bArr2);
            } else if (5 == b10) {
                if (length < 2) {
                    return null;
                }
                int i14 = length - 1;
                byte[] bArr3 = new byte[i14];
                System.arraycopy(bArr, 1, bArr3, 0, i14);
                d10 = d(bArr3);
            } else if (6 != b10 || length < 2) {
                return null;
            } else {
                int i15 = length - 1;
                byte[] bArr4 = new byte[i15];
                System.arraycopy(bArr, 1, bArr4, 0, i15);
                d10 = d(bArr4);
            }
            return new a(b10, d10);
        }
        return null;
    }

    public static byte[] d(byte[] bArr) {
        int length = bArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length && bArr[i11] != 0; i11++) {
            i10++;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    public final int a() {
        byte[] bArr;
        if (3 != this.f17638a || (bArr = this.f17639b) == null || bArr.length < 4) {
            return 0;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getShort();
    }

    public final String c() {
        byte[] bArr;
        return (4 != this.f17638a || (bArr = this.f17639b) == null || bArr.length <= 0) ? "" : new String(bArr, 0, bArr.length, StandardCharsets.UTF_8).trim();
    }

    public final String e() {
        byte[] bArr;
        return (2 != this.f17638a || (bArr = this.f17639b) == null || bArr.length <= 0) ? "" : new String(bArr, 0, bArr.length, StandardCharsets.UTF_8).trim();
    }

    public final String f() {
        byte[] bArr;
        return (5 != this.f17638a || (bArr = this.f17639b) == null || bArr.length <= 0) ? "" : new String(bArr, 0, bArr.length, StandardCharsets.UTF_8).trim();
    }

    public final String g() {
        byte[] bArr;
        return (this.f17638a != 0 || (bArr = this.f17639b) == null || bArr.length <= 0) ? "" : new String(bArr, 0, bArr.length, StandardCharsets.UTF_8).trim();
    }

    public final String h() {
        byte[] bArr;
        return (1 != this.f17638a || (bArr = this.f17639b) == null || bArr.length <= 0) ? "" : new String(bArr, 0, bArr.length, StandardCharsets.UTF_8).trim();
    }

    public final int i() {
        byte[] bArr = this.f17639b;
        if (bArr == null || bArr.length < 4) {
            return 0;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getShort(2);
    }

    public final String j() {
        byte[] bArr;
        return (6 != this.f17638a || (bArr = this.f17639b) == null || bArr.length <= 0) ? "" : new String(bArr, 0, bArr.length, StandardCharsets.UTF_8).trim();
    }

    public final String toString() {
        return String.format(Locale.US, "CfgSettingsInfo{ type=0x%04X, cfgData=%s }", Byte.valueOf(this.f17638a), he.a.a(this.f17639b));
    }
}
