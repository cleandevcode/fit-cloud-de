package jf;

import androidx.fragment.app.a0;
import java.util.Locale;

/* loaded from: classes.dex */
public final class n extends a0 {

    /* renamed from: a */
    public byte[] f17660a;

    /* renamed from: b */
    public byte f17661b;

    public n(byte[] bArr, byte b10) {
        this.f17660a = bArr;
        this.f17661b = b10;
    }

    @Override // androidx.fragment.app.a0
    public final byte[] h() {
        byte[] bArr = new byte[16];
        byte[] bArr2 = this.f17660a;
        if (bArr2 != null && bArr2.length >= 12) {
            System.arraycopy(bArr2, 0, bArr, 0, 12);
        }
        bArr[12] = this.f17661b;
        return bArr;
    }

    @Override // androidx.fragment.app.a0
    public final short p() {
        return (short) 1538;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("StartDfuReq(0x%04X) {", (short) 1538));
        return f3.a.a(Locale.US, "\n\tmode=0x%02X, imageHeader=%s", new Object[]{Byte.valueOf(this.f17661b), he.a.a(this.f17660a)}, sb2, "\n}");
    }
}
