package ef;

import android.bluetooth.BluetoothDevice;
import com.realsil.sdk.dfu.DfuService;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class h extends e {
    public h(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
    }

    public final boolean H0() {
        h0(this.F);
        j0();
        if (!this.f29235i) {
            this.f29235i = false;
            z(517);
            try {
                Thread.sleep(1500L);
            } catch (InterruptedException unused) {
            }
            this.X = new ze.j(16);
            p0();
            if (s().f32273w && s().f32275y != 0) {
                throw new ne.c("rws state not ready", 282);
            }
            q0();
            o0();
            r0();
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

    public final boolean I0() {
        if (!l0()) {
            return false;
        }
        F0();
        s0();
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
            ge.b.d("Last send reach the bottom");
        } else {
            D0(r().f32324i);
            if (this.Z == 1) {
                y0(this.f30506v0, this.N0);
            } else {
                u0(this.f30506v0, this.N0, this.f29254x);
            }
        }
        r().g();
        return true;
    }

    @Override // xe.f
    public final void N(be.b bVar) {
        boolean v02;
        BluetoothDevice bluetoothDevice = bVar.f4151a;
        be.e b10 = be.e.b(bVar.f4153c);
        if (this.f29252v == 515) {
            String str = this.H;
            if (str != null && str.equals(bluetoothDevice.getAddress())) {
                v02 = true;
            } else {
                v02 = false;
            }
        } else if (this.f29252v == 527) {
            v02 = v0(b10);
        } else {
            boolean z10 = this.f29222b;
            StringBuilder a10 = android.support.v4.media.d.a("ignore process state: ");
            a10.append(this.f29252v);
            ge.b.e(a10.toString(), z10);
            return;
        }
        if (v02) {
            this.E = bVar.f4152b;
            this.F = bluetoothDevice.getAddress();
            boolean z11 = this.f29221a;
            StringBuilder a11 = android.support.v4.media.d.a("find target device: name=");
            a11.append(this.E);
            a11.append(" addr=");
            a11.append(this.F);
            ge.b.e(a11.toString(), z11);
            a0();
            synchronized (this.f29799o0) {
                this.f29800p0 = true;
                this.f29799o0.notifyAll();
            }
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
                ge.b.f(String.format("Something error in OTA process, errorCode: 0x%04X, mProcessState=0x%04X", Integer.valueOf(b02), Integer.valueOf(this.f29252v)));
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
            t0();
            c(274, false);
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:10|(1:12)(9:22|(2:24|(2:26|(1:28))(6:29|14|15|16|18|19))|30|31|14|15|16|18|19)|13|14|15|16|18|19) */
    @Override // ef.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n0() {
        /*
            r7 = this;
        L0:
            boolean r0 = r7.f29233h
            r1 = 1
            r0 = r0 ^ r1
            r2 = 4128(0x1020, float:5.785E-42)
            r3 = 0
            if (r0 != 0) goto Ld
            r7.c(r2, r1)
            return r3
        Ld:
            boolean r0 = r7.H0()     // Catch: ie.a -> Lbf
            if (r0 != 0) goto L14
            return r3
        L14:
            boolean r0 = r7.I0()     // Catch: ie.a -> Lbf
            if (r0 != 0) goto L1b
            return r3
        L1b:
            int r0 = r7.A     // Catch: ie.a -> Lbf
            ze.g r4 = r7.r()     // Catch: ie.a -> Lbf
            int r4 = r4.f32317b     // Catch: ie.a -> Lbf
            int r0 = r0 + r4
            r7.A = r0     // Catch: ie.a -> Lbf
            ze.g r0 = r7.r()     // Catch: ie.a -> Lbf
            boolean r0 = r0.f()     // Catch: ie.a -> Lbf
            if (r0 == 0) goto L47
            java.lang.String r0 = "no pending image file to upload."
            ge.b.d(r0)     // Catch: ie.a -> Lbf
            ze.g r0 = r7.r()     // Catch: ie.a -> Lbf
            int r0 = r0.f32324i     // Catch: ie.a -> Lbf
            r7.w0(r1, r0)     // Catch: ie.a -> Lbf
            ze.g r0 = r7.r()     // Catch: ie.a -> Lbf
            int r4 = r7.A     // Catch: ie.a -> Lbf
            r0.f32327l = r4     // Catch: ie.a -> Lbf
            return r1
        L47:
            boolean r0 = r7.f29221a     // Catch: ie.a -> Lbf
            java.lang.String r4 = "has pending image file to upload"
            ge.b.e(r4, r0)     // Catch: ie.a -> Lbf
            ze.j r0 = r7.s()     // Catch: ie.a -> Lbf
            int r0 = r0.O     // Catch: ie.a -> Lbf
            if (r0 != r1) goto L6b
            ze.g r0 = r7.r()     // Catch: ie.a -> Lbf
            int r0 = r0.f32324i     // Catch: ie.a -> Lbf
            r7.w0(r1, r0)     // Catch: ie.a -> Lbf
            java.lang.String r0 = r7.H     // Catch: ie.a -> Lbf
            r7.F = r0     // Catch: ie.a -> Lbf
            r7.f29237j = r1     // Catch: ie.a -> Lbf
            r7.A = r3     // Catch: ie.a -> Lbf
            r7.E0()     // Catch: ie.a -> Lbf
            goto L9d
        L6b:
            ze.j r0 = r7.s()     // Catch: ie.a -> Lbf
            int r0 = r0.O     // Catch: ie.a -> Lbf
            r4 = 3
            if (r0 != r4) goto La1
            te.a r0 = r7.f29255y     // Catch: ie.a -> Lbf
            if (r0 == 0) goto La6
            int r4 = r7.A     // Catch: ie.a -> Lbf
            ze.j r5 = r7.s()     // Catch: ie.a -> Lbf
            int r5 = r5.E     // Catch: ie.a -> Lbf
            int r5 = r5 * 4096
            boolean r0 = r7.e0(r0, r4, r5)     // Catch: ie.a -> Lbf
            if (r0 == 0) goto La1
            ze.g r0 = r7.r()     // Catch: ie.a -> Lbf
            int r0 = r0.f32324i     // Catch: ie.a -> Lbf
            r7.w0(r1, r0)     // Catch: ie.a -> Lbf
            java.lang.String r0 = "make device to enter the ota advertiser mode, and let the app continue update image"
            ge.b.d(r0)     // Catch: ie.a -> Lbf
            r7.f29237j = r1     // Catch: ie.a -> Lbf
            r7.A = r3     // Catch: ie.a -> Lbf
            r7.x0()     // Catch: ie.a -> Lbf
        L9d:
            r7.t()     // Catch: ie.a -> Lbf
            goto Lb5
        La1:
            ze.g r0 = r7.r()     // Catch: ie.a -> Lbf
            goto Lb0
        La6:
            ze.g r0 = r7.r()     // Catch: ie.a -> Lbf
            int r0 = r0.f32324i     // Catch: ie.a -> Lbf
            r7.w0(r1, r0)     // Catch: ie.a -> Lbf
            goto Lb5
        Lb0:
            int r0 = r0.f32324i     // Catch: ie.a -> Lbf
            r7.w0(r3, r0)     // Catch: ie.a -> Lbf
        Lb5:
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Lbc
            goto L0
        Lbc:
            goto L0
        Lbf:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r7.f29252v
            java.lang.String r6 = ", "
            androidx.fragment.app.h1.b(r5, r4, r6, r0)
            int r0 = r0.f16770b
            if (r0 != r2) goto Ld4
            r7.c(r0, r1)
            goto Le3
        Ld4:
            r1 = 4097(0x1001, float:5.741E-42)
            if (r0 == r1) goto Le0
            r1 = 265(0x109, float:3.71E-43)
            if (r0 != r1) goto Ldd
            goto Le0
        Ldd:
            r7.t0()
        Le0:
            r7.c(r0, r3)
        Le3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.h.n0():boolean");
    }
}
