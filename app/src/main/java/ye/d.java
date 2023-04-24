package ye;

import a0.g2;
import android.text.TextUtils;
import androidx.appcompat.widget.e2;
import androidx.fragment.app.h1;
import com.realsil.sdk.dfu.DfuService;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class d extends c {
    public d(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
    }

    public final boolean E0() {
        int i10;
        if (this.Q == 0) {
            if (this.f29237j) {
                if (TextUtils.isEmpty(this.F)) {
                    X();
                }
                g0(this.F);
                if (!this.f29235i) {
                    n0();
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
                    a11.append(f.f31447a.toString());
                    ge.b.p(a11.toString());
                    i10 = 263;
                } else {
                    i10 = 0;
                }
                if (i10 == 0) {
                    if (!this.f29235i) {
                        n0();
                    } else {
                        J();
                    }
                    if (this.f29254x == null) {
                        c(DfuBaseService.ERROR_FILE_NOT_FOUND, false);
                        return false;
                    } else if (!f0(f.f31453g)) {
                        c(280, false);
                        return false;
                    } else {
                        X();
                        g0(this.F);
                    }
                } else {
                    throw new ne.c("load ota service failed", i10);
                }
            }
            j0();
            this.f29237j = true;
        } else {
            h0(this.F);
            j0();
            if (!this.f29235i) {
                n0();
            } else {
                J();
            }
            if (this.f29254x == null) {
                c(DfuBaseService.ERROR_FILE_NOT_FOUND, false);
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:343:0x0329 A[Catch: IOException -> 0x039a, TryCatch #0 {IOException -> 0x039a, blocks: (B:325:0x02be, B:327:0x02c4, B:329:0x02cc, B:339:0x0315, B:341:0x031c, B:343:0x0329, B:345:0x0338, B:347:0x0342, B:348:0x0346, B:349:0x035f, B:350:0x0360, B:355:0x036d, B:330:0x02e4, B:332:0x02e8, B:334:0x02ee, B:335:0x02f3, B:336:0x02fa, B:338:0x02fe, B:340:0x0318), top: B:376:0x02be }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0360 A[Catch: IOException -> 0x039a, TryCatch #0 {IOException -> 0x039a, blocks: (B:325:0x02be, B:327:0x02c4, B:329:0x02cc, B:339:0x0315, B:341:0x031c, B:343:0x0329, B:345:0x0338, B:347:0x0342, B:348:0x0346, B:349:0x035f, B:350:0x0360, B:355:0x036d, B:330:0x02e4, B:332:0x02e8, B:334:0x02ee, B:335:0x02f3, B:336:0x02fa, B:338:0x02fe, B:340:0x0318), top: B:376:0x02be }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0338 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F0() {
        /*
            Method dump skipped, instructions count: 990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.d.F0():boolean");
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
                C0();
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

    @Override // ye.c
    public final boolean m0() {
        boolean z10;
        te.a aVar;
        boolean z11;
        int i10;
        z(514);
        this.F = this.H;
        if (this.Q != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29237j = z10;
        boolean z12 = false;
        while (!this.f29233h) {
            try {
            } catch (ie.a e10) {
                h1.b(this.f29252v, new StringBuilder(), ", ", e10);
                int i11 = e10.f16770b;
                if (i11 == 4128) {
                    c(i11, true);
                } else {
                    if (i11 != 4097 && i11 != 265) {
                        r0();
                        if (this.Q == 0) {
                            D();
                        }
                    }
                    c(i11, false);
                }
            }
            if (!E0() || !F0()) {
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
                z12 = true;
            } else {
                ge.b.n("has pending image file to upload");
                if (s().O == 1) {
                    this.F = this.H;
                    int i12 = this.Q;
                    if (i12 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f29237j = z11;
                    this.A = 0;
                    if (i12 == 18) {
                        this.f29235i = false;
                    }
                    C0();
                } else if (s().O == 3 && (aVar = this.f29255y) != null && e0(aVar, this.A, s().E * 4096)) {
                    ge.b.d("make device to enter the ota advertiser mode, and let the app continue update image");
                    int i13 = this.Q;
                    if (i13 == 0) {
                        this.F = null;
                    }
                    this.f29237j = true;
                    this.A = 0;
                    if (i13 == 18) {
                        this.f29235i = false;
                    }
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
            if (z12) {
                return z12;
            }
        }
        c(4128, true);
        return false;
    }
}
