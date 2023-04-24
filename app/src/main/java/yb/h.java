package yb;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public static final /* synthetic */ int f31309a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static String a(String str, byte[] bArr) {
        String str2;
        if (bArr != null && bArr.length != 0) {
            try {
                return p.b.d(b(bArr, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(p.b.r(str)))));
            } catch (NoSuchAlgorithmException unused) {
                str2 = "encrypt(): getInstance - No such algorithm,transformation";
                m2.f.h("hmsSdk", str2);
                return "";
            } catch (InvalidKeySpecException unused2) {
                str2 = "encrypt(): Invalid key specification";
                m2.f.h("hmsSdk", str2);
                return "";
            }
        }
        m2.f.h("hmsSdk", "encrypt: content is empty or null");
        return "";
    }

    public static byte[] b(byte[] bArr, PublicKey publicKey) {
        String str;
        try {
            if (publicKey != null) {
                Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-1ANDMGF1PADDING");
                cipher.init(1, publicKey);
                return cipher.doFinal(bArr);
            }
            throw new UnsupportedEncodingException("The loaded public key is null");
        } catch (UnsupportedEncodingException unused) {
            str = "rsaEncrypt(): getBytes - Unsupported coding format!";
            m2.f.h("hmsSdk", str);
            return new byte[0];
        } catch (InvalidKeyException unused2) {
            str = "rsaEncrypt(): init - Invalid key!";
            m2.f.h("hmsSdk", str);
            return new byte[0];
        } catch (NoSuchAlgorithmException unused3) {
            str = "rsaEncrypt(): getInstance - No such algorithm,transformation";
            m2.f.h("hmsSdk", str);
            return new byte[0];
        } catch (BadPaddingException unused4) {
            str = "rsaEncrypt():False filling parameters!";
            m2.f.h("hmsSdk", str);
            return new byte[0];
        } catch (IllegalBlockSizeException unused5) {
            str = "rsaEncrypt(): doFinal - The provided block is not filled with";
            m2.f.h("hmsSdk", str);
            return new byte[0];
        } catch (NoSuchPaddingException unused6) {
            str = "rsaEncrypt():  No such filling parameters ";
            m2.f.h("hmsSdk", str);
            return new byte[0];
        }
    }
}
