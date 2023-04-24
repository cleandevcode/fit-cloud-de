package jf;

import androidx.fragment.app.h1;
import com.realsil.sdk.dfu.DfuService;
import java.io.IOException;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class k extends i {
    public k(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
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
                ge.b.f(e10.toString());
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
            setName("ProcessorXS0011ForceTemp");
            ge.b.d("ProcessorXS0011ForceTemp is running.");
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
        if (this.f29252v == 525) {
            z(259);
        }
        ge.b.d("ProcessorXS0011ForceTemp stopped.");
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
                this.X = new ze.j(17);
                U();
                if (s().f32273w) {
                    if (s().f32262l >= 6) {
                        if (this.A0 && s().f32274x != this.f17658z0) {
                            throw new ne.c("role swap failed", DfuBaseService.NOTIFICATION_ID);
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

    public final boolean x0() {
        boolean z10 = true;
        boolean z11 = false;
        while (!this.f29233h) {
            try {
            } catch (ie.a e10) {
                h1.b(this.f29252v, new StringBuilder(), ", ", e10);
                int i10 = e10.f16770b;
                if (i10 == 4128) {
                    c(i10, true);
                } else if (i10 == 4097) {
                    c(i10, false);
                } else {
                    V();
                    c(i10, false);
                }
            }
            if (!w0()) {
                return false;
            }
            if (z10) {
                n0();
                z10 = false;
            }
            o0();
            int y02 = y0();
            if (y02 == 0) {
                return false;
            }
            if (y02 == 2) {
                z11 = true;
            }
            try {
                Thread.sleep(1000L);
                continue;
            } catch (InterruptedException unused) {
                continue;
            }
            if (z11) {
                return z11;
            }
        }
        c(4128, false);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0146 A[Catch: IOException -> 0x0318, TryCatch #1 {IOException -> 0x0318, blocks: (B:210:0x0133, B:212:0x0138, B:218:0x0146, B:219:0x016d, B:221:0x0171, B:226:0x01bf, B:228:0x01e0, B:229:0x0200, B:231:0x0203, B:224:0x019c, B:225:0x01ad), top: B:324:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0171 A[Catch: IOException -> 0x0318, TryCatch #1 {IOException -> 0x0318, blocks: (B:210:0x0133, B:212:0x0138, B:218:0x0146, B:219:0x016d, B:221:0x0171, B:226:0x01bf, B:228:0x01e0, B:229:0x0200, B:231:0x0203, B:224:0x019c, B:225:0x01ad), top: B:324:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01e0 A[Catch: IOException -> 0x0318, TryCatch #1 {IOException -> 0x0318, blocks: (B:210:0x0133, B:212:0x0138, B:218:0x0146, B:219:0x016d, B:221:0x0171, B:226:0x01bf, B:228:0x01e0, B:229:0x0200, B:231:0x0203, B:224:0x019c, B:225:0x01ad), top: B:324:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0203 A[Catch: IOException -> 0x0318, TRY_LEAVE, TryCatch #1 {IOException -> 0x0318, blocks: (B:210:0x0133, B:212:0x0138, B:218:0x0146, B:219:0x016d, B:221:0x0171, B:226:0x01bf, B:228:0x01e0, B:229:0x0200, B:231:0x0203, B:224:0x019c, B:225:0x01ad), top: B:324:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int y0() {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.k.y0():int");
    }
}
