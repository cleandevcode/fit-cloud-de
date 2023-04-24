package df;

import a0.g2;
import android.bluetooth.BluetoothDevice;
import androidx.appcompat.widget.e2;
import androidx.fragment.app.h1;
import com.realsil.sdk.dfu.DfuService;
import java.util.Iterator;
import java.util.Set;
import no.nordicsemi.android.dfu.DfuBaseService;
import ze.j;

/* loaded from: classes.dex */
public final class d extends b {
    public d(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
    }

    public final boolean D0() {
        h0(this.F);
        j0();
        if (!this.f29235i) {
            this.f29235i = false;
            z(517);
            try {
                Thread.sleep(1500L);
            } catch (InterruptedException unused) {
            }
            this.X = new j(this.f29225d);
            if (this.G0 != null) {
                if (this.f29222b) {
                    ge.b.n("start to read remote dev info");
                }
                byte[] Q = Q(this.G0);
                if (Q != null) {
                    s().s(0, Q);
                    b(s().D);
                } else {
                    ge.b.f("Get dev info failed");
                    throw new ne.c("get remote dev info failed", 270);
                }
            }
            m0();
            if (this.f29221a) {
                ge.b.d(s().toString());
            }
            K();
            this.f29235i = true;
            ge.b.d("Ota Environment prepared.");
        } else {
            J();
        }
        if (this.f29254x != null) {
            return true;
        }
        c(DfuBaseService.ERROR_FILE_NOT_FOUND, false);
        return false;
    }

    public final boolean E0() {
        te.a aVar;
        int i10;
        z(514);
        this.F = this.H;
        this.f29237j = true;
        boolean z10 = false;
        while (!this.f29233h) {
            try {
            } catch (ie.a e10) {
                h1.b(this.f29252v, new StringBuilder(), ", ", e10);
                int i11 = e10.f16770b;
                if (i11 == 4128) {
                    c(i11, true);
                } else {
                    if (i11 != 4097 && i11 != 265) {
                        p0();
                    }
                    c(i11, false);
                }
            }
            if (!D0() || !F0()) {
                return false;
            }
            this.A += r().f32317b;
            if (r().f()) {
                ge.b.n("no pending image file to upload.");
                r().f32327l = this.A;
                if (!this.U) {
                    i10 = 523;
                } else {
                    B0();
                    A0();
                    i10 = 258;
                }
                z(i10);
                z10 = true;
            } else {
                ge.b.n("has pending image file to upload");
                if (s().O == 1) {
                    this.F = this.H;
                    this.f29237j = true;
                    this.A = 0;
                    B0();
                    A0();
                } else if (s().O == 3 && (aVar = this.f29255y) != null && e0(aVar, this.A, s().E * 4096)) {
                    ge.b.d("make device to enter the ota advertiser mode, and let the app continue update image");
                    this.f29237j = true;
                    this.A = 0;
                    B0();
                    t0();
                }
                t();
            }
            try {
                Thread.sleep(1000L);
                continue;
            } catch (InterruptedException unused) {
                continue;
            }
            if (z10) {
                return z10;
            }
        }
        c(4128, true);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:293:0x023a, code lost:
        r2 = 0;
        r3 = r16;
        r6 = r17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F0() {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: df.d.F0():boolean");
    }

    @Override // ve.a
    public final boolean g(boolean z10) {
        if (!super.g(z10)) {
            return false;
        }
        if (this.f29243m != 515) {
            if (this.f29221a) {
                g2.c(android.support.v4.media.d.a("start to re-connect the RCU which going to active image, current state is: "), this.f29243m);
            }
            int b02 = b0(this.F, q().C);
            if (b02 != 0) {
                StringBuilder a10 = e2.a("Something error in OTA process, errorCode: ", b02, "mProcessState");
                a10.append(this.f29252v);
                ge.b.p(a10.toString());
                c(b02, true);
                return false;
            }
        }
        if (z10) {
            try {
                B0();
                A0();
                z(258);
            } catch (ie.a e10) {
                ge.b.p(e10.toString());
                c(e10.f16770b, false);
            }
        } else {
            p0();
            c(274, false);
        }
        return true;
    }

    @Override // xe.f, we.b, ve.a
    public final void o() {
        super.o();
        int v10 = v();
        if (v10 != 0) {
            c(v10, false);
            return;
        }
        try {
            E0();
            n(this.f29254x);
        } catch (Exception e10) {
            ge.b.p(e10.toString());
            c(0, false);
        }
        if (this.f29221a) {
            ge.b.d("ProcessXG0000S stopped");
        }
        if (this.f29252v == 525) {
            z(259);
        }
    }

    @Override // ve.a
    public final void t() {
        String str;
        if (q().f32290h0) {
            if (this.F == null) {
                str = "invalid mOtaDeviceAddress, wait back connect";
            } else {
                BluetoothDevice bluetoothDevice = null;
                Set<BluetoothDevice> bondedDevices = this.f29798n0.getBondedDevices();
                if (bondedDevices != null && bondedDevices.size() > 0) {
                    Iterator<BluetoothDevice> it = bondedDevices.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        BluetoothDevice next = it.next();
                        if (next != null && this.F.equals(next.getAddress())) {
                            bluetoothDevice = next;
                            break;
                        }
                    }
                }
                if (bluetoothDevice != null) {
                    if (vd.b.f29198l.e(4, bluetoothDevice) != 2) {
                        ge.b.n("wait hid device back connect");
                        d(15000L);
                        return;
                    }
                    StringBuilder a10 = android.support.v4.media.d.a("HID device alreay connected:");
                    a10.append(bluetoothDevice.getAddress());
                    str = a10.toString();
                } else {
                    str = "device not paired, wait back connect";
                }
            }
            ge.b.n(str);
        } else {
            ge.b.o("wait back connect", this.f29221a);
        }
        super.t();
    }
}
