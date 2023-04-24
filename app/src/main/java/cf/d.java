package cf;

import android.text.TextUtils;
import androidx.fragment.app.h1;
import com.realsil.sdk.dfu.DfuService;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;
import ze.j;

/* loaded from: classes.dex */
public final class d extends c {
    public d(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
    }

    public final boolean B0() {
        int i10;
        if (this.f29237j) {
            if (TextUtils.isEmpty(this.F)) {
                O(true);
            }
            g0(this.F);
            if (!this.f29235i) {
                D0();
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
                a11.append(f.f4644a.toString());
                ge.b.p(a11.toString());
                i10 = 263;
            } else {
                i10 = 0;
            }
            if (i10 == 0) {
                if (!this.f29235i) {
                    D0();
                } else {
                    J();
                }
                if (this.f29254x == null) {
                    c(DfuBaseService.ERROR_FILE_NOT_FOUND, false);
                    return false;
                } else if (!f0(f.f4647d)) {
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

    public final boolean C0() {
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
            if (!B0() || !E0()) {
                return false;
            }
            this.A += r().f32317b;
            if (r().f()) {
                ge.b.d("no pending image file to upload.");
                u0((byte) 1, r().f32324i);
                r().f32327l = this.A;
                if (!this.U) {
                    i10 = 523;
                } else {
                    z0();
                    i10 = 258;
                }
                z(i10);
                z10 = true;
            } else {
                ge.b.d("has pending image file to upload");
                if (s().O == 1) {
                    u0((byte) 1, r().f32324i);
                    this.F = this.H;
                    this.f29237j = false;
                    this.A = 0;
                    z0();
                } else if (s().O == 3 && (aVar = this.f29255y) != null && e0(aVar, this.A, s().E * 4096)) {
                    ge.b.d("make device to enter the ota advertiser mode, and let the app continue update image");
                    u0((byte) 1, r().f32324i);
                    this.F = null;
                    this.f29237j = true;
                    this.A = 0;
                    w0(new byte[]{4, 1});
                } else {
                    u0((byte) 0, r().f32324i);
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

    public final void D0() {
        this.f29235i = false;
        z(517);
        try {
            Thread.sleep(1500L);
        } catch (InterruptedException unused) {
        }
        this.X = new j(21);
        m0();
        n0();
        A0();
        o0();
        if (this.f29221a) {
            ge.b.d(s().toString());
        }
        K();
        this.f29235i = true;
        ge.b.d("Ota Environment prepared.");
    }

    public final boolean E0() {
        if (!l0()) {
            return false;
        }
        q0();
        c0((byte) 7);
        r().i();
        x0(r().f32324i);
        if (!q().f32301n) {
            this.f29224c0 = 0;
            ge.b.d(String.format(Locale.US, "BreakpointResume disable: mImageUpdateOffset=0x%08X(%d)", 0, Integer.valueOf(this.f29224c0)));
        }
        p0();
        if (this.f29224c0 == 0) {
            s0();
        }
        if (this.f29224c0 - 12 >= r().f32316a) {
            ge.b.o("Last send reach the bottom", this.f29222b);
        } else {
            y0(r().f32324i);
            if (this.Z == 1) {
                v0(this.f30506v0, this.N0);
            } else {
                t0(this.f30506v0, this.N0, this.f29254x);
            }
        }
        r().g();
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
        C0();
        n(this.f29254x);
        ge.b.e("ProcessorXG0010N stopped", this.f29221a);
        if (this.f29252v == 525) {
            z(259);
        }
    }
}
