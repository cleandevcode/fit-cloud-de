package t;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import s.a0;

/* loaded from: classes.dex */
public class g0 extends i0 {
    public g0(Context context) {
        super(context, null);
    }

    public static boolean e(RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            return (!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName());
        }
        return false;
    }

    @Override // t.i0, t.d0.b
    public final void a(c0.g gVar, a0.b bVar) {
        this.f27425a.registerAvailabilityCallback(gVar, bVar);
    }

    @Override // t.i0, t.d0.b
    public CameraCharacteristics b(String str) {
        try {
            return super.b(str);
        } catch (RuntimeException e10) {
            if (e(e10)) {
                throw new f(e10);
            }
            throw e10;
        }
    }

    @Override // t.i0, t.d0.b
    public void c(String str, c0.g gVar, CameraDevice.StateCallback stateCallback) {
        try {
            this.f27425a.openCamera(str, gVar, stateCallback);
        } catch (CameraAccessException e10) {
            throw new f(e10);
        } catch (IllegalArgumentException e11) {
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            if (e(e13)) {
                throw new f(e13);
            }
            throw e13;
        }
    }

    @Override // t.i0, t.d0.b
    public final void d(a0.b bVar) {
        this.f27425a.unregisterAvailabilityCallback(bVar);
    }
}
