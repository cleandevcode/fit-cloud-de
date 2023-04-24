package t;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class f extends Exception {

    /* renamed from: b */
    public static final Set<Integer> f27410b = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: a */
    public final int f27411a;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));
    }

    public f(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f27411a = cameraAccessException.getReason();
    }

    public f(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.f27411a = 10001;
        if (f27410b.contains(10001)) {
            new CameraAccessException(10001, null, runtimeException);
        }
    }

    public f(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str), assertionError);
        this.f27411a = 10002;
        if (f27410b.contains(10002)) {
            new CameraAccessException(10002, str, assertionError);
        }
    }

    public static f a(CameraAccessException cameraAccessException) {
        return new f(cameraAccessException);
    }
}
