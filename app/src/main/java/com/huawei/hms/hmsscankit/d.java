package com.huawei.hms.hmsscankit;

import com.huawei.hms.hmsscankit.api.IOnLightCallback;

/* loaded from: classes.dex */
class d extends IOnLightCallback.Stub {

    /* renamed from: a */
    private final OnLightVisibleCallBack f7081a;

    public d(OnLightVisibleCallBack onLightVisibleCallBack) {
        this.f7081a = onLightVisibleCallBack;
    }

    @Override // com.huawei.hms.hmsscankit.api.IOnLightCallback
    public void onVisibleChanged(boolean z10) {
        this.f7081a.onVisibleChanged(z10);
    }
}
