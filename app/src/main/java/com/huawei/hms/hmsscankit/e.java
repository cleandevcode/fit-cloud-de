package com.huawei.hms.hmsscankit;

import android.text.TextUtils;
import com.huawei.hms.hmsscankit.api.IOnResultCallback;
import com.huawei.hms.ml.scan.HmsScan;

/* loaded from: classes.dex */
class e extends IOnResultCallback.Stub {

    /* renamed from: a */
    private final OnResultCallback f7082a;

    /* renamed from: b */
    private String f7083b;

    /* renamed from: c */
    private boolean f7084c;

    public e(OnResultCallback onResultCallback, boolean z10) {
        this.f7082a = onResultCallback;
        this.f7084c = z10;
    }

    @Override // com.huawei.hms.hmsscankit.api.IOnResultCallback
    public void onResult(HmsScan[] hmsScanArr) {
        HmsScan hmsScan;
        StringBuilder a10 = android.support.v4.media.d.a("result callback sdk continueScan");
        a10.append(this.f7084c);
        com.huawei.hms.scankit.util.a.c("OnResultCallbackDelegat", a10.toString());
        if (!this.f7084c) {
            if (hmsScanArr != null && hmsScanArr.length > 0 && (hmsScan = hmsScanArr[0]) != null && !TextUtils.equals(this.f7083b, hmsScan.getOriginalValue())) {
                this.f7083b = hmsScanArr[0].getOriginalValue();
                StringBuilder a11 = android.support.v4.media.d.a("result callback sdk continueScan");
                a11.append(this.f7084c);
                com.huawei.hms.scankit.util.a.c("OnResultCallbackDelegat", a11.toString());
            } else {
                return;
            }
        }
        this.f7082a.onResult(hmsScanArr);
    }
}
