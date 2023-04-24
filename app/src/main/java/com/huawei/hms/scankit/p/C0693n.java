package com.huawei.hms.scankit.p;

import android.hardware.Camera;
import android.util.Log;

/* renamed from: com.huawei.hms.scankit.p.n */
/* loaded from: classes.dex */
public final class C0693n {

    /* renamed from: a */
    private Camera f8002a;

    public final synchronized C0665g a() {
        return new C0665g(this.f8002a.getParameters().getMaxZoom(), this.f8002a.getParameters().getZoom(), this.f8002a.getParameters().getZoomRatios());
    }

    public final synchronized void a(int i10) {
        Camera camera = this.f8002a;
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        parameters.setZoom(i10);
        try {
            this.f8002a.setParameters(parameters);
        } catch (RuntimeException e10) {
            Log.e("CameraManager", "CameraZoomManager::setCameraZoomIndex failed: " + e10.getMessage());
        }
    }

    public final synchronized void a(Camera camera) {
        this.f8002a = camera;
    }

    public final synchronized boolean b() {
        Camera camera = this.f8002a;
        if (camera == null) {
            return false;
        }
        return camera.getParameters().isZoomSupported();
    }
}
