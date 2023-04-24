package s;

import android.hardware.camera2.CameraDevice;

/* loaded from: classes.dex */
public final class z implements d0.c<Void> {

    /* renamed from: a */
    public final /* synthetic */ q1 f26260a;

    /* renamed from: b */
    public final /* synthetic */ a0 f26261b;

    public z(a0 a0Var, q1 q1Var) {
        this.f26261b = a0Var;
        this.f26260a = q1Var;
    }

    @Override // d0.c
    public final void onFailure(Throwable th2) {
    }

    @Override // d0.c
    public final void onSuccess(Void r22) {
        CameraDevice cameraDevice;
        this.f26261b.f25882n.remove(this.f26260a);
        int b10 = c0.b(this.f26261b.f25873e);
        if (b10 != 4) {
            if (b10 != 5) {
                if (b10 != 6) {
                    return;
                }
            } else if (this.f26261b.f25880l == 0) {
                return;
            }
        }
        if (!this.f26261b.u() || (cameraDevice = this.f26261b.f25879k) == null) {
            return;
        }
        t.a.a(cameraDevice);
        this.f26261b.f25879k = null;
    }
}
