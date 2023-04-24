package t;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.concurrent.Executor;
import s.a0;
import t.i0;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    public final b f27404a;

    /* renamed from: b */
    public final ArrayMap f27405b = new ArrayMap(4);

    /* loaded from: classes.dex */
    public static final class a extends CameraManager.AvailabilityCallback {

        /* renamed from: a */
        public final Executor f27406a;

        /* renamed from: b */
        public final CameraManager.AvailabilityCallback f27407b;

        /* renamed from: c */
        public final Object f27408c = new Object();

        /* renamed from: d */
        public boolean f27409d = false;

        public a(c0.g gVar, a0.b bVar) {
            this.f27406a = gVar;
            this.f27407b = bVar;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAccessPrioritiesChanged() {
            synchronized (this.f27408c) {
                if (!this.f27409d) {
                    this.f27406a.execute(new androidx.activity.h(3, this));
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            synchronized (this.f27408c) {
                if (!this.f27409d) {
                    this.f27406a.execute(new s.g(this, str, 2));
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            synchronized (this.f27408c) {
                if (!this.f27409d) {
                    this.f27406a.execute(new s.u(this, str, 3));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(c0.g gVar, a0.b bVar);

        CameraCharacteristics b(String str);

        void c(String str, c0.g gVar, CameraDevice.StateCallback stateCallback);

        void d(a0.b bVar);
    }

    public d0(i0 i0Var) {
        this.f27404a = i0Var;
    }

    public static d0 a(Context context, Handler handler) {
        i0 i0Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            i0Var = new h0(context);
        } else if (i10 >= 28) {
            i0Var = new g0(context);
        } else {
            i0Var = new i0(context, new i0.a(handler));
        }
        return new d0(i0Var);
    }

    public final t b(String str) {
        t tVar;
        synchronized (this.f27405b) {
            tVar = (t) this.f27405b.get(str);
            if (tVar == null) {
                try {
                    t tVar2 = new t(this.f27404a.b(str));
                    this.f27405b.put(str, tVar2);
                    tVar = tVar2;
                } catch (AssertionError e10) {
                    throw new f(e10.getMessage(), e10);
                }
            }
        }
        return tVar;
    }
}
