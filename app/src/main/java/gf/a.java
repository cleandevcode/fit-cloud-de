package gf;

import a0.g2;
import android.bluetooth.BluetoothDevice;
import android.support.v4.media.d;
import androidx.fragment.app.a0;
import com.realsil.sdk.dfu.DfuService;
import ed.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import no.nordicsemi.android.dfu.DfuBaseService;
import re.b;
import we.b;
import ze.e;
import ze.g;

/* loaded from: classes.dex */
public abstract class a extends b {

    /* renamed from: r0 */
    public be.a f15318r0;

    /* renamed from: s0 */
    public volatile boolean f15319s0;

    /* renamed from: t0 */
    public C0272a f15320t0;

    /* renamed from: u0 */
    public volatile byte[] f15321u0;

    /* renamed from: v0 */
    public volatile boolean f15322v0;

    /* renamed from: w0 */
    public HashSet f15323w0;

    /* renamed from: x0 */
    public HashMap f15324x0;

    /* renamed from: y0 */
    public c f15325y0;

    /* renamed from: gf.a$a */
    /* loaded from: classes.dex */
    public class C0272a extends a0 {
        public C0272a() {
            a.this = r1;
        }

        @Override // androidx.fragment.app.a0
        public final void B(int i10) {
            if (a.this.f29222b) {
                ge.b.n("state= " + i10);
            }
        }

        @Override // androidx.fragment.app.a0
        public final void y(be.b bVar) {
            boolean z10;
            if (!a.this.f15319s0) {
                if (a.this.f29221a) {
                    ge.b.d("is already stop the scan, do nothing");
                    return;
                }
                return;
            }
            a aVar = a.this;
            aVar.getClass();
            BluetoothDevice bluetoothDevice = bVar.f4151a;
            if (aVar.f29252v == 515) {
                String str = aVar.H;
                if (str != null && str.equals(bluetoothDevice.getAddress())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    aVar.E = bVar.f4152b;
                    aVar.F = bluetoothDevice.getAddress();
                    if (aVar.f29221a) {
                        StringBuilder a10 = d.a("find target device: name=");
                        a10.append(aVar.E);
                        a10.append(" addr=");
                        a10.append(p.b.m(aVar.F));
                        ge.b.d(a10.toString());
                    }
                    aVar.f15319s0 = false;
                    be.a aVar2 = aVar.f15318r0;
                    if (aVar2 != null) {
                        aVar2.l();
                    }
                    synchronized (aVar.f29799o0) {
                        aVar.f29800p0 = true;
                        aVar.f29799o0.notifyAll();
                    }
                    return;
                }
                return;
            }
            zd.b.a(d.a("ignore process state: "), aVar.f29252v);
        }
    }

    public a(DfuService dfuService, e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
        this.f15321u0 = null;
        this.f15322v0 = false;
    }

    @Override // ve.a
    public void A() {
        ge.b.o("onDestroy", this.f29221a);
        this.f15319s0 = false;
        be.a aVar = this.f15318r0;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // we.b
    public final void H(be.d dVar) {
        if (this.f29221a) {
            ge.b.n("start le scan");
        }
        this.f15319s0 = true;
        be.a aVar = this.f15318r0;
        if (aVar == null) {
            if (this.f15320t0 == null) {
                this.f15320t0 = new C0272a();
            }
            this.f15318r0 = new be.a(this.f29223c, dVar, this.f15320t0);
        } else {
            aVar.f13586d = dVar;
        }
        this.f15318r0.k();
    }

    @Override // we.b
    public void J() {
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
            g r10 = r();
            te.a aVar2 = this.f29254x;
            r10.d(aVar2.f28058o, aVar2.f28053j, aVar2.f28055l, aVar2.s(), q().f32299m);
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

    @Override // we.b
    public void K() {
        n(this.f29254x);
        b.a aVar = new b.a();
        aVar.f25577e = q().f32281d;
        aVar.f25574b = q().f32285f;
        aVar.f25575c = this.L;
        aVar.f25576d = q().b();
        aVar.f25573a = this.f29223c;
        aVar.f25588p = this.Q;
        aVar.f25582j = this.M;
        aVar.f25594v = q().f32298l0;
        aVar.f25583k = s();
        aVar.f25586n = q().f();
        aVar.f25587o = q().g();
        boolean h10 = q().h();
        int i10 = q().f32295k;
        aVar.f25584l = h10;
        aVar.f25585m = i10;
        ArrayList x10 = cf.b.x(aVar.a());
        this.f29253w = x10;
        if (x10 != null && x10.size() > 0) {
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
        ge.b.e("pendingImageInputStreams == null || pendingImageInputStreams.size() <= 0", this.f29221a);
        throw new ne.b("load image file error", DfuBaseService.ERROR_FILE_NOT_FOUND);
    }

    public final void L(a0 a0Var) {
        ge.b.o(a0Var.toString(), this.f29221a);
        N(a0Var.p(), a0Var.h());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean M(ed.b r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.a.M(ed.b, boolean):boolean");
    }

    public final boolean N(short s10, byte[] bArr) {
        int i10;
        if (bArr != null) {
            i10 = bArr.length;
        } else {
            i10 = 0;
        }
        byte[] bArr2 = new byte[i10 + 2];
        bArr2[0] = (byte) (s10 & 255);
        bArr2[1] = (byte) ((s10 >> 8) & 255);
        if (i10 > 0) {
            System.arraycopy(bArr, 0, bArr2, 2, i10);
        }
        return M(new ed.b(2, s10, (short) 0, bArr2), false);
    }

    public final boolean O(byte[] bArr, int i10) {
        if (bArr.length >= i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            bArr = bArr2;
        }
        int length = bArr.length;
        byte[] bArr3 = new byte[length + 2];
        bArr3[0] = (byte) 3;
        bArr3[1] = (byte) 6;
        if (length > 0) {
            System.arraycopy(bArr, 0, bArr3, 2, length);
        }
        return M(new ed.b(2, (short) 1539, (short) 0, bArr3), false);
    }

    public final byte[] P(long j10) {
        this.D = 0;
        this.f15322v0 = true;
        try {
            synchronized (this.W) {
                if (this.D == 0 && this.f15321u0 == null && this.f29243m == 515) {
                    this.f15322v0 = false;
                    if (this.f29222b) {
                        ge.b.n("wait for notification, wait for " + j10 + "ms");
                    }
                    this.W.wait(j10);
                }
                if (this.D == 0 && !this.f15322v0) {
                    ge.b.p("wait for notification, but not come");
                    this.D = 767;
                }
            }
        } catch (InterruptedException e10) {
            StringBuilder a10 = d.a("readNotificationResponse interrupted, ");
            a10.append(e10.toString());
            ge.b.p(a10.toString());
            this.D = 259;
        }
        if (this.D == 0) {
            return this.f15321u0;
        }
        throw new ne.c("Unable to receive notification", this.D);
    }

    public final void Q(int i10) {
        int i11 = 16;
        if (i10 > 16) {
            i11 = (i10 / 16) * 16;
        }
        this.f29230f0 = i11;
        g2.c(d.a("> mBufferCheckMtuSize="), this.f29230f0);
    }

    public final byte[] R() {
        return P(q().f32296k0);
    }

    @Override // we.b, ve.a
    public final void u() {
        super.u();
        this.f15323w0 = new HashSet();
        this.f15324x0 = new HashMap();
        if (this.f15320t0 == null) {
            this.f15320t0 = new C0272a();
        }
        this.f15318r0 = new be.a(this.f29223c, null, this.f15320t0);
        this.f29231g = true;
        ge.b.n("initialize success");
    }
}
