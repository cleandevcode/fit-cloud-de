package s;

import a0.l0;
import a0.m0;
import a0.u1;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import d0.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import x.e;

/* loaded from: classes.dex */
public final class g2 implements q1 {

    /* renamed from: n */
    public static ArrayList f25959n = new ArrayList();

    /* renamed from: o */
    public static int f25960o = 0;

    /* renamed from: a */
    public final a0.v1 f25961a;

    /* renamed from: b */
    public final Executor f25962b;

    /* renamed from: c */
    public final ScheduledExecutorService f25963c;

    /* renamed from: f */
    public a0.u1 f25966f;

    /* renamed from: g */
    public a0.u1 f25967g;

    /* renamed from: m */
    public int f25973m;

    /* renamed from: e */
    public List<a0.m0> f25965e = new ArrayList();

    /* renamed from: i */
    public volatile a0.h0 f25969i = null;

    /* renamed from: j */
    public volatile boolean f25970j = false;

    /* renamed from: k */
    public x.e f25971k = new x.e(a0.n1.A(a0.j1.B()));

    /* renamed from: l */
    public x.e f25972l = new x.e(a0.n1.A(a0.j1.B()));

    /* renamed from: d */
    public final n1 f25964d = new n1();

    /* renamed from: h */
    public int f25968h = 1;

    /* loaded from: classes.dex */
    public static class a {
    }

    public g2(a0.v1 v1Var, e0 e0Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f25973m = 0;
        this.f25961a = v1Var;
        this.f25962b = executor;
        this.f25963c = scheduledExecutorService;
        new a();
        int i10 = f25960o;
        f25960o = i10 + 1;
        this.f25973m = i10;
        StringBuilder a10 = android.support.v4.media.d.a("New ProcessingCaptureSession (id=");
        a10.append(this.f25973m);
        a10.append(")");
        y.u0.a("ProcessingCaptureSession", a10.toString());
    }

    public static void g(List<a0.h0> list) {
        for (a0.h0 h0Var : list) {
            for (a0.j jVar : h0Var.f85d) {
                jVar.a();
            }
        }
    }

    @Override // s.q1
    public final void a() {
        StringBuilder a10 = android.support.v4.media.d.a("cancelIssuedCaptureRequests (id=");
        a10.append(this.f25973m);
        a10.append(")");
        y.u0.a("ProcessingCaptureSession", a10.toString());
        if (this.f25969i != null) {
            for (a0.j jVar : this.f25969i.f85d) {
                jVar.a();
            }
            this.f25969i = null;
        }
    }

    @Override // s.q1
    public final void b(a0.u1 u1Var) {
        StringBuilder a10 = android.support.v4.media.d.a("setSessionConfig (id=");
        a10.append(this.f25973m);
        a10.append(")");
        y.u0.a("ProcessingCaptureSession", a10.toString());
        this.f25966f = u1Var;
        if (u1Var != null && this.f25968h == 3) {
            x.e a11 = e.a.d(u1Var.f187f.f83b).a();
            this.f25971k = a11;
            h(a11, this.f25972l);
            this.f25961a.f();
        }
    }

    @Override // s.q1
    public final na.a<Void> c(final a0.u1 u1Var, final CameraDevice cameraDevice, final p2 p2Var) {
        boolean z10;
        if (this.f25968h == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Invalid state state:");
        a10.append(g3.j.b(this.f25968h));
        h1.e(a10.toString(), z10);
        h1.e("SessionConfig contains no surfaces", !u1Var.b().isEmpty());
        y.u0.a("ProcessingCaptureSession", "open (id=" + this.f25973m + ")");
        List<a0.m0> b10 = u1Var.b();
        this.f25965e = b10;
        return d0.f.h(d0.d.b(a0.s0.b(b10, this.f25962b, this.f25963c)).d(new d0.a() { // from class: s.d2
            @Override // d0.a
            public final na.a apply(Object obj) {
                na.a<Void> c10;
                g2 g2Var = g2.this;
                a0.u1 u1Var2 = u1Var;
                CameraDevice cameraDevice2 = cameraDevice;
                p2 p2Var2 = p2Var;
                List list = (List) obj;
                g2Var.getClass();
                y.u0.a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + g2Var.f25973m + ")");
                if (g2Var.f25968h == 5) {
                    return new i.a(new IllegalStateException("SessionProcessorCaptureSession is closed."));
                }
                if (list.contains(null)) {
                    c10 = new i.a<>(new m0.a(u1Var2.b().get(list.indexOf(null)), "Surface closed"));
                } else {
                    try {
                        a0.s0.a(g2Var.f25965e);
                        boolean z11 = false;
                        for (int i10 = 0; i10 < u1Var2.b().size(); i10++) {
                            a0.m0 m0Var = u1Var2.b().get(i10);
                            if (Objects.equals(m0Var.f133h, androidx.camera.core.m.class)) {
                                new a0.f(m0Var.c().get(), new Size(m0Var.f131f.getWidth(), m0Var.f131f.getHeight()), m0Var.f132g);
                            } else if (Objects.equals(m0Var.f133h, androidx.camera.core.h.class)) {
                                new a0.f(m0Var.c().get(), new Size(m0Var.f131f.getWidth(), m0Var.f131f.getHeight()), m0Var.f132g);
                            } else if (Objects.equals(m0Var.f133h, androidx.camera.core.e.class)) {
                                new a0.f(m0Var.c().get(), new Size(m0Var.f131f.getWidth(), m0Var.f131f.getHeight()), m0Var.f132g);
                            }
                        }
                        g2Var.f25968h = 2;
                        StringBuilder a11 = android.support.v4.media.d.a("== initSession (id=");
                        a11.append(g2Var.f25973m);
                        a11.append(")");
                        y.u0.h("ProcessingCaptureSession", a11.toString());
                        a0.u1 d10 = g2Var.f25961a.d();
                        g2Var.f25967g = d10;
                        d10.b().get(0).d().a(new e2(0, g2Var), o8.b.i());
                        for (a0.m0 m0Var2 : g2Var.f25967g.b()) {
                            g2.f25959n.add(m0Var2);
                            m0Var2.d().a(new androidx.appcompat.widget.m2(1, m0Var2), g2Var.f25962b);
                        }
                        u1.f fVar = new u1.f();
                        fVar.a(u1Var2);
                        fVar.f189a.clear();
                        fVar.f190b.f89a.clear();
                        fVar.a(g2Var.f25967g);
                        if (fVar.f199j && fVar.f198i) {
                            z11 = true;
                        }
                        h1.e("Cannot transform the SessionConfig", z11);
                        a0.u1 b11 = fVar.b();
                        n1 n1Var = g2Var.f25964d;
                        cameraDevice2.getClass();
                        c10 = n1Var.c(b11, cameraDevice2, p2Var2);
                        d0.f.a(c10, new f2(g2Var), g2Var.f25962b);
                    } catch (m0.a e10) {
                        return new i.a(e10);
                    }
                }
                return c10;
            }
        }, this.f25962b), new q0(2, this), this.f25962b);
    }

