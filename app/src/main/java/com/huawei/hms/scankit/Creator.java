package com.huawei.hms.scankit;

import com.huawei.hms.hmsscankit.api.IRemoteCreator;
import com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate;
import com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate;

/* loaded from: classes.dex */
public class Creator extends IRemoteCreator.Stub {
    private static final String TAG = "Creator";
    private q iRemoteViewDelegate = null;
    private BinderC0743r iRemoteDecoderDelegate = null;
    private t iRemoteHmsDecoderDelegate = null;

    @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
    public IRemoteDecoderDelegate newRemoteDecoderDelegate() {
        com.huawei.hms.scankit.util.a.c(TAG, "newRemoteDecoderDelegate()");
        BinderC0743r a10 = BinderC0743r.a();
        this.iRemoteDecoderDelegate = a10;
        return a10;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
    public IRemoteHmsDecoderDelegate newRemoteHmsDecoderDelegate() {
        com.huawei.hms.scankit.util.a.c(TAG, "newRemoteHmsDecoderDelegate()");
        t a10 = t.a();
        this.iRemoteHmsDecoderDelegate = a10;
        return a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009d  */
    @Override // com.huawei.hms.hmsscankit.api.IRemoteCreator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.huawei.hms.hmsscankit.api.IRemoteViewDelegate newRemoteViewDelegate(com.huawei.hms.feature.dynamic.IObjectWrapper r13, com.huawei.hms.feature.dynamic.IObjectWrapper r14) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.Creator.newRemoteViewDelegate(com.huawei.hms.feature.dynamic.IObjectWrapper, com.huawei.hms.feature.dynamic.IObjectWrapper):com.huawei.hms.hmsscankit.api.IRemoteViewDelegate");
    }
}
