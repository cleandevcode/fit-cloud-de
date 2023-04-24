package t;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;
import t.c0;
import t.u;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a */
    public final c0 f27455a;

    /* loaded from: classes.dex */
    public interface a {
        void a(u.i iVar);
    }

    /* loaded from: classes.dex */
    public static final class b extends CameraDevice.StateCallback {

        /* renamed from: a */
        public final CameraDevice.StateCallback f27456a;

        /* renamed from: b */
        public final Executor f27457b;

        public b(c0.g gVar, CameraDevice.StateCallback stateCallback) {
            this.f27457b = gVar;
            this.f27456a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            this.f27457b.execute(new s.o(this, cameraDevice, 2));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            this.f27457b.execute(new s.p(this, cameraDevice, 4));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(final CameraDevice cameraDevice, final int i10) {
            this.f27457b.execute(new Runnable() { // from class: t.v
                @Override // java.lang.Runnable
                public final void run() {
                    u.b bVar = u.b.this;
                    bVar.f27456a.onError(cameraDevice, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            this.f27457b.execute(new n(this, cameraDevice, 1));
        }
    }

    public u(CameraDevice cameraDevice, Handler handler) {
        c0 c0Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f27455a = new b0(cameraDevice);
            return;
        }
        if (i10 >= 24) {
            c0Var = new a0(cameraDevice, new c0.a(handler));
        } else if (i10 >= 23) {
            c0Var = new y(cameraDevice, new c0.a(handler));
        } else {
            c0Var = new c0(cameraDevice, new c0.a(handler));
        }
        this.f27455a = c0Var;
    }
}
