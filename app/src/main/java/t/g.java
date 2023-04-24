package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import s.a1;
import t.g;
import t.q;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public final q f27412a;

    /* loaded from: classes.dex */
    public interface a {
        int a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int b(ArrayList arrayList, Executor executor, a1 a1Var);
    }

    /* loaded from: classes.dex */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final CameraCaptureSession.CaptureCallback f27413a;

        /* renamed from: b */
        public final Executor f27414b;

        public b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f27414b = executor;
            this.f27413a = captureCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j10) {
            this.f27414b.execute(new Runnable() { // from class: t.i
                @Override // java.lang.Runnable
                public final void run() {
                    g.b bVar = g.b.this;
                    c.a(bVar.f27413a, cameraCaptureSession, captureRequest, surface, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f27414b.execute(new Runnable() { // from class: t.k
                @Override // java.lang.Runnable
                public final void run() {
                    g.b bVar = g.b.this;
                    bVar.f27413a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f27414b.execute(new Runnable() { // from class: t.m
                @Override // java.lang.Runnable
                public final void run() {
                    g.b bVar = g.b.this;
                    bVar.f27413a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f27414b.execute(new s.w(this, cameraCaptureSession, captureRequest, captureResult, 2));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i10) {
            this.f27414b.execute(new Runnable() { // from class: t.h
                @Override // java.lang.Runnable
                public final void run() {
                    g.b bVar = g.b.this;
                    bVar.f27413a.onCaptureSequenceAborted(cameraCaptureSession, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i10, final long j10) {
            this.f27414b.execute(new Runnable() { // from class: t.j
                @Override // java.lang.Runnable
                public final void run() {
                    g.b bVar = g.b.this;
                    bVar.f27413a.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j10, final long j11) {
            this.f27414b.execute(new Runnable() { // from class: t.l
                @Override // java.lang.Runnable
                public final void run() {
                    g.b bVar = g.b.this;
                    bVar.f27413a.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        public final CameraCaptureSession.StateCallback f27415a;

        /* renamed from: b */
        public final Executor f27416b;

        public c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f27416b = executor;
            this.f27415a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onActive(CameraCaptureSession cameraCaptureSession) {
            this.f27416b.execute(new s.o(this, cameraCaptureSession, 1));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            this.f27416b.execute(new s.g(this, cameraCaptureSession, 1));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onClosed(CameraCaptureSession cameraCaptureSession) {
            this.f27416b.execute(new s.u(this, cameraCaptureSession, 2));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            this.f27416b.execute(new s.p(this, cameraCaptureSession, 3));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            this.f27416b.execute(new s.s(this, cameraCaptureSession, 3));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onReady(CameraCaptureSession cameraCaptureSession) {
            this.f27416b.execute(new n(this, cameraCaptureSession, 0));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            this.f27416b.execute(new s.k(this, cameraCaptureSession, surface, 1));
        }
    }

    public g(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27412a = new p(cameraCaptureSession);
        } else {
            this.f27412a = new q(cameraCaptureSession, new q.a(handler));
        }
    }

    public final CameraCaptureSession a() {
        return this.f27412a.f27449a;
    }
}
