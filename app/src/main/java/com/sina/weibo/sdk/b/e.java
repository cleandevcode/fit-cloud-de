package com.sina.weibo.sdk.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import com.huawei.hms.framework.common.ContainerUtils;
import hj.o;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: ak */
    private static char[] f9500ak = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();

    /* renamed from: al */
    private static byte[] f9501al = new byte[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            f9501al[i10] = -1;
        }
        for (int i11 = 65; i11 <= 90; i11++) {
            f9501al[i11] = (byte) (i11 - 65);
        }
        for (int i12 = 97; i12 <= 122; i12++) {
            f9501al[i12] = (byte) ((i12 + 26) - 97);
        }
        for (int i13 = 48; i13 <= 57; i13++) {
            f9501al[i13] = (byte) ((i13 + 52) - 48);
        }
        byte[] bArr = f9501al;
        bArr[43] = 62;
        bArr[47] = 63;
    }

    public static int a(int i10, Context context) {
        return (int) ((i10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String b(Context context, String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return null;
            }
            return d.a(signatureArr[0].toByteArray());
        } catch (PackageManager.NameNotFoundException | Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static byte[] b(byte[] bArr) {
        boolean z10;
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            int i12 = (bArr[i10] & 255) << 8;
            int i13 = i10 + 1;
            boolean z11 = true;
            if (i13 < bArr.length) {
                i12 |= bArr[i13] & 255;
                z10 = true;
            } else {
                z10 = false;
            }
            int i14 = i12 << 8;
            int i15 = i10 + 2;
            if (i15 < bArr.length) {
                i14 |= bArr[i15] & 255;
            } else {
                z11 = false;
            }
            int i16 = i11 + 3;
            char[] cArr = f9500ak;
            int i17 = 64;
            bArr2[i16] = (byte) cArr[z11 ? i14 & 63 : 64];
            int i18 = i14 >> 6;
            int i19 = i11 + 2;
            if (z10) {
                i17 = i18 & 63;
            }
            bArr2[i19] = (byte) cArr[i17];
            int i20 = i18 >> 6;
            bArr2[i11 + 1] = (byte) cArr[i20 & 63];
            bArr2[i11 + 0] = (byte) cArr[(i20 >> 6) & 63];
            i10 += 3;
            i11 += 4;
        }
        return bArr2;
    }

    public static Bundle g(String str) {
        try {
            return i(new URL(str).getQuery());
        } catch (MalformedURLException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Bundle h(String str) {
        try {
            return i(new URI(str).getQuery());
        } catch (URISyntaxException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static Bundle i(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String str2 : str.split(ContainerUtils.FIELD_DELIMITER)) {
                String[] split = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                try {
                    if (split.length == 2) {
                        bundle.putString(URLDecoder.decode(split[0], "UTF-8"), URLDecoder.decode(split[1], "UTF-8"));
                    } else if (split.length == 1) {
                        bundle.putString(URLDecoder.decode(split[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return bundle;
    }

    public static String o() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.MANUFACTURER);
        sb2.append("-");
        sb2.append(Build.MODEL);
        sb2.append("_");
        o.a(sb2, Build.VERSION.RELEASE, "_", "weibosdk", "_");
        return androidx.activity.e.b(sb2, "0041005000", "_android");
    }
}
