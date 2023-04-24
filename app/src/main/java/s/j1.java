package s;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes.dex */
public final class j1 extends a0.j {

    /* renamed from: a */
    public final CameraCaptureSession.CaptureCallback f26002a;

    public j1(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f26002a = captureCallback;
    }
}
