package r;

import a0.d;
import a0.i1;
import a0.j1;
import a0.l0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import x.e;
import y.z;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: z */
    public static final d f25143z = l0.a.a("camera2.captureRequest.templateType", Integer.TYPE);
    public static final d A = l0.a.a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);
    public static final d B = l0.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);
    public static final d C = l0.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);
    public static final d D = l0.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);
    public static final d E = l0.a.a("camera2.cameraEvent.callback", c.class);
    public static final d F = l0.a.a("camera2.captureRequest.tag", Object.class);
    public static final d G = l0.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* renamed from: r.a$a */
    /* loaded from: classes.dex */
    public static final class C0454a implements z<a> {

        /* renamed from: a */
        public final j1 f25144a = j1.B();

        public final void a(CaptureRequest.Key key, Object obj) {
            this.f25144a.E(a.A(key), obj);
        }

        @Override // y.z
        public final i1 b() {
            throw null;
        }
    }

    public a(l0 l0Var) {
        super(l0Var);
    }

    public static d A(CaptureRequest.Key key) {
        StringBuilder a10 = android.support.v4.media.d.a("camera2.captureRequest.option.");
        a10.append(key.getName());
        return new d(a10.toString(), Object.class, key);
    }
}
