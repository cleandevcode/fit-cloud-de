package com.mob.tools.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.mob.commons.i;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.zip.CRC32;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.SecretKeySpec;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class Data implements PublicMemberKeeper {
    public static String AES128Decode(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return null;
        }
        return new String(AES128Decode(str.getBytes("UTF-8"), bArr), "UTF-8");
    }

    public static void AES128Decode(String str, InputStream inputStream, OutputStream outputStream) {
        if (str == null) {
            return;
        }
        AES128Decode(str.getBytes("UTF-8"), inputStream, outputStream);
    }

    public static void AES128Decode(byte[] bArr, InputStream inputStream, OutputStream outputStream) {
        if (bArr == null || inputStream == null || outputStream == null) {
            return;
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, i.a("003Aglifgj"));
        Cipher cipher = getCipher(i.a("003Iglifgj") + i.a("003i+ifii") + i.a("008?hlNiWijjliigjkjij") + i.a("006MfhVjj)fgfmhh"), i.a("002Thlii"));
        cipher.init(2, secretKeySpec);
        CipherInputStream cipherInputStream = new CipherInputStream(inputStream, cipher);
        byte[] bArr3 = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
        while (true) {
            int read = cipherInputStream.read(bArr3);
            if (read == -1) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr3, 0, read);
        }
    }

    public static byte[] AES128Decode(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, i.a("003-glifgj"));
        Cipher cipher = getCipher(i.a("003@glifgj") + i.a("003i5ifii") + i.a("0050hlKi ghgeij") + i.a("006Wfh$jj]fgfmhh"), i.a("002.hlii"));
        cipher.init(2, secretKeySpec);
        byte[] bArr4 = new byte[cipher.getOutputSize(bArr2.length)];
        cipher.doFinal(bArr4, cipher.update(bArr2, 0, bArr2.length, bArr4, 0));
        return bArr4;
    }

    public static byte[] AES128Encode(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        byte[] bytes = str.getBytes("UTF-8");
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 16));
        byte[] bytes2 = str2.getBytes("UTF-8");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, i.a("003Aglifgj"));
        Cipher cipher = getCipher(i.a("003Rglifgj") + i.a("003iNifii") + i.a("008IhlYiBijjliigjkjij") + i.a("006Gfh(jj5fgfmhh"), i.a("0022hlii"));
        cipher.init(1, secretKeySpec);
        byte[] bArr2 = new byte[cipher.getOutputSize(bytes2.length)];
        cipher.doFinal(bArr2, cipher.update(bytes2, 0, bytes2.length, bArr2, 0));
        return bArr2;
    }

    public static byte[] AES128Encode(byte[] bArr, String str) {
        if (bArr == null || str == null) {
            return null;
        }
        return AES128Encode(bArr, str.getBytes("UTF-8"));
    }

    public static byte[] AES128Encode(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, i.a("003>glifgj"));
        Cipher cipher = getCipher(i.a("003Fglifgj") + i.a("003iOifii") + i.a("008Chl>i(ijjliigjkjij") + i.a("006HfhTjj(fgfmhh"), i.a("002>hlii"));
        cipher.init(1, secretKeySpec);
        byte[] bArr3 = new byte[cipher.getOutputSize(bArr2.length)];
        cipher.doFinal(bArr3, cipher.update(bArr2, 0, bArr2.length, bArr3, 0));
        return bArr3;
    }

    @Deprecated
    public static String Base64AES(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        try {
            String encodeToString = Base64.encodeToString(AES128Encode(str2, str), 0);
            return (!TextUtils.isEmpty(encodeToString) && encodeToString.contains("\n")) ? encodeToString.replace("\n", "") : encodeToString;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static String CRC32(byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        long value = crc32.getValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 56)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 48)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 40)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 32)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 24)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 16)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 8)) & 255)));
        sb2.append(String.format("%02x", Integer.valueOf(((byte) value) & 255)));
        while (sb2.charAt(0) == '0') {
            sb2 = sb2.deleteCharAt(0);
        }
        return sb2.toString().toLowerCase();
    }

    public static String MD5(File file) {
        if (file != null && file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] rawMD5 = rawMD5(fileInputStream);
                fileInputStream.close();
                if (rawMD5 == null) {
                    return null;
                }
                return a(rawMD5);
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
            }
        }
        return null;
    }

    public static String MD5(String str) {
        byte[] rawMD5;
        if (str == null || (rawMD5 = rawMD5(str)) == null) {
            return null;
        }
        return a(rawMD5);
    }

    public static String MD5(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return MD5(bArr, 0, bArr.length);
    }

    public static String MD5(byte[] bArr, int i10, int i11) {
        byte[] rawMD5;
        if (bArr == null || (rawMD5 = rawMD5(bArr, i10, i11)) == null) {
            return null;
        }
        return a(rawMD5);
    }

    public static byte[] SHA1(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return SHA1(str.getBytes("utf-8"));
    }

    public static byte[] SHA1(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance(i.a("005Vgjjfgljkin"));
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    private static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(bArr[i10])));
        }
        return stringBuffer.toString();
    }

    public static String byteToHex(byte[] bArr) {
        return byteToHex(bArr, 0, bArr.length);
    }

    public static String byteToHex(byte[] bArr, int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        if (bArr == null) {
            return stringBuffer.toString();
        }
        while (i10 < i11) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(bArr[i10])));
            i10++;
        }
        return stringBuffer.toString();
    }

    public static Cipher getCipher(String str, String str2) {
        Cipher cipher = null;
        if (!TextUtils.isEmpty(str2)) {
            try {
                Provider provider = Security.getProvider(str2);
                if (provider != null) {
                    cipher = Cipher.getInstance(str, provider);
                }
            } catch (Throwable unused) {
            }
        }
        return cipher == null ? Cipher.getInstance(str, str2) : cipher;
    }

    public static byte[] rawMD5(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
            MessageDigest messageDigest = MessageDigest.getInstance(i.a("003?ikhkjg"));
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return messageDigest.digest();
                }
                messageDigest.update(bArr, 0, read);
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static byte[] rawMD5(String str) {
        if (str == null) {
            return null;
        }
        try {
            return rawMD5(str.getBytes("utf-8"));
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static byte[] rawMD5(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return rawMD5(bArr, 0, bArr.length);
    }

    public static byte[] rawMD5(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i10, i11);
            byte[] rawMD5 = rawMD5(byteArrayInputStream);
            byteArrayInputStream.close();
            return rawMD5;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static String urlEncode(String str) {
        try {
            return urlEncode(str, "utf-8");
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static String urlEncode(String str, String str2) {
        String encode = TextUtils.isEmpty(str) ? "" : URLEncoder.encode(str, str2);
        return TextUtils.isEmpty(encode) ? encode : encode.replace("+", "%20");
    }
}
