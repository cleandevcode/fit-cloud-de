package com.huawei.hms.scankit;

import android.os.RemoteException;
import com.huawei.hms.hmsscankit.ScanUtil;
import com.huawei.hms.hmsscankit.api.IOnErrorCallback;
import com.huawei.hms.scankit.p.C0657e;

/* renamed from: com.huawei.hms.scankit.b */
/* loaded from: classes.dex */
public class C0634b implements C0657e.c {

    /* renamed from: a */
    public final /* synthetic */ C0637e f7332a;

    public C0634b(C0637e c0637e) {
        this.f7332a = c0637e;
    }

    @Override // com.huawei.hms.scankit.p.C0657e.c
    public void a() {
    }

    @Override // com.huawei.hms.scankit.p.C0657e.c
    public void b() {
        IOnErrorCallback iOnErrorCallback;
        IOnErrorCallback iOnErrorCallback2;
        iOnErrorCallback = this.f7332a.G;
        if (iOnErrorCallback != null) {
            try {
                iOnErrorCallback2 = this.f7332a.G;
                iOnErrorCallback2.onError(ScanUtil.CAMERA_ININT_ERROR);
            } catch (RemoteException unused) {
                com.huawei.hms.scankit.util.a.b(C0637e.f7371a, "RemoteException");
            }
        }
    }

    @Override // com.huawei.hms.scankit.p.C0657e.c
    public void onClosed() {
    }
}
