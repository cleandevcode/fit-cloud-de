package bc;

import android.annotation.NonNull;
import android.os.Build;
import android.support.v4.media.d;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import no.nordicsemi.android.dfu.DfuBaseService;
import o8.b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static HashMap f4137a = new HashMap();

    /* JADX WARN: Type inference failed for: r3v13, types: [android.security.keystore.KeyGenParameterSpec$Builder] */
    public static SecretKey a(String str) {
        String str2;
        StringBuilder sb2;
        String message;
        SecretKey secretKey = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f4137a.get(str) == null) {
            synchronized (a.class) {
                Log.i("SecurityComp10105306: AesGcmKS", "load key");
                try {
                    try {
                        try {
                            try {
                                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                                keyStore.load(null);
                                Key key = keyStore.getKey(str, null);
                                if (key instanceof SecretKey) {
                                    secretKey = (SecretKey) key;
                                } else {
                                    Log.i("SecurityComp10105306: AesGcmKS", "generate key");
                                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                                    keyGenerator.init(new Object(str, 3) { // from class: android.security.keystore.KeyGenParameterSpec$Builder
                                        static {
                                            throw new NoClassDefFoundError();
                                        }

                                        @NonNull
                                        public native /* synthetic */ KeyGenParameterSpec build();

                                        @NonNull
                                        public native /* synthetic */ KeyGenParameterSpec$Builder setBlockModes(String... strArr);

                                        @NonNull
                                        public native /* synthetic */ KeyGenParameterSpec$Builder setEncryptionPaddings(String... strArr);

                                        @NonNull
                                        public native /* synthetic */ KeyGenParameterSpec$Builder setKeySize(int i10);
                                    }.setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(DfuBaseService.ERROR_REMOTE_TYPE_LEGACY).build());
                                    secretKey = keyGenerator.generateKey();
                                }
                            } catch (IOException e10) {
                                str2 = "AesGcmKS";
                                sb2 = new StringBuilder();
                                sb2.append("IOException : ");
                                message = e10.getMessage();
                                sb2.append(message);
                                b.f(str2, sb2.toString());
                                f4137a.put(str, secretKey);
                                return (SecretKey) f4137a.get(str);
                            } catch (UnrecoverableKeyException e11) {
                                str2 = "AesGcmKS";
                                sb2 = new StringBuilder();
                                sb2.append("UnrecoverableKeyException : ");
                                message = e11.getMessage();
                                sb2.append(message);
                                b.f(str2, sb2.toString());
                                f4137a.put(str, secretKey);
                                return (SecretKey) f4137a.get(str);
                            }
                        } catch (KeyStoreException e12) {
                            str2 = "AesGcmKS";
                            sb2 = new StringBuilder();
                            sb2.append("KeyStoreException : ");
                            message = e12.getMessage();
                            sb2.append(message);
                            b.f(str2, sb2.toString());
                            f4137a.put(str, secretKey);
                            return (SecretKey) f4137a.get(str);
                        } catch (NoSuchAlgorithmException e13) {
                            str2 = "AesGcmKS";
                            sb2 = new StringBuilder();
                            sb2.append("NoSuchAlgorithmException : ");
                            message = e13.getMessage();
                            sb2.append(message);
                            b.f(str2, sb2.toString());
                            f4137a.put(str, secretKey);
                            return (SecretKey) f4137a.get(str);
                        }
                    } catch (CertificateException e14) {
                        str2 = "AesGcmKS";
                        sb2 = new StringBuilder();
                        sb2.append("CertificateException : ");
                        message = e14.getMessage();
                        sb2.append(message);
                        b.f(str2, sb2.toString());
                        f4137a.put(str, secretKey);
                        return (SecretKey) f4137a.get(str);
                    } catch (Exception e15) {
                        str2 = "AesGcmKS";
                        sb2 = new StringBuilder();
                        sb2.append("Exception: ");
                        message = e15.getMessage();
                        sb2.append(message);
                        b.f(str2, sb2.toString());
                        f4137a.put(str, secretKey);
                        return (SecretKey) f4137a.get(str);
                    }
                } catch (InvalidAlgorithmParameterException e16) {
                    str2 = "AesGcmKS";
                    sb2 = new StringBuilder();
                    sb2.append("InvalidAlgorithmParameterException : ");
                    message = e16.getMessage();
                    sb2.append(message);
                    b.f(str2, sb2.toString());
                    f4137a.put(str, secretKey);
                    return (SecretKey) f4137a.get(str);
                } catch (NoSuchProviderException e17) {
                    str2 = "AesGcmKS";
                    sb2 = new StringBuilder();
                    sb2.append("NoSuchProviderException : ");
                    message = e17.getMessage();
                    sb2.append(message);
                    b.f(str2, sb2.toString());
                    f4137a.put(str, secretKey);
                    return (SecretKey) f4137a.get(str);
                }
                f4137a.put(str, secretKey);
            }
        }
        return (SecretKey) f4137a.get(str);
    }

    public static String b(String str, String str2) {
        String str3;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new String(c(str, p.b.r(str2)), "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                StringBuilder a10 = d.a("decrypt: UnsupportedEncodingException : ");
                a10.append(e10.getMessage());
                str3 = a10.toString();
            }
        } else {
            str3 = "alias or encrypt content is null";
        }
        b.f("AesGcmKS", str3);
        return "";
    }

    public static byte[] c(String str, byte[] bArr) {
        boolean z10;
        StringBuilder sb2;
        String str2;
        boolean z11 = false;
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty(str)) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                z10 = true;
            } else {
                z10 = false;
            }
            String str3 = "sdk version is too low";
            if (!z10) {
                b.f("AesGcmKS", "sdk version is too low");
                return bArr2;
            } else if (bArr.length <= 12) {
                b.f("AesGcmKS", "Decrypt source data is invalid.");
                return bArr2;
            } else {
                SecretKey a10 = a(str);
                byte[] bArr3 = new byte[0];
                if (a10 == null) {
                    str3 = "Decrypt secret key is null";
                } else {
                    if (i10 >= 23) {
                        z11 = true;
                    }
                    if (z11) {
                        if (bArr.length <= 12) {
                            str3 = "Decrypt source data is invalid.";
                        } else {
                            byte[] copyOf = Arrays.copyOf(bArr, 12);
                            try {
                                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                                cipher.init(2, a10, new GCMParameterSpec(128, copyOf));
                                return cipher.doFinal(bArr, 12, bArr.length - 12);
                            } catch (InvalidAlgorithmParameterException e10) {
                                e = e10;
                                sb2 = new StringBuilder();
                                str2 = "InvalidAlgorithmParameterException : ";
                                sb2.append(str2);
                                sb2.append(e.getMessage());
                                b.f("AesGcmKS", sb2.toString());
                                return bArr3;
                            } catch (InvalidKeyException e11) {
                                e = e11;
                                sb2 = new StringBuilder();
                                str2 = "InvalidKeyException : ";
                                sb2.append(str2);
                                sb2.append(e.getMessage());
                                b.f("AesGcmKS", sb2.toString());
                                return bArr3;
                            } catch (NoSuchAlgorithmException e12) {
                                e = e12;
                                sb2 = new StringBuilder();
                                str2 = "NoSuchAlgorithmException : ";
                                sb2.append(str2);
                                sb2.append(e.getMessage());
                                b.f("AesGcmKS", sb2.toString());
                                return bArr3;
                            } catch (BadPaddingException e13) {
                                e = e13;
                                sb2 = new StringBuilder();
                                str2 = "BadPaddingException : ";
                                sb2.append(str2);
                                sb2.append(e.getMessage());
                                b.f("AesGcmKS", sb2.toString());
                                return bArr3;
                            } catch (IllegalBlockSizeException e14) {
                                e = e14;
                                sb2 = new StringBuilder();
                                str2 = "IllegalBlockSizeException : ";
                                sb2.append(str2);
                                sb2.append(e.getMessage());
                                b.f("AesGcmKS", sb2.toString());
                                return bArr3;
                            } catch (NoSuchPaddingException e15) {
                                e = e15;
                                sb2 = new StringBuilder();
                                str2 = "NoSuchPaddingException : ";
                                sb2.append(str2);
                                sb2.append(e.getMessage());
                                b.f("AesGcmKS", sb2.toString());
                                return bArr3;
                            } catch (Exception e16) {
                                e = e16;
                                sb2 = new StringBuilder();
                                str2 = "Exception: ";
                                sb2.append(str2);
                                sb2.append(e.getMessage());
                                b.f("AesGcmKS", sb2.toString());
                                return bArr3;
                            }
                        }
                    }
                }
                b.f("AesGcmKS", str3);
                return bArr3;
            }
        }
        b.f("AesGcmKS", "alias or encrypt content is null");
        return bArr2;
    }

    public static String d(String str, String str2) {
        String str3;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return p.b.d(e(str, str2.getBytes("UTF-8")));
            } catch (UnsupportedEncodingException e10) {
                StringBuilder a10 = d.a("encrypt: UnsupportedEncodingException : ");
                a10.append(e10.getMessage());
                str3 = a10.toString();
            }
        } else {
            str3 = "alias or encrypt content is null";
        }
        b.f("AesGcmKS", str3);
        return "";
    }

    public static byte[] e(String str, byte[] bArr) {
        boolean z10;
        boolean z11;
        StringBuilder sb2;
        String str2;
        byte[] doFinal;
        byte[] iv;
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty(str) && bArr != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                z10 = true;
            } else {
                z10 = false;
            }
            String str3 = "sdk version is too low";
            if (!z10) {
                b.f("AesGcmKS", "sdk version is too low");
                return bArr2;
            }
            SecretKey a10 = a(str);
            byte[] bArr3 = new byte[0];
            if (a10 == null) {
                str3 = "secret key is null";
            } else {
                if (i10 >= 23) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    try {
                        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                        cipher.init(1, a10);
                        doFinal = cipher.doFinal(bArr);
                        iv = cipher.getIV();
                    } catch (InvalidKeyException e10) {
                        e = e10;
                        sb2 = new StringBuilder();
                        str2 = "InvalidKeyException : ";
                        sb2.append(str2);
                        sb2.append(e.getMessage());
                        b.f("AesGcmKS", sb2.toString());
                        return bArr3;
                    } catch (NoSuchAlgorithmException e11) {
                        e = e11;
                        sb2 = new StringBuilder();
                        str2 = "NoSuchAlgorithmException : ";
                        sb2.append(str2);
                        sb2.append(e.getMessage());
                        b.f("AesGcmKS", sb2.toString());
                        return bArr3;
                    } catch (BadPaddingException e12) {
                        e = e12;
                        sb2 = new StringBuilder();
                        str2 = "BadPaddingException : ";
                        sb2.append(str2);
                        sb2.append(e.getMessage());
                        b.f("AesGcmKS", sb2.toString());
                        return bArr3;
                    } catch (IllegalBlockSizeException e13) {
                        e = e13;
                        sb2 = new StringBuilder();
                        str2 = "IllegalBlockSizeException : ";
                        sb2.append(str2);
                        sb2.append(e.getMessage());
                        b.f("AesGcmKS", sb2.toString());
                        return bArr3;
                    } catch (NoSuchPaddingException e14) {
                        e = e14;
                        sb2 = new StringBuilder();
                        str2 = "NoSuchPaddingException : ";
                        sb2.append(str2);
                        sb2.append(e.getMessage());
                        b.f("AesGcmKS", sb2.toString());
                        return bArr3;
                    } catch (Exception e15) {
                        e = e15;
                        sb2 = new StringBuilder();
                        str2 = "Exception: ";
                        sb2.append(str2);
                        sb2.append(e.getMessage());
                        b.f("AesGcmKS", sb2.toString());
                        return bArr3;
                    }
                    if (iv != null && iv.length == 12) {
                        bArr3 = Arrays.copyOf(iv, iv.length + doFinal.length);
                        System.arraycopy(doFinal, 0, bArr3, iv.length, doFinal.length);
                        return bArr3;
                    }
                    b.f("AesGcmKS", "IV is invalid.");
                    return bArr3;
                }
            }
            b.f("AesGcmKS", str3);
            return bArr3;
        }
        b.f("AesGcmKS", "alias or encrypt content is null");
        return bArr2;
    }
}
