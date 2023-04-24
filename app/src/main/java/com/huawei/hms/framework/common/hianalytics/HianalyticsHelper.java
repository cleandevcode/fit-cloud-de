package com.huawei.hms.framework.common.hianalytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.utils.HMSBIInitializer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public class HianalyticsHelper {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: h */
    public static volatile HianalyticsHelper f7049h;

    /* renamed from: a */
    public boolean f7050a;

    /* renamed from: b */
    public boolean f7051b;

    /* renamed from: c */
    public String f7052c = "hms_hwid";

    /* renamed from: d */
    public HiAnalyticsInstance f7053d = null;

    /* renamed from: e */
    public HiAnalyticsInstance f7054e = null;

    /* renamed from: f */
    public boolean f7055f = false;

    /* renamed from: g */
    public ExecutorService f7056g = ExecutorsUtils.newSingleThreadExecutor("report_ha");

    /* loaded from: classes.dex */
    public static class HianalyticsRunnable implements Runnable {

        /* renamed from: a */
        public final HianalyticsBaseData f7057a;

        /* renamed from: b */
        public final String f7058b;

        public HianalyticsRunnable(HianalyticsBaseData hianalyticsBaseData, String str) {
            this.f7057a = hianalyticsBaseData;
            this.f7058b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HianalyticsHelper.getInstance().onEvent(this.f7057a.get(), this.f7058b);
        }
    }

    public HianalyticsHelper() {
        try {
            HiAnalyticsManager.getInitFlag("_default_config_tag");
            this.f7050a = true;
        } catch (Throwable unused) {
            Logger.i("HianalyticsHelper", "Hianalytics sdk not found");
            this.f7050a = false;
        }
        if (!this.f7050a) {
            c(ContextHolder.getAppContext());
        }
        Logger.v("HianalyticsHelper", "this time the ha %s, mini %s", Boolean.valueOf(this.f7050a), Boolean.valueOf(this.f7051b));
    }

    public static void b(Context context, String str, Map map, int i10) {
        if (context == null || map == null) {
            return;
        }
        Logger.v("HianalyticsHelper", "data = %s", map);
        try {
            HiAnalyticsUtils.getInstance().onNewEvent(context, str, map, i10);
        } catch (NoSuchMethodError unused) {
            Logger.w("HianalyticsHelper", "may be you need upgrade stats sdk");
        } catch (Throwable unused2) {
            Logger.i("HianalyticsHelper", "the stats has other error,pls check it");
        }
    }

    public static HianalyticsHelper getInstance() {
        if (f7049h == null) {
            synchronized (HianalyticsHelper.class) {
                if (f7049h == null) {
                    f7049h = new HianalyticsHelper();
                }
            }
        }
        return f7049h;
    }

    public final boolean a() {
        if (HiAnalyticsManager.getInitFlag("_default_config_tag")) {
            if (this.f7054e == null) {
                this.f7054e = HiAnalyticsManager.getInstanceByTag("_default_config_tag");
            }
            return this.f7054e != null;
        }
        if (this.f7053d == null) {
            this.f7053d = HiAnalyticsManager.getInstanceByTag(this.f7052c);
        }
        return this.f7053d != null;
    }

    public final void c(Context context) {
        String str;
        if (context == null) {
            Logger.i("HianalyticsHelper", "the appContext hasn't init");
            return;
        }
        try {
            HMSBIInitializer.getInstance(context).initBI();
            this.f7051b = true;
        } catch (NoClassDefFoundError unused) {
            str = "maybe you need add base sdk!";
            Logger.w("HianalyticsHelper", str);
        } catch (Throwable unused2) {
            str = "the hms base has other error!";
            Logger.w("HianalyticsHelper", str);
        }
    }

    public void enablePrivacyPolicy(boolean z10) {
        this.f7055f = z10;
    }

    public void executeReportHa(HianalyticsBaseData hianalyticsBaseData, String str) {
        getReportExecutor().execute(new HianalyticsRunnable(hianalyticsBaseData, str));
    }

    public ExecutorService getReportExecutor() {
        return this.f7056g;
    }

    public boolean isEnableReport(Context context) {
        if (this.f7051b) {
            return true;
        }
        if (this.f7050a) {
            return isEnableReportNoSeed(context);
        }
        return false;
    }

    public boolean isEnableReportNoSeed(Context context) {
        String str;
        String str2;
        if (this.f7051b) {
            return true;
        }
        if (!this.f7050a) {
            str2 = "Hianalytics sdk need to be initialized";
        } else if (context == null) {
            str2 = "HianalyticsHelper context can't be null";
        } else if (this.f7055f) {
            return a();
        } else {
            try {
                if (Settings.Secure.getInt(context.getContentResolver(), "user_experience_involved", -1) == 1) {
                    return a();
                }
            } catch (IllegalStateException unused) {
                str = "the setting has illegalStateException";
                Logger.w("HianalyticsHelper", str);
                str2 = "user experience involved needs to be opened";
                Logger.i("HianalyticsHelper", str2);
                return false;
            } catch (Throwable unused2) {
                str = "the setting has other error";
                Logger.w("HianalyticsHelper", str);
                str2 = "user experience involved needs to be opened";
                Logger.i("HianalyticsHelper", str2);
                return false;
            }
            str2 = "user experience involved needs to be opened";
        }
        Logger.i("HianalyticsHelper", str2);
        return false;
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap) {
        onEvent(linkedHashMap, HianalyticsBaseData.EVENT_ID);
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap, String str) {
        onEvent(linkedHashMap, str, 1);
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap, String str, int i10) {
        HiAnalyticsInstance hiAnalyticsInstance;
        if (this.f7051b) {
            b(ContextHolder.getAppContext(), str, linkedHashMap, i10);
        } else if (i10 == 0) {
            Logger.v("HianalyticsHelper", "the base sdk isn't exsit, and reportType is %s", Integer.valueOf(i10));
            return;
        }
        if (this.f7050a && linkedHashMap != null) {
            Logger.v("HianalyticsHelper", "data = %s", linkedHashMap);
            if ((!HiAnalyticsManager.getInitFlag("_default_config_tag") || (hiAnalyticsInstance = this.f7054e) == null) && (hiAnalyticsInstance = this.f7053d) == null) {
                Logger.e("HianalyticsHelper", "the ha has error,has init but is null!");
            } else {
                hiAnalyticsInstance.onEvent(1, str, linkedHashMap);
            }
        }
    }

    public void reportData(Context context, LinkedHashMap<String, String> linkedHashMap, String str, int i10) {
        if (isEnableReportNoSeed(context)) {
            onEvent(linkedHashMap, str, i10);
        }
    }

    public void reportException(final Throwable th2, final String str) {
        if (getInstance().isEnableReport(ContextHolder.getAppContext())) {
            final String name = Thread.currentThread().getName();
            try {
                this.f7056g.submit(new Runnable() { // from class: com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.1
                    @Override // java.lang.Runnable
                    public void run() {
                        CrashHianalyticsData crashHianalyticsData = new CrashHianalyticsData();
                        crashHianalyticsData.put(HianalyticsBaseData.SDK_VERSION, "5.0.10.302");
                        crashHianalyticsData.put(CrashHianalyticsData.CRASH_TYPE, "exception");
                        crashHianalyticsData.put(CrashHianalyticsData.THREAD_NAME, name);
                        crashHianalyticsData.put(CrashHianalyticsData.EXCEPTION_NAME, th2.getClass().getName());
                        crashHianalyticsData.put(CrashHianalyticsData.MESSAGE, StringUtils.anonymizeMessage(th2.getMessage()));
                        crashHianalyticsData.put(CrashHianalyticsData.STACK_TRACE, StringUtils.getTraceInfo(th2));
                        HianalyticsHelper.getInstance().onEvent(crashHianalyticsData.get(), str);
                    }
                });
            } catch (RejectedExecutionException unused) {
                Logger.i("HianalyticsHelper", "reportException error RejectedExecutionException");
            } catch (Exception unused2) {
                Logger.i("HianalyticsHelper", "reportException error!", th2);
            }
        }
    }

    public void setHaTag(String str) {
        this.f7052c = str;
    }
}