    @Override // s.q1
    public final void close() {
        StringBuilder a10 = android.support.v4.media.d.a("close (id=");
        a10.append(this.f25973m);
        a10.append(") state=");
        a10.append(g3.j.b(this.f25968h));
        y.u0.a("ProcessingCaptureSession", a10.toString());
        int b10 = c0.b(this.f25968h);
        if (b10 != 1) {
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 == 4) {
                        return;
                    }
                    this.f25968h = 5;
                    this.f25964d.close();
                }
            } else {
                this.f25961a.b();
                this.f25968h = 4;
            }
        }
        this.f25961a.c();
        this.f25968h = 5;
        this.f25964d.close();
    }

    @Override // s.q1
    public final List<a0.h0> d() {
        return this.f25969i != null ? Arrays.asList(this.f25969i) : Collections.emptyList();
    }

    @Override // s.q1
    public final void e(List<a0.h0> list) {
        boolean z10;
        if (list.isEmpty()) {
            return;
        }
        if (list.size() <= 1) {
            if (!list.isEmpty()) {
                for (a0.h0 h0Var : list) {
                    if (h0Var.f84c != 2) {
                        z10 = false;
                        break;
                    }
                }
                z10 = true;
            } else {
                z10 = false;
                break;
            }
            if (z10) {
                if (this.f25969i == null && !this.f25970j) {
                    a0.h0 h0Var2 = list.get(0);
                    StringBuilder a10 = android.support.v4.media.d.a("issueCaptureRequests (id=");
                    a10.append(this.f25973m);
                    a10.append(") + state =");
                    a10.append(g3.j.b(this.f25968h));
                    y.u0.a("ProcessingCaptureSession", a10.toString());
                    int b10 = c0.b(this.f25968h);
                    if (b10 != 0 && b10 != 1) {
                        if (b10 != 2) {
                            if (b10 == 3 || b10 == 4) {
                                StringBuilder a11 = android.support.v4.media.d.a("Run issueCaptureRequests in wrong state, state = ");
                                a11.append(g3.j.b(this.f25968h));
                                y.u0.a("ProcessingCaptureSession", a11.toString());
                                g(list);
                                return;
                            }
                            return;
                        }
                        this.f25970j = true;
                        e.a d10 = e.a.d(h0Var2.f83b);
                        a0.l0 l0Var = h0Var2.f83b;
                        a0.d dVar = a0.h0.f80h;
                        if (l0Var.z(dVar)) {
                            a0.d A = r.a.A(CaptureRequest.JPEG_ORIENTATION);
                            d10.f30083a.E(A, (Integer) h0Var2.f83b.c(dVar));
                        }
                        a0.l0 l0Var2 = h0Var2.f83b;
                        a0.d dVar2 = a0.h0.f81i;
                        if (l0Var2.z(dVar2)) {
                            CaptureRequest.Key key = CaptureRequest.JPEG_QUALITY;
                            Byte valueOf = Byte.valueOf(((Integer) h0Var2.f83b.c(dVar2)).byteValue());
                            d10.f30083a.E(r.a.A(key), valueOf);
                        }
                        x.e a12 = d10.a();
                        this.f25972l = a12;
                        h(this.f25971k, a12);
                        this.f25961a.a();
                        return;
                    }
                    this.f25969i = h0Var2;
                    return;
                }
                g(list);
                return;
            }
        }
        g(list);
    }

    @Override // s.q1
    public final a0.u1 f() {
        return this.f25966f;
    }

    public final void h(x.e eVar, x.e eVar2) {
        a0.j1 B = a0.j1.B();
        for (l0.a aVar : eVar.d()) {
            B.E(aVar, eVar.c(aVar));
        }
        for (l0.a aVar2 : eVar2.d()) {
            B.E(aVar2, eVar2.c(aVar2));
        }
        a0.v1 v1Var = this.f25961a;
        a0.n1.A(B);
        v1Var.e();
    }

    @Override // s.q1
    public final na.a release() {
        h1.k("release() can only be called in CLOSED state", this.f25968h == 5);
        y.u0.a("ProcessingCaptureSession", "release (id=" + this.f25973m + ")");
        return this.f25964d.release();
    }
}
