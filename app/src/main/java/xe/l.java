package xe;

import java.util.Locale;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    public int f30528a;

    /* renamed from: b */
    public int f30529b;

    public l(int i10, int i11) {
        this.f30528a = i10;
        this.f30529b = i11;
    }

    public final byte[] a() {
        int i10 = this.f30528a;
        int i11 = this.f30529b;
        return new byte[]{2, (byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) (i11 & 255), (byte) ((i11 >> 8) & 255), (byte) ((i11 >> 16) & 255), (byte) ((i11 >> 24) & 255)};
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("ValidateFwImageCmd(0x%02X) {", (byte) 2));
        return f3.a.a(Locale.US, "\n\timageId=0x%04X, offset=0x%08X(%d)", new Object[]{Integer.valueOf(this.f30528a), Integer.valueOf(this.f30529b), Integer.valueOf(this.f30529b)}, sb2, "\n}");
    }
}
