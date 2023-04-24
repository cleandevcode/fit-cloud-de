package com.huawei.hms.feature.dynamic.a;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.feature.dynamic.DynamicModule;

/* loaded from: classes.dex */
public class d implements DynamicModule.VersionPolicy {

    /* renamed from: a */
    private static final String f6998a = "d";

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) {
        Bundle remoteModuleInfo = DynamicModule.getRemoteModuleInfo(context, str);
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        String str2 = f6998a;
        ob.a.d(4, str2, "The version of remote module " + str + ":" + remoteModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f7009j));
        ob.a.d(4, str2, "The version of local module " + str + ":" + localModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f7010k));
        if (remoteModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f7009j) >= localModuleInfo.getInt(com.huawei.hms.feature.dynamic.b.f7010k)) {
            ob.a.d(4, str2, "Choose remote module info.");
            return remoteModuleInfo;
        }
        ob.a.d(4, str2, "Choose local module info.");
        return localModuleInfo;
    }
}
