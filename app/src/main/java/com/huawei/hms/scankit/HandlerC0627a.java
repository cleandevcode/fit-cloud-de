package com.huawei.hms.scankit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import com.huawei.hms.scankit.p.C0657e;
import com.huawei.hms.scankit.p.Fb;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.a */
/* loaded from: classes.dex */
public class HandlerC0627a extends Handler implements com.huawei.hms.scankit.aiscan.common.A {

    /* renamed from: a */
    private final B f7140a;

    /* renamed from: b */
    private final m f7141b;

    /* renamed from: c */
    private final int f7142c;

    /* renamed from: d */
    private EnumC0101a f7143d;

    /* renamed from: e */
    private Context f7144e;

    /* renamed from: f */
    private final C0657e f7145f;

    /* renamed from: g */
    private final ViewfinderView f7146g;

    /* renamed from: h */
    private boolean f7147h;

    /* renamed from: i */
    private boolean f7148i;

    /* renamed from: j */
    private boolean f7149j;

    /* renamed from: k */
    private A f7150k;

    /* renamed from: l */
    private boolean f7151l;

    /* renamed from: com.huawei.hms.scankit.a$a */
    /* loaded from: classes.dex */
    public enum EnumC0101a {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public HandlerC0627a(Context context, ViewfinderView viewfinderView, B b10, Collection<BarcodeFormat> collection, Map<EnumC0631d, ?> map, String str, C0657e c0657e, Rect rect, int i10, boolean z10, boolean z11) {
        this.f7146g = viewfinderView;
        this.f7140a = b10;
        this.f7142c = i10;
        this.f7144e = context;
        m mVar = new m(context, c0657e, this, collection, map, str, this);
        this.f7141b = mVar;
        mVar.a(rect);
        mVar.a(z11);
        mVar.start();
        this.f7151l = z10;
        c0657e.a(new C(mVar));
        this.f7143d = EnumC0101a.SUCCESS;
        this.f7145f = c0657e;
        c0657e.o();
        com.huawei.hms.scankit.util.a.a("scan-time", "start preview time:" + System.currentTimeMillis());
        f();
        Fb.c(null);
    }

    private com.huawei.hms.scankit.aiscan.common.z b(com.huawei.hms.scankit.aiscan.common.z zVar) {
        float b10;
        float c10;
        int max;
        Point a10 = com.huawei.hms.scankit.util.c.a(this.f7144e);
        Point e10 = this.f7145f.e();
        int i10 = a10.x;
        int i11 = a10.y;
        if (i10 < i11) {
            float f10 = (i11 * 1.0f) / e10.x;
            b10 = (zVar.b() * ((i10 * 1.0f) / e10.y)) - (Math.max(a10.x, e10.y) / 2.0f);
            c10 = zVar.c() * f10;
            max = Math.min(a10.y, e10.x);
        } else {
            float f11 = (i11 * 1.0f) / e10.y;
            b10 = (zVar.b() * ((i10 * 1.0f) / e10.x)) - (Math.min(a10.y, e10.y) / 2.0f);
            c10 = zVar.c() * f11;
            max = Math.max(a10.x, e10.x);
        }
        return new com.huawei.hms.scankit.aiscan.common.z(b10, c10 - (max / 2.0f));
    }

    public void a(A a10) {
        this.f7150k = a10;
    }

    @Override // com.huawei.hms.scankit.aiscan.common.A
    public void a(com.huawei.hms.scankit.aiscan.common.z zVar) {
        if (this.f7146g != null) {
            this.f7146g.a(b(zVar));
        }
    }

    public void a(boolean z10) {
        this.f7148i = z10;
    }

    public boolean a() {
        A a10 = this.f7150k;
        if (a10 != null) {
            return a10.a();
        }
        return false;
    }

    public int b() {
        return this.f7142c;
    }

    public void b(boolean z10) {
        this.f7149j = z10;
    }

    public void c(boolean z10) {
        this.f7147h = z10;
    }

    public boolean c() {
        return this.f7148i;
    }

    public boolean d() {
        return this.f7149j;
    }

    public void e() {
        this.f7143d = EnumC0101a.DONE;
        this.f7145f.p();
        Message.obtain(this.f7141b.a(), R.id.scankit_quit).sendToTarget();
        try {
            this.f7141b.b();
            this.f7141b.join(50L);
        } catch (InterruptedException unused) {
            com.huawei.hms.scankit.util.a.d("CaptureHandler", "quitSynchronously   wait interrupt");
        }
        removeMessages(R.id.scankit_decode_succeeded);
        removeMessages(R.id.scankit_decode_failed);
    }

    public void f() {
        if (this.f7143d == EnumC0101a.SUCCESS) {
            this.f7143d = EnumC0101a.PREVIEW;
            this.f7145f.n();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        HmsScan hmsScan;
        int i10 = message.what;
        if (i10 != R.id.scankit_restart_preview) {
            if (i10 != R.id.scankit_decode_succeeded) {
                if (i10 == R.id.scankit_decode_failed) {
                    this.f7143d = EnumC0101a.PREVIEW;
                    this.f7145f.n();
                    return;
                }
                return;
            }
            this.f7143d = EnumC0101a.SUCCESS;
            Object obj = message.obj;
            if (!(obj instanceof HmsScan[])) {
                return;
            }
            HmsScan[] hmsScanArr = (HmsScan[]) obj;
            if (hmsScanArr.length <= 0 || (hmsScan = hmsScanArr[0]) == null || TextUtils.isEmpty(hmsScan.originalValue)) {
                com.huawei.hms.scankit.util.a.c("CaptureHandler", "retrieve  HmsScan lenth is 0");
            } else {
                com.huawei.hms.scankit.util.a.c("CaptureHandler", "scan successful");
                Bitmap bitmap = null;
                float f10 = 0.0f;
                if (this.f7148i) {
                    com.huawei.hms.scankit.util.a.c("CaptureHandler", "scan successful & return bitmap");
                    Bundle data = message.getData();
                    if (data != null) {
                        byte[] byteArray = data.getByteArray("barcode_bitmap");
                        f10 = data.getFloat("barcode_scaled_factor", 0.0f);
                        if (byteArray != null && byteArray.length > 0) {
                            bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                        }
                    }
                }
                this.f7140a.a(hmsScanArr, bitmap, f10);
                if (!this.f7151l) {
                    return;
                }
            }
        }
        f();
    }
}
