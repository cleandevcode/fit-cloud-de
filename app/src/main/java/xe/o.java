package xe;

import java.util.Locale;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    public int f30532a;

    /* renamed from: b */
    public int f30533b;

    /* renamed from: c */
    public int f30534c;

    /* renamed from: d */
    public byte f30535d;

    public o(int i10, int i11, int i12, byte b10) {
        this.f30532a = i10;
        this.f30533b = i11;
        this.f30534c = i12;
        this.f30535d = b10;
    }

    public final byte[] a() {
        int i10 = this.f30532a;
        if (i10 == 20 || i10 == 21) {
            int i11 = this.f30534c;
            return new byte[]{3, (byte) (i11 & 255), (byte) ((i11 >> 8) & 255), this.f30535d};
        } else if (this.f30533b >= 2) {
            int i12 = this.f30534c;
            return new byte[]{3, (byte) (i12 & 255), (byte) ((i12 >> 8) & 255), this.f30535d};
        } else {
            int i13 = this.f30534c;
            return new byte[]{3, (byte) (i13 & 255), (byte) ((i13 >> 8) & 255)};
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("ValidateFwImageCmd(0x%04X-0x%02X:0x%02X) {", Integer.valueOf(this.f30532a), Integer.valueOf(this.f30533b), (byte) 3));
        return f3.a.a(Locale.US, "\n\timageId=0x%04X, flag=0x%02X", new Object[]{Integer.valueOf(this.f30534c), Byte.valueOf(this.f30535d)}, sb2, "\n}");
    }
}
