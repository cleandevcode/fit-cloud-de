package g9;

import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s implements Executor {

    /* renamed from: a */
    public final z8.a f15056a = new z8.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f15056a.post(runnable);
    }
}
