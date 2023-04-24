package qm;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import mf.a0;
import tl.g;

/* loaded from: classes2.dex */
public final class h {
    private static volatile Choreographer choreographer;

    static {
        Object f10;
        try {
            f10 = new f(a(Looper.getMainLooper()));
        } catch (Throwable th2) {
            f10 = a0.f(th2);
        }
        if (f10 instanceof g.a) {
            f10 = null;
        }
        g gVar = (g) f10;
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        if (invoke != null) {
            return (Handler) invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
    }
}
