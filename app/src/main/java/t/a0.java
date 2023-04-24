package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;
import t.c0;
import t.g;

/* loaded from: classes.dex */
public class a0 extends y {
    public a0(CameraDevice cameraDevice, c0.a aVar) {
        super(cameraDevice, aVar);
    }

    @Override // t.y, t.c0, t.u.a
    public void a(u.i iVar) {
        c0.b(this.f27401a, iVar);
        g.c cVar = new g.c(iVar.f28436a.d(), iVar.f28436a.b());
        List<u.b> g10 = iVar.f28436a.g();
        c0.a aVar = (c0.a) this.f27402b;
        aVar.getClass();
        Handler handler = aVar.f27403a;
        u.a a10 = iVar.f28436a.a();
        try {
            if (a10 != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) a10.f28421a.a();
                inputConfiguration.getClass();
                this.f27401a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, u.i.a(g10), cVar, handler);
            } else if (iVar.f28436a.f() == 1) {
                this.f27401a.createConstrainedHighSpeedCaptureSession(c0.c(g10), cVar, handler);
            } else {
                this.f27401a.createCaptureSessionByOutputConfigurations(u.i.a(g10), cVar, handler);
            }
        } catch (CameraAccessException e10) {
            throw new f(e10);
        }
    }
}
