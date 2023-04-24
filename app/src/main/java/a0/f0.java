package a0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class f0 {

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(IllegalArgumentException illegalArgumentException) {
            super("Expected camera missing from device.", illegalArgumentException);
        }
    }

    public static void a(Context context, c0 c0Var, y.p pVar) {
        Integer c10;
        if (pVar != null) {
            try {
                c10 = pVar.c();
                if (c10 == null) {
                    y.u0.h("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e10) {
                y.u0.c("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e10);
                return;
            }
        } else {
            c10 = null;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Verifying camera lens facing on ");
        a10.append(Build.DEVICE);
        a10.append(", lensFacingInteger: ");
        a10.append(c10);
        y.u0.a("CameraValidator", a10.toString());
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (pVar == null || c10.intValue() == 1)) {
                y.p.f30748c.d(c0Var.a());
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (pVar == null || c10.intValue() == 0) {
                    y.p.f30747b.d(c0Var.a());
                }
            }
        } catch (IllegalArgumentException e11) {
            StringBuilder a11 = android.support.v4.media.d.a("Camera LensFacing verification failed, existing cameras: ");
            a11.append(c0Var.a());
            y.u0.b("CameraValidator", a11.toString());
            throw new a(e11);
        }
    }
}
