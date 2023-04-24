package jf;

import com.realsil.sdk.dfu.DfuService;
import java.io.IOException;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class l extends i {
    public l(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
    }

    public final int A0() {
        int i10;
        if (!(!this.f29233h)) {
            c(4128, false);
            return 0;
        }
        z(521);
        ge.b.e(String.format("mOtaWorkMode=0x%04X, ICType=%2X", Integer.valueOf(this.Q), Integer.valueOf(s().f32261k)), this.f29221a);
        ge.b.o(r().toString(), this.f29221a);
        r().i();
        k0(r().f32324i);
        if (!q().f32301n) {
            this.f29224c0 = 0;
        }
        ge.b.o(String.format(Locale.US, "mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(this.f29224c0), Integer.valueOf(this.f29224c0)), this.f29221a);
        if (this.f29224c0 == 0) {
            X((byte) 0);
        }
        if (this.f29224c0 >= r().f32316a) {
            ge.b.e("Last send reach the bottom", this.f29221a);
        } else {
            l0(r().f32324i);
        }
        r().g();
        x();
        this.A += r().f32317b;
        try {
            if (r().f()) {
                ge.b.d("no pendding image file to upload,");
                a0((byte) 1, r().f32324i);
                r().f32327l = this.A;
                return 3;
            }
            ge.b.d("has pending image file to upload");
            if (s().O == 1) {
                a0((byte) 1, r().f32324i);
                this.F = this.H;
                this.f29237j = true;
                this.A = 0;
                Y(true);
            } else {
                if (s().O == 3) {
                    te.a aVar = this.f29255y;
                    if (aVar != null) {
                        if (Z(aVar, this.A, s().E * 4096)) {
                            a0((byte) 1, r().f32324i);
                            ge.b.d("make device to enter the ota advertiser mode, and let the app continue update image");
                            this.f29237j = true;
                            this.A = 0;
                            b0();
                        } else {
                            i10 = r().f32324i;
                        }
                    } else {
                        a0((byte) 1, r().f32324i);
                        return 2;
                    }
                } else {
                    i10 = r().f32324i;
                }
                a0((byte) 0, i10);
                return 2;
            }
            int i11 = r().f32327l / 30;
            d(30000L);
            return 2;
        } catch (ie.a unused) {
            r().f32322g = r().f32321f;
            return 1;
        }
    }

    public final void B0() {
        u0();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            if (i10 >= 3) {
                break;
            }
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException unused) {
            }
            if (W(this.F, 1) == 0) {
                this.X = new ze.j(17);
                U();
                if (s().f32262l >= 6) {
                    if (s().f32274x == this.f17658z0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        boolean z11 = this.f29222b;
                        StringBuilder a10 = android.support.v4.media.d.a("role swap success, bud role=");
                        a10.append(s().f32274x);
                        ge.b.e(a10.toString(), z11);
                        break;
                    }
                    ge.b.e(String.format(Locale.US, "rws swap not completed, hfpState=0x%02X,bud role(%d), target is %d", Integer.valueOf(vd.b.f29198l.e(1, G(this.H))), Integer.valueOf(s().f32274x), Integer.valueOf(this.f17658z0)), this.f29221a);
                } else {
                    x0();
                    if (s().f32275y == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ge.b.e(String.format("role swap success, RwsUpdateFlag = 0x%02X", Integer.valueOf(s().f32275y)), this.f29222b);
                        break;
                    }
                    ge.b.e(String.format("rws state not read, RwsUpdateFlag = 0x%02X", Integer.valueOf(s().f32275y)), this.f29221a);
                }
            }
            i10++;
        }
        if (z10) {
            return;
        }
        throw new ne.c("role swap failed", DfuBaseService.NOTIFICATION_ID);
    }

    @Override // gf.a, we.b
    public final void J() {
        int i10 = r().f32319d;
        int i11 = r().f32322g;
        if (i11 < 0 || i11 >= i10) {
            ge.b.n("invalid FileIndex: " + i11 + ", reset to 0");
            i11 = 0;
        }
        r().f32320e = i11;
        te.a aVar = (te.a) this.f29253w.get(i11);
        this.f29254x = aVar;
        if (aVar != null) {
            if (this.f29221a) {
                ge.b.n(String.format("mCurBinInputStream's binId=0x%04X", Integer.valueOf(aVar.f28058o)));
            }
            ze.g r10 = r();
            te.a aVar2 = this.f29254x;
            r10.d(aVar2.f28058o, aVar2.f28053j, aVar2.f28055l, aVar2.s() + 12, q().f32299m);
        } else {
            ge.b.o("mCurBinInputStream == null", this.f29222b);
        }
        int i12 = i11 + 1;
        if (i12 < i10) {
            this.f29255y = (te.a) this.f29253w.get(i12);
            this.f29256z = i12;
            return;
        }
        this.f29255y = null;
        this.f29256z = -1;
    }

    @Override // ve.a
    public final void h(int i10, boolean z10) {
        if (i10 != 0) {
            try {
                int max = Math.max(i10 - 12, 0);
                byte[] bArr = new byte[r().f32316a];
                if (z10) {
                    this.f29254x.q(max, bArr);
                } else {
                    this.f29254x.read(bArr, 0, max);
                }
            } catch (IOException e10) {
                ge.b.p(e10.toString());
                return;
            }
        }
        r().h(i10);
    }

    @Override // we.b, ve.a
    public final void o() {
        int v10;
        int i10;
        try {
            setName("ProcessorXS0011");
            ge.b.e("ProcessorXS0011 running.", this.f29221a);
            v10 = v();
        } catch (ie.a e10) {
            ge.b.p(e10.toString());
            c(e10.f16770b, false);
        } catch (Exception e11) {
            ge.b.p(e11.toString());
            c(0, false);
        }
        if (v10 != 0) {
            c(v10, false);
            return;
        }
        z(514);
        this.F = this.H;
        this.f29237j = true;
        this.A = 0;
        if (y0()) {
            B0();
            ge.b.d("start to upload secondary bud ...");
            this.f29237j = true;
            this.f29235i = false;
            this.A = 0;
            if (y0()) {
                if (!this.U) {
                    i10 = 523;
                } else {
                    Y(true);
                    if (q().d()) {
                        vd.b.f29198l.c(this.f29798n0.getRemoteDevice(this.F));
                        vd.b.f29198l.d(this.F);
                    }
                    i10 = 258;
                }
                z(i10);
            }
        }
        n(this.f29254x);
        ge.b.e("DfuThread stopped", this.f29221a);
        if (this.f29252v == 525) {
            z(259);
        }
    }

    public final boolean w0() {
        f0(this.F);
        if (!this.f29235i) {
            this.f29235i = false;
            if (!(!this.f29233h)) {
                c(4128, false);
            } else {
                z(517);
                try {
                    Thread.sleep(1500L);
                } catch (InterruptedException unused) {
                }
                ze.h hVar = this.f29238j0;
                if (hVar != null) {
                    try {
                        N((short) 1554, new byte[]{(byte) (hVar.f32334a & 255)});
                    } catch (Exception unused2) {
                        ge.b.o("CMD_OTA_TEST error, ignore", this.f29221a);
                    }
                }
                this.X = new ze.j(17);
                U();
                if (s().f32273w && s().f32262l < 6) {
                    x0();
                    if (s().f32275y != 0) {
                        throw new ne.c("rws state not ready", 282);
                    }
                }
                v0();
                if (s().P && s().f32262l >= 5) {
                    T();
                }
                if (s().O == 3) {
                    S();
                }
                if (this.f29221a) {
                    ge.b.d(s().toString());
                }
                K();
                this.f29235i = true;
                ge.b.d("Ota Environment prepared.");
            }
        } else {
            J();
        }
        if (this.f29254x != null) {
            return true;
        }
        c(DfuBaseService.ERROR_FILE_NOT_FOUND, false);
        return false;
    }

    public final void x0() {
        ge.b.e(String.format("<< CMD_OTA_GET_OTHER_INFO (0x%04X)", (short) 1547), this.f29221a);
        byte[] d02 = d0((short) 1547, null);
        if (d02 != null && d02.length > 0) {
            s().f32275y = d02[0] & 1;
        } else {
            s().f32275y = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x004f, code lost:
        if (r4 == 1) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean y0() {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            r2 = 1
            r3 = 0
        L4:
            boolean r4 = r9.f29233h
            r4 = r4 ^ r0
            r5 = 4128(0x1020, float:5.785E-42)
            if (r4 != 0) goto Lf
            r9.c(r5, r1)
            return r1
        Lf:
            boolean r4 = r9.w0()     // Catch: ie.a -> L7c
            if (r4 != 0) goto L16
            return r1
        L16:
            if (r2 == 0) goto L1c
            r9.n0()     // Catch: ie.a -> L7c
            r2 = 0
        L1c:
            r9.o0()     // Catch: ie.a -> L7c
            int r4 = r9.r0()     // Catch: ie.a -> L7c
            r6 = 2
            java.lang.String r7 = "validate faild during copy, switch to push flow"
            r8 = 3
            if (r4 != r6) goto L30
            int r4 = r9.i0()     // Catch: ie.a -> L7c
            if (r4 != r0) goto L58
            goto L51
        L30:
            if (r4 != r0) goto L3e
            int r4 = r9.A0()     // Catch: ie.a -> L7c
            if (r4 != r0) goto L58
            java.lang.String r4 = "validate faild during skip, switch to push flow"
            ge.b.d(r4)     // Catch: ie.a -> L7c
            goto L54
        L3e:
            if (r4 != r8) goto L54
            int r4 = r9.A0()     // Catch: ie.a -> L7c
            if (r4 != r0) goto L58
            java.lang.String r4 = "validate faild during skip, switch to copy flow"
            ge.b.d(r4)     // Catch: ie.a -> L7c
            int r4 = r9.i0()     // Catch: ie.a -> L7c
            if (r4 != r0) goto L58
        L51:
            ge.b.d(r7)     // Catch: ie.a -> L7c
        L54:
            int r4 = r9.z0()     // Catch: ie.a -> L7c
        L58:
            if (r4 != 0) goto L5b
            return r1
        L5b:
            if (r4 != r8) goto L72
            ze.j r4 = r9.s()     // Catch: ie.a -> L7c
            boolean r4 = r4.P     // Catch: ie.a -> L7c
            if (r4 == 0) goto L71
            ze.j r4 = r9.s()     // Catch: ie.a -> L7c
            int r4 = r4.f32262l     // Catch: ie.a -> L7c
            r6 = 5
            if (r4 < r6) goto L71
            r9.t0()     // Catch: ie.a -> L7c
        L71:
            r3 = 1
        L72:
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r4)     // Catch: java.lang.InterruptedException -> L78
            goto L79
        L78:
        L79:
            if (r3 == 0) goto L4
            goto L9f
        L7c:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r6 = r9.f29252v
            java.lang.String r7 = ", "
            androidx.fragment.app.h1.b(r6, r4, r7, r2)
            int r2 = r2.f16770b
            if (r2 != r5) goto L91
            r9.c(r2, r0)
            goto L9f
        L91:
            r0 = 4097(0x1001, float:5.741E-42)
            if (r2 != r0) goto L99
            r9.c(r2, r1)
            goto L9f
        L99:
            r9.V()
            r9.c(r2, r1)
        L9f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.l.y0():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0170 A[Catch: IOException -> 0x0331, TryCatch #0 {IOException -> 0x0331, blocks: (B:272:0x015d, B:274:0x0162, B:280:0x0170, B:281:0x0197, B:283:0x019b, B:288:0x01e7, B:290:0x0206, B:291:0x0226, B:293:0x0229, B:286:0x01c5, B:287:0x01d5), top: B:407:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x019b A[Catch: IOException -> 0x0331, TryCatch #0 {IOException -> 0x0331, blocks: (B:272:0x015d, B:274:0x0162, B:280:0x0170, B:281:0x0197, B:283:0x019b, B:288:0x01e7, B:290:0x0206, B:291:0x0226, B:293:0x0229, B:286:0x01c5, B:287:0x01d5), top: B:407:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0206 A[Catch: IOException -> 0x0331, TryCatch #0 {IOException -> 0x0331, blocks: (B:272:0x015d, B:274:0x0162, B:280:0x0170, B:281:0x0197, B:283:0x019b, B:288:0x01e7, B:290:0x0206, B:291:0x0226, B:293:0x0229, B:286:0x01c5, B:287:0x01d5), top: B:407:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0229 A[Catch: IOException -> 0x0331, TRY_LEAVE, TryCatch #0 {IOException -> 0x0331, blocks: (B:272:0x015d, B:274:0x0162, B:280:0x0170, B:281:0x0197, B:283:0x019b, B:288:0x01e7, B:290:0x0206, B:291:0x0226, B:293:0x0229, B:286:0x01c5, B:287:0x01d5), top: B:407:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0435 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x024c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int z0() {
        /*
            Method dump skipped, instructions count: 1313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.l.z0():int");
    }
}
