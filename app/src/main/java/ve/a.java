package ve;

import android.content.Context;
import android.content.res.AssetManager;
import android.support.v4.media.d;
import android.text.TextUtils;
import androidx.appcompat.widget.u0;
import com.realsil.sdk.dfu.DfuService;
import com.realsil.sdk.dfu.utils.AesJni;
import ge.b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import yb.y;
import ze.e;
import ze.f;
import ze.g;
import ze.h;
import ze.j;

/* loaded from: classes.dex */
public abstract class a extends Thread {
    public int A;
    public byte[] B;
    public AesJni C;
    public volatile int D;
    public String E;
    public String F;
    public String H;
    public String L;
    public j X;
    public g Y;

    /* renamed from: c */
    public Context f29223c;

    /* renamed from: e */
    public e f29227e;

    /* renamed from: f */
    public y f29229f;

    /* renamed from: g */
    public boolean f29231g;

    /* renamed from: h */
    public boolean f29233h;

    /* renamed from: i */
    public boolean f29235i;

    /* renamed from: j */
    public boolean f29237j;

    /* renamed from: j0 */
    public h f29238j0;

    /* renamed from: k0 */
    public f f29240k0;

    /* renamed from: l0 */
    public qe.a f29242l0;

    /* renamed from: o */
    public volatile boolean f29245o;

    /* renamed from: r */
    public volatile boolean f29248r;

    /* renamed from: s */
    public volatile int f29249s;

    /* renamed from: t */
    public volatile boolean f29250t;

    /* renamed from: u */
    public volatile boolean f29251u;

    /* renamed from: x */
    public te.a f29254x;

    /* renamed from: y */
    public te.a f29255y;

    /* renamed from: z */
    public int f29256z;

    /* renamed from: a */
    public boolean f29221a = false;

    /* renamed from: b */
    public boolean f29222b = false;

    /* renamed from: d */
    public int f29225d = 0;

    /* renamed from: k */
    public volatile boolean f29239k = false;

    /* renamed from: l */
    public final Object f29241l = new Object();

    /* renamed from: m */
    public int f29243m = 0;

    /* renamed from: n */
    public final Object f29244n = new Object();

    /* renamed from: p */
    public volatile byte[] f29246p = null;

    /* renamed from: q */
    public final Object f29247q = new Object();

    /* renamed from: v */
    public volatile int f29252v = 257;

    /* renamed from: w */
    public ArrayList f29253w = new ArrayList();
    public int M = -1;
    public int Q = 0;
    public boolean U = false;
    public int V = 20;
    public final Object W = new Object();
    public int Z = 0;

    /* renamed from: c0 */
    public int f29224c0 = 0;

    /* renamed from: d0 */
    public int f29226d0 = 0;

    /* renamed from: e0 */
    public int f29228e0 = DfuBaseService.ERROR_REMOTE_TYPE_LEGACY;

    /* renamed from: f0 */
    public int f29230f0 = 16;

    /* renamed from: g0 */
    public boolean f29232g0 = false;

    /* renamed from: h0 */
    public final Object f29234h0 = new Object();

    /* renamed from: i0 */
    public final Object f29236i0 = new Object();

    public a(DfuService dfuService, e eVar, DfuService.c cVar) {
        this.f29223c = dfuService;
        this.f29227e = eVar;
        if (eVar != null) {
            this.f29238j0 = eVar.f32300m0;
            this.f29240k0 = eVar.f32302n0;
        } else {
            this.f29238j0 = null;
            this.f29240k0 = null;
        }
        this.f29229f = cVar;
    }

