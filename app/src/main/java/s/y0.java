package s;

import a0.h0;
import a0.u1;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import x.e;

/* loaded from: classes.dex */
public final class y0 implements u1.d {

    /* renamed from: a */
    public static final y0 f26247a = new y0();

    @Override // a0.u1.d
    public final void a(a0.h2<?> h2Var, u1.b bVar) {
        a0.u1 j10 = h2Var.j();
        a0.l0 l0Var = a0.n1.A;
        int i10 = a0.u1.a().f187f.f84c;
        if (j10 != null) {
            i10 = j10.f187f.f84c;
            for (CameraDevice.StateCallback stateCallback : j10.f183b) {
                if (!bVar.f191c.contains(stateCallback)) {
                    bVar.f191c.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : j10.f184c) {
                bVar.b(stateCallback2);
            }
            bVar.f190b.a(j10.f187f.f85d);
            l0Var = j10.f187f.f83b;
        }
        h0.a aVar = bVar.f190b;
        aVar.getClass();
        aVar.f90b = a0.j1.C(l0Var);
        bVar.f190b.f91c = ((Integer) h2Var.e(r.a.f25143z, Integer.valueOf(i10))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) h2Var.e(r.a.B, new e1());
        if (!bVar.f191c.contains(stateCallback3)) {
            bVar.f191c.add(stateCallback3);
        }
        bVar.b((CameraCaptureSession.StateCallback) h2Var.e(r.a.C, new c1()));
        bVar.a(new j1((CameraCaptureSession.CaptureCallback) h2Var.e(r.a.D, new g0())));
        a0.j1 B = a0.j1.B();
        a0.d dVar = r.a.E;
        B.E(dVar, (r.c) h2Var.e(dVar, new r.c(new r.b[0])));
        a0.d dVar2 = r.a.G;
        B.E(dVar2, (String) h2Var.e(dVar2, null));
        a0.d dVar3 = r.a.A;
        B.E(dVar3, Long.valueOf(((Long) h2Var.e(dVar3, -1L)).longValue()));
        bVar.f190b.c(B);
        bVar.f190b.c(e.a.d(h2Var).a());
    }
}
