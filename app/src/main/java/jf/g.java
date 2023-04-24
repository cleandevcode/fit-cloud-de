package jf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public byte f17654a;

    /* renamed from: b */
    public int f17655b;

    /* renamed from: c */
    public int f17656c;

    /* renamed from: d */
    public int f17657d;

    public g(byte b10, int i10, int i11, int i12) {
        this.f17654a = b10;
        this.f17655b = i10;
        this.f17656c = i11;
        this.f17657d = i12;
    }

    public static g a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = bArr.length;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return new g(bArr[0], length >= 5 ? wrap.getInt(1) : 0, length >= 9 ? wrap.getInt(5) : 0, length >= 11 ? wrap.getShort(9) : (short) 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("GeTargetImageInfoRsp(0x%04X) {", (short) 1543));
        return f3.a.a(Locale.US, "\n\tstatus=0x%02X,imageVersion=0x%08X, updateOffset=0x%08X(%d),bufferCheckOffset=0x%08X(%d)", new Object[]{Byte.valueOf(this.f17654a), Integer.valueOf(this.f17655b), Integer.valueOf(this.f17656c), Integer.valueOf(this.f17656c), Integer.valueOf(this.f17657d), Integer.valueOf(this.f17657d)}, sb2, "\n}");
    }
}
