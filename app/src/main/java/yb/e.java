package yb;

import android.util.Pair;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final Charset f31288a = Charset.forName("UTF-8");

    public static String a(String str, String str2) {
        Pair pair;
        String str3;
        byte[] bArr;
        StringBuilder sb2;
        String str4;
        if (str != null && str.length() >= 32) {
            String substring = str.substring(0, 32);
            pair = new Pair(p.b.r(substring), str.substring(32));
        } else {
            pair = new Pair(new byte[0], str);
        }
        byte[] r10 = p.b.r((String) pair.second);
        byte[] r11 = p.b.r(str2);
        byte[] bArr2 = (byte[]) pair.first;
        if (r10.length != 0 && r11.length >= 16 && bArr2 != null && bArr2.length >= 16) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(r11, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArr = cipher.doFinal(r10);
            } catch (InvalidAlgorithmParameterException e10) {
                e = e10;
                sb2 = new StringBuilder();
                str4 = "InvalidAlgorithmParameterException: ";
                sb2.append(str4);
                sb2.append(e.getMessage());
                str3 = sb2.toString();
                o8.b.f("AesCbc", str3);
                bArr = new byte[0];
                return new String(bArr, f31288a);
            } catch (InvalidKeyException e11) {
                e = e11;
                sb2 = new StringBuilder();
                str4 = "InvalidKeyException: ";
                sb2.append(str4);
                sb2.append(e.getMessage());
                str3 = sb2.toString();
                o8.b.f("AesCbc", str3);
                bArr = new byte[0];
                return new String(bArr, f31288a);
            } catch (NoSuchAlgorithmException e12) {
                e = e12;
                sb2 = new StringBuilder();
                str4 = "NoSuchAlgorithmException: ";
                sb2.append(str4);
                sb2.append(e.getMessage());
                str3 = sb2.toString();
                o8.b.f("AesCbc", str3);
                bArr = new byte[0];
                return new String(bArr, f31288a);
            } catch (BadPaddingException e13) {
                e = e13;
                sb2 = new StringBuilder();
                str4 = "BadPaddingException: ";
                sb2.append(str4);
                sb2.append(e.getMessage());
                str3 = sb2.toString();
                o8.b.f("AesCbc", str3);
                bArr = new byte[0];
                return new String(bArr, f31288a);
            } catch (IllegalBlockSizeException e14) {
                e = e14;
                sb2 = new StringBuilder();
                str4 = "IllegalBlockSizeException: ";
                sb2.append(str4);
                sb2.append(e.getMessage());
                str3 = sb2.toString();
                o8.b.f("AesCbc", str3);
                bArr = new byte[0];
                return new String(bArr, f31288a);
            } catch (NoSuchPaddingException e15) {
                e = e15;
                sb2 = new StringBuilder();
                str4 = "NoSuchPaddingException: ";
                sb2.append(str4);
                sb2.append(e.getMessage());
                str3 = sb2.toString();
                o8.b.f("AesCbc", str3);
                bArr = new byte[0];
                return new String(bArr, f31288a);
            }
            return new String(bArr, f31288a);
        }
        str3 = "cbc decrypt param is not right";
        o8.b.f("AesCbc", str3);
        bArr = new byte[0];
        return new String(bArr, f31288a);
    }
}
