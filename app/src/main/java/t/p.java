package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import s.a1;

/* loaded from: classes.dex */
public final class p extends q {
    public p(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // t.q, t.g.a
    public final int a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        int singleRepeatingRequest;
        singleRepeatingRequest = this.f27449a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
        return singleRepeatingRequest;
    }

    @Override // t.q, t.g.a
    public final int b(ArrayList arrayList, Executor executor, a1 a1Var) {
        int captureBurstRequests;
        captureBurstRequests = this.f27449a.captureBurstRequests(arrayList, executor, a1Var);
        return captureBurstRequests;
    }
}
