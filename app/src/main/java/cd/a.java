package cd;

import android.support.v4.media.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public byte f4609a;

    /* renamed from: b */
    public byte f4610b;

    public a(byte b10, byte b11) {
        this.f4609a = b10;
        this.f4610b = b11;
    }

    public static a a(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            ge.b.n("invalid packet");
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return new a(wrap.get(), wrap.get());
    }

    public final boolean b() {
        return this.f4610b == 1;
    }

    public final String toString() {
        return f3.a.a(Locale.US, "\n\tstatus=0x%02X, state=0x%02X", new Object[]{Byte.valueOf(this.f4609a), Byte.valueOf(this.f4610b)}, d.a("AptNrOnOffEvent {"), "\n}");
    }
}
