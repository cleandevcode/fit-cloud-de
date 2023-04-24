package we;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import be.d;
import com.realsil.sdk.dfu.DfuService;
import java.util.ArrayList;
import no.nordicsemi.android.dfu.DfuBaseService;
import re.b;
import ze.e;
import ze.g;
import ze.j;

/* loaded from: classes.dex */
public abstract class b extends ve.a {

    /* renamed from: m0 */
    public BluetoothManager f29797m0;

    /* renamed from: n0 */
    public BluetoothAdapter f29798n0;

    /* renamed from: o0 */
    public final Object f29799o0;

    /* renamed from: p0 */
    public volatile boolean f29800p0;

    /* renamed from: q0 */
    public int[] f29801q0;

    public b(DfuService dfuService, e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
        this.f29799o0 = new Object();
        this.f29800p0 = false;
        u();
    }

    public final void E(int i10, BluetoothDevice bluetoothDevice) {
        String str = this.F;
        if (str != null && str.equals(bluetoothDevice.getAddress()) && i10 == 2) {
            ge.b.o("profile connected", this.f29221a);
            try {
                synchronized (this.f29236i0) {
                    this.f29236i0.notifyAll();
                }
            } catch (Exception e10) {
                ge.b.f(e10.toString());
            }
        }
    }

    public final void F(d dVar) {
        if (!this.f29233h) {
            z(515);
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
                ge.b.p("didn't find the remote device");
                this.D = 265;
            }
            if (this.D == 0) {
                return;
            }
            throw new ne.c("Error while scan remote device", this.D);
        }
        throw new ne.c("user aborted", 4128);
    }

    public final BluetoothDevice G(String str) {
        try {
            return this.f29798n0.getRemoteDevice(str);
        } catch (Exception e10) {
            if (this.f29221a) {
                ge.b.p(e10.toString());
            }
            return null;
        }
    }

    public void H(d dVar) {
    }

    public final void I() {
        synchronized (this.f29234h0) {
            if (this.f29232g0) {
                ge.b.e("Remote busy now, just wait!", this.f29221a);
                try {
                    this.f29234h0.wait(60000L);
                } catch (InterruptedException unused) {
                }
                if (this.f29222b) {
                    ge.b.n("Remote idle now, just go!");
                }
            }
        }
    }

    public void J() {
        int i10 = r().f32319d;
        int i11 = r().f32322g;
        if (i11 < 0 || i11 >= i10) {
            boolean z10 = this.f29221a;
            ge.b.o("invalid FileIndex: " + i11 + ", reset to 0", z10);
            i11 = 0;
        }
        r().f32320e = i11;
        te.a aVar = (te.a) this.f29253w.get(i11);
        this.f29254x = aVar;
        if (aVar != null) {
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
        } else {
            this.f29255y = null;
            this.f29256z = -1;
        }
        if (this.f29221a) {
            ge.b.n(r().toString());
        }
    }

    public void K() {
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
        this.f29253w = x10;
        if (x10 != null && x10.size() > 0) {
            if (r().f32322g == 0) {
                this.f29801q0 = new int[this.f29253w.size()];
            }
            r().f32319d = this.f29253w.size();
            J();
            return;
        }
        ge.b.e("pendingImageInputStreams is null or empty", this.f29221a);
        throw new ne.b("no available file to update", DfuBaseService.ERROR_FILE_NOT_FOUND);
    }

    @Override // ve.a
    public void o() {
    }

    @Override // ve.a
    public void u() {
        String str;
        super.u();
        this.X = new j(this.f29225d);
        if (this.f29797m0 == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) this.f29223c.getSystemService("bluetooth");
            this.f29797m0 = bluetoothManager;
            if (bluetoothManager == null) {
                str = "Unable to initialize BluetoothManager.";
                ge.b.p(str);
            }
        }
        BluetoothAdapter adapter = this.f29797m0.getAdapter();
        this.f29798n0 = adapter;
        if (adapter == null) {
            str = "Unable to obtain a BluetoothAdapter.";
            ge.b.p(str);
        }
    }

    @Override // ve.a
    public final int v() {
        int v10 = super.v();
        if (v10 != 0) {
            return v10;
        }
        if (!BluetoothAdapter.checkBluetoothAddress(this.H)) {
            if (this.f29221a) {
                StringBuilder a10 = android.support.v4.media.d.a("invalid address: ");
                a10.append(this.H);
                ge.b.p(a10.toString());
                return 4112;
            }
            ge.b.d("invalid address: ");
            return 4112;
        }
        return 0;
    }
}
