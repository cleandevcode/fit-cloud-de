package ye;

import a0.g2;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import androidx.appcompat.widget.e2;
import androidx.fragment.app.h1;
import com.realsil.sdk.dfu.DfuService;
import java.io.IOException;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;
import ze.g;

/* loaded from: classes.dex */
public final class e extends c {
    public e(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
    }

    public final boolean E0() {
        boolean z10;
        int q10;
        te.a aVar;
        int i10;
        if (!l0()) {
            return false;
        }
        if (s().f32251a0) {
            D0();
        }
        if (s().f32261k <= 3) {
            if (q().F) {
                try {
                    Thread.sleep(q().H * 1000);
                } catch (InterruptedException unused) {
                }
            }
            this.Z = q0();
            if (this.f29221a) {
                zd.b.a(android.support.v4.media.d.a("mRemoteOtaFunctionInfo="), this.Z);
            }
            if (this.Z == 1) {
                o0();
            }
        } else {
            if (this.f29221a) {
                StringBuilder a10 = android.support.v4.media.d.a("isBufferCheckEnabled=");
                a10.append(s().f32267q);
                ge.b.d(a10.toString());
            }
            if (!s().f32267q) {
                this.Z = 0;
            } else {
                this.Z = p0();
            }
            if (this.f29221a) {
                zd.b.a(android.support.v4.media.d.a("mRemoteOtaFunctionInfo="), this.Z);
            }
        }
        c0((byte) 7);
        r().i();
        if (s().f32262l != 2 && s().f32262l != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            x0(r().f32324i);
        }
        y0(r().f32324i);
        if (!q().f32301n) {
            this.f29224c0 = 0;
            ge.b.e(String.format(Locale.US, "BreakpointResume disable: mImageUpdateOffset=0x%08X(%d)", 0, Integer.valueOf(this.f29224c0)), this.f29221a);
        }
        if (this.f29224c0 == 0) {
            s0();
        }
        int i11 = 12;
        if (this.f29224c0 - 12 >= r().f32316a) {
            ge.b.d("Last send reach the bottom");
        } else {
            int i12 = 257;
            if (s().f32261k <= 3) {
                A0(r().f32324i);
                if (this.Z == 1) {
                    t0(this.f30506v0, this.N0, this.f29254x);
                } else {
                    BluetoothGatt bluetoothGatt = this.f30506v0;
                    BluetoothGattCharacteristic bluetoothGattCharacteristic = this.N0;
                    te.a aVar2 = this.f29254x;
                    m();
                    this.D = 0;
                    this.f29251u = false;
                    int i13 = this.V;
                    byte[] bArr = new byte[i13];
                    while (true) {
                        if (this.f29251u) {
                            break;
                        } else if (!this.f29233h) {
                            e(aVar2);
                            if (this.f29221a) {
                                ge.b.n(r().toString());
                            }
                            C();
                            try {
                                int q11 = aVar2.q(i13, bArr);
                                g r10 = r();
                                if (r10.f32316a - r10.f32317b < this.V) {
                                    if (this.f29221a) {
                                        ge.b.n("reach the end of the file, only read some");
                                    }
                                    g r11 = r();
                                    q11 = r11.f32316a - r11.f32317b;
                                }
                                if (q11 <= 0) {
                                    if (r().e()) {
                                        ge.b.k("image file has already been send over");
                                    } else {
                                        ge.b.f("Error while reading file with size: " + q11);
                                        throw new ne.c("Error while reading file", i12);
                                    }
                                } else {
                                    if (s().f32268r) {
                                        int i14 = q11;
                                        while (i14 > 0) {
                                            if (i14 >= 16) {
                                                int i15 = q11 - i14;
                                                i10 = i13;
                                                System.arraycopy(this.C.a(bArr, i15, 16), 0, bArr, i15, 16);
                                                if (s().f32269s == 0) {
                                                    break;
                                                }
                                            } else {
                                                i10 = i13;
                                            }
                                            i14 -= 16;
                                            i13 = i10;
                                        }
                                    }
                                    i10 = i13;
                                    M(bluetoothGatt, bluetoothGattCharacteristic, bArr, q11);
                                    I();
                                    l();
                                    i12 = 257;
                                    i13 = i10;
                                }
                            } catch (IOException unused2) {
                                throw new ne.c("Error while reading file", 257);
                            }
                        } else {
                            throw new ne.c("user aborted", 4128);
                        }
                    }
                }
            } else {
                z0(r().f32324i);
                if (this.Z == 1) {
                    v0(this.f30506v0, this.N0);
                } else {
                    BluetoothGatt bluetoothGatt2 = this.f30506v0;
                    BluetoothGattCharacteristic bluetoothGattCharacteristic2 = this.N0;
                    te.a aVar3 = this.f29254x;
                    ge.b.e("uploadFirmwareImageForBeeUpdate", this.f29221a);
                    m();
                    this.D = 0;
                    this.f29251u = false;
                    int i16 = this.V;
                    byte[] bArr2 = new byte[i16];
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
                                    int i17 = this.V;
                                    byte[] bArr3 = new byte[i17];
                                    aVar3.q(i17 - 12, bArr3);
                                    System.arraycopy(aVar3.f28050g, 0, bArr2, 0, i11);
                                    System.arraycopy(bArr3, 0, bArr2, i11, this.V - i11);
                                    q10 = this.V;
                                } else {
                                    q10 = aVar3.q(i16, bArr2);
                                }
                                g r12 = r();
                                if (r12.f32316a - r12.f32317b < this.V) {
                                    ge.b.n("reach the end of the file, only read some");
                                    g r13 = r();
                                    q10 = r13.f32316a - r13.f32317b;
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
                                        int i18 = q10;
                                        while (i18 > 0) {
                                            if (i18 >= 16) {
                                                int i19 = q10 - i18;
                                                aVar = aVar3;
                                                System.arraycopy(this.C.a(bArr2, i19, 16), 0, bArr2, i19, 16);
                                                if (s().f32269s == 0) {
                                                    break;
                                                }
                                            } else {
                                                aVar = aVar3;
                                            }
                                            i18 -= 16;
                                            aVar3 = aVar;
                                        }
                                    }
                                    aVar = aVar3;
                                    M(bluetoothGatt2, bluetoothGattCharacteristic2, bArr2, q10);
                                    I();
                                    l();
                                    i11 = 12;
                                    aVar3 = aVar;
                                }
                            } catch (IOException unused3) {
                                throw new ne.c("Error while reading file", 257);
                            }
                        } else {
                            throw new ne.c("user aborted", 4128);
                        }
                    }
                }
            }
        }
        r().g();
        x();
        B0(r().f32324i);
        return true;
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
                C0();
                z(258);
            } catch (ie.a e10) {
                c(e10.f16770b, false);
            }
        } else {
            r0();
            c(274, false);
        }
        return true;
    }

    @Override // ye.c
    public final boolean m0() {
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
                    n0();
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
                        r0();
                    }
                    c(i11, false);
                }
            }
            if (!z10 || !E0()) {
                return false;
            }
            this.A += r().f32317b;
            if (r().f()) {
                ge.b.d("no pending image file to upload.");
                r().f32327l = this.A;
                if (!this.U) {
                    i10 = 523;
                } else {
                    C0();
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
                    C0();
                } else if (s().O == 3 && (aVar = this.f29255y) != null && e0(aVar, this.A, s().E * 4096)) {
                    ge.b.d("make device to enter the ota advertiser mode, and let the app continue update image");
                    this.f29237j = true;
                    this.A = 0;
                    w0(new byte[]{4, 1});
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
}
