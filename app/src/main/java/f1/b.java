package f1;

import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class b {
    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        gm.l.f(bundle, "bundle");
        gm.l.f(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
