package com.huawei.hms.feature.dynamic.a;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.feature.dynamic.DynamicModule;

/* loaded from: classes.dex */
public class c implements DynamicModule.VersionPolicy {

    /* renamed from: a */
    private static final String f6997a = "c";

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) {
        Bundle bundle;
        try {
            bundle = DynamicModule.getRemoteModuleInfo(context, str);
            e = null;
        } catch (DynamicModule.LoadingException e10) {
            e = e10;
            String str2 = f6997a;
            ob.a.d(5, str2, "Get remote module info failed: " + e.getMessage() + ". try to query local.");
            bundle = new Bundle();
        }
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        String str3 = f6997a;
        ob.a.d(4, str3, "The version of remote module " + str + ":" + bundle.getInt(com.huawei.hms.feature.dynamic.b.f7009j));
        ob.a.d(4, str3, "The version of local module " + str + ":" + localModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f7010k));
        if (localModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f7010k) > 0 && localModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f7010k) >= bundle.getInt(com.huawei.hms.feature.dynamic.b.f7009j)) {
            ob.a.d(4, str3, "Choose local module info.");
            return localModuleInfo;
        } else if (e != null && bundle.getInt(com.huawei.hms.feature.dynamic.b.f7009j) == 0) {
            throw e;
        } else {
            ob.a.d(4, str3, "Choose remote module info.");
            return bundle;
        }
    }
}
