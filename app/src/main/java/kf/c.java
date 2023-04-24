package kf;

import android.annotation.TargetApi;
import android.hardware.usb.UsbDevice;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.d;
import com.realsil.sdk.core.usb.GlobalUsbGatt;
import com.realsil.sdk.core.usb.UsbGatt;
import com.realsil.sdk.dfu.DfuService;
import no.nordicsemi.android.dfu.DfuBaseService;
import xe.m;
import ze.e;

/* loaded from: classes.dex */
public abstract class c extends kf.a implements m {

    /* renamed from: n0 */
    public GlobalUsbGatt f18470n0;

    /* renamed from: o0 */
    public UsbGatt f18471o0;

    /* renamed from: p0 */
    public volatile boolean f18472p0;

    /* renamed from: q0 */
    public Handler f18473q0;

    /* renamed from: r0 */
    public a f18474r0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            c.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            if (cVar.f29243m == 513) {
                cVar.O();
            }
        }
    }

    public c(DfuService dfuService, e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
        this.f18472p0 = false;
        this.f18473q0 = new Handler(Looper.getMainLooper());
        this.f18474r0 = new a();
    }

    public final void H(UsbGatt usbGatt) {
        if (usbGatt != null) {
            UsbDevice device = usbGatt.getDevice();
            boolean z10 = this.f29221a;
            StringBuilder a10 = d.a("close gatt connection: ");
            a10.append(device.getDeviceName());
            ge.b.e(a10.toString(), z10);
            GlobalUsbGatt globalUsbGatt = this.f18470n0;
            if (globalUsbGatt != null) {
                globalUsbGatt.closeGatt(device.getDeviceName());
            } else {
                usbGatt.close();
            }
        }
        B(1280);
    }

    public final boolean I(UsbGatt usbGatt, byte[] bArr, int i10) {
        ge.b.p(usbGatt == null ? "gatt == null" : "characteristic == null");
        return false;
    }

    public final boolean J(UsbGatt usbGatt, byte[] bArr, int i10, boolean z10) {
        if (!z10 && this.f29233h) {
            throw new ne.c("user aborted", 4128);
        }
        if (i10 < 0) {
            ge.b.p("value == null || size < 0");
            return false;
        }
        this.f29250t = true;
        int i11 = 0;
        while (this.f29250t) {
            this.f29248r = false;
            if (i11 > 0) {
                ge.b.e("re-send command just wait a while", this.f29221a);
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
                if (!z10 && this.f29233h) {
                    throw new ne.c("user aborted", 4128);
                }
            }
            I(usbGatt, bArr, i10);
            ge.b.p("writePacket failed");
            this.D = 267;
            if (this.D == 0 && i11 > 3) {
                ge.b.p("send command reach max try time");
                this.D = 268;
            } else {
                i11++;
            }
            if (this.D != 0) {
                throw new ne.c("Error while send command", this.D);
            }
        }
        return false;
    }

    public final boolean K(byte[] bArr, boolean z10) {
        J(this.f18471o0, bArr, bArr.length, z10);
        return false;
    }

    @TargetApi(23)
    public final void L(UsbGatt usbGatt) {
        this.D = 0;
        ge.b.e("requestMtu: 256", this.f29221a);
        if (!usbGatt.requestMtu((int) DfuBaseService.ERROR_REMOTE_TYPE_LEGACY)) {
            ge.b.p("requestMtu failed");
            return;
        }
        try {
            synchronized (this.W) {
                if (this.D == 0) {
                    if (this.f29222b) {
                        ge.b.n("wait mtu request callback for 15000ms");
                    }
                    this.W.wait(15000L);
                }
            }
        } catch (InterruptedException e10) {
            ge.b.p("requestMtu: Sleeping interrupted, e = " + e10);
        }
        if (this.D == 0) {
            ge.b.e("requestMtu No CallBack", this.f29221a);
        }
    }

    public final void M(UsbGatt usbGatt) {
        int i10 = this.f29243m;
        if (i10 == 0 || i10 == 1280) {
            ge.b.e("already disconnect", this.f29221a);
        } else if (usbGatt == null) {
            ge.b.e("gatt == null", this.f29221a);
            B(0);
        } else {
            B(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
            usbGatt.disconnect();
            D();
        }
    }

    public final void N(int i10) {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException unused) {
        }
        ge.b.d(String.format("terminateConnection, error = 0x%04X", Integer.valueOf(i10)));
        UsbGatt usbGatt = this.f18471o0;
        if (usbGatt != null) {
            M(usbGatt);
            q().getClass();
            H(this.f18471o0);
        }
    }

    public final void O() {
        String str;
        if (this.f18471o0 == null) {
            ge.b.p("mUsbGatt == null");
            this.D = 258;
            w();
        } else if (this.f29233h) {
            ge.b.p("task already aborted, ignore");
        } else {
            ge.b.e("Attempting to start service discovery...", this.f29221a);
            boolean discoverServices = this.f18471o0.discoverServices();
            boolean z10 = this.f29221a;
            StringBuilder a10 = d.a("discoverServices ");
            if (discoverServices) {
                str = "succeed";
            } else {
                str = "failed";
            }
            a10.append(str);
            ge.b.e(a10.toString(), z10);
            if (!discoverServices) {
                this.D = 258;
                w();
            }
        }
    }

    @Override // ve.a
    public final void f() {
        Handler handler = this.f18473q0;
        if (handler != null) {
            handler.removeCallbacks(this.f18474r0);
        }
        super.f();
    }

    @Override // kf.a, ve.a
    public void u() {
        super.u();
        this.f18470n0 = GlobalUsbGatt.getInstance();
    }
}
