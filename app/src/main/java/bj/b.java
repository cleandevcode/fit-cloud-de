package bj;

import bi.r;
import gm.l;
import java.util.Locale;
import o5.a0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public final byte f4397a;

    /* renamed from: b */
    public final byte f4398b;

    /* renamed from: c */
    public final byte[] f4399c;

    public b(byte b10, byte b11, byte[] bArr) {
        this.f4397a = b10;
        this.f4398b = b11;
        this.f4399c = bArr;
    }

    public final String toString() {
        String h10;
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        objArr[0] = Byte.valueOf(this.f4397a);
        objArr[1] = Byte.valueOf(this.f4398b);
        byte[] bArr = this.f4399c;
        if (bArr == null) {
            h10 = "";
        } else {
            h10 = r.h(bArr);
            l.e(h10, "bytes2HexStr(keyData)");
        }
        objArr[2] = h10;
        return a0.a(objArr, 3, locale, "FcProtocolPacket(cmdId=%#x, keyId=%#x, keyData=[%s])", "format(locale, format, *args)");
    }
}
