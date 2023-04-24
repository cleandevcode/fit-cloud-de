package jf;

import android.util.SparseIntArray;
import com.realsil.sdk.dfu.DfuService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;
import re.b;

/* loaded from: classes.dex */
public final class j extends i {
    public SparseIntArray C0;

    public j(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
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

    @Override // gf.a, we.b
    public final void K() {
        n(this.f29254x);
        b.a aVar = new b.a();
        aVar.f25577e = q().f32281d;
        aVar.f25574b = q().f32285f;
        aVar.f25575c = this.L;
        aVar.f25576d = q().b();
        aVar.f25573a = this.f29223c;
        aVar.f25588p = this.Q;
        aVar.f25582j = this.M;
        aVar.f25583k = s();
        aVar.f25586n = q().f();
        aVar.f25587o = q().g();
        boolean h10 = q().h();
        int i10 = q().f32295k;
        aVar.f25584l = h10;
        aVar.f25585m = i10;
        aVar.f25589q = true;
        ze.a v10 = cf.b.v(aVar.a());
        if (v10 != null) {
            if (v10.f32234h == 4096) {
                this.f29253w = v10.f32242p;
                this.C0 = v10.f32243q;
            } else {
                this.f29253w = null;
                this.C0 = null;
            }
        } else {
            this.C0 = null;
            this.f29253w = null;
        }
        ArrayList arrayList = this.f29253w;
        if (arrayList != null && arrayList.size() > 0) {
            if (r().f32322g == 0) {
                this.f29801q0 = new int[this.f29253w.size()];
            }
            r().f32319d = this.f29253w.size();
            if (this.f29221a) {
                ge.b.n(r().toString());
            }
            J();
            return;
        }
        ge.b.d("pendingImageInputStreams == null || pendingImageInputStreams.size() <= 0");
        throw new ne.b("load image file error", DfuBaseService.ERROR_FILE_NOT_FOUND);
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
            setName("ProcessorXS0011ForceCopy");
            ge.b.d("ProcessorXS0011ForceCopy running.");
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

    @Override // jf.i
    public final void t0() {
        SparseIntArray sparseIntArray = this.C0;
        if (sparseIntArray == null || sparseIntArray.size() <= 0) {
            ge.b.n("no force copy images exist");
            return;
        }
        for (int i10 = 0; i10 < this.C0.size(); i10++) {
            int keyAt = this.C0.keyAt(i10);
            ge.b.n(String.format(Locale.US, "force copy data image:%d, imageId=0x%02X, value=0x%02X", Integer.valueOf(i10), Integer.valueOf(keyAt), Integer.valueOf(this.C0.valueAt(i10))));
            g0(keyAt);
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

    /* JADX WARN: Code restructure failed: missing block: B:89:0x004f, code lost:
        if (r4 == 1) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x0() {
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
            boolean r4 = r9.w0()     // Catch: ie.a -> L71
            if (r4 != 0) goto L16
            return r1
        L16:
            if (r2 == 0) goto L1c
            r9.n0()     // Catch: ie.a -> L71
            r2 = 0
        L1c:
            r9.o0()     // Catch: ie.a -> L71
            int r4 = r9.r0()     // Catch: ie.a -> L71
            r6 = 2
            java.lang.String r7 = "validate faild during copy, switch to push flow"
            r8 = 3
            if (r4 != r6) goto L30
            int r4 = r9.i0()     // Catch: ie.a -> L71
            if (r4 != r0) goto L58
            goto L51
        L30:
            if (r4 != r0) goto L3e
            int r4 = r9.z0()     // Catch: ie.a -> L71
            if (r4 != r0) goto L58
            java.lang.String r4 = "validate faild during skip, switch to push flow"
            ge.b.d(r4)     // Catch: ie.a -> L71
            goto L54
        L3e:
            if (r4 != r8) goto L54
            int r4 = r9.z0()     // Catch: ie.a -> L71
            if (r4 != r0) goto L58
            java.lang.String r4 = "validate faild during skip, switch to copy flow"
            ge.b.d(r4)     // Catch: ie.a -> L71
            int r4 = r9.i0()     // Catch: ie.a -> L71
            if (r4 != r0) goto L58
        L51:
            ge.b.d(r7)     // Catch: ie.a -> L71
        L54:
            int r4 = r9.y0()     // Catch: ie.a -> L71
        L58:
            if (r4 != 0) goto L5b
            return r1
        L5b:
            if (r4 != r8) goto L67
            r9.t0()     // Catch: ie.a -> L61
            goto L66
        L61:
            java.lang.String r4 = "processForceCopyProcedure failed"
            ge.b.n(r4)     // Catch: ie.a -> L71
        L66:
            r3 = 1
        L67:
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r4)     // Catch: java.lang.InterruptedException -> L6d
            goto L6e
        L6d:
        L6e:
            if (r3 == 0) goto L4
            goto L94
        L71:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r6 = r9.f29252v
            java.lang.String r7 = ", "
            androidx.fragment.app.h1.b(r6, r4, r7, r2)
            int r2 = r2.f16770b
            if (r2 != r5) goto L86
            r9.c(r2, r0)
            goto L94
        L86:
            r0 = 4097(0x1001, float:5.741E-42)
            if (r2 != r0) goto L8e
            r9.c(r2, r1)
            goto L94
        L8e:
            r9.V()
            r9.c(r2, r1)
        L94:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.j.x0():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0164 A[Catch: IOException -> 0x0323, TryCatch #0 {IOException -> 0x0323, blocks: (B:267:0x0151, B:269:0x0156, B:275:0x0164, B:276:0x0189, B:278:0x018d, B:282:0x01d5, B:284:0x01f4, B:285:0x0214, B:287:0x0217, B:280:0x01b3, B:281:0x01c3), top: B:401:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x018d A[Catch: IOException -> 0x0323, TryCatch #0 {IOException -> 0x0323, blocks: (B:267:0x0151, B:269:0x0156, B:275:0x0164, B:276:0x0189, B:278:0x018d, B:282:0x01d5, B:284:0x01f4, B:285:0x0214, B:287:0x0217, B:280:0x01b3, B:281:0x01c3), top: B:401:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x01f4 A[Catch: IOException -> 0x0323, TryCatch #0 {IOException -> 0x0323, blocks: (B:267:0x0151, B:269:0x0156, B:275:0x0164, B:276:0x0189, B:278:0x018d, B:282:0x01d5, B:284:0x01f4, B:285:0x0214, B:287:0x0217, B:280:0x01b3, B:281:0x01c3), top: B:401:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0217 A[Catch: IOException -> 0x0323, TRY_LEAVE, TryCatch #0 {IOException -> 0x0323, blocks: (B:267:0x0151, B:269:0x0156, B:275:0x0164, B:276:0x0189, B:278:0x018d, B:282:0x01d5, B:284:0x01f4, B:285:0x0214, B:287:0x0217, B:280:0x01b3, B:281:0x01c3), top: B:401:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0427 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x023a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int y0() {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.j.y0():int");
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
}
