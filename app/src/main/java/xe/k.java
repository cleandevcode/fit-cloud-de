package xe;

import java.util.Locale;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public int f30525a;

    /* renamed from: b */
    public int f30526b;

    /* renamed from: c */
    public int f30527c;

    public k(int i10, int i11, int i12) {
        this.f30525a = i10;
        this.f30526b = i11;
        this.f30527c = i12;
    }

    public final byte[] a() {
        int i10 = this.f30525a;
        return new byte[]{18, (byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) (this.f30526b & 255), (byte) (this.f30527c & 255)};
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("ReportImageNumberCmd(0x%02X) {", (byte) 18));
        return f3.a.a(Locale.US, "\n\t%d/%d imageId=0x%04X", new Object[]{Integer.valueOf(this.f30526b), Integer.valueOf(this.f30527c), Integer.valueOf(this.f30525a)}, sb2, "\n}");
    }
}
