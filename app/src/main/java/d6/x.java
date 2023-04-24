package d6;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class x extends f {
    public x(String str, Bundle bundle) {
        super(str, bundle);
        Uri b10;
        bundle = bundle == null ? new Bundle() : bundle;
        if (gm.l.a(str, "oauth")) {
            m0 m0Var = m0.f12709a;
            b10 = m0.b(bundle, i0.b(), "oauth/authorize");
        } else {
            m0 m0Var2 = m0.f12709a;
            String b11 = i0.b();
            b10 = m0.b(bundle, b11, o5.v.d() + "/dialog/" + str);
        }
        if (!i6.a.b(this)) {
            try {
                this.f12677a = b10;
            } catch (Throwable th2) {
                i6.a.a(this, th2);
            }
        }
    }
}
