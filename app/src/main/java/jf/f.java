package jf;

import androidx.fragment.app.a0;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f extends a0 {

    /* renamed from: a */
    public int f17653a;

    public f(int i10) {
        this.f17653a = i10;
    }

    @Override // androidx.fragment.app.a0
    public final byte[] h() {
        int i10 = this.f17653a;
        return new byte[]{(byte) (i10 & 255), (byte) ((i10 >> 8) & 255)};
    }

    @Override // androidx.fragment.app.a0
    public final short p() {
        return (short) 1545;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("GeTargetImageInfoReq(0x%04X) {", (short) 1545));
        return f3.a.a(Locale.US, "\n\timageId=0x%02X", new Object[]{Integer.valueOf(this.f17653a)}, sb2, "\n}");
    }
}
