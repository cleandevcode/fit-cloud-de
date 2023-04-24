package com.sina.weibo.sdk.b;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: aj */
    private static final char[] f9499aj = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr = new char[32];
            int i10 = 0;
            for (int i11 = 0; i11 < 16; i11++) {
                byte b10 = digest[i11];
                int i12 = i10 + 1;
                char[] cArr2 = f9499aj;
                cArr[i10] = cArr2[(b10 >>> 4) & 15];
                i10 = i12 + 1;
                cArr[i12] = cArr2[b10 & 15];
            }
            return new String(cArr);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String f(String str) {
        try {
            return a(str.getBytes());
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
