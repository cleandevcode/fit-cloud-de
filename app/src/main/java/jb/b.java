package jb;

import androidx.appcompat.widget.u0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final char[] f17564a = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            char[] cArr = f17564a;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }

    public static byte[] b(String str) {
        char[] charArray = str.toCharArray();
        if ((charArray.length & 1) == 0) {
            byte[] bArr = new byte[charArray.length >> 1];
            int i10 = 0;
            int i11 = 0;
            while (i10 < charArray.length) {
                int digit = Character.digit(charArray[i10], 16);
                if (digit != -1) {
                    int i12 = i10 + 1;
                    int digit2 = Character.digit(charArray[i12], 16);
                    if (digit2 != -1) {
                        i10 = i12 + 1;
                        bArr[i11] = (byte) (((digit << 4) | digit2) & 255);
                        i11++;
                    } else {
                        throw new IllegalArgumentException(u0.a("Illegal hexadecimal character at index ", i12));
                    }
                } else {
                    throw new IllegalArgumentException(u0.a("Illegal hexadecimal character at index ", i10));
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Odd number of characters.");
    }
}
