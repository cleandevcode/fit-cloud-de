package mb;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import nb.a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b */
    public static final c f20419b = new c();

    /* renamed from: a */
    public final ThreadPoolExecutor f20420a;

    public c() {
        nb.a aVar = nb.a.f22210b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(nb.a.f22211c, nb.a.f22212d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f20420a = threadPoolExecutor;
        a.ExecutorC0390a executorC0390a = nb.a.f22210b.f22213a;
    }
}
