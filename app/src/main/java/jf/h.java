package jf;

import com.realsil.sdk.dfu.DfuService;
import java.io.IOException;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class h extends i {
    public h(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
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
        vd.b bVar;
        String str;
        try {
            setName("ProcessorXS0011");
            ge.b.d("ProcessorXS0011 running.");
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
        this.A0 = false;
        if (x0()) {
            if (s().f32273w) {
                u0();
                ge.b.d("start to upload secondary bud ...");
                this.f29237j = true;
                this.f29235i = false;
                this.A = 0;
                if (x0()) {
                    if (this.U) {
                        Y(true);
                        if (q().d()) {
                            vd.b.f29198l.c(this.f29798n0.getRemoteDevice(this.F));
                            bVar = vd.b.f29198l;
                            str = this.F;
                            bVar.d(str);
                        }
                        z(258);
                    } else {
                        z(523);
                    }
                }
            } else {
                if (this.U) {
                    Y(true);
                    if (q().d()) {
                        vd.b.f29198l.c(this.f29798n0.getRemoteDevice(this.F));
                        bVar = vd.b.f29198l;
                        str = this.F;
                        bVar.d(str);
                    }
                    z(258);
                }
                z(523);
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
                        ge.b.n("CMD_OTA_TEST error, ignore");
                    }
                }
                this.X = new ze.j(17);
                U();
                if (s().f32273w) {
                    if (s().f32262l >= 6) {
                        if (this.A0 && s().f32274x != this.f17658z0) {
                            ge.b.o(String.format("hfpState = 0x%02X", Integer.valueOf(vd.b.f29198l.e(1, G(this.H)))), this.f29222b);
                            throw new ne.c(String.format("role swap failed, bud role(%d) din't change, target is %d", Integer.valueOf(s().f32274x), Integer.valueOf(this.f17658z0)), DfuBaseService.NOTIFICATION_ID);
                        }
                    } else {
                        ge.b.e(String.format("<< CMD_OTA_GET_OTHER_INFO (0x%04X)", (short) 1547), this.f29221a);
                        byte[] d02 = d0((short) 1547, null);
                        if (d02 != null && d02.length > 0) {
                            s().f32275y = d02[0] & 1;
                        } else {
                            s().f32275y = 0;
                        }
                        if (s().f32275y != 0) {
                            throw new ne.c("rws state not ready", 282);
                        }
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

    /* JADX WARN: Code restructure failed: missing block: B:92:0x004f, code lost:
        if (r4 == 1) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x0() {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            r2 = 1
            r3 = 0
        L4:
            boolean r4 = r9.f29233h
            r4 = r4 ^ r1
            r5 = 4128(0x1020, float:5.785E-42)
            if (r4 != 0) goto Lf
            r9.c(r5, r0)
            return r0
        Lf:
            boolean r4 = r9.w0()     // Catch: ie.a -> L7c
            if (r4 != 0) goto L16
            return r0
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
            if (r4 != r1) goto L58
            goto L51
        L30:
            if (r4 != r1) goto L3e
            int r4 = r9.z0()     // Catch: ie.a -> L7c
            if (r4 != r1) goto L58
            java.lang.String r4 = "validate faild during skip, switch to push flow"
            ge.b.d(r4)     // Catch: ie.a -> L7c
            goto L54
        L3e:
            if (r4 != r8) goto L54
            int r4 = r9.z0()     // Catch: ie.a -> L7c
            if (r4 != r1) goto L58
            java.lang.String r4 = "validate faild during skip, switch to copy flow"
            ge.b.d(r4)     // Catch: ie.a -> L7c
            int r4 = r9.i0()     // Catch: ie.a -> L7c
            if (r4 != r1) goto L58
        L51:
            ge.b.d(r7)     // Catch: ie.a -> L7c
        L54:
            int r4 = r9.y0()     // Catch: ie.a -> L7c
        L58:
            if (r4 != 0) goto L5b
            return r0
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
            goto La4
        L7c:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r6 = r9.f29252v
            java.lang.String r7 = ", "
            androidx.fragment.app.h1.b(r6, r4, r7, r2)
            int r2 = r2.f16770b
            if (r2 != r5) goto L91
            r9.c(r2, r1)
            goto La4
        L91:
            r1 = 4097(0x1001, float:5.741E-42)
            if (r2 != r1) goto L96
            goto L9a
        L96:
            r1 = 287(0x11f, float:4.02E-43)
            if (r2 != r1) goto L9e
        L9a:
            r9.c(r2, r0)
            goto La4
        L9e:
            r9.V()
            r9.c(r2, r0)
        La4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.h.x0():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0164 A[Catch: IOException -> 0x0325, TryCatch #0 {IOException -> 0x0325, blocks: (B:268:0x0151, B:270:0x0156, B:276:0x0164, B:277:0x018b, B:279:0x018f, B:284:0x01db, B:286:0x01fa, B:287:0x021a, B:289:0x021d, B:282:0x01b9, B:283:0x01c9), top: B:403:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x018f A[Catch: IOException -> 0x0325, TryCatch #0 {IOException -> 0x0325, blocks: (B:268:0x0151, B:270:0x0156, B:276:0x0164, B:277:0x018b, B:279:0x018f, B:284:0x01db, B:286:0x01fa, B:287:0x021a, B:289:0x021d, B:282:0x01b9, B:283:0x01c9), top: B:403:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x01fa A[Catch: IOException -> 0x0325, TryCatch #0 {IOException -> 0x0325, blocks: (B:268:0x0151, B:270:0x0156, B:276:0x0164, B:277:0x018b, B:279:0x018f, B:284:0x01db, B:286:0x01fa, B:287:0x021a, B:289:0x021d, B:282:0x01b9, B:283:0x01c9), top: B:403:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x021d A[Catch: IOException -> 0x0325, TRY_LEAVE, TryCatch #0 {IOException -> 0x0325, blocks: (B:268:0x0151, B:270:0x0156, B:276:0x0164, B:277:0x018b, B:279:0x018f, B:284:0x01db, B:286:0x01fa, B:287:0x021a, B:289:0x021d, B:282:0x01b9, B:283:0x01c9), top: B:403:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x042b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int y0() {
        /*
            Method dump skipped, instructions count: 1303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.h.y0():int");
    }

    public final int z0() {
        int i10;
        if (!(!this.f29233h)) {
            c(4128, false);
            return 0;
        }
        z(521);
        ge.b.d(String.format("mOtaWorkMode=0x%04X, ICType=%2X", Integer.valueOf(this.Q), Integer.valueOf(s().f32261k)));
        ge.b.n(r().toString());
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
            ge.b.o("Last send reach the bottom", this.f29222b);
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
}
