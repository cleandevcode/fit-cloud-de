package s;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import r.a;
import s.t2;

/* loaded from: classes.dex */
public final class a implements t2.b {

    /* renamed from: a */
    public final Range<Float> f25867a;

    /* renamed from: b */
    public float f25868b = 1.0f;

    public a(t.t tVar) {
        this.f25867a = (Range) tVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    @Override // s.t2.b
    public final void a(TotalCaptureResult totalCaptureResult) {
    }

    @Override // s.t2.b
    public final void b(a.C0454a c0454a) {
        c0454a.a(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f25868b));
    }

    @Override // s.t2.b
    public final float c() {
        return this.f25867a.getUpper().floatValue();
    }

    @Override // s.t2.b
    public final float d() {
        return this.f25867a.getLower().floatValue();
    }

    @Override // s.t2.b
    public final void e() {
        this.f25868b = 1.0f;
    }
}
