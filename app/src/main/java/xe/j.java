package xe;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import yb.y;

/* loaded from: classes.dex */
public final class j extends y {

    /* renamed from: c */
    public int f30521c;

    /* renamed from: d */
    public int f30522d;

    /* renamed from: e */
    public byte f30523e;

    /* renamed from: f */
    public byte[] f30524f;

    public j(byte b10, int i10, int i11, byte[] bArr) {
        this.f30521c = i10;
        this.f30522d = i11;
        this.f30523e = b10;
        this.f30524f = bArr;
    }

    public static j C(byte[] bArr) {
        byte[] bArr2 = null;
        if (bArr == null || bArr.length < 2) {
            return null;
        }
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        byte b10 = bArr[0];
        byte b11 = bArr[1];
        byte b12 = bArr[2];
        int length = bArr.length - 3;
        if (length > 0) {
            bArr2 = new byte[length];
            System.arraycopy(bArr, 3, bArr2, 0, length);
        }
        return new j(b12, b10, b11, bArr2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("GattDfuNormalRsp(0x%04X, 0x%04X) {", Integer.valueOf(this.f30521c), Integer.valueOf(this.f30522d)));
        return f3.a.a(Locale.US, "\n\tstatus=0x%02X, params=%s", new Object[]{Byte.valueOf(this.f30523e), he.a.a(this.f30524f)}, sb2, "\n}");
    }
}
