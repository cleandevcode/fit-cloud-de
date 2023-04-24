package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes.dex */
public final class i1 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    public final a0.j f25999a;

    public i1(a0.j jVar) {
        if (jVar == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f25999a = jVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        a0.d2 d2Var;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            h1.e("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof a0.d2);
            d2Var = (a0.d2) tag;
        } else {
            d2Var = a0.d2.f45b;
        }
        this.f25999a.b(new e(d2Var, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f25999a.c(new a0.m());
    }
}
