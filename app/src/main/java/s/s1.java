package s;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import r.a;
import s.t2;

/* loaded from: classes.dex */
public final class s1 implements t2.b {

    /* renamed from: a */
    public final t.t f26179a;

    public s1(t.t tVar) {
        this.f26179a = tVar;
    }

    @Override // s.t2.b
    public final void a(TotalCaptureResult totalCaptureResult) {
    }

    @Override // s.t2.b
    public final void b(a.C0454a c0454a) {
    }

    @Override // s.t2.b
    public final float c() {
        Float f10 = (Float) this.f26179a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 != null && f10.floatValue() >= 1.0f) {
            return f10.floatValue();
        }
        return 1.0f;
    }

    @Override // s.t2.b
    public final float d() {
        return 1.0f;
    }

    @Override // s.t2.b
    public final void e() {
    }
}
