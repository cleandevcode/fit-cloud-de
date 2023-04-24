package com.huawei.hms.scankit.p;

import android.graphics.Point;
import android.hardware.Camera;
import android.util.Log;
import java.util.List;

/* renamed from: com.huawei.hms.scankit.p.j */
/* loaded from: classes.dex */
public final class C0677j {

    /* renamed from: a */
    private C0645b f7967a;

    /* renamed from: b */
    public Point f7968b;

    /* renamed from: c */
    private Point f7969c;

    private static Point a(Camera.Parameters parameters, Point point, boolean z10) {
        List<Camera.Size> supportedPreviewSizes = !z10 ? parameters.getSupportedPreviewSizes() : parameters.getSupportedPictureSizes();
        if (supportedPreviewSizes == null || supportedPreviewSizes.isEmpty()) {
            Log.e("CameraManager", "CameraConfigImpl::findCameraResolution camera not support");
            return new Point(0, 0);
        }
        return a(supportedPreviewSizes, point);
    }

    private static Point a(List<Camera.Size> list, Point point) {
        double d10 = point.x / point.y;
        int i10 = 0;
        double d11 = Double.MAX_VALUE;
        int i11 = 0;
        for (Camera.Size size : list) {
            int i12 = size.width;
            int i13 = size.height;
            if (i12 == point.x && i13 == point.y) {
                return new Point(i12, i13);
            }
            if (i12 * i13 >= 153600.0d) {
                double d12 = (i12 / i13) - d10;
                if (Math.abs(d12) < d11) {
                    d11 = Math.abs(d12);
                    i11 = i13;
                    i10 = i12;
                }
            }
        }
        return new Point(i10, i11);
    }

    private static void a(Camera.Parameters parameters) {
        String str;
        String[] strArr = {"continuous-picture", "continuous-video", "auto"};
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null) {
            Log.w("CameraManager", "setFocusMode failed, use default");
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= 3) {
                str = null;
                break;
            }
            str = strArr[i10];
            if (supportedFocusModes.contains(str)) {
                break;
            }
            i10++;
        }
        if (str != null) {
            Log.i("CameraManager", "setFocusMode: ".concat(str));
            parameters.setFocusMode(str);
        }
    }

    public final void a(Camera camera, C0645b c0645b) {
        if (camera == null || c0645b == null) {
            throw new IllegalArgumentException("initCameraParameters param is invalid");
        }
        Camera.Parameters parameters = camera.getParameters();
        this.f7967a = c0645b;
        this.f7968b = a(parameters, c0645b.a(), false);
        Log.d("CameraManager", "initCameraParameters previewCameraSize: " + this.f7968b.toString());
        if (c0645b.c() == 0) {
            this.f7969c = a(parameters, c0645b.a(), true);
            Log.d("CameraManager", "initCameraParameters pictureCameraSize: " + this.f7969c.toString());
        }
        Point point = this.f7968b;
        Point point2 = this.f7969c;
        if (this.f7967a != null) {
            Camera.Parameters parameters2 = camera.getParameters();
            parameters2.setPreviewSize(point.x, point.y);
            if (this.f7967a.c() == 0) {
                parameters2.setPictureSize(point2.x, point2.y);
            }
            C0645b c0645b2 = this.f7967a;
            if (c0645b2 != null) {
                String f10 = c0645b2.f();
                if (!f10.equals("off") && !f10.equals("torch")) {
                    f10 = "off";
                }
                parameters2.setFlashMode(f10);
            }
            a(parameters2);
            if (parameters2.isZoomSupported()) {
                parameters2.setZoom(1);
            } else {
                Log.w("CameraManager", "initCameraParameters::setDefaultZoom not support zoom");
            }
            if (this.f7967a.e()) {
                parameters2.setRecordingHint(true);
            }
            camera.setParameters(parameters2);
        }
    }
}
