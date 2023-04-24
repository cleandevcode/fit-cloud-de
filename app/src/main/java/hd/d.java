package hd;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public byte f16089a;

    public d(byte b10) {
        this.f16089a = b10;
    }

    public static d a(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            ge.b.n("invalid packet");
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return new d(wrap.get());
    }

    public final boolean b() {
        return this.f16089a == 0;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SetLlAptScenarioChooseTryRsp {");
        Locale locale = Locale.US;
        boolean z10 = true;
        Object[] objArr = new Object[1];
        if (this.f16089a != 0) {
            z10 = false;
        }
        objArr[0] = Boolean.valueOf(z10);
        return f3.a.a(locale, "\n\tsuccess=%b", objArr, a10, "\n}");
    }
}
