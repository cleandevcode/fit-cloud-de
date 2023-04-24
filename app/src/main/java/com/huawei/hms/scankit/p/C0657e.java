package com.huawei.hms.scankit.p;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.TextureView;
import com.huawei.hms.mlkit.common.ha.HianalyticsLogProvider;
import com.huawei.hms.scankit.p.C0661f;
import com.topstep.fitcloudpro.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.huawei.hms.scankit.p.e */
/* loaded from: classes.dex */
public class C0657e {

    /* renamed from: a */
    private final boolean f7850a;

    /* renamed from: b */
    private C0645b f7851b;

    /* renamed from: c */
    private c f7852c;

    /* renamed from: d */
    private a f7853d;

    /* renamed from: e */
    private Camera.PreviewCallback f7854e;

    /* renamed from: f */
    private WeakReference<Context> f7855f;

    /* renamed from: g */
    private C0685l f7856g;

    /* renamed from: h */
    private C0681k f7857h;

    /* renamed from: i */
    private C0693n f7858i;

    /* renamed from: j */
    private C0689m f7859j;

    /* renamed from: k */
    private Camera f7860k;

    /* renamed from: l */
    private C0677j f7861l;

    /* renamed from: m */
    private C0697o f7862m;

    /* renamed from: n */
    private String f7863n;

    /* renamed from: o */
    private b f7864o = b.CAMERA_CLOSED;

    /* renamed from: p */
    private boolean f7865p = false;

    /* renamed from: q */
    private int f7866q = -1;

    /* renamed from: com.huawei.hms.scankit.p.e$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(Point point);
    }

    /* renamed from: com.huawei.hms.scankit.p.e$b */
    /* loaded from: classes.dex */
    public enum b {
        CAMERA_CLOSED(1),
        CAMERA_OPENED(2),
        CAMERA_INITIALED(3),
        PREVIEW_STARTED(4),
        PREVIEW_STOPPED(5);
        

        /* renamed from: g */
        private final int f7873g;

        b(int i10) {
            this.f7873g = i10;
        }

        public final int a() {
            return this.f7873g;
        }
    }

    /* renamed from: com.huawei.hms.scankit.p.e$c */
    /* loaded from: classes.dex */
    public interface c {
        void a();

        void b();

        void onClosed();
    }

    /* renamed from: com.huawei.hms.scankit.p.e$d */
    /* loaded from: classes.dex */
    public interface d {
        void a(byte[] bArr);
    }

