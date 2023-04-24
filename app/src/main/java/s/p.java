package s;

import a0.c1;
import a0.g1;
import a0.u1;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.location.Location;
import android.util.Size;
import androidx.camera.core.s;
import java.util.Collections;
import java.util.Objects;
import o5.a;
import p0.c;
import t.g;
import t.u;
import z.d;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26118a;

    /* renamed from: b */
    public final /* synthetic */ Object f26119b;

    /* renamed from: c */
    public final /* synthetic */ Object f26120c;

    public /* synthetic */ p(Object obj, Object obj2, int i10) {
        this.f26118a = i10;
        this.f26119b = obj;
        this.f26120c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.f26118a) {
            case 0:
                ((a0.j) this.f26119b).c((a0.m) this.f26120c);
                return;
            case 1:
                ((u1.c) this.f26119b).a();
                return;
            case 2:
                l2 l2Var = (l2) this.f26119b;
                Objects.requireNonNull(l2Var.f26066f);
                l2Var.f26066f.q((i2) this.f26120c);
                return;
            case 3:
                ((g.c) this.f26119b).f27415a.onConfigureFailed((CameraCaptureSession) this.f26120c);
                return;
            case 4:
                ((u.b) this.f26119b).f27456a.onDisconnected((CameraDevice) this.f26120c);
                return;
            case 5:
                y.y yVar = (y.y) this.f26119b;
                androidx.camera.core.j jVar = (androidx.camera.core.j) this.f26120c;
                synchronized (yVar.f30798h) {
                    z10 = yVar.f30799i;
                }
                if (!z10) {
                    Size size = new Size(jVar.f(), jVar.c());
                    yVar.f30797g.getClass();
                    String next = yVar.f30797g.b().b().iterator().next();
                    int intValue = ((Integer) yVar.f30797g.b().a(next)).intValue();
                    y.e1 e1Var = new y.e1(jVar, size, yVar.f30797g);
                    yVar.f30797g = null;
                    y.f1 f1Var = new y.f1(next, Collections.singletonList(Integer.valueOf(intValue)));
                    f1Var.c(e1Var);
                    try {
                        yVar.f30792b.d(f1Var);
                    } catch (Exception e10) {
                        StringBuilder a10 = android.support.v4.media.d.a("Post processing image failed! ");
                        a10.append(e10.getMessage());
                        y.u0.b("CaptureProcessorPipeline", a10.toString());
                    }
                }
                synchronized (yVar.f30798h) {
                    yVar.f30800j = false;
                }
                yVar.e();
                return;
            case 6:
                androidx.camera.core.l lVar = (androidx.camera.core.l) this.f26119b;
                lVar.getClass();
                ((c1.a) this.f26120c).a(lVar);
                return;
            case 7:
                androidx.camera.core.n nVar = (androidx.camera.core.n) this.f26119b;
                c.a aVar = (c.a) this.f26120c;
                synchronized (nVar.f1746a) {
                    if (!nVar.f1764s.isDone()) {
                        nVar.f1764s.cancel(true);
                    }
                    nVar.f1762q.e();
                }
                if (aVar != null) {
                    aVar.a(null);
                    return;
                }
                return;
            case 8:
                ((s.e) this.f26119b).a((s.d) this.f26120c);
                return;
            case 9:
                z.d dVar = (z.d) this.f26119b;
                d.a aVar2 = (d.a) this.f26120c;
                dVar.getClass();
                z.e b10 = aVar2.b();
                try {
                    aVar2.b().getClass();
                    o8.b.p().execute(new t.n(b10, dVar.a(aVar2), 5));
                    return;
                } catch (RuntimeException e11) {
                    o8.b.p().execute(new s(b10, new y.n0(0, "Processing failed.", e11), 8));
                    return;
                } catch (y.n0 e12) {
                    o8.b.p().execute(new s(b10, e12, 8));
                    return;
                }
            case 10:
                ((z.i) this.f26119b).getClass();
                throw null;
            case 11:
                ((a0.g1) this.f26119b).f71a.i((g1.a) this.f26120c);
                return;
            case 12:
                int i10 = d1.g.f12600a;
                ((j1.a) this.f26119b).accept((Location) this.f26120c);
                return;
            default:
                o5.f fVar = (o5.f) this.f26119b;
                gm.l.f(fVar, "this$0");
                fVar.a((a.InterfaceC0407a) this.f26120c);
                return;
        }
    }
}
