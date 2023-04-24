package kf;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.support.v4.media.d;
import android.text.TextUtils;
import com.realsil.sdk.dfu.DfuService;
import java.util.ArrayList;
import java.util.HashMap;
import no.nordicsemi.android.dfu.DfuBaseService;
import re.b;
import ze.e;
import ze.g;
import ze.j;

/* loaded from: classes.dex */
public abstract class a extends ve.a {

    /* renamed from: m0 */
    public UsbManager f18467m0;

    public a(DfuService dfuService, e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
        u();
    }

    public final UsbDevice E(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        UsbManager usbManager = this.f18467m0;
        if (usbManager == null) {
            ge.b.p("mUsbManager == null");
            return null;
        }
        HashMap<String, UsbDevice> deviceList = usbManager.getDeviceList();
        if (deviceList == null || deviceList.size() <= 0) {
            ge.b.d("no usb device exist");
            return null;
        }
        return deviceList.get(str);
    }

    public final void F() {
        int i10 = r().f32319d;
        int i11 = r().f32322g;
        if (i11 < 0 || i11 >= i10) {
            ge.b.d("invalid FileIndex: " + i11 + ", reset to 0");
            i11 = 0;
        }
        r().f32320e = i11;
        te.a aVar = (te.a) this.f29253w.get(i11);
        this.f29254x = aVar;
        if (aVar != null) {
            g r10 = r();
            te.a aVar2 = this.f29254x;
            r10.d(aVar2.f28058o, aVar2.f28053j, aVar2.f28055l, aVar2.s(), q().f32299m);
        } else {
            ge.b.p("mCurBinInputStream == null");
        }
        int i12 = i11 + 1;
        if (i12 < i10) {
            this.f29255y = (te.a) this.f29253w.get(i12);
            this.f29256z = i12;
            return;
        }
        this.f29255y = null;
        this.f29256z = -1;
    }

    public final void G() {
        n(this.f29254x);
        b.a aVar = new b.a();
        aVar.f25577e = q().f32281d;
        aVar.f25574b = q().f32285f;
        aVar.f25575c = this.L;
        aVar.f25576d = q().b();
        aVar.f25573a = this.f29223c;
        aVar.f25582j = this.M;
        aVar.f25594v = q().f32298l0;
        aVar.f25583k = s();
        aVar.f25586n = q().f();
        aVar.f25587o = q().g();
        boolean h10 = q().h();
        int i10 = q().f32295k;
        aVar.f25584l = h10;
        aVar.f25585m = i10;
        ArrayList x10 = cf.b.x(aVar.a());
        this.f29253w = x10;
        if (x10 != null && x10.size() > 0) {
            if (r().f32322g == 0) {
                int[] iArr = new int[this.f29253w.size()];
            }
            r().f32319d = this.f29253w.size();
            ge.b.n(r().toString());
            F();
            return;
        }
        ge.b.p("pendingImageInputStreams == null || pendingImageInputStreams.size() <= 0");
        throw new ne.c("load image file error", DfuBaseService.ERROR_FILE_NOT_FOUND);
    }

    @Override // ve.a
    public void u() {
        super.u();
        this.X = new j(this.f29225d);
        if (this.f18467m0 == null) {
            UsbManager usbManager = (UsbManager) this.f29223c.getSystemService("usb");
            this.f18467m0 = usbManager;
            if (usbManager == null) {
                ge.b.p("Unable to initialize mUsbManager.");
            }
        }
    }

    @Override // ve.a
    public final int v() {
        int v10 = super.v();
        if (v10 != 0) {
            return v10;
        }
        if (TextUtils.isEmpty(this.H)) {
            if (this.f29221a) {
                StringBuilder a10 = d.a("invalid address: ");
                a10.append(this.H);
                ge.b.p(a10.toString());
                return 4112;
            }
            ge.b.p("invalid address: ");
            return 4112;
        }
        return 0;
    }
}
