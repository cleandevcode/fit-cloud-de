package xe;

import java.util.Locale;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    public byte[] f30531a;

    public n(byte[] bArr) {
        this.f30531a = bArr;
    }

    public final byte[] a() {
        byte[] bArr = new byte[17];
        bArr[0] = 1;
        byte[] bArr2 = this.f30531a;
        if (bArr2 != null && bArr2.length >= 16) {
            System.arraycopy(bArr2, 0, bArr, 1, 16);
        }
        return bArr;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("StartDfuCmd(0x%02X) {", (byte) 1));
        return f3.a.a(Locale.US, "\n\tparams=%s", new Object[]{he.a.a(this.f30531a)}, sb2, "\n}");
    }
}
