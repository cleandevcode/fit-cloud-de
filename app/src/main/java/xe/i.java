package xe;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import yb.y;

/* loaded from: classes.dex */
public final class i extends y {

    /* renamed from: c */
    public int f30516c;

    /* renamed from: d */
    public int f30517d;

    /* renamed from: e */
    public int f30518e;

    /* renamed from: f */
    public boolean f30519f;

    /* renamed from: g */
    public int f30520g;

    public i(boolean z10, int i10, int i11, int i12, int i13) {
        this.f30516c = i10;
        this.f30517d = i11;
        this.f30518e = i12;
        this.f30519f = z10;
        this.f30520g = i13;
    }

    public static i C(byte[] bArr, int i10, int i11) {
        byte b10;
        short s10;
        byte b11;
        short s11;
        boolean z10;
        short s12;
        if (bArr == null || bArr.length <= 2) {
            return null;
        }
        int length = bArr.length;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        wrap.get();
        byte b12 = wrap.get();
        if (i10 == 16) {
            b10 = wrap.get();
            s10 = wrap.getShort();
            if (i11 < 4 && length >= 7) {
                s12 = wrap.getShort();
                b11 = b10;
                s11 = s10;
                z10 = true;
                return new i(z10, b12, b11, s11, s12);
            }
        } else if (i10 == 20 || i10 == 21) {
            b10 = wrap.get();
            s10 = wrap.getShort();
        } else {
            b10 = 0;
            s10 = 0;
        }
        b11 = b10;
        s11 = s10;
        z10 = false;
        s12 = 0;
        return new i(z10, b12, b11, s11, s12);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("EnableBufferCheckEvent(0x%04X) {", Integer.valueOf(this.f30516c)));
        Locale locale = Locale.US;
        sb2.append(String.format(locale, "\n\tmode=0x%02X, maxBufferCheckSize=0x%08X(%d), bufferCheckMutSizeSupported=%b)", Integer.valueOf(this.f30517d), Integer.valueOf(this.f30518e), Integer.valueOf(this.f30518e), Boolean.valueOf(this.f30519f)));
        if (this.f30519f) {
            sb2.append(String.format(locale, "\n\tbufferCheckMutSize=0x%08X(%d)", Integer.valueOf(this.f30520g), Integer.valueOf(this.f30520g)));
        }
        sb2.append("\n}");
        return sb2.toString();
    }
}
