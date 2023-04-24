package com.huawei.hms.scankit.p;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;

/* renamed from: com.huawei.hms.scankit.p.pb */
/* loaded from: classes.dex */
public class C0703pb {

    /* renamed from: a */
    private static final String f8029a = "pb";

    /* renamed from: b */
    private static volatile Bundle f8030b;

    public static Bundle a(Context context) {
        String str;
        String str2;
        if (context == null) {
            return new Bundle();
        }
        if (f8030b == null) {
            Bundle bundle = new Bundle();
            try {
                String b10 = ib.a.a(context).b("client/app_id");
                if (b10 == null) {
                    b10 = context.getPackageName();
                }
                bundle.putString(MLApplicationSetting.BundleKeyConstants.AppInfo.appid, b10);
            } catch (RuntimeException unused) {
                str = f8029a;
                str2 = "getAppInfo: RuntimeException";
                Log.e(str, str2);
                f8030b = bundle;
                return f8030b;
            } catch (Exception unused2) {
                str = f8029a;
                str2 = "getAppInfo: Exception";
                Log.e(str, str2);
                f8030b = bundle;
                return f8030b;
            }
            f8030b = bundle;
        }
        return f8030b;
    }
}
