package t;

import android.hardware.camera2.CameraManager;

/* loaded from: classes.dex */
public final class e {
    public static void a(CameraManager.AvailabilityCallback availabilityCallback) {
        availabilityCallback.onCameraAccessPrioritiesChanged();
    }
}
