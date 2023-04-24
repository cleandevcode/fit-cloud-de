package t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a */
    public final HashMap f27453a = new HashMap();

    /* renamed from: b */
    public final s f27454b;

    public t(CameraCharacteristics cameraCharacteristics) {
        this.f27454b = Build.VERSION.SDK_INT >= 28 ? new r(cameraCharacteristics) : new s(cameraCharacteristics);
    }

    public final <T> T a(CameraCharacteristics.Key<T> key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return (T) this.f27454b.f27452a.get(key);
        }
        synchronized (this) {
            T t10 = (T) this.f27453a.get(key);
            if (t10 != null) {
                return t10;
            }
            T t11 = (T) this.f27454b.f27452a.get(key);
            if (t11 != null) {
                this.f27453a.put(key, t11);
            }
            return t11;
        }
    }
}
