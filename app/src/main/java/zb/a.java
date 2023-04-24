package zb;

import cc.b;
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
public final class a {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        String str;
        byte[] bArr3;
        StringBuilder sb2;
        String str2;
        byte[] a10 = b.a(16);
        if (bArr != null && bArr.length != 0 && bArr2.length >= 16 && a10.length >= 16) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, secretKeySpec, new IvParameterSpec(a10));
                bArr3 = cipher.doFinal(bArr);
            } catch (InvalidAlgorithmParameterException e10) {
                e = e10;
                sb2 = new StringBuilder();
                str2 = "InvalidAlgorithmParameterException: ";
                sb2.append(str2);
                sb2.append(e.getMessage());
                str = sb2.toString();
                o8.b.f("AesCbc", str);
                bArr3 = new byte[0];
                byte[] bArr4 = new byte[a10.length + bArr3.length];
                System.arraycopy(a10, 0, bArr4, 0, a10.length);
                System.arraycopy(bArr3, 0, bArr4, a10.length, bArr3.length);
                return bArr4;
            } catch (InvalidKeyException e11) {
                e = e11;
                sb2 = new StringBuilder();
                str2 = "InvalidKeyException: ";
                sb2.append(str2);
                sb2.append(e.getMessage());
                str = sb2.toString();
                o8.b.f("AesCbc", str);
                bArr3 = new byte[0];
                byte[] bArr42 = new byte[a10.length + bArr3.length];
                System.arraycopy(a10, 0, bArr42, 0, a10.length);
                System.arraycopy(bArr3, 0, bArr42, a10.length, bArr3.length);
                return bArr42;
            } catch (NoSuchAlgorithmException e12) {
                e = e12;
                sb2 = new StringBuilder();
                str2 = "NoSuchAlgorithmException: ";
                sb2.append(str2);
                sb2.append(e.getMessage());
                str = sb2.toString();
                o8.b.f("AesCbc", str);
                bArr3 = new byte[0];
                byte[] bArr422 = new byte[a10.length + bArr3.length];
                System.arraycopy(a10, 0, bArr422, 0, a10.length);
                System.arraycopy(bArr3, 0, bArr422, a10.length, bArr3.length);
                return bArr422;
            } catch (BadPaddingException e13) {
                e = e13;
                sb2 = new StringBuilder();
                str2 = "BadPaddingException: ";
                sb2.append(str2);
                sb2.append(e.getMessage());
                str = sb2.toString();
                o8.b.f("AesCbc", str);
                bArr3 = new byte[0];
                byte[] bArr4222 = new byte[a10.length + bArr3.length];
                System.arraycopy(a10, 0, bArr4222, 0, a10.length);
                System.arraycopy(bArr3, 0, bArr4222, a10.length, bArr3.length);
                return bArr4222;
            } catch (IllegalBlockSizeException e14) {
                e = e14;
                sb2 = new StringBuilder();
                str2 = "IllegalBlockSizeException: ";
                sb2.append(str2);
                sb2.append(e.getMessage());
                str = sb2.toString();
                o8.b.f("AesCbc", str);
                bArr3 = new byte[0];
                byte[] bArr42222 = new byte[a10.length + bArr3.length];
                System.arraycopy(a10, 0, bArr42222, 0, a10.length);
                System.arraycopy(bArr3, 0, bArr42222, a10.length, bArr3.length);
                return bArr42222;
            } catch (NoSuchPaddingException e15) {
                e = e15;
                sb2 = new StringBuilder();
                str2 = "NoSuchPaddingException: ";
                sb2.append(str2);
                sb2.append(e.getMessage());
                str = sb2.toString();
                o8.b.f("AesCbc", str);
                bArr3 = new byte[0];
                byte[] bArr422222 = new byte[a10.length + bArr3.length];
                System.arraycopy(a10, 0, bArr422222, 0, a10.length);
                System.arraycopy(bArr3, 0, bArr422222, a10.length, bArr3.length);
                return bArr422222;
            }
            byte[] bArr4222222 = new byte[a10.length + bArr3.length];
            System.arraycopy(a10, 0, bArr4222222, 0, a10.length);
            System.arraycopy(bArr3, 0, bArr4222222, a10.length, bArr3.length);
            return bArr4222222;
        }
        str = "cbc encrypt param is not right";
        o8.b.f("AesCbc", str);
        bArr3 = new byte[0];
        byte[] bArr42222222 = new byte[a10.length + bArr3.length];
        System.arraycopy(a10, 0, bArr42222222, 0, a10.length);
        System.arraycopy(bArr3, 0, bArr42222222, a10.length, bArr3.length);
        return bArr42222222;
    }
}
