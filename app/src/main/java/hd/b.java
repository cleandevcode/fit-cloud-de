package hd;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public byte f16082a;

    /* renamed from: b */
    public byte f16083b;

    /* renamed from: c */
    public short f16084c;

    /* renamed from: d */
    public byte f16085d;

    /* renamed from: e */
    public short f16086e;

    /* renamed from: f */
    public boolean f16087f;

    public b(byte b10, byte b11, short s10, byte b12, short s11, boolean z10) {
        this.f16082a = b10;
        this.f16083b = b11;
        this.f16084c = s10;
        this.f16085d = b12;
        this.f16086e = s11;
        this.f16087f = z10;
    }

    public static b a(byte[] bArr) {
        if (bArr == null || bArr.length < 7) {
            ge.b.n("invalid packet");
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        boolean z10 = true;
        return new b(wrap.get(), wrap.get(), wrap.getShort(), wrap.get(), wrap.getShort(), (bArr.length < 8 || (wrap.get() & 1) != 1) ? false : false);
    }

    public final md.c b() {
        return new md.c(this.f16083b, this.f16085d, this.f16084c, this.f16086e, this.f16087f);
    }

    public final boolean c() {
        return this.f16082a == 0;
    }

    public final String toString() {
        return f3.a.a(Locale.US, "\n\tresult=0x%02X, L=(%d/%d), R=(%d/%d), rwsSyncEnabled=%b", new Object[]{Byte.valueOf(this.f16082a), Byte.valueOf(this.f16083b), Short.valueOf(this.f16084c), Byte.valueOf(this.f16085d), Short.valueOf(this.f16086e), Boolean.valueOf(this.f16087f)}, android.support.v4.media.d.a("SetLlAptBrightnessRsp {"), "\n}");
    }
}
