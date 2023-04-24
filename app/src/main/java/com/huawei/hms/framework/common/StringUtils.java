package com.huawei.hms.framework.common;

import android.text.TextUtils;
import com.huawei.secure.android.common.util.SafeString;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class StringUtils {

    /* renamed from: a */
    public static boolean f7047a = false;

    public static boolean a() {
        ClassLoader classLoader = SecurityBase64Utils.class.getClassLoader();
        if (classLoader == null) {
            return false;
        }
        try {
            classLoader.loadClass("com.huawei.secure.android.common.util.SafeString");
            synchronized (StringUtils.class) {
                f7047a = true;
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static String anonymizeMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (i10 % 2 != 0) {
                charArray[i10] = '*';
            }
        }
        return new String(charArray);
    }

    public static String byte2Str(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            Logger.w("StringUtils.byte2str error: UnsupportedEncodingException", anonymizeMessage(e10.getMessage()));
            return "";
        }
    }

    public static String collection2String(Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : collection) {
            sb2.append(str);
            sb2.append(";");
        }
        return sb2.toString().substring(0, sb2.length() - 1);
    }

    public static String format(String str, Object... objArr) {
        return str == null ? "" : String.format(Locale.ROOT, str, objArr);
    }

    public static byte[] getBytes(long j10) {
        return getBytes(String.valueOf(j10));
    }

    public static byte[] getBytes(String str) {
        byte[] bArr = new byte[0];
        if (str == null) {
            return bArr;
        }
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            Logger.w("StringUtils", "the content has error while it is converted to bytes");
            return bArr;
        }
    }

    public static String getTraceInfo(Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        StringBuilder sb2 = new StringBuilder((int) DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb2.append("at ");
            sb2.append(stackTraceElement.toString());
            sb2.append(";");
        }
        return sb2.toString();
    }

    public static String replace(String str, CharSequence charSequence, CharSequence charSequence2) {
        if (f7047a || a()) {
            try {
                return SafeString.replace(str, charSequence, charSequence2);
            } catch (Throwable unused) {
                Logger.w("StringUtils", "SafeString.substring error");
            }
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(charSequence)) {
            return str;
        }
        try {
            return str.replace(charSequence, charSequence2);
        } catch (Exception unused2) {
            return str;
        }
    }

    public static byte[] str2Byte(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            Logger.w("StringUtils.str2Byte error: UnsupportedEncodingException", anonymizeMessage(e10.getMessage()));
            return new byte[0];
        }
    }

    public static boolean strEquals(String str, String str2) {
        return str == str2 || (str != null && str.equals(str2));
    }

    public static boolean stringToBoolean(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return z10;
        }
        try {
            return Boolean.valueOf(str).booleanValue();
        } catch (NumberFormatException e10) {
            StringBuilder a10 = android.support.v4.media.d.a("String to Integer catch NumberFormatException.");
            a10.append(anonymizeMessage(e10.getMessage()));
            Logger.w("StringUtils", a10.toString());
            return z10;
        }
    }

    public static int stringToInteger(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            StringBuilder a10 = android.support.v4.media.d.a("String to Integer catch NumberFormatException.");
            a10.append(anonymizeMessage(e10.getMessage()));
            Logger.w("StringUtils", a10.toString());
            return i10;
        }
    }

    public static long stringToLong(String str, long j10) {
        if (TextUtils.isEmpty(str)) {
            return j10;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e10) {
            StringBuilder a10 = android.support.v4.media.d.a("String to Long catch NumberFormatException.");
            a10.append(anonymizeMessage(e10.getMessage()));
            Logger.w("StringUtils", a10.toString());
            return j10;
        }
    }

    public static String substring(String str, int i10) {
        if (a()) {
            try {
                return SafeString.substring(str, i10);
            } catch (Throwable unused) {
                Logger.w("StringUtils", "SafeString.substring error");
            }
        }
        if (TextUtils.isEmpty(str) || str.length() < i10 || i10 < 0) {
            return "";
        }
        try {
            return str.substring(i10);
        } catch (Exception unused2) {
            return "";
        }
    }

    public static String substring(String str, int i10, int i11) {
        if (f7047a || a()) {
            try {
                return SafeString.substring(str, i10, i11);
            } catch (Throwable unused) {
                Logger.w("StringUtils", "SafeString.substring error");
            }
        }
        if (TextUtils.isEmpty(str) || i10 < 0 || i11 > str.length() || i11 < i10) {
            return "";
        }
        try {
            return str.substring(i10, i11);
        } catch (Exception unused2) {
            return "";
        }
    }

    public static String toLowerCase(String str) {
        return str == null ? "" : str.toLowerCase(Locale.ROOT);
    }
}
