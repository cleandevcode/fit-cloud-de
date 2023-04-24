package b0;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    public static volatile Handler f3975a;

    public static Handler a() {
        if (f3975a != null) {
            return f3975a;
        }
        synchronized (o.class) {
            if (f3975a == null) {
                f3975a = f1.i.a(Looper.getMainLooper());
            }
        }
        return f3975a;
    }
}
