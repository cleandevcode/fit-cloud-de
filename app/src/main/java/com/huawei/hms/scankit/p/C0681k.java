package com.huawei.hms.scankit.p;

import android.hardware.Camera;
import android.util.Log;

/* renamed from: com.huawei.hms.scankit.p.k */
/* loaded from: classes.dex */
public final class C0681k {

    /* renamed from: a */
    private Camera f7976a;

    public final synchronized C0649c a() {
        return new C0649c(this.f7976a.getParameters().getMaxExposureCompensation(), this.f7976a.getParameters().getMinExposureCompensation(), this.f7976a.getParameters().getExposureCompensation(), this.f7976a.getParameters().getExposureCompensationStep());
    }

    public final synchronized void a(int i10) {
        Camera camera = this.f7976a;
        if (camera == null) {
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setExposureCompensation(i10);
            this.f7976a.setParameters(parameters);
        } catch (RuntimeException unused) {
            Log.w("CameraManager", "CameraExposureManager::setCompensation failed");
        }
    }

    public final synchronized void a(Camera camera) {
        this.f7976a = camera;
    }
}
