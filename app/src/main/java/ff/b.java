package ff;

import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public int f14254a;

    /* renamed from: b */
    public byte[] f14255b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f14256a;

        /* renamed from: b */
        public byte[] f14257b;

        /* renamed from: c */
        public byte[] f14258c;

        public a(int i10, byte[] bArr) {
            this.f14256a = i10;
            this.f14257b = bArr;
            byte[] bArr2 = new byte[34];
            this.f14258c = bArr2;
            bArr2[0] = (byte) (i10 & 255);
            bArr2[1] = (byte) ((i10 >> 8) & 255);
            if (bArr.length >= 32) {
                System.arraycopy(bArr, 0, bArr2, 2, 32);
            }
        }

        public final String toString() {
            return String.format("imageId=0x%04X, sha256=%s", Integer.valueOf(this.f14256a), he.a.a(this.f14257b));
        }
    }

    public b(int i10, byte[] bArr) {
        this.f14254a = i10;
        this.f14255b = bArr;
    }

    public final byte[] a() {
        byte[] bArr = this.f14255b;
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 2];
        int i10 = this.f14254a;
        bArr2[0] = (byte) (i10 & 255);
        bArr2[1] = (byte) (i10 >> 8);
        if (length > 0) {
            System.arraycopy(bArr, 0, bArr2, 2, length);
        }
        return bArr2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Locale locale = Locale.US;
        sb2.append(String.format(locale, "\n\tnumber=%d", Integer.valueOf(this.f14254a)));
        byte[] bArr = this.f14255b;
        if (bArr != null) {
            sb2.append(String.format(locale, "\n\tsha256=(%d)%s", Integer.valueOf(bArr.length), he.a.a(this.f14255b)));
        }
        return sb2.toString();
    }
}
