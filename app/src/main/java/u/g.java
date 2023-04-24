package u;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* loaded from: classes.dex */
public final class g extends f {
    public g(int i10, Surface surface) {
        super(new OutputConfiguration(i10, surface));
    }

    public g(Object obj) {
        super(obj);
    }

    @Override // u.h, u.b.a
    public final void a(long j10) {
        if (j10 == -1) {
            return;
        }
        ((OutputConfiguration) f()).setStreamUseCase(j10);
    }
}
