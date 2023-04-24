package db;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final CharSequence f12966a;

    /* renamed from: b */
    public final int f12967b;

    /* renamed from: c */
    public final int f12968c;

    /* renamed from: d */
    public final byte[] f12969d;

    public b(String str, int i10, int i11) {
        this.f12966a = str;
        this.f12968c = i10;
        this.f12967b = i11;
        byte[] bArr = new byte[i10 * i11];
        this.f12969d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            int i14 = this.f12967b;
            i10 += i14;
            i11 += 4 - ((i14 + 4) % 8);
        }
        if (i11 < 0) {
            int i15 = this.f12968c;
            i11 += i15;
            i10 += 4 - ((i15 + 4) % 8);
        }
        this.f12969d[(i10 * this.f12968c) + i11] = (byte) ((this.f12966a.charAt(i12) & (1 << (8 - i13))) == 0 ? 0 : 1);
    }

    public final void b(int i10, int i11, int i12) {
        int i13 = i10 - 2;
        int i14 = i11 - 2;
        a(i13, i14, i12, 1);
        int i15 = i11 - 1;
        a(i13, i15, i12, 2);
        int i16 = i10 - 1;
        a(i16, i14, i12, 3);
        a(i16, i15, i12, 4);
        a(i16, i11, i12, 5);
        a(i10, i14, i12, 6);
        a(i10, i15, i12, 7);
        a(i10, i11, i12, 8);
    }
}
