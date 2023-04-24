package com.huawei.hms.mlsdk.common;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.media.d;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.ml.common.utils.ActivityMgr;
import com.huawei.hms.ml.common.utils.CountryCodeBean;
import com.huawei.hms.ml.common.utils.SmartLog;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lb.a;

/* loaded from: classes.dex */
public class MLApplication {
    public static final String DEFAULT_APP_NAME = "_DEFAULT_";
    private static final String LOG_TAG = "MLApplication";
    private String accessToken;
    private String apiKey;
    private final Context appContext;
    private final String appName;
    private final MLApplicationSetting appSetting;
    private static final Object LOCK = new Object();
    public static final Map<String, MLApplication> INSTANCES = new HashMap();
    private boolean setByCP = false;
    private boolean isAcessTokenSetByCP = false;

    public MLApplication(Context context, String str, MLApplicationSetting mLApplicationSetting) {
        this.appContext = context;
        this.appName = str;
        this.appSetting = mLApplicationSetting;
    }

    private static Activity findActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return findActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static List<String> getAllAppNames() {
        ArrayList arrayList = new ArrayList();
        synchronized (LOCK) {
            for (MLApplication mLApplication : INSTANCES.values()) {
                arrayList.add(mLApplication.getAppName());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<MLApplication> getAppList(Context context) {
        ArrayList arrayList;
        synchronized (LOCK) {
            arrayList = new ArrayList(INSTANCES.values());
        }
        return arrayList;
    }

    public static MLApplication getInstance() {
        MLApplication mLApplication;
        synchronized (LOCK) {
            mLApplication = INSTANCES.get(DEFAULT_APP_NAME);
            if (mLApplication == null && (mLApplication = initialize(a.f19423b.f19424a)) == null) {
                throw new IllegalStateException("Please call MLApplication.initialize(Context) to initialize application first.");
            }
        }
        return mLApplication;
    }

    public static MLApplication getInstance(String str) {
        MLApplication mLApplication;
        List<String> allAppNames;
        String str2;
        synchronized (LOCK) {
            mLApplication = INSTANCES.get(str);
            if (mLApplication == null) {
                if (getAllAppNames().isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", allAppNames);
                }
                throw new IllegalStateException(String.format(Locale.ENGLISH, "application doesn't exist. current available application names:%s", str2));
            }
        }
        return mLApplication;
    }

    public static String getUniqueKey(String str, MLApplicationSetting mLApplicationSetting) {
        String str2;
        String str3 = null;
        if (str != null) {
            str2 = Base64.encodeToString(str.getBytes(Charset.defaultCharset()), 11);
        } else {
            str2 = null;
        }
        if (mLApplicationSetting != null && mLApplicationSetting.getAppId() != null) {
            str3 = Base64.encodeToString(mLApplicationSetting.getAppId().getBytes(Charset.defaultCharset()), 11);
        }
        return android.support.v4.media.a.a(str2, "+", str3);
    }

    public static MLApplication initialize(Context context) {
        MLApplication initialize;
        SmartLog.i(LOG_TAG, "initialize one para");
        synchronized (LOCK) {
            makeSureAGConnectInstanceInitialed(context);
            if (INSTANCES.containsKey(DEFAULT_APP_NAME)) {
                getInstance();
            }
            new MLApplicationSetting.Factory().create();
            initialize = initialize(context, MLApplicationSetting.fromResource(context));
        }
        return initialize;
    }

    public static MLApplication initialize(Context context, MLApplicationSetting mLApplicationSetting) {
        SmartLog.i(LOG_TAG, "initialize two para");
        return initialize(context, mLApplicationSetting, DEFAULT_APP_NAME);
    }

    public static MLApplication initialize(Context context, MLApplicationSetting mLApplicationSetting, String str) {
        MLApplication mLApplication;
        Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
        synchronized (LOCK) {
            makeSureAGConnectInstanceInitialed(applicationContext);
            if (mLApplicationSetting == null) {
                new MLApplicationSetting.Factory().create();
                mLApplicationSetting = MLApplicationSetting.fromResource(context);
            }
            mLApplication = new MLApplication(applicationContext, str, mLApplicationSetting);
            INSTANCES.put(str, mLApplication);
            ActivityMgr activityMgr = ActivityMgr.INST;
            if (activityMgr.getCurrentActivity() == null && (applicationContext instanceof Application)) {
                activityMgr.init((Application) applicationContext);
            }
        }
        return mLApplication;
    }

    private static void makeSureAGConnectInstanceInitialed(Context context) {
        if (a.f19423b == null) {
            a.a(context);
        }
    }

    private static String readManifest(Context context) {
        String str;
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            str = "PackageManager NameNotFoundException";
            SmartLog.e(LOG_TAG, str);
            return "";
        } catch (Resources.NotFoundException unused2) {
            str = "Resources NotFoundException";
            SmartLog.e(LOG_TAG, str);
            return "";
        } catch (Exception unused3) {
            str = "readManifest Exception";
            SmartLog.e(LOG_TAG, str);
            return "";
        }
    }

    public <T> T get(Class<T> cls) {
        return null;
    }

    public String getApiKey() {
        String str;
        String str2;
        StringBuilder a10 = d.a("get ky flag: ");
        a10.append(this.setByCP);
        SmartLog.i(LOG_TAG, a10.toString());
        synchronized (LOCK) {
            if (getInstance().isSetByCP() && (str = this.apiKey) != null && str.length() != 0) {
                str2 = this.apiKey;
            } else {
                throw new Error("please set your app apiKey");
            }
        }
        return str2;
    }

    public Context getAppContext() {
        return this.appContext;
    }

    public String getAppName() {
        return this.appName;
    }

    public MLApplicationSetting getAppSetting() {
        return this.appSetting;
    }

    public String getAuthorizationToken() {
        synchronized (LOCK) {
            if (!this.isAcessTokenSetByCP) {
                return getApiKey();
            } else if (TextUtils.isEmpty(this.accessToken)) {
                throw new Error("access token is empty");
            } else {
                return this.accessToken;
            }
        }
    }

    public String getUniqueKey() {
        return getUniqueKey(getAppName(), getAppSetting());
    }

    public boolean isDefault() {
        return DEFAULT_APP_NAME.equals(getAppName());
    }

    public boolean isSetByCP() {
        return this.setByCP;
    }

    public void setAccessToken(String str) {
        SmartLog.i(LOG_TAG, "set a tkn");
        synchronized (LOCK) {
            this.accessToken = str;
            this.isAcessTokenSetByCP = true;
        }
    }

    public void setApiKey(String str) {
        SmartLog.i(LOG_TAG, "set a ky");
        synchronized (LOCK) {
            this.apiKey = str;
            this.setByCP = true;
            if (!isDefault()) {
                getInstance().setApiKey(str);
                getInstance().setApiKeyByCP(true);
            }
        }
    }

    public void setApiKeyByCP(boolean z10) {
        this.setByCP = z10;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (getAppSetting() != null) {
            bundle.putString(MLApplicationSetting.BundleKeyConstants.AppInfo.appid, getAppSetting().getAppId());
            bundle.putString(MLApplicationSetting.BundleKeyConstants.AppInfo.appName, readManifest(getAppContext()));
            bundle.putString(MLApplicationSetting.BundleKeyConstants.AppInfo.packageName, getAppSetting().getPackageName());
            bundle.putString(MLApplicationSetting.BundleKeyConstants.AppInfo.mlSdkVersion, getAppSetting().getMLSdkVersion());
            bundle.putBoolean(MLApplicationSetting.BundleKeyConstants.AppInfo.openHa, getAppSetting().getAcceptHa().booleanValue());
            bundle.putString(MLApplicationSetting.BundleKeyConstants.AppInfo.countryCode, new CountryCodeBean(this.appContext, false).getCountryCode());
        } else {
            SmartLog.w(LOG_TAG, "APP setting is null.");
        }
        return bundle;
    }

    public String toString() {
        StringBuilder a10 = d.a("appName=");
        a10.append(this.appName);
        a10.append(", appSetting=");
        a10.append(this.appSetting);
        return a10.toString();
    }
}
