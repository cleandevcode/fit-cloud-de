package rn;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public static final /* synthetic */ int f25866a = 0;

    static {
        "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    }

    public static final long a(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        long j10 = 0;
        while (i11 > 0) {
            i11--;
            int i13 = i10 + 1;
            byte b10 = bArr[i10];
            long j11 = b10 == 47 ? 1L : 0L;
            if (b10 >= 48 && b10 <= 57) {
                j11 = (b10 + 2) - 48;
            }
            if (b10 >= 65 && b10 <= 90) {
                j11 = (b10 + 12) - 65;
            }
            if (b10 >= 97 && b10 <= 122) {
                j11 = (b10 + 38) - 97;
            }
            j10 += j11 << i12;
            i12 += 6;
            i10 = i13;
        }
        return j10;
    }
}
