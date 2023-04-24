package w;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import r.a;

/* loaded from: classes.dex */
public final class h {
    @SuppressLint({"NewApi"})
    public static void a(int i10, a.C0454a c0454a) {
        CaptureRequest.Key key;
        Boolean bool;
        if (((v.s) v.k.a(v.s.class)) == null) {
            return;
        }
        if (i10 == 0) {
            key = CaptureRequest.CONTROL_ENABLE_ZSL;
            bool = Boolean.TRUE;
        } else if (i10 != 1) {
            return;
        } else {
            key = CaptureRequest.CONTROL_ENABLE_ZSL;
            bool = Boolean.FALSE;
        }
        c0454a.a(key, bool);
    }
}
