package rl;

import java.util.Arrays;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a */
    public final int f25793a = 0;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public int f25794a;

        /* renamed from: b */
        public byte[] f25795b;

        /* renamed from: c */
        public int f25796c;

        /* renamed from: d */
        public int f25797d;

        /* renamed from: e */
        public boolean f25798e;

        /* renamed from: f */
        public int f25799f;

        /* renamed from: g */
        public int f25800g;

        public final String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", a.class.getSimpleName(), Arrays.toString(this.f25795b), Integer.valueOf(this.f25799f), Boolean.valueOf(this.f25798e), Integer.valueOf(this.f25794a), 0L, Integer.valueOf(this.f25800g), Integer.valueOf(this.f25796c), Integer.valueOf(this.f25797d));
        }
    }

    public b(int i10) {
    }

    public static void a(byte[] bArr, int i10, a aVar) {
        if (aVar.f25795b != null) {
            int min = Math.min(aVar.f25796c - aVar.f25797d, i10);
            System.arraycopy(aVar.f25795b, aVar.f25797d, bArr, 0, min);
            int i11 = aVar.f25797d + min;
            aVar.f25797d = i11;
            if (i11 >= aVar.f25796c) {
                aVar.f25795b = null;
            }
        }
    }

    public static byte[] b(int i10, a aVar) {
        byte[] bArr = aVar.f25795b;
        if (bArr == null || bArr.length < aVar.f25796c + i10) {
            if (bArr == null) {
                aVar.f25795b = new byte[DfuBaseService.ERROR_REMOTE_MASK];
                aVar.f25796c = 0;
                aVar.f25797d = 0;
            } else {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                aVar.f25795b = bArr2;
            }
            return aVar.f25795b;
        }
        return bArr;
    }
}
