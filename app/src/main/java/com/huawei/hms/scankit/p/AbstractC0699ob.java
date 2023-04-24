package com.huawei.hms.scankit.p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import com.huawei.hms.framework.common.SystemPropUtils;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import com.sina.weibo.BuildConfig;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.huawei.hms.scankit.p.ob */
/* loaded from: classes.dex */
public abstract class AbstractC0699ob {

    /* renamed from: a */
    public static String f8019a = "FORMAT_UNKNOWN";

    /* renamed from: b */
    public static String f8020b = "OTHER";

    /* renamed from: c */
    public static SparseArray<String> f8021c = new C0647bb();

    /* renamed from: d */
    public static SparseArray<String> f8022d = new C0651cb();

    /* renamed from: e */
    public Context f8023e;

    /* renamed from: f */
    public LinkedHashMap<String, String> f8024f = new LinkedHashMap<>();

    /* renamed from: g */
    public volatile long f8025g;

    public AbstractC0699ob(Bundle bundle, Context context) {
        this.f8023e = context;
        b(bundle);
    }

    public static String a(int i10) {
        return f8021c.get(i10, f8019a);
    }

    private String a(Bundle bundle) {
        String[] strArr = {"huawei_module_scankit_sdk_version", "com.huawei.hms.client.service.name:scan", "com.huawei.hms.client.service.name:scanplus", "com.huawei.hms.client.service.name:scankit"};
        if (bundle != null) {
            for (int i10 = 0; i10 < 4; i10++) {
                String str = strArr[i10];
                if (bundle.getString(str) != null) {
                    return bundle.getString(str);
                }
            }
            return "scankit:1.0.2.300";
        }
        return "scankit:1.0.2.300";
    }

    private String b() {
        return Build.VERSION.SDK_INT == 24 ? "full-noso" : "full";
    }

    public static String b(int i10) {
        return f8022d.get(i10, f8020b);
    }

    private void b(Bundle bundle) {
        LinkedHashMap<String, String> linkedHashMap;
        String str = "unknown";
        try {
            String packageName = this.f8023e.getPackageName();
            this.f8024f.put(WiseOpenHianalyticsData.UNION_PACKAGE, packageName);
            if (bundle == null || !bundle.containsKey(MLApplicationSetting.BundleKeyConstants.AppInfo.appid)) {
                this.f8024f.put(MLApplicationSetting.BundleKeyConstants.AppInfo.appid, packageName);
            } else {
                this.f8024f.put(MLApplicationSetting.BundleKeyConstants.AppInfo.appid, bundle.getString(MLApplicationSetting.BundleKeyConstants.AppInfo.appid));
            }
            PackageManager packageManager = this.f8023e.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            this.f8024f.put(MLApplicationSetting.BundleKeyConstants.AppInfo.appName, applicationInfo.loadLabel(packageManager).toString());
            this.f8024f.put(WiseOpenHianalyticsData.UNION_VERSION, a(applicationInfo.metaData));
            String d10 = d();
            this.f8024f.put("hmscoreVersion", d10);
            this.f8024f.put("isHMSCore", "unknown".equals(d10) ? "0" : "1");
        } catch (PackageManager.NameNotFoundException unused) {
            com.huawei.hms.scankit.util.a.b("HaLog", "PackageManager.NameNotFoundException");
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.b("HaLog", "initValue Exception");
        }
        try {
            this.f8024f.put("sdkName", "scankit");
            this.f8024f.put("algopt", b());
            this.f8024f.put("isFullSdk", "FULLSDK");
            this.f8024f.put(WiseOpenHianalyticsData.UNION_APP_VERSION, c());
            if (f()) {
                linkedHashMap = this.f8024f;
            } else {
                linkedHashMap = this.f8024f;
                str = BuildConfig.VERSION_NAME;
            }
            linkedHashMap.put("apkVersion", str);
            this.f8024f.put(WiseOpenHianalyticsData.UNION_SERVICE, "com.huawei.hms.scankit");
            this.f8024f.put("operator", C0714sb.b(this.f8023e));
            this.f8024f.put("networkType", C0714sb.a(this.f8023e));
            this.f8024f.put(MLApplicationSetting.BundleKeyConstants.AppInfo.countryCode, C0714sb.a(this.f8023e, false));
            this.f8024f.put("deviceType", C0714sb.c());
            this.f8024f.put("emuiVersion", C0714sb.d());
            this.f8024f.put("androidVersion", C0714sb.a());
            this.f8024f.put("deviceCategory", C0714sb.b());
        } catch (RuntimeException unused3) {
            com.huawei.hms.scankit.util.a.b("HaLog", "initValue RuntimeException");
        } catch (Exception unused4) {
            com.huawei.hms.scankit.util.a.b("HaLog", "initValue Exception");
        }
    }

    private String c() {
        try {
            return this.f8023e.getPackageManager().getPackageInfo(this.f8023e.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return "unknown";
        }
    }

    private String d() {
        try {
            return this.f8023e.getPackageManager().getPackageInfo("com.huawei.hwid", 0).versionName;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return "unknown";
        }
    }

    private boolean e() {
        try {
            String property = SystemPropUtils.getProperty("get", "ro.hw.country", "android.os.SystemProperties", GrsBaseInfo.CountryCodeSource.UNKNOWN);
            TelephonyManager telephonyManager = (TelephonyManager) this.f8023e.getApplicationContext().getSystemService("phone");
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            String simCountryIso = telephonyManager.getSimCountryIso();
            if ("CN".equalsIgnoreCase(property) && "CN".equalsIgnoreCase(networkCountryIso)) {
                return "CN".equalsIgnoreCase(simCountryIso);
            }
            return false;
        } catch (RuntimeException | Exception unused) {
            return false;
        }
    }

    private boolean f() {
        return true;
    }

    public boolean a() {
        if (com.huawei.hms.scankit.util.b.c(this.f8023e)) {
            Log.i("HaLog", "allowLog: forbidLog");
            return false;
        }
        try {
            if (!f() && !e()) {
                if (Settings.Secure.getInt(this.f8023e.getContentResolver(), "hw_app_analytics_state", 0) != 1) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException | Exception unused) {
            return false;
        }
    }
}
