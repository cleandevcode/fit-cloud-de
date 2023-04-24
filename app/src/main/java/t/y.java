package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.ArrayList;
import t.c0;
import t.g;

/* loaded from: classes.dex */
public class y extends c0 {
    public y(CameraDevice cameraDevice, c0.a aVar) {
        super(cameraDevice, aVar);
    }

    @Override // t.c0, t.u.a
    public void a(u.i iVar) {
        c0.b(this.f27401a, iVar);
        g.c cVar = new g.c(iVar.f28436a.d(), iVar.f28436a.b());
        ArrayList c10 = c0.c(iVar.f28436a.g());
        c0.a aVar = (c0.a) this.f27402b;
        aVar.getClass();
        Handler handler = aVar.f27403a;
        u.a a10 = iVar.f28436a.a();
        try {
            if (a10 != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) a10.f28421a.a();
                inputConfiguration.getClass();
                this.f27401a.createReprocessableCaptureSession(inputConfiguration, c10, cVar, handler);
            } else if (iVar.f28436a.f() == 1) {
                this.f27401a.createConstrainedHighSpeedCaptureSession(c10, cVar, handler);
            } else {
                try {
                    this.f27401a.createCaptureSession(c10, cVar, handler);
                } catch (CameraAccessException e10) {
                    throw new f(e10);
                }
            }
        } catch (CameraAccessException e11) {
            throw new f(e11);
        }
    }
}
