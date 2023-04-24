package ih;

import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import d6.s;
import s.k0;

/* loaded from: classes2.dex */
public final /* synthetic */ class c0 implements k0.e.a, o.a, s.a {
    public static boolean b(Bundle bundle, String str, Class cls, String str2) {
        gm.l.f(bundle, str);
        bundle.setClassLoader(cls.getClassLoader());
        return bundle.containsKey(str2);
    }

    @Override // s.k0.e.a
    public boolean a(TotalCaptureResult totalCaptureResult) {
        return k0.a(totalCaptureResult, false);
    }

    @Override // o.a
    public Object apply(Object obj) {
        Void r12 = (Void) obj;
        return null;
    }

    @Override // d6.s.a
    public void c(boolean z10) {
        if (z10) {
            o5.v.f22850n = true;
        } else {
            o5.v vVar = o5.v.f22837a;
        }
    }
}
