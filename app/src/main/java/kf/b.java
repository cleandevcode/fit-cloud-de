package kf;

import android.hardware.usb.UsbDevice;
import android.os.Build;
import android.support.v4.media.d;
import androidx.appcompat.widget.e2;
import androidx.fragment.app.h1;
import com.realsil.sdk.core.usb.UsbGatt;
import com.realsil.sdk.core.usb.UsbGattCallback;
import com.realsil.sdk.dfu.DfuService;
import df.g;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuBaseService;
import yb.y;
import ze.e;
import ze.j;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: s0 */
    public UUID f18468s0;

    /* renamed from: t0 */
    public final a f18469t0;

    /* loaded from: classes.dex */
    public class a extends UsbGattCallback {
    }

    public b(DfuService dfuService, e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
        UUID uuid = g.f13019a;
        this.f18468s0 = g.f13020b;
        this.f18469t0 = new a();
    }

    public final boolean P() {
        try {
            ge.b.e("<< OPCODE_DFU_RESET_SYSTEM (0x05)", this.f29221a);
            K(new byte[]{5}, true);
            return false;
        } catch (ie.a e10) {
            ge.b.d(String.format("Send OPCODE_DFU_RESET_SYSTEM failed, ignore it, errorcode= 0x%04X", Integer.valueOf(e10.f16770b)));
            this.D = 0;
            return false;
        }
    }

    public final boolean Q() {
        if (!(!this.f29233h)) {
            c(4128, true);
            return false;
        } else if (s().f32268r && !k()) {
            c(4113, false);
            return false;
        } else {
            z(521);
            ge.b.d(String.format("mOtaWorkMode=0x%04X, ICType=%2X", Integer.valueOf(this.Q), Integer.valueOf(s().f32261k)));
            if (this.f29221a) {
                ge.b.n(r().toString());
            }
            if (Build.VERSION.SDK_INT >= 23) {
                L(this.f18471o0);
            }
            if (s().f32261k <= 3) {
                if (this.Q == 16 && q().F) {
                    try {
                        Thread.sleep(q().H * 1000);
                    } catch (InterruptedException unused) {
                    }
                }
                ge.b.p("no mControlPointCharacteristic found");
                this.Z = 0;
                boolean z10 = this.f29221a;
                StringBuilder a10 = d.a("mRemoteOtaFunctionInfo=");
                a10.append(this.Z);
                ge.b.o(a10.toString(), z10);
                if (this.Z == 1) {
                    ge.b.d("<<  OPCODE_DFU_REPORT_CURRENT_BUFFER_SIZE(0x0A)");
                    K(new byte[]{10}, false);
                    ge.b.e("... Reading OPCODE_DFU_REPORT_CURRENT_BUFFER_SIZE notification", this.f29221a);
                    W();
                    throw null;
                }
            } else {
                StringBuilder a11 = d.a("isBufferCheckEnabled=");
                a11.append(s().f32267q);
                ge.b.d(a11.toString());
                if (s().f32267q) {
                    ge.b.p("no mControlPointCharacteristic found");
                }
                this.Z = 0;
                boolean z11 = this.f29221a;
                StringBuilder a12 = d.a("mRemoteOtaFunctionInfo=");
                a12.append(this.Z);
                ge.b.o(a12.toString(), z11);
            }
            r().i();
            int i10 = r().f32324i;
            ge.b.e("<< OPCODE_DFU_REPORT_TARGET_IMAGE_INFO(0x06)", this.f29221a);
            K(new byte[]{6, (byte) (i10 & 255), (byte) ((i10 >> 8) & 255)}, false);
            ge.b.e("... Reading OPCODE_DFU_REPORT_TARGET_IMAGE_INFO(0x06) notification", this.f29221a);
            W();
            throw ye.b.a("0x%02X, Get target image info failed", new Object[]{766}, "Get target image info failed", 766);
        }
    }

    public final int R(String str, int i10) {
        int i11 = 0;
        while (!this.f29233h) {
            int S = S(str);
            if (S == 0) {
                return 0;
            }
            if ((S & (-2049)) != 133) {
                M(this.f18471o0);
            } else {
                ge.b.p("connect fail with GATT_ERROR, do not need disconnect");
            }
            H(this.f18471o0);
            try {
                Thread.sleep(1600L);
            } catch (InterruptedException unused) {
            }
            i11++;
            boolean z10 = this.f29221a;
            ge.b.e("tryConnectTime=" + i11, z10);
            if (i11 > i10) {
                return S;
            }
        }
        return 4128;
    }

    public final int S(String str) {
        int i10;
        B(DfuBaseService.ERROR_REMOTE_TYPE_LEGACY);
        this.D = 0;
        this.f29239k = false;
        boolean z10 = this.f29221a;
        StringBuilder a10 = d.a("Connecting to device...");
        a10.append(p.b.m(str));
        ge.b.e(a10.toString(), z10);
        UsbDevice E = E(str);
        UsbGatt usbGatt = null;
        if (E == null) {
            ge.b.p("device is null");
            this.f18471o0 = null;
            return DfuBaseService.ERROR_REMOTE_TYPE_LEGACY;
        }
        this.f18470n0.unRegisterCallback(str, this.f18469t0);
        if (this.f18470n0.connect(E, this.f29223c, this.f18469t0)) {
            usbGatt = this.f18470n0.getBluetoothGatt(str);
            this.f18471o0 = usbGatt;
            try {
                synchronized (this.f29241l) {
                    if (!this.f29239k && this.D == 0) {
                        boolean z11 = this.f29221a;
                        ge.b.e("wait for connect gatt for " + q().a() + " ms", z11);
                        this.f29241l.wait(q().a());
                    }
                }
            } catch (InterruptedException e10) {
                StringBuilder a11 = d.a("Sleeping interrupted : ");
                a11.append(e10.toString());
                ge.b.p(a11.toString());
                this.D = 259;
            }
        } else {
            this.D = DfuBaseService.ERROR_REMOTE_TYPE_LEGACY;
        }
        if (this.D == 0) {
            if (!this.f29239k) {
                ge.b.p("wait for connect, but can not connect with no callback");
                i10 = 260;
            } else if (usbGatt == null || this.f29243m != 515) {
                StringBuilder a12 = d.a("connect with some error, please check. mConnectionState=");
                a12.append(this.f29243m);
                ge.b.p(a12.toString());
                i10 = 264;
            }
            this.D = i10;
        }
        if (this.D == 0) {
            ge.b.o("connected the device which going to upgrade", this.f29221a);
        }
        return this.D;
    }

    public final void T(byte[] bArr) {
        boolean z10;
        z(524);
        int i10 = 4128;
        if (!this.f29233h) {
            boolean z11 = false;
            try {
                ge.b.d("<< OPCODE_DFU_ACTIVE_IMAGE_RESET(0x04)");
                K(bArr, false);
                z10 = false;
            } catch (ie.a e10) {
                if (e10.f16770b != 4128) {
                    if (!q().f32303o) {
                        ge.b.d("active cmd has no response, ignore");
                        z10 = true;
                    } else {
                        ge.b.p("active cmd has no response, notify error");
                        i10 = e10.f16770b;
                    }
                }
            }
            z11 = z10;
            i10 = 0;
            if (z11) {
                ge.b.d("image active success");
                N(this.D);
                n(this.f29254x);
                return;
            }
            throw new ne.c(i10);
        }
        throw new ne.c("user aborted", 4128);
    }

    public final boolean U() {
        String str = this.F;
        if (!this.f29233h) {
            z(516);
            int R = R(str, q().C);
            if (R == 0) {
                StringBuilder a10 = d.a("not found DFU_CONTROL_POINT_UUID : ");
                a10.append(this.f18468s0.toString());
                ge.b.p(a10.toString());
                if (!this.f29235i) {
                    this.f29235i = false;
                    z(517);
                    try {
                        Thread.sleep(1500L);
                    } catch (InterruptedException unused) {
                    }
                    this.X = new j(this.f29225d);
                    if (s().f32261k != 5 && s().f32261k != 9 && s().f32261k != 4 && s().f32261k != 6 && s().f32261k != 7 && s().f32261k != 8 && s().f32261k != 11) {
                        int i10 = s().f32261k;
                    }
                    if (s().f32262l != 0) {
                        s().z(null);
                        ge.b.e("no ImageVersionCharacteristics to read", this.f29221a);
                    }
                    if (this.f29221a) {
                        ge.b.d(s().toString());
                    }
                    G();
                    this.f29235i = true;
                    ge.b.d("Ota Environment prepared.");
                } else {
                    F();
                }
                if (this.f29254x != null) {
                    return true;
                }
                i(DfuBaseService.ERROR_FILE_NOT_FOUND);
                return false;
            } else if (R == 4128) {
                throw new ne.c("aborted, connectRemoteDevice failed", R);
            } else {
                throw new ne.c("connectRemoteDevice failed", R);
            }
        }
        throw new ne.c("user aborted", 4128);
    }

    public final void V() {
        boolean z10;
        z(514);
        this.F = this.H;
        if (this.Q != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29237j = z10;
        if (!(!this.f29233h)) {
            c(4128, true);
            return;
        }
        try {
            if (!U()) {
                return;
            }
            Q();
        } catch (ie.a e10) {
            h1.b(this.f29252v, new StringBuilder(), ", ", e10);
            int i10 = e10.f16770b;
            if (i10 == 4128) {
                c(i10, true);
                return;
            }
            if (i10 != 4097 && i10 != 265) {
                P();
            }
            c(i10, false);
        }
    }

    public final byte[] W() {
        long j10 = q().f32296k0;
        this.D = 0;
        this.f18472p0 = true;
        try {
            synchronized (this.W) {
                if (this.D == 0 && this.f29243m == 515) {
                    this.f18472p0 = false;
                    boolean z10 = this.f29221a;
                    ge.b.o("wait for notification, wait for " + j10 + "ms", z10);
                    this.W.wait(j10);
                }
                if (this.D == 0 && !this.f18472p0) {
                    ge.b.p("wait for notification, but not come");
                    this.D = 767;
                }
            }
        } catch (InterruptedException e10) {
            StringBuilder a10 = d.a("readNotificationResponse interrupted, ");
            a10.append(e10.toString());
            ge.b.p(a10.toString());
            this.D = 259;
        }
        if (this.D == 0) {
            return null;
        }
        throw new ne.c("Unable to receive notification", this.D);
    }

    @Override // ve.a
    public final void c(int i10, boolean z10) {
        if (this.f29233h) {
            i10 = 4128;
        }
        if (i10 != 4128) {
            z(260);
        }
        ge.b.n(String.format("error = 0x%04X, needReset=%b", Integer.valueOf(i10), Boolean.valueOf(z10)));
        if (z10) {
            P();
        }
        n(this.f29254x);
        if (q().e(1)) {
            N(i10);
        }
        y yVar = this.f29229f;
        if (yVar != null) {
            yVar.z(i10);
        }
        this.f29233h = true;
    }

    @Override // ve.a
    public final boolean g(boolean z10) {
        if (!super.g(z10)) {
            return false;
        }
        if (this.f29243m != 515) {
            boolean z11 = this.f29221a;
            StringBuilder a10 = d.a("start to re-connect the RCU which going to active image, current state is: ");
            a10.append(this.f29243m);
            ge.b.e(a10.toString(), z11);
            int R = R(this.F, q().C);
            if (R != 0) {
                StringBuilder a11 = e2.a("Something error in OTA process, errorCode: ", R, "mProcessState");
                a11.append(this.f29252v);
                ge.b.f(a11.toString());
                c(R, true);
                return false;
            }
        }
        if (z10) {
            try {
                T(new byte[]{4});
                z(258);
            } catch (ie.a e10) {
                ge.b.p(e10.toString());
                c(e10.f16770b, false);
            }
        } else {
            P();
            c(274, false);
        }
        return true;
    }

    @Override // ve.a
    public final void o() {
        int v10;
        try {
            setName("ProcessorXU0000");
            ge.b.k("ProcessorXU0000 running.");
            v10 = v();
        } catch (Exception e10) {
            ge.b.p(e10.toString());
            c(0, false);
        }
        if (v10 != 0) {
            c(v10, false);
            return;
        }
        V();
        n(this.f29254x);
        ge.b.e("GattDfuTaskX0000 stopped", this.f29221a);
        if (this.f29252v == 525) {
            z(259);
        }
    }

    @Override // kf.c, kf.a, ve.a
    public final void u() {
        super.u();
        try {
            UUID.fromString(q().U);
            this.f18468s0 = UUID.fromString(q().V);
        } catch (Exception e10) {
            ge.b.p(e10.toString());
        }
        this.f29231g = true;
    }
}
