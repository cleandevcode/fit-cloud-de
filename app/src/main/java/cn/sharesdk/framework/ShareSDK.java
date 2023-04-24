package cn.sharesdk.framework;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import cn.sharesdk.framework.loopshare.LoopSharePasswordListener;
import cn.sharesdk.framework.loopshare.LoopShareResultListener;
import cn.sharesdk.framework.loopshare.MoblinkActionListener;
import cn.sharesdk.framework.loopshare.watermark.ReadQrImageListener;
import cn.sharesdk.framework.loopshare.watermark.WaterMarkListener;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.MobSDK;
import com.mob.commons.ForbThrowable;
import com.mob.commons.dialog.PolicyThrowable;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class ShareSDK {
    public static final String SDK_TAG = "SHARESDK";
    public static final int SDK_VERSION_CODE;
    public static final String SDK_VERSION_NAME = "3.10.7";
    public static final String SHARESDK_MOBLINK_RESTORE = "sharesdk_moblink_restore";

    /* renamed from: a */
    private static i f5074a = null;

    /* renamed from: b */
    private static boolean f5075b = true;

    /* renamed from: c */
    private static String f5076c = null;

    /* renamed from: d */
    private static HashMap<String, Object> f5077d = null;

    /* renamed from: e */
    private static List<HashMap<String, Object>> f5078e = null;

    /* renamed from: f */
    private static int f5079f = 0;

    /* renamed from: g */
    private static volatile boolean f5080g = false;

    static {
        int i10 = 0;
        for (String str : SDK_VERSION_NAME.split("\\.")) {
            i10 = (i10 * 100) + Integer.parseInt(str);
        }
        SDK_VERSION_CODE = i10;
        try {
            k();
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK static main catch ", new Object[0]);
        }
    }

    public static String a(int i10, String str) {
        try {
            k();
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK getNetworkDevinfo catch ", new Object[0]);
        }
        i iVar = f5074a;
        if (iVar != null) {
            return iVar.a(i10, str);
        }
        return null;
    }

    @Deprecated
    public static String a(Bitmap bitmap) {
        Log.e("ShareSDK", "This method is deprecated , please use uploadImageToFileServer(String imagePath,ShareSDKCallback<String> callback)");
        return null;
    }

    @Deprecated
    public static String a(String str) {
        Log.e("ShareSDK", "This method is deprecated , please use uploadImageToFileServer(String imagePath,ShareSDKCallback<String> callback)");
        return null;
    }

    public static void a(int i10, int i11) {
        try {
            k();
            i iVar = f5074a;
            if (iVar != null) {
                iVar.a(i10, i11);
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK copyNetworkDevinfo catch ", new Object[0]);
        }
    }

    public static void a(String str, String str2) {
        try {
            k();
            i iVar = f5074a;
            if (iVar != null) {
                iVar.a(str, str2);
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK copyDevinfo ", new Object[0]);
        }
    }

    public static void a(String str, boolean z10, int i10, String str2, ShareSDKCallback<String> shareSDKCallback) {
        try {
            k();
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK getShortLink catch ", new Object[0]);
        }
        i iVar = f5074a;
        if (iVar != null) {
            iVar.a(str, z10, i10, str2, shareSDKCallback);
        } else if (shareSDKCallback != null) {
            shareSDKCallback.onCallback(str);
        }
    }

    public static boolean a() {
        try {
            k();
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK isNetworkDevinfoRequested is catch ", new Object[0]);
        }
        i iVar = f5074a;
        if (iVar != null) {
            return iVar.f();
        }
        return false;
    }

    @Deprecated
    public static boolean b() {
        Log.e("ShareSDK", "This method is deprecated , please use grequestDevinfo(ShareSDKCallback<String> callback)");
        return false;
    }

    public static void closeDebug() {
        f5075b = false;
    }

    public static void deleteCache() {
        try {
            k();
            i iVar = f5074a;
            if (iVar != null) {
                iVar.g();
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK deleteCache catch ", new Object[0]);
        }
    }

    public static Activity getAuthActivity() {
        try {
            k();
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK getAuthActivity catch ", new Object[0]);
        }
        i iVar = f5074a;
        if (iVar != null) {
            return iVar.a();
        }
        return null;
    }

    @Deprecated
    public static HashMap<String, Object> getCustomDataFromLoopShare() {
        return null;
    }

    public static String getDevinfo(String str, String str2) {
        try {
            k();
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK getDevinfo catch ", new Object[0]);
        }
        i iVar = f5074a;
        if (iVar != null) {
            return iVar.b(str, str2);
        }
        return null;
    }

    @Deprecated
    public static boolean getEnableAuthTag() {
        return false;
    }

    @Deprecated
    public static void getFirstQrImage(Context context, ReadQrImageListener readQrImageListener) {
    }

    public static Platform getPlatform(String str) {
        try {
            k();
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK ensureInit getPlatform catch", new Object[0]);
        }
        i iVar = f5074a;
        if (iVar != null) {
            return iVar.a(str);
        }
        return null;
    }

    public static Platform[] getPlatformList() {
        try {
            k();
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK getPlatformList catch ", new Object[0]);
        }
        i iVar = f5074a;
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    @Deprecated
    public static Bitmap getQRCodeBitmap(String str, int i10, int i11) {
        return null;
    }

    public static <T extends Service> T getService(Class<T> cls) {
        k();
        i iVar = f5074a;
        if (iVar != null) {
            return (T) iVar.c(cls);
        }
        return null;
    }

    public static /* synthetic */ int h() {
        int i10 = f5079f;
        f5079f = i10 + 1;
        return i10;
    }

    public static boolean isDebug() {
        return f5075b;
    }

    public static boolean isFBInstagram() {
        try {
            k();
        } catch (Throwable th2) {
            SSDKLog.b().a(cn.sharesdk.facebook.e.a("ShareSDK isFBInstagram catch: ", th2), new Object[0]);
        }
        i iVar = f5074a;
        if (iVar == null) {
            return false;
        }
        return iVar.b();
    }

    public static boolean isRemoveCookieOnAuthorize() {
        try {
            k();
        } catch (Throwable th2) {
            SSDKLog.b().a(cn.sharesdk.facebook.e.a("ShareSDK isRemoveCookieOnAuthorize catch: ", th2), new Object[0]);
        }
        i iVar = f5074a;
        if (iVar == null) {
            return false;
        }
        return iVar.e();
    }

    private static boolean j() {
        if (MobSDK.isForb()) {
            throw new ForbThrowable();
        }
        if (!f5080g) {
            f5080g = true;
            cn.sharesdk.framework.utils.h.a();
        }
        int isAuth = MobSDK.isAuth();
        if (isAuth == 1 || isAuth == 2) {
            return true;
        }
        throw new PolicyThrowable();
    }

    public static synchronized void k() {
        synchronized (ShareSDK.class) {
            j();
            if (f5074a == null) {
                i iVar = new i();
                iVar.c();
                f5074a = iVar;
            }
        }
    }

    private static void l() {
        new Thread(new Runnable() { // from class: cn.sharesdk.framework.ShareSDK.1
            @Override // java.lang.Runnable
            public void run() {
                Looper.prepare();
                final Handler handler = new Handler(Looper.myLooper()) { // from class: cn.sharesdk.framework.ShareSDK.1.1
                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        super.handleMessage(message);
                        if (message == null || message.what != 3) {
                            return;
                        }
                        try {
                            ShareSDK.k();
                            if (ShareSDK.f5074a != null) {
                                if (ShareSDK.f5077d == null || ShareSDK.f5077d.size() <= 0) {
                                    ShareSDK.f5074a.a(ShareSDK.f5078e);
                                } else {
                                    ShareSDK.f5074a.a(ShareSDK.f5076c, ShareSDK.f5077d);
                                }
                            }
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                };
                handler.post(new Runnable() { // from class: cn.sharesdk.framework.ShareSDK.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        int isAuth = MobSDK.isAuth();
                        if (isAuth == 0) {
                            ShareSDK.h();
                            if (ShareSDK.f5079f != 90) {
                                SSDKLog.b().d("ShareSDK , Privacy Agreement is not agree, Please agree to the privacy agreement first ", new Object[0]);
                                handler.postDelayed(this, 500L);
                                return;
                            }
                        } else if (isAuth == 1 || isAuth == 2) {
                            if (MobSDK.isForb()) {
                                return;
                            }
                            handler.removeCallbacks(this);
                            Message obtain = Message.obtain();
                            obtain.what = 3;
                            handler.sendMessage(obtain);
                            return;
                        }
                        handler.removeCallbacks(this);
                    }
                });
                Looper.loop();
            }
        }).start();
    }

    public static void logApiEvent(String str, int i10) {
        try {
            k();
            i iVar = f5074a;
            if (iVar != null) {
                iVar.a(str, i10);
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK logApiEvent catch ", new Object[0]);
        }
    }

    public static void logDemoEvent(int i10, Platform platform) {
        try {
            k();
            i iVar = f5074a;
            if (iVar != null) {
                iVar.a(i10, platform);
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK logDemoEvent catch ", new Object[0]);
        }
    }

    @Deprecated
    public static void makeVideoWaterMark(String str, String str2, String str3, String str4, WaterMarkListener waterMarkListener) {
    }

    @Deprecated
    public static void mobLinkGetMobID(HashMap<String, Object> hashMap, MoblinkActionListener moblinkActionListener) {
    }

    public static String platformIdToName(int i10) {
        try {
            k();
        } catch (Throwable th2) {
            SSDKLog.b().a(cn.sharesdk.facebook.e.a("ShareSDK platformIdToName catch: ", th2), new Object[0]);
        }
        i iVar = f5074a;
        if (iVar != null) {
            return iVar.c(i10);
        }
        return null;
    }

    public static int platformNameToId(String str) {
        try {
            k();
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK platformNameToId catch ", new Object[0]);
        }
        i iVar = f5074a;
        if (iVar != null) {
            return iVar.b(str);
        }
        return -1;
    }

    @Deprecated
    public static void prepareLoopShare(LoopShareResultListener loopShareResultListener) {
    }

    @Deprecated
    public static void preparePassWord(HashMap<String, Object> hashMap, String str, LoopSharePasswordListener loopSharePasswordListener) {
    }

    @Deprecated
    public static void readPassWord(boolean z10, LoopSharePasswordListener loopSharePasswordListener) {
    }

    public static void registerPlatform(Class<? extends CustomPlatform> cls) {
        k();
        i iVar = f5074a;
        if (iVar != null) {
            iVar.d(cls);
        }
    }

    public static void registerService(Class<? extends Service> cls) {
        try {
            k();
            i iVar = f5074a;
            if (iVar != null) {
                iVar.a(cls);
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK  registerService catch ", new Object[0]);
        }
    }

    public static void removeCookieOnAuthorize(boolean z10) {
        try {
            k();
            i iVar = f5074a;
            if (iVar != null) {
                iVar.b(z10);
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK removeCookieOnAuthorize catch ", new Object[0]);
        }
    }

    public static void setActivity(Activity activity) {
        try {
            k();
            i iVar = f5074a;
            if (iVar != null) {
                iVar.a(activity);
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK setActivity is catch ", new Object[0]);
        }
    }

    public static void setCloseGppService(boolean z10) {
        try {
            cn.sharesdk.framework.a.a.e.a().b(z10);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
        }
    }

    public static void setConnTimeout(int i10) {
        try {
            k();
            i iVar = f5074a;
            if (iVar != null) {
                iVar.a(i10);
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK setConnTimeout catch", new Object[0]);
        }
    }

    @Deprecated
    public static void setEnableAuthTag(boolean z10) {
    }

    public static void setFBInstagram(boolean z10) {
        try {
            k();
            i iVar = f5074a;
            if (iVar != null) {
                iVar.a(z10);
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK setFBInstagram catch ", new Object[0]);
        }
    }

    public static void setPlatformDevInfo(String str, HashMap<String, Object> hashMap) {
        try {
            f5076c = str;
            f5077d = hashMap;
            if (MobSDK.isForb() || MobSDK.isAuth() != 1) {
                l();
            } else {
                k();
                i iVar = f5074a;
                if (iVar != null) {
                    iVar.a(str, hashMap);
                }
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK setPlatformDevInfo catch ", new Object[0]);
        }
    }

    public static void setPlatformDevInfos(List<HashMap<String, Object>> list) {
        try {
            f5078e = list;
            if (MobSDK.isForb() || MobSDK.isAuth() != 1) {
                l();
            } else {
                k();
                i iVar = f5074a;
                if (iVar != null) {
                    iVar.a(f5078e);
                }
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK setPlatformDevInfo catch ", new Object[0]);
        }
    }

    public static void setReadTimeout(int i10) {
        try {
            k();
            i iVar = f5074a;
            if (iVar != null) {
                iVar.b(i10);
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK setReadTimeout catch", new Object[0]);
        }
    }

    public static void unregisterPlatform(Class<? extends CustomPlatform> cls) {
        k();
        i iVar = f5074a;
        if (iVar != null) {
            iVar.e(cls);
        }
    }

    public static void unregisterService(Class<? extends Service> cls) {
        try {
            k();
            i iVar = f5074a;
            if (iVar != null) {
                iVar.b(cls);
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2, "ShareSDK  unregisterService catch ", new Object[0]);
        }
    }
}
