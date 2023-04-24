package jb;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: c */
    public final HashMap f17567c;

    /* renamed from: d */
    public final Object f17568d;

    /* renamed from: e */
    public SecretKeySpec f17569e;

    public d(Context context, String str) {
        super(context, str);
        this.f17567c = new HashMap();
        this.f17568d = new Object();
        try {
            String a10 = a("/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138");
            String a11 = a("/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C");
            String a12 = a("/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B");
            String a13 = a("/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD");
            if (a10 == null || a11 == null || a12 == null || a13 == null) {
                return;
            }
            this.f17569e = o8.b.a(b.b(a10), b.b(a11), b.b(a12), b.b(a13));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("SecurityResourcesReader", "Exception when reading the 'K&I' for 'Config'.");
            this.f17569e = null;
        }
    }

    private String a(String str) {
        String str2;
        try {
            str2 = "agc_" + b.a(MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        int identifier = this.f17565a.getResources().getIdentifier(str2, "string", this.f17566b);
        if (identifier != 0) {
            try {
            } catch (Resources.NotFoundException unused2) {
                return null;
            }
        }
        return this.f17565a.getResources().getString(identifier);
    }

    public static byte[] b(SecretKeySpec secretKeySpec, byte[] bArr) {
        if (secretKeySpec != null) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, 17);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(copyOfRange));
            return cipher.doFinal(bArr, copyOfRange.length + 1, (bArr.length - copyOfRange.length) - 1);
        }
        throw new NullPointerException("key or cipherText must not be null.");
    }

    public final String c(String str) {
        if (this.f17569e == null) {
            Log.e("SecurityResourcesReader", "KEY is null return def directly");
            return null;
        }
        synchronized (this.f17568d) {
            String str2 = (String) this.f17567c.get(str);
            if (str2 != null) {
                return str2;
            }
            String a10 = a(str);
            if (a10 == null) {
                return null;
            }
            try {
                String str3 = new String(b(this.f17569e, b.b(a10)), "UTF-8");
                this.f17567c.put(str, str3);
                return str3;
            } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
                Log.e("SecurityResourcesReader", "Exception when reading the 'V' for 'Config'.");
                return null;
            }
        }
    }
}
