package s;

import a0.m0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import d0.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p0.c;
import s.i2;
import s.p2;

/* loaded from: classes.dex */
public class l2 extends i2.a implements i2, p2.b {

    /* renamed from: b */
    public final r1 f26062b;

    /* renamed from: c */
    public final Handler f26063c;

    /* renamed from: d */
    public final Executor f26064d;

    /* renamed from: e */
    public final ScheduledExecutorService f26065e;

    /* renamed from: f */
    public i2.a f26066f;

    /* renamed from: g */
    public t.g f26067g;

    /* renamed from: h */
    public c.d f26068h;

    /* renamed from: i */
    public c.a<Void> f26069i;

    /* renamed from: j */
    public d0.d f26070j;

    /* renamed from: a */
    public final Object f26061a = new Object();

    /* renamed from: k */
    public List<a0.m0> f26071k = null;

    /* renamed from: l */
    public boolean f26072l = false;

    /* renamed from: m */
    public boolean f26073m = false;

    /* renamed from: n */
    public boolean f26074n = false;

    /* loaded from: classes.dex */
    public class a implements d0.c<Void> {
        public a() {
            l2.this = r1;
        }

        @Override // d0.c
        public final void onFailure(Throwable th2) {
            l2.this.t();
            l2 l2Var = l2.this;
            r1 r1Var = l2Var.f26062b;
            r1Var.a(l2Var);
            synchronized (r1Var.f26167b) {
                r1Var.f26170e.remove(l2Var);
            }
        }

