package u;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import s.h1;

/* loaded from: classes.dex */
public class f extends d {
    public f(int i10, Surface surface) {
        super(new OutputConfiguration(i10, surface));
    }

    public f(Object obj) {
        super(obj);
    }

    @Override // u.d, u.c, u.h, u.b.a
    public final String c() {
        return null;
    }

    @Override // u.d, u.c, u.h, u.b.a
    public final void e(String str) {
        ((OutputConfiguration) f()).setPhysicalCameraId(str);
    }

    @Override // u.d, u.c, u.h, u.b.a
    public final Object f() {
        h1.f(this.f28429a instanceof OutputConfiguration);
        return this.f28429a;
    }
}
