package kc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class e implements v3.c<ExecutorService> {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final e f18300a = new e();
    }

    @Override // w3.a
    public final Object get() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        b0.c.j(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }
}
