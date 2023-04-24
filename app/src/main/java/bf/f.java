package bf;

import android.text.TextUtils;
import androidx.fragment.app.h1;
import com.realsil.sdk.dfu.DfuService;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;
import ze.j;

/* loaded from: classes.dex */
public final class f extends e {
    public f(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
    }

    public final boolean D0() {
        int i10;
        if (this.f29237j) {
            if (TextUtils.isEmpty(this.F)) {
                O(true);
            }
            g0(this.F);
            if (!this.f29235i) {
                F0();
            } else {
                J();
            }
            if (this.f29254x == null) {
                c(DfuBaseService.ERROR_FILE_NOT_FOUND, false);
                return false;
            }
        } else {
            h0(this.F);
            if (this.E0 == null) {
                StringBuilder a10 = android.support.v4.media.d.a("OTA SERVICE not found:");
                a10.append(this.D0.toString());
                ge.b.p(a10.toString());
                i10 = 262;
            } else if (this.F0 == null) {
                StringBuilder a11 = android.support.v4.media.d.a("not found OTA_CONTROL_ENTER_OTA_MODE_CHARACTERISTIC : ");
                a11.append(h.f4179a.toString());
                ge.b.p(a11.toString());
                i10 = 263;
            } else {
                i10 = 0;
            }
            if (i10 == 0) {
                if (!this.f29235i) {
                    F0();
                } else {
                    J();
                }
                if (this.f29254x == null) {
                    c(DfuBaseService.ERROR_FILE_NOT_FOUND, false);
                    return false;
                } else if (!f0(h.f4182d)) {
                    c(280, false);
                    return false;
                } else {
                    O(true);
                    g0(this.F);
                }
            } else {
                throw new ne.c("load ota service failed", i10);
            }
        }
        j0();
        this.f29237j = true;
        return true;
    }

    public final boolean E0() {
        te.a aVar;
        int i10;
        boolean z10 = false;
        while (!this.f29233h) {
            try {
            } catch (ie.a e10) {
                h1.b(this.f29252v, new StringBuilder(), ", ", e10);
                int i11 = e10.f16770b;
                if (i11 == 4128) {
                    c(i11, true);
                } else {
                    if (i11 != 4097 && i11 != 265 && r0() && this.Q == 0) {
                        D();
                    }
                    c(i11, false);
                }
            }
            if (!D0() || !G0()) {
                return false;
            }
            this.A += r().f32317b;
            if (r().f()) {
                ge.b.d("no pending image file to upload.");
                v0((byte) 1, r().f32324i);
                r().f32327l = this.A;
                if (!this.U) {
                    i10 = 523;
                } else {
                    B0();
                    i10 = 258;
                }
                z(i10);
                z10 = true;
            } else {
                ge.b.d("has pending image file to upload");
                if (s().O == 1) {
                    v0((byte) 1, r().f32324i);
                    this.F = this.H;
                    this.f29237j = false;
                    this.A = 0;
                    B0();
                } else {
                    if (s().O == 3 && (aVar = this.f29255y) != null) {
                        te.a aVar2 = this.f29254x;
                        if (aVar2 != null) {
                            int i12 = aVar2.D;
                            int i13 = aVar.D;
                            if (i12 != i13 && i13 == 0) {
                                v0((byte) 1, r().f32324i);
                                ge.b.d("make device to enter the ota advertiser mode, and let the app continue update image");
                                this.F = null;
                                this.f29237j = true;
                                this.A = 0;
                                w0();
                            }
                        }
                        if (u0(aVar, this.f29256z, this.A, s().E * 4096)) {
                            ge.b.d("make device to enter the ota advertiser mode, and let the app continue update image");
                            v0((byte) 1, r().f32324i);
                            this.F = null;
                            this.f29237j = true;
                            this.A = 0;
                            w0();
                        }
                    }
                    v0((byte) 0, r().f32324i);
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

    public final void F0() {
        this.f29235i = false;
        z(517);
        try {
            Thread.sleep(1500L);
        } catch (InterruptedException unused) {
        }
        this.X = new j(20);
        m0();
        n0();
        C0();
        o0();
        if (this.f29221a) {
            ge.b.d(s().toString());
        }
        K();
        this.f29235i = true;
        ge.b.d("Ota Environment prepared.");
    }

    public final boolean G0() {
        if (!l0()) {
            return false;
        }
        q0();
        c0((byte) 7);
        r().i();
        z0(r().f32324i);
        if (!q().f32301n) {
            this.f29224c0 = 0;
            ge.b.d(String.format(Locale.US, "BreakpointResume disable: mImageUpdateOffset=0x%08X(%d)", 0, Integer.valueOf(this.f29224c0)));
        }
        if (s().f32262l >= 1) {
            p0();
        }
        if (this.f29224c0 == 0) {
            s0();
        }
        if (this.f29224c0 - 12 >= r().f32316a) {
            ge.b.o("Last send reach the bottom", this.f29221a);
        } else {
            A0(r().f32324i);
            if (this.Z == 1) {
                x0(this.f30506v0, this.N0);
            } else {
                t0(this.f30506v0, this.N0, this.f29254x);
            }
        }
        r().g();
        return true;
    }

    @Override // ve.a
    public final boolean g(boolean z10) {
        if (!super.g(z10)) {
            return false;
        }
        if (this.f29243m != 515) {
            boolean z11 = this.f29221a;
            StringBuilder a10 = android.support.v4.media.d.a("start to re-connect the RCU which going to active image, current state is: ");
            a10.append(this.f29243m);
            ge.b.e(a10.toString(), z11);
            int b02 = b0(this.F, q().C);
            if (b02 != 0) {
                ge.b.f(String.format("Something error in OTA process, errorCode: 0x%04X, mProcessState=0x%04X", Integer.valueOf(b02), Integer.valueOf(this.f29252v)));
                c(b02, true);
                return false;
            }
        }
        if (z10) {
            try {
                B0();
                z(258);
            } catch (ie.a e10) {
                ge.b.p(e10.toString());
                c(e10.f16770b, false);
            }
        } else {
            if (r0()) {
                D();
            }
            c(274, false);
        }
        return true;
    }

    @Override // xe.f, we.b, ve.a
    public final void o() {
        int v10;
        super.o();
        try {
            v10 = v();
        } catch (Exception e10) {
            ge.b.p(e10.toString());
            c(0, false);
        }
        if (v10 != 0) {
            c(v10, false);
            return;
        }
        z(514);
        this.F = this.H;
        this.f29237j = false;
        E0();
        n(this.f29254x);
        ge.b.e("ProcessorXG0010N stopped", this.f29221a);
        if (this.f29252v == 525) {
            z(259);
        }
    }
}
