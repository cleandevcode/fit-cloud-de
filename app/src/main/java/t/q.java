package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import s.a1;
import t.g;

/* loaded from: classes.dex */
public class q implements g.a {

    /* renamed from: a */
    public final CameraCaptureSession f27449a;

    /* renamed from: b */
    public final Object f27450b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final Handler f27451a;

        public a(Handler handler) {
            this.f27451a = handler;
        }
    }

    public q(CameraCaptureSession cameraCaptureSession, a aVar) {
        cameraCaptureSession.getClass();
        this.f27449a = cameraCaptureSession;
        this.f27450b = aVar;
    }

    @Override // t.g.a
    public int a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f27449a.setRepeatingRequest(captureRequest, new g.b(executor, captureCallback), ((a) this.f27450b).f27451a);
    }

    @Override // t.g.a
    public int b(ArrayList arrayList, Executor executor, a1 a1Var) {
        return this.f27449a.captureBurst(arrayList, new g.b(executor, a1Var), ((a) this.f27450b).f27451a);
    }
}
