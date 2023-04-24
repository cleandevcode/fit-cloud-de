package t;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;

/* loaded from: classes.dex */
public final class h0 extends g0 {
    public h0(Context context) {
        super(context);
    }

    @Override // t.g0, t.i0, t.d0.b
    public final CameraCharacteristics b(String str) {
        try {
            return this.f27425a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw f.a(e10);
        }
    }

    @Override // t.g0, t.i0, t.d0.b
    public final void c(String str, c0.g gVar, CameraDevice.StateCallback stateCallback) {
        try {
            this.f27425a.openCamera(str, gVar, stateCallback);
        } catch (CameraAccessException e10) {
            throw new f(e10);
        }
    }
}
