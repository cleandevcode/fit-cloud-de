package s;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.util.Size;
import androidx.camera.view.PreviewView;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import o5.d0;
import p0.c;
import s.r;
import t.g;
import t.u;
import z5.c;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26105a;

    /* renamed from: b */
    public final /* synthetic */ Object f26106b;

    /* renamed from: c */
    public final /* synthetic */ Object f26107c;

    public /* synthetic */ o(Object obj, Object obj2, int i10) {
        this.f26105a = i10;
        this.f26106b = obj;
        this.f26107c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26105a) {
            case 0:
                final r rVar = (r) this.f26106b;
                final long r10 = rVar.r();
                d0.f.g(true, p0.c.a(new c.InterfaceC0425c() { // from class: s.f
                    @Override // p0.c.InterfaceC0425c
                    public final String g(final c.a aVar) {
                        r rVar2 = r.this;
                        final long j10 = r10;
                        rVar2.getClass();
                        rVar2.d(new r.c() { // from class: s.h
                            @Override // s.r.c
                            public final boolean a(TotalCaptureResult totalCaptureResult) {
                                long j11 = j10;
                                c.a aVar2 = aVar;
                                if (r.o(totalCaptureResult, j11)) {
                                    aVar2.a(null);
                                    return true;
                                }
                                return false;
                            }
                        });
                        return "waitForSessionUpdateId:" + j10;
                    }
                }), (c.a) this.f26107c, o8.b.i());
                return;
            case 1:
                ((g.c) this.f26106b).f27415a.onActive((CameraCaptureSession) this.f26107c);
                return;
            case 2:
                ((u.b) this.f26106b).f27456a.onClosed((CameraDevice) this.f26107c);
                return;
            case 3:
                a0.m0 m0Var = (a0.m0) this.f26106b;
                String str = (String) this.f26107c;
                Size size = a0.m0.f122i;
                m0Var.getClass();
                try {
                    m0Var.f130e.get();
                    m0Var.f(a0.m0.f125l.decrementAndGet(), a0.m0.f124k.get(), "Surface terminated");
                    return;
                } catch (Exception e10) {
                    y.u0.b("DeferrableSurface", "Unexpected surface termination for " + m0Var + "\nStack Trace:\n" + str);
                    synchronized (m0Var.f126a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", m0Var, Boolean.valueOf(m0Var.f128c), Integer.valueOf(m0Var.f127b)), e10);
                    }
                }
            case 4:
                androidx.appcompat.widget.t2.b(this.f26106b);
                throw null;
            case 5:
                ((SurfaceTexture) this.f26107c).getTimestamp();
                ((PreviewView.d) this.f26106b).a();
                return;
            case 6:
                m2.q qVar = (m2.q) this.f26106b;
                gm.l.f(qVar, "this$0");
                gm.l.f((String) this.f26107c, "$sql");
                qVar.getClass();
                throw null;
            case 7:
                d0.a aVar = (d0.a) this.f26106b;
                int i10 = o5.l0.f22787h;
                gm.l.f(aVar, "$callback");
                gm.l.f((o5.l0) this.f26107c, "this$0");
                ((d0.b) aVar).b();
                return;
            case 8:
                String str2 = (String) this.f26106b;
                String str3 = (String) this.f26107c;
                p5.u uVar = p5.u.f23947a;
                if (!i6.a.b(p5.u.class)) {
                    try {
                        gm.l.f(str2, "$key");
                        gm.l.f(str3, "$value");
                        if (!p5.u.f23950d.get()) {
                            p5.u.f23947a.b();
                        }
                        SharedPreferences sharedPreferences = p5.u.f23949c;
                        if (sharedPreferences != null) {
                            sharedPreferences.edit().putString(str2, str3).apply();
                            return;
                        } else {
                            gm.l.l("sharedPreferences");
                            throw null;
                        }
                    } catch (Throwable th2) {
                        i6.a.a(p5.u.class, th2);
                        return;
                    }
                }
                return;
            case 9:
                String str4 = (String) this.f26106b;
                p5.d dVar = (p5.d) this.f26107c;
                z5.a aVar2 = z5.a.f31960a;
                if (!i6.a.b(z5.a.class)) {
                    try {
                        gm.l.f(str4, "$applicationId");
                        gm.l.f(dVar, "$event");
                        z5.c cVar = z5.c.f31963a;
                        List<p5.d> p10 = h7.a.p(dVar);
                        if (!i6.a.b(z5.c.class)) {
                            z5.c.f31963a.b(c.a.CUSTOM_APP_EVENTS, str4, p10);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        i6.a.a(z5.a.class, th3);
                        return;
                    }
                }
                return;
            default:
                n6.s sVar = (n6.s) this.f26106b;
                Bundle bundle = (Bundle) this.f26107c;
                ScheduledExecutorService scheduledExecutorService = n6.s.f22163d;
                if (!i6.a.b(n6.s.class)) {
                    try {
                        gm.l.f(sVar, "this$0");
                        gm.l.f(bundle, "$bundle");
                        sVar.f22165b.a(bundle, "fb_mobile_login_heartbeat");
                        return;
                    } catch (Throwable th4) {
                        i6.a.a(n6.s.class, th4);
                        return;
                    }
                }
                return;
        }
    }
}
