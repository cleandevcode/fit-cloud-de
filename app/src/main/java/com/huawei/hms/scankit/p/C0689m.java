package com.huawei.hms.scankit.p;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import com.huawei.hms.scankit.p.C0661f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.hms.scankit.p.m */
/* loaded from: classes.dex */
public final class C0689m {

    /* renamed from: a */
    private Camera f7994a;

    public final synchronized C0661f a() {
        RuntimeException e10;
        int i10;
        Rect rect;
        try {
            i10 = this.f7994a.getParameters().getMaxNumMeteringAreas();
            try {
                rect = this.f7994a.getParameters().getMeteringAreas().get(0).rect;
            } catch (RuntimeException e11) {
                e10 = e11;
                Log.w("CameraManager", "CameraMeteringManager::getCameraMeteringData failed: " + e10.getMessage());
                rect = null;
                return new C0661f(i10, rect);
            }
        } catch (RuntimeException e12) {
            e10 = e12;
            i10 = 0;
        }
        return new C0661f(i10, rect);
    }

    public final synchronized void a(Camera camera) {
        this.f7994a = camera;
    }

    public final synchronized void a(List<C0661f.a> list) {
        Camera camera = this.f7994a;
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(new Camera.Area(list.get(i10).f7880a, list.get(i10).f7881b));
        }
        parameters.setMeteringAreas(arrayList);
        try {
            this.f7994a.setParameters(parameters);
        } catch (RuntimeException e10) {
            Log.w("CameraManager", "CameraMeteringManager::setCameraMeteringArea failed: " + e10.getMessage());
        }
    }
}
