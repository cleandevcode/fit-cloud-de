package com.huawei.hms.scankit;

import com.huawei.hms.scankit.p.C0657e;

/* loaded from: classes.dex */
public class C implements C0657e.d {

    /* renamed from: a */
    private m f7091a;

    public C(m mVar) {
        this.f7091a = mVar;
    }

    @Override // com.huawei.hms.scankit.p.C0657e.d
    public void a(byte[] bArr) {
        StringBuilder a10 = android.support.v4.media.d.a("request frame time:");
        a10.append(System.currentTimeMillis());
        com.huawei.hms.scankit.util.a.a("scan-time", a10.toString());
        this.f7091a.a().obtainMessage(R.id.scankit_decode, bArr).sendToTarget();
    }
}
