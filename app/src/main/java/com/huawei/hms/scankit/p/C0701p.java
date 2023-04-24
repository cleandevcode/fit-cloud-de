package com.huawei.hms.scankit.p;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import com.huawei.hms.scankit.p.C0657e;
import com.topstep.fitcloudpro.R;

/* renamed from: com.huawei.hms.scankit.p.p */
/* loaded from: classes.dex */
public final class C0701p implements Camera.PreviewCallback {

    /* renamed from: a */
    private C0657e.d f8026a;

    /* renamed from: b */
    private C0697o f8027b;

    public C0701p(C0697o c0697o, C0657e.d dVar) {
        this.f8026a = dVar;
        this.f8027b = c0697o;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        Handler handler = this.f8027b.f8010b;
        if (handler == null) {
            this.f8026a.a(bArr);
            return;
        }
        Message.obtain(handler, R.integer.config_navAnimTime, "MLKitCamera").sendToTarget();
        this.f8026a.a(bArr);
        Message.obtain(handler, (int) R.integer.config_tooltipAnimTime).sendToTarget();
    }
}
