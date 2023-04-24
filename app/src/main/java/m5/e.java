package m5;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final a f20367a = new a();

    /* renamed from: b */
    public static final b f20368b = new b();

    /* loaded from: classes.dex */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            l.f().post(runnable);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