    public static short a(int i10, byte[] bArr) {
        short s10 = 0;
        for (int i11 = 0; i11 < i10; i11 += 2) {
            s10 = (short) (s10 ^ ((short) ((bArr[i11 + 1] << 8) | (bArr[i11] & 255))));
        }
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >> 8));
    }

    public void A() {
    }

    public final void B(int i10) {
        String str;
        int i11 = this.f29243m;
        if (i11 != i10) {
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(i11);
            objArr[1] = Integer.valueOf(i10);
            if (i10 != 0) {
                if (i10 != 256) {
                    if (i10 != 1024) {
                        if (i10 != 1280) {
                            switch (i10) {
                                case DfuBaseService.ERROR_REMOTE_TYPE_SECURE /* 512 */:
                                    str = "STATE_CONNECTED";
                                    break;
                                case 513:
                                    str = "STATE_DISCOVER_SERVICE";
                                    break;
                                case 514:
                                    str = "SET_PREFERRED_PHY";
                                    break;
                                case 515:
                                    str = "STATE_CONNECTED_AND_READY";
                                    break;
                                default:
                                    str = u0.a("Unknown: ", i10);
                                    break;
                            }
                        } else {
                            str = "STATE_CLOSED";
                        }
                    } else {
                        str = "STATE_DISCONNECTING";
                    }
                } else {
                    str = "STATE_CONNECTING";
                }
            } else {
                str = "STATE_DISCONNECTED";
            }
            objArr[2] = str;
            b.d(String.format("Conn: 0x%04X >> 0x%04X(%s)", objArr));
        }
        this.f29243m = i10;
    }

    public final void C() {
        if (this.f29242l0 == null) {
            m();
        }
        qe.a aVar = this.f29242l0;
        if (aVar.f24814c) {
            aVar.f24812a = System.nanoTime();
        }
    }

    public final void D() {
        String str;
        try {
        } catch (InterruptedException e10) {
            StringBuilder a10 = d.a("waitUntilDisconnected interrupted: ");
            a10.append(e10.toString());
            b.p(a10.toString());
        }
        synchronized (this.f29241l) {
            int i10 = this.f29243m;
            if (i10 != 0 && i10 != 1280) {
                if (this.f29221a) {
                    b.n("wait for disconnect, wait for " + q().D + "ms");
                }
                this.f29241l.wait(q().D);
                int i11 = this.f29243m;
                if (i11 != 0 && i11 != 1280) {
                    str = "waitUntilDisconnected timeout";
                } else if (this.f29221a) {
                    str = "connection disconnected";
                } else {
                    return;
                }
                b.d(str);
                return;
            }
            if (this.f29221a) {
                b.d("connection already disconnected");
            }
        }
    }

    public final void b(int i10) {
        int max = Math.max(16, i10);
        this.f29228e0 = max;
        b.o(String.format(Locale.US, "mCurrentMaxBufferSize= %d", Integer.valueOf(max)), this.f29221a);
    }

    public abstract void c(int i10, boolean z10);

    public final void d(long j10) {
        try {
            b.n("wait device auto reconnect for " + j10);
            synchronized (this.f29236i0) {
                this.f29236i0.wait(j10);
            }
        } catch (InterruptedException e10) {
            b.p(e10.toString());
        }
    }

    public final void e(te.a aVar) {
        if (r().f32316a > 102400 && r().f32317b == 104000) {
            try {
                r().h(143348);
                aVar.skip(39348);
                b.e("big image reach the special size, skip some packet", this.f29221a);
            } catch (IOException e10) {
                b.p(e10.toString());
            }
        }
    }

    public void f() {
        boolean z10;
        if ((this.f29252v & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) == 256) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            b.d("already in idle state");
        } else {
            this.f29233h = true;
            z(525);
        }
        synchronized (this.W) {
            this.W.notifyAll();
        }
        synchronized (this.f29244n) {
            this.f29244n.notifyAll();
        }
        synchronized (this.f29241l) {
            this.f29241l.notifyAll();
        }
        try {
            synchronized (this.f29236i0) {
                this.f29236i0.notifyAll();
            }
        } catch (Exception e10) {
            b.f(e10.toString());
        }
    }

    public boolean g(boolean z10) {
        if (this.f29252v != 523) {
            b.p(String.format("activeImage failed, state conflict: 0x%04X", Integer.valueOf(this.f29252v)));
            return false;
        }
        return true;
    }

    public void h(int i10, boolean z10) {
        int read;
        int i11 = 0;
        if (i10 != 0) {
            try {
                int max = Math.max(i10 - 12, 0);
                byte[] bArr = new byte[r().f32316a];
                if (z10) {
                    read = this.f29254x.q(max, bArr);
                } else {
                    read = this.f29254x.read(bArr, 0, max);
                }
                i11 = read;
            } catch (IOException e10) {
                b.p(e10.toString());
                return;
            }
        }
        r().h(i11);
    }

    public final void i(int i10) {
        c(DfuBaseService.ERROR_FILE_NOT_FOUND, false);
    }

    public final void j(int i10, byte[] bArr) {
        if (bArr.length > i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            bArr = bArr2;
        }
        r().a(bArr.length);
        x();
    }

    public final boolean k() {
        String str;
        if (this.C == null) {
            this.C = new AesJni();
        }
        if (!this.C.aesInit(3, this.B)) {
            if (this.f29222b) {
                StringBuilder a10 = d.a("encrpt initial error, encrypted key: ");
                a10.append(Arrays.toString(this.B));
                str = a10.toString();
            } else {
                str = "encrpt initial error, encrypted key invalid!";
            }
            b.p(str);
            return false;
        }
        return true;
    }

    public final void l() {
        qe.a aVar = this.f29242l0;
        if (aVar == null || !aVar.f24814c || aVar.f24812a == -1 || aVar.f24813b == -1) {
            return;
        }
        do {
        } while (System.nanoTime() - aVar.f24812a < aVar.f24813b);
    }

    public final void m() {
        this.f29242l0 = new qe.a(q().f32312x * q().f32313y * 1000000, q().f32311w);
    }

    public final void n(te.a aVar) {
        if (aVar == null) {
            return;
        }
        try {
            if (this.f29222b) {
                b.n("closeInputStream...");
            }
            aVar.close();
        } catch (IOException e10) {
            boolean z10 = this.f29222b;
            StringBuilder a10 = d.a("closeInputStream fail: ");
            a10.append(e10.toString());
            b.q(a10.toString(), z10);
        }
    }

    public abstract void o();

    public final void p() {
        synchronized (this.f29247q) {
            this.f29248r = true;
            this.f29247q.notifyAll();
        }
    }

    public final e q() {
        if (this.f29227e == null) {
            this.f29227e = new e();
        }
        return this.f29227e;
    }

    public final g r() {
        if (this.Y == null) {
            this.Y = new g();
        }
        return this.Y;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        super.run();
        String format = String.format("DFU(%04X-%02X)", Integer.valueOf(this.f29225d), Integer.valueOf(this.Q));
        setName(format);
        b.b(1, format, "%s running...", this.f29222b);
        o();
        if (this.f29252v != 523) {
            A();
        }
    }

    public final j s() {
        if (this.X == null) {
            this.X = new j(this.f29225d);
        }
        return this.X;
    }

    public void t() {
        d(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT);
    }

    public void u() {
        boolean z10;
        z(513);
        this.f29231g = false;
        this.f29233h = false;
        this.f29232g0 = false;
        this.C = new AesJni();
        this.f29235i = false;
        this.f29253w = new ArrayList();
        this.A = 0;
        this.Y = new g();
        this.D = 0;
        if (q().f32282d0 != 0) {
            z10 = true;
        } else {
            z10 = ie.b.f16771a;
        }
        this.f29221a = z10;
        this.f29222b = ie.b.f16772b;
        if (this.f29221a) {
            b.d(q().toString());
        }
        this.f29225d = q().f32278b;
        this.H = q().f32283e;
        this.Q = q().f32279c;
        this.L = q().f32287g;
        this.M = q().f32291i;
        this.B = q().f32307s;
        this.U = q().f32297l;
        this.V = q().f32308t;
    }

    public int v() {
        boolean z10;
        StringBuilder sb2;
        if (!this.f29231g) {
            b.p("DfuThread not initialized");
            return 4114;
        } else if (TextUtils.isEmpty(this.L)) {
            b.p("the file path string is null");
            return DfuBaseService.ERROR_FILE_ERROR;
        } else {
            String a10 = he.b.a(this.L);
            if (a10 != null && a10.equalsIgnoreCase(q().b())) {
                boolean z11 = true;
                if (q().f32285f == 1) {
                    Context context = this.f29223c;
                    String str = this.L;
                    AssetManager assets = context.getResources().getAssets();
                    if (assets != null && !TextUtils.isEmpty(str)) {
                        int lastIndexOf = str.lastIndexOf("/");
                        String str2 = "";
                        if (lastIndexOf != -1) {
                            if (lastIndexOf != 0) {
                                str2 = str.substring(0, lastIndexOf);
                            }
                            str = str.substring(lastIndexOf + 1);
                        }
                        try {
                            String[] list = assets.list(str2);
                            if (list != null && list.length > 0) {
                                for (String str3 : list) {
                                    if (str.equals(str3)) {
                                        b.n("\t =" + str3);
                                        break;
                                    }
                                    b.n("\t =" + str3);
                                }
                                b.n(String.format("not find asset file: <%s>/<%s>", str2, str));
                            }
                            b.d(String.format("no asset file found: <%s>/<%s>", str2, str));
                        } catch (IOException e10) {
                            b.p(e10.toString());
                        }
                    }
                    z11 = false;
                    if (!z11) {
                        sb2 = new StringBuilder();
                        sb2.append("the bin file not exist, path: ");
                        sb2.append(this.L);
                        b.p(sb2.toString());
                        return DfuBaseService.ERROR_FILE_IO_EXCEPTION;
                    }
                    return 0;
                }
                try {
                    z10 = new File(this.L).exists();
                } catch (Exception e11) {
                    b.f(e11.getMessage());
                    z10 = false;
                }
                if (!z10) {
                    sb2 = new StringBuilder();
                    sb2.append("the bin file not exist, path: ");
                    sb2.append(this.L);
                    b.p(sb2.toString());
                    return DfuBaseService.ERROR_FILE_IO_EXCEPTION;
                }
                return 0;
            }
            b.p("the file suffix is not right, suffix=" + a10);
            return DfuBaseService.ERROR_FILE_INVALID;
        }
    }

    public final void w() {
        try {
            synchronized (this.f29241l) {
                this.f29239k = true;
                if (this.f29222b) {
                    b.n(String.format("isConnectedCallbackCome=%b", Boolean.valueOf(this.f29239k)));
                }
                this.f29241l.notifyAll();
            }
        } catch (Exception e10) {
            b.p(e10.toString());
        }
    }

    public final void x() {
        this.f29251u = r().e();
        y yVar = this.f29229f;
        if (yVar != null) {
            yVar.A(r());
        } else {
            b.o("no callback registered ", this.f29222b);
        }
    }

    public final void y() {
        synchronized (this.f29244n) {
            this.f29245o = true;
            this.f29244n.notifyAll();
        }
    }

    public final void z(int i10) {
        b.d(String.format("DFU: 0x%04X >> 0x%04X(%s)", Integer.valueOf(this.f29252v), Integer.valueOf(i10), o8.b.q(i10)));
        this.f29252v = i10;
        y yVar = this.f29229f;
        if (yVar != null) {
            yVar.B(this.f29252v);
        } else {
            b.o("no callback registered", this.f29222b);
        }
    }
}
