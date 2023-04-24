package com.huawei.hms.hmsscankit;

import android.util.Log;
import com.huawei.hms.hmsscankit.api.IOnErrorCallback;

/* loaded from: classes.dex */
class c extends IOnErrorCallback.Stub {

    /* renamed from: a */
    private final OnErrorCallback f7080a;

    public c(OnErrorCallback onErrorCallback) {
        this.f7080a = onErrorCallback;
    }

    @Override // com.huawei.hms.hmsscankit.api.IOnErrorCallback
    public void onError(int i10) {
        if (this.f7080a != null) {
            Log.i("OnErrorCallbackDelegate", "onError: ErrorCode：" + i10);
            this.f7080a.onError(i10);
        }
    }
}
