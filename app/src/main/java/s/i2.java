package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.ArrayList;

/* loaded from: classes.dex */
public interface i2 {

    /* loaded from: classes.dex */
    public static abstract class a {
        public void k(l2 l2Var) {
        }

        public void l(l2 l2Var) {
        }

        public void m(i2 i2Var) {
        }

        public void n(i2 i2Var) {
        }

        public void o(l2 l2Var) {
        }

        public void p(l2 l2Var) {
        }

        public void q(i2 i2Var) {
        }

        public void r(l2 l2Var, Surface surface) {
        }
    }

    l2 b();

    void c();

    void close();

    CameraDevice d();

    t.g f();

    int g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    void h();

    na.a<Void> i();

    int j(ArrayList arrayList, a1 a1Var);
}
