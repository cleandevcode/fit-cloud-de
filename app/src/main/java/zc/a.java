package zc;

import android.support.v4.media.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public byte f32200a;

    public a(byte b10) {
        this.f32200a = b10;
    }

    public static a a(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            ge.b.n("invalid packet");
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return new a(wrap.get());
    }

    public final boolean b() {
        return this.f32200a == 0;
    }

    public final String toString() {
        StringBuilder a10 = d.a("SetAncScenarioChooseResultRsp {");
        Locale locale = Locale.US;
        boolean z10 = true;
        Object[] objArr = new Object[1];
        if (this.f32200a != 0) {
            z10 = false;
        }
        objArr[0] = Boolean.valueOf(z10);
        return f3.a.a(locale, "\n\tresult=%b", objArr, a10, "\n}");
    }
}
