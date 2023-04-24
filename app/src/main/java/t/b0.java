package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;

/* loaded from: classes.dex */
public final class b0 extends a0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(CameraDevice cameraDevice) {
        super(cameraDevice, null);
        cameraDevice.getClass();
    }

    @Override // t.a0, t.y, t.c0, t.u.a
    public final void a(u.i iVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) iVar.f28436a.c();
        sessionConfiguration.getClass();
        try {
            this.f27401a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw f.a(e10);
        }
    }
}
