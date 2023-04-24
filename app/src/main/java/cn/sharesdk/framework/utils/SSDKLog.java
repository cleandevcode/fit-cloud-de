package cn.sharesdk.framework.utils;

import cn.sharesdk.framework.ShareSDK;
import com.mob.commons.logcollector.DefaultLogsCollector;
import com.mob.tools.log.NLog;

/* loaded from: classes.dex */
public class SSDKLog {

    /* renamed from: a */
    private static SSDKLog f5279a;

    /* renamed from: b */
    private static NLog f5280b;

    /* renamed from: c */
    private final int f5281c = -1;

    private SSDKLog() {
        a();
    }

    public static NLog a() {
        f5280b = NLog.getInstance(ShareSDK.SDK_TAG);
        DefaultLogsCollector.get().addSDK(ShareSDK.SDK_TAG, ShareSDK.SDK_VERSION_CODE);
        return f5280b;
    }

    private boolean a(NLog nLog) {
        return nLog != null;
    }

    public static SSDKLog b() {
        if (f5279a == null) {
            f5279a = new SSDKLog();
        }
        return f5279a;
    }

    public final int a(Object obj, Object... objArr) {
        try {
            if (a(f5280b)) {
                return f5280b.log(3, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int a(String str) {
        try {
            if (a(f5280b)) {
                return f5280b.log(5, str, new Object[0]);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int a(Throwable th2) {
        try {
            if (a(f5280b)) {
                return f5280b.log(3, th2);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int a(Throwable th2, Object obj, Object... objArr) {
        try {
            if (a(f5280b)) {
                return f5280b.log(3, th2, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int b(Object obj, Object... objArr) {
        try {
            if (a(f5280b)) {
                return f5280b.log(5, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int b(String str) {
        try {
            if (a(f5280b)) {
                return f5280b.log(4, str, new Object[0]);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int b(Throwable th2) {
        try {
            if (a(f5280b)) {
                return f5280b.log(5, th2);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int b(Throwable th2, Object obj, Object... objArr) {
        try {
            if (a(f5280b)) {
                return f5280b.log(5, th2, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int c(Object obj, Object... objArr) {
        try {
            if (a(f5280b)) {
                return f5280b.log(4, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int c(Throwable th2) {
        try {
            if (a(f5280b)) {
                return f5280b.log(4, th2);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int d(Object obj, Object... objArr) {
        try {
            if (a(f5280b)) {
                return f5280b.log(6, obj, objArr);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final int d(Throwable th2) {
        try {
            if (a(f5280b)) {
                return f5280b.log(6, th2);
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
