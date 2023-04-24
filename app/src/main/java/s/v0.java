package s;

import a0.l0;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import x.e;

/* loaded from: classes.dex */
public final class v0 {

    /* loaded from: classes.dex */
    public static class a {
        public static CaptureRequest.Builder a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
            CaptureRequest.Builder createReprocessCaptureRequest;
            createReprocessCaptureRequest = cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
            return createReprocessCaptureRequest;
        }
    }

    public static void a(CaptureRequest.Builder builder, a0.l0 l0Var) {
        x.e a10 = e.a.d(l0Var).a();
        for (l0.a aVar : a0.s1.c(a10)) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.c();
            try {
                builder.set(key, a0.s1.d(a10, aVar));
            } catch (IllegalArgumentException unused) {
                y.u0.b("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static CaptureRequest b(a0.h0 h0Var, CameraDevice cameraDevice, HashMap hashMap) {
        CaptureRequest.Builder createCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List<a0.m0> a10 = h0Var.a();
        ArrayList arrayList = new ArrayList();
        for (a0.m0 m0Var : a10) {
            Surface surface = (Surface) hashMap.get(m0Var);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        a0.s sVar = h0Var.f88g;
        if (Build.VERSION.SDK_INT >= 23 && h0Var.f84c == 5 && sVar != null && (sVar.h() instanceof TotalCaptureResult)) {
            y.u0.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            createCaptureRequest = a.a(cameraDevice, (TotalCaptureResult) sVar.h());
        } else {
            y.u0.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            createCaptureRequest = cameraDevice.createCaptureRequest(h0Var.f84c);
        }
        a(createCaptureRequest, h0Var.f83b);
        a0.l0 l0Var = h0Var.f83b;
        a0.d dVar = a0.h0.f80h;
        if (l0Var.z(dVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) h0Var.f83b.c(dVar));
        }
        a0.l0 l0Var2 = h0Var.f83b;
        a0.d dVar2 = a0.h0.f81i;
        if (l0Var2.z(dVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) h0Var.f83b.c(dVar2)).byteValue()));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            createCaptureRequest.addTarget((Surface) it.next());
        }
        createCaptureRequest.setTag(h0Var.f87f);
        return createCaptureRequest.build();
    }
}
