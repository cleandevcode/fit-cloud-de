package jf;

import androidx.fragment.app.a0;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c extends a0 {

    /* renamed from: a */
    public int f17648a;

    /* renamed from: b */
    public byte[] f17649b;

    public c(int i10, byte[] bArr) {
        this.f17648a = i10;
        this.f17649b = bArr;
    }

    @Override // androidx.fragment.app.a0
    public final byte[] h() {
        byte[] bArr = this.f17649b;
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 2];
        int i10 = this.f17648a;
        bArr2[0] = (byte) (i10 & 255);
        bArr2[1] = (byte) (i10 >> 8);
        if (length > 0) {
            System.arraycopy(bArr, 0, bArr2, 2, length);
        }
        return bArr2;
    }

    @Override // androidx.fragment.app.a0
    public final short p() {
        return (short) 1555;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("CheckPubKeyHashReq(0x%04X) {", (short) 1555));
        return f3.a.a(Locale.US, "\n\tnumber=%d, keys=%s", new Object[]{Integer.valueOf(this.f17648a), he.a.a(this.f17649b)}, sb2, "\n}");
    }
}
