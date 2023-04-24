package m;

import android.os.Looper;
import java.util.concurrent.Executor;
import yb.y;

/* loaded from: classes.dex */
public final class a extends y {

    /* renamed from: d */
    public static volatile a f20148d;

    /* renamed from: e */
    public static final ExecutorC0364a f20149e = new ExecutorC0364a();

    /* renamed from: c */
    public c f20150c = new c();

    /* renamed from: m.a$a */
    /* loaded from: classes.dex */
    public static class ExecutorC0364a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            a.C().f20150c.f20152d.execute(runnable);
        }
    }

    public static a C() {
        if (f20148d != null) {
            return f20148d;
        }
        synchronized (a.class) {
            if (f20148d == null) {
                f20148d = new a();
            }
        }
        return f20148d;
    }

    public final void D(Runnable runnable) {
        c cVar = this.f20150c;
        if (cVar.f20153e == null) {
            synchronized (cVar.f20151c) {
                if (cVar.f20153e == null) {
                    cVar.f20153e = c.C(Looper.getMainLooper());
                }
            }
        }
        cVar.f20153e.post(runnable);
    }
}
