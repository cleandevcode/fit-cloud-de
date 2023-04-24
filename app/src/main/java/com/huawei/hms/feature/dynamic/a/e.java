package com.huawei.hms.feature.dynamic.a;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.feature.dynamic.DynamicModule;

/* loaded from: classes.dex */
public class e implements DynamicModule.VersionPolicy {

    /* renamed from: a */
    private static final String f6999a = "e";

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) {
        Bundle remoteModuleInfo = DynamicModule.getRemoteModuleInfo(context, str);
        if (remoteModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f7009j) > 0) {
            String str2 = f6999a;
            ob.a.d(4, str2, "Prefer remote: The version of remote module " + str + ":" + remoteModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f7009j));
            return remoteModuleInfo;
        }
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        if (localModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f7010k) > 0) {
            String str3 = f6999a;
            ob.a.d(4, str3, "Choose local: The version of local module " + str + ":" + localModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f7010k));
            return localModuleInfo;
        }
        ob.a.d(4, f6999a, "Cannot get module info in remote or local.");
        return new Bundle();
    }
}
