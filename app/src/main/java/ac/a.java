package ac;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ConcurrentSkipListMap;
import p.b;
import sa.p;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a */
    public static final String[] f453a = {"SHA-256", "SHA-384", "SHA-512"};

    public static String b(String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty("SHA-256")) {
            String[] strArr = f453a;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= 3) {
                    break;
                } else if (strArr[i10].equals("SHA-256")) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                str2 = "algorithm is not safe or legal";
            } else {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(str.getBytes("UTF-8"));
                    return b.d(messageDigest.digest());
                } catch (UnsupportedEncodingException unused) {
                    str2 = "Error in generate SHA UnsupportedEncodingException";
                } catch (NoSuchAlgorithmException unused2) {
                    str2 = "Error in generate SHA NoSuchAlgorithmException";
                }
            }
        } else {
            str2 = "content or algorithm is null.";
        }
        o8.b.f("SHA", str2);
        return "";
    }

    @Override // sa.p
    public Object a() {
        return new ConcurrentSkipListMap();
    }
}
