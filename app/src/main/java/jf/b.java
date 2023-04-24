package jf;

import androidx.fragment.app.a0;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b extends a0 {

    /* renamed from: a */
    public int f17646a;

    /* renamed from: b */
    public int f17647b;

    public b(int i10, int i11) {
        this.f17646a = i10;
        this.f17647b = i11;
    }

    @Override // androidx.fragment.app.a0
    public final byte[] h() {
        int i10 = this.f17646a;
        int i11 = this.f17647b;
        return new byte[]{(byte) (i10 & 255), (byte) (i10 >> 8), (byte) (i11 & 255), (byte) ((i11 >> 8) & 255)};
    }

    @Override // androidx.fragment.app.a0
    public final short p() {
        return (short) 1544;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("BufferCheckReq(0x%04X) {", (short) 1544));
        return f3.a.a(Locale.US, "\n\tbufferSize=%d, crc16=0x%02X", new Object[]{Integer.valueOf(this.f17646a), Integer.valueOf(this.f17647b)}, sb2, "\n}");
    }
}
