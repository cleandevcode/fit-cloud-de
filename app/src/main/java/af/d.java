package af;

import a0.g2;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import androidx.appcompat.widget.e2;
import androidx.fragment.app.h1;
import com.realsil.sdk.dfu.DfuService;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class d extends b {
    public d(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
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
                ge.b.f(a10.toString());
                c(b02, true);
                return false;
            }
        }
        if (z10) {
            try {
                w0();
                z(258);
            } catch (ie.a e10) {
                ge.b.p(e10.toString());
                c(e10.f16770b, false);
            }
        } else {
            n0();
            c(274, false);
        }
        return true;
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
                        ge.b.o("wait hid device back connect", this.f29222b);
                        d(15000L);
                        return;
                    }
                    boolean z10 = this.f29222b;
                    StringBuilder a10 = android.support.v4.media.d.a("HID device alreay connected:");
                    a10.append(bluetoothDevice.getAddress());
                    ge.b.o(a10.toString(), z10);
                } else {
                    ge.b.o("device not paired, wait back connect", this.f29222b);
                }
                super.t();
            }
        } else {
            str = "wait back connect";
        }
        ge.b.n(str);
        super.t();
    }

    @Override // af.b
    public final boolean y0() {
        boolean z10;
        te.a aVar;
        int i10;
        z(514);
        this.F = this.H;
        this.f29237j = true;
        boolean z11 = false;
        while (!this.f29233h) {
            try {
                h0(this.F);
                j0();
                if (!this.f29235i) {
                    m0();
                } else {
                    J();
                }
                if (this.f29254x == null) {
                    c(DfuBaseService.ERROR_FILE_NOT_FOUND, false);
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (ie.a e10) {
                h1.b(this.f29252v, new StringBuilder(), ", ", e10);
                int i11 = e10.f16770b;
                if (i11 == 4128) {
                    c(i11, true);
                } else {
                    if (i11 != 4097 && i11 != 265) {
                        n0();
                    }
                    c(i11, false);
                }
            }
            if (!z10 || !z0()) {
                return false;
            }
            this.A += r().f32317b;
            if (r().f()) {
                ge.b.n("no pending image file to upload.");
                r().f32327l = this.A;
                if (!this.U) {
                    i10 = 523;
                } else {
                    w0();
                    i10 = 258;
                }
                z(i10);
                z11 = true;
            } else {
                ge.b.n("has pending image file to upload");
                if (s().O == 1) {
                    this.F = this.H;
                    this.f29237j = true;
                    this.A = 0;
                    w0();
                } else if (s().O == 3 && (aVar = this.f29255y) != null && e0(aVar, this.A, s().E * 4096)) {
                    ge.b.d("make device to enter the ota advertiser mode, and let the app continue update image");
                    this.f29237j = true;
                    this.A = 0;
                    q0();
                }
                t();
            }
            try {
                Thread.sleep(1000L);
                continue;
            } catch (InterruptedException unused) {
                continue;
            }
            if (z11) {
                return z11;
            }
        }
        c(4128, true);
        return false;
    }

    public final boolean z0() {
        int q10;
        if (!l0()) {
            return false;
        }
        if (!s().f32267q) {
            this.Z = 0;
        } else {
            this.Z = x0();
        }
        if (this.f29222b) {
            zd.b.a(android.support.v4.media.d.a("mRemoteOtaFunctionInfo="), this.Z);
        }
        r().i();
        s0(10131);
        t0(r().f32324i);
        if (!q().f32301n) {
            this.f29224c0 = 0;
            ge.b.d(String.format(Locale.US, "BreakpointResume disable: mImageUpdateOffset=0x%08X(%d)", 0, Integer.valueOf(this.f29224c0)));
        }
        if (this.f29224c0 == 0) {
            o0();
        }
        if (this.f29224c0 - 12 >= r().f32316a) {
            ge.b.d("Last send reach the bottom");
        } else {
            u0(r().f32324i);
            if (this.Z == 1) {
                p0(this.f30506v0, this.N0, this.f29254x);
            } else {
                BluetoothGatt bluetoothGatt = this.f30506v0;
                BluetoothGattCharacteristic bluetoothGattCharacteristic = this.N0;
                te.a aVar = this.f29254x;
                ge.b.n("uploadFirmwareImage");
                m();
                this.D = 0;
                this.f29251u = false;
                int i10 = this.V;
                byte[] bArr = new byte[i10];
                while (true) {
                    if (this.f29251u) {
                        break;
                    } else if (!this.f29233h) {
                        C();
                        if (this.f29221a) {
                            ge.b.n(r().toString());
                        }
                        try {
                            if (this.f29224c0 == 0) {
                                int i11 = this.V;
                                byte[] bArr2 = new byte[i11];
                                aVar.q(i11 - 12, bArr2);
                                System.arraycopy(aVar.f28050g, 0, bArr, 0, 12);
                                System.arraycopy(bArr2, 0, bArr, 12, this.V - 12);
                                q10 = this.V;
                            } else {
                                q10 = aVar.q(i10, bArr);
                            }
                            ze.g r10 = r();
                            if (r10.f32316a - r10.f32317b < this.V) {
                                ge.b.n("reach the end of the file, only read some");
                                ze.g r11 = r();
                                q10 = r11.f32316a - r11.f32317b;
                            }
                            if (q10 <= 0) {
                                if (r().e()) {
                                    ge.b.k("image file has already been send over");
                                } else {
                                    ge.b.f("Error while reading file with size: " + q10);
                                    throw new ne.c("Error while reading file", 257);
                                }
                            } else {
                                if (s().f32268r) {
                                    for (int i12 = q10; i12 > 0; i12 -= 16) {
                                        if (i12 >= 16) {
                                            int i13 = q10 - i12;
                                            System.arraycopy(this.C.a(bArr, i13, 16), 0, bArr, i13, 16);
                                            if (s().f32269s == 0) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                M(bluetoothGatt, bluetoothGattCharacteristic, bArr, q10);
                                I();
                                l();
                            }
                        } catch (IOException unused) {
                            throw new ne.c("Error while reading file", 257);
                        }
                    } else {
                        throw new ne.c("user aborted", 4128);
                    }
                }
            }
        }
        r().g();
        v0(r().f32324i);
        return true;
    }
}
