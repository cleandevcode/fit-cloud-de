package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Collections;

/* loaded from: classes.dex */
public final class o1 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    public final /* synthetic */ n1 f26111a;

    public o1(n1 n1Var) {
        this.f26111a = n1Var;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        synchronized (this.f26111a.f26085a) {
            a0.u1 u1Var = this.f26111a.f26091g;
            if (u1Var == null) {
                return;
            }
            a0.h0 h0Var = u1Var.f187f;
            y.u0.a("CaptureSession", "Submit FLASH_MODE_OFF request");
            n1 n1Var = this.f26111a;
            n1Var.f26100p.getClass();
            n1Var.e(Collections.singletonList(w.p.a(h0Var)));
        }
    }
}
