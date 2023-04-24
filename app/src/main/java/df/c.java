package df;

import a0.g2;
import android.text.TextUtils;
import androidx.appcompat.widget.e2;
import androidx.fragment.app.h1;
import com.realsil.sdk.dfu.DfuService;
import no.nordicsemi.android.dfu.DfuBaseService;
import ze.j;

/* loaded from: classes.dex */
public final class c extends b {
    public c(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
    }

    public final boolean D0() {
        int i10;
        int i11;
        h0(this.F);
        if (this.E0 == null) {
            StringBuilder a10 = android.support.v4.media.d.a("OTA SERVICE not found:");
            a10.append(this.D0.toString());
            ge.b.p(a10.toString());
            i10 = 262;
        } else if (this.F0 == null) {
            StringBuilder a11 = android.support.v4.media.d.a("not found OTA_CONTROL_ENTER_OTA_MODE_CHARACTERISTIC : ");
            a11.append(h.f13022a.toString());
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
                i11 = DfuBaseService.ERROR_FILE_NOT_FOUND;
            } else if (!f0(h.f13028g)) {
                i11 = 280;
            } else {
                X();
                g0(this.F);
                j0();
                this.f29237j = true;
                return true;
            }
            c(i11, false);
            return false;
        }
        throw new ne.c("load ota service failed", i10);
    }

    public final boolean E0() {
        boolean D0;
        te.a aVar;
        int i10;
        z(514);
        this.F = this.H;
        this.f29237j = false;
        boolean z10 = false;
        while (!this.f29233h) {
            try {
                if (this.f29237j) {
                    if (TextUtils.isEmpty(this.F)) {
                        X();
                    }
                    g0(this.F);
                    if (!this.f29235i) {
                        F0();
                    } else {
                        J();
                    }
                    if (this.f29254x == null) {
                        c(DfuBaseService.ERROR_FILE_NOT_FOUND, false);
                        D0 = false;
                    } else {
                        j0();
                        this.f29237j = true;
                        D0 = true;
                    }
                } else {
                    D0 = D0();
                }
            } catch (ie.a e10) {
                h1.b(this.f29252v, new StringBuilder(), ", ", e10);
                int i11 = e10.f16770b;
                if (i11 == 4128) {
                    c(i11, true);
                } else {
                    if (i11 != 4097 && i11 != 265 && p0()) {
                        D();
                    }
                    c(i11, false);
                }
            }
            if (!D0 || !G0()) {
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
                    this.f29237j = false;
                    this.A = 0;
                    B0();
                    A0();
                } else if (s().O == 3 && (aVar = this.f29255y) != null && e0(aVar, this.A, s().E * 4096)) {
                    ge.b.d("make device to enter the ota advertiser mode, and let the app continue update image");
                    this.F = null;
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

    public final void F0() {
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
                ge.b.p("Get dev info failed");
                throw new ne.c("get remote dev info failed", 270);
            }
        }
        if ((s().f32261k == 5 || s().f32261k == 9 || s().f32261k == 4 || s().f32261k == 6 || s().f32261k == 7 || s().f32261k == 8 || s().f32261k == 10 || s().f32261k == 11 || s().f32261k == 12) && this.H0 != null) {
            if (this.f29222b) {
                ge.b.n("start to read remote dev Mac Addr info");
            }
            byte[] Q2 = Q(this.H0);
            if (Q2 != null && Q2.length >= 6) {
                byte[] bArr = new byte[6];
                System.arraycopy(Q2, 0, bArr, 0, 6);
                s().F = bArr;
            } else {
                ge.b.p("Get remote dev Mac Addr info failed, do nothing.");
                throw new ne.c("remote dev Mac Addr info error", 277);
            }
        }
        m0();
        if (this.f29221a) {
            ge.b.d(s().toString());
        }
        K();
        this.f29235i = true;
        ge.b.d("Ota Environment prepared.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:279:0x0230, code lost:
        r2 = 0;
        r3 = r16;
        r6 = r17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G0() {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: df.c.G0():boolean");
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
                B0();
                A0();
                z(258);
            } catch (ie.a e10) {
                c(e10.f16770b, false);
            }
        } else {
            if (p0()) {
                D();
            }
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
            ge.b.d("ProcessorXG0000N stopped");
        }
        if (this.f29252v == 525) {
            z(259);
        }
    }
}
