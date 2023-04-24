package cn.sharesdk.wechat.utils;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.MobSDK;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a */
    private static volatile n f5643a;

    private static int a(ContentResolver contentResolver, Uri uri) {
        SSDKLog.b().a("MicroMsg.SDK.Util", "getFileSize with content url");
        if (contentResolver == null || uri == null) {
            SSDKLog.b().a("MicroMsg.SDK.Util", "getFileSize fail, resolver or uri is null");
            return 0;
        }
        InputStream inputStream = null;
        try {
            try {
                InputStream openInputStream = contentResolver.openInputStream(uri);
                if (openInputStream == null) {
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (IOException e10) {
                            SSDKLog b10 = SSDKLog.b();
                            b10.a("ShareSDK", "WechatTools exception" + e10);
                        }
                    }
                    return 0;
                }
                int available = openInputStream.available();
                try {
                    openInputStream.close();
                } catch (IOException e11) {
                    SSDKLog b11 = SSDKLog.b();
                    b11.a("ShareSDK", "WechatTools exception" + e11);
                }
                return available;
            } catch (Exception e12) {
                SSDKLog b12 = SSDKLog.b();
                b12.a("MicroMsg.SDK.Util", "getFileSize fail, " + e12.getMessage());
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e13) {
                        SSDKLog b13 = SSDKLog.b();
                        b13.a("ShareSDK", "WechatTools exception" + e13);
                    }
                }
                return 0;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e14) {
                    SSDKLog b14 = SSDKLog.b();
                    b14.a("ShareSDK", "WechatTools exception" + e14);
                }
            }
            throw th2;
        }
    }

    public static int a(Bundle bundle, String str, int i10) {
        if (bundle == null) {
            return i10;
        }
        try {
            return bundle.getInt(str, i10);
        } catch (Exception e10) {
            SSDKLog b10 = SSDKLog.b();
            StringBuilder a10 = android.support.v4.media.d.a("getIntExtra exception:");
            a10.append(e10.getMessage());
            b10.a(a10.toString(), new Object[0]);
            return i10;
        }
    }

    public static n a() {
        if (f5643a == null) {
            synchronized (n.class) {
                if (f5643a == null) {
                    f5643a = new n();
                }
            }
        }
        return f5643a;
    }

    public int a(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        File file = new File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        if (MobSDK.getContext() != null && str.startsWith("content")) {
            try {
                return a(MobSDK.getContext().getContentResolver(), Uri.parse(str));
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static String a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (Exception e10) {
            SSDKLog b10 = SSDKLog.b();
            StringBuilder a10 = android.support.v4.media.d.a("getStringExtra exception:");
            a10.append(e10.getMessage());
            b10.a(a10.toString(), new Object[0]);
            return null;
        }
    }
}
