package sk;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Callable;
import sk.c;
import tk.o;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public static final o f27099a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public static final d f27100a;

        static {
            Looper mainLooper = Looper.getMainLooper();
            o oVar = c.f27099a;
            boolean z10 = true;
            if (Build.VERSION.SDK_INT < 22) {
                Message obtain = Message.obtain();
                try {
                    obtain.setAsynchronous(true);
                } catch (NoSuchMethodError unused) {
                    z10 = false;
                }
                obtain.recycle();
            }
            f27100a = new d(new Handler(mainLooper), z10);
        }
    }

    static {
        try {
            o oVar = (o) new Callable() { // from class: sk.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.a.f27100a;
                }
            }.call();
            if (oVar != null) {
                f27099a = oVar;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th2) {
            throw kl.d.d(th2);
        }
    }

    public static o a() {
        o oVar = f27099a;
        if (oVar != null) {
            return oVar;
        }
        throw new NullPointerException("scheduler == null");
    }
}
