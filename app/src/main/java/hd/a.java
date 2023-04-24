package hd;

import java.util.Locale;
import yb.y;

/* loaded from: classes.dex */
public final class a extends y {

    /* renamed from: c */
    public byte f16081c;

    public a(byte b10) {
        this.f16081c = b10;
    }

    @Override // yb.y
    public final ed.b j() {
        byte[] bArr = {(byte) 34, (byte) 12};
        System.arraycopy(new byte[]{this.f16081c}, 0, bArr, 2, 1);
        return new ed.b(2, (short) 3106, (short) 3106, bArr);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("GetLlAptInfoReq(0x%04X) {", (short) 3106));
        return f3.a.a(Locale.US, "\n\tType=0x%02x", new Object[]{Byte.valueOf(this.f16081c)}, sb2, "\n}");
    }
}
