package cc;

import android.os.Build;
import android.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class b {
    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        try {
            (Build.VERSION.SDK_INT >= 26 ? SecureRandom.getInstanceStrong() : SecureRandom.getInstance("SHA1PRNG")).nextBytes(bArr);
            return bArr;
        } catch (NoSuchAlgorithmException unused) {
            Log.e("EncryptUtil", "getSecureRandomBytes: NoSuchAlgorithmException");
            return new byte[0];
        }
    }

    public static String b(int i10) {
        return p.b.d(a(i10));
    }
}
