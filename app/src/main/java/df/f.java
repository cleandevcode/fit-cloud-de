package df;

import a0.g2;
import androidx.appcompat.widget.e2;
import androidx.fragment.app.h1;
import com.realsil.sdk.dfu.DfuService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;
import re.b;
import ze.j;

/* loaded from: classes.dex */
public final class f extends b {
    public f(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
    }

    public final boolean D0() {
        h0(this.F);
        j0();
        if (!this.f29235i) {
            this.f29235i = false;
            z(517);
            try {
                Thread.sleep(1500L);
            } catch (InterruptedException unused) {
            }
            this.X = new j(this.f29225d);
            if (!this.f29233h) {
                ge.b.d(String.format(Locale.US, "<< OPCODE_DFU_DEVICE_INFO (0x%02X)", (byte) 13));
                P(this.M0, new byte[]{13}, false);
                if (this.f29221a) {
                    ge.b.d("... waiting OPCODE_DFU_DEVICE_INFO response");
                }
                byte[] Z = Z();
                if (Z[2] == 1) {
                    s().s(3, Z);
                    m0();
                    if (this.f29221a) {
                        ge.b.d(s().toString());
                    }
                    K();
                    this.f29235i = true;
                    ge.b.d("Ota Environment prepared.");
                } else {
                    ge.b.f("Get dev info failed");
                    throw new ne.c("get remote dev info failed", 270);
                }
            } else {
                throw new ne.c("user aborted", 4128);
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

    public final boolean E0() {
        te.a aVar;
        int i10;
        z(514);
        this.F = this.H;
        this.f29237j = true;
        boolean z10 = false;
        while (!this.f29233h) {
            try {
            } catch (ie.a e10) {
                h1.b(this.f29252v, new StringBuilder(), ", ", e10);
                int i11 = e10.f16770b;
                if (i11 == 4128) {
                    c(i11, true);
                } else {
                    if (i11 != 4097 && i11 != 265) {
                        p0();
                    }
                    c(i11, false);
                }
            }
            if (!D0() || !F0()) {
                return false;
            }
            this.A += r().f32317b;
            if (r().f()) {
                ge.b.d("no pending image file to upload.");
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
                    this.f29237j = true;
                    this.A = 0;
                    this.f29235i = false;
                    B0();
                    A0();
                } else if (s().O == 3 && (aVar = this.f29255y) != null && e0(aVar, this.A, s().E * 4096)) {
                    ge.b.d("make device to enter the ota advertiser mode, and let the app continue update image");
                    this.f29237j = true;
                    this.A = 0;
                    this.f29235i = false;
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

    /* JADX WARN: Code restructure failed: missing block: B:298:0x0234, code lost:
        r1 = 0;
        r2 = r16;
        r5 = r17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F0() {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: df.f.F0():boolean");
    }

    @Override // we.b
    public final void J() {
        int i10 = r().f32319d;
        int i11 = r().f32322g;
        if (i11 < 0 || i11 >= i10) {
            ge.b.d("invalid FileIndex: " + i11 + ", reset to 0");
            i11 = 0;
        }
        r().f32320e = i11;
        Iterator it = this.f29253w.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            te.a aVar = (te.a) it.next();
            if (p001if.d.b(aVar.f28053j, this.f29801q0) >= 0) {
                ge.b.d(String.format("ignore 0x%04X, alreay ota", Integer.valueOf(aVar.f28053j)));
            } else if (aVar.f28053j == s().Y) {
                ge.b.d(String.format("find NoTempImageId: 0x%04X", Integer.valueOf(aVar.f28053j)));
                this.f29254x = aVar;
                break;
            }
        }
        te.a aVar2 = this.f29254x;
        if (aVar2 != null) {
            if (this.f29221a) {
                ge.b.n(String.format("mCurBinInputStream's binId=0x%04X", Integer.valueOf(aVar2.f28058o)));
            }
            ze.g r10 = r();
            te.a aVar3 = this.f29254x;
            r10.d(aVar3.f28058o, aVar3.f28053j, aVar3.f28055l, aVar3.s(), q().f32299m);
        } else {
            ge.b.o("mCurBinInputStream == null", this.f29222b);
        }
        this.f29255y = null;
        this.f29256z = -1;
    }

    @Override // we.b
    public final void K() {
        n(this.f29254x);
        b.a aVar = new b.a();
        aVar.f25577e = q().f32281d;
        aVar.f25574b = q().f32285f;
        aVar.f25575c = this.L;
        aVar.f25576d = q().b();
        aVar.f25573a = this.f29223c;
        aVar.f25582j = this.M;
        aVar.f25594v = q().f32298l0;
        aVar.f25588p = q().f32279c;
        aVar.f25583k = s();
        aVar.f25586n = q().f();
        aVar.f25587o = q().g();
        boolean h10 = q().h();
        int i10 = q().f32295k;
        aVar.f25584l = h10;
        aVar.f25585m = i10;
        ArrayList x10 = cf.b.x(aVar.a());
        this.f29253w = new ArrayList();
        if (x10 != null && x10.size() > 0) {
            Iterator it = x10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                te.a aVar2 = (te.a) it.next();
                if (this.f29222b) {
                    ge.b.d(String.format("0x%04X, 0x%04X", Integer.valueOf(aVar2.f28053j), Integer.valueOf(s().Y)));
                }
                if (aVar2.f28053j == s().Y) {
                    this.f29253w.add(aVar2);
                    break;
                }
            }
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
        ge.b.p("pendingImageInputStreams == null || pendingImageInputStreams.size() <= 0");
        throw new ne.b("no available file to update", DfuBaseService.ERROR_FILE_NOT_FOUND);
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
        E0();
        n(this.f29254x);
        if (this.f29221a) {
            ge.b.d("GattDfuTaskX0000 stopped");
        }
        if (this.f29252v == 525) {
            z(259);
        }
    }
}
