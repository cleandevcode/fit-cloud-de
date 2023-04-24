package nb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b */
    public static final a f22210b = new a();

    /* renamed from: c */
    public static final int f22211c;

    /* renamed from: d */
    public static final int f22212d;

    /* renamed from: a */
    public final ExecutorC0390a f22213a = new ExecutorC0390a();

    /* renamed from: nb.a$a */
    /* loaded from: classes.dex */
    public static class ExecutorC0390a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f22211c = availableProcessors + 1;
        f22212d = (availableProcessors * 2) + 1;
    }
}