        @Override // d0.c
        public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
        }
    }

    public l2(r1 r1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f26062b = r1Var;
        this.f26063c = handler;
        this.f26064d = executor;
        this.f26065e = scheduledExecutorService;
    }

    @Override // s.p2.b
    public na.a a(final ArrayList arrayList) {
        synchronized (this.f26061a) {
            if (this.f26073m) {
                return new i.a(new CancellationException("Opener is disabled"));
            }
            d0.d d10 = d0.d.b(a0.s0.b(arrayList, this.f26064d, this.f26065e)).d(new d0.a() { // from class: s.j2
                @Override // d0.a
                public final na.a apply(Object obj) {
                    l2 l2Var = l2.this;
                    List list = arrayList;
                    List list2 = (List) obj;
                    l2Var.getClass();
                    y.u0.a("SyncCaptureSessionBase", "[" + l2Var + "] getSurface...done");
                    if (list2.contains(null)) {
                        return new i.a(new m0.a((a0.m0) list.get(list2.indexOf(null)), "Surface closed"));
                    }
                    if (list2.isEmpty()) {
                        return new i.a(new IllegalArgumentException("Unable to open capture session without surfaces"));
                    }
                    return d0.f.e(list2);
                }
            }, this.f26064d);
            this.f26070j = d10;
            return d0.f.f(d10);
        }
    }

    @Override // s.i2
    public final l2 b() {
        return this;
    }

    @Override // s.i2
    public final void c() {
        t();
    }

    @Override // s.i2
    public void close() {
        h1.i(this.f26067g, "Need to call openCaptureSession before using this API.");
        r1 r1Var = this.f26062b;
        synchronized (r1Var.f26167b) {
            r1Var.f26169d.add(this);
        }
        this.f26067g.f27412a.f27449a.close();
        this.f26064d.execute(new m(1, this));
    }

    @Override // s.i2
    public final CameraDevice d() {
        this.f26067g.getClass();
        return this.f26067g.a().getDevice();
    }

    @Override // s.p2.b
    public na.a<Void> e(CameraDevice cameraDevice, final u.i iVar, final List<a0.m0> list) {
        synchronized (this.f26061a) {
            if (this.f26073m) {
                return new i.a(new CancellationException("Opener is disabled"));
            }
            r1 r1Var = this.f26062b;
            synchronized (r1Var.f26167b) {
                r1Var.f26170e.add(this);
            }
            final t.u uVar = new t.u(cameraDevice, this.f26063c);
            c.d a10 = p0.c.a(new c.InterfaceC0425c() { // from class: s.k2
                @Override // p0.c.InterfaceC0425c
                public final String g(c.a aVar) {
                    boolean z10;
                    String str;
                    l2 l2Var = l2.this;
                    List<a0.m0> list2 = list;
                    t.u uVar2 = uVar;
                    u.i iVar2 = iVar;
                    synchronized (l2Var.f26061a) {
                        synchronized (l2Var.f26061a) {
                            l2Var.t();
                            a0.s0.a(list2);
                            l2Var.f26071k = list2;
                        }
                        if (l2Var.f26069i == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h1.k("The openCaptureSessionCompleter can only set once!", z10);
                        l2Var.f26069i = aVar;
                        uVar2.f27455a.a(iVar2);
                        str = "openCaptureSession[session=" + l2Var + "]";
                    }
                    return str;
                }
            });
            this.f26068h = a10;
            d0.f.a(a10, new a(), o8.b.i());
            return d0.f.f(this.f26068h);
        }
    }

    @Override // s.i2
    public final t.g f() {
        this.f26067g.getClass();
        return this.f26067g;
    }

    @Override // s.i2
    public int g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        h1.i(this.f26067g, "Need to call openCaptureSession before using this API.");
        t.g gVar = this.f26067g;
        return gVar.f27412a.a(captureRequest, this.f26064d, captureCallback);
    }

    @Override // s.i2
    public final void h() {
        h1.i(this.f26067g, "Need to call openCaptureSession before using this API.");
        this.f26067g.f27412a.f27449a.stopRepeating();
    }

    @Override // s.i2
    public na.a<Void> i() {
        return d0.f.e(null);
    }

    @Override // s.i2
    public final int j(ArrayList arrayList, a1 a1Var) {
        h1.i(this.f26067g, "Need to call openCaptureSession before using this API.");
        t.g gVar = this.f26067g;
        return gVar.f27412a.b(arrayList, this.f26064d, a1Var);
    }

    @Override // s.i2.a
    public final void k(l2 l2Var) {
        Objects.requireNonNull(this.f26066f);
        this.f26066f.k(l2Var);
    }

    @Override // s.i2.a
    public final void l(l2 l2Var) {
        Objects.requireNonNull(this.f26066f);
        this.f26066f.l(l2Var);
    }

    @Override // s.i2.a
    public void m(i2 i2Var) {
        c.d dVar;
        synchronized (this.f26061a) {
            try {
                if (!this.f26072l) {
                    this.f26072l = true;
                    h1.i(this.f26068h, "Need to call openCaptureSession before using this API.");
                    dVar = this.f26068h;
                } else {
                    dVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        t();
        if (dVar != null) {
            dVar.f23758b.a(new s(this, i2Var, 2), o8.b.i());
        }
    }

    @Override // s.i2.a
    public final void n(i2 i2Var) {
        Objects.requireNonNull(this.f26066f);
        t();
        r1 r1Var = this.f26062b;
        r1Var.a(this);
        synchronized (r1Var.f26167b) {
            r1Var.f26170e.remove(this);
        }
        this.f26066f.n(i2Var);
    }

    @Override // s.i2.a
    public void o(l2 l2Var) {
        Objects.requireNonNull(this.f26066f);
        r1 r1Var = this.f26062b;
        synchronized (r1Var.f26167b) {
            r1Var.f26168c.add(this);
            r1Var.f26170e.remove(this);
        }
        r1Var.a(this);
        this.f26066f.o(l2Var);
    }

    @Override // s.i2.a
    public final void p(l2 l2Var) {
        Objects.requireNonNull(this.f26066f);
        this.f26066f.p(l2Var);
    }

    @Override // s.i2.a
    public final void q(i2 i2Var) {
        c.d dVar;
        synchronized (this.f26061a) {
            try {
                if (!this.f26074n) {
                    this.f26074n = true;
                    h1.i(this.f26068h, "Need to call openCaptureSession before using this API.");
                    dVar = this.f26068h;
                } else {
                    dVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (dVar != null) {
            dVar.f23758b.a(new p(this, i2Var, 2), o8.b.i());
        }
    }

    @Override // s.i2.a
    public final void r(l2 l2Var, Surface surface) {
        Objects.requireNonNull(this.f26066f);
        this.f26066f.r(l2Var, surface);
    }

    public final void s(CameraCaptureSession cameraCaptureSession) {
        if (this.f26067g == null) {
            this.f26067g = new t.g(cameraCaptureSession, this.f26063c);
        }
    }

    @Override // s.p2.b
    public boolean stop() {
        boolean z10;
        boolean z11;
        d0.d dVar = null;
        try {
            synchronized (this.f26061a) {
                if (!this.f26073m) {
                    d0.d dVar2 = this.f26070j;
                    if (dVar2 != null) {
                        dVar = dVar2;
                    }
                    this.f26073m = true;
                }
                synchronized (this.f26061a) {
                    z10 = false;
                    if (this.f26068h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (!z11) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            if (dVar != null) {
                dVar.cancel(true);
            }
        }
    }

    public final void t() {
        synchronized (this.f26061a) {
            List<a0.m0> list = this.f26071k;
            if (list != null) {
                for (a0.m0 m0Var : list) {
                    m0Var.b();
                }
                this.f26071k = null;
            }
        }
    }
}
