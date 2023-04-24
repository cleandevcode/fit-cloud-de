package com.mob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mob.commons.C0744r;
import com.mob.commons.InternationalDomain;
import com.mob.commons.MobProduct;
import com.mob.commons.n;
import com.mob.commons.o;
import com.mob.commons.q;
import com.mob.commons.s;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ReflectHelper;

/* loaded from: classes.dex */
public class MobSDK implements PublicMemberKeeper {
    public static final int CHANNEL_APICLOUD = 5;
    public static final int CHANNEL_COCOS = 1;
    public static final int CHANNEL_FLUTTER = 4;
    public static final int CHANNEL_JS = 3;
    public static final int CHANNEL_NATIVE = 0;
    public static final int CHANNEL_QUICKSDK = 6;
    public static final int CHANNEL_REACT_NATIVE = 8;
    public static final int CHANNEL_UNIAPP = 7;
    public static final int CHANNEL_UNITY = 2;
    public static final int SDK_VERSION_CODE;
    public static final String SDK_VERSION_NAME;

    /* renamed from: a */
    private static volatile Context f8190a;

    static {
        int i10;
        String str = "1.0.0";
        try {
            str = "2023-03-22".replace("-", ".");
            i10 = Integer.parseInt("2023-03-22".replace("-", ""));
        } catch (Throwable unused) {
            i10 = 1;
        }
        SDK_VERSION_CODE = i10;
        SDK_VERSION_NAME = str;
    }

    @Deprecated
    public static void canIContinueBusiness(final MobProduct mobProduct, Object obj, final Object obj2) {
        if (obj2 == null) {
            throw new IllegalArgumentException("callback can not be null");
        }
        new Thread(new Runnable() { // from class: com.mob.MobSDK.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (mobProduct == null) {
                        ReflectHelper.invokeInstanceMethod(obj2, "onFailure", new Throwable("MobProduct can not be null"));
                    } else {
                        ReflectHelper.invokeInstanceMethod(obj2, "onComplete", Boolean.TRUE);
                    }
                } catch (Throwable th2) {
                    MobLog.getInstance().e(th2);
                    try {
                        ReflectHelper.invokeInstanceMethod(obj2, "onFailure", th2);
                    } catch (Throwable unused) {
                    }
                }
            }
        }).start();
    }

    public static boolean checkForceHttps() {
        n.f8474d = true;
        return n.f8474d;
    }

    @Deprecated
    public static String checkRequestUrl(String str) {
        return C0744r.a(str);
    }

    public static boolean checkV6() {
        return n.f8476f;
    }

    @Deprecated
    public static String dynamicModifyUrl(String str) {
        return C0744r.a(str);
    }

    public static String getAppSecret() {
        return n.f8472b;
    }

    public static String getAppkey() {
        if (TextUtils.isEmpty(n.f8471a) && f8190a != null) {
            n.a(f8190a);
        }
        return n.f8471a;
    }

    public static Context getContext() {
        if (f8190a == null) {
            try {
                Context a10 = C0744r.a();
                if (a10 != null) {
                    init(a10);
                }
            } catch (Throwable unused) {
            }
        }
        return f8190a;
    }

    public static Context getContextSafely() {
        return f8190a;
    }

    public static boolean getDefaultPrivacy() {
        return n.f8475e;
    }

    public static InternationalDomain getDomain() {
        return n.f8473c == null ? InternationalDomain.DEFAULT : n.f8473c;
    }

    public static int getPrivacyGrantedStatus() {
        return s.c();
    }

    public static synchronized void init(Context context) {
        synchronized (MobSDK.class) {
            init(context, null, null);
        }
    }

    public static synchronized void init(Context context, String str) {
        synchronized (MobSDK.class) {
            init(context, str, null);
        }
    }

    public static synchronized void init(Context context, String str, String str2) {
        synchronized (MobSDK.class) {
            if (context == null) {
                Log.e("MobSDK", "MobSDK init error, context is null");
                return;
            }
            if (f8190a == null) {
                f8190a = context.getApplicationContext();
                n.f8471a = str;
                n.f8472b = str2;
                q.a();
            } else if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(n.f8471a)) {
                n.f8471a = str;
                n.f8472b = str2;
                q.b();
            }
        }
    }

    public static final int isAuth() {
        return q.c();
    }

    public static final boolean isForb() {
        return q.e();
    }

    public static final Boolean isGpAvailable() {
        try {
            return DH.SyncMtd.isGooglePlayServicesAvailable() ? Boolean.TRUE : Boolean.FALSE;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public static final boolean isGppVer() {
        n.f8478h = true;
        return n.f8478h;
    }

    public static final boolean isMob() {
        return q.d();
    }

    public static void setChannel(MobProduct mobProduct, int i10) {
        o.a().a(mobProduct, i10);
    }

    public static void submitPolicyGrantResult(boolean z10) {
        s.a(z10, (OperationCallback<Void>) null);
    }

    @Deprecated
    public static void submitPolicyGrantResult(boolean z10, OperationCallback<Void> operationCallback) {
        s.a(z10, operationCallback);
    }
}
