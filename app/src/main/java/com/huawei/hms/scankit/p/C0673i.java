package com.huawei.hms.scankit.p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import java.lang.ref.WeakReference;

/* renamed from: com.huawei.hms.scankit.p.i */
/* loaded from: classes.dex */
public class C0673i {

    /* renamed from: a */
    private static final String f7921a = "i";

    /* renamed from: b */
    private WeakReference<Context> f7922b;

    public C0673i(Context context) {
        this.f7922b = new WeakReference<>(context);
    }

    private static String a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(f7921a, "readManifest failed ");
            return "";
        }
    }

    public final Bundle a() {
        if (this.f7922b.get() == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(MLApplicationSetting.BundleKeyConstants.AppInfo.packageName, this.f7922b.get().getPackageName() == null ? "camera.cannot.get.package.name" : this.f7922b.get().getPackageName());
        bundle.putString(MLApplicationSetting.BundleKeyConstants.AppInfo.appid, "com.huawei.hms.ml.camera");
        bundle.putString(MLApplicationSetting.BundleKeyConstants.AppInfo.mlSdkVersion, "ml-computer-vision:".concat("1.0.2.300"));
        bundle.putString(MLApplicationSetting.BundleKeyConstants.AppInfo.appName, a(this.f7922b.get()));
        bundle.putBoolean(MLApplicationSetting.BundleKeyConstants.AppInfo.openHa, Settings.Secure.getInt(this.f7922b.get().getContentResolver(), "hw_app_analytics_state", 0) == 1);
        bundle.putString(MLApplicationSetting.BundleKeyConstants.AppInfo.countryCode, new C0669h(this.f7922b.get(), false).a());
        return bundle;
    }
}
