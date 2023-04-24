package cf;

import a0.g2;
import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import com.realsil.sdk.dfu.DfuService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;
import ze.j;

/* loaded from: classes.dex */
public final class e extends c {
    public e(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
    }

    public final boolean B0() {
        h0(this.F);
        j0();
        if (!this.f29235i) {
            this.f29235i = false;
            z(517);
            try {
                Thread.sleep(1500L);
            } catch (InterruptedException unused) {
            }
            this.X = new j(21);
            m0();
            if (s().f32273w && s().f32275y != 0) {
                throw new ne.c("rws state not ready", 282);
            }
            n0();
            A0();
            o0();
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

    /* JADX WARN: Can't wrap try/catch for region: R(8:10|(1:12)(9:22|(2:24|(2:26|(1:28))(6:29|14|15|16|18|19))|30|31|14|15|16|18|19)|13|14|15|16|18|19) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C0() {
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
            boolean r0 = r7.B0()     // Catch: ie.a -> Lc3
            if (r0 != 0) goto L14
            return r3
        L14:
            boolean r0 = r7.D0()     // Catch: ie.a -> Lc3
            if (r0 != 0) goto L1b
            return r3
        L1b:
            int r0 = r7.A     // Catch: ie.a -> Lc3
            ze.g r4 = r7.r()     // Catch: ie.a -> Lc3
            int r4 = r4.f32317b     // Catch: ie.a -> Lc3
            int r0 = r0 + r4
            r7.A = r0     // Catch: ie.a -> Lc3
            ze.g r0 = r7.r()     // Catch: ie.a -> Lc3
            boolean r0 = r0.f()     // Catch: ie.a -> Lc3
            if (r0 == 0) goto L47
            java.lang.String r0 = "no pending image file to upload."
            ge.b.d(r0)     // Catch: ie.a -> Lc3
            ze.g r0 = r7.r()     // Catch: ie.a -> Lc3
            int r0 = r0.f32324i     // Catch: ie.a -> Lc3
            r7.u0(r1, r0)     // Catch: ie.a -> Lc3
            ze.g r0 = r7.r()     // Catch: ie.a -> Lc3
            int r4 = r7.A     // Catch: ie.a -> Lc3
            r0.f32327l = r4     // Catch: ie.a -> Lc3
            return r1
        L47:
            java.lang.String r0 = "has pending image file to upload"
            ge.b.d(r0)     // Catch: ie.a -> Lc3
            ze.j r0 = r7.s()     // Catch: ie.a -> Lc3
            int r0 = r0.O     // Catch: ie.a -> Lc3
            if (r0 != r1) goto L69
            ze.g r0 = r7.r()     // Catch: ie.a -> Lc3
            int r0 = r0.f32324i     // Catch: ie.a -> Lc3
            r7.u0(r1, r0)     // Catch: ie.a -> Lc3
            java.lang.String r0 = r7.H     // Catch: ie.a -> Lc3
            r7.F = r0     // Catch: ie.a -> Lc3
            r7.f29237j = r1     // Catch: ie.a -> Lc3
            r7.A = r3     // Catch: ie.a -> Lc3
            r7.z0()     // Catch: ie.a -> Lc3
            goto La1
        L69:
            ze.j r0 = r7.s()     // Catch: ie.a -> Lc3
            int r0 = r0.O     // Catch: ie.a -> Lc3
            r4 = 3
            if (r0 != r4) goto La5
            te.a r0 = r7.f29255y     // Catch: ie.a -> Lc3
            if (r0 == 0) goto Laa
            int r4 = r7.A     // Catch: ie.a -> Lc3
            ze.j r5 = r7.s()     // Catch: ie.a -> Lc3
            int r5 = r5.E     // Catch: ie.a -> Lc3
            int r5 = r5 * 4096
            boolean r0 = r7.e0(r0, r4, r5)     // Catch: ie.a -> Lc3
            if (r0 == 0) goto La5
            ze.g r0 = r7.r()     // Catch: ie.a -> Lc3
            int r0 = r0.f32324i     // Catch: ie.a -> Lc3
            r7.u0(r1, r0)     // Catch: ie.a -> Lc3
            java.lang.String r0 = "make device to enter the ota advertiser mode, and let the app continue update image"
            ge.b.d(r0)     // Catch: ie.a -> Lc3
            r7.f29237j = r1     // Catch: ie.a -> Lc3
            r7.A = r3     // Catch: ie.a -> Lc3
            r0 = 2
            byte[] r0 = new byte[r0]     // Catch: ie.a -> Lc3
            r0 = {x00e8: FILL_ARRAY_DATA  , data: [4, 1} // fill-array     // Catch: ie.a -> Lc3
            r7.w0(r0)     // Catch: ie.a -> Lc3
        La1:
            r7.t()     // Catch: ie.a -> Lc3
            goto Lb9
        La5:
            ze.g r0 = r7.r()     // Catch: ie.a -> Lc3
            goto Lb4
        Laa:
            ze.g r0 = r7.r()     // Catch: ie.a -> Lc3
            int r0 = r0.f32324i     // Catch: ie.a -> Lc3
            r7.u0(r1, r0)     // Catch: ie.a -> Lc3
            goto Lb9
        Lb4:
            int r0 = r0.f32324i     // Catch: ie.a -> Lc3
            r7.u0(r3, r0)     // Catch: ie.a -> Lc3
        Lb9:
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Lc0
            goto L0
        Lc0:
            goto L0
        Lc3:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r7.f29252v
            java.lang.String r6 = ", "
            androidx.fragment.app.h1.b(r5, r4, r6, r0)
            int r0 = r0.f16770b
            if (r0 != r2) goto Ld8
            r7.c(r0, r1)
            goto Le7
        Ld8:
            r1 = 4097(0x1001, float:5.741E-42)
            if (r0 == r1) goto Le4
            r1 = 265(0x109, float:3.71E-43)
            if (r0 != r1) goto Le1
            goto Le4
        Le1:
            r7.r0()
        Le4:
            r7.c(r0, r3)
        Le7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cf.e.C0():boolean");
    }

    public final boolean D0() {
        if (!l0()) {
            return false;
        }
        q0();
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
            ge.b.e("Last send reach the bottom", this.f29221a);
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

    public final void E0(be.d dVar) {
        if (!this.f29233h) {
            z(527);
            this.D = 0;
            this.f29800p0 = false;
            H(dVar);
            try {
                synchronized (this.f29799o0) {
                    if (this.D == 0 && !this.f29800p0) {
                        this.f29799o0.wait(31000L);
                    }
                }
            } catch (InterruptedException e10) {
                StringBuilder a10 = android.support.v4.media.d.a("findRemoteDevice interrupted, e = ");
                a10.append(e10.toString());
                ge.b.p(a10.toString());
                this.D = 259;
            }
            if (this.D == 0 && !this.f29800p0) {
                ge.b.p("didn't find the secondary bud device");
                this.D = 265;
            }
            if (this.D == 0) {
                return;
            }
            throw new ne.c("Error while scan remote device", this.D);
        }
        throw new ne.c("user aborted", 4128);
    }

    @Override // xe.f
    public final void N(be.b bVar) {
        boolean z10;
        BluetoothDevice bluetoothDevice = bVar.f4151a;
        be.e b10 = be.e.b(bVar.f4153c);
        if (this.f29252v == 515) {
            String str = this.H;
            if (str != null && str.equals(bluetoothDevice.getAddress())) {
                z10 = true;
            }
            z10 = false;
        } else if (this.f29252v == 527) {
            if (b10 == null) {
                ge.b.e("ignore , specScanRecord is null", this.f29221a);
            } else {
                ge.b.n(b10.toString());
                byte[] a10 = b10.a(q().L);
                if (a10 != null) {
                    boolean z11 = this.f29222b;
                    StringBuilder a11 = android.support.v4.media.d.a("manufacturerSpecificData=");
                    a11.append(he.a.a(a10));
                    ge.b.o(a11.toString(), z11);
                    boolean z12 = this.f29222b;
                    StringBuilder a12 = android.support.v4.media.d.a("rwsBdAddr= ");
                    a12.append(he.a.a(s().C));
                    ge.b.o(a12.toString(), z12);
                    boolean equals = Arrays.equals(a10, s().C);
                    if (!equals) {
                        ge.b.o("not the same device", this.f29222b);
                    } else {
                        ArrayList arrayList = b10.f4174b;
                        if (arrayList != null) {
                            z10 = arrayList.contains(ParcelUuid.fromString("020002fd-3c17-d293-8e48-14fe2e4da212"));
                        } else {
                            z10 = equals;
                        }
                    }
                }
            }
            z10 = false;
        } else {
            g2.c(android.support.v4.media.d.a("ignore process state: "), this.f29252v);
            return;
        }
        if (z10) {
            this.E = bVar.f4152b;
            this.F = bluetoothDevice.getAddress();
            boolean z13 = this.f29221a;
            StringBuilder a13 = android.support.v4.media.d.a("find target device: name=");
            a13.append(this.E);
            a13.append(" addr=");
            a13.append(this.F);
            ge.b.e(a13.toString(), z13);
            a0();
            synchronized (this.f29799o0) {
                this.f29800p0 = true;
                this.f29799o0.notifyAll();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0092, code lost:
        if (r21.U == false) goto L23;
     */
    @Override // xe.f, we.b, ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            r21 = this;
            r1 = r21
            super.o()
            r2 = 0
            int r0 = r21.v()     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto L10
            r1.c(r0, r2)     // Catch: java.lang.Exception -> La5
            return
        L10:
            r0 = 514(0x202, float:7.2E-43)
            r1.z(r0)     // Catch: java.lang.Exception -> La5
            java.lang.String r0 = r1.H     // Catch: java.lang.Exception -> La5
            r1.F = r0     // Catch: java.lang.Exception -> La5
            r0 = 1
            r1.f29237j = r0     // Catch: java.lang.Exception -> La5
            boolean r3 = r21.C0()     // Catch: java.lang.Exception -> La5
            if (r3 == 0) goto L9f
            ze.j r3 = r21.s()     // Catch: java.lang.Exception -> La5
            boolean r3 = r3.f32273w     // Catch: java.lang.Exception -> La5
            if (r3 == 0) goto L90
            r21.z0()     // Catch: java.lang.Exception -> La5
            r3 = 522(0x20a, float:7.31E-43)
            r1.z(r3)     // Catch: java.lang.Exception -> La5
            java.lang.String r3 = "wait master to handover ..."
            ge.b.d(r3)     // Catch: java.lang.Exception -> La5
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> La5
            r3.<init>()     // Catch: java.lang.Exception -> La5
            r20 = 0
            r15 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r19 = 0
            ze.e r6 = r21.q()     // Catch: java.lang.Exception -> La5
            int r6 = r6.L     // Catch: java.lang.Exception -> La5
            ze.j r4 = r21.s()     // Catch: java.lang.Exception -> La5
            byte[] r4 = r4.C     // Catch: java.lang.Exception -> La5
            if (r4 == 0) goto L62
            if (r6 < 0) goto L5a
            goto L62
        L5a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> La5
            java.lang.String r3 = "invalid manufacture id"
            r0.<init>(r3)     // Catch: java.lang.Exception -> La5
            throw r0     // Catch: java.lang.Exception -> La5
        L62:
            r18 = 0
            ce.a r5 = new ce.a     // Catch: java.lang.Exception -> La5
            r16 = r6
            r6 = r5
            r17 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Exception -> La5
            r3.add(r5)     // Catch: java.lang.Exception -> La5
            be.d r4 = xe.f.Y()     // Catch: java.lang.Exception -> La5
            r4.f4172p = r3     // Catch: java.lang.Exception -> La5
            r1.E0(r4)     // Catch: java.lang.Exception -> La5
            java.lang.String r3 = "start to upload secondary bud ..."
            ge.b.d(r3)     // Catch: java.lang.Exception -> La5
            r1.f29237j = r0     // Catch: java.lang.Exception -> La5
            r1.f29235i = r2     // Catch: java.lang.Exception -> La5
            r1.A = r2     // Catch: java.lang.Exception -> La5
            boolean r0 = r21.C0()     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto L9f
            boolean r0 = r1.U     // Catch: java.lang.Exception -> La5
            if (r0 != 0) goto L97
            goto L94
        L90:
            boolean r0 = r1.U     // Catch: java.lang.Exception -> La5
            if (r0 != 0) goto L97
        L94:
            r4 = 523(0x20b, float:7.33E-43)
            goto L9c
        L97:
            r21.z0()     // Catch: java.lang.Exception -> La5
            r4 = 258(0x102, float:3.62E-43)
        L9c:
            r1.z(r4)     // Catch: java.lang.Exception -> La5
        L9f:
            te.a r0 = r1.f29254x     // Catch: java.lang.Exception -> La5
            r1.n(r0)     // Catch: java.lang.Exception -> La5
            goto Lb0
        La5:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            ge.b.p(r0)
            r1.c(r2, r2)
        Lb0:
            boolean r0 = r1.f29221a
            java.lang.String r2 = "ProcessorXG0010S stopped"
            ge.b.e(r2, r0)
            r21.A()
            int r0 = r1.f29252v
            r2 = 525(0x20d, float:7.36E-43)
            if (r0 != r2) goto Lc5
            r0 = 259(0x103, float:3.63E-43)
            r1.z(r0)
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cf.e.o():void");
    }
}
