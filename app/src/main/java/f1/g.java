package f1;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class g implements Executor {

    /* renamed from: a */
    public final Handler f14032a;

    public g(Handler handler) {
        this.f14032a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.f14032a;
        runnable.getClass();
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(this.f14032a + " is shutting down");
    }
}
