package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class o2 extends l2 {

    /* renamed from: o */
    public final Object f26112o;

    /* renamed from: p */
    public List<a0.m0> f26113p;

    /* renamed from: q */
    public d0.d f26114q;

    /* renamed from: r */
    public final w.g f26115r;

    /* renamed from: s */
    public final w.s f26116s;

    /* renamed from: t */
    public final w.f f26117t;

    public o2(Handler handler, r1 r1Var, a0.r1 r1Var2, a0.r1 r1Var3, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(r1Var, executor, scheduledExecutorService, handler);
        this.f26112o = new Object();
        this.f26115r = new w.g(r1Var2, r1Var3);
        this.f26116s = new w.s(r1Var2);
        this.f26117t = new w.f(r1Var3);
    }

    public static /* synthetic */ void u(o2 o2Var) {
        o2Var.w("Session call super.close()");
        super.close();
    }

    @Override // s.l2, s.p2.b
    public final na.a a(ArrayList arrayList) {
        na.a a10;
        synchronized (this.f26112o) {
            this.f26113p = arrayList;
            a10 = super.a(arrayList);
        }
        return a10;
    }

    @Override // s.l2, s.i2
    public final void close() {
        w("Session call close()");
        w.s sVar = this.f26116s;
        synchronized (sVar.f29512b) {
            if (sVar.f29511a && !sVar.f29515e) {
                sVar.f29513c.cancel(true);
            }
        }
        d0.f.f(this.f26116s.f29513c).a(new androidx.appcompat.widget.m2(2, this), this.f26064d);
    }

    @Override // s.l2, s.p2.b
    public final na.a<Void> e(CameraDevice cameraDevice, u.i iVar, List<a0.m0> list) {
        ArrayList arrayList;
        na.a<Void> f10;
        synchronized (this.f26112o) {
            w.s sVar = this.f26116s;
            r1 r1Var = this.f26062b;
            synchronized (r1Var.f26167b) {
                arrayList = new ArrayList(r1Var.f26169d);
            }
            i iVar2 = new i(1, this);
            sVar.getClass();
            d0.d a10 = w.s.a(cameraDevice, iVar, iVar2, list, arrayList);
            this.f26114q = a10;
            f10 = d0.f.f(a10);
        }
        return f10;
    }

    @Override // s.l2, s.i2
    public final int g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        int g10;
        w.s sVar = this.f26116s;
        synchronized (sVar.f29512b) {
            if (sVar.f29511a) {
                f0 f0Var = new f0(Arrays.asList(sVar.f29516f, captureCallback));
                sVar.f29515e = true;
                captureCallback = f0Var;
            }
            g10 = super.g(captureRequest, captureCallback);
        }
        return g10;
    }

    @Override // s.l2, s.i2
    public final na.a<Void> i() {
        return d0.f.f(this.f26116s.f29513c);
    }

    @Override // s.l2, s.i2.a
    public final void m(i2 i2Var) {
        synchronized (this.f26112o) {
            this.f26115r.a(this.f26113p);
        }
        w("onClosed()");
        super.m(i2Var);
    }

    @Override // s.l2, s.i2.a
    public final void o(l2 l2Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        i2 i2Var;
        i2 i2Var2;
        w("Session onConfigured()");
        w.f fVar = this.f26117t;
        r1 r1Var = this.f26062b;
        synchronized (r1Var.f26167b) {
            arrayList = new ArrayList(r1Var.f26170e);
        }
        r1 r1Var2 = this.f26062b;
        synchronized (r1Var2.f26167b) {
            arrayList2 = new ArrayList(r1Var2.f26168c);
        }
        boolean z11 = true;
        if (fVar.f29491a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            LinkedHashSet<i2> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (i2Var2 = (i2) it.next()) != l2Var) {
                linkedHashSet.add(i2Var2);
            }
            for (i2 i2Var3 : linkedHashSet) {
                i2Var3.b().n(i2Var3);
            }
        }
        super.o(l2Var);
        if (fVar.f29491a == null) {
            z11 = false;
        }
        if (z11) {
            LinkedHashSet<i2> linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext() && (i2Var = (i2) it2.next()) != l2Var) {
                linkedHashSet2.add(i2Var);
            }
            for (i2 i2Var4 : linkedHashSet2) {
                i2Var4.b().m(i2Var4);
            }
        }
    }

    @Override // s.l2, s.p2.b
    public final boolean stop() {
        boolean z10;
        boolean stop;
        synchronized (this.f26112o) {
            synchronized (this.f26061a) {
                if (this.f26068h != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                this.f26115r.a(this.f26113p);
            } else {
                d0.d dVar = this.f26114q;
                if (dVar != null) {
                    dVar.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }

    public final void w(String str) {
        y.u0.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }
}
