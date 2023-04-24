package h8;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements Executor {

    /* renamed from: a */
    public final /* synthetic */ int f16034a = 1;

    /* renamed from: b */
    public final Handler f16035b;

    public w(Looper looper) {
        this.f16035b = new w8.e(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f16034a) {
            case 0:
                this.f16035b.post(runnable);
                return;
            default:
                this.f16035b.post(runnable);
                return;
        }
    }
}
