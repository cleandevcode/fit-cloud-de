package hb;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final byte[][] f16073a;

    /* renamed from: b */
    public final int f16074b;

    /* renamed from: c */
    public final int f16075c;

    public b(int i10, int i11) {
        this.f16073a = (byte[][]) Array.newInstance(Byte.TYPE, i11, i10);
        this.f16074b = i10;
        this.f16075c = i11;
    }

    public final byte a(int i10, int i11) {
        return this.f16073a[i11][i10];
    }

    public final void b(int i10, int i11, int i12) {
        this.f16073a[i11][i10] = (byte) i12;
    }

    public final void c(int i10, int i11, boolean z10) {
        this.f16073a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f16074b * 2 * this.f16075c) + 2);
        for (int i10 = 0; i10 < this.f16075c; i10++) {
            byte[] bArr = this.f16073a[i10];
            for (int i11 = 0; i11 < this.f16074b; i11++) {
                byte b10 = bArr[i11];
                sb2.append(b10 != 0 ? b10 != 1 ? "  " : " 1" : " 0");
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
