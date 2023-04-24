package s;

import android.hardware.camera2.CameraCharacteristics;
import java.util.List;

/* loaded from: classes.dex */
public final class f1 {
    public static String a(t.d0 d0Var, Integer num, List<String> list) {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) d0Var.b("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
                return null;
            } else if (num.intValue() == 0 && ((Integer) d0Var.b("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            } else {
                return null;
            }
        }
        return null;
    }
}
