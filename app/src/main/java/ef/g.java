package ef;

import android.text.TextUtils;
import com.realsil.sdk.dfu.DfuService;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class g extends f {
    public g(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
    }

    public final boolean G0() {
        int i10;
        if (this.f29237j) {
            if (TextUtils.isEmpty(this.F)) {
                X();
            }
            g0(this.F);
            if (!this.f29235i) {
                H0();
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
                a11.append(j.f13607a.toString());
                ge.b.p(a11.toString());
                i10 = 263;
            } else {
                i10 = 0;
            }
            if (i10 == 0) {
                if (!this.f29235i) {
                    H0();
                } else {
                    J();
                }
                if (this.f29254x == null) {
                    c(DfuBaseService.ERROR_FILE_NOT_FOUND, false);
                    return false;
                } else if (!f0(j.f13610d)) {
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
        return true;
    }

    public final void H0() {
        this.f29235i = false;
        z(517);
        try {
            Thread.sleep(1500L);
        } catch (InterruptedException unused) {
        }
        this.X = new ze.j(16);
        p0();
        q0();
        o0();
        r0();
        if (this.f29221a) {
            ge.b.d(s().toString());
        }
        K();
        this.f29235i = true;
        ge.b.d("Ota Environment prepared.");
    }

    public final int I0() {
        boolean z10;
        te.a aVar;
        if (!l0()) {
            z10 = false;
        } else {
            s0();
            c0((byte) 7);
            r().i();
            C0(r().f32324i);
            if (!q().f32301n) {
                this.f29224c0 = 0;
                ge.b.d(String.format(Locale.US, "BreakpointResume disable: mImageUpdateOffset=0x%08X(%d)", 0, Integer.valueOf(this.f29224c0)));
            }
            if (this.f29224c0 == 0) {
                z0((byte) 0);
            }
            if (this.f29224c0 - 12 >= r().f32316a) {
                ge.b.n("Last send reach the bottom");
            } else {
                D0(r().f32324i);
                if (this.Z == 1) {
                    y0(this.f30506v0, this.N0);
                } else {
                    u0(this.f30506v0, this.N0, this.f29254x);
                }
            }
            r().g();
            z10 = true;
        }
        if (!z10) {
            return 0;
        }
        this.A += r().f32317b;
        if (r().f()) {
            ge.b.d("no pending image file to upload.");
            w0((byte) 1, r().f32324i);
            r().f32327l = this.A;
            return 3;
        }
        ge.b.e("has pending image file to upload", this.f29221a);
        if (s().O == 1) {
            w0((byte) 1, r().f32324i);
            this.F = this.H;
            this.f29237j = false;
            this.A = 0;
            E0();
        } else if (s().O == 3 && (aVar = this.f29255y) != null && e0(aVar, this.A, s().E * 4096)) {
            ge.b.d("make device to enter the ota advertiser mode, and let the app continue update image");
            w0((byte) 1, r().f32324i);
            this.F = null;
            this.f29237j = true;
            this.A = 0;
            x0();
        } else {
            w0((byte) 0, r().f32324i);
            return 2;
        }
        t();
        return 2;
    }

    public final int J0() {
        te.a aVar;
        if (!(!this.f29233h)) {
            c(4128, false);
            return 0;
        }
        z(521);
        ge.b.d(String.format("mOtaWorkMode=0x%04X, ICType=%2X", Integer.valueOf(this.Q), Integer.valueOf(s().f32261k)));
        ge.b.n(r().toString());
        r().i();
        C0(r().f32324i);
        if (!q().f32301n) {
            this.f29224c0 = 0;
        }
        ge.b.o(String.format(Locale.US, "mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(this.f29224c0), Integer.valueOf(this.f29224c0)), this.f29221a);
        if (this.f29224c0 == 0) {
            z0((byte) 0);
        }
        if (this.f29224c0 >= r().f32316a) {
            ge.b.o("Last send reach the bottom", this.f29222b);
        } else {
            D0(r().f32324i);
        }
        r().g();
        x();
        this.A += r().f32317b;
        if (r().f()) {
            ge.b.d("no pending image file to upload.");
            w0((byte) 1, r().f32324i);
            r().f32327l = this.A;
            return 3;
        }
        ge.b.e("has pending image file to upload", this.f29221a);
        if (s().O == 1) {
            w0((byte) 1, r().f32324i);
            this.F = this.H;
            this.f29237j = false;
            this.A = 0;
            E0();
        } else if (s().O == 3 && (aVar = this.f29255y) != null && e0(aVar, this.A, s().E * 4096)) {
            ge.b.d("make device to enter the ota advertiser mode, and let the app continue update image");
            w0((byte) 1, r().f32324i);
            this.F = null;
            this.f29237j = true;
            this.A = 0;
            x0();
        } else {
            w0((byte) 0, r().f32324i);
            return 2;
        }
        t();
        return 2;
    }

    public final int K0() {
        te.a aVar;
        z(521);
        r().i();
        if (this.f29221a) {
            ge.b.n("processCopyProcedure ...");
            ge.b.n(r().toString());
        }
        try {
            B0(r().f32324i);
            r().g();
            x();
            this.A += r().f32317b;
            if (r().f()) {
                ge.b.o("no pendding image file to upload", this.f29222b);
                r().f32327l = this.A;
                return 3;
            }
            ge.b.e("has pending image file to upload", this.f29221a);
            if (s().O == 1) {
                this.F = this.H;
                this.f29237j = false;
                this.A = 0;
                E0();
            } else {
                if (s().O == 3 && (aVar = this.f29255y) != null && e0(aVar, this.A, s().E * 4096)) {
                    ge.b.d("make device to enter the ota advertiser mode, and let the app continue update image");
                    this.F = null;
                    this.f29237j = true;
                    this.A = 0;
                    x0();
                }
                return 0;
            }
            t();
            return 0;
        } catch (ie.a unused) {
            return 1;
        }
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
                ge.b.p(String.format("Something error in OTA process, errorCode: 0x%04X, mProcessState=0x%04X", Integer.valueOf(b02), Integer.valueOf(this.f29252v)));
                c(b02, true);
                return false;
            }
        }
        if (z10) {
            try {
                E0();
                z(258);
            } catch (ie.a e10) {
                ge.b.p(e10.toString());
                c(e10.f16770b, false);
            }
        } else {
            if (t0()) {
                D();
            }
            c(274, false);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0026, code lost:
        if (r2 == 1) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0055  */
    @Override // ef.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n0() {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
        L2:
            boolean r2 = r8.f29233h
            r3 = 1
            r2 = r2 ^ r3
            r4 = 4128(0x1020, float:5.785E-42)
            if (r2 != 0) goto Le
            r8.c(r4, r3)
            return r0
        Le:
            boolean r2 = r8.G0()     // Catch: ie.a -> L62
            if (r2 != 0) goto L15
            return r0
        L15:
            r8.F0()     // Catch: ie.a -> L62
            int r2 = r8.m0()     // Catch: ie.a -> L62
            r5 = 2
            java.lang.String r6 = "validate faild during copy, switch to push flow"
            r7 = 3
            if (r2 != r5) goto L2c
            int r2 = r8.K0()     // Catch: ie.a -> L62
            if (r2 != r3) goto L52
        L28:
            ge.b.d(r6)     // Catch: ie.a -> L62
            goto L4e
        L2c:
            if (r2 != r3) goto L3a
            int r2 = r8.J0()     // Catch: ie.a -> L62
            if (r2 != r3) goto L52
            java.lang.String r2 = "validate faild during skip, switch to push flow"
            ge.b.d(r2)     // Catch: ie.a -> L62
            goto L4e
        L3a:
            if (r2 != r7) goto L4e
            int r2 = r8.J0()     // Catch: ie.a -> L62
            if (r2 != r3) goto L52
            java.lang.String r2 = "validate faild during skip, switch to copy flow"
            ge.b.d(r2)     // Catch: ie.a -> L62
            int r2 = r8.K0()     // Catch: ie.a -> L62
            if (r2 != r3) goto L52
            goto L28
        L4e:
            int r2 = r8.I0()     // Catch: ie.a -> L62
        L52:
            if (r2 != 0) goto L55
            return r0
        L55:
            if (r2 != r7) goto L58
            r1 = 1
        L58:
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> L5e
            goto L5f
        L5e:
        L5f:
            if (r1 == 0) goto L2
            goto L90
        L62:
            r2 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r8.f29252v
            java.lang.String r7 = ", "
            androidx.fragment.app.h1.b(r6, r5, r7, r2)
            int r2 = r2.f16770b
            if (r2 != r4) goto L77
            r8.c(r2, r3)
            goto L90
        L77:
            r3 = 4097(0x1001, float:5.741E-42)
            if (r2 == r3) goto L8d
            r3 = 265(0x109, float:3.71E-43)
            if (r2 != r3) goto L80
            goto L8d
        L80:
            boolean r3 = r8.t0()
            if (r3 == 0) goto L8d
            int r3 = r8.Q
            if (r3 != 0) goto L8d
            r8.D()
        L8d:
            r8.c(r2, r0)
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.g.n0():boolean");
    }

    @Override // xe.f, we.b, ve.a
    public final void o() {
        int v10;
        int i10;
        try {
            setName("ProcessorXG0010N");
            ge.b.d("ProcessorXG0010N running.");
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
        if (n0()) {
            if (!this.U) {
                i10 = 523;
            } else {
                E0();
                i10 = 258;
            }
            z(i10);
        }
        n(this.f29254x);
        ge.b.e("ProcessorXG0010N stopped", this.f29221a);
        if (this.f29252v == 525) {
            z(259);
        }
    }
}
