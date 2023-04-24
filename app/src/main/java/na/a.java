package na;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public interface a<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}
