package s;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import p0.c;

/* loaded from: classes.dex */
public final class m2 extends CameraCaptureSession.StateCallback {

    /* renamed from: a */
    public final /* synthetic */ l2 f26082a;

    public m2(l2 l2Var) {
        this.f26082a = l2Var;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f26082a.s(cameraCaptureSession);
        l2 l2Var = this.f26082a;
        l2Var.k(l2Var);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        this.f26082a.s(cameraCaptureSession);
        l2 l2Var = this.f26082a;
        l2Var.l(l2Var);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f26082a.s(cameraCaptureSession);
        l2 l2Var = this.f26082a;
        l2Var.m(l2Var);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        c.a<Void> aVar;
        try {
            this.f26082a.s(cameraCaptureSession);
            l2 l2Var = this.f26082a;
            l2Var.n(l2Var);
            synchronized (this.f26082a.f26061a) {
                h1.i(this.f26082a.f26069i, "OpenCaptureSession completer should not null");
                l2 l2Var2 = this.f26082a;
                aVar = l2Var2.f26069i;
                l2Var2.f26069i = null;
            }
            aVar.b(new IllegalStateException("onConfigureFailed"));
        } catch (Throwable th2) {
            synchronized (this.f26082a.f26061a) {
                h1.i(this.f26082a.f26069i, "OpenCaptureSession completer should not null");
                l2 l2Var3 = this.f26082a;
                c.a<Void> aVar2 = l2Var3.f26069i;
                l2Var3.f26069i = null;
                aVar2.b(new IllegalStateException("onConfigureFailed"));
                throw th2;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        c.a<Void> aVar;
        try {
            this.f26082a.s(cameraCaptureSession);
            l2 l2Var = this.f26082a;
            l2Var.o(l2Var);
            synchronized (this.f26082a.f26061a) {
                h1.i(this.f26082a.f26069i, "OpenCaptureSession completer should not null");
                l2 l2Var2 = this.f26082a;
                aVar = l2Var2.f26069i;
                l2Var2.f26069i = null;
            }
            aVar.a(null);
        } catch (Throwable th2) {
            synchronized (this.f26082a.f26061a) {
                h1.i(this.f26082a.f26069i, "OpenCaptureSession completer should not null");
                l2 l2Var3 = this.f26082a;
                c.a<Void> aVar2 = l2Var3.f26069i;
                l2Var3.f26069i = null;
                aVar2.a(null);
                throw th2;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f26082a.s(cameraCaptureSession);
        l2 l2Var = this.f26082a;
        l2Var.p(l2Var);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.f26082a.s(cameraCaptureSession);
        l2 l2Var = this.f26082a;
        l2Var.r(l2Var, surface);
    }
}