    /* renamed from: com.huawei.hms.scankit.p.e$e */
    /* loaded from: classes.dex */
    public static class C0102e implements Camera.PreviewCallback {
        private C0102e() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
        }
    }

    public C0657e(Context context, C0645b c0645b) {
        if (context == null || c0645b == null) {
            throw new IllegalArgumentException("CameraManager constructor param invalid");
        }
        this.f7855f = new WeakReference<>(context);
        this.f7851b = c0645b;
        this.f7863n = c0645b.f();
        this.f7861l = new C0677j();
        this.f7857h = new C0681k();
        this.f7858i = new C0693n();
        this.f7859j = new C0689m();
        this.f7862m = new C0697o(context);
        this.f7850a = c0645b.g();
        r();
    }

    private int d(int i10) {
        if (i10 == 0 || i10 == 1) {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i11 = 0; i11 < numberOfCameras; i11++) {
                Camera.getCameraInfo(i11, cameraInfo);
                if (cameraInfo.facing == i10) {
                    Log.i("CameraManager", "findCameraId: ".concat(String.valueOf(i11)));
                    return i11;
                }
            }
            return 0;
        }
        return 0;
    }

    private void q() {
        if (this.f7850a) {
            return;
        }
        if (HianalyticsLogProvider.getInstance().sdkForbiddenHiLog(this.f7855f.get())) {
            Log.w("CameraManager", "CameraManager::closeHaTimer failed");
            return;
        }
        HianalyticsLogProvider.getInstance().reportAndCancelTimer("MLKitCamera");
        if (this.f7865p) {
            Handler handler = this.f7862m.f8010b;
            if (handler != null) {
                Message.obtain(handler, (int) R.integer.app_bar_elevation_anim_duration).sendToTarget();
            }
            this.f7865p = false;
        }
    }

    private void r() {
        if (this.f7850a) {
            return;
        }
        if (HianalyticsLogProvider.getInstance().sdkForbiddenHiLog(this.f7855f.get())) {
            Log.w("CameraManager", "CameraManager::initialHaTimer failed");
            return;
        }
        HianalyticsLogProvider.getInstance().initTimer("MLKitCamera");
        if (this.f7865p) {
            return;
        }
        this.f7862m.start();
        this.f7865p = true;
    }

    public synchronized void a() {
        C0685l c0685l = this.f7856g;
        if (c0685l != null) {
            c0685l.a();
            throw null;
        }
    }

    public synchronized void a(int i10) {
        if (this.f7851b != null && this.f7860k != null && this.f7864o.a() >= b.CAMERA_OPENED.a()) {
            this.f7851b.a(i10);
            this.f7860k.setDisplayOrientation(i10);
        }
    }

    public synchronized void a(TextureView textureView) {
        if (textureView == null) {
            throw new IllegalArgumentException("CameraManager::initCamera SurfaceHolder is null");
        }
        if (this.f7864o.a() != b.CAMERA_OPENED.a()) {
            Log.w("CameraManager", "CameraManager::initCamera camera is not opened yet");
            l();
        }
        this.f7857h.a(this.f7860k);
        this.f7858i.a(this.f7860k);
        this.f7859j.a(this.f7860k);
        Camera camera = this.f7860k;
        if (camera != null) {
            camera.setPreviewTexture(textureView.getSurfaceTexture());
        }
        this.f7861l.a(this.f7860k, this.f7851b);
        Camera camera2 = this.f7860k;
        if (camera2 != null) {
            camera2.setDisplayOrientation(this.f7851b.d());
        }
        a aVar = this.f7853d;
        if (aVar != null) {
            aVar.a(this.f7861l.f7968b);
        }
        this.f7864o = b.CAMERA_INITIALED;
    }

    public synchronized void a(c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("CameraManager::setCameraStatusListener param invalid");
        }
        this.f7852c = cVar;
    }

    public synchronized void a(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("CameraManager::setFrameCallback param invalid");
        }
        this.f7854e = new C0701p(this.f7862m, dVar);
    }

    public synchronized void a(String str) {
        try {
            if (this.f7860k == null || this.f7864o.a() == b.CAMERA_CLOSED.a()) {
                return;
            }
            if ("off".equals(str) || "torch".equals(str)) {
                Camera.Parameters parameters = this.f7860k.getParameters();
                parameters.setFlashMode(str);
                this.f7860k.setParameters(parameters);
                this.f7863n = str;
            }
        } catch (RuntimeException unused) {
            Log.w("CameraManager", "CameraManager::setTorchStatus error");
        }
    }

    public synchronized void a(List<C0661f.a> list) {
        if (this.f7860k != null && this.f7864o.a() != b.CAMERA_CLOSED.a()) {
            this.f7859j.a(list);
        }
    }

    public synchronized C0649c b() {
        if (this.f7860k != null && this.f7864o.a() != b.CAMERA_CLOSED.a()) {
            return this.f7857h.a();
        }
        return null;
    }

    public synchronized void b(int i10) {
        if (this.f7860k != null && this.f7864o.a() != b.CAMERA_CLOSED.a()) {
            this.f7857h.a(i10);
        }
    }

    public synchronized C0661f c() {
        if (this.f7860k != null && this.f7864o.a() != b.CAMERA_CLOSED.a()) {
            return this.f7859j.a();
        }
        return null;
    }

    public synchronized void c(int i10) {
        if (this.f7860k != null && this.f7864o.a() != b.CAMERA_CLOSED.a()) {
            this.f7858i.a(i10);
        }
    }

    public synchronized int d() {
        return this.f7851b.d();
    }

    public synchronized Point e() {
        return this.f7861l.f7968b;
    }

    public synchronized b f() {
        return this.f7864o;
    }

    public synchronized C0665g g() {
        if (this.f7860k != null && this.f7864o.a() != b.CAMERA_CLOSED.a()) {
            return this.f7858i.a();
        }
        return null;
    }

    public synchronized String h() {
        return this.f7863n;
    }

    public synchronized boolean i() {
        return this.f7858i.b();
    }

    public synchronized void j() {
        q();
        this.f7853d = null;
    }

    public synchronized void k() {
        try {
            if (this.f7864o.a() == b.PREVIEW_STARTED.a()) {
                a();
                p();
                this.f7864o = b.PREVIEW_STOPPED;
            }
            if (h().equals("torch")) {
                a("off");
            }
            if (this.f7864o.a() >= b.CAMERA_OPENED.a()) {
                this.f7864o = b.CAMERA_CLOSED;
                Camera camera = this.f7860k;
                if (camera != null) {
                    camera.release();
                    this.f7860k = null;
                }
                c cVar = this.f7852c;
                if (cVar != null) {
                    cVar.onClosed();
                }
            }
        } catch (RuntimeException unused) {
            Log.e("CameraManager", "CameraManager::onPause failed");
        }
    }

    public synchronized void l() {
        b bVar = this.f7864o;
        if (bVar == b.CAMERA_CLOSED || bVar == b.PREVIEW_STOPPED) {
            try {
                this.f7860k = Camera.open(d(this.f7851b.b()));
            } catch (RuntimeException e10) {
                Log.e("CameraManager", "CameraManager::Camera open failed, " + e10.getMessage());
            }
            if (this.f7860k == null) {
                Log.e("CameraManager", "CameraManager::initCamera failed");
                c cVar = this.f7852c;
                if (cVar != null) {
                    cVar.b();
                }
            } else {
                c cVar2 = this.f7852c;
                if (cVar2 != null) {
                    cVar2.a();
                }
                this.f7864o = b.CAMERA_OPENED;
            }
        }
    }

    public synchronized void m() {
        Camera camera;
        if (this.f7864o.a() < b.CAMERA_OPENED.a()) {
            return;
        }
        if (this.f7851b.c() != 0 && (camera = this.f7860k) != null) {
            camera.setPreviewCallback(new C0102e());
        }
    }

    public synchronized void n() {
        if (this.f7851b.c() == 1) {
            Log.d("CameraManager", "CameraManager::requestPreviewFrame PREVIEW_ONE_SHOT");
            if (this.f7864o == b.PREVIEW_STOPPED) {
                return;
            }
            Camera camera = this.f7860k;
            if (camera != null) {
                camera.setOneShotPreviewCallback(this.f7854e);
            }
        } else if (this.f7851b.c() == 0) {
            Log.d("CameraManager", "CameraManager::requestPreviewFrame PICTURE_MODE");
            if (this.f7864o == b.PREVIEW_STOPPED) {
                o();
            }
        } else if (this.f7851b.c() == 2) {
            Log.d("CameraManager", "CameraManager::requestPreviewFrame PREVIEW_MULTI_SHOT");
            if (this.f7864o == b.PREVIEW_STOPPED) {
                return;
            }
            Camera camera2 = this.f7860k;
            if (camera2 != null) {
                camera2.setPreviewCallback(this.f7854e);
            }
        } else {
            Log.w("CameraManager", "CameraManager::requestPreviewFrame unknown mode");
        }
    }

    public synchronized void o() {
        try {
            if (this.f7864o.a() < b.CAMERA_INITIALED.a()) {
                Log.w("CameraManager", "CameraManager::startPreview camera is not initialed yet");
                return;
            }
            Camera camera = this.f7860k;
            if (camera != null) {
                camera.startPreview();
                this.f7864o = b.PREVIEW_STARTED;
            }
        } catch (RuntimeException unused) {
            Log.w("CameraManager", "stopPreview error");
        }
    }

    public synchronized void p() {
        try {
            if (this.f7864o.a() < b.PREVIEW_STARTED.a()) {
                Log.w("CameraManager", "CameraManager::startPreview camera is not startPreview yet");
                return;
            }
            Camera camera = this.f7860k;
            if (camera != null) {
                camera.setPreviewCallback(null);
                this.f7860k.stopPreview();
                this.f7864o = b.PREVIEW_STOPPED;
            }
        } catch (RuntimeException unused) {
            Log.w("CameraManager", "stopPreview error");
        }
    }
}
